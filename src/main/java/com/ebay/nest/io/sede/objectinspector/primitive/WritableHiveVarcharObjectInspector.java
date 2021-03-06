package com.ebay.nest.io.sede.objectinspector.primitive;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ebay.nest.io.nestfile.HiveVarchar;
import com.ebay.nest.io.sede.HiveVarcharWritable;
import com.ebay.nest.io.sede.objectinspector.primitive.PrimitiveObjectInspectorUtils.PrimitiveTypeEntry;
import com.ebay.nest.io.sede.typeinfo.ParameterizedPrimitiveTypeUtils;
import com.ebay.nest.io.sede.typeinfo.VarcharTypeParams;

public class WritableHiveVarcharObjectInspector
    extends AbstractPrimitiveWritableObjectInspector
    implements SettableHiveVarcharObjectInspector {

  private static final Log LOG = LogFactory.getLog(WritableHiveVarcharObjectInspector.class);

  public WritableHiveVarcharObjectInspector(PrimitiveTypeEntry typeEntry) {
    super(typeEntry);
    if (typeEntry.primitiveCategory != PrimitiveCategory.VARCHAR) {
      throw new RuntimeException(
          "TypeEntry of type varchar expected, got " + typeEntry.primitiveCategory);
    }
  }

  @Override
  public HiveVarchar getPrimitiveJavaObject(Object o) {
    // check input object's length, if it doesn't match
    // then output a new primitive with the correct params.
    if (o == null) {
      return null;
    }
    HiveVarcharWritable writable = ((HiveVarcharWritable)o);
    if (doesWritableMatchTypeParams(writable)) {
      return writable.getHiveVarchar();
    }
    return getPrimitiveWithParams(writable);
  }

  public HiveVarcharWritable getPrimitiveWritableObject(Object o) {
    // check input object's length, if it doesn't match
    // then output new writable with correct params.
    if (o == null) {
      return null;
    }
    HiveVarcharWritable writable = ((HiveVarcharWritable)o);
    if (doesWritableMatchTypeParams((HiveVarcharWritable)o)) {
      return writable;
    }

    return getWritableWithParams(writable);
  }

  private HiveVarchar getPrimitiveWithParams(HiveVarcharWritable val) {
    HiveVarchar hv = new HiveVarchar();
    hv.setValue(val.getHiveVarchar(), getMaxLength());
    return hv;
  }

  private HiveVarcharWritable getWritableWithParams(HiveVarcharWritable val) {
    HiveVarcharWritable newValue = new HiveVarcharWritable();
    newValue.set(val, getMaxLength());
    return newValue;
  }

  private boolean doesWritableMatchTypeParams(HiveVarcharWritable writable) {
    return ParameterizedPrimitiveTypeUtils.doesWritableMatchTypeParams(
        writable, (VarcharTypeParams) typeParams);
  }

  private boolean doesPrimitiveMatchTypeParams(HiveVarchar value) {
    return ParameterizedPrimitiveTypeUtils.doesPrimitiveMatchTypeParams(
        value, (VarcharTypeParams) typeParams);
  }

  @Override
  public Object copyObject(Object o) {
    if (o == null) {
      return null;
    }
    HiveVarcharWritable writable = (HiveVarcharWritable)o;
    if (doesWritableMatchTypeParams((HiveVarcharWritable)o)) {
      return new HiveVarcharWritable(writable);
    }
    return getWritableWithParams(writable);
  }

  @Override
  public Object set(Object o, HiveVarchar value) {
    HiveVarcharWritable writable = (HiveVarcharWritable)o;
    writable.set(value, getMaxLength());
    return o;
  }

  @Override
  public Object set(Object o, String value) {
    HiveVarcharWritable writable = (HiveVarcharWritable)o;
    writable.set(value, getMaxLength());
    return o;
  }

  @Override
  public Object create(HiveVarchar value) {
    HiveVarcharWritable ret;
    ret = new HiveVarcharWritable();
    ret.set(value, getMaxLength());
    return ret;
  }

  public int getMaxLength() {
    return typeParams != null ? ((VarcharTypeParams) typeParams).length : -1;
  }
}
