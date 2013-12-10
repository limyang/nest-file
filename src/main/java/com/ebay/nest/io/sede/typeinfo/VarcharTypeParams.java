package com.ebay.nest.io.sede.typeinfo;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;

import org.apache.hadoop.io.WritableUtils;

import com.ebay.nest.io.nestfile.HiveVarchar;
import com.ebay.nest.io.sede.SerDeException;

public class VarcharTypeParams extends BaseTypeParams implements Serializable {
	private static final long serialVersionUID = 1L;

	public int length;

	@Override
	public void validateParams() throws SerDeException {
		if (length < 1) {
			throw new SerDeException("VARCHAR length must be positive");
		}
		if (length > HiveVarchar.MAX_VARCHAR_LENGTH) {
			throw new SerDeException("Length " + length + " exceeds max varchar length of "
					+ HiveVarchar.MAX_VARCHAR_LENGTH);
		}
	}

	@Override
	public void populateParams(String[] params) throws SerDeException {
		if (params.length != 1) {
			throw new SerDeException("Invalid number of parameters for VARCHAR");
		}
		try {
			length = Integer.valueOf(params[0]);
		} catch (NumberFormatException err) {
			throw new SerDeException("Error setting VARCHAR length: " + err);
		}
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("(");
		sb.append(length);
		sb.append(")");
		return sb.toString();
	}

	@Override
	public void readFields(DataInput in) throws IOException {
		length = WritableUtils.readVInt(in);
		try {
			validateParams();
		} catch (SerDeException err) {
			throw new IOException(err);
		}
	}

	@Override
	public void write(DataOutput out) throws IOException {
		WritableUtils.writeVInt(out, length);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int len) {
		length = len;
	}

	@Override
	public boolean hasCharacterMaximumLength() {
		return true;
	}

	@Override
	public int getCharacterMaximumLength() {
		return length;
	}
}
