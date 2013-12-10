package com.ebay.nest.io.sede.objectinspector.primitive;

import java.math.BigInteger;

import com.ebay.nest.io.nestfile.HiveDecimal;
import com.ebay.nest.io.sede.HiveDecimalWritable;

public class JavaHiveDecimalObjectInspector extends AbstractPrimitiveJavaObjectInspector implements
		SettableHiveDecimalObjectInspector {

	protected JavaHiveDecimalObjectInspector() {
		super(PrimitiveObjectInspectorUtils.decimalTypeEntry);
	}

	@Override
	public HiveDecimalWritable getPrimitiveWritableObject(Object o) {
		if (o == null) {
			return null;
		}

		if (o instanceof String) {
			try {
				o = new HiveDecimal((String) o);
			} catch (NumberFormatException e) {
				return null;
			}
		}
		return new HiveDecimalWritable((HiveDecimal) o);
	}

	@Override
	public HiveDecimal getPrimitiveJavaObject(Object o) {
		return o == null ? null : (HiveDecimal) o;
	}

	@Override
	public Object set(Object o, byte[] bytes, int scale) {
		return new HiveDecimal(new BigInteger(bytes), scale);
	}

	@Override
	public Object set(Object o, HiveDecimal t) {
		return t;
	}

	@Override
	public Object set(Object o, HiveDecimalWritable t) {
		return t == null ? null : t.getHiveDecimal();
	}

	@Override
	public Object create(byte[] bytes, int scale) {
		try {
			return new HiveDecimal(new BigInteger(bytes), scale);
		} catch (NumberFormatException e) {
			return null;
		}
	}

	@Override
	public Object create(HiveDecimal t) {
		try {
			return t == null ? null : new HiveDecimal(t.unscaledValue(), t.scale());
		} catch (NumberFormatException e) {
			return null;
		}
	}

}
