package com.ebay.nest.io.sede.lazy;

import java.nio.charset.CharacterCodingException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.io.Text;

import com.ebay.nest.io.nestfile.HiveDecimal;
import com.ebay.nest.io.sede.HiveDecimalWritable;
import com.ebay.nest.io.sede.lazy.objectinspector.primitive.LazyHiveDecimalObjectInspector;

public class LazyHiveDecimal extends LazyPrimitive<LazyHiveDecimalObjectInspector, HiveDecimalWritable> {
	static final private Log LOG = LogFactory.getLog(LazyHiveDecimal.class);

	public LazyHiveDecimal(LazyHiveDecimalObjectInspector oi) {
		super(oi);
		data = new HiveDecimalWritable();
	}

	public LazyHiveDecimal(LazyHiveDecimal copy) {
		super(copy);
		data = new HiveDecimalWritable(copy.data);
	}

	public void init(ByteArrayRef bytes, int start, int length) {
		String byteData = null;
		try {
			byteData = Text.decode(bytes.getData(), start, length);
			data.set(new HiveDecimal(byteData));
			isNull = false;
		} catch (NumberFormatException e) {
			isNull = true;
			LOG.debug("Data not in the HiveDecimal data type range so converted to null. Given data is :" + byteData, e);
		} catch (CharacterCodingException e) {
			isNull = true;
			LOG.debug("Data not in the HiveDecimal data type range so converted to null.", e);
		}
	}

	public HiveDecimalWritable getWritableObject() {
		return data;
	}
}
