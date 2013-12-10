package com.ebay.nest.io.sede.lazybinary.objectinspector;

import java.util.List;

import com.ebay.nest.io.sede.lazybinary.LazyBinaryArray;
import com.ebay.nest.io.sede.objectinspector.ObjectInspector;
import com.ebay.nest.io.sede.objectinspector.StandardListObjectInspector;

public class LazyBinaryListObjectInspector extends StandardListObjectInspector {

	protected LazyBinaryListObjectInspector() {
		super();
	}

	protected LazyBinaryListObjectInspector(ObjectInspector listElementObjectInspector) {
		super(listElementObjectInspector);
	}

	@Override
	public List<?> getList(Object data) {
		if (data == null) {
			return null;
		}
		LazyBinaryArray array = (LazyBinaryArray) data;
		return array.getList();
	}

	@Override
	public Object getListElement(Object data, int index) {
		if (data == null) {
			return null;
		}
		LazyBinaryArray array = (LazyBinaryArray) data;
		return array.getListElementObject(index);
	}

	@Override
	public int getListLength(Object data) {
		if (data == null) {
			return -1;
		}
		LazyBinaryArray array = (LazyBinaryArray) data;
		return array.getListLength();
	}
}
