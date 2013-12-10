package com.ebay.nest.io.nestfile;

/**
 * 
 * HiveVarChar. String wrapper to support SQL VARCHAR features. Max string length is enforced.
 * 
 */
public class HiveVarchar extends HiveBaseChar implements Comparable<HiveVarchar> {

	public static final int MAX_VARCHAR_LENGTH = 65535;

	public HiveVarchar() {
	}

	public HiveVarchar(String val, int len) {
		setValue(val, len);
	}

	public HiveVarchar(HiveVarchar hc, int len) {
		setValue(hc, len);
	}

	/**
	 * Set the new value
	 */
	public void setValue(String val) {
		super.setValue(val, -1);
	}

	public void setValue(HiveVarchar hc) {
		super.setValue(hc.getValue(), -1);
	}

	@Override
	public String toString() {
		return getValue();
	}

	public int compareTo(HiveVarchar rhs) {
		if (rhs == this) {
			return 0;
		}
		return this.getValue().compareTo(rhs.getValue());
	}

	public boolean equals(HiveVarchar rhs) {
		if (rhs == this) {
			return true;
		}
		return this.getValue().equals(rhs.getValue());
	}

	@Override
	public int hashCode() {
		return getValue().hashCode();
	}
}
