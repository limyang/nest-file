package com.ebay.nest.io.nestfile;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.RecordWriter;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.util.Progressable;

import com.ebay.nest.io.nestfile.OrcSerde.OrcSerdeRow;
import com.ebay.nest.io.sede.objectinspector.ObjectInspector;
import com.ebay.nest.io.sede.objectinspector.ObjectInspectorFactory;

public class OrcOutputFormat extends FileOutputFormat<NullWritable, OrcSerdeRow> {

	private static class OrcRecordWriter implements RecordWriter<NullWritable, OrcSerdeRow> {
		private Writer writer = null;
		private final Path path;
		private final OrcFile.WriterOptions options;

		OrcRecordWriter(Path path, OrcFile.WriterOptions options) {
			this.path = path;
			this.options = options;
		}

		@Override
		public void write(NullWritable nullWritable, OrcSerdeRow row) throws IOException {
			if (writer == null) {
				options.inspector(row.getInspector());
				writer = OrcFile.createWriter(path, options);
			}
			writer.addRow(row.getRow());
		}

		@Override
		public void close(Reporter reporter) throws IOException {
			close(true);
		}

		public void close(boolean b) throws IOException {
			if (writer == null) {
				// a row with no columns
				ObjectInspector inspector = ObjectInspectorFactory.getStandardStructObjectInspector(
						new ArrayList<String>(), new ArrayList<ObjectInspector>());
				options.inspector(inspector);
				writer = OrcFile.createWriter(path, options);
			}
			writer.close();
		}
	}

	public RecordWriter<NullWritable, OrcSerdeRow> getRecordWriter(FileSystem fileSystem, JobConf conf, String name,
			Progressable reporter) throws IOException {
		return new OrcRecordWriter(new Path(name), OrcFile.writerOptions(conf));
	}
}
