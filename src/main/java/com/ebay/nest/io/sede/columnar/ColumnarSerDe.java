package com.ebay.nest.io.sede.columnar;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.Writable;

import com.ebay.nest.io.sede.ColumnProjectionUtils;
import com.ebay.nest.io.sede.SerDe;
import com.ebay.nest.io.sede.SerDeException;
import com.ebay.nest.io.sede.SerDeUtils;
import com.ebay.nest.io.sede.lazy.LazyFactory;
import com.ebay.nest.io.sede.lazy.LazySimpleSerDe;
import com.ebay.nest.io.sede.lazy.LazySimpleSerDe.SerDeParameters;
import com.ebay.nest.io.sede.objectinspector.ObjectInspector;
import com.ebay.nest.io.sede.objectinspector.StructField;
import com.ebay.nest.io.sede.objectinspector.StructObjectInspector;
import com.ebay.nest.io.sede.objectinspector.ObjectInspector.Category;
import com.ebay.nest.io.sede.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import com.ebay.nest.io.sede.typeinfo.StructTypeInfo;
import com.ebay.nest.io.sede.typeinfo.TypeInfoUtils;

/**
 * ColumnarSerDe is used for columnar based storage supported by RCFile.
 * ColumnarSerDe differentiate from LazySimpleSerDe in:<br>
 * (1) ColumnarSerDe uses a ColumnarStruct as its lazy Object <br>
 * (2) ColumnarSerDe initialize ColumnarStruct's field directly. But under the
 * field level, it works like LazySimpleSerDe<br>
 */
public class ColumnarSerDe extends ColumnarSerDeBase {

  @Override
  public String toString() {
    return getClass().toString()
        + "["
        + Arrays.asList(serdeParams.getSeparators())
        + ":"
        + ((StructTypeInfo) serdeParams.getRowTypeInfo())
            .getAllStructFieldNames()
        + ":"
        + ((StructTypeInfo) serdeParams.getRowTypeInfo())
            .getAllStructFieldTypeInfos() + "]";
  }

  public static final Log LOG = LogFactory
      .getLog(ColumnarSerDe.class.getName());

  public ColumnarSerDe() throws SerDeException {
  }

  SerDeParameters serdeParams = null;

  /**
   * Initialize the SerDe given the parameters.
   *
   * @see SerDe#initialize(Configuration, Properties)
   */
  public void initialize(Configuration job, Properties tbl) throws SerDeException {

    serdeParams = LazySimpleSerDe.initSerdeParams(job, tbl, getClass().getName());

    // Create the ObjectInspectors for the fields. Note: Currently
    // ColumnarObject uses same ObjectInpector as LazyStruct
    cachedObjectInspector = LazyFactory.createColumnarStructInspector(
        serdeParams.getColumnNames(), serdeParams.getColumnTypes(), serdeParams
            .getSeparators(), serdeParams.getNullSequence(), serdeParams
            .isEscaped(), serdeParams.getEscapeChar());

    java.util.ArrayList<Integer> notSkipIDs = ColumnProjectionUtils.getReadColumnIDs(job);

    cachedLazyStruct = new ColumnarStruct(cachedObjectInspector, notSkipIDs,
        serdeParams.getNullSequence());

    int size = serdeParams.getColumnTypes().size();
    super.initialize(size);
    LOG.debug("ColumnarSerDe initialized with: columnNames="
        + serdeParams.getColumnNames() + " columnTypes="
        + serdeParams.getColumnTypes() + " separator="
        + Arrays.asList(serdeParams.getSeparators()) + " nullstring="
        + serdeParams.getNullString());
  }

  /**
   * Serialize a row of data.
   *
   * @param obj
   *          The row object
   * @param objInspector
   *          The ObjectInspector for the row object
   * @return The serialized Writable object
   * @see SerDe#serialize(Object, ObjectInspector)
   */
  public Writable serialize(Object obj, ObjectInspector objInspector) throws SerDeException {

    if (objInspector.getCategory() != Category.STRUCT) {
      throw new SerDeException(getClass().toString()
          + " can only serialize struct types, but we got: "
          + objInspector.getTypeName());
    }

    // Prepare the field ObjectInspectors
    StructObjectInspector soi = (StructObjectInspector) objInspector;
    List<? extends StructField> fields = soi.getAllStructFieldRefs();
    List<Object> list = soi.getStructFieldsDataAsList(obj);
    List<? extends StructField> declaredFields = (serdeParams.getRowTypeInfo() != null && ((StructTypeInfo) serdeParams
        .getRowTypeInfo()).getAllStructFieldNames().size() > 0) ? ((StructObjectInspector) getObjectInspector())
        .getAllStructFieldRefs()
        : null;

    try {
      // used for avoid extra byte copy
      serializeStream.reset();
      serializedSize = 0;
      int count = 0;
      // Serialize each field
      for (int i = 0; i < fields.size(); i++) {
        // Get the field objectInspector and the field object.
        ObjectInspector foi = fields.get(i).getFieldObjectInspector();
        Object f = (list == null ? null : list.get(i));

        if (declaredFields != null && i >= declaredFields.size()) {
          throw new SerDeException("Error: expecting " + declaredFields.size()
              + " but asking for field " + i + "\n" + "data=" + obj + "\n"
              + "tableType=" + serdeParams.getRowTypeInfo().toString() + "\n"
              + "dataType="
              + TypeInfoUtils.getTypeInfoFromObjectInspector(objInspector));
        }

        // If the field that is passed in is NOT a primitive, and either the
        // field is not declared (no schema was given at initialization), or
        // the field is declared as a primitive in initialization, serialize
        // the data to JSON string. Otherwise serialize the data in the
        // delimited way.
        if (!foi.getCategory().equals(Category.PRIMITIVE)
            && (declaredFields == null || declaredFields.get(i)
                .getFieldObjectInspector().getCategory().equals(
                    Category.PRIMITIVE))) {
          LazySimpleSerDe.serialize(serializeStream, SerDeUtils.getJSONString(
              f, foi),
              PrimitiveObjectInspectorFactory.javaStringObjectInspector,
              serdeParams.getSeparators(), 1, serdeParams.getNullSequence(),
              serdeParams.isEscaped(), serdeParams.getEscapeChar(), serdeParams
                  .getNeedsEscape());
        } else {
          LazySimpleSerDe.serialize(serializeStream, f, foi, serdeParams
              .getSeparators(), 1, serdeParams.getNullSequence(), serdeParams
              .isEscaped(), serdeParams.getEscapeChar(), serdeParams
              .getNeedsEscape());
        }

        field[i].set(serializeStream.getData(), count, serializeStream
            .getCount()
            - count);
        count = serializeStream.getCount();
      }
      serializedSize = serializeStream.getCount();
      lastOperationSerialize = true;
      lastOperationDeserialize = false;
    } catch (IOException e) {
      throw new SerDeException(e);
    }
    return serializeCache;
  }

}
