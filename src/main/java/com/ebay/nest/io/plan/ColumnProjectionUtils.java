package com.ebay.nest.io.plan;

import java.util.ArrayList;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.util.StringUtils;

public class ColumnProjectionUtils {

	public static final String READ_COLUMN_NAMES_CONF_STR = "hive.io.file.readcolumn.names";
	public static final String READ_COLUMN_IDS_CONF_STR = "hive.io.file.readcolumn.ids";

	public static ArrayList<Integer> getReadColumnIDs(Configuration conf) {
		if (conf == null) {
			return new ArrayList<Integer>(0);
		}
		String skips = conf.get(READ_COLUMN_IDS_CONF_STR, "");
		String[] list = StringUtils.split(skips);
		ArrayList<Integer> result = new ArrayList<Integer>(list.length);
		for (String element : list) {
			Integer toAdd = Integer.parseInt(element);
			if (!result.contains(toAdd)) {
				result.add(toAdd);
			}
		}
		return result;
	}

}
