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
package com.ebay.nest.io.sede.lazy.objectinspector.primitive;

import org.apache.hadoop.io.NullWritable;

import com.ebay.nest.io.sede.objectinspector.primitive.PrimitiveObjectInspectorUtils;
import com.ebay.nest.io.sede.objectinspector.primitive.VoidObjectInspector;

/**
 * A WritableVoidObjectInspector inspects a NullWritable Object.
 */
public class LazyVoidObjectInspector extends
    AbstractPrimitiveLazyObjectInspector<NullWritable> implements
    VoidObjectInspector {

  LazyVoidObjectInspector() {
    super(PrimitiveObjectInspectorUtils.voidTypeEntry);
  }

  @Override
  public Object copyObject(Object o) {
    return o;
  }

  @Override
  public Object getPrimitiveJavaObject(Object o) {
    throw new RuntimeException("Internal error: cannot create Void object.");
  }
}