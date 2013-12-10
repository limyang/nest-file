package com.ebay.nest.io.sede.objectinspector.primitive;

import com.ebay.nest.io.nestfile.HiveVarchar;

public interface SettableHiveVarcharObjectInspector extends HiveVarcharObjectInspector {
	Object set(Object o, HiveVarchar value);

	Object set(Object o, String value);

	Object create(HiveVarchar value);

}
