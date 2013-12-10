package com.ebay.nest.io.sede.lazybinary;

import com.ebay.nest.io.sede.lazy.ByteArrayRef;
import com.ebay.nest.io.sede.lazy.LazyUtils;
import com.ebay.nest.io.sede.objectinspector.ObjectInspector;

public abstract class LazyBinaryNonPrimitive<OI extends ObjectInspector> extends LazyBinaryObject<OI> {

	protected ByteArrayRef bytes;
	protected int start;
	protected int length;

	protected LazyBinaryNonPrimitive(OI oi) {
		super(oi);
		bytes = null;
		start = 0;
		length = 0;
	}

	@Override
	public Object getObject() {
		return this;
	}

	@Override
	public void init(ByteArrayRef bytes, int start, int length) {
		if (null == bytes) {
			throw new RuntimeException("bytes cannot be null!");
		}
		if (length <= 0) {
			throw new RuntimeException("length should be positive!");
		}
		this.bytes = bytes;
		this.start = start;
		this.length = length;
	}

	@Override
	public int hashCode() {
		return LazyUtils.hashBytes(bytes.getData(), start, length);
	}
}
