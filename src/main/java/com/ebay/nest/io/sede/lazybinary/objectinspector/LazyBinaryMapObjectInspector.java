package com.ebay.nest.io.sede.lazybinary.objectinspector;

import java.util.Map;

import com.ebay.nest.io.sede.lazybinary.LazyBinaryMap;
import com.ebay.nest.io.sede.objectinspector.ObjectInspector;
import com.ebay.nest.io.sede.objectinspector.StandardMapObjectInspector;

/**
 * ObjectInspector for LazyBinaryMap.
 * 
 * @see LazyBinaryMap
 */
public class LazyBinaryMapObjectInspector extends StandardMapObjectInspector {

  protected LazyBinaryMapObjectInspector() {
    super();
  }
  protected LazyBinaryMapObjectInspector(ObjectInspector mapKeyObjectInspector,
      ObjectInspector mapValueObjectInspector) {
    super(mapKeyObjectInspector, mapValueObjectInspector);
  }

  @Override
  public Map<?, ?> getMap(Object data) {
    if (data == null) {
      return null;
    }
    return ((LazyBinaryMap) data).getMap();
  }

  @Override
  public int getMapSize(Object data) {
    if (data == null) {
      return -1;
    }
    return ((LazyBinaryMap) data).getMapSize();
  }

  @Override
  public Object getMapValueElement(Object data, Object key) {
    if (data == null) {
      return -1;
    }
    return ((LazyBinaryMap) data).getMapValueElement(key);
  }
}
