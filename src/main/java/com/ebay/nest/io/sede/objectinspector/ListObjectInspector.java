package com.ebay.nest.io.sede.objectinspector;

import java.util.List;

public interface ListObjectInspector extends ObjectInspector {

	ObjectInspector getListElementObjectInspector();

	Object getListElement(Object data, int index);

	int getListLength(Object data);

	List<?> getList(Object data);

}
