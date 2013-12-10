package com.ebay.nest.io.sede.objectinspector;

public interface SettableListObjectInspector extends ListObjectInspector {

	Object create(int size);

	Object set(Object list, int index, Object element);

	Object resize(Object list, int newSize);
}
