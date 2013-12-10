package com.ebay.nest.io.nestfile;

import org.apache.commons.lang.StringUtils;

public abstract class HiveBaseChar {
	protected String value;
	protected int characterLength = -1;

	protected HiveBaseChar() {
	}

	/**
	 * Sets the string value to a new value, obeying the max length defined for this object.
	 * 
	 * @param val
	 *            new value
	 */
	public void setValue(String val, int maxLength) {
		characterLength = -1;
		value = HiveBaseChar.enforceMaxLength(val, maxLength);
	}

	public void setValue(HiveBaseChar val, int maxLength) {
		if ((maxLength < 0) || (val.characterLength > 0 && val.characterLength <= maxLength)) {
			// No length enforcement required, or source length is less than max length.
			// We can copy the source value as-is.
			value = val.value;
			this.characterLength = val.characterLength;
		} else {
			setValue(val.value, maxLength);
		}
	}

	public static String enforceMaxLength(String val, int maxLength) {
		String value = val;

		if (maxLength > 0) {
			int valLength = val.codePointCount(0, val.length());
			if (valLength > maxLength) {
				// Truncate the excess trailing spaces to fit the character length.
				// Also make sure we take supplementary chars into account.
				value = val.substring(0, val.offsetByCodePoints(0, maxLength));
			}
		}
		return value;
	}

	public String getValue() {
		return value;
	}

	public int getCharacterLength() {
		if (characterLength < 0) {
			characterLength = value.codePointCount(0, value.length());
		}
		return characterLength;
	}
}
