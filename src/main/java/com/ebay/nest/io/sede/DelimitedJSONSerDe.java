package com.ebay.nest.io.sede;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.io.Writable;

import com.ebay.nest.io.sede.lazy.LazySimpleSerDe;
import com.ebay.nest.io.sede.objectinspector.ObjectInspector;
import com.ebay.nest.io.sede.objectinspector.ObjectInspector.Category;
import com.ebay.nest.io.sede.objectinspector.primitive.PrimitiveObjectInspectorFactory;

/**
 * DelimitedJSONSerDe.
 *
 * This serde can only serialize, because it is just intended for use by the FetchTask class and the
 * TRANSFORM function.
 */
public class DelimitedJSONSerDe extends LazySimpleSerDe {

  public static final Log LOG = LogFactory.getLog(DelimitedJSONSerDe.class.getName());

  public DelimitedJSONSerDe() throws SerDeException {
  }

  /**
   * Not implemented.
   */
  @Override
  public Object deserialize(Writable field) throws SerDeException {
    LOG.error("DelimitedJSONSerDe cannot deserialize.");
    throw new SerDeException("DelimitedJSONSerDe cannot deserialize.");
  }

  @Override
  protected void serializeField(ByteStream.Output out, Object obj, ObjectInspector objInspector,
      SerDeParameters serdeParams) throws SerDeException {
    if (!objInspector.getCategory().equals(Category.PRIMITIVE) || (objInspector.getTypeName().equalsIgnoreCase(serdeConstants.BINARY_TYPE_NAME))) {
      //do this for all complex types and binary
      try {
        serialize(out, SerDeUtils.getJSONString(obj, objInspector, serdeParams.getNullSequence().toString()),
            PrimitiveObjectInspectorFactory.javaStringObjectInspector, serdeParams.getSeparators(),
            1, serdeParams.getNullSequence(), serdeParams.isEscaped(), serdeParams.getEscapeChar(),
            serdeParams.getNeedsEscape());

      } catch (IOException e) {
        throw new SerDeException(e);
      }

    } else {
      //primitives except binary
      super.serializeField(out, obj, objInspector, serdeParams);
    }
  }
}
