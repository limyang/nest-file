package com.ebay.nest.io.nestfile;

import com.ebay.nest.io.sede.DateWritable;

public interface DateColumnStatistics extends ColumnStatistics {

	DateWritable getMinimum();

	DateWritable getMaximum();
}
