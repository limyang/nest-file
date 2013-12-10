package com.ebay.nest.io.sede.typeinfo;

import java.io.Serializable;

import com.ebay.nest.io.sede.objectinspector.ObjectInspector.Category;

public abstract class TypeInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	protected TypeInfo() {
	}

	public abstract Category getCategory();

	public abstract String getTypeName();

	public String getQualifiedName() {
		return getTypeName();
	}

	public String toString() {
		return getTypeName();
	}

	public abstract boolean equals(Object o);

	public abstract int hashCode();
}
