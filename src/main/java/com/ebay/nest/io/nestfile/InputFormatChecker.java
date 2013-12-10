package com.ebay.nest.io.nestfile;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;

public interface InputFormatChecker {

	boolean validateInput(FileSystem fs, Configuration conf, ArrayList<FileStatus> files) throws IOException;

}