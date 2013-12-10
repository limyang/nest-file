package com.ebay.nest.io.sede.objectinspector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class StandardStructObjectInspector extends SettableStructObjectInspector {

	public static final Log LOG = LogFactory.getLog(StandardStructObjectInspector.class.getName());

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

	protected List<MyField> fields;

	protected StandardStructObjectInspector() {
		super();
	}

	protected StandardStructObjectInspector(List<String> structFieldNames,
			List<ObjectInspector> structFieldObjectInspectors) {
		init(structFieldNames, structFieldObjectInspectors, null);
	}

	protected StandardStructObjectInspector(List<String> structFieldNames,
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

	protected StandardStructObjectInspector(List<StructField> fields) {
		init(fields);
	}

	protected void init(List<StructField> fields) {
		this.fields = new ArrayList<MyField>(fields.size());
		for (int i = 0; i < fields.size(); i++) {
			this.fields.add(new MyField(i, fields.get(i).getFieldName(), fields.get(i).getFieldObjectInspector()));
		}
	}

	public String getTypeName() {
		return ObjectInspectorUtils.getStandardStructTypeName(this);
	}

	public final Category getCategory() {
		return Category.STRUCT;
	}

	public StructField getStructFieldRef(String fieldName) {
		return ObjectInspectorUtils.getStandardStructFieldRef(fieldName, fields);
	}

	public List<? extends StructField> getAllStructFieldRefs() {
		return fields;
	}

	boolean warned = false;

	public Object getStructFieldData(Object data, StructField fieldRef) {
		if (data == null) {
			return null;
		}

		boolean isArray = !(data instanceof List);
		if (!isArray && !(data instanceof List)) {
			return data;
		}
		int listSize = (isArray ? ((Object[]) data).length : ((List<Object>) data).size());
		MyField f = (MyField) fieldRef;
		if (fields.size() != listSize && !warned) {
			warned = true;
			LOG.warn("Trying to access " + fields.size() + " fields inside a list of " + listSize + " elements: "
					+ (isArray ? Arrays.asList((Object[]) data) : (List<Object>) data));
			LOG.warn("ignoring similar errors.");
		}
		int fieldID = f.getFieldID();
		assert (fieldID >= 0 && fieldID < fields.size());

		if (fieldID >= listSize) {
			return null;
		} else if (isArray) {
			return ((Object[]) data)[fieldID];
		} else {
			return ((List<Object>) data).get(fieldID);
		}
	}

	public List<Object> getStructFieldsDataAsList(Object data) {
		if (data == null) {
			return null;
		}

		if (!(data instanceof List)) {
			data = java.util.Arrays.asList((Object[]) data);
		}
		List<Object> list = (List<Object>) data;
		assert (list.size() == fields.size());
		return list;
	}

	public Object create() {
		ArrayList<Object> a = new ArrayList<Object>(fields.size());
		for (int i = 0; i < fields.size(); i++) {
			a.add(null);
		}
		return a;
	}

	public Object setStructFieldData(Object struct, StructField field, Object fieldValue) {
		ArrayList<Object> a = (ArrayList<Object>) struct;
		MyField myField = (MyField) field;
		a.set(myField.fieldID, fieldValue);
		return a;
	}

}
