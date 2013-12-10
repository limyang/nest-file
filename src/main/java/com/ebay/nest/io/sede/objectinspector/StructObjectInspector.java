package com.ebay.nest.io.sede.objectinspector;

import java.util.List;

public abstract class StructObjectInspector implements ObjectInspector {

	public abstract List<? extends StructField> getAllStructFieldRefs();

	public abstract StructField getStructFieldRef(String fieldName);

	public abstract Object getStructFieldData(Object data, StructField fieldRef);

	public abstract List<Object> getStructFieldsDataAsList(Object data);

	public boolean isSettable() {
		return false;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		List<? extends StructField> fields = getAllStructFieldRefs();
		sb.append(getClass().getName());
		sb.append("<");
		for (int i = 0; i < fields.size(); i++) {
			if (i > 0) {
				sb.append(",");
			}
			sb.append(fields.get(i).getFieldObjectInspector().toString());
		}
		sb.append(">");
		return sb.toString();
	}
}
