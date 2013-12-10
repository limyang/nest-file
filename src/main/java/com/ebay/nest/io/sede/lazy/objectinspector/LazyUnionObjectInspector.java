package com.ebay.nest.io.sede.lazy.objectinspector;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.io.Text;

import com.ebay.nest.io.sede.lazy.LazyUnion;
import com.ebay.nest.io.sede.objectinspector.ObjectInspector;
import com.ebay.nest.io.sede.objectinspector.ObjectInspectorUtils;
import com.ebay.nest.io.sede.objectinspector.UnionObjectInspector;

public class LazyUnionObjectInspector implements UnionObjectInspector {

	public static final Log LOG = LogFactory.getLog(LazyUnionObjectInspector.class.getName());

	private List<ObjectInspector> ois;
	private byte separator;
	private Text nullSequence;
	private boolean escaped;
	private byte escapeChar;

	protected LazyUnionObjectInspector() {
		super();
	}

	protected LazyUnionObjectInspector(List<ObjectInspector> ois, byte separator, Text nullSequence, boolean escaped,
			byte escapeChar) {
		init(ois, separator, nullSequence, escaped, escapeChar);
	}

	@Override
	public String getTypeName() {
		return ObjectInspectorUtils.getStandardUnionTypeName(this);
	}

	protected void init(List<ObjectInspector> ois, byte separator, Text nullSequence, boolean escaped, byte escapeChar) {
		this.separator = separator;
		this.nullSequence = nullSequence;
		this.escaped = escaped;
		this.escapeChar = escapeChar;
		this.ois = new ArrayList<ObjectInspector>();
		this.ois.addAll(ois);
	}

	protected LazyUnionObjectInspector(List<ObjectInspector> ois, byte separator, Text nullSequence) {
		init(ois, separator, nullSequence);
	}

	protected void init(List<ObjectInspector> ois, byte separator, Text nullSequence) {
		this.separator = separator;
		this.nullSequence = nullSequence;
		this.ois = new ArrayList<ObjectInspector>();
		this.ois.addAll(ois);
	}

	@Override
	public final Category getCategory() {
		return Category.UNION;
	}

	public byte getSeparator() {
		return separator;
	}

	public Text getNullSequence() {
		return nullSequence;
	}

	public boolean isEscaped() {
		return escaped;
	}

	public byte getEscapeChar() {
		return escapeChar;
	}

	@Override
	public Object getField(Object data) {
		if (data == null) {
			return null;
		}
		return ((LazyUnion) data).getField();
	}

	@Override
	public List<ObjectInspector> getObjectInspectors() {
		return ois;
	}

	@Override
	public byte getTag(Object data) {
		if (data == null) {
			return -1;
		}
		return ((LazyUnion) data).getTag();
	}
}
