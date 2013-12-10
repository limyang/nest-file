/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ebay.nest.io.nestfile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.Writable;

import com.ebay.nest.io.sede.SerDe;
import com.ebay.nest.io.sede.SerDeException;
import com.ebay.nest.io.sede.SerDeStats;
import com.ebay.nest.io.sede.StructTypeInfo;
import com.ebay.nest.io.sede.TypeInfo;
import com.ebay.nest.io.sede.TypeInfoUtils;
import com.ebay.nest.io.sede.objectinspector.ObjectInspector;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class OrcSerde implements SerDe {

	private static final Log LOG = LogFactory.getLog(OrcSerde.class);

	private final OrcSerdeRow row = new OrcSerdeRow();
	private ObjectInspector inspector = null;

	final class OrcSerdeRow implements Writable {
		private Object realRow;
		private ObjectInspector inspector;

		@Override
		public void write(DataOutput dataOutput) throws IOException {
			throw new UnsupportedOperationException("can't write the bundle");
		}

		@Override
		public void readFields(DataInput dataInput) throws IOException {
			throw new UnsupportedOperationException("can't read the bundle");
		}

		ObjectInspector getInspector() {
			return inspector;
		}

		Object getRow() {
			return realRow;
		}
	}

	@Override
	public void initialize(Configuration conf, Properties table) {
		String columnNameProperty = table.getProperty("columns");
		String columnTypeProperty = table.getProperty("columns.types");

		ArrayList<String> columnNames = new ArrayList<String>();
		if (columnNameProperty != null && columnNameProperty.length() > 0) {
			for (String name : columnNameProperty.split(",")) {
				columnNames.add(name);
			}
		}
		if (columnTypeProperty == null) {
			// Default type: all string
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < columnNames.size(); i++) {
				if (i > 0) {
					sb.append(":");
				}
				sb.append("string");
			}
			columnTypeProperty = sb.toString();
		}

		ArrayList<TypeInfo> fieldTypes = TypeInfoUtils.getTypeInfosFromTypeString(columnTypeProperty);
		StructTypeInfo rootType = new StructTypeInfo();
		rootType.setAllStructFieldNames(columnNames);
		rootType.setAllStructFieldTypeInfos(fieldTypes);
		inspector = OrcStruct.createObjectInspector(rootType);
	}

	@Override
	public Class<? extends Writable> getSerializedClass() {
		return OrcSerdeRow.class;
	}

	@Override
	public Writable serialize(Object realRow, ObjectInspector inspector) {
		row.realRow = realRow;
		row.inspector = inspector;
		return row;
	}

	@Override
	public Object deserialize(Writable writable) throws SerDeException {
		return writable;
	}

	@Override
	public ObjectInspector getObjectInspector() throws SerDeException {
		return inspector;
	}

	public SerDeStats getSerDeStats() {
		return null;
	}

}
