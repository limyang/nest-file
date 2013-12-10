package com.ebay.nest.io.sede.objectinspector;


public interface StructField {

	String getFieldName();

	ObjectInspector getFieldObjectInspector();

	String getFieldComment();
}
