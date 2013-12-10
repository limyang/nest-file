package com.ebay.nest.io.sede.objectinspector;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ebay.nest.io.sede.columnar.ColumnarStructBase;

class ColumnarStructObjectInspector extends StructObjectInspector {

	public static final Log LOG = LogFactory.getLog(ColumnarStructObjectInspector.class.getName());

	protected static class MyField implements StructField {
		protected int fieldID;
		protected String fieldName;
		protected ObjectInspector fieldObjectInspector;
		protected String fieldComment;

		protected MyField() {
			super();
		}

		public MyField(int fieldID, String fieldName, ObjectInspector fieldObjectInspector) {
			this.fieldID = fieldID;
			this.fieldName = fieldName.toLowerCase();
			this.fieldObjectInspector = fieldObjectInspector;
		}

		public MyField(int fieldID, String fieldName, ObjectInspector fieldObjectInspector, String fieldComment) {
			this(fieldID, fieldName, fieldObjectInspector);
			this.fieldComment = fieldComment;
		}

		public int getFieldID() {
			return fieldID;
		}

		public String getFieldName() {
			return fieldName;
		}

		public ObjectInspector getFieldObjectInspector() {
			return fieldObjectInspector;
		}

		public String getFieldComment() {
			return fieldComment;
		}

		@Override
		public String toString() {
			return "" + fieldID + ":" + fieldName;
		}
	}

	private List<MyField> fields;

	protected ColumnarStructObjectInspector() {
		super();
	}

	/**
	 * Call ObjectInspectorFactory.getLazySimpleStructObjectInspector instead.
	 */
	public ColumnarStructObjectInspector(List<String> structFieldNames,
			List<ObjectInspector> structFieldObjectInspectors) {
		init(structFieldNames, structFieldObjectInspectors, null);
	}

	public ColumnarStructObjectInspector(List<String> structFieldNames,
			List<ObjectInspector> structFieldObjectInspectors, List<String> structFieldComments) {
		init(structFieldNames, structFieldObjectInspectors, structFieldComments);
	}

	protected void init(List<String> structFieldNames, List<ObjectInspector> structFieldObjectInspectors,
			List<String> structFieldComments) {
		assert (structFieldNames.size() == structFieldObjectInspectors.size());
		assert (structFieldComments == null || (structFieldNames.size() == structFieldComments.size()));

		fields = new ArrayList<MyField>(structFieldNames.size());
		for (int i = 0; i < structFieldNames.size(); i++) {
			fields.add(new MyField(i, structFieldNames.get(i), structFieldObjectInspectors.get(i),
					structFieldComments == null ? null : structFieldComments.get(i)));
		}
	}

	protected ColumnarStructObjectInspector(List<StructField> fields) {
		init(fields);
	}

	protected void init(List<StructField> fields) {
		this.fields = new ArrayList<MyField>(fields.size());
		for (int i = 0; i < fields.size(); i++) {
			this.fields.add(new MyField(i, fields.get(i).getFieldName(), fields.get(i).getFieldObjectInspector(),
					fields.get(i).getFieldComment()));
		}
	}

	@Override
	public String getTypeName() {
		return ObjectInspectorUtils.getStandardStructTypeName(this);
	}

	@Override
	public final Category getCategory() {
		return Category.STRUCT;
	}

	// Without Data
	@Override
	public StructField getStructFieldRef(String fieldName) {
		return ObjectInspectorUtils.getStandardStructFieldRef(fieldName, fields);
	}

	@Override
	public List<? extends StructField> getAllStructFieldRefs() {
		return fields;
	}

	// With Data
	@Override
	public Object getStructFieldData(Object data, StructField fieldRef) {
		if (data == null) {
			return null;
		}
		ColumnarStructBase struct = (ColumnarStructBase) data;
		MyField f = (MyField) fieldRef;

		int fieldID = f.getFieldID();
		assert (fieldID >= 0 && fieldID < fields.size());

		return struct.getField(fieldID);
	}

	@Override
	public List<Object> getStructFieldsDataAsList(Object data) {
		if (data == null) {
			return null;
		}
		ColumnarStructBase struct = (ColumnarStructBase) data;
		return struct.getFieldsAsList();
	}
}
