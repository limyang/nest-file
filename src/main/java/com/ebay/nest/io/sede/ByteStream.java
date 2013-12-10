package com.ebay.nest.io.sede;

import com.ebay.nest.io.nestfile.NonSyncByteArrayInputStream;
import com.ebay.nest.io.nestfile.NonSyncByteArrayOutputStream;

public class ByteStream {

	public static class Input extends NonSyncByteArrayInputStream {
		public byte[] getData() {
			return buf;
		}

		public int getCount() {
			return count;
		}

		public void reset(byte[] argBuf, int argCount) {
			buf = argBuf;
			mark = pos = 0;
			count = argCount;
		}

		public Input() {
			super(new byte[1]);
		}

		public Input(byte[] buf) {
			super(buf);
		}

		public Input(byte[] buf, int offset, int length) {
			super(buf, offset, length);
		}
	}

	public static class Output extends NonSyncByteArrayOutputStream {

		public byte[] getData() {
			return buf;
		}

		public int getCount() {
			return count;
		}

		public Output() {
			super();
		}

		public Output(int size) {
			super(size);
		}
	}
}
