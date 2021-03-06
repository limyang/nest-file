package com.ebay.nest.io.sede.typeinfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ebay.nest.io.sede.objectinspector.ObjectInspector.Category;
import com.ebay.nest.io.sede.serdeConstants;

public final class StructTypeInfo extends TypeInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private ArrayList<String> allStructFieldNames;
	private ArrayList<TypeInfo> allStructFieldTypeInfos;

	/**
	 * For java serialization use only.
	 */
	public StructTypeInfo() {
	}

	@Override
	public String getTypeName() {
		StringBuilder sb = new StringBuilder();
		sb.append(serdeConstants.STRUCT_TYPE_NAME + "<");
		for (int i = 0; i < allStructFieldNames.size(); i++) {
			if (i > 0) {
				sb.append(",");
			}
			sb.append(allStructFieldNames.get(i));
			sb.append(":");
			sb.append(allStructFieldTypeInfos.get(i).getTypeName());
		}
		sb.append(">");
		return sb.toString();
	}

	/**
	 * For java serialization use only.
	 */
	public void setAllStructFieldNames(ArrayList<String> allStructFieldNames) {
		this.allStructFieldNames = allStructFieldNames;
	}

	/**
	 * For java serialization use only.
	 */
	public void setAllStructFieldTypeInfos(ArrayList<TypeInfo> allStructFieldTypeInfos) {
		this.allStructFieldTypeInfos = allStructFieldTypeInfos;
	}

	/**
	 * For TypeInfoFactory use only.
	 */
	StructTypeInfo(List<String> names, List<TypeInfo> typeInfos) {
		allStructFieldNames = new ArrayList<String>(names);
		allStructFieldTypeInfos = new ArrayList<TypeInfo>(typeInfos);
	}

	public Category getCategory() {
		return Category.STRUCT;
	}

	public ArrayList<String> getAllStructFieldNames() {
		return allStructFieldNames;
	}

	public ArrayList<TypeInfo> getAllStructFieldTypeInfos() {
		return allStructFieldTypeInfos;
	}

	public TypeInfo getStructFieldTypeInfo(String field) {
		String fieldLowerCase = field.toLowerCase();
		for (int i = 0; i < allStructFieldNames.size(); i++) {
			if (fieldLowerCase.equals(allStructFieldNames.get(i))) {
				return allStructFieldTypeInfos.get(i);
			}
		}
		throw new RuntimeException("cannot find field " + field + "(lowercase form: " + fieldLowerCase + ") in "
				+ allStructFieldNames);
		// return null;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof StructTypeInfo)) {
			return false;
		}
		StructTypeInfo o = (StructTypeInfo) other;
		Iterator<String> namesIterator = getAllStructFieldNames().iterator();
		Iterator<String> otherNamesIterator = o.getAllStructFieldNames().iterator();

		// Compare the field names using ignore-case semantics
		while (namesIterator.hasNext() && otherNamesIterator.hasNext()) {
			if (!namesIterator.next().equalsIgnoreCase(otherNamesIterator.next())) {
				return false;
			}
		}

		// Different number of field names
		if (namesIterator.hasNext() || otherNamesIterator.hasNext()) {
			return false;
		}

		// Compare the field types
		return o.getAllStructFieldTypeInfos().equals(getAllStructFieldTypeInfos());
	}

	@Override
	public int hashCode() {
		return allStructFieldNames.hashCode() ^ allStructFieldTypeInfos.hashCode();
	}

}
