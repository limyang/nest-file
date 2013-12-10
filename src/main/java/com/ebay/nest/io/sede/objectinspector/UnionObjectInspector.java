package com.ebay.nest.io.sede.objectinspector;

import java.util.List;

public interface UnionObjectInspector extends ObjectInspector {

	List<ObjectInspector> getObjectInspectors();

	byte getTag(Object o);

	Object getField(Object o);

}
