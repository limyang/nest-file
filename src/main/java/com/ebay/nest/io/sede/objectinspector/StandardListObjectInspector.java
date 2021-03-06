package com.ebay.nest.io.sede.objectinspector;

import java.util.ArrayList;
import java.util.List;

import com.ebay.nest.io.sede.serdeConstants;

public class StandardListObjectInspector implements SettableListObjectInspector {

	private ObjectInspector listElementObjectInspector;

	protected StandardListObjectInspector() {
		super();
	}

	protected StandardListObjectInspector(ObjectInspector listElementObjectInspector) {
		this.listElementObjectInspector = listElementObjectInspector;
	}

	public final Category getCategory() {
		return Category.LIST;
	}

	// without data
	public ObjectInspector getListElementObjectInspector() {
		return listElementObjectInspector;
	}

	// with data
	public Object getListElement(Object data, int index) {
		if (data == null) {
			return null;
		}
		// We support both List<Object> and Object[]
		// so we have to do differently.
		boolean isArray = !(data instanceof List);
		if (isArray) {
			Object[] list = (Object[]) data;
			if (index < 0 || index >= list.length) {
				return null;
			}
			return list[index];
		} else {
			List<?> list = (List<?>) data;
			if (index < 0 || index >= list.size()) {
				return null;
			}
			return list.get(index);
		}
	}

	public int getListLength(Object data) {
		if (data == null) {
			return -1;
		}
		// We support both List<Object> and Object[]
		// so we have to do differently.
		boolean isArray = !(data instanceof List);
		if (isArray) {
			Object[] list = (Object[]) data;
			return list.length;
		} else {
			List<?> list = (List<?>) data;
			return list.size();
		}
	}

	public List<?> getList(Object data) {
		if (data == null) {
			return null;
		}
		// We support both List<Object> and Object[]
		// so we have to do differently.
		if (!(data instanceof List)) {
			data = java.util.Arrays.asList((Object[]) data);
		}
		List<?> list = (List<?>) data;
		return list;
	}

	public String getTypeName() {
		return serdeConstants.LIST_TYPE_NAME + "<"
				+ listElementObjectInspector.getTypeName() + ">";
	}

	// /////////////////////////////
	// SettableListObjectInspector
	@Override
	public Object create(int size) {
		List<Object> a = new ArrayList<Object>(size);
		for (int i = 0; i < size; i++) {
			a.add(null);
		}
		return a;
	}

	@Override
	public Object resize(Object list, int newSize) {
		List<Object> a = (List<Object>) list;
		while (a.size() < newSize) {
			a.add(null);
		}
		while (a.size() > newSize) {
			a.remove(a.size() - 1);
		}
		return a;
	}

	@Override
	public Object set(Object list, int index, Object element) {
		List<Object> a = (List<Object>) list;
		a.set(index, element);
		return a;
	}

}
