package com.ebay.nest.io.sede.objectinspector;

public interface ObjectInspector extends Cloneable {

	public static enum Category {
		PRIMITIVE, LIST, MAP, STRUCT, UNION
	};

	String getTypeName();

	Category getCategory();
}