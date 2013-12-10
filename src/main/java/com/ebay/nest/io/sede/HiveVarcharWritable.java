package com.ebay.nest.io.sede;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;

import com.ebay.nest.io.nestfile.HiveBaseChar;
import com.ebay.nest.io.nestfile.HiveVarchar;
import com.ebay.nest.io.utils.ShimLoader;

public class HiveVarcharWritable implements WritableComparable<HiveVarcharWritable> {
	protected Text value = new Text();
	transient protected int characterLength = -1;

	public HiveVarcharWritable() {
	}

	public HiveVarcharWritable(HiveVarchar hc) {
		set(hc);
	}

	public HiveVarcharWritable(HiveVarcharWritable hcw) {
		set(hcw);
	}

	public void set(HiveVarchar val) {
		set(val.getValue());
	}

	public void set(String val) {
		set(val, -1); // copy entire string value
	}

	public void set(HiveVarcharWritable val) {
		value.set(val.value);
		characterLength = val.characterLength;
	}

	public void set(HiveVarcharWritable val, int maxLength) {
		if (val.characterLength > 0 && val.characterLength >= maxLength) {
			set(val);
		} else {
			set(val.getHiveVarchar(), maxLength);
		}
	}

	public void set(HiveVarchar val, int len) {
		set(val.getValue(), len);
	}

	public void set(String val, int maxLength) {
		characterLength = -1;
		value.set(HiveBaseChar.enforceMaxLength(val, maxLength));
	}

	public HiveVarchar getHiveVarchar() {
		return new HiveVarchar(value.toString(), -1);
	}

	public int getCharacterLength() {
		if (characterLength < 0) {
			characterLength = getHiveVarchar().getCharacterLength();
		}
		return characterLength;
	}

	public void enforceMaxLength(int maxLength) {
		// Might be possible to truncate the existing Text value, for now just do something simple.
		set(getHiveVarchar(), maxLength);
	}

	public void readFields(DataInput in) throws IOException {
		characterLength = -1;
		value.readFields(in);
	}

	public void write(DataOutput out) throws IOException {
		value.write(out);
	}

	public int compareTo(HiveVarcharWritable rhs) {
		return ShimLoader.getHadoopShims().compareText(value, rhs.value);
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof HiveVarcharWritable)) {
			return false;
		}
		return value.equals(((HiveVarcharWritable) obj).value);
	}

	@Override
	public String toString() {
		return value.toString();
	}

	public int hashCode() {
		return value.hashCode();
	}

	/**
	 * Access to the internal Text member. Use with care.
	 * 
	 * @return
	 */
	public Text getTextValue() {
		return value;
	}
}
