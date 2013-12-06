package com.ebay.nest.io.cif;

import com.ebay.nest.core.NestException;

public interface VectorExpressionWriter {
	  ObjectInspector getObjectInspector();
	  Object writeValue(ColumnVector column, int row) throws NestException;
	  Object writeValue(long value) throws NestException;
	  Object writeValue(double value) throws NestException;
	  Object writeValue(byte[] value, int start, int length) throws NestException;
	}
