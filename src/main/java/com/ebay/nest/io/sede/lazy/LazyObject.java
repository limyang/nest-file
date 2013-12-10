package com.ebay.nest.io.sede.lazy;

import com.ebay.nest.io.sede.objectinspector.ObjectInspector;

/**
 * LazyObject stores an object in a range of bytes in a byte[].
 * 
 * A LazyObject can represent any primitive object or hierarchical object like array, map or struct.
 */
public abstract class LazyObject<OI extends ObjectInspector> extends LazyObjectBase {

	protected OI oi;

	/**
	 * Create a LazyObject.
	 * 
	 * @param oi
	 *            Derived classes can access meta information about this Lazy Object (e.g, separator, nullSequence,
	 *            escaper) from it.
	 */
	protected LazyObject(OI oi) {
		this.oi = oi;
	}

	@Override
	public abstract int hashCode();

	protected OI getInspector() {
		return oi;
	}

	protected void setInspector(OI oi) {
		this.oi = oi;
	}
}
