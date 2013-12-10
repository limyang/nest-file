package com.ebay.nest.io.sede.lazy.objectinspector.primitive;

import com.ebay.nest.io.sede.ByteWritable;
import com.ebay.nest.io.sede.lazy.LazyByte;
import com.ebay.nest.io.sede.objectinspector.primitive.ByteObjectInspector;
import com.ebay.nest.io.sede.objectinspector.primitive.PrimitiveObjectInspectorUtils;

public class LazyByteObjectInspector extends AbstractPrimitiveLazyObjectInspector<ByteWritable> implements
		ByteObjectInspector {

	LazyByteObjectInspector() {
		super(PrimitiveObjectInspectorUtils.byteTypeEntry);
	}

	@Override
	public byte get(Object o) {
		return getPrimitiveWritableObject(o).get();
	}

	@Override
	public Object copyObject(Object o) {
		return o == null ? null : new LazyByte((LazyByte) o);
	}

	@Override
	public Object getPrimitiveJavaObject(Object o) {
		return o == null ? null : Byte.valueOf(get(o));
	}
}
