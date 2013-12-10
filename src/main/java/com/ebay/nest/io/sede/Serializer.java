package com.ebay.nest.io.sede;

import java.util.Properties;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.Writable;

import com.ebay.nest.io.sede.objectinspector.ObjectInspector;

public interface Serializer {

	void initialize(Configuration conf, Properties tbl) throws SerDeException;

	Class<? extends Writable> getSerializedClass();

	Writable serialize(Object obj, ObjectInspector objInspector) throws SerDeException;

	SerDeStats getSerDeStats();
}
