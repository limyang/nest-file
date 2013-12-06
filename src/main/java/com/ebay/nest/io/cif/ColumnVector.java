package com.ebay.nest.io.cif;

import java.util.Arrays;

import org.apache.hadoop.io.Writable;

public abstract class ColumnVector {

	public boolean[] isNull;

	public boolean noNulls;

	public boolean isRepeating;

	public abstract Writable getWritableObject(int index);

	public ColumnVector(int len) {
		isNull = new boolean[len];
		noNulls = true;
		isRepeating = false;
	}

	public void reset() {
		if (false == noNulls) {
			Arrays.fill(isNull, false);
		}
		noNulls = true;
		isRepeating = false;
	}
}