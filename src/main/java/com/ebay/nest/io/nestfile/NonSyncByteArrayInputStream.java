package com.ebay.nest.io.nestfile;

import java.io.ByteArrayInputStream;

public class NonSyncByteArrayInputStream extends ByteArrayInputStream {
	public NonSyncByteArrayInputStream() {
		super(new byte[] {});
	}

	public NonSyncByteArrayInputStream(byte[] bs) {
		super(bs);
	}

	public NonSyncByteArrayInputStream(byte[] buf, int offset, int length) {
		super(buf, offset, length);
	}

	public void reset(byte[] input, int start, int length) {
		buf = input;
		count = start + length;
		mark = start;
		pos = start;
	}

	public int getPosition() {
		return pos;
	}

	public int getLength() {
		return count;
	}

	public int read() {
		return (pos < count) ? (buf[pos++] & 0xff) : -1;
	}

	public int read(byte b[], int off, int len) {
		if (b == null) {
			throw new NullPointerException();
		} else if (off < 0 || len < 0 || len > b.length - off) {
			throw new IndexOutOfBoundsException();
		}
		if (pos >= count) {
			return -1;
		}
		if (pos + len > count) {
			len = count - pos;
		}
		if (len <= 0) {
			return 0;
		}
		System.arraycopy(buf, pos, b, off, len);
		pos += len;
		return len;
	}

	public long skip(long n) {
		if (pos + n > count) {
			n = count - pos;
		}
		if (n < 0) {
			return 0;
		}
		pos += n;
		return n;
	}

	public int available() {
		return count - pos;
	}
}
