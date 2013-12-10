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

import com.ebay.nest.io.sede.ByteWritable;
import com.ebay.nest.io.sede.lazy.ByteArrayRef;
import com.ebay.nest.io.sede.objectinspector.primitive.WritableByteObjectInspector;

/**
 * LazyBinaryObject for byte which takes one byte.
 */
public class LazyBinaryByte extends
    LazyBinaryPrimitive<WritableByteObjectInspector, ByteWritable> {

  LazyBinaryByte(WritableByteObjectInspector oi) {
    super(oi);
    data = new ByteWritable();
  }

  LazyBinaryByte(LazyBinaryByte copy) {
    super(copy);
    data = new ByteWritable(copy.data.get());
  }

  @Override
  public void init(ByteArrayRef bytes, int start, int length) {
    assert (1 == length);
    data.set(bytes.getData()[start]);
  }
}
