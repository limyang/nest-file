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

package com.ebay.nest.io.sede.columnar;

import java.util.ArrayList;

import com.ebay.nest.io.sede.lazy.ByteArrayRef;
import com.ebay.nest.io.sede.lazy.LazyObjectBase;
import com.ebay.nest.io.sede.lazybinary.LazyBinaryFactory;
import com.ebay.nest.io.sede.lazybinary.LazyBinaryUtils;
import com.ebay.nest.io.sede.lazybinary.LazyBinaryUtils.VInt;
import com.ebay.nest.io.sede.objectinspector.ObjectInspector;
import com.ebay.nest.io.sede.objectinspector.PrimitiveObjectInspector;
import com.ebay.nest.io.sede.objectinspector.ObjectInspector.Category;
import com.ebay.nest.io.sede.objectinspector.PrimitiveObjectInspector.PrimitiveCategory;

public class LazyBinaryColumnarStruct extends ColumnarStructBase {

	public LazyBinaryColumnarStruct(ObjectInspector oi, ArrayList<Integer> notSkippedColumnIDs) {
		super(oi, notSkippedColumnIDs);
	}

	static VInt vInt = new LazyBinaryUtils.VInt();

	@Override
	protected int getLength(ObjectInspector objectInspector, ByteArrayRef cachedByteArrayRef, int start, int length) {
		if (length == 0) {
			return -1;
		}
		Category category = objectInspector.getCategory();
		if (category.equals(Category.PRIMITIVE)) {
			PrimitiveCategory primitiveCategory = ((PrimitiveObjectInspector) objectInspector).getPrimitiveCategory();
			if (primitiveCategory.equals(PrimitiveCategory.STRING) && (length == 1)
					&& (cachedByteArrayRef.getData()[start] == LazyBinaryColumnarSerDe.INVALID_UTF__SINGLE_BYTE[0])) {
				return 0;
			}
		}
		return length;
	}

	@Override
	protected LazyObjectBase createLazyObjectBase(ObjectInspector objectInspector) {
		return LazyBinaryFactory.createLazyBinaryObject(objectInspector);
	}
}
