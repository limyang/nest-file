package com.ebay.nest.io.nestfile;

import com.ebay.nest.io.plan.ColumnProjectionUtils;
import com.ebay.nest.io.plan.TableScanDesc;
import com.ebay.nest.io.sarg.SearchArgument;
import com.google.common.collect.Lists;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileSplit;
import org.apache.hadoop.mapred.InputSplit;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.RecordReader;
import org.apache.hadoop.mapred.Reporter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrcInputFormat extends FileInputFormat<NullWritable, OrcStruct> implements InputFormatChecker {

	private static final Log LOG = LogFactory.getLog(OrcInputFormat.class);

	private static class OrcRecordReader implements RecordReader<NullWritable, OrcStruct> {
		private final com.ebay.nest.io.nestfile.RecordReader reader;
		private final long offset;
		private final long length;
		private final int numColumns;
		private float progress = 0.0f;

		OrcRecordReader(Reader file, Configuration conf, long offset, long length) throws IOException {
			String serializedPushdown = conf.get(TableScanDesc.FILTER_EXPR_CONF_STR);
			String columnNamesString = conf.get(ColumnProjectionUtils.READ_COLUMN_NAMES_CONF_STR);
			String[] columnNames = null;
			SearchArgument sarg = null;
			List<OrcProto.Type> types = file.getTypes();
			if (types.size() == 0) {
				numColumns = 0;
			} else {
				numColumns = types.get(0).getSubtypesCount();
			}
			columnNames = new String[types.size()];
			LOG.info("included column ids = " + conf.get(ColumnProjectionUtils.READ_COLUMN_IDS_CONF_STR, "null"));
			LOG.info("included columns names = " + conf.get(ColumnProjectionUtils.READ_COLUMN_NAMES_CONF_STR, "null"));
			boolean[] includeColumn = findIncludedColumns(types, conf);
			if (serializedPushdown != null && columnNamesString != null && !columnNamesString.trim().isEmpty()) {
				sarg = SearchArgument.FACTORY.create(Utilities.deserializeExpression(serializedPushdown, conf));
				LOG.info("ORC pushdown predicate: " + sarg);
				String[] neededColumnNames = columnNamesString.split(",");
				int i = 0;
				for (int columnId : types.get(0).getSubtypesList()) {
					if (includeColumn == null || includeColumn[columnId]) {
						columnNames[columnId] = neededColumnNames[i++];
					}
				}
			} else {
				LOG.info("No ORC pushdown predicate");
			}
			this.reader = file.rows(offset, length, includeColumn, sarg, columnNames);
			this.offset = offset;
			this.length = length;
		}

		@Override
		public boolean next(NullWritable key, OrcStruct value) throws IOException {
			if (reader.hasNext()) {
				reader.next(value);
				progress = reader.getProgress();
				return true;
			} else {
				return false;
			}
		}

		@Override
		public NullWritable createKey() {
			return NullWritable.get();
		}

		@Override
		public OrcStruct createValue() {
			return new OrcStruct(numColumns);
		}

		@Override
		public long getPos() throws IOException {
			return offset + (long) (progress * length);
		}

		@Override
		public void close() throws IOException {
			reader.close();
		}

		@Override
		public float getProgress() throws IOException {
			return progress;
		}
	}

	public OrcInputFormat() {
		// just set a really small lower bound
		setMinSplitSize(16 * 1024);
	}

	private static void includeColumnRecursive(List<OrcProto.Type> types, boolean[] result, int typeId) {
		result[typeId] = true;
		OrcProto.Type type = types.get(typeId);
		int children = type.getSubtypesCount();
		for (int i = 0; i < children; ++i) {
			includeColumnRecursive(types, result, type.getSubtypes(i));
		}
	}

	private static boolean[] findIncludedColumns(List<OrcProto.Type> types, Configuration conf) {
		String includedStr = conf.get(ColumnProjectionUtils.READ_COLUMN_IDS_CONF_STR);
		if (includedStr == null || includedStr.trim().length() == 0) {
			return null;
		} else {
			int numColumns = types.size();
			boolean[] result = new boolean[numColumns];
			result[0] = true;
			OrcProto.Type root = types.get(0);
			List<Integer> included = ColumnProjectionUtils.getReadColumnIDs(conf);
			for (int i = 0; i < root.getSubtypesCount(); ++i) {
				if (included.contains(i)) {
					includeColumnRecursive(types, result, root.getSubtypes(i));
				}
			}
			// if we are filtering at least one column, return the boolean array
			for (boolean include : result) {
				if (!include) {
					return result;
				}
			}
			return null;
		}
	}

	public RecordReader<NullWritable, OrcStruct> getRecordReader(InputSplit inputSplit, JobConf conf, Reporter reporter)
			throws IOException {
		FileSplit fileSplit = (FileSplit) inputSplit;
		Path path = fileSplit.getPath();
		FileSystem fs = path.getFileSystem(conf);
		reporter.setStatus(fileSplit.toString());
		return new OrcRecordReader(OrcFile.createReader(fs, path), conf, fileSplit.getStart(), fileSplit.getLength());
	}

	public boolean validateInput(FileSystem fs, Configuration conf, ArrayList<FileStatus> files) throws IOException {
		if (files.size() <= 0) {
			return false;
		}
		for (FileStatus file : files) {
			try {
				OrcFile.createReader(fs, file.getPath());
			} catch (IOException e) {
				return false;
			}
		}
		return true;
	}

}
