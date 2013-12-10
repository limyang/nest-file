package com.ebay.nest.io.sede.objectinspector;

import java.util.Map;

public interface MapObjectInspector extends ObjectInspector {

	ObjectInspector getMapKeyObjectInspector();

	ObjectInspector getMapValueObjectInspector();

	Object getMapValueElement(Object data, Object key);

	Map<?, ?> getMap(Object data);

	int getMapSize(Object data);
}
