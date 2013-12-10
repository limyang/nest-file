package com.ebay.nest.io.sede.objectinspector;

import com.ebay.nest.io.sede.typeinfo.BaseTypeParams;
import com.ebay.nest.io.sede.typeinfo.PrimitiveTypeSpec;

public interface PrimitiveObjectInspector extends ObjectInspector, PrimitiveTypeSpec {

	public static enum PrimitiveCategory {
		VOID, BOOLEAN, BYTE, SHORT, INT, LONG, FLOAT, DOUBLE, STRING, DATE, TIMESTAMP, BINARY, DECIMAL, VARCHAR, UNKNOWN
	};

	PrimitiveCategory getPrimitiveCategory();

	Class<?> getPrimitiveWritableClass();

	Object getPrimitiveWritableObject(Object o);

	Class<?> getJavaPrimitiveClass();

	Object getPrimitiveJavaObject(Object o);

	Object copyObject(Object o);

	boolean preferWritable();

	BaseTypeParams getTypeParams();

	void setTypeParams(BaseTypeParams newParams);
}
