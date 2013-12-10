package com.ebay.nest.io.sede.typeinfo;

import java.io.Serializable;

import com.ebay.nest.io.sede.objectinspector.ObjectInspector.Category;
import com.ebay.nest.io.sede.serdeConstants;

public final class ListTypeInfo extends TypeInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	private TypeInfo listElementTypeInfo;

	public ListTypeInfo() {
	}

	public String getTypeName() {
		return serdeConstants.LIST_TYPE_NAME + "<" + listElementTypeInfo.getTypeName() + ">";
	}

	public void setListElementTypeInfo(TypeInfo listElementTypeInfo) {
		this.listElementTypeInfo = listElementTypeInfo;
	}

	ListTypeInfo(TypeInfo elementTypeInfo) {
		listElementTypeInfo = elementTypeInfo;
	}

	public Category getCategory() {
		return Category.LIST;
	}

	public TypeInfo getListElementTypeInfo() {
		return listElementTypeInfo;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ListTypeInfo)) {
			return false;
		}
		return getListElementTypeInfo().equals(((ListTypeInfo) other).getListElementTypeInfo());
	}

	@Override
	public int hashCode() {
		return listElementTypeInfo.hashCode();
	}

}
