package com.ebay.nest.io.sede.objectinspector.primitive;

import com.ebay.nest.io.sede.objectinspector.PrimitiveObjectInspector;

public interface BooleanObjectInspector extends PrimitiveObjectInspector {

	boolean get(Object o);
}
