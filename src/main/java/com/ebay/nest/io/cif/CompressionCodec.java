package com.ebay.nest.io.cif;

import java.io.IOException;
import java.nio.ByteBuffer;

interface CompressionCodec {

	boolean compress(ByteBuffer in, ByteBuffer out, ByteBuffer overflow) throws IOException;

	void decompress(ByteBuffer in, ByteBuffer out) throws IOException;
}
