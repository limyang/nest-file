package com.ebay.nest.io.sede.columnar;

import java.util.List;
import java.util.Properties;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.Writable;

import com.ebay.nest.io.sede.ColumnProjectionUtils;
import com.ebay.nest.io.sede.SerDeException;
import com.ebay.nest.io.sede.lazy.LazySimpleSerDe.SerDeParameters;
import com.ebay.nest.io.sede.lazy.LazyUtils;
import com.ebay.nest.io.sede.lazybinary.LazyBinaryFactory;
import com.ebay.nest.io.sede.lazybinary.LazyBinarySerDe;
import com.ebay.nest.io.sede.objectinspector.ObjectInspector;
import com.ebay.nest.io.sede.objectinspector.PrimitiveObjectInspector;
import com.ebay.nest.io.sede.objectinspector.StructField;
import com.ebay.nest.io.sede.objectinspector.StructObjectInspector;
import com.ebay.nest.io.sede.objectinspector.ObjectInspector.Category;
import com.ebay.nest.io.sede.objectinspector.primitive.StringObjectInspector;
import com.ebay.nest.io.sede.typeinfo.TypeInfo;

/**
 * LazyBinaryColumnarSerDe. This serde combines elements of columnar serde and lazybinary serde to produce a serde which
 * serializes columns into a BytesRefArrayWritable in a compact binary format and which is deserialized in a lazy, i.e.
 * on-demand fashion.
 * 
 */
public class LazyBinaryColumnarSerDe extends ColumnarSerDeBase {

	private List<String> columnNames;
	private List<TypeInfo> columnTypes;

	@Override
	public String toString() {
		return getClass().toString() + "[" + columnNames + ":" + columnTypes + "]";
	}

	@Override
	public void initialize(Configuration conf, Properties tbl) throws SerDeException {
		SerDeParameters serdeParams = new SerDeParameters();
		LazyUtils.extractColumnInfo(tbl, serdeParams, getClass().getName());
		columnNames = serdeParams.getColumnNames();
		columnTypes = serdeParams.getColumnTypes();

		cachedObjectInspector = LazyBinaryFactory.createColumnarStructInspector(columnNames, columnTypes);
		java.util.ArrayList<Integer> notSkipIDs = ColumnProjectionUtils.getReadColumnIDs(conf);
		cachedLazyStruct = new LazyBinaryColumnarStruct(cachedObjectInspector, notSkipIDs);
		int size = columnTypes.size();
		super.initialize(size);
	}

	static final byte[] INVALID_UTF__SINGLE_BYTE = { (byte) Integer.parseInt("10111111", 2) };

	@Override
	public Writable serialize(Object obj, ObjectInspector objInspector) throws SerDeException {
		if (objInspector.getCategory() != Category.STRUCT) {
			throw new SerDeException(getClass().toString() + " can only serialize struct types, but we got: "
					+ objInspector.getTypeName());
		}

		StructObjectInspector soi = (StructObjectInspector) objInspector;
		List<? extends StructField> fields = soi.getAllStructFieldRefs();
		List<Object> list = soi.getStructFieldsDataAsList(obj);

		boolean warnedOnceNullMapKey = false;
		serializeStream.reset();
		serializedSize = 0;
		int streamOffset = 0;
		// Serialize each field
		for (int i = 0; i < fields.size(); i++) {
			// Get the field objectInspector and the field object.
			ObjectInspector foi = fields.get(i).getFieldObjectInspector();
			Object f = (list == null ? null : list.get(i));
			// empty strings are marked by an invalid utf single byte sequence. A valid utf stream cannot
			// produce this sequence
			if ((f != null)
					&& (foi.getCategory().equals(ObjectInspector.Category.PRIMITIVE))
					&& ((PrimitiveObjectInspector) foi).getPrimitiveCategory().equals(
							PrimitiveObjectInspector.PrimitiveCategory.STRING)
					&& ((StringObjectInspector) foi).getPrimitiveJavaObject(f).length() == 0) {
				serializeStream.write(INVALID_UTF__SINGLE_BYTE, 0, 1);
			} else {
				LazyBinarySerDe.serialize(serializeStream, f, foi, true, warnedOnceNullMapKey);
			}
			field[i].set(serializeStream.getData(), streamOffset, serializeStream.getCount() - streamOffset);
			streamOffset = serializeStream.getCount();
		}
		serializedSize = serializeStream.getCount();
		lastOperationSerialize = true;
		lastOperationDeserialize = false;
		return serializeCache;
	}
}
