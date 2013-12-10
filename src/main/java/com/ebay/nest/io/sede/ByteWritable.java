package com.ebay.nest.io.sede;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class ByteWritable implements WritableComparable {
	private byte value;

	public void write(DataOutput out) throws IOException {
		out.writeByte(value);
	}

	public void readFields(DataInput in) throws IOException {
		value = in.readByte();
	}

	public ByteWritable(byte b) {
		value = b;
	}

	public ByteWritable() {
		value = 0;
	}

	public void set(byte value) {
		this.value = value;
	}

	public byte get() {
		return value;
	}

	public int compareTo(Object o) {
		int thisValue = value;
		int thatValue = ((ByteWritable) o).value;
		return thisValue - thatValue;
	}

	public boolean equals(Object o) {
		if (o == null || o.getClass() != ByteWritable.class) {
			return false;
		}
		return get() == ((ByteWritable) o).get();
	}

	public int hashCode() {
		return value;
	}

	public String toString() {
		return String.valueOf(get());
	}

	public static class Comparator extends WritableComparator {
		public Comparator() {
			super(ByteWritable.class);
		}

		public int compare(byte[] b1, int s1, int l1, byte[] b2, int s2, int l2) {
			int a1 = b1[s1];
			int a2 = b2[s2];
			return a1 - a2;
		}
	}

	static {
		WritableComparator.define(ByteWritable.class, new Comparator());
	}

}
