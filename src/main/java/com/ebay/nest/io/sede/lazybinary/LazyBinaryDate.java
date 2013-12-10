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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ebay.nest.io.sede.DateWritable;
import com.ebay.nest.io.sede.lazy.ByteArrayRef;
import com.ebay.nest.io.sede.lazybinary.LazyBinaryUtils.VInt;
import com.ebay.nest.io.sede.objectinspector.primitive.WritableDateObjectInspector;

/**
 * A LazyBinaryObject that encodes a java.sql.Date in a VInt.
 *
 */
public class LazyBinaryDate extends
    LazyBinaryPrimitive<WritableDateObjectInspector, DateWritable> {
  static final Log LOG = LogFactory.getLog(LazyBinaryDate.class);

  LazyBinaryDate(WritableDateObjectInspector oi) {
    super(oi);
    data = new DateWritable();
  }

  LazyBinaryDate(LazyBinaryDate copy) {
    super(copy);
    data = new DateWritable(copy.data);
  }

  /**
   * Reusable member for decoding integer.
   */
  VInt vInt = new LazyBinaryUtils.VInt();

  /**
   * Initializes LazyBinaryDate object.
   * @param bytes
   * @param start
   * @param length
   */
  @Override
  public void init(ByteArrayRef bytes, int start, int length) {
    data.setFromBytes(bytes.getData(), start, length, vInt);
  }
}
