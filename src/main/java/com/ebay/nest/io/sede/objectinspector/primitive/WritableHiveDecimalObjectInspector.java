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
package com.ebay.nest.io.sede.objectinspector.primitive;


import com.ebay.nest.io.nestfile.HiveDecimal;
import com.ebay.nest.io.sede.HiveDecimalWritable;

public class WritableHiveDecimalObjectInspector
    extends AbstractPrimitiveWritableObjectInspector
    implements SettableHiveDecimalObjectInspector {

  protected WritableHiveDecimalObjectInspector() {
    super(PrimitiveObjectInspectorUtils.decimalTypeEntry);
  }

  @Override
  public HiveDecimalWritable getPrimitiveWritableObject(Object o) {
    return o == null ? null : (HiveDecimalWritable) o;
  }

  @Override
  public HiveDecimal getPrimitiveJavaObject(Object o) {
    return o == null ? null : ((HiveDecimalWritable) o).getHiveDecimal();
  }

  @Override
  public Object copyObject(Object o) {
    return o == null ? null : new HiveDecimalWritable((HiveDecimalWritable) o);
  }

  @Override
  public Object set(Object o, byte[] bytes, int scale) {
    ((HiveDecimalWritable) o).set(bytes, scale);
    return o;
  }

  @Override
  public Object set(Object o, HiveDecimal t) {
    ((HiveDecimalWritable) o).set(t);
    return o;
  }

  @Override
  public Object set(Object o, HiveDecimalWritable t) {
    ((HiveDecimalWritable) o).set(t);
    return o;
  }

  @Override
  public Object create(byte[] bytes, int scale) {
    return new HiveDecimalWritable(bytes, scale);
  }

  @Override
  public Object create(HiveDecimal t) {
    return new HiveDecimalWritable(t);
  }

}
