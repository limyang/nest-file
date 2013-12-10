package com.ebay.nest.io.nestfile;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

import com.ebay.nest.io.sarg.SearchArgument;
import com.ebay.nest.io.sede.objectinspector.ObjectInspector;

public interface Reader {

	long getNumberOfRows();

	Iterable<String> getMetadataKeys();

	ByteBuffer getMetadataValue(String key);

	CompressionKind getCompression();

	int getCompressionSize();

	int getRowIndexStride();

	Iterable<StripeInformation> getStripes();

	ObjectInspector getObjectInspector();

	long getContentLength();

	ColumnStatistics[] getStatistics();

	List<OrcProto.Type> getTypes();

	RecordReader rows(boolean[] include) throws IOException;

	RecordReader rows(long offset, long length, boolean[] include) throws IOException;

	RecordReader rows(long offset, long length, boolean[] include, SearchArgument sarg, String[] neededColumns)
			throws IOException;

}
