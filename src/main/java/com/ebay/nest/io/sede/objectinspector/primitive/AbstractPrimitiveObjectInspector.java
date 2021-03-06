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

import com.ebay.nest.io.sede.objectinspector.PrimitiveObjectInspector;
import com.ebay.nest.io.sede.objectinspector.primitive.PrimitiveObjectInspectorUtils.PrimitiveTypeEntry;
import com.ebay.nest.io.sede.typeinfo.BaseTypeParams;

/**
 * An AbstractPrimitiveObjectInspector is based on
 * ObjectInspectorUtils.PrimitiveTypeEntry.
 */
public abstract class AbstractPrimitiveObjectInspector implements
    PrimitiveObjectInspector {

  protected BaseTypeParams typeParams;
  protected PrimitiveTypeEntry typeEntry;

  protected AbstractPrimitiveObjectInspector() {
    super();
  }
  /**
   * Construct a AbstractPrimitiveObjectInspector.
   */
  protected AbstractPrimitiveObjectInspector(PrimitiveTypeEntry typeEntry) {
    this.typeEntry = typeEntry;
  }

  /**
   * Return the associated Java primitive class for this primitive
   * ObjectInspector.
   */
  @Override
  public Class<?> getJavaPrimitiveClass() {
    return typeEntry.primitiveJavaClass;
  }

  /**
   * Return the associated primitive category for this primitive
   * ObjectInspector.
   */
  @Override
  public PrimitiveCategory getPrimitiveCategory() {
    return typeEntry.primitiveCategory;
  }

  /**
   * Return the associated primitive Writable class for this primitive
   * ObjectInspector.
   */
  @Override
  public Class<?> getPrimitiveWritableClass() {
    return typeEntry.primitiveWritableClass;
  }

  /**
   * Return the associated category this primitive ObjectInspector.
   */
  @Override
  public Category getCategory() {
    return Category.PRIMITIVE;
  }

  /**
   * Return the type name for this primitive ObjectInspector.
   */
  @Override
  public String getTypeName() {
    return typeEntry.toString();
  }

  public BaseTypeParams getTypeParams() {
    return typeParams;
  }

  public void setTypeParams(BaseTypeParams newParams) {
    if (typeParams != null && !typeEntry.isParameterized()) {
      throw new UnsupportedOperationException(
          "Attempting to add type parameters " + typeParams + " to type " + getTypeName());
    }
    this.typeParams = newParams;
  }
}
