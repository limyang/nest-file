package com.ebay.nest.io.utils;

public final class JavaUtils {

	  /**
	   * Standard way of getting classloader in Hive code (outside of Hadoop).
	   * 
	   * Uses the context loader to get access to classpaths to auxiliary and jars
	   * added with 'add jar' command. Falls back to current classloader.
	   * 
	   * In Hadoop-related code, we use Configuration.getClassLoader().
	   */
	  public static ClassLoader getClassLoader() {
	    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
	    if (classLoader == null) {
	      classLoader = JavaUtils.class.getClassLoader();
	    }
	    return classLoader;
	  }

	  private JavaUtils() {
	    // prevent instantiation
	  }
	}