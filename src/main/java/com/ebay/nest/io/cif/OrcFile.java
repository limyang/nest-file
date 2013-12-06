package com.ebay.nest.io.cif;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

public final class OrcFile {

	public static final String MAGIC = "CIF";

	public static enum Version {
		V_0_11("0.11", 0, 11), V_0_12("0.12", 0, 12);

		public static final Version CURRENT = V_0_12;

		private final String name;
		private final int major;
		private final int minor;

		private Version(String name, int major, int minor) {
			this.name = name;
			this.major = major;
			this.minor = minor;
		}

		public static Version byName(String name) {
			for (Version version : values()) {
				if (version.name.equals(name)) {
					return version;
				}
			}
			throw new IllegalArgumentException("Unknown ORC version " + name);
		}

		/**
		 * Get the human readable name for the version.
		 */
		public String getName() {
			return name;
		}

		/**
		 * Get the major version number.
		 */
		public int getMajor() {
			return major;
		}

		/**
		 * Get the minor version number.
		 */
		public int getMinor() {
			return minor;
		}
	}

	// the table properties that control ORC files
	public static final String COMPRESSION = "orc.compress";
	public static final String COMPRESSION_BLOCK_SIZE = "orc.compress.size";
	public static final String STRIPE_SIZE = "orc.stripe.size";
	public static final String ROW_INDEX_STRIDE = "orc.row.index.stride";
	public static final String ENABLE_INDEXES = "orc.create.index";
	public static final String BLOCK_PADDING = "orc.block.padding";

	static final long DEFAULT_STRIPE_SIZE = 256 * 1024 * 1024;
	static final CompressionKind DEFAULT_COMPRESSION_KIND = CompressionKind.ZLIB;
	static final int DEFAULT_BUFFER_SIZE = 256 * 1024;
	static final int DEFAULT_ROW_INDEX_STRIDE = 10000;
	static final boolean DEFAULT_BLOCK_PADDING = true;

	// unused
	private OrcFile() {
	}

	/**
	 * Create an ORC file reader.
	 * 
	 * @param fs
	 *            file system
	 * @param path
	 *            file name to read from
	 * @return a new ORC file reader.
	 * @throws IOException
	 */
	public static Reader createReader(FileSystem fs, Path path) throws IOException {
		return new ReaderImpl(fs, path);
	}

	/**
	 * Options for creating ORC file writers.
	 */
	public static class WriterOptions {
		private final Configuration configuration;
		private FileSystem fileSystemValue = null;
		private ObjectInspector inspectorValue = null;
		private long stripeSizeValue = DEFAULT_STRIPE_SIZE;
		private int rowIndexStrideValue = DEFAULT_ROW_INDEX_STRIDE;
		private int bufferSizeValue = DEFAULT_BUFFER_SIZE;
		private boolean blockPaddingValue = DEFAULT_BLOCK_PADDING;
		private CompressionKind compressValue = DEFAULT_COMPRESSION_KIND;
		private MemoryManager memoryManagerValue;
		private Version versionValue;

		WriterOptions(Configuration conf) {
			configuration = conf;
			memoryManagerValue = getMemoryManager(conf);
			String versionName = conf.get(HiveConf.ConfVars.HIVE_ORC_WRITE_FORMAT.varname);
			if (versionName == null) {
				versionValue = Version.CURRENT;
			} else {
				versionValue = Version.byName(versionName);
			}
		}

		/**
		 * Provide the filesystem for the path, if the client has it available. If it is not provided, it will be found
		 * from the path.
		 */
		public WriterOptions fileSystem(FileSystem value) {
			fileSystemValue = value;
			return this;
		}

		/**
		 * Set the stripe size for the file. The writer stores the contents of the stripe in memory until this memory
		 * limit is reached and the stripe is flushed to the HDFS file and the next stripe started.
		 */
		public WriterOptions stripeSize(long value) {
			stripeSizeValue = value;
			return this;
		}

		/**
		 * Set the distance between entries in the row index. The minimum value is 1000 to prevent the index from
		 * overwhelming the data. If the stride is set to 0, no indexes will be included in the file.
		 */
		public WriterOptions rowIndexStride(int value) {
			rowIndexStrideValue = value;
			return this;
		}

		/**
		 * The size of the memory buffers used for compressing and storing the stripe in memory.
		 */
		public WriterOptions bufferSize(int value) {
			bufferSizeValue = value;
			return this;
		}

		/**
		 * Sets whether the HDFS blocks are padded to prevent stripes from straddling blocks. Padding improves locality
		 * and thus the speed of reading, but costs space.
		 */
		public WriterOptions blockPadding(boolean value) {
			blockPaddingValue = value;
			return this;
		}

		/**
		 * Sets the generic compression that is used to compress the data.
		 */
		public WriterOptions compress(CompressionKind value) {
			compressValue = value;
			return this;
		}

		/**
		 * A required option that sets the object inspector for the rows. Used to determine the schema for the file.
		 */
		public WriterOptions inspector(ObjectInspector value) {
			inspectorValue = value;
			return this;
		}

		/**
		 * Sets the version of the file that will be written.
		 */
		public WriterOptions version(Version value) {
			versionValue = value;
			return this;
		}

		/**
		 * A package local option to set the memory manager.
		 */
		WriterOptions memory(MemoryManager value) {
			memoryManagerValue = value;
			return this;
		}
	}

	/**
	 * Create a default set of write options that can be modified.
	 */
	public static WriterOptions writerOptions(Configuration conf) {
		return new WriterOptions(conf);
	}

	/**
	 * Create an ORC file writer. This is the public interface for creating writers going forward and new options will
	 * only be added to this method.
	 * 
	 * @param path
	 *            filename to write to
	 * @param options
	 *            the options
	 * @return a new ORC file writer
	 * @throws IOException
	 */
	public static Writer createWriter(Path path, WriterOptions opts) throws IOException {
		FileSystem fs = opts.fileSystemValue == null ? path.getFileSystem(opts.configuration) : opts.fileSystemValue;

		return new WriterImpl(fs, path, opts.configuration, opts.inspectorValue, opts.stripeSizeValue,
				opts.compressValue, opts.bufferSizeValue, opts.rowIndexStrideValue, opts.memoryManagerValue,
				opts.blockPaddingValue, opts.versionValue);
	}

	/**
	 * Create an ORC file writer. This method is provided for API backward compatability with Hive 0.11.
	 * 
	 * @param fs
	 *            file system
	 * @param path
	 *            filename to write to
	 * @param inspector
	 *            the ObjectInspector that inspects the rows
	 * @param stripeSize
	 *            the number of bytes in a stripe
	 * @param compress
	 *            how to compress the file
	 * @param bufferSize
	 *            the number of bytes to compress at once
	 * @param rowIndexStride
	 *            the number of rows between row index entries or 0 to suppress all indexes
	 * @return a new ORC file writer
	 * @throws IOException
	 */
	public static Writer createWriter(FileSystem fs, Path path, Configuration conf, ObjectInspector inspector,
			long stripeSize, CompressionKind compress, int bufferSize, int rowIndexStride) throws IOException {
		return createWriter(path, writerOptions(conf).fileSystem(fs).inspector(inspector).stripeSize(stripeSize)
				.compress(compress).bufferSize(bufferSize).rowIndexStride(rowIndexStride));
	}

	private static MemoryManager memoryManager = null;

	private static synchronized MemoryManager getMemoryManager(Configuration conf) {
		if (memoryManager == null) {
			memoryManager = new MemoryManager(conf);
		}
		return memoryManager;
	}
}
