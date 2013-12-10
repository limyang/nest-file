package com.ebay.nest.io.sede.lazybinary;

import java.util.ArrayList;
import java.util.List;

import com.ebay.nest.io.sede.lazybinary.objectinspector.LazyBinaryListObjectInspector;
import com.ebay.nest.io.sede.lazybinary.objectinspector.LazyBinaryMapObjectInspector;
import com.ebay.nest.io.sede.lazybinary.objectinspector.LazyBinaryStructObjectInspector;
import com.ebay.nest.io.sede.objectinspector.ObjectInspector;
import com.ebay.nest.io.sede.objectinspector.ObjectInspectorFactory;
import com.ebay.nest.io.sede.objectinspector.PrimitiveObjectInspector;
import com.ebay.nest.io.sede.objectinspector.PrimitiveObjectInspector.PrimitiveCategory;
import com.ebay.nest.io.sede.objectinspector.primitive.WritableBinaryObjectInspector;
import com.ebay.nest.io.sede.objectinspector.primitive.WritableBooleanObjectInspector;
import com.ebay.nest.io.sede.objectinspector.primitive.WritableByteObjectInspector;
import com.ebay.nest.io.sede.objectinspector.primitive.WritableDateObjectInspector;
import com.ebay.nest.io.sede.objectinspector.primitive.WritableDoubleObjectInspector;
import com.ebay.nest.io.sede.objectinspector.primitive.WritableFloatObjectInspector;
import com.ebay.nest.io.sede.objectinspector.primitive.WritableHiveDecimalObjectInspector;
import com.ebay.nest.io.sede.objectinspector.primitive.WritableHiveVarcharObjectInspector;
import com.ebay.nest.io.sede.objectinspector.primitive.WritableIntObjectInspector;
import com.ebay.nest.io.sede.objectinspector.primitive.WritableLongObjectInspector;
import com.ebay.nest.io.sede.objectinspector.primitive.WritableShortObjectInspector;
import com.ebay.nest.io.sede.objectinspector.primitive.WritableStringObjectInspector;
import com.ebay.nest.io.sede.objectinspector.primitive.WritableTimestampObjectInspector;
import com.ebay.nest.io.sede.objectinspector.primitive.WritableVoidObjectInspector;
import com.ebay.nest.io.sede.typeinfo.TypeInfo;

public final class LazyBinaryFactory {

	public static LazyBinaryPrimitive<?, ?> createLazyBinaryPrimitiveClass(PrimitiveObjectInspector oi) {
		PrimitiveCategory p = oi.getPrimitiveCategory();
		switch (p) {
		case BOOLEAN:
			return new LazyBinaryBoolean((WritableBooleanObjectInspector) oi);
		case BYTE:
			return new LazyBinaryByte((WritableByteObjectInspector) oi);
		case SHORT:
			return new LazyBinaryShort((WritableShortObjectInspector) oi);
		case INT:
			return new LazyBinaryInteger((WritableIntObjectInspector) oi);
		case LONG:
			return new LazyBinaryLong((WritableLongObjectInspector) oi);
		case FLOAT:
			return new LazyBinaryFloat((WritableFloatObjectInspector) oi);
		case DOUBLE:
			return new LazyBinaryDouble((WritableDoubleObjectInspector) oi);
		case STRING:
			return new LazyBinaryString((WritableStringObjectInspector) oi);
		case VARCHAR:
			return new LazyBinaryHiveVarchar((WritableHiveVarcharObjectInspector) oi);
		case VOID: // for NULL
			return new LazyBinaryVoid((WritableVoidObjectInspector) oi);
		case DATE:
			return new LazyBinaryDate((WritableDateObjectInspector) oi);
		case TIMESTAMP:
			return new LazyBinaryTimestamp((WritableTimestampObjectInspector) oi);
		case BINARY:
			return new LazyBinaryBinary((WritableBinaryObjectInspector) oi);
		case DECIMAL:
			return new LazyBinaryHiveDecimal((WritableHiveDecimalObjectInspector) oi);
		default:
			throw new RuntimeException("Internal error: no LazyBinaryObject for " + p);
		}
	}

	public static LazyBinaryObject createLazyBinaryObject(ObjectInspector oi) {
		ObjectInspector.Category c = oi.getCategory();
		switch (c) {
		case PRIMITIVE:
			return createLazyBinaryPrimitiveClass((PrimitiveObjectInspector) oi);
		case MAP:
			return new LazyBinaryMap((LazyBinaryMapObjectInspector) oi);
		case LIST:
			return new LazyBinaryArray((LazyBinaryListObjectInspector) oi);
		case STRUCT:
			return new LazyBinaryStruct((LazyBinaryStructObjectInspector) oi);
		}

		throw new RuntimeException("Hive LazyBinarySerDe Internal error.");
	}

	private LazyBinaryFactory() {
		// prevent instantiation
	}

	public static ObjectInspector createColumnarStructInspector(List<String> columnNames, List<TypeInfo> columnTypes) {
		ArrayList<ObjectInspector> columnObjectInspectors = new ArrayList<ObjectInspector>(columnTypes.size());
		for (int i = 0; i < columnTypes.size(); i++) {
			columnObjectInspectors.add(LazyBinaryUtils.getLazyBinaryObjectInspectorFromTypeInfo(columnTypes.get(i)));
		}
		return ObjectInspectorFactory.getColumnarStructObjectInspector(columnNames, columnObjectInspectors);
	}
}
