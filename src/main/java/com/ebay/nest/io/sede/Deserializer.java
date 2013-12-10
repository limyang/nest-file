package com.ebay.nest.io.sede;

import java.util.Properties;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.Writable;

import com.ebay.nest.io.sede.objectinspector.ObjectInspector;

public interface Deserializer {

	void initialize(Configuration conf, Properties tbl) throws SerDeException;

	Object deserialize(Writable blob) throws SerDeException;

	ObjectInspector getObjectInspector() throws SerDeException;

	SerDeStats getSerDeStats();
}
