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

import org.apache.hadoop.io.FloatWritable;

/**
 * A FloatObjectInspector inspects a FloatWritable Object.
 */
public class WritableFloatObjectInspector extends
    AbstractPrimitiveWritableObjectInspector implements
    SettableFloatObjectInspector {

  WritableFloatObjectInspector() {
    super(PrimitiveObjectInspectorUtils.floatTypeEntry);
  }

  @Override
  public float get(Object o) {
    return ((FloatWritable) o).get();
  }

  @Override
  public Object copyObject(Object o) {
    return o == null ? null : new FloatWritable(((FloatWritable) o).get());
  }

  @Override
  public Object getPrimitiveJavaObject(Object o) {
    return o == null ? null : Float.valueOf(((FloatWritable) o).get());
  }

  @Override
  public Object create(float value) {
    return new FloatWritable(value);
  }

  @Override
  public Object set(Object o, float value) {
    ((FloatWritable) o).set(value);
    return o;
  }
}
