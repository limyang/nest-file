package com.ebay.nest.io.sede.lazy.objectinspector.primitive;

import org.apache.hadoop.io.BooleanWritable;

import com.ebay.nest.io.sede.lazy.LazyBoolean;
import com.ebay.nest.io.sede.objectinspector.primitive.BooleanObjectInspector;
import com.ebay.nest.io.sede.objectinspector.primitive.PrimitiveObjectInspectorUtils;

public class LazyBooleanObjectInspector extends AbstractPrimitiveLazyObjectInspector<BooleanWritable> implements
		BooleanObjectInspector {

	LazyBooleanObjectInspector() {
		super(PrimitiveObjectInspectorUtils.booleanTypeEntry);
	}

	@Override
	public boolean get(Object o) {
		return getPrimitiveWritableObject(o).get();
	}

	@Override
	public Object copyObject(Object o) {
		return o == null ? null : new LazyBoolean((LazyBoolean) o);
	}

	@Override
	public Object getPrimitiveJavaObject(Object o) {
		return o == null ? null : Boolean.valueOf(get(o));
	}
}
