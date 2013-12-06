package com.ebay.nest.io.cif;

import java.io.IOException;

public interface RecordReader {

	  boolean hasNext() throws IOException;


	  Object next(Object previous) throws IOException;

	  /**
	   * Read the next row batch. The size of the batch to read cannot be controlled
	   * by the callers. Caller need to look at VectorizedRowBatch.size of the retunred
	   * object to know the batch size read.
	   * @param previousBatch a row batch object that can be reused by the reader
	   * @return the row batch that was read
	   * @throws java.io.IOException
	   */
	  VectorizedRowBatch nextBatch(VectorizedRowBatch previousBatch) throws IOException;


	  long getRowNumber() throws IOException;


	  float getProgress() throws IOException;


	  void close() throws IOException;


	  void seekToRow(long rowCount) throws IOException;
	}
