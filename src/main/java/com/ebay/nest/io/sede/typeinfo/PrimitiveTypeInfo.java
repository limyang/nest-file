package com.ebay.nest.io.sede.typeinfo;

import java.io.Serializable;

import com.ebay.nest.io.sede.objectinspector.ObjectInspector.Category;
import com.ebay.nest.io.sede.objectinspector.PrimitiveObjectInspector.PrimitiveCategory;
import com.ebay.nest.io.sede.objectinspector.primitive.PrimitiveObjectInspectorUtils;
import com.ebay.nest.io.sede.objectinspector.primitive.PrimitiveObjectInspectorUtils.PrimitiveTypeEntry;

public class PrimitiveTypeInfo extends TypeInfo implements Serializable, PrimitiveTypeSpec {

	private static final long serialVersionUID = 1L;

	protected String typeName;
	protected BaseTypeParams typeParams;

	public PrimitiveTypeInfo() {
	}

	PrimitiveTypeInfo(String typeName) {
		this.typeName = typeName;
	}

	public Category getCategory() {
		return Category.PRIMITIVE;
	}

	public PrimitiveCategory getPrimitiveCategory() {
		return getPrimitiveTypeEntry().primitiveCategory;
	}

	public Class<?> getPrimitiveWritableClass() {
		return PrimitiveObjectInspectorUtils.getTypeEntryFromTypeName(typeName).primitiveWritableClass;
	}

	public Class<?> getPrimitiveJavaClass() {
		return PrimitiveObjectInspectorUtils.getTypeEntryFromTypeName(typeName).primitiveJavaClass;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeName() {
		return typeName;
	}

	public BaseTypeParams getTypeParams() {
		return typeParams;
	}

	public void setTypeParams(BaseTypeParams typeParams) {

		this.typeParams = typeParams;
	}

	public PrimitiveTypeEntry getPrimitiveTypeEntry() {
		return PrimitiveObjectInspectorUtils.getTypeEntryFromTypeName(TypeInfoUtils.getBaseName(typeName));
	}

	public boolean equals(Object other) {
		return this == other;
	}

	public int hashCode() {
		return typeName.hashCode();
	}

	public String toString() {
		return typeName;
	}
}
