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

import com.ebay.nest.io.sede.TimestampWritable;
import com.ebay.nest.io.sede.objectinspector.ConstantObjectInspector;

/**
 * A WritableConstantTimestampObjectInspector is a WritableTimestampObjectInspector
 * that implements ConstantObjectInspector.
 */
public class WritableConstantTimestampObjectInspector extends
    WritableTimestampObjectInspector implements
    ConstantObjectInspector {

  private TimestampWritable value;

  protected WritableConstantTimestampObjectInspector() {
    super();
  }
  WritableConstantTimestampObjectInspector(TimestampWritable value) {
    super();
    this.value = value;
  }

  @Override
  public TimestampWritable getWritableConstantValue() {
    return value;
  }
}
