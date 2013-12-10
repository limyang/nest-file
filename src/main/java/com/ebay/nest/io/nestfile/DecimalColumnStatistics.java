package com.ebay.nest.io.nestfile;


public interface DecimalColumnStatistics extends ColumnStatistics {

	HiveDecimal getMinimum();

	HiveDecimal getMaximum();

	HiveDecimal getSum();

}
