package com.ebay.nest.io.cif;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Writable;

import com.ebay.nest.core.NestException;

public class VectorizedRowBatch implements Writable {
	public int numCols; // number of columns
	public ColumnVector[] cols; // a vector for each column
	public int size; // number of rows that qualify (i.e. haven't been filtered out)
	public int[] selected; // array of positions of selected values
	public int[] projectedColumns;
	public int projectionSize;

	public boolean selectedInUse;

	public boolean endOfFile;

	public static final int DEFAULT_SIZE = 1024;

	public VectorExpressionWriter[] valueWriters = null;

	public VectorizedRowBatch(int numCols) {
		this(numCols, DEFAULT_SIZE);
	}

	public VectorizedRowBatch(int numCols, int size) {
		this.numCols = numCols;
		this.size = size;
		selected = new int[size];
		selectedInUse = false;
		this.cols = new ColumnVector[numCols];
		projectedColumns = new int[numCols];

		// Initially all columns are projected and in the same order
		projectionSize = numCols;
		for (int i = 0; i < numCols; i++) {
			projectedColumns[i] = i;
		}
	}

	public long count() {
		return size;
	}

	private String toUTF8(Object o) {
		if (o == null || o instanceof NullWritable) {
			return "\\N"; /* as found in LazySimpleSerDe's nullSequence */
		}
		return o.toString();
	}

	@Override
	public String toString() {
		if (size == 0) {
			return "";
		}
		StringBuilder b = new StringBuilder();
		try {
			if (this.selectedInUse) {
				for (int j = 0; j < size; j++) {
					int i = selected[j];
					for (int k = 0; k < projectionSize; k++) {
						int projIndex = projectedColumns[k];
						ColumnVector cv = cols[projIndex];
						if (k > 0) {
							b.append('\u0001');
						}
						if (cv.isRepeating) {
							b.append(toUTF8(valueWriters[k].writeValue(cv, 0)));
						} else {
							b.append(toUTF8(valueWriters[k].writeValue(cv, i)));
						}
					}
					if (j < size - 1) {
						b.append('\n');
					}
				}
			} else {
				for (int i = 0; i < size; i++) {
					for (int k = 0; k < projectionSize; k++) {
						int projIndex = projectedColumns[k];
						ColumnVector cv = cols[projIndex];
						if (k > 0) {
							b.append('\u0001');
						}
						if (cv.isRepeating) {
							b.append(toUTF8(valueWriters[k].writeValue(cv, 0)));
						} else {
							b.append(toUTF8(valueWriters[k].writeValue(cv, i)));
						}
					}
					if (i < size - 1) {
						b.append('\n');
					}
				}
			}
		} catch (NestException ex) {
			throw new RuntimeException(ex);
		}
		return b.toString();
	}

	@Override
	public void readFields(DataInput arg0) throws IOException {
		throw new UnsupportedOperationException("Do you really need me?");
	}

	@Override
	public void write(DataOutput arg0) throws IOException {
		throw new UnsupportedOperationException("Don't call me");
	}

	public void setValueWriters(VectorExpressionWriter[] valueWriters) {
		this.valueWriters = valueWriters;
	}

	public static VectorizedRowBatch buildBatch(Map<Integer, String> typeMap, Map<String, Integer> columnMap)
			throws HiveException {

		Map<Integer, ColumnVector> mapVectorColumn = new HashMap<Integer, ColumnVector>(typeMap.size());
		int maxIndex = 0;

		Iterator<Entry<Integer, String>> typeMapIt = typeMap.entrySet().iterator();
		while (typeMapIt.hasNext()) {
			Entry<Integer, String> type = typeMapIt.next();
			ColumnVector cv = VectorizationContext.allocateColumnVector(type.getValue(),
					VectorizedRowBatch.DEFAULT_SIZE);
			mapVectorColumn.put(type.getKey(), cv);
			if (maxIndex < type.getKey()) {
				maxIndex = type.getKey();
			}
		}

		VectorizedRowBatch batch = new VectorizedRowBatch(maxIndex + 1);
		for (int i = 0; i <= maxIndex; ++i) {
			ColumnVector cv = mapVectorColumn.get(i);
			if (cv == null) {
				// allocate a default type for the unused column.
				// there are APIs that expect all cols[i] to be non NULL
				cv = VectorizationContext.allocateColumnVector("long", VectorizedRowBatch.DEFAULT_SIZE);
			}
			batch.cols[i] = cv;
		}

		// Validate that every column in the column map exists
		Iterator<Entry<String, Integer>> columnMapIt = columnMap.entrySet().iterator();
		while (columnMapIt.hasNext()) {
			Entry<String, Integer> cm = columnMapIt.next();
			if (batch.cols.length <= cm.getValue() || batch.cols[cm.getValue()] == null) {
				throw new HiveException(String.format("Internal error: The type map has no entry for column %d %s",
						cm.getValue(), cm.getKey()));
			}
		}

		batch.reset();

		return batch;
	}

	public void reset() {
		selectedInUse = false;
		size = 0;
		endOfFile = false;
		for (ColumnVector vc : cols) {
			if (vc != null) {
				vc.reset();
			}
		}
	}
}
