package com.ebay.nest.io.cif;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

public interface Reader {

	long getNumberOfRows();

	long getRawDataSize();

	long getRawDataSizeOfColumns(List<String> colNames);

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
