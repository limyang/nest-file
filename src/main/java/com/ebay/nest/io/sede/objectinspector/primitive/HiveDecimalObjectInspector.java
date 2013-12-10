package com.ebay.nest.io.sede.objectinspector.primitive;

import com.ebay.nest.io.nestfile.HiveDecimal;
import com.ebay.nest.io.sede.HiveDecimalWritable;
import com.ebay.nest.io.sede.objectinspector.PrimitiveObjectInspector;

public interface HiveDecimalObjectInspector extends PrimitiveObjectInspector {

	HiveDecimalWritable getPrimitiveWritableObject(Object o);

	HiveDecimal getPrimitiveJavaObject(Object o);
}
