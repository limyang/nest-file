package com.ebay.nest.io.cif;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;

import com.ebay.nest.core.NestConf;

public interface InputFormatChecker {

	boolean validateInput(FileSystem fs, NestConf conf, ArrayList<FileStatus> files) throws IOException;

}