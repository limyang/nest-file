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
package com.ebay.nest.io.sede.lazybinary;

import org.apache.hadoop.io.Text;

import com.ebay.nest.io.sede.HiveVarcharWritable;
import com.ebay.nest.io.sede.lazy.ByteArrayRef;
import com.ebay.nest.io.sede.objectinspector.primitive.WritableHiveVarcharObjectInspector;
import com.ebay.nest.io.sede.typeinfo.VarcharTypeParams;

public class LazyBinaryHiveVarchar extends
    LazyBinaryPrimitive<WritableHiveVarcharObjectInspector, HiveVarcharWritable> {

  protected int maxLength = -1;

  LazyBinaryHiveVarchar(WritableHiveVarcharObjectInspector oi) {
    super(oi);
    // Check for params
    VarcharTypeParams typeParams = (VarcharTypeParams)oi.getTypeParams();
    if (typeParams == null) {
      throw new RuntimeException("varchar type used without type params");
    }
    maxLength = typeParams.length;
    data = new HiveVarcharWritable();
  }

  LazyBinaryHiveVarchar(LazyBinaryHiveVarchar copy) {
    super(copy);
    maxLength = copy.maxLength;
    data = new HiveVarcharWritable(copy.data);
  }

  @Override
  public void init(ByteArrayRef bytes, int start, int length) {
    // re-use existing text member in varchar writable
    Text textValue = data.getTextValue();
    textValue.set(bytes.getData(), start, length);
    data.enforceMaxLength(maxLength);
  }

}
