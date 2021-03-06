package com.ebay.nest.io.nestfile;

public final class OrcProto {
	private OrcProto() {
	}

	public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
	}

	/**
	 * Protobuf enum {@code CompressionKind}
	 */
	public enum CompressionKind implements com.google.protobuf.ProtocolMessageEnum {
		/**
		 * <code>NONE = 0;</code>
		 */
		NONE(0, 0),
		/**
		 * <code>ZLIB = 1;</code>
		 */
		ZLIB(1, 1),
		/**
		 * <code>SNAPPY = 2;</code>
		 */
		SNAPPY(2, 2),
		/**
		 * <code>LZO = 3;</code>
		 */
		LZO(3, 3), ;

		/**
		 * <code>NONE = 0;</code>
		 */
		public static final int NONE_VALUE = 0;
		/**
		 * <code>ZLIB = 1;</code>
		 */
		public static final int ZLIB_VALUE = 1;
		/**
		 * <code>SNAPPY = 2;</code>
		 */
		public static final int SNAPPY_VALUE = 2;
		/**
		 * <code>LZO = 3;</code>
		 */
		public static final int LZO_VALUE = 3;

		public final int getNumber() {
			return value;
		}

		public static CompressionKind valueOf(int value) {
			switch (value) {
			case 0:
				return NONE;
			case 1:
				return ZLIB;
			case 2:
				return SNAPPY;
			case 3:
				return LZO;
			default:
				return null;
			}
		}

		public static com.google.protobuf.Internal.EnumLiteMap<CompressionKind> internalGetValueMap() {
			return internalValueMap;
		}

		private static com.google.protobuf.Internal.EnumLiteMap<CompressionKind> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<CompressionKind>() {
			public CompressionKind findValueByNumber(int number) {
				return CompressionKind.valueOf(number);
			}
		};

		public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
			return getDescriptor().getValues().get(index);
		}

		public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
			return getDescriptor();
		}

		public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
			return OrcProto.getDescriptor().getEnumTypes().get(0);
		}

		private static final CompressionKind[] VALUES = values();

		public static CompressionKind valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
			if (desc.getType() != getDescriptor()) {
				throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
			}
			return VALUES[desc.getIndex()];
		}

		private final int index;
		private final int value;

		private CompressionKind(int index, int value) {
			this.index = index;
			this.value = value;
		}

		// @@protoc_insertion_point(enum_scope:CompressionKind)
	}

	public interface IntegerStatisticsOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// optional sint64 minimum = 1;
		/**
		 * <code>optional sint64 minimum = 1;</code>
		 */
		boolean hasMinimum();

		/**
		 * <code>optional sint64 minimum = 1;</code>
		 */
		long getMinimum();

		// optional sint64 maximum = 2;
		/**
		 * <code>optional sint64 maximum = 2;</code>
		 */
		boolean hasMaximum();

		/**
		 * <code>optional sint64 maximum = 2;</code>
		 */
		long getMaximum();

		// optional sint64 sum = 3;
		/**
		 * <code>optional sint64 sum = 3;</code>
		 */
		boolean hasSum();

		/**
		 * <code>optional sint64 sum = 3;</code>
		 */
		long getSum();
	}

	/**
	 * Protobuf type {@code IntegerStatistics}
	 */
	public static final class IntegerStatistics extends com.google.protobuf.GeneratedMessage implements
			IntegerStatisticsOrBuilder {
		// Use IntegerStatistics.newBuilder() to construct.
		private IntegerStatistics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private IntegerStatistics(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final IntegerStatistics defaultInstance;

		public static IntegerStatistics getDefaultInstance() {
			return defaultInstance;
		}

		public IntegerStatistics getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private IntegerStatistics(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 8: {
						bitField0_ |= 0x00000001;
						minimum_ = input.readSInt64();
						break;
					}
					case 16: {
						bitField0_ |= 0x00000002;
						maximum_ = input.readSInt64();
						break;
					}
					case 24: {
						bitField0_ |= 0x00000004;
						sum_ = input.readSInt64();
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
			} finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_IntegerStatistics_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_IntegerStatistics_fieldAccessorTable
					.ensureFieldAccessorsInitialized(OrcProto.IntegerStatistics.class,
							OrcProto.IntegerStatistics.Builder.class);
		}

		public static com.google.protobuf.Parser<IntegerStatistics> PARSER = new com.google.protobuf.AbstractParser<IntegerStatistics>() {
			public IntegerStatistics parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new IntegerStatistics(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<IntegerStatistics> getParserForType() {
			return PARSER;
		}

		private int bitField0_;
		// optional sint64 minimum = 1;
		public static final int MINIMUM_FIELD_NUMBER = 1;
		private long minimum_;

		/**
		 * <code>optional sint64 minimum = 1;</code>
		 */
		public boolean hasMinimum() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>optional sint64 minimum = 1;</code>
		 */
		public long getMinimum() {
			return minimum_;
		}

		// optional sint64 maximum = 2;
		public static final int MAXIMUM_FIELD_NUMBER = 2;
		private long maximum_;

		/**
		 * <code>optional sint64 maximum = 2;</code>
		 */
		public boolean hasMaximum() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>optional sint64 maximum = 2;</code>
		 */
		public long getMaximum() {
			return maximum_;
		}

		// optional sint64 sum = 3;
		public static final int SUM_FIELD_NUMBER = 3;
		private long sum_;

		/**
		 * <code>optional sint64 sum = 3;</code>
		 */
		public boolean hasSum() {
			return ((bitField0_ & 0x00000004) == 0x00000004);
		}

		/**
		 * <code>optional sint64 sum = 3;</code>
		 */
		public long getSum() {
			return sum_;
		}

		private void initFields() {
			minimum_ = 0L;
			maximum_ = 0L;
			sum_ = 0L;
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeSInt64(1, minimum_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeSInt64(2, maximum_);
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				output.writeSInt64(3, sum_);
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream.computeSInt64Size(1, minimum_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream.computeSInt64Size(2, maximum_);
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				size += com.google.protobuf.CodedOutputStream.computeSInt64Size(3, sum_);
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static OrcProto.IntegerStatistics parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.IntegerStatistics parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.IntegerStatistics parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.IntegerStatistics parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.IntegerStatistics parseFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.IntegerStatistics parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static OrcProto.IntegerStatistics parseDelimitedFrom(java.io.InputStream input)
				throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static OrcProto.IntegerStatistics parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static OrcProto.IntegerStatistics parseFrom(com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.IntegerStatistics parseFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(OrcProto.IntegerStatistics prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code IntegerStatistics}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				OrcProto.IntegerStatisticsOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_IntegerStatistics_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_IntegerStatistics_fieldAccessorTable
						.ensureFieldAccessorsInitialized(OrcProto.IntegerStatistics.class,
								OrcProto.IntegerStatistics.Builder.class);
			}

			// Construct using OrcProto.IntegerStatistics.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				minimum_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000001);
				maximum_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000002);
				sum_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000004);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_IntegerStatistics_descriptor;
			}

			public OrcProto.IntegerStatistics getDefaultInstanceForType() {
				return OrcProto.IntegerStatistics.getDefaultInstance();
			}

			public OrcProto.IntegerStatistics build() {
				OrcProto.IntegerStatistics result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public OrcProto.IntegerStatistics buildPartial() {
				OrcProto.IntegerStatistics result = new OrcProto.IntegerStatistics(this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.minimum_ = minimum_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				result.maximum_ = maximum_;
				if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
					to_bitField0_ |= 0x00000004;
				}
				result.sum_ = sum_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof OrcProto.IntegerStatistics) {
					return mergeFrom((OrcProto.IntegerStatistics) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(OrcProto.IntegerStatistics other) {
				if (other == OrcProto.IntegerStatistics.getDefaultInstance())
					return this;
				if (other.hasMinimum()) {
					setMinimum(other.getMinimum());
				}
				if (other.hasMaximum()) {
					setMaximum(other.getMaximum());
				}
				if (other.hasSum()) {
					setSum(other.getSum());
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				OrcProto.IntegerStatistics parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (OrcProto.IntegerStatistics) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			// optional sint64 minimum = 1;
			private long minimum_;

			/**
			 * <code>optional sint64 minimum = 1;</code>
			 */
			public boolean hasMinimum() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <code>optional sint64 minimum = 1;</code>
			 */
			public long getMinimum() {
				return minimum_;
			}

			/**
			 * <code>optional sint64 minimum = 1;</code>
			 */
			public Builder setMinimum(long value) {
				bitField0_ |= 0x00000001;
				minimum_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional sint64 minimum = 1;</code>
			 */
			public Builder clearMinimum() {
				bitField0_ = (bitField0_ & ~0x00000001);
				minimum_ = 0L;
				onChanged();
				return this;
			}

			// optional sint64 maximum = 2;
			private long maximum_;

			/**
			 * <code>optional sint64 maximum = 2;</code>
			 */
			public boolean hasMaximum() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			/**
			 * <code>optional sint64 maximum = 2;</code>
			 */
			public long getMaximum() {
				return maximum_;
			}

			/**
			 * <code>optional sint64 maximum = 2;</code>
			 */
			public Builder setMaximum(long value) {
				bitField0_ |= 0x00000002;
				maximum_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional sint64 maximum = 2;</code>
			 */
			public Builder clearMaximum() {
				bitField0_ = (bitField0_ & ~0x00000002);
				maximum_ = 0L;
				onChanged();
				return this;
			}

			// optional sint64 sum = 3;
			private long sum_;

			/**
			 * <code>optional sint64 sum = 3;</code>
			 */
			public boolean hasSum() {
				return ((bitField0_ & 0x00000004) == 0x00000004);
			}

			/**
			 * <code>optional sint64 sum = 3;</code>
			 */
			public long getSum() {
				return sum_;
			}

			/**
			 * <code>optional sint64 sum = 3;</code>
			 */
			public Builder setSum(long value) {
				bitField0_ |= 0x00000004;
				sum_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional sint64 sum = 3;</code>
			 */
			public Builder clearSum() {
				bitField0_ = (bitField0_ & ~0x00000004);
				sum_ = 0L;
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:IntegerStatistics)
		}

		static {
			defaultInstance = new IntegerStatistics(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:IntegerStatistics)
	}

	public interface DoubleStatisticsOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// optional double minimum = 1;
		/**
		 * <code>optional double minimum = 1;</code>
		 */
		boolean hasMinimum();

		/**
		 * <code>optional double minimum = 1;</code>
		 */
		double getMinimum();

		// optional double maximum = 2;
		/**
		 * <code>optional double maximum = 2;</code>
		 */
		boolean hasMaximum();

		/**
		 * <code>optional double maximum = 2;</code>
		 */
		double getMaximum();

		// optional double sum = 3;
		/**
		 * <code>optional double sum = 3;</code>
		 */
		boolean hasSum();

		/**
		 * <code>optional double sum = 3;</code>
		 */
		double getSum();
	}

	/**
	 * Protobuf type {@code DoubleStatistics}
	 */
	public static final class DoubleStatistics extends com.google.protobuf.GeneratedMessage implements
			DoubleStatisticsOrBuilder {
		// Use DoubleStatistics.newBuilder() to construct.
		private DoubleStatistics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private DoubleStatistics(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final DoubleStatistics defaultInstance;

		public static DoubleStatistics getDefaultInstance() {
			return defaultInstance;
		}

		public DoubleStatistics getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private DoubleStatistics(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 9: {
						bitField0_ |= 0x00000001;
						minimum_ = input.readDouble();
						break;
					}
					case 17: {
						bitField0_ |= 0x00000002;
						maximum_ = input.readDouble();
						break;
					}
					case 25: {
						bitField0_ |= 0x00000004;
						sum_ = input.readDouble();
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
			} finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_DoubleStatistics_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_DoubleStatistics_fieldAccessorTable
					.ensureFieldAccessorsInitialized(OrcProto.DoubleStatistics.class,
							OrcProto.DoubleStatistics.Builder.class);
		}

		public static com.google.protobuf.Parser<DoubleStatistics> PARSER = new com.google.protobuf.AbstractParser<DoubleStatistics>() {
			public DoubleStatistics parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new DoubleStatistics(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<DoubleStatistics> getParserForType() {
			return PARSER;
		}

		private int bitField0_;
		// optional double minimum = 1;
		public static final int MINIMUM_FIELD_NUMBER = 1;
		private double minimum_;

		/**
		 * <code>optional double minimum = 1;</code>
		 */
		public boolean hasMinimum() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>optional double minimum = 1;</code>
		 */
		public double getMinimum() {
			return minimum_;
		}

		// optional double maximum = 2;
		public static final int MAXIMUM_FIELD_NUMBER = 2;
		private double maximum_;

		/**
		 * <code>optional double maximum = 2;</code>
		 */
		public boolean hasMaximum() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>optional double maximum = 2;</code>
		 */
		public double getMaximum() {
			return maximum_;
		}

		// optional double sum = 3;
		public static final int SUM_FIELD_NUMBER = 3;
		private double sum_;

		/**
		 * <code>optional double sum = 3;</code>
		 */
		public boolean hasSum() {
			return ((bitField0_ & 0x00000004) == 0x00000004);
		}

		/**
		 * <code>optional double sum = 3;</code>
		 */
		public double getSum() {
			return sum_;
		}

		private void initFields() {
			minimum_ = 0D;
			maximum_ = 0D;
			sum_ = 0D;
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeDouble(1, minimum_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeDouble(2, maximum_);
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				output.writeDouble(3, sum_);
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, minimum_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, maximum_);
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				size += com.google.protobuf.CodedOutputStream.computeDoubleSize(3, sum_);
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static OrcProto.DoubleStatistics parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.DoubleStatistics parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.DoubleStatistics parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.DoubleStatistics parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.DoubleStatistics parseFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.DoubleStatistics parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static OrcProto.DoubleStatistics parseDelimitedFrom(java.io.InputStream input)
				throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static OrcProto.DoubleStatistics parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static OrcProto.DoubleStatistics parseFrom(com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.DoubleStatistics parseFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(OrcProto.DoubleStatistics prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code DoubleStatistics}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				OrcProto.DoubleStatisticsOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_DoubleStatistics_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_DoubleStatistics_fieldAccessorTable
						.ensureFieldAccessorsInitialized(OrcProto.DoubleStatistics.class,
								OrcProto.DoubleStatistics.Builder.class);
			}

			// Construct using OrcProto.DoubleStatistics.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				minimum_ = 0D;
				bitField0_ = (bitField0_ & ~0x00000001);
				maximum_ = 0D;
				bitField0_ = (bitField0_ & ~0x00000002);
				sum_ = 0D;
				bitField0_ = (bitField0_ & ~0x00000004);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_DoubleStatistics_descriptor;
			}

			public OrcProto.DoubleStatistics getDefaultInstanceForType() {
				return OrcProto.DoubleStatistics.getDefaultInstance();
			}

			public OrcProto.DoubleStatistics build() {
				OrcProto.DoubleStatistics result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public OrcProto.DoubleStatistics buildPartial() {
				OrcProto.DoubleStatistics result = new OrcProto.DoubleStatistics(this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.minimum_ = minimum_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				result.maximum_ = maximum_;
				if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
					to_bitField0_ |= 0x00000004;
				}
				result.sum_ = sum_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof OrcProto.DoubleStatistics) {
					return mergeFrom((OrcProto.DoubleStatistics) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(OrcProto.DoubleStatistics other) {
				if (other == OrcProto.DoubleStatistics.getDefaultInstance())
					return this;
				if (other.hasMinimum()) {
					setMinimum(other.getMinimum());
				}
				if (other.hasMaximum()) {
					setMaximum(other.getMaximum());
				}
				if (other.hasSum()) {
					setSum(other.getSum());
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				OrcProto.DoubleStatistics parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (OrcProto.DoubleStatistics) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			// optional double minimum = 1;
			private double minimum_;

			/**
			 * <code>optional double minimum = 1;</code>
			 */
			public boolean hasMinimum() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <code>optional double minimum = 1;</code>
			 */
			public double getMinimum() {
				return minimum_;
			}

			/**
			 * <code>optional double minimum = 1;</code>
			 */
			public Builder setMinimum(double value) {
				bitField0_ |= 0x00000001;
				minimum_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional double minimum = 1;</code>
			 */
			public Builder clearMinimum() {
				bitField0_ = (bitField0_ & ~0x00000001);
				minimum_ = 0D;
				onChanged();
				return this;
			}

			// optional double maximum = 2;
			private double maximum_;

			/**
			 * <code>optional double maximum = 2;</code>
			 */
			public boolean hasMaximum() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			/**
			 * <code>optional double maximum = 2;</code>
			 */
			public double getMaximum() {
				return maximum_;
			}

			/**
			 * <code>optional double maximum = 2;</code>
			 */
			public Builder setMaximum(double value) {
				bitField0_ |= 0x00000002;
				maximum_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional double maximum = 2;</code>
			 */
			public Builder clearMaximum() {
				bitField0_ = (bitField0_ & ~0x00000002);
				maximum_ = 0D;
				onChanged();
				return this;
			}

			// optional double sum = 3;
			private double sum_;

			/**
			 * <code>optional double sum = 3;</code>
			 */
			public boolean hasSum() {
				return ((bitField0_ & 0x00000004) == 0x00000004);
			}

			/**
			 * <code>optional double sum = 3;</code>
			 */
			public double getSum() {
				return sum_;
			}

			/**
			 * <code>optional double sum = 3;</code>
			 */
			public Builder setSum(double value) {
				bitField0_ |= 0x00000004;
				sum_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional double sum = 3;</code>
			 */
			public Builder clearSum() {
				bitField0_ = (bitField0_ & ~0x00000004);
				sum_ = 0D;
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:DoubleStatistics)
		}

		static {
			defaultInstance = new DoubleStatistics(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:DoubleStatistics)
	}

	public interface StringStatisticsOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// optional string minimum = 1;
		/**
		 * <code>optional string minimum = 1;</code>
		 */
		boolean hasMinimum();

		/**
		 * <code>optional string minimum = 1;</code>
		 */
		java.lang.String getMinimum();

		/**
		 * <code>optional string minimum = 1;</code>
		 */
		com.google.protobuf.ByteString getMinimumBytes();

		// optional string maximum = 2;
		/**
		 * <code>optional string maximum = 2;</code>
		 */
		boolean hasMaximum();

		/**
		 * <code>optional string maximum = 2;</code>
		 */
		java.lang.String getMaximum();

		/**
		 * <code>optional string maximum = 2;</code>
		 */
		com.google.protobuf.ByteString getMaximumBytes();

		// optional sint64 sum = 3;
		/**
		 * <code>optional sint64 sum = 3;</code>
		 * 
		 * <pre>
		 * sum will store the total length of all strings in a stripe
		 * </pre>
		 */
		boolean hasSum();

		/**
		 * <code>optional sint64 sum = 3;</code>
		 * 
		 * <pre>
		 * sum will store the total length of all strings in a stripe
		 * </pre>
		 */
		long getSum();
	}

	/**
	 * Protobuf type {@code StringStatistics}
	 */
	public static final class StringStatistics extends com.google.protobuf.GeneratedMessage implements
			StringStatisticsOrBuilder {
		// Use StringStatistics.newBuilder() to construct.
		private StringStatistics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private StringStatistics(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final StringStatistics defaultInstance;

		public static StringStatistics getDefaultInstance() {
			return defaultInstance;
		}

		public StringStatistics getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private StringStatistics(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();

			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 10: {
						bitField0_ |= 0x00000001;
						minimum_ = input.readBytes();
						break;
					}
					case 18: {
						bitField0_ |= 0x00000002;
						maximum_ = input.readBytes();
						break;
					}
					case 24: {
						bitField0_ |= 0x00000004;
						sum_ = input.readSInt64();
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
			} finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_StringStatistics_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_StringStatistics_fieldAccessorTable
					.ensureFieldAccessorsInitialized(OrcProto.StringStatistics.class,
							OrcProto.StringStatistics.Builder.class);
		}

		public static com.google.protobuf.Parser<StringStatistics> PARSER = new com.google.protobuf.AbstractParser<StringStatistics>() {
			public StringStatistics parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new StringStatistics(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<StringStatistics> getParserForType() {
			return PARSER;
		}

		private int bitField0_;
		// optional string minimum = 1;
		public static final int MINIMUM_FIELD_NUMBER = 1;
		private java.lang.Object minimum_;

		/**
		 * <code>optional string minimum = 1;</code>
		 */
		public boolean hasMinimum() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>optional string minimum = 1;</code>
		 */
		public java.lang.String getMinimum() {
			java.lang.Object ref = minimum_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				if (bs.isValidUtf8()) {
					minimum_ = s;
				}
				return s;
			}
		}

		/**
		 * <code>optional string minimum = 1;</code>
		 */
		public com.google.protobuf.ByteString getMinimumBytes() {
			java.lang.Object ref = minimum_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				minimum_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		// optional string maximum = 2;
		public static final int MAXIMUM_FIELD_NUMBER = 2;
		private java.lang.Object maximum_;

		/**
		 * <code>optional string maximum = 2;</code>
		 */
		public boolean hasMaximum() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>optional string maximum = 2;</code>
		 */
		public java.lang.String getMaximum() {
			java.lang.Object ref = maximum_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				if (bs.isValidUtf8()) {
					maximum_ = s;
				}
				return s;
			}
		}

		/**
		 * <code>optional string maximum = 2;</code>
		 */
		public com.google.protobuf.ByteString getMaximumBytes() {
			java.lang.Object ref = maximum_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				maximum_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		// optional sint64 sum = 3;
		public static final int SUM_FIELD_NUMBER = 3;
		private long sum_;

		/**
		 * <code>optional sint64 sum = 3;</code>
		 * 
		 * <pre>
		 * sum will store the total length of all strings in a stripe
		 * </pre>
		 */
		public boolean hasSum() {
			return ((bitField0_ & 0x00000004) == 0x00000004);
		}

		/**
		 * <code>optional sint64 sum = 3;</code>
		 * 
		 * <pre>
		 * sum will store the total length of all strings in a stripe
		 * </pre>
		 */
		public long getSum() {
			return sum_;
		}

		private void initFields() {
			minimum_ = "";
			maximum_ = "";
			sum_ = 0L;
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeBytes(1, getMinimumBytes());
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeBytes(2, getMaximumBytes());
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				output.writeSInt64(3, sum_);
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, getMinimumBytes());
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, getMaximumBytes());
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				size += com.google.protobuf.CodedOutputStream.computeSInt64Size(3, sum_);
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static OrcProto.StringStatistics parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.StringStatistics parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.StringStatistics parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.StringStatistics parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.StringStatistics parseFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.StringStatistics parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static OrcProto.StringStatistics parseDelimitedFrom(java.io.InputStream input)
				throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static OrcProto.StringStatistics parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static OrcProto.StringStatistics parseFrom(com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.StringStatistics parseFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(OrcProto.StringStatistics prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code StringStatistics}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				OrcProto.StringStatisticsOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_StringStatistics_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_StringStatistics_fieldAccessorTable
						.ensureFieldAccessorsInitialized(OrcProto.StringStatistics.class,
								OrcProto.StringStatistics.Builder.class);
			}

			// Construct using OrcProto.StringStatistics.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				minimum_ = "";
				bitField0_ = (bitField0_ & ~0x00000001);
				maximum_ = "";
				bitField0_ = (bitField0_ & ~0x00000002);
				sum_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000004);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_StringStatistics_descriptor;
			}

			public OrcProto.StringStatistics getDefaultInstanceForType() {
				return OrcProto.StringStatistics.getDefaultInstance();
			}

			public OrcProto.StringStatistics build() {
				OrcProto.StringStatistics result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public OrcProto.StringStatistics buildPartial() {
				OrcProto.StringStatistics result = new OrcProto.StringStatistics(this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.minimum_ = minimum_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				result.maximum_ = maximum_;
				if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
					to_bitField0_ |= 0x00000004;
				}
				result.sum_ = sum_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof OrcProto.StringStatistics) {
					return mergeFrom((OrcProto.StringStatistics) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(OrcProto.StringStatistics other) {
				if (other == OrcProto.StringStatistics.getDefaultInstance())
					return this;
				if (other.hasMinimum()) {
					bitField0_ |= 0x00000001;
					minimum_ = other.minimum_;
					onChanged();
				}
				if (other.hasMaximum()) {
					bitField0_ |= 0x00000002;
					maximum_ = other.maximum_;
					onChanged();
				}
				if (other.hasSum()) {
					setSum(other.getSum());
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				OrcProto.StringStatistics parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (OrcProto.StringStatistics) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			// optional string minimum = 1;
			private java.lang.Object minimum_ = "";

			/**
			 * <code>optional string minimum = 1;</code>
			 */
			public boolean hasMinimum() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <code>optional string minimum = 1;</code>
			 */
			public java.lang.String getMinimum() {
				java.lang.Object ref = minimum_;
				if (!(ref instanceof java.lang.String)) {
					java.lang.String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
					minimum_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <code>optional string minimum = 1;</code>
			 */
			public com.google.protobuf.ByteString getMinimumBytes() {
				java.lang.Object ref = minimum_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					minimum_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>optional string minimum = 1;</code>
			 */
			public Builder setMinimum(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000001;
				minimum_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional string minimum = 1;</code>
			 */
			public Builder clearMinimum() {
				bitField0_ = (bitField0_ & ~0x00000001);
				minimum_ = getDefaultInstance().getMinimum();
				onChanged();
				return this;
			}

			/**
			 * <code>optional string minimum = 1;</code>
			 */
			public Builder setMinimumBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000001;
				minimum_ = value;
				onChanged();
				return this;
			}

			// optional string maximum = 2;
			private java.lang.Object maximum_ = "";

			/**
			 * <code>optional string maximum = 2;</code>
			 */
			public boolean hasMaximum() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			/**
			 * <code>optional string maximum = 2;</code>
			 */
			public java.lang.String getMaximum() {
				java.lang.Object ref = maximum_;
				if (!(ref instanceof java.lang.String)) {
					java.lang.String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
					maximum_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <code>optional string maximum = 2;</code>
			 */
			public com.google.protobuf.ByteString getMaximumBytes() {
				java.lang.Object ref = maximum_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					maximum_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>optional string maximum = 2;</code>
			 */
			public Builder setMaximum(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000002;
				maximum_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional string maximum = 2;</code>
			 */
			public Builder clearMaximum() {
				bitField0_ = (bitField0_ & ~0x00000002);
				maximum_ = getDefaultInstance().getMaximum();
				onChanged();
				return this;
			}

			/**
			 * <code>optional string maximum = 2;</code>
			 */
			public Builder setMaximumBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000002;
				maximum_ = value;
				onChanged();
				return this;
			}

			// optional sint64 sum = 3;
			private long sum_;

			/**
			 * <code>optional sint64 sum = 3;</code>
			 * 
			 * <pre>
			 * sum will store the total length of all strings in a stripe
			 * </pre>
			 */
			public boolean hasSum() {
				return ((bitField0_ & 0x00000004) == 0x00000004);
			}

			/**
			 * <code>optional sint64 sum = 3;</code>
			 * 
			 * <pre>
			 * sum will store the total length of all strings in a stripe
			 * </pre>
			 */
			public long getSum() {
				return sum_;
			}

			/**
			 * <code>optional sint64 sum = 3;</code>
			 * 
			 * <pre>
			 * sum will store the total length of all strings in a stripe
			 * </pre>
			 */
			public Builder setSum(long value) {
				bitField0_ |= 0x00000004;
				sum_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional sint64 sum = 3;</code>
			 * 
			 * <pre>
			 * sum will store the total length of all strings in a stripe
			 * </pre>
			 */
			public Builder clearSum() {
				bitField0_ = (bitField0_ & ~0x00000004);
				sum_ = 0L;
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:StringStatistics)
		}

		static {
			defaultInstance = new StringStatistics(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:StringStatistics)
	}

	public interface BucketStatisticsOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// repeated uint64 count = 1 [packed = true];
		/**
		 * <code>repeated uint64 count = 1 [packed = true];</code>
		 */
		java.util.List<java.lang.Long> getCountList();

		/**
		 * <code>repeated uint64 count = 1 [packed = true];</code>
		 */
		int getCountCount();

		/**
		 * <code>repeated uint64 count = 1 [packed = true];</code>
		 */
		long getCount(int index);
	}

	/**
	 * Protobuf type {@code BucketStatistics}
	 */
	public static final class BucketStatistics extends com.google.protobuf.GeneratedMessage implements
			BucketStatisticsOrBuilder {
		// Use BucketStatistics.newBuilder() to construct.
		private BucketStatistics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private BucketStatistics(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final BucketStatistics defaultInstance;

		public static BucketStatistics getDefaultInstance() {
			return defaultInstance;
		}

		public BucketStatistics getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private BucketStatistics(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			int mutable_bitField0_ = 0;
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 8: {
						if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
							count_ = new java.util.ArrayList<java.lang.Long>();
							mutable_bitField0_ |= 0x00000001;
						}
						count_.add(input.readUInt64());
						break;
					}
					case 10: {
						int length = input.readRawVarint32();
						int limit = input.pushLimit(length);
						if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
							count_ = new java.util.ArrayList<java.lang.Long>();
							mutable_bitField0_ |= 0x00000001;
						}
						while (input.getBytesUntilLimit() > 0) {
							count_.add(input.readUInt64());
						}
						input.popLimit(limit);
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
			} finally {
				if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
					count_ = java.util.Collections.unmodifiableList(count_);
				}
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_BucketStatistics_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_BucketStatistics_fieldAccessorTable
					.ensureFieldAccessorsInitialized(OrcProto.BucketStatistics.class,
							OrcProto.BucketStatistics.Builder.class);
		}

		public static com.google.protobuf.Parser<BucketStatistics> PARSER = new com.google.protobuf.AbstractParser<BucketStatistics>() {
			public BucketStatistics parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new BucketStatistics(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<BucketStatistics> getParserForType() {
			return PARSER;
		}

		// repeated uint64 count = 1 [packed = true];
		public static final int COUNT_FIELD_NUMBER = 1;
		private java.util.List<java.lang.Long> count_;

		/**
		 * <code>repeated uint64 count = 1 [packed = true];</code>
		 */
		public java.util.List<java.lang.Long> getCountList() {
			return count_;
		}

		/**
		 * <code>repeated uint64 count = 1 [packed = true];</code>
		 */
		public int getCountCount() {
			return count_.size();
		}

		/**
		 * <code>repeated uint64 count = 1 [packed = true];</code>
		 */
		public long getCount(int index) {
			return count_.get(index);
		}

		private int countMemoizedSerializedSize = -1;

		private void initFields() {
			count_ = java.util.Collections.emptyList();
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			if (getCountList().size() > 0) {
				output.writeRawVarint32(10);
				output.writeRawVarint32(countMemoizedSerializedSize);
			}
			for (int i = 0; i < count_.size(); i++) {
				output.writeUInt64NoTag(count_.get(i));
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			{
				int dataSize = 0;
				for (int i = 0; i < count_.size(); i++) {
					dataSize += com.google.protobuf.CodedOutputStream.computeUInt64SizeNoTag(count_.get(i));
				}
				size += dataSize;
				if (!getCountList().isEmpty()) {
					size += 1;
					size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
				}
				countMemoizedSerializedSize = dataSize;
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static OrcProto.BucketStatistics parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.BucketStatistics parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.BucketStatistics parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.BucketStatistics parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.BucketStatistics parseFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.BucketStatistics parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static OrcProto.BucketStatistics parseDelimitedFrom(java.io.InputStream input)
				throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static OrcProto.BucketStatistics parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static OrcProto.BucketStatistics parseFrom(com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.BucketStatistics parseFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(OrcProto.BucketStatistics prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code BucketStatistics}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				OrcProto.BucketStatisticsOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_BucketStatistics_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_BucketStatistics_fieldAccessorTable
						.ensureFieldAccessorsInitialized(OrcProto.BucketStatistics.class,
								OrcProto.BucketStatistics.Builder.class);
			}

			// Construct using OrcProto.BucketStatistics.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				count_ = java.util.Collections.emptyList();
				bitField0_ = (bitField0_ & ~0x00000001);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_BucketStatistics_descriptor;
			}

			public OrcProto.BucketStatistics getDefaultInstanceForType() {
				return OrcProto.BucketStatistics.getDefaultInstance();
			}

			public OrcProto.BucketStatistics build() {
				OrcProto.BucketStatistics result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public OrcProto.BucketStatistics buildPartial() {
				OrcProto.BucketStatistics result = new OrcProto.BucketStatistics(this);
				if (((bitField0_ & 0x00000001) == 0x00000001)) {
					count_ = java.util.Collections.unmodifiableList(count_);
					bitField0_ = (bitField0_ & ~0x00000001);
				}
				result.count_ = count_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof OrcProto.BucketStatistics) {
					return mergeFrom((OrcProto.BucketStatistics) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(OrcProto.BucketStatistics other) {
				if (other == OrcProto.BucketStatistics.getDefaultInstance())
					return this;
				if (!other.count_.isEmpty()) {
					if (count_.isEmpty()) {
						count_ = other.count_;
						bitField0_ = (bitField0_ & ~0x00000001);
					} else {
						ensureCountIsMutable();
						count_.addAll(other.count_);
					}
					onChanged();
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				OrcProto.BucketStatistics parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (OrcProto.BucketStatistics) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			// repeated uint64 count = 1 [packed = true];
			private java.util.List<java.lang.Long> count_ = java.util.Collections.emptyList();

			private void ensureCountIsMutable() {
				if (!((bitField0_ & 0x00000001) == 0x00000001)) {
					count_ = new java.util.ArrayList<java.lang.Long>(count_);
					bitField0_ |= 0x00000001;
				}
			}

			/**
			 * <code>repeated uint64 count = 1 [packed = true];</code>
			 */
			public java.util.List<java.lang.Long> getCountList() {
				return java.util.Collections.unmodifiableList(count_);
			}

			/**
			 * <code>repeated uint64 count = 1 [packed = true];</code>
			 */
			public int getCountCount() {
				return count_.size();
			}

			/**
			 * <code>repeated uint64 count = 1 [packed = true];</code>
			 */
			public long getCount(int index) {
				return count_.get(index);
			}

			/**
			 * <code>repeated uint64 count = 1 [packed = true];</code>
			 */
			public Builder setCount(int index, long value) {
				ensureCountIsMutable();
				count_.set(index, value);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated uint64 count = 1 [packed = true];</code>
			 */
			public Builder addCount(long value) {
				ensureCountIsMutable();
				count_.add(value);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated uint64 count = 1 [packed = true];</code>
			 */
			public Builder addAllCount(java.lang.Iterable<? extends java.lang.Long> values) {
				ensureCountIsMutable();
				super.addAll(values, count_);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated uint64 count = 1 [packed = true];</code>
			 */
			public Builder clearCount() {
				count_ = java.util.Collections.emptyList();
				bitField0_ = (bitField0_ & ~0x00000001);
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:BucketStatistics)
		}

		static {
			defaultInstance = new BucketStatistics(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:BucketStatistics)
	}

	public interface DecimalStatisticsOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// optional string minimum = 1;
		/**
		 * <code>optional string minimum = 1;</code>
		 */
		boolean hasMinimum();

		/**
		 * <code>optional string minimum = 1;</code>
		 */
		java.lang.String getMinimum();

		/**
		 * <code>optional string minimum = 1;</code>
		 */
		com.google.protobuf.ByteString getMinimumBytes();

		// optional string maximum = 2;
		/**
		 * <code>optional string maximum = 2;</code>
		 */
		boolean hasMaximum();

		/**
		 * <code>optional string maximum = 2;</code>
		 */
		java.lang.String getMaximum();

		/**
		 * <code>optional string maximum = 2;</code>
		 */
		com.google.protobuf.ByteString getMaximumBytes();

		// optional string sum = 3;
		/**
		 * <code>optional string sum = 3;</code>
		 */
		boolean hasSum();

		/**
		 * <code>optional string sum = 3;</code>
		 */
		java.lang.String getSum();

		/**
		 * <code>optional string sum = 3;</code>
		 */
		com.google.protobuf.ByteString getSumBytes();
	}

	/**
	 * Protobuf type {@code DecimalStatistics}
	 */
	public static final class DecimalStatistics extends com.google.protobuf.GeneratedMessage implements
			DecimalStatisticsOrBuilder {
		// Use DecimalStatistics.newBuilder() to construct.
		private DecimalStatistics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private DecimalStatistics(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final DecimalStatistics defaultInstance;

		public static DecimalStatistics getDefaultInstance() {
			return defaultInstance;
		}

		public DecimalStatistics getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private DecimalStatistics(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 10: {
						bitField0_ |= 0x00000001;
						minimum_ = input.readBytes();
						break;
					}
					case 18: {
						bitField0_ |= 0x00000002;
						maximum_ = input.readBytes();
						break;
					}
					case 26: {
						bitField0_ |= 0x00000004;
						sum_ = input.readBytes();
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
			} finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_DecimalStatistics_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_DecimalStatistics_fieldAccessorTable
					.ensureFieldAccessorsInitialized(OrcProto.DecimalStatistics.class,
							OrcProto.DecimalStatistics.Builder.class);
		}

		public static com.google.protobuf.Parser<DecimalStatistics> PARSER = new com.google.protobuf.AbstractParser<DecimalStatistics>() {
			public DecimalStatistics parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new DecimalStatistics(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<DecimalStatistics> getParserForType() {
			return PARSER;
		}

		private int bitField0_;
		// optional string minimum = 1;
		public static final int MINIMUM_FIELD_NUMBER = 1;
		private java.lang.Object minimum_;

		/**
		 * <code>optional string minimum = 1;</code>
		 */
		public boolean hasMinimum() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>optional string minimum = 1;</code>
		 */
		public java.lang.String getMinimum() {
			java.lang.Object ref = minimum_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				if (bs.isValidUtf8()) {
					minimum_ = s;
				}
				return s;
			}
		}

		/**
		 * <code>optional string minimum = 1;</code>
		 */
		public com.google.protobuf.ByteString getMinimumBytes() {
			java.lang.Object ref = minimum_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				minimum_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		// optional string maximum = 2;
		public static final int MAXIMUM_FIELD_NUMBER = 2;
		private java.lang.Object maximum_;

		/**
		 * <code>optional string maximum = 2;</code>
		 */
		public boolean hasMaximum() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>optional string maximum = 2;</code>
		 */
		public java.lang.String getMaximum() {
			java.lang.Object ref = maximum_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				if (bs.isValidUtf8()) {
					maximum_ = s;
				}
				return s;
			}
		}

		/**
		 * <code>optional string maximum = 2;</code>
		 */
		public com.google.protobuf.ByteString getMaximumBytes() {
			java.lang.Object ref = maximum_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				maximum_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		// optional string sum = 3;
		public static final int SUM_FIELD_NUMBER = 3;
		private java.lang.Object sum_;

		/**
		 * <code>optional string sum = 3;</code>
		 */
		public boolean hasSum() {
			return ((bitField0_ & 0x00000004) == 0x00000004);
		}

		/**
		 * <code>optional string sum = 3;</code>
		 */
		public java.lang.String getSum() {
			java.lang.Object ref = sum_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				if (bs.isValidUtf8()) {
					sum_ = s;
				}
				return s;
			}
		}

		/**
		 * <code>optional string sum = 3;</code>
		 */
		public com.google.protobuf.ByteString getSumBytes() {
			java.lang.Object ref = sum_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				sum_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		private void initFields() {
			minimum_ = "";
			maximum_ = "";
			sum_ = "";
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeBytes(1, getMinimumBytes());
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeBytes(2, getMaximumBytes());
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				output.writeBytes(3, getSumBytes());
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, getMinimumBytes());
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, getMaximumBytes());
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				size += com.google.protobuf.CodedOutputStream.computeBytesSize(3, getSumBytes());
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static OrcProto.DecimalStatistics parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.DecimalStatistics parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.DecimalStatistics parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.DecimalStatistics parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.DecimalStatistics parseFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.DecimalStatistics parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static OrcProto.DecimalStatistics parseDelimitedFrom(java.io.InputStream input)
				throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static OrcProto.DecimalStatistics parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static OrcProto.DecimalStatistics parseFrom(com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.DecimalStatistics parseFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(OrcProto.DecimalStatistics prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code DecimalStatistics}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				OrcProto.DecimalStatisticsOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_DecimalStatistics_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_DecimalStatistics_fieldAccessorTable
						.ensureFieldAccessorsInitialized(OrcProto.DecimalStatistics.class,
								OrcProto.DecimalStatistics.Builder.class);
			}

			// Construct using OrcProto.DecimalStatistics.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				minimum_ = "";
				bitField0_ = (bitField0_ & ~0x00000001);
				maximum_ = "";
				bitField0_ = (bitField0_ & ~0x00000002);
				sum_ = "";
				bitField0_ = (bitField0_ & ~0x00000004);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_DecimalStatistics_descriptor;
			}

			public OrcProto.DecimalStatistics getDefaultInstanceForType() {
				return OrcProto.DecimalStatistics.getDefaultInstance();
			}

			public OrcProto.DecimalStatistics build() {
				OrcProto.DecimalStatistics result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public OrcProto.DecimalStatistics buildPartial() {
				OrcProto.DecimalStatistics result = new OrcProto.DecimalStatistics(this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.minimum_ = minimum_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				result.maximum_ = maximum_;
				if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
					to_bitField0_ |= 0x00000004;
				}
				result.sum_ = sum_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof OrcProto.DecimalStatistics) {
					return mergeFrom((OrcProto.DecimalStatistics) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(OrcProto.DecimalStatistics other) {
				if (other == OrcProto.DecimalStatistics.getDefaultInstance())
					return this;
				if (other.hasMinimum()) {
					bitField0_ |= 0x00000001;
					minimum_ = other.minimum_;
					onChanged();
				}
				if (other.hasMaximum()) {
					bitField0_ |= 0x00000002;
					maximum_ = other.maximum_;
					onChanged();
				}
				if (other.hasSum()) {
					bitField0_ |= 0x00000004;
					sum_ = other.sum_;
					onChanged();
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				OrcProto.DecimalStatistics parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (OrcProto.DecimalStatistics) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			// optional string minimum = 1;
			private java.lang.Object minimum_ = "";

			/**
			 * <code>optional string minimum = 1;</code>
			 */
			public boolean hasMinimum() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <code>optional string minimum = 1;</code>
			 */
			public java.lang.String getMinimum() {
				java.lang.Object ref = minimum_;
				if (!(ref instanceof java.lang.String)) {
					java.lang.String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
					minimum_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <code>optional string minimum = 1;</code>
			 */
			public com.google.protobuf.ByteString getMinimumBytes() {
				java.lang.Object ref = minimum_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					minimum_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>optional string minimum = 1;</code>
			 */
			public Builder setMinimum(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000001;
				minimum_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional string minimum = 1;</code>
			 */
			public Builder clearMinimum() {
				bitField0_ = (bitField0_ & ~0x00000001);
				minimum_ = getDefaultInstance().getMinimum();
				onChanged();
				return this;
			}

			/**
			 * <code>optional string minimum = 1;</code>
			 */
			public Builder setMinimumBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000001;
				minimum_ = value;
				onChanged();
				return this;
			}

			// optional string maximum = 2;
			private java.lang.Object maximum_ = "";

			/**
			 * <code>optional string maximum = 2;</code>
			 */
			public boolean hasMaximum() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			/**
			 * <code>optional string maximum = 2;</code>
			 */
			public java.lang.String getMaximum() {
				java.lang.Object ref = maximum_;
				if (!(ref instanceof java.lang.String)) {
					java.lang.String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
					maximum_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <code>optional string maximum = 2;</code>
			 */
			public com.google.protobuf.ByteString getMaximumBytes() {
				java.lang.Object ref = maximum_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					maximum_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>optional string maximum = 2;</code>
			 */
			public Builder setMaximum(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000002;
				maximum_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional string maximum = 2;</code>
			 */
			public Builder clearMaximum() {
				bitField0_ = (bitField0_ & ~0x00000002);
				maximum_ = getDefaultInstance().getMaximum();
				onChanged();
				return this;
			}

			/**
			 * <code>optional string maximum = 2;</code>
			 */
			public Builder setMaximumBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000002;
				maximum_ = value;
				onChanged();
				return this;
			}

			// optional string sum = 3;
			private java.lang.Object sum_ = "";

			/**
			 * <code>optional string sum = 3;</code>
			 */
			public boolean hasSum() {
				return ((bitField0_ & 0x00000004) == 0x00000004);
			}

			/**
			 * <code>optional string sum = 3;</code>
			 */
			public java.lang.String getSum() {
				java.lang.Object ref = sum_;
				if (!(ref instanceof java.lang.String)) {
					java.lang.String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
					sum_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <code>optional string sum = 3;</code>
			 */
			public com.google.protobuf.ByteString getSumBytes() {
				java.lang.Object ref = sum_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					sum_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>optional string sum = 3;</code>
			 */
			public Builder setSum(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000004;
				sum_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional string sum = 3;</code>
			 */
			public Builder clearSum() {
				bitField0_ = (bitField0_ & ~0x00000004);
				sum_ = getDefaultInstance().getSum();
				onChanged();
				return this;
			}

			/**
			 * <code>optional string sum = 3;</code>
			 */
			public Builder setSumBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000004;
				sum_ = value;
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:DecimalStatistics)
		}

		static {
			defaultInstance = new DecimalStatistics(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:DecimalStatistics)
	}

	public interface DateStatisticsOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// optional sint32 minimum = 1;
		/**
		 * <code>optional sint32 minimum = 1;</code>
		 * 
		 * <pre>
		 * min,max values saved as days since epoch
		 * </pre>
		 */
		boolean hasMinimum();

		/**
		 * <code>optional sint32 minimum = 1;</code>
		 * 
		 * <pre>
		 * min,max values saved as days since epoch
		 * </pre>
		 */
		int getMinimum();

		// optional sint32 maximum = 2;
		/**
		 * <code>optional sint32 maximum = 2;</code>
		 */
		boolean hasMaximum();

		/**
		 * <code>optional sint32 maximum = 2;</code>
		 */
		int getMaximum();
	}

	/**
	 * Protobuf type {@code DateStatistics}
	 */
	public static final class DateStatistics extends com.google.protobuf.GeneratedMessage implements
			DateStatisticsOrBuilder {
		// Use DateStatistics.newBuilder() to construct.
		private DateStatistics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private DateStatistics(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final DateStatistics defaultInstance;

		public static DateStatistics getDefaultInstance() {
			return defaultInstance;
		}

		public DateStatistics getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private DateStatistics(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 8: {
						bitField0_ |= 0x00000001;
						minimum_ = input.readSInt32();
						break;
					}
					case 16: {
						bitField0_ |= 0x00000002;
						maximum_ = input.readSInt32();
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
			} finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_DateStatistics_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_DateStatistics_fieldAccessorTable
					.ensureFieldAccessorsInitialized(OrcProto.DateStatistics.class,
							OrcProto.DateStatistics.Builder.class);
		}

		public static com.google.protobuf.Parser<DateStatistics> PARSER = new com.google.protobuf.AbstractParser<DateStatistics>() {
			public DateStatistics parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new DateStatistics(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<DateStatistics> getParserForType() {
			return PARSER;
		}

		private int bitField0_;
		// optional sint32 minimum = 1;
		public static final int MINIMUM_FIELD_NUMBER = 1;
		private int minimum_;

		/**
		 * <code>optional sint32 minimum = 1;</code>
		 * 
		 * <pre>
		 * min,max values saved as days since epoch
		 * </pre>
		 */
		public boolean hasMinimum() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>optional sint32 minimum = 1;</code>
		 * 
		 * <pre>
		 * min,max values saved as days since epoch
		 * </pre>
		 */
		public int getMinimum() {
			return minimum_;
		}

		// optional sint32 maximum = 2;
		public static final int MAXIMUM_FIELD_NUMBER = 2;
		private int maximum_;

		/**
		 * <code>optional sint32 maximum = 2;</code>
		 */
		public boolean hasMaximum() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>optional sint32 maximum = 2;</code>
		 */
		public int getMaximum() {
			return maximum_;
		}

		private void initFields() {
			minimum_ = 0;
			maximum_ = 0;
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeSInt32(1, minimum_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeSInt32(2, maximum_);
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream.computeSInt32Size(1, minimum_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream.computeSInt32Size(2, maximum_);
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static OrcProto.DateStatistics parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.DateStatistics parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.DateStatistics parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.DateStatistics parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.DateStatistics parseFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.DateStatistics parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static OrcProto.DateStatistics parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static OrcProto.DateStatistics parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static OrcProto.DateStatistics parseFrom(com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.DateStatistics parseFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(OrcProto.DateStatistics prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code DateStatistics}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				OrcProto.DateStatisticsOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_DateStatistics_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_DateStatistics_fieldAccessorTable
						.ensureFieldAccessorsInitialized(OrcProto.DateStatistics.class,
								OrcProto.DateStatistics.Builder.class);
			}

			// Construct using OrcProto.DateStatistics.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				minimum_ = 0;
				bitField0_ = (bitField0_ & ~0x00000001);
				maximum_ = 0;
				bitField0_ = (bitField0_ & ~0x00000002);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_DateStatistics_descriptor;
			}

			public OrcProto.DateStatistics getDefaultInstanceForType() {
				return OrcProto.DateStatistics.getDefaultInstance();
			}

			public OrcProto.DateStatistics build() {
				OrcProto.DateStatistics result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public OrcProto.DateStatistics buildPartial() {
				OrcProto.DateStatistics result = new OrcProto.DateStatistics(this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.minimum_ = minimum_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				result.maximum_ = maximum_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof OrcProto.DateStatistics) {
					return mergeFrom((OrcProto.DateStatistics) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(OrcProto.DateStatistics other) {
				if (other == OrcProto.DateStatistics.getDefaultInstance())
					return this;
				if (other.hasMinimum()) {
					setMinimum(other.getMinimum());
				}
				if (other.hasMaximum()) {
					setMaximum(other.getMaximum());
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				OrcProto.DateStatistics parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (OrcProto.DateStatistics) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			// optional sint32 minimum = 1;
			private int minimum_;

			/**
			 * <code>optional sint32 minimum = 1;</code>
			 * 
			 * <pre>
			 * min,max values saved as days since epoch
			 * </pre>
			 */
			public boolean hasMinimum() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <code>optional sint32 minimum = 1;</code>
			 * 
			 * <pre>
			 * min,max values saved as days since epoch
			 * </pre>
			 */
			public int getMinimum() {
				return minimum_;
			}

			/**
			 * <code>optional sint32 minimum = 1;</code>
			 * 
			 * <pre>
			 * min,max values saved as days since epoch
			 * </pre>
			 */
			public Builder setMinimum(int value) {
				bitField0_ |= 0x00000001;
				minimum_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional sint32 minimum = 1;</code>
			 * 
			 * <pre>
			 * min,max values saved as days since epoch
			 * </pre>
			 */
			public Builder clearMinimum() {
				bitField0_ = (bitField0_ & ~0x00000001);
				minimum_ = 0;
				onChanged();
				return this;
			}

			// optional sint32 maximum = 2;
			private int maximum_;

			/**
			 * <code>optional sint32 maximum = 2;</code>
			 */
			public boolean hasMaximum() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			/**
			 * <code>optional sint32 maximum = 2;</code>
			 */
			public int getMaximum() {
				return maximum_;
			}

			/**
			 * <code>optional sint32 maximum = 2;</code>
			 */
			public Builder setMaximum(int value) {
				bitField0_ |= 0x00000002;
				maximum_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional sint32 maximum = 2;</code>
			 */
			public Builder clearMaximum() {
				bitField0_ = (bitField0_ & ~0x00000002);
				maximum_ = 0;
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:DateStatistics)
		}

		static {
			defaultInstance = new DateStatistics(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:DateStatistics)
	}

	public interface BinaryStatisticsOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// optional sint64 sum = 1;
		/**
		 * <code>optional sint64 sum = 1;</code>
		 * 
		 * <pre>
		 * sum will store the total binary blob length in a stripe
		 * </pre>
		 */
		boolean hasSum();

		/**
		 * <code>optional sint64 sum = 1;</code>
		 * 
		 * <pre>
		 * sum will store the total binary blob length in a stripe
		 * </pre>
		 */
		long getSum();
	}

	/**
	 * Protobuf type {@code BinaryStatistics}
	 */
	public static final class BinaryStatistics extends com.google.protobuf.GeneratedMessage implements
			BinaryStatisticsOrBuilder {
		// Use BinaryStatistics.newBuilder() to construct.
		private BinaryStatistics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private BinaryStatistics(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final BinaryStatistics defaultInstance;

		public static BinaryStatistics getDefaultInstance() {
			return defaultInstance;
		}

		public BinaryStatistics getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private BinaryStatistics(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 8: {
						bitField0_ |= 0x00000001;
						sum_ = input.readSInt64();
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
			} finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_BinaryStatistics_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_BinaryStatistics_fieldAccessorTable
					.ensureFieldAccessorsInitialized(OrcProto.BinaryStatistics.class,
							OrcProto.BinaryStatistics.Builder.class);
		}

		public static com.google.protobuf.Parser<BinaryStatistics> PARSER = new com.google.protobuf.AbstractParser<BinaryStatistics>() {
			public BinaryStatistics parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new BinaryStatistics(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<BinaryStatistics> getParserForType() {
			return PARSER;
		}

		private int bitField0_;
		// optional sint64 sum = 1;
		public static final int SUM_FIELD_NUMBER = 1;
		private long sum_;

		/**
		 * <code>optional sint64 sum = 1;</code>
		 * 
		 * <pre>
		 * sum will store the total binary blob length in a stripe
		 * </pre>
		 */
		public boolean hasSum() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>optional sint64 sum = 1;</code>
		 * 
		 * <pre>
		 * sum will store the total binary blob length in a stripe
		 * </pre>
		 */
		public long getSum() {
			return sum_;
		}

		private void initFields() {
			sum_ = 0L;
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeSInt64(1, sum_);
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream.computeSInt64Size(1, sum_);
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static OrcProto.BinaryStatistics parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.BinaryStatistics parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.BinaryStatistics parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.BinaryStatistics parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.BinaryStatistics parseFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.BinaryStatistics parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static OrcProto.BinaryStatistics parseDelimitedFrom(java.io.InputStream input)
				throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static OrcProto.BinaryStatistics parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static OrcProto.BinaryStatistics parseFrom(com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.BinaryStatistics parseFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(OrcProto.BinaryStatistics prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code BinaryStatistics}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				OrcProto.BinaryStatisticsOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_BinaryStatistics_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_BinaryStatistics_fieldAccessorTable
						.ensureFieldAccessorsInitialized(OrcProto.BinaryStatistics.class,
								OrcProto.BinaryStatistics.Builder.class);
			}

			// Construct using OrcProto.BinaryStatistics.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				sum_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000001);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_BinaryStatistics_descriptor;
			}

			public OrcProto.BinaryStatistics getDefaultInstanceForType() {
				return OrcProto.BinaryStatistics.getDefaultInstance();
			}

			public OrcProto.BinaryStatistics build() {
				OrcProto.BinaryStatistics result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public OrcProto.BinaryStatistics buildPartial() {
				OrcProto.BinaryStatistics result = new OrcProto.BinaryStatistics(this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.sum_ = sum_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof OrcProto.BinaryStatistics) {
					return mergeFrom((OrcProto.BinaryStatistics) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(OrcProto.BinaryStatistics other) {
				if (other == OrcProto.BinaryStatistics.getDefaultInstance())
					return this;
				if (other.hasSum()) {
					setSum(other.getSum());
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				OrcProto.BinaryStatistics parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (OrcProto.BinaryStatistics) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			// optional sint64 sum = 1;
			private long sum_;

			/**
			 * <code>optional sint64 sum = 1;</code>
			 * 
			 * <pre>
			 * sum will store the total binary blob length in a stripe
			 * </pre>
			 */
			public boolean hasSum() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <code>optional sint64 sum = 1;</code>
			 * 
			 * <pre>
			 * sum will store the total binary blob length in a stripe
			 * </pre>
			 */
			public long getSum() {
				return sum_;
			}

			/**
			 * <code>optional sint64 sum = 1;</code>
			 * 
			 * <pre>
			 * sum will store the total binary blob length in a stripe
			 * </pre>
			 */
			public Builder setSum(long value) {
				bitField0_ |= 0x00000001;
				sum_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional sint64 sum = 1;</code>
			 * 
			 * <pre>
			 * sum will store the total binary blob length in a stripe
			 * </pre>
			 */
			public Builder clearSum() {
				bitField0_ = (bitField0_ & ~0x00000001);
				sum_ = 0L;
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:BinaryStatistics)
		}

		static {
			defaultInstance = new BinaryStatistics(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:BinaryStatistics)
	}

	public interface ColumnStatisticsOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// optional uint64 numberOfValues = 1;
		/**
		 * <code>optional uint64 numberOfValues = 1;</code>
		 */
		boolean hasNumberOfValues();

		/**
		 * <code>optional uint64 numberOfValues = 1;</code>
		 */
		long getNumberOfValues();

		// optional .IntegerStatistics intStatistics = 2;
		/**
		 * <code>optional .IntegerStatistics intStatistics = 2;</code>
		 */
		boolean hasIntStatistics();

		/**
		 * <code>optional .IntegerStatistics intStatistics = 2;</code>
		 */
		OrcProto.IntegerStatistics getIntStatistics();

		/**
		 * <code>optional .IntegerStatistics intStatistics = 2;</code>
		 */
		OrcProto.IntegerStatisticsOrBuilder getIntStatisticsOrBuilder();

		// optional .DoubleStatistics doubleStatistics = 3;
		/**
		 * <code>optional .DoubleStatistics doubleStatistics = 3;</code>
		 */
		boolean hasDoubleStatistics();

		/**
		 * <code>optional .DoubleStatistics doubleStatistics = 3;</code>
		 */
		OrcProto.DoubleStatistics getDoubleStatistics();

		/**
		 * <code>optional .DoubleStatistics doubleStatistics = 3;</code>
		 */
		OrcProto.DoubleStatisticsOrBuilder getDoubleStatisticsOrBuilder();

		// optional .StringStatistics stringStatistics = 4;
		/**
		 * <code>optional .StringStatistics stringStatistics = 4;</code>
		 */
		boolean hasStringStatistics();

		/**
		 * <code>optional .StringStatistics stringStatistics = 4;</code>
		 */
		OrcProto.StringStatistics getStringStatistics();

		/**
		 * <code>optional .StringStatistics stringStatistics = 4;</code>
		 */
		OrcProto.StringStatisticsOrBuilder getStringStatisticsOrBuilder();

		// optional .BucketStatistics bucketStatistics = 5;
		/**
		 * <code>optional .BucketStatistics bucketStatistics = 5;</code>
		 */
		boolean hasBucketStatistics();

		/**
		 * <code>optional .BucketStatistics bucketStatistics = 5;</code>
		 */
		OrcProto.BucketStatistics getBucketStatistics();

		/**
		 * <code>optional .BucketStatistics bucketStatistics = 5;</code>
		 */
		OrcProto.BucketStatisticsOrBuilder getBucketStatisticsOrBuilder();

		// optional .DecimalStatistics decimalStatistics = 6;
		/**
		 * <code>optional .DecimalStatistics decimalStatistics = 6;</code>
		 */
		boolean hasDecimalStatistics();

		/**
		 * <code>optional .DecimalStatistics decimalStatistics = 6;</code>
		 */
		OrcProto.DecimalStatistics getDecimalStatistics();

		/**
		 * <code>optional .DecimalStatistics decimalStatistics = 6;</code>
		 */
		OrcProto.DecimalStatisticsOrBuilder getDecimalStatisticsOrBuilder();

		// optional .DateStatistics dateStatistics = 7;
		/**
		 * <code>optional .DateStatistics dateStatistics = 7;</code>
		 */
		boolean hasDateStatistics();

		/**
		 * <code>optional .DateStatistics dateStatistics = 7;</code>
		 */
		OrcProto.DateStatistics getDateStatistics();

		/**
		 * <code>optional .DateStatistics dateStatistics = 7;</code>
		 */
		OrcProto.DateStatisticsOrBuilder getDateStatisticsOrBuilder();

		// optional .BinaryStatistics binaryStatistics = 8;
		/**
		 * <code>optional .BinaryStatistics binaryStatistics = 8;</code>
		 */
		boolean hasBinaryStatistics();

		/**
		 * <code>optional .BinaryStatistics binaryStatistics = 8;</code>
		 */
		OrcProto.BinaryStatistics getBinaryStatistics();

		/**
		 * <code>optional .BinaryStatistics binaryStatistics = 8;</code>
		 */
		OrcProto.BinaryStatisticsOrBuilder getBinaryStatisticsOrBuilder();
	}

	/**
	 * Protobuf type {@code ColumnStatistics}
	 */
	public static final class ColumnStatistics extends com.google.protobuf.GeneratedMessage implements
			ColumnStatisticsOrBuilder {
		// Use ColumnStatistics.newBuilder() to construct.
		private ColumnStatistics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private ColumnStatistics(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final ColumnStatistics defaultInstance;

		public static ColumnStatistics getDefaultInstance() {
			return defaultInstance;
		}

		public ColumnStatistics getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private ColumnStatistics(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 8: {
						bitField0_ |= 0x00000001;
						numberOfValues_ = input.readUInt64();
						break;
					}
					case 18: {
						OrcProto.IntegerStatistics.Builder subBuilder = null;
						if (((bitField0_ & 0x00000002) == 0x00000002)) {
							subBuilder = intStatistics_.toBuilder();
						}
						intStatistics_ = input.readMessage(OrcProto.IntegerStatistics.PARSER, extensionRegistry);
						if (subBuilder != null) {
							subBuilder.mergeFrom(intStatistics_);
							intStatistics_ = subBuilder.buildPartial();
						}
						bitField0_ |= 0x00000002;
						break;
					}
					case 26: {
						OrcProto.DoubleStatistics.Builder subBuilder = null;
						if (((bitField0_ & 0x00000004) == 0x00000004)) {
							subBuilder = doubleStatistics_.toBuilder();
						}
						doubleStatistics_ = input.readMessage(OrcProto.DoubleStatistics.PARSER, extensionRegistry);
						if (subBuilder != null) {
							subBuilder.mergeFrom(doubleStatistics_);
							doubleStatistics_ = subBuilder.buildPartial();
						}
						bitField0_ |= 0x00000004;
						break;
					}
					case 34: {
						OrcProto.StringStatistics.Builder subBuilder = null;
						if (((bitField0_ & 0x00000008) == 0x00000008)) {
							subBuilder = stringStatistics_.toBuilder();
						}
						stringStatistics_ = input.readMessage(OrcProto.StringStatistics.PARSER, extensionRegistry);
						if (subBuilder != null) {
							subBuilder.mergeFrom(stringStatistics_);
							stringStatistics_ = subBuilder.buildPartial();
						}
						bitField0_ |= 0x00000008;
						break;
					}
					case 42: {
						OrcProto.BucketStatistics.Builder subBuilder = null;
						if (((bitField0_ & 0x00000010) == 0x00000010)) {
							subBuilder = bucketStatistics_.toBuilder();
						}
						bucketStatistics_ = input.readMessage(OrcProto.BucketStatistics.PARSER, extensionRegistry);
						if (subBuilder != null) {
							subBuilder.mergeFrom(bucketStatistics_);
							bucketStatistics_ = subBuilder.buildPartial();
						}
						bitField0_ |= 0x00000010;
						break;
					}
					case 50: {
						OrcProto.DecimalStatistics.Builder subBuilder = null;
						if (((bitField0_ & 0x00000020) == 0x00000020)) {
							subBuilder = decimalStatistics_.toBuilder();
						}
						decimalStatistics_ = input.readMessage(OrcProto.DecimalStatistics.PARSER, extensionRegistry);
						if (subBuilder != null) {
							subBuilder.mergeFrom(decimalStatistics_);
							decimalStatistics_ = subBuilder.buildPartial();
						}
						bitField0_ |= 0x00000020;
						break;
					}
					case 58: {
						OrcProto.DateStatistics.Builder subBuilder = null;
						if (((bitField0_ & 0x00000040) == 0x00000040)) {
							subBuilder = dateStatistics_.toBuilder();
						}
						dateStatistics_ = input.readMessage(OrcProto.DateStatistics.PARSER, extensionRegistry);
						if (subBuilder != null) {
							subBuilder.mergeFrom(dateStatistics_);
							dateStatistics_ = subBuilder.buildPartial();
						}
						bitField0_ |= 0x00000040;
						break;
					}
					case 66: {
						OrcProto.BinaryStatistics.Builder subBuilder = null;
						if (((bitField0_ & 0x00000080) == 0x00000080)) {
							subBuilder = binaryStatistics_.toBuilder();
						}
						binaryStatistics_ = input.readMessage(OrcProto.BinaryStatistics.PARSER, extensionRegistry);
						if (subBuilder != null) {
							subBuilder.mergeFrom(binaryStatistics_);
							binaryStatistics_ = subBuilder.buildPartial();
						}
						bitField0_ |= 0x00000080;
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
			} finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnStatistics_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnStatistics_fieldAccessorTable
					.ensureFieldAccessorsInitialized(OrcProto.ColumnStatistics.class,
							OrcProto.ColumnStatistics.Builder.class);
		}

		public static com.google.protobuf.Parser<ColumnStatistics> PARSER = new com.google.protobuf.AbstractParser<ColumnStatistics>() {
			public ColumnStatistics parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new ColumnStatistics(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<ColumnStatistics> getParserForType() {
			return PARSER;
		}

		private int bitField0_;
		// optional uint64 numberOfValues = 1;
		public static final int NUMBEROFVALUES_FIELD_NUMBER = 1;
		private long numberOfValues_;

		/**
		 * <code>optional uint64 numberOfValues = 1;</code>
		 */
		public boolean hasNumberOfValues() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>optional uint64 numberOfValues = 1;</code>
		 */
		public long getNumberOfValues() {
			return numberOfValues_;
		}

		// optional .IntegerStatistics intStatistics = 2;
		public static final int INTSTATISTICS_FIELD_NUMBER = 2;
		private OrcProto.IntegerStatistics intStatistics_;

		/**
		 * <code>optional .IntegerStatistics intStatistics = 2;</code>
		 */
		public boolean hasIntStatistics() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>optional .IntegerStatistics intStatistics = 2;</code>
		 */
		public OrcProto.IntegerStatistics getIntStatistics() {
			return intStatistics_;
		}

		/**
		 * <code>optional .IntegerStatistics intStatistics = 2;</code>
		 */
		public OrcProto.IntegerStatisticsOrBuilder getIntStatisticsOrBuilder() {
			return intStatistics_;
		}

		// optional .DoubleStatistics doubleStatistics = 3;
		public static final int DOUBLESTATISTICS_FIELD_NUMBER = 3;
		private OrcProto.DoubleStatistics doubleStatistics_;

		/**
		 * <code>optional .DoubleStatistics doubleStatistics = 3;</code>
		 */
		public boolean hasDoubleStatistics() {
			return ((bitField0_ & 0x00000004) == 0x00000004);
		}

		/**
		 * <code>optional .DoubleStatistics doubleStatistics = 3;</code>
		 */
		public OrcProto.DoubleStatistics getDoubleStatistics() {
			return doubleStatistics_;
		}

		/**
		 * <code>optional .DoubleStatistics doubleStatistics = 3;</code>
		 */
		public OrcProto.DoubleStatisticsOrBuilder getDoubleStatisticsOrBuilder() {
			return doubleStatistics_;
		}

		// optional .StringStatistics stringStatistics = 4;
		public static final int STRINGSTATISTICS_FIELD_NUMBER = 4;
		private OrcProto.StringStatistics stringStatistics_;

		/**
		 * <code>optional .StringStatistics stringStatistics = 4;</code>
		 */
		public boolean hasStringStatistics() {
			return ((bitField0_ & 0x00000008) == 0x00000008);
		}

		/**
		 * <code>optional .StringStatistics stringStatistics = 4;</code>
		 */
		public OrcProto.StringStatistics getStringStatistics() {
			return stringStatistics_;
		}

		/**
		 * <code>optional .StringStatistics stringStatistics = 4;</code>
		 */
		public OrcProto.StringStatisticsOrBuilder getStringStatisticsOrBuilder() {
			return stringStatistics_;
		}

		// optional .BucketStatistics bucketStatistics = 5;
		public static final int BUCKETSTATISTICS_FIELD_NUMBER = 5;
		private OrcProto.BucketStatistics bucketStatistics_;

		/**
		 * <code>optional .BucketStatistics bucketStatistics = 5;</code>
		 */
		public boolean hasBucketStatistics() {
			return ((bitField0_ & 0x00000010) == 0x00000010);
		}

		/**
		 * <code>optional .BucketStatistics bucketStatistics = 5;</code>
		 */
		public OrcProto.BucketStatistics getBucketStatistics() {
			return bucketStatistics_;
		}

		/**
		 * <code>optional .BucketStatistics bucketStatistics = 5;</code>
		 */
		public OrcProto.BucketStatisticsOrBuilder getBucketStatisticsOrBuilder() {
			return bucketStatistics_;
		}

		// optional .DecimalStatistics decimalStatistics = 6;
		public static final int DECIMALSTATISTICS_FIELD_NUMBER = 6;
		private OrcProto.DecimalStatistics decimalStatistics_;

		/**
		 * <code>optional .DecimalStatistics decimalStatistics = 6;</code>
		 */
		public boolean hasDecimalStatistics() {
			return ((bitField0_ & 0x00000020) == 0x00000020);
		}

		/**
		 * <code>optional .DecimalStatistics decimalStatistics = 6;</code>
		 */
		public OrcProto.DecimalStatistics getDecimalStatistics() {
			return decimalStatistics_;
		}

		/**
		 * <code>optional .DecimalStatistics decimalStatistics = 6;</code>
		 */
		public OrcProto.DecimalStatisticsOrBuilder getDecimalStatisticsOrBuilder() {
			return decimalStatistics_;
		}

		// optional .DateStatistics dateStatistics = 7;
		public static final int DATESTATISTICS_FIELD_NUMBER = 7;
		private OrcProto.DateStatistics dateStatistics_;

		/**
		 * <code>optional .DateStatistics dateStatistics = 7;</code>
		 */
		public boolean hasDateStatistics() {
			return ((bitField0_ & 0x00000040) == 0x00000040);
		}

		/**
		 * <code>optional .DateStatistics dateStatistics = 7;</code>
		 */
		public OrcProto.DateStatistics getDateStatistics() {
			return dateStatistics_;
		}

		/**
		 * <code>optional .DateStatistics dateStatistics = 7;</code>
		 */
		public OrcProto.DateStatisticsOrBuilder getDateStatisticsOrBuilder() {
			return dateStatistics_;
		}

		// optional .BinaryStatistics binaryStatistics = 8;
		public static final int BINARYSTATISTICS_FIELD_NUMBER = 8;
		private OrcProto.BinaryStatistics binaryStatistics_;

		/**
		 * <code>optional .BinaryStatistics binaryStatistics = 8;</code>
		 */
		public boolean hasBinaryStatistics() {
			return ((bitField0_ & 0x00000080) == 0x00000080);
		}

		/**
		 * <code>optional .BinaryStatistics binaryStatistics = 8;</code>
		 */
		public OrcProto.BinaryStatistics getBinaryStatistics() {
			return binaryStatistics_;
		}

		/**
		 * <code>optional .BinaryStatistics binaryStatistics = 8;</code>
		 */
		public OrcProto.BinaryStatisticsOrBuilder getBinaryStatisticsOrBuilder() {
			return binaryStatistics_;
		}

		private void initFields() {
			numberOfValues_ = 0L;
			intStatistics_ = OrcProto.IntegerStatistics.getDefaultInstance();
			doubleStatistics_ = OrcProto.DoubleStatistics.getDefaultInstance();
			stringStatistics_ = OrcProto.StringStatistics.getDefaultInstance();
			bucketStatistics_ = OrcProto.BucketStatistics.getDefaultInstance();
			decimalStatistics_ = OrcProto.DecimalStatistics.getDefaultInstance();
			dateStatistics_ = OrcProto.DateStatistics.getDefaultInstance();
			binaryStatistics_ = OrcProto.BinaryStatistics.getDefaultInstance();
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeUInt64(1, numberOfValues_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeMessage(2, intStatistics_);
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				output.writeMessage(3, doubleStatistics_);
			}
			if (((bitField0_ & 0x00000008) == 0x00000008)) {
				output.writeMessage(4, stringStatistics_);
			}
			if (((bitField0_ & 0x00000010) == 0x00000010)) {
				output.writeMessage(5, bucketStatistics_);
			}
			if (((bitField0_ & 0x00000020) == 0x00000020)) {
				output.writeMessage(6, decimalStatistics_);
			}
			if (((bitField0_ & 0x00000040) == 0x00000040)) {
				output.writeMessage(7, dateStatistics_);
			}
			if (((bitField0_ & 0x00000080) == 0x00000080)) {
				output.writeMessage(8, binaryStatistics_);
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream.computeUInt64Size(1, numberOfValues_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, intStatistics_);
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, doubleStatistics_);
			}
			if (((bitField0_ & 0x00000008) == 0x00000008)) {
				size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, stringStatistics_);
			}
			if (((bitField0_ & 0x00000010) == 0x00000010)) {
				size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, bucketStatistics_);
			}
			if (((bitField0_ & 0x00000020) == 0x00000020)) {
				size += com.google.protobuf.CodedOutputStream.computeMessageSize(6, decimalStatistics_);
			}
			if (((bitField0_ & 0x00000040) == 0x00000040)) {
				size += com.google.protobuf.CodedOutputStream.computeMessageSize(7, dateStatistics_);
			}
			if (((bitField0_ & 0x00000080) == 0x00000080)) {
				size += com.google.protobuf.CodedOutputStream.computeMessageSize(8, binaryStatistics_);
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static OrcProto.ColumnStatistics parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.ColumnStatistics parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.ColumnStatistics parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.ColumnStatistics parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.ColumnStatistics parseFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.ColumnStatistics parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static OrcProto.ColumnStatistics parseDelimitedFrom(java.io.InputStream input)
				throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static OrcProto.ColumnStatistics parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static OrcProto.ColumnStatistics parseFrom(com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.ColumnStatistics parseFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(OrcProto.ColumnStatistics prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code ColumnStatistics}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				OrcProto.ColumnStatisticsOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnStatistics_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnStatistics_fieldAccessorTable
						.ensureFieldAccessorsInitialized(OrcProto.ColumnStatistics.class,
								OrcProto.ColumnStatistics.Builder.class);
			}

			// Construct using OrcProto.ColumnStatistics.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
					getIntStatisticsFieldBuilder();
					getDoubleStatisticsFieldBuilder();
					getStringStatisticsFieldBuilder();
					getBucketStatisticsFieldBuilder();
					getDecimalStatisticsFieldBuilder();
					getDateStatisticsFieldBuilder();
					getBinaryStatisticsFieldBuilder();
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				numberOfValues_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000001);
				if (intStatisticsBuilder_ == null) {
					intStatistics_ = OrcProto.IntegerStatistics.getDefaultInstance();
				} else {
					intStatisticsBuilder_.clear();
				}
				bitField0_ = (bitField0_ & ~0x00000002);
				if (doubleStatisticsBuilder_ == null) {
					doubleStatistics_ = OrcProto.DoubleStatistics.getDefaultInstance();
				} else {
					doubleStatisticsBuilder_.clear();
				}
				bitField0_ = (bitField0_ & ~0x00000004);
				if (stringStatisticsBuilder_ == null) {
					stringStatistics_ = OrcProto.StringStatistics.getDefaultInstance();
				} else {
					stringStatisticsBuilder_.clear();
				}
				bitField0_ = (bitField0_ & ~0x00000008);
				if (bucketStatisticsBuilder_ == null) {
					bucketStatistics_ = OrcProto.BucketStatistics.getDefaultInstance();
				} else {
					bucketStatisticsBuilder_.clear();
				}
				bitField0_ = (bitField0_ & ~0x00000010);
				if (decimalStatisticsBuilder_ == null) {
					decimalStatistics_ = OrcProto.DecimalStatistics.getDefaultInstance();
				} else {
					decimalStatisticsBuilder_.clear();
				}
				bitField0_ = (bitField0_ & ~0x00000020);
				if (dateStatisticsBuilder_ == null) {
					dateStatistics_ = OrcProto.DateStatistics.getDefaultInstance();
				} else {
					dateStatisticsBuilder_.clear();
				}
				bitField0_ = (bitField0_ & ~0x00000040);
				if (binaryStatisticsBuilder_ == null) {
					binaryStatistics_ = OrcProto.BinaryStatistics.getDefaultInstance();
				} else {
					binaryStatisticsBuilder_.clear();
				}
				bitField0_ = (bitField0_ & ~0x00000080);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnStatistics_descriptor;
			}

			public OrcProto.ColumnStatistics getDefaultInstanceForType() {
				return OrcProto.ColumnStatistics.getDefaultInstance();
			}

			public OrcProto.ColumnStatistics build() {
				OrcProto.ColumnStatistics result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public OrcProto.ColumnStatistics buildPartial() {
				OrcProto.ColumnStatistics result = new OrcProto.ColumnStatistics(this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.numberOfValues_ = numberOfValues_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				if (intStatisticsBuilder_ == null) {
					result.intStatistics_ = intStatistics_;
				} else {
					result.intStatistics_ = intStatisticsBuilder_.build();
				}
				if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
					to_bitField0_ |= 0x00000004;
				}
				if (doubleStatisticsBuilder_ == null) {
					result.doubleStatistics_ = doubleStatistics_;
				} else {
					result.doubleStatistics_ = doubleStatisticsBuilder_.build();
				}
				if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
					to_bitField0_ |= 0x00000008;
				}
				if (stringStatisticsBuilder_ == null) {
					result.stringStatistics_ = stringStatistics_;
				} else {
					result.stringStatistics_ = stringStatisticsBuilder_.build();
				}
				if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
					to_bitField0_ |= 0x00000010;
				}
				if (bucketStatisticsBuilder_ == null) {
					result.bucketStatistics_ = bucketStatistics_;
				} else {
					result.bucketStatistics_ = bucketStatisticsBuilder_.build();
				}
				if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
					to_bitField0_ |= 0x00000020;
				}
				if (decimalStatisticsBuilder_ == null) {
					result.decimalStatistics_ = decimalStatistics_;
				} else {
					result.decimalStatistics_ = decimalStatisticsBuilder_.build();
				}
				if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
					to_bitField0_ |= 0x00000040;
				}
				if (dateStatisticsBuilder_ == null) {
					result.dateStatistics_ = dateStatistics_;
				} else {
					result.dateStatistics_ = dateStatisticsBuilder_.build();
				}
				if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
					to_bitField0_ |= 0x00000080;
				}
				if (binaryStatisticsBuilder_ == null) {
					result.binaryStatistics_ = binaryStatistics_;
				} else {
					result.binaryStatistics_ = binaryStatisticsBuilder_.build();
				}
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof OrcProto.ColumnStatistics) {
					return mergeFrom((OrcProto.ColumnStatistics) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(OrcProto.ColumnStatistics other) {
				if (other == OrcProto.ColumnStatistics.getDefaultInstance())
					return this;
				if (other.hasNumberOfValues()) {
					setNumberOfValues(other.getNumberOfValues());
				}
				if (other.hasIntStatistics()) {
					mergeIntStatistics(other.getIntStatistics());
				}
				if (other.hasDoubleStatistics()) {
					mergeDoubleStatistics(other.getDoubleStatistics());
				}
				if (other.hasStringStatistics()) {
					mergeStringStatistics(other.getStringStatistics());
				}
				if (other.hasBucketStatistics()) {
					mergeBucketStatistics(other.getBucketStatistics());
				}
				if (other.hasDecimalStatistics()) {
					mergeDecimalStatistics(other.getDecimalStatistics());
				}
				if (other.hasDateStatistics()) {
					mergeDateStatistics(other.getDateStatistics());
				}
				if (other.hasBinaryStatistics()) {
					mergeBinaryStatistics(other.getBinaryStatistics());
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				OrcProto.ColumnStatistics parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (OrcProto.ColumnStatistics) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			// optional uint64 numberOfValues = 1;
			private long numberOfValues_;

			/**
			 * <code>optional uint64 numberOfValues = 1;</code>
			 */
			public boolean hasNumberOfValues() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <code>optional uint64 numberOfValues = 1;</code>
			 */
			public long getNumberOfValues() {
				return numberOfValues_;
			}

			/**
			 * <code>optional uint64 numberOfValues = 1;</code>
			 */
			public Builder setNumberOfValues(long value) {
				bitField0_ |= 0x00000001;
				numberOfValues_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional uint64 numberOfValues = 1;</code>
			 */
			public Builder clearNumberOfValues() {
				bitField0_ = (bitField0_ & ~0x00000001);
				numberOfValues_ = 0L;
				onChanged();
				return this;
			}

			// optional .IntegerStatistics intStatistics = 2;
			private OrcProto.IntegerStatistics intStatistics_ = OrcProto.IntegerStatistics.getDefaultInstance();
			private com.google.protobuf.SingleFieldBuilder<OrcProto.IntegerStatistics, OrcProto.IntegerStatistics.Builder, OrcProto.IntegerStatisticsOrBuilder> intStatisticsBuilder_;

			/**
			 * <code>optional .IntegerStatistics intStatistics = 2;</code>
			 */
			public boolean hasIntStatistics() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			/**
			 * <code>optional .IntegerStatistics intStatistics = 2;</code>
			 */
			public OrcProto.IntegerStatistics getIntStatistics() {
				if (intStatisticsBuilder_ == null) {
					return intStatistics_;
				} else {
					return intStatisticsBuilder_.getMessage();
				}
			}

			/**
			 * <code>optional .IntegerStatistics intStatistics = 2;</code>
			 */
			public Builder setIntStatistics(OrcProto.IntegerStatistics value) {
				if (intStatisticsBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					intStatistics_ = value;
					onChanged();
				} else {
					intStatisticsBuilder_.setMessage(value);
				}
				bitField0_ |= 0x00000002;
				return this;
			}

			/**
			 * <code>optional .IntegerStatistics intStatistics = 2;</code>
			 */
			public Builder setIntStatistics(OrcProto.IntegerStatistics.Builder builderForValue) {
				if (intStatisticsBuilder_ == null) {
					intStatistics_ = builderForValue.build();
					onChanged();
				} else {
					intStatisticsBuilder_.setMessage(builderForValue.build());
				}
				bitField0_ |= 0x00000002;
				return this;
			}

			/**
			 * <code>optional .IntegerStatistics intStatistics = 2;</code>
			 */
			public Builder mergeIntStatistics(OrcProto.IntegerStatistics value) {
				if (intStatisticsBuilder_ == null) {
					if (((bitField0_ & 0x00000002) == 0x00000002)
							&& intStatistics_ != OrcProto.IntegerStatistics.getDefaultInstance()) {
						intStatistics_ = OrcProto.IntegerStatistics.newBuilder(intStatistics_).mergeFrom(value)
								.buildPartial();
					} else {
						intStatistics_ = value;
					}
					onChanged();
				} else {
					intStatisticsBuilder_.mergeFrom(value);
				}
				bitField0_ |= 0x00000002;
				return this;
			}

			/**
			 * <code>optional .IntegerStatistics intStatistics = 2;</code>
			 */
			public Builder clearIntStatistics() {
				if (intStatisticsBuilder_ == null) {
					intStatistics_ = OrcProto.IntegerStatistics.getDefaultInstance();
					onChanged();
				} else {
					intStatisticsBuilder_.clear();
				}
				bitField0_ = (bitField0_ & ~0x00000002);
				return this;
			}

			/**
			 * <code>optional .IntegerStatistics intStatistics = 2;</code>
			 */
			public OrcProto.IntegerStatistics.Builder getIntStatisticsBuilder() {
				bitField0_ |= 0x00000002;
				onChanged();
				return getIntStatisticsFieldBuilder().getBuilder();
			}

			/**
			 * <code>optional .IntegerStatistics intStatistics = 2;</code>
			 */
			public OrcProto.IntegerStatisticsOrBuilder getIntStatisticsOrBuilder() {
				if (intStatisticsBuilder_ != null) {
					return intStatisticsBuilder_.getMessageOrBuilder();
				} else {
					return intStatistics_;
				}
			}

			/**
			 * <code>optional .IntegerStatistics intStatistics = 2;</code>
			 */
			private com.google.protobuf.SingleFieldBuilder<OrcProto.IntegerStatistics, OrcProto.IntegerStatistics.Builder, OrcProto.IntegerStatisticsOrBuilder> getIntStatisticsFieldBuilder() {
				if (intStatisticsBuilder_ == null) {
					intStatisticsBuilder_ = new com.google.protobuf.SingleFieldBuilder<OrcProto.IntegerStatistics, OrcProto.IntegerStatistics.Builder, OrcProto.IntegerStatisticsOrBuilder>(
							intStatistics_, getParentForChildren(), isClean());
					intStatistics_ = null;
				}
				return intStatisticsBuilder_;
			}

			// optional .DoubleStatistics doubleStatistics = 3;
			private OrcProto.DoubleStatistics doubleStatistics_ = OrcProto.DoubleStatistics.getDefaultInstance();
			private com.google.protobuf.SingleFieldBuilder<OrcProto.DoubleStatistics, OrcProto.DoubleStatistics.Builder, OrcProto.DoubleStatisticsOrBuilder> doubleStatisticsBuilder_;

			/**
			 * <code>optional .DoubleStatistics doubleStatistics = 3;</code>
			 */
			public boolean hasDoubleStatistics() {
				return ((bitField0_ & 0x00000004) == 0x00000004);
			}

			/**
			 * <code>optional .DoubleStatistics doubleStatistics = 3;</code>
			 */
			public OrcProto.DoubleStatistics getDoubleStatistics() {
				if (doubleStatisticsBuilder_ == null) {
					return doubleStatistics_;
				} else {
					return doubleStatisticsBuilder_.getMessage();
				}
			}

			/**
			 * <code>optional .DoubleStatistics doubleStatistics = 3;</code>
			 */
			public Builder setDoubleStatistics(OrcProto.DoubleStatistics value) {
				if (doubleStatisticsBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					doubleStatistics_ = value;
					onChanged();
				} else {
					doubleStatisticsBuilder_.setMessage(value);
				}
				bitField0_ |= 0x00000004;
				return this;
			}

			/**
			 * <code>optional .DoubleStatistics doubleStatistics = 3;</code>
			 */
			public Builder setDoubleStatistics(OrcProto.DoubleStatistics.Builder builderForValue) {
				if (doubleStatisticsBuilder_ == null) {
					doubleStatistics_ = builderForValue.build();
					onChanged();
				} else {
					doubleStatisticsBuilder_.setMessage(builderForValue.build());
				}
				bitField0_ |= 0x00000004;
				return this;
			}

			/**
			 * <code>optional .DoubleStatistics doubleStatistics = 3;</code>
			 */
			public Builder mergeDoubleStatistics(OrcProto.DoubleStatistics value) {
				if (doubleStatisticsBuilder_ == null) {
					if (((bitField0_ & 0x00000004) == 0x00000004)
							&& doubleStatistics_ != OrcProto.DoubleStatistics.getDefaultInstance()) {
						doubleStatistics_ = OrcProto.DoubleStatistics.newBuilder(doubleStatistics_).mergeFrom(value)
								.buildPartial();
					} else {
						doubleStatistics_ = value;
					}
					onChanged();
				} else {
					doubleStatisticsBuilder_.mergeFrom(value);
				}
				bitField0_ |= 0x00000004;
				return this;
			}

			/**
			 * <code>optional .DoubleStatistics doubleStatistics = 3;</code>
			 */
			public Builder clearDoubleStatistics() {
				if (doubleStatisticsBuilder_ == null) {
					doubleStatistics_ = OrcProto.DoubleStatistics.getDefaultInstance();
					onChanged();
				} else {
					doubleStatisticsBuilder_.clear();
				}
				bitField0_ = (bitField0_ & ~0x00000004);
				return this;
			}

			/**
			 * <code>optional .DoubleStatistics doubleStatistics = 3;</code>
			 */
			public OrcProto.DoubleStatistics.Builder getDoubleStatisticsBuilder() {
				bitField0_ |= 0x00000004;
				onChanged();
				return getDoubleStatisticsFieldBuilder().getBuilder();
			}

			/**
			 * <code>optional .DoubleStatistics doubleStatistics = 3;</code>
			 */
			public OrcProto.DoubleStatisticsOrBuilder getDoubleStatisticsOrBuilder() {
				if (doubleStatisticsBuilder_ != null) {
					return doubleStatisticsBuilder_.getMessageOrBuilder();
				} else {
					return doubleStatistics_;
				}
			}

			/**
			 * <code>optional .DoubleStatistics doubleStatistics = 3;</code>
			 */
			private com.google.protobuf.SingleFieldBuilder<OrcProto.DoubleStatistics, OrcProto.DoubleStatistics.Builder, OrcProto.DoubleStatisticsOrBuilder> getDoubleStatisticsFieldBuilder() {
				if (doubleStatisticsBuilder_ == null) {
					doubleStatisticsBuilder_ = new com.google.protobuf.SingleFieldBuilder<OrcProto.DoubleStatistics, OrcProto.DoubleStatistics.Builder, OrcProto.DoubleStatisticsOrBuilder>(
							doubleStatistics_, getParentForChildren(), isClean());
					doubleStatistics_ = null;
				}
				return doubleStatisticsBuilder_;
			}

			// optional .StringStatistics stringStatistics = 4;
			private OrcProto.StringStatistics stringStatistics_ = OrcProto.StringStatistics.getDefaultInstance();
			private com.google.protobuf.SingleFieldBuilder<OrcProto.StringStatistics, OrcProto.StringStatistics.Builder, OrcProto.StringStatisticsOrBuilder> stringStatisticsBuilder_;

			/**
			 * <code>optional .StringStatistics stringStatistics = 4;</code>
			 */
			public boolean hasStringStatistics() {
				return ((bitField0_ & 0x00000008) == 0x00000008);
			}

			/**
			 * <code>optional .StringStatistics stringStatistics = 4;</code>
			 */
			public OrcProto.StringStatistics getStringStatistics() {
				if (stringStatisticsBuilder_ == null) {
					return stringStatistics_;
				} else {
					return stringStatisticsBuilder_.getMessage();
				}
			}

			/**
			 * <code>optional .StringStatistics stringStatistics = 4;</code>
			 */
			public Builder setStringStatistics(OrcProto.StringStatistics value) {
				if (stringStatisticsBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					stringStatistics_ = value;
					onChanged();
				} else {
					stringStatisticsBuilder_.setMessage(value);
				}
				bitField0_ |= 0x00000008;
				return this;
			}

			/**
			 * <code>optional .StringStatistics stringStatistics = 4;</code>
			 */
			public Builder setStringStatistics(OrcProto.StringStatistics.Builder builderForValue) {
				if (stringStatisticsBuilder_ == null) {
					stringStatistics_ = builderForValue.build();
					onChanged();
				} else {
					stringStatisticsBuilder_.setMessage(builderForValue.build());
				}
				bitField0_ |= 0x00000008;
				return this;
			}

			/**
			 * <code>optional .StringStatistics stringStatistics = 4;</code>
			 */
			public Builder mergeStringStatistics(OrcProto.StringStatistics value) {
				if (stringStatisticsBuilder_ == null) {
					if (((bitField0_ & 0x00000008) == 0x00000008)
							&& stringStatistics_ != OrcProto.StringStatistics.getDefaultInstance()) {
						stringStatistics_ = OrcProto.StringStatistics.newBuilder(stringStatistics_).mergeFrom(value)
								.buildPartial();
					} else {
						stringStatistics_ = value;
					}
					onChanged();
				} else {
					stringStatisticsBuilder_.mergeFrom(value);
				}
				bitField0_ |= 0x00000008;
				return this;
			}

			/**
			 * <code>optional .StringStatistics stringStatistics = 4;</code>
			 */
			public Builder clearStringStatistics() {
				if (stringStatisticsBuilder_ == null) {
					stringStatistics_ = OrcProto.StringStatistics.getDefaultInstance();
					onChanged();
				} else {
					stringStatisticsBuilder_.clear();
				}
				bitField0_ = (bitField0_ & ~0x00000008);
				return this;
			}

			/**
			 * <code>optional .StringStatistics stringStatistics = 4;</code>
			 */
			public OrcProto.StringStatistics.Builder getStringStatisticsBuilder() {
				bitField0_ |= 0x00000008;
				onChanged();
				return getStringStatisticsFieldBuilder().getBuilder();
			}

			/**
			 * <code>optional .StringStatistics stringStatistics = 4;</code>
			 */
			public OrcProto.StringStatisticsOrBuilder getStringStatisticsOrBuilder() {
				if (stringStatisticsBuilder_ != null) {
					return stringStatisticsBuilder_.getMessageOrBuilder();
				} else {
					return stringStatistics_;
				}
			}

			/**
			 * <code>optional .StringStatistics stringStatistics = 4;</code>
			 */
			private com.google.protobuf.SingleFieldBuilder<OrcProto.StringStatistics, OrcProto.StringStatistics.Builder, OrcProto.StringStatisticsOrBuilder> getStringStatisticsFieldBuilder() {
				if (stringStatisticsBuilder_ == null) {
					stringStatisticsBuilder_ = new com.google.protobuf.SingleFieldBuilder<OrcProto.StringStatistics, OrcProto.StringStatistics.Builder, OrcProto.StringStatisticsOrBuilder>(
							stringStatistics_, getParentForChildren(), isClean());
					stringStatistics_ = null;
				}
				return stringStatisticsBuilder_;
			}

			// optional .BucketStatistics bucketStatistics = 5;
			private OrcProto.BucketStatistics bucketStatistics_ = OrcProto.BucketStatistics.getDefaultInstance();
			private com.google.protobuf.SingleFieldBuilder<OrcProto.BucketStatistics, OrcProto.BucketStatistics.Builder, OrcProto.BucketStatisticsOrBuilder> bucketStatisticsBuilder_;

			/**
			 * <code>optional .BucketStatistics bucketStatistics = 5;</code>
			 */
			public boolean hasBucketStatistics() {
				return ((bitField0_ & 0x00000010) == 0x00000010);
			}

			/**
			 * <code>optional .BucketStatistics bucketStatistics = 5;</code>
			 */
			public OrcProto.BucketStatistics getBucketStatistics() {
				if (bucketStatisticsBuilder_ == null) {
					return bucketStatistics_;
				} else {
					return bucketStatisticsBuilder_.getMessage();
				}
			}

			/**
			 * <code>optional .BucketStatistics bucketStatistics = 5;</code>
			 */
			public Builder setBucketStatistics(OrcProto.BucketStatistics value) {
				if (bucketStatisticsBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					bucketStatistics_ = value;
					onChanged();
				} else {
					bucketStatisticsBuilder_.setMessage(value);
				}
				bitField0_ |= 0x00000010;
				return this;
			}

			/**
			 * <code>optional .BucketStatistics bucketStatistics = 5;</code>
			 */
			public Builder setBucketStatistics(OrcProto.BucketStatistics.Builder builderForValue) {
				if (bucketStatisticsBuilder_ == null) {
					bucketStatistics_ = builderForValue.build();
					onChanged();
				} else {
					bucketStatisticsBuilder_.setMessage(builderForValue.build());
				}
				bitField0_ |= 0x00000010;
				return this;
			}

			/**
			 * <code>optional .BucketStatistics bucketStatistics = 5;</code>
			 */
			public Builder mergeBucketStatistics(OrcProto.BucketStatistics value) {
				if (bucketStatisticsBuilder_ == null) {
					if (((bitField0_ & 0x00000010) == 0x00000010)
							&& bucketStatistics_ != OrcProto.BucketStatistics.getDefaultInstance()) {
						bucketStatistics_ = OrcProto.BucketStatistics.newBuilder(bucketStatistics_).mergeFrom(value)
								.buildPartial();
					} else {
						bucketStatistics_ = value;
					}
					onChanged();
				} else {
					bucketStatisticsBuilder_.mergeFrom(value);
				}
				bitField0_ |= 0x00000010;
				return this;
			}

			/**
			 * <code>optional .BucketStatistics bucketStatistics = 5;</code>
			 */
			public Builder clearBucketStatistics() {
				if (bucketStatisticsBuilder_ == null) {
					bucketStatistics_ = OrcProto.BucketStatistics.getDefaultInstance();
					onChanged();
				} else {
					bucketStatisticsBuilder_.clear();
				}
				bitField0_ = (bitField0_ & ~0x00000010);
				return this;
			}

			/**
			 * <code>optional .BucketStatistics bucketStatistics = 5;</code>
			 */
			public OrcProto.BucketStatistics.Builder getBucketStatisticsBuilder() {
				bitField0_ |= 0x00000010;
				onChanged();
				return getBucketStatisticsFieldBuilder().getBuilder();
			}

			/**
			 * <code>optional .BucketStatistics bucketStatistics = 5;</code>
			 */
			public OrcProto.BucketStatisticsOrBuilder getBucketStatisticsOrBuilder() {
				if (bucketStatisticsBuilder_ != null) {
					return bucketStatisticsBuilder_.getMessageOrBuilder();
				} else {
					return bucketStatistics_;
				}
			}

			/**
			 * <code>optional .BucketStatistics bucketStatistics = 5;</code>
			 */
			private com.google.protobuf.SingleFieldBuilder<OrcProto.BucketStatistics, OrcProto.BucketStatistics.Builder, OrcProto.BucketStatisticsOrBuilder> getBucketStatisticsFieldBuilder() {
				if (bucketStatisticsBuilder_ == null) {
					bucketStatisticsBuilder_ = new com.google.protobuf.SingleFieldBuilder<OrcProto.BucketStatistics, OrcProto.BucketStatistics.Builder, OrcProto.BucketStatisticsOrBuilder>(
							bucketStatistics_, getParentForChildren(), isClean());
					bucketStatistics_ = null;
				}
				return bucketStatisticsBuilder_;
			}

			// optional .DecimalStatistics decimalStatistics = 6;
			private OrcProto.DecimalStatistics decimalStatistics_ = OrcProto.DecimalStatistics.getDefaultInstance();
			private com.google.protobuf.SingleFieldBuilder<OrcProto.DecimalStatistics, OrcProto.DecimalStatistics.Builder, OrcProto.DecimalStatisticsOrBuilder> decimalStatisticsBuilder_;

			/**
			 * <code>optional .DecimalStatistics decimalStatistics = 6;</code>
			 */
			public boolean hasDecimalStatistics() {
				return ((bitField0_ & 0x00000020) == 0x00000020);
			}

			/**
			 * <code>optional .DecimalStatistics decimalStatistics = 6;</code>
			 */
			public OrcProto.DecimalStatistics getDecimalStatistics() {
				if (decimalStatisticsBuilder_ == null) {
					return decimalStatistics_;
				} else {
					return decimalStatisticsBuilder_.getMessage();
				}
			}

			/**
			 * <code>optional .DecimalStatistics decimalStatistics = 6;</code>
			 */
			public Builder setDecimalStatistics(OrcProto.DecimalStatistics value) {
				if (decimalStatisticsBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					decimalStatistics_ = value;
					onChanged();
				} else {
					decimalStatisticsBuilder_.setMessage(value);
				}
				bitField0_ |= 0x00000020;
				return this;
			}

			/**
			 * <code>optional .DecimalStatistics decimalStatistics = 6;</code>
			 */
			public Builder setDecimalStatistics(OrcProto.DecimalStatistics.Builder builderForValue) {
				if (decimalStatisticsBuilder_ == null) {
					decimalStatistics_ = builderForValue.build();
					onChanged();
				} else {
					decimalStatisticsBuilder_.setMessage(builderForValue.build());
				}
				bitField0_ |= 0x00000020;
				return this;
			}

			/**
			 * <code>optional .DecimalStatistics decimalStatistics = 6;</code>
			 */
			public Builder mergeDecimalStatistics(OrcProto.DecimalStatistics value) {
				if (decimalStatisticsBuilder_ == null) {
					if (((bitField0_ & 0x00000020) == 0x00000020)
							&& decimalStatistics_ != OrcProto.DecimalStatistics.getDefaultInstance()) {
						decimalStatistics_ = OrcProto.DecimalStatistics.newBuilder(decimalStatistics_).mergeFrom(value)
								.buildPartial();
					} else {
						decimalStatistics_ = value;
					}
					onChanged();
				} else {
					decimalStatisticsBuilder_.mergeFrom(value);
				}
				bitField0_ |= 0x00000020;
				return this;
			}

			/**
			 * <code>optional .DecimalStatistics decimalStatistics = 6;</code>
			 */
			public Builder clearDecimalStatistics() {
				if (decimalStatisticsBuilder_ == null) {
					decimalStatistics_ = OrcProto.DecimalStatistics.getDefaultInstance();
					onChanged();
				} else {
					decimalStatisticsBuilder_.clear();
				}
				bitField0_ = (bitField0_ & ~0x00000020);
				return this;
			}

			/**
			 * <code>optional .DecimalStatistics decimalStatistics = 6;</code>
			 */
			public OrcProto.DecimalStatistics.Builder getDecimalStatisticsBuilder() {
				bitField0_ |= 0x00000020;
				onChanged();
				return getDecimalStatisticsFieldBuilder().getBuilder();
			}

			/**
			 * <code>optional .DecimalStatistics decimalStatistics = 6;</code>
			 */
			public OrcProto.DecimalStatisticsOrBuilder getDecimalStatisticsOrBuilder() {
				if (decimalStatisticsBuilder_ != null) {
					return decimalStatisticsBuilder_.getMessageOrBuilder();
				} else {
					return decimalStatistics_;
				}
			}

			/**
			 * <code>optional .DecimalStatistics decimalStatistics = 6;</code>
			 */
			private com.google.protobuf.SingleFieldBuilder<OrcProto.DecimalStatistics, OrcProto.DecimalStatistics.Builder, OrcProto.DecimalStatisticsOrBuilder> getDecimalStatisticsFieldBuilder() {
				if (decimalStatisticsBuilder_ == null) {
					decimalStatisticsBuilder_ = new com.google.protobuf.SingleFieldBuilder<OrcProto.DecimalStatistics, OrcProto.DecimalStatistics.Builder, OrcProto.DecimalStatisticsOrBuilder>(
							decimalStatistics_, getParentForChildren(), isClean());
					decimalStatistics_ = null;
				}
				return decimalStatisticsBuilder_;
			}

			// optional .DateStatistics dateStatistics = 7;
			private OrcProto.DateStatistics dateStatistics_ = OrcProto.DateStatistics.getDefaultInstance();
			private com.google.protobuf.SingleFieldBuilder<OrcProto.DateStatistics, OrcProto.DateStatistics.Builder, OrcProto.DateStatisticsOrBuilder> dateStatisticsBuilder_;

			/**
			 * <code>optional .DateStatistics dateStatistics = 7;</code>
			 */
			public boolean hasDateStatistics() {
				return ((bitField0_ & 0x00000040) == 0x00000040);
			}

			/**
			 * <code>optional .DateStatistics dateStatistics = 7;</code>
			 */
			public OrcProto.DateStatistics getDateStatistics() {
				if (dateStatisticsBuilder_ == null) {
					return dateStatistics_;
				} else {
					return dateStatisticsBuilder_.getMessage();
				}
			}

			/**
			 * <code>optional .DateStatistics dateStatistics = 7;</code>
			 */
			public Builder setDateStatistics(OrcProto.DateStatistics value) {
				if (dateStatisticsBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					dateStatistics_ = value;
					onChanged();
				} else {
					dateStatisticsBuilder_.setMessage(value);
				}
				bitField0_ |= 0x00000040;
				return this;
			}

			/**
			 * <code>optional .DateStatistics dateStatistics = 7;</code>
			 */
			public Builder setDateStatistics(OrcProto.DateStatistics.Builder builderForValue) {
				if (dateStatisticsBuilder_ == null) {
					dateStatistics_ = builderForValue.build();
					onChanged();
				} else {
					dateStatisticsBuilder_.setMessage(builderForValue.build());
				}
				bitField0_ |= 0x00000040;
				return this;
			}

			/**
			 * <code>optional .DateStatistics dateStatistics = 7;</code>
			 */
			public Builder mergeDateStatistics(OrcProto.DateStatistics value) {
				if (dateStatisticsBuilder_ == null) {
					if (((bitField0_ & 0x00000040) == 0x00000040)
							&& dateStatistics_ != OrcProto.DateStatistics.getDefaultInstance()) {
						dateStatistics_ = OrcProto.DateStatistics.newBuilder(dateStatistics_).mergeFrom(value)
								.buildPartial();
					} else {
						dateStatistics_ = value;
					}
					onChanged();
				} else {
					dateStatisticsBuilder_.mergeFrom(value);
				}
				bitField0_ |= 0x00000040;
				return this;
			}

			/**
			 * <code>optional .DateStatistics dateStatistics = 7;</code>
			 */
			public Builder clearDateStatistics() {
				if (dateStatisticsBuilder_ == null) {
					dateStatistics_ = OrcProto.DateStatistics.getDefaultInstance();
					onChanged();
				} else {
					dateStatisticsBuilder_.clear();
				}
				bitField0_ = (bitField0_ & ~0x00000040);
				return this;
			}

			/**
			 * <code>optional .DateStatistics dateStatistics = 7;</code>
			 */
			public OrcProto.DateStatistics.Builder getDateStatisticsBuilder() {
				bitField0_ |= 0x00000040;
				onChanged();
				return getDateStatisticsFieldBuilder().getBuilder();
			}

			/**
			 * <code>optional .DateStatistics dateStatistics = 7;</code>
			 */
			public OrcProto.DateStatisticsOrBuilder getDateStatisticsOrBuilder() {
				if (dateStatisticsBuilder_ != null) {
					return dateStatisticsBuilder_.getMessageOrBuilder();
				} else {
					return dateStatistics_;
				}
			}

			/**
			 * <code>optional .DateStatistics dateStatistics = 7;</code>
			 */
			private com.google.protobuf.SingleFieldBuilder<OrcProto.DateStatistics, OrcProto.DateStatistics.Builder, OrcProto.DateStatisticsOrBuilder> getDateStatisticsFieldBuilder() {
				if (dateStatisticsBuilder_ == null) {
					dateStatisticsBuilder_ = new com.google.protobuf.SingleFieldBuilder<OrcProto.DateStatistics, OrcProto.DateStatistics.Builder, OrcProto.DateStatisticsOrBuilder>(
							dateStatistics_, getParentForChildren(), isClean());
					dateStatistics_ = null;
				}
				return dateStatisticsBuilder_;
			}

			// optional .BinaryStatistics binaryStatistics = 8;
			private OrcProto.BinaryStatistics binaryStatistics_ = OrcProto.BinaryStatistics.getDefaultInstance();
			private com.google.protobuf.SingleFieldBuilder<OrcProto.BinaryStatistics, OrcProto.BinaryStatistics.Builder, OrcProto.BinaryStatisticsOrBuilder> binaryStatisticsBuilder_;

			/**
			 * <code>optional .BinaryStatistics binaryStatistics = 8;</code>
			 */
			public boolean hasBinaryStatistics() {
				return ((bitField0_ & 0x00000080) == 0x00000080);
			}

			/**
			 * <code>optional .BinaryStatistics binaryStatistics = 8;</code>
			 */
			public OrcProto.BinaryStatistics getBinaryStatistics() {
				if (binaryStatisticsBuilder_ == null) {
					return binaryStatistics_;
				} else {
					return binaryStatisticsBuilder_.getMessage();
				}
			}

			/**
			 * <code>optional .BinaryStatistics binaryStatistics = 8;</code>
			 */
			public Builder setBinaryStatistics(OrcProto.BinaryStatistics value) {
				if (binaryStatisticsBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					binaryStatistics_ = value;
					onChanged();
				} else {
					binaryStatisticsBuilder_.setMessage(value);
				}
				bitField0_ |= 0x00000080;
				return this;
			}

			/**
			 * <code>optional .BinaryStatistics binaryStatistics = 8;</code>
			 */
			public Builder setBinaryStatistics(OrcProto.BinaryStatistics.Builder builderForValue) {
				if (binaryStatisticsBuilder_ == null) {
					binaryStatistics_ = builderForValue.build();
					onChanged();
				} else {
					binaryStatisticsBuilder_.setMessage(builderForValue.build());
				}
				bitField0_ |= 0x00000080;
				return this;
			}

			/**
			 * <code>optional .BinaryStatistics binaryStatistics = 8;</code>
			 */
			public Builder mergeBinaryStatistics(OrcProto.BinaryStatistics value) {
				if (binaryStatisticsBuilder_ == null) {
					if (((bitField0_ & 0x00000080) == 0x00000080)
							&& binaryStatistics_ != OrcProto.BinaryStatistics.getDefaultInstance()) {
						binaryStatistics_ = OrcProto.BinaryStatistics.newBuilder(binaryStatistics_).mergeFrom(value)
								.buildPartial();
					} else {
						binaryStatistics_ = value;
					}
					onChanged();
				} else {
					binaryStatisticsBuilder_.mergeFrom(value);
				}
				bitField0_ |= 0x00000080;
				return this;
			}

			/**
			 * <code>optional .BinaryStatistics binaryStatistics = 8;</code>
			 */
			public Builder clearBinaryStatistics() {
				if (binaryStatisticsBuilder_ == null) {
					binaryStatistics_ = OrcProto.BinaryStatistics.getDefaultInstance();
					onChanged();
				} else {
					binaryStatisticsBuilder_.clear();
				}
				bitField0_ = (bitField0_ & ~0x00000080);
				return this;
			}

			/**
			 * <code>optional .BinaryStatistics binaryStatistics = 8;</code>
			 */
			public OrcProto.BinaryStatistics.Builder getBinaryStatisticsBuilder() {
				bitField0_ |= 0x00000080;
				onChanged();
				return getBinaryStatisticsFieldBuilder().getBuilder();
			}

			/**
			 * <code>optional .BinaryStatistics binaryStatistics = 8;</code>
			 */
			public OrcProto.BinaryStatisticsOrBuilder getBinaryStatisticsOrBuilder() {
				if (binaryStatisticsBuilder_ != null) {
					return binaryStatisticsBuilder_.getMessageOrBuilder();
				} else {
					return binaryStatistics_;
				}
			}

			/**
			 * <code>optional .BinaryStatistics binaryStatistics = 8;</code>
			 */
			private com.google.protobuf.SingleFieldBuilder<OrcProto.BinaryStatistics, OrcProto.BinaryStatistics.Builder, OrcProto.BinaryStatisticsOrBuilder> getBinaryStatisticsFieldBuilder() {
				if (binaryStatisticsBuilder_ == null) {
					binaryStatisticsBuilder_ = new com.google.protobuf.SingleFieldBuilder<OrcProto.BinaryStatistics, OrcProto.BinaryStatistics.Builder, OrcProto.BinaryStatisticsOrBuilder>(
							binaryStatistics_, getParentForChildren(), isClean());
					binaryStatistics_ = null;
				}
				return binaryStatisticsBuilder_;
			}

			// @@protoc_insertion_point(builder_scope:ColumnStatistics)
		}

		static {
			defaultInstance = new ColumnStatistics(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:ColumnStatistics)
	}

	public interface RowIndexEntryOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// repeated uint64 positions = 1 [packed = true];
		/**
		 * <code>repeated uint64 positions = 1 [packed = true];</code>
		 */
		java.util.List<java.lang.Long> getPositionsList();

		/**
		 * <code>repeated uint64 positions = 1 [packed = true];</code>
		 */
		int getPositionsCount();

		/**
		 * <code>repeated uint64 positions = 1 [packed = true];</code>
		 */
		long getPositions(int index);

		// optional .ColumnStatistics statistics = 2;
		/**
		 * <code>optional .ColumnStatistics statistics = 2;</code>
		 */
		boolean hasStatistics();

		/**
		 * <code>optional .ColumnStatistics statistics = 2;</code>
		 */
		OrcProto.ColumnStatistics getStatistics();

		/**
		 * <code>optional .ColumnStatistics statistics = 2;</code>
		 */
		OrcProto.ColumnStatisticsOrBuilder getStatisticsOrBuilder();
	}

	/**
	 * Protobuf type {@code RowIndexEntry}
	 */
	public static final class RowIndexEntry extends com.google.protobuf.GeneratedMessage implements
			RowIndexEntryOrBuilder {
		// Use RowIndexEntry.newBuilder() to construct.
		private RowIndexEntry(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private RowIndexEntry(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final RowIndexEntry defaultInstance;

		public static RowIndexEntry getDefaultInstance() {
			return defaultInstance;
		}

		public RowIndexEntry getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private RowIndexEntry(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			int mutable_bitField0_ = 0;
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 8: {
						if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
							positions_ = new java.util.ArrayList<java.lang.Long>();
							mutable_bitField0_ |= 0x00000001;
						}
						positions_.add(input.readUInt64());
						break;
					}
					case 10: {
						int length = input.readRawVarint32();
						int limit = input.pushLimit(length);
						if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
							positions_ = new java.util.ArrayList<java.lang.Long>();
							mutable_bitField0_ |= 0x00000001;
						}
						while (input.getBytesUntilLimit() > 0) {
							positions_.add(input.readUInt64());
						}
						input.popLimit(limit);
						break;
					}
					case 18: {
						OrcProto.ColumnStatistics.Builder subBuilder = null;
						if (((bitField0_ & 0x00000001) == 0x00000001)) {
							subBuilder = statistics_.toBuilder();
						}
						statistics_ = input.readMessage(OrcProto.ColumnStatistics.PARSER, extensionRegistry);
						if (subBuilder != null) {
							subBuilder.mergeFrom(statistics_);
							statistics_ = subBuilder.buildPartial();
						}
						bitField0_ |= 0x00000001;
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
			} finally {
				if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
					positions_ = java.util.Collections.unmodifiableList(positions_);
				}
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndexEntry_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndexEntry_fieldAccessorTable
					.ensureFieldAccessorsInitialized(OrcProto.RowIndexEntry.class, OrcProto.RowIndexEntry.Builder.class);
		}

		public static com.google.protobuf.Parser<RowIndexEntry> PARSER = new com.google.protobuf.AbstractParser<RowIndexEntry>() {
			public RowIndexEntry parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new RowIndexEntry(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<RowIndexEntry> getParserForType() {
			return PARSER;
		}

		private int bitField0_;
		// repeated uint64 positions = 1 [packed = true];
		public static final int POSITIONS_FIELD_NUMBER = 1;
		private java.util.List<java.lang.Long> positions_;

		/**
		 * <code>repeated uint64 positions = 1 [packed = true];</code>
		 */
		public java.util.List<java.lang.Long> getPositionsList() {
			return positions_;
		}

		/**
		 * <code>repeated uint64 positions = 1 [packed = true];</code>
		 */
		public int getPositionsCount() {
			return positions_.size();
		}

		/**
		 * <code>repeated uint64 positions = 1 [packed = true];</code>
		 */
		public long getPositions(int index) {
			return positions_.get(index);
		}

		private int positionsMemoizedSerializedSize = -1;

		// optional .ColumnStatistics statistics = 2;
		public static final int STATISTICS_FIELD_NUMBER = 2;
		private OrcProto.ColumnStatistics statistics_;

		/**
		 * <code>optional .ColumnStatistics statistics = 2;</code>
		 */
		public boolean hasStatistics() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>optional .ColumnStatistics statistics = 2;</code>
		 */
		public OrcProto.ColumnStatistics getStatistics() {
			return statistics_;
		}

		/**
		 * <code>optional .ColumnStatistics statistics = 2;</code>
		 */
		public OrcProto.ColumnStatisticsOrBuilder getStatisticsOrBuilder() {
			return statistics_;
		}

		private void initFields() {
			positions_ = java.util.Collections.emptyList();
			statistics_ = OrcProto.ColumnStatistics.getDefaultInstance();
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			if (getPositionsList().size() > 0) {
				output.writeRawVarint32(10);
				output.writeRawVarint32(positionsMemoizedSerializedSize);
			}
			for (int i = 0; i < positions_.size(); i++) {
				output.writeUInt64NoTag(positions_.get(i));
			}
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeMessage(2, statistics_);
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			{
				int dataSize = 0;
				for (int i = 0; i < positions_.size(); i++) {
					dataSize += com.google.protobuf.CodedOutputStream.computeUInt64SizeNoTag(positions_.get(i));
				}
				size += dataSize;
				if (!getPositionsList().isEmpty()) {
					size += 1;
					size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
				}
				positionsMemoizedSerializedSize = dataSize;
			}
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, statistics_);
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static OrcProto.RowIndexEntry parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.RowIndexEntry parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.RowIndexEntry parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.RowIndexEntry parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.RowIndexEntry parseFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.RowIndexEntry parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static OrcProto.RowIndexEntry parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static OrcProto.RowIndexEntry parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static OrcProto.RowIndexEntry parseFrom(com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.RowIndexEntry parseFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(OrcProto.RowIndexEntry prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code RowIndexEntry}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				OrcProto.RowIndexEntryOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndexEntry_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndexEntry_fieldAccessorTable
						.ensureFieldAccessorsInitialized(OrcProto.RowIndexEntry.class,
								OrcProto.RowIndexEntry.Builder.class);
			}

			// Construct using OrcProto.RowIndexEntry.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
					getStatisticsFieldBuilder();
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				positions_ = java.util.Collections.emptyList();
				bitField0_ = (bitField0_ & ~0x00000001);
				if (statisticsBuilder_ == null) {
					statistics_ = OrcProto.ColumnStatistics.getDefaultInstance();
				} else {
					statisticsBuilder_.clear();
				}
				bitField0_ = (bitField0_ & ~0x00000002);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndexEntry_descriptor;
			}

			public OrcProto.RowIndexEntry getDefaultInstanceForType() {
				return OrcProto.RowIndexEntry.getDefaultInstance();
			}

			public OrcProto.RowIndexEntry build() {
				OrcProto.RowIndexEntry result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public OrcProto.RowIndexEntry buildPartial() {
				OrcProto.RowIndexEntry result = new OrcProto.RowIndexEntry(this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((bitField0_ & 0x00000001) == 0x00000001)) {
					positions_ = java.util.Collections.unmodifiableList(positions_);
					bitField0_ = (bitField0_ & ~0x00000001);
				}
				result.positions_ = positions_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000001;
				}
				if (statisticsBuilder_ == null) {
					result.statistics_ = statistics_;
				} else {
					result.statistics_ = statisticsBuilder_.build();
				}
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof OrcProto.RowIndexEntry) {
					return mergeFrom((OrcProto.RowIndexEntry) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(OrcProto.RowIndexEntry other) {
				if (other == OrcProto.RowIndexEntry.getDefaultInstance())
					return this;
				if (!other.positions_.isEmpty()) {
					if (positions_.isEmpty()) {
						positions_ = other.positions_;
						bitField0_ = (bitField0_ & ~0x00000001);
					} else {
						ensurePositionsIsMutable();
						positions_.addAll(other.positions_);
					}
					onChanged();
				}
				if (other.hasStatistics()) {
					mergeStatistics(other.getStatistics());
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				OrcProto.RowIndexEntry parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (OrcProto.RowIndexEntry) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			// repeated uint64 positions = 1 [packed = true];
			private java.util.List<java.lang.Long> positions_ = java.util.Collections.emptyList();

			private void ensurePositionsIsMutable() {
				if (!((bitField0_ & 0x00000001) == 0x00000001)) {
					positions_ = new java.util.ArrayList<java.lang.Long>(positions_);
					bitField0_ |= 0x00000001;
				}
			}

			/**
			 * <code>repeated uint64 positions = 1 [packed = true];</code>
			 */
			public java.util.List<java.lang.Long> getPositionsList() {
				return java.util.Collections.unmodifiableList(positions_);
			}

			/**
			 * <code>repeated uint64 positions = 1 [packed = true];</code>
			 */
			public int getPositionsCount() {
				return positions_.size();
			}

			/**
			 * <code>repeated uint64 positions = 1 [packed = true];</code>
			 */
			public long getPositions(int index) {
				return positions_.get(index);
			}

			/**
			 * <code>repeated uint64 positions = 1 [packed = true];</code>
			 */
			public Builder setPositions(int index, long value) {
				ensurePositionsIsMutable();
				positions_.set(index, value);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated uint64 positions = 1 [packed = true];</code>
			 */
			public Builder addPositions(long value) {
				ensurePositionsIsMutable();
				positions_.add(value);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated uint64 positions = 1 [packed = true];</code>
			 */
			public Builder addAllPositions(java.lang.Iterable<? extends java.lang.Long> values) {
				ensurePositionsIsMutable();
				super.addAll(values, positions_);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated uint64 positions = 1 [packed = true];</code>
			 */
			public Builder clearPositions() {
				positions_ = java.util.Collections.emptyList();
				bitField0_ = (bitField0_ & ~0x00000001);
				onChanged();
				return this;
			}

			// optional .ColumnStatistics statistics = 2;
			private OrcProto.ColumnStatistics statistics_ = OrcProto.ColumnStatistics.getDefaultInstance();
			private com.google.protobuf.SingleFieldBuilder<OrcProto.ColumnStatistics, OrcProto.ColumnStatistics.Builder, OrcProto.ColumnStatisticsOrBuilder> statisticsBuilder_;

			/**
			 * <code>optional .ColumnStatistics statistics = 2;</code>
			 */
			public boolean hasStatistics() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			/**
			 * <code>optional .ColumnStatistics statistics = 2;</code>
			 */
			public OrcProto.ColumnStatistics getStatistics() {
				if (statisticsBuilder_ == null) {
					return statistics_;
				} else {
					return statisticsBuilder_.getMessage();
				}
			}

			/**
			 * <code>optional .ColumnStatistics statistics = 2;</code>
			 */
			public Builder setStatistics(OrcProto.ColumnStatistics value) {
				if (statisticsBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					statistics_ = value;
					onChanged();
				} else {
					statisticsBuilder_.setMessage(value);
				}
				bitField0_ |= 0x00000002;
				return this;
			}

			/**
			 * <code>optional .ColumnStatistics statistics = 2;</code>
			 */
			public Builder setStatistics(OrcProto.ColumnStatistics.Builder builderForValue) {
				if (statisticsBuilder_ == null) {
					statistics_ = builderForValue.build();
					onChanged();
				} else {
					statisticsBuilder_.setMessage(builderForValue.build());
				}
				bitField0_ |= 0x00000002;
				return this;
			}

			/**
			 * <code>optional .ColumnStatistics statistics = 2;</code>
			 */
			public Builder mergeStatistics(OrcProto.ColumnStatistics value) {
				if (statisticsBuilder_ == null) {
					if (((bitField0_ & 0x00000002) == 0x00000002)
							&& statistics_ != OrcProto.ColumnStatistics.getDefaultInstance()) {
						statistics_ = OrcProto.ColumnStatistics.newBuilder(statistics_).mergeFrom(value).buildPartial();
					} else {
						statistics_ = value;
					}
					onChanged();
				} else {
					statisticsBuilder_.mergeFrom(value);
				}
				bitField0_ |= 0x00000002;
				return this;
			}

			/**
			 * <code>optional .ColumnStatistics statistics = 2;</code>
			 */
			public Builder clearStatistics() {
				if (statisticsBuilder_ == null) {
					statistics_ = OrcProto.ColumnStatistics.getDefaultInstance();
					onChanged();
				} else {
					statisticsBuilder_.clear();
				}
				bitField0_ = (bitField0_ & ~0x00000002);
				return this;
			}

			/**
			 * <code>optional .ColumnStatistics statistics = 2;</code>
			 */
			public OrcProto.ColumnStatistics.Builder getStatisticsBuilder() {
				bitField0_ |= 0x00000002;
				onChanged();
				return getStatisticsFieldBuilder().getBuilder();
			}

			/**
			 * <code>optional .ColumnStatistics statistics = 2;</code>
			 */
			public OrcProto.ColumnStatisticsOrBuilder getStatisticsOrBuilder() {
				if (statisticsBuilder_ != null) {
					return statisticsBuilder_.getMessageOrBuilder();
				} else {
					return statistics_;
				}
			}

			/**
			 * <code>optional .ColumnStatistics statistics = 2;</code>
			 */
			private com.google.protobuf.SingleFieldBuilder<OrcProto.ColumnStatistics, OrcProto.ColumnStatistics.Builder, OrcProto.ColumnStatisticsOrBuilder> getStatisticsFieldBuilder() {
				if (statisticsBuilder_ == null) {
					statisticsBuilder_ = new com.google.protobuf.SingleFieldBuilder<OrcProto.ColumnStatistics, OrcProto.ColumnStatistics.Builder, OrcProto.ColumnStatisticsOrBuilder>(
							statistics_, getParentForChildren(), isClean());
					statistics_ = null;
				}
				return statisticsBuilder_;
			}

			// @@protoc_insertion_point(builder_scope:RowIndexEntry)
		}

		static {
			defaultInstance = new RowIndexEntry(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:RowIndexEntry)
	}

	public interface RowIndexOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// repeated .RowIndexEntry entry = 1;
		/**
		 * <code>repeated .RowIndexEntry entry = 1;</code>
		 */
		java.util.List<OrcProto.RowIndexEntry> getEntryList();

		/**
		 * <code>repeated .RowIndexEntry entry = 1;</code>
		 */
		OrcProto.RowIndexEntry getEntry(int index);

		/**
		 * <code>repeated .RowIndexEntry entry = 1;</code>
		 */
		int getEntryCount();

		/**
		 * <code>repeated .RowIndexEntry entry = 1;</code>
		 */
		java.util.List<? extends OrcProto.RowIndexEntryOrBuilder> getEntryOrBuilderList();

		/**
		 * <code>repeated .RowIndexEntry entry = 1;</code>
		 */
		OrcProto.RowIndexEntryOrBuilder getEntryOrBuilder(int index);
	}

	/**
	 * Protobuf type {@code RowIndex}
	 */
	public static final class RowIndex extends com.google.protobuf.GeneratedMessage implements RowIndexOrBuilder {
		// Use RowIndex.newBuilder() to construct.
		private RowIndex(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private RowIndex(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final RowIndex defaultInstance;

		public static RowIndex getDefaultInstance() {
			return defaultInstance;
		}

		public RowIndex getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private RowIndex(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			int mutable_bitField0_ = 0;
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 10: {
						if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
							entry_ = new java.util.ArrayList<OrcProto.RowIndexEntry>();
							mutable_bitField0_ |= 0x00000001;
						}
						entry_.add(input.readMessage(OrcProto.RowIndexEntry.PARSER, extensionRegistry));
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
			} finally {
				if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
					entry_ = java.util.Collections.unmodifiableList(entry_);
				}
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndex_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndex_fieldAccessorTable
					.ensureFieldAccessorsInitialized(OrcProto.RowIndex.class, OrcProto.RowIndex.Builder.class);
		}

		public static com.google.protobuf.Parser<RowIndex> PARSER = new com.google.protobuf.AbstractParser<RowIndex>() {
			public RowIndex parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new RowIndex(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<RowIndex> getParserForType() {
			return PARSER;
		}

		// repeated .RowIndexEntry entry = 1;
		public static final int ENTRY_FIELD_NUMBER = 1;
		private java.util.List<OrcProto.RowIndexEntry> entry_;

		/**
		 * <code>repeated .RowIndexEntry entry = 1;</code>
		 */
		public java.util.List<OrcProto.RowIndexEntry> getEntryList() {
			return entry_;
		}

		/**
		 * <code>repeated .RowIndexEntry entry = 1;</code>
		 */
		public java.util.List<? extends OrcProto.RowIndexEntryOrBuilder> getEntryOrBuilderList() {
			return entry_;
		}

		/**
		 * <code>repeated .RowIndexEntry entry = 1;</code>
		 */
		public int getEntryCount() {
			return entry_.size();
		}

		/**
		 * <code>repeated .RowIndexEntry entry = 1;</code>
		 */
		public OrcProto.RowIndexEntry getEntry(int index) {
			return entry_.get(index);
		}

		/**
		 * <code>repeated .RowIndexEntry entry = 1;</code>
		 */
		public OrcProto.RowIndexEntryOrBuilder getEntryOrBuilder(int index) {
			return entry_.get(index);
		}

		private void initFields() {
			entry_ = java.util.Collections.emptyList();
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			for (int i = 0; i < entry_.size(); i++) {
				output.writeMessage(1, entry_.get(i));
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			for (int i = 0; i < entry_.size(); i++) {
				size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, entry_.get(i));
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static OrcProto.RowIndex parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.RowIndex parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.RowIndex parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.RowIndex parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.RowIndex parseFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.RowIndex parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static OrcProto.RowIndex parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static OrcProto.RowIndex parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static OrcProto.RowIndex parseFrom(com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.RowIndex parseFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(OrcProto.RowIndex prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code RowIndex}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				OrcProto.RowIndexOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndex_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndex_fieldAccessorTable
						.ensureFieldAccessorsInitialized(OrcProto.RowIndex.class, OrcProto.RowIndex.Builder.class);
			}

			// Construct using OrcProto.RowIndex.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
					getEntryFieldBuilder();
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				if (entryBuilder_ == null) {
					entry_ = java.util.Collections.emptyList();
					bitField0_ = (bitField0_ & ~0x00000001);
				} else {
					entryBuilder_.clear();
				}
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndex_descriptor;
			}

			public OrcProto.RowIndex getDefaultInstanceForType() {
				return OrcProto.RowIndex.getDefaultInstance();
			}

			public OrcProto.RowIndex build() {
				OrcProto.RowIndex result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public OrcProto.RowIndex buildPartial() {
				OrcProto.RowIndex result = new OrcProto.RowIndex(this);
				if (entryBuilder_ == null) {
					if (((bitField0_ & 0x00000001) == 0x00000001)) {
						entry_ = java.util.Collections.unmodifiableList(entry_);
						bitField0_ = (bitField0_ & ~0x00000001);
					}
					result.entry_ = entry_;
				} else {
					result.entry_ = entryBuilder_.build();
				}
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof OrcProto.RowIndex) {
					return mergeFrom((OrcProto.RowIndex) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(OrcProto.RowIndex other) {
				if (other == OrcProto.RowIndex.getDefaultInstance())
					return this;
				if (entryBuilder_ == null) {
					if (!other.entry_.isEmpty()) {
						if (entry_.isEmpty()) {
							entry_ = other.entry_;
							bitField0_ = (bitField0_ & ~0x00000001);
						} else {
							ensureEntryIsMutable();
							entry_.addAll(other.entry_);
						}
						onChanged();
					}
				} else {
					if (!other.entry_.isEmpty()) {
						if (entryBuilder_.isEmpty()) {
							entryBuilder_.dispose();
							entryBuilder_ = null;
							entry_ = other.entry_;
							bitField0_ = (bitField0_ & ~0x00000001);
							entryBuilder_ = com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ? getEntryFieldBuilder()
									: null;
						} else {
							entryBuilder_.addAllMessages(other.entry_);
						}
					}
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				OrcProto.RowIndex parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (OrcProto.RowIndex) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			// repeated .RowIndexEntry entry = 1;
			private java.util.List<OrcProto.RowIndexEntry> entry_ = java.util.Collections.emptyList();

			private void ensureEntryIsMutable() {
				if (!((bitField0_ & 0x00000001) == 0x00000001)) {
					entry_ = new java.util.ArrayList<OrcProto.RowIndexEntry>(entry_);
					bitField0_ |= 0x00000001;
				}
			}

			private com.google.protobuf.RepeatedFieldBuilder<OrcProto.RowIndexEntry, OrcProto.RowIndexEntry.Builder, OrcProto.RowIndexEntryOrBuilder> entryBuilder_;

			/**
			 * <code>repeated .RowIndexEntry entry = 1;</code>
			 */
			public java.util.List<OrcProto.RowIndexEntry> getEntryList() {
				if (entryBuilder_ == null) {
					return java.util.Collections.unmodifiableList(entry_);
				} else {
					return entryBuilder_.getMessageList();
				}
			}

			/**
			 * <code>repeated .RowIndexEntry entry = 1;</code>
			 */
			public int getEntryCount() {
				if (entryBuilder_ == null) {
					return entry_.size();
				} else {
					return entryBuilder_.getCount();
				}
			}

			/**
			 * <code>repeated .RowIndexEntry entry = 1;</code>
			 */
			public OrcProto.RowIndexEntry getEntry(int index) {
				if (entryBuilder_ == null) {
					return entry_.get(index);
				} else {
					return entryBuilder_.getMessage(index);
				}
			}

			/**
			 * <code>repeated .RowIndexEntry entry = 1;</code>
			 */
			public Builder setEntry(int index, OrcProto.RowIndexEntry value) {
				if (entryBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureEntryIsMutable();
					entry_.set(index, value);
					onChanged();
				} else {
					entryBuilder_.setMessage(index, value);
				}
				return this;
			}

			/**
			 * <code>repeated .RowIndexEntry entry = 1;</code>
			 */
			public Builder setEntry(int index, OrcProto.RowIndexEntry.Builder builderForValue) {
				if (entryBuilder_ == null) {
					ensureEntryIsMutable();
					entry_.set(index, builderForValue.build());
					onChanged();
				} else {
					entryBuilder_.setMessage(index, builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .RowIndexEntry entry = 1;</code>
			 */
			public Builder addEntry(OrcProto.RowIndexEntry value) {
				if (entryBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureEntryIsMutable();
					entry_.add(value);
					onChanged();
				} else {
					entryBuilder_.addMessage(value);
				}
				return this;
			}

			/**
			 * <code>repeated .RowIndexEntry entry = 1;</code>
			 */
			public Builder addEntry(int index, OrcProto.RowIndexEntry value) {
				if (entryBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureEntryIsMutable();
					entry_.add(index, value);
					onChanged();
				} else {
					entryBuilder_.addMessage(index, value);
				}
				return this;
			}

			/**
			 * <code>repeated .RowIndexEntry entry = 1;</code>
			 */
			public Builder addEntry(OrcProto.RowIndexEntry.Builder builderForValue) {
				if (entryBuilder_ == null) {
					ensureEntryIsMutable();
					entry_.add(builderForValue.build());
					onChanged();
				} else {
					entryBuilder_.addMessage(builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .RowIndexEntry entry = 1;</code>
			 */
			public Builder addEntry(int index, OrcProto.RowIndexEntry.Builder builderForValue) {
				if (entryBuilder_ == null) {
					ensureEntryIsMutable();
					entry_.add(index, builderForValue.build());
					onChanged();
				} else {
					entryBuilder_.addMessage(index, builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .RowIndexEntry entry = 1;</code>
			 */
			public Builder addAllEntry(java.lang.Iterable<? extends OrcProto.RowIndexEntry> values) {
				if (entryBuilder_ == null) {
					ensureEntryIsMutable();
					super.addAll(values, entry_);
					onChanged();
				} else {
					entryBuilder_.addAllMessages(values);
				}
				return this;
			}

			/**
			 * <code>repeated .RowIndexEntry entry = 1;</code>
			 */
			public Builder clearEntry() {
				if (entryBuilder_ == null) {
					entry_ = java.util.Collections.emptyList();
					bitField0_ = (bitField0_ & ~0x00000001);
					onChanged();
				} else {
					entryBuilder_.clear();
				}
				return this;
			}

			/**
			 * <code>repeated .RowIndexEntry entry = 1;</code>
			 */
			public Builder removeEntry(int index) {
				if (entryBuilder_ == null) {
					ensureEntryIsMutable();
					entry_.remove(index);
					onChanged();
				} else {
					entryBuilder_.remove(index);
				}
				return this;
			}

			/**
			 * <code>repeated .RowIndexEntry entry = 1;</code>
			 */
			public OrcProto.RowIndexEntry.Builder getEntryBuilder(int index) {
				return getEntryFieldBuilder().getBuilder(index);
			}

			/**
			 * <code>repeated .RowIndexEntry entry = 1;</code>
			 */
			public OrcProto.RowIndexEntryOrBuilder getEntryOrBuilder(int index) {
				if (entryBuilder_ == null) {
					return entry_.get(index);
				} else {
					return entryBuilder_.getMessageOrBuilder(index);
				}
			}

			/**
			 * <code>repeated .RowIndexEntry entry = 1;</code>
			 */
			public java.util.List<? extends OrcProto.RowIndexEntryOrBuilder> getEntryOrBuilderList() {
				if (entryBuilder_ != null) {
					return entryBuilder_.getMessageOrBuilderList();
				} else {
					return java.util.Collections.unmodifiableList(entry_);
				}
			}

			/**
			 * <code>repeated .RowIndexEntry entry = 1;</code>
			 */
			public OrcProto.RowIndexEntry.Builder addEntryBuilder() {
				return getEntryFieldBuilder().addBuilder(OrcProto.RowIndexEntry.getDefaultInstance());
			}

			/**
			 * <code>repeated .RowIndexEntry entry = 1;</code>
			 */
			public OrcProto.RowIndexEntry.Builder addEntryBuilder(int index) {
				return getEntryFieldBuilder().addBuilder(index, OrcProto.RowIndexEntry.getDefaultInstance());
			}

			/**
			 * <code>repeated .RowIndexEntry entry = 1;</code>
			 */
			public java.util.List<OrcProto.RowIndexEntry.Builder> getEntryBuilderList() {
				return getEntryFieldBuilder().getBuilderList();
			}

			private com.google.protobuf.RepeatedFieldBuilder<OrcProto.RowIndexEntry, OrcProto.RowIndexEntry.Builder, OrcProto.RowIndexEntryOrBuilder> getEntryFieldBuilder() {
				if (entryBuilder_ == null) {
					entryBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<OrcProto.RowIndexEntry, OrcProto.RowIndexEntry.Builder, OrcProto.RowIndexEntryOrBuilder>(
							entry_, ((bitField0_ & 0x00000001) == 0x00000001), getParentForChildren(), isClean());
					entry_ = null;
				}
				return entryBuilder_;
			}

			// @@protoc_insertion_point(builder_scope:RowIndex)
		}

		static {
			defaultInstance = new RowIndex(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:RowIndex)
	}

	public interface StreamOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// required .Stream.Kind kind = 1;
		/**
		 * <code>required .Stream.Kind kind = 1;</code>
		 */
		boolean hasKind();

		/**
		 * <code>required .Stream.Kind kind = 1;</code>
		 */
		OrcProto.Stream.Kind getKind();

		// optional uint32 column = 2;
		/**
		 * <code>optional uint32 column = 2;</code>
		 */
		boolean hasColumn();

		/**
		 * <code>optional uint32 column = 2;</code>
		 */
		int getColumn();

		// optional uint64 length = 3;
		/**
		 * <code>optional uint64 length = 3;</code>
		 */
		boolean hasLength();

		/**
		 * <code>optional uint64 length = 3;</code>
		 */
		long getLength();
	}

	/**
	 * Protobuf type {@code Stream}
	 */
	public static final class Stream extends com.google.protobuf.GeneratedMessage implements StreamOrBuilder {
		// Use Stream.newBuilder() to construct.
		private Stream(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private Stream(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final Stream defaultInstance;

		public static Stream getDefaultInstance() {
			return defaultInstance;
		}

		public Stream getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private Stream(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 8: {
						int rawValue = input.readEnum();
						OrcProto.Stream.Kind value = OrcProto.Stream.Kind.valueOf(rawValue);
						if (value == null) {
							unknownFields.mergeVarintField(1, rawValue);
						} else {
							bitField0_ |= 0x00000001;
							kind_ = value;
						}
						break;
					}
					case 16: {
						bitField0_ |= 0x00000002;
						column_ = input.readUInt32();
						break;
					}
					case 24: {
						bitField0_ |= 0x00000004;
						length_ = input.readUInt64();
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
			} finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_Stream_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_Stream_fieldAccessorTable
					.ensureFieldAccessorsInitialized(OrcProto.Stream.class, OrcProto.Stream.Builder.class);
		}

		public static com.google.protobuf.Parser<Stream> PARSER = new com.google.protobuf.AbstractParser<Stream>() {
			public Stream parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new Stream(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<Stream> getParserForType() {
			return PARSER;
		}

		/**
		 * Protobuf enum {@code Stream.Kind}
		 * 
		 * <pre>
		 * if you add new index stream kinds, you need to make sure to update
		 * StreamName to ensure it is added to the stripe in the right area
		 * </pre>
		 */
		public enum Kind implements com.google.protobuf.ProtocolMessageEnum {
			/**
			 * <code>PRESENT = 0;</code>
			 */
			PRESENT(0, 0),
			/**
			 * <code>DATA = 1;</code>
			 */
			DATA(1, 1),
			/**
			 * <code>LENGTH = 2;</code>
			 */
			LENGTH(2, 2),
			/**
			 * <code>DICTIONARY_DATA = 3;</code>
			 */
			DICTIONARY_DATA(3, 3),
			/**
			 * <code>DICTIONARY_COUNT = 4;</code>
			 */
			DICTIONARY_COUNT(4, 4),
			/**
			 * <code>SECONDARY = 5;</code>
			 */
			SECONDARY(5, 5),
			/**
			 * <code>ROW_INDEX = 6;</code>
			 */
			ROW_INDEX(6, 6), ;

			/**
			 * <code>PRESENT = 0;</code>
			 */
			public static final int PRESENT_VALUE = 0;
			/**
			 * <code>DATA = 1;</code>
			 */
			public static final int DATA_VALUE = 1;
			/**
			 * <code>LENGTH = 2;</code>
			 */
			public static final int LENGTH_VALUE = 2;
			/**
			 * <code>DICTIONARY_DATA = 3;</code>
			 */
			public static final int DICTIONARY_DATA_VALUE = 3;
			/**
			 * <code>DICTIONARY_COUNT = 4;</code>
			 */
			public static final int DICTIONARY_COUNT_VALUE = 4;
			/**
			 * <code>SECONDARY = 5;</code>
			 */
			public static final int SECONDARY_VALUE = 5;
			/**
			 * <code>ROW_INDEX = 6;</code>
			 */
			public static final int ROW_INDEX_VALUE = 6;

			public final int getNumber() {
				return value;
			}

			public static Kind valueOf(int value) {
				switch (value) {
				case 0:
					return PRESENT;
				case 1:
					return DATA;
				case 2:
					return LENGTH;
				case 3:
					return DICTIONARY_DATA;
				case 4:
					return DICTIONARY_COUNT;
				case 5:
					return SECONDARY;
				case 6:
					return ROW_INDEX;
				default:
					return null;
				}
			}

			public static com.google.protobuf.Internal.EnumLiteMap<Kind> internalGetValueMap() {
				return internalValueMap;
			}

			private static com.google.protobuf.Internal.EnumLiteMap<Kind> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<Kind>() {
				public Kind findValueByNumber(int number) {
					return Kind.valueOf(number);
				}
			};

			public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
				return getDescriptor().getValues().get(index);
			}

			public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
				return getDescriptor();
			}

			public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
				return OrcProto.Stream.getDescriptor().getEnumTypes().get(0);
			}

			private static final Kind[] VALUES = values();

			public static Kind valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
				if (desc.getType() != getDescriptor()) {
					throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
				}
				return VALUES[desc.getIndex()];
			}

			private final int index;
			private final int value;

			private Kind(int index, int value) {
				this.index = index;
				this.value = value;
			}

			// @@protoc_insertion_point(enum_scope:Stream.Kind)
		}

		private int bitField0_;
		// required .Stream.Kind kind = 1;
		public static final int KIND_FIELD_NUMBER = 1;
		private OrcProto.Stream.Kind kind_;

		/**
		 * <code>required .Stream.Kind kind = 1;</code>
		 */
		public boolean hasKind() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>required .Stream.Kind kind = 1;</code>
		 */
		public OrcProto.Stream.Kind getKind() {
			return kind_;
		}

		// optional uint32 column = 2;
		public static final int COLUMN_FIELD_NUMBER = 2;
		private int column_;

		/**
		 * <code>optional uint32 column = 2;</code>
		 */
		public boolean hasColumn() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>optional uint32 column = 2;</code>
		 */
		public int getColumn() {
			return column_;
		}

		// optional uint64 length = 3;
		public static final int LENGTH_FIELD_NUMBER = 3;
		private long length_;

		/**
		 * <code>optional uint64 length = 3;</code>
		 */
		public boolean hasLength() {
			return ((bitField0_ & 0x00000004) == 0x00000004);
		}

		/**
		 * <code>optional uint64 length = 3;</code>
		 */
		public long getLength() {
			return length_;
		}

		private void initFields() {
			kind_ = OrcProto.Stream.Kind.PRESENT;
			column_ = 0;
			length_ = 0L;
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			if (!hasKind()) {
				memoizedIsInitialized = 0;
				return false;
			}
			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeEnum(1, kind_.getNumber());
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeUInt32(2, column_);
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				output.writeUInt64(3, length_);
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, kind_.getNumber());
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream.computeUInt32Size(2, column_);
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				size += com.google.protobuf.CodedOutputStream.computeUInt64Size(3, length_);
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static OrcProto.Stream parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.Stream parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.Stream parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.Stream parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.Stream parseFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.Stream parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static OrcProto.Stream parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static OrcProto.Stream parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static OrcProto.Stream parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.Stream parseFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(OrcProto.Stream prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code Stream}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				OrcProto.StreamOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_Stream_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_Stream_fieldAccessorTable
						.ensureFieldAccessorsInitialized(OrcProto.Stream.class, OrcProto.Stream.Builder.class);
			}

			// Construct using OrcProto.Stream.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				kind_ = OrcProto.Stream.Kind.PRESENT;
				bitField0_ = (bitField0_ & ~0x00000001);
				column_ = 0;
				bitField0_ = (bitField0_ & ~0x00000002);
				length_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000004);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_Stream_descriptor;
			}

			public OrcProto.Stream getDefaultInstanceForType() {
				return OrcProto.Stream.getDefaultInstance();
			}

			public OrcProto.Stream build() {
				OrcProto.Stream result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public OrcProto.Stream buildPartial() {
				OrcProto.Stream result = new OrcProto.Stream(this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.kind_ = kind_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				result.column_ = column_;
				if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
					to_bitField0_ |= 0x00000004;
				}
				result.length_ = length_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof OrcProto.Stream) {
					return mergeFrom((OrcProto.Stream) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(OrcProto.Stream other) {
				if (other == OrcProto.Stream.getDefaultInstance())
					return this;
				if (other.hasKind()) {
					setKind(other.getKind());
				}
				if (other.hasColumn()) {
					setColumn(other.getColumn());
				}
				if (other.hasLength()) {
					setLength(other.getLength());
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				if (!hasKind()) {

					return false;
				}
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				OrcProto.Stream parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (OrcProto.Stream) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			// required .Stream.Kind kind = 1;
			private OrcProto.Stream.Kind kind_ = OrcProto.Stream.Kind.PRESENT;

			/**
			 * <code>required .Stream.Kind kind = 1;</code>
			 */
			public boolean hasKind() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <code>required .Stream.Kind kind = 1;</code>
			 */
			public OrcProto.Stream.Kind getKind() {
				return kind_;
			}

			/**
			 * <code>required .Stream.Kind kind = 1;</code>
			 */
			public Builder setKind(OrcProto.Stream.Kind value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000001;
				kind_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>required .Stream.Kind kind = 1;</code>
			 */
			public Builder clearKind() {
				bitField0_ = (bitField0_ & ~0x00000001);
				kind_ = OrcProto.Stream.Kind.PRESENT;
				onChanged();
				return this;
			}

			// optional uint32 column = 2;
			private int column_;

			/**
			 * <code>optional uint32 column = 2;</code>
			 */
			public boolean hasColumn() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			/**
			 * <code>optional uint32 column = 2;</code>
			 */
			public int getColumn() {
				return column_;
			}

			/**
			 * <code>optional uint32 column = 2;</code>
			 */
			public Builder setColumn(int value) {
				bitField0_ |= 0x00000002;
				column_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional uint32 column = 2;</code>
			 */
			public Builder clearColumn() {
				bitField0_ = (bitField0_ & ~0x00000002);
				column_ = 0;
				onChanged();
				return this;
			}

			// optional uint64 length = 3;
			private long length_;

			/**
			 * <code>optional uint64 length = 3;</code>
			 */
			public boolean hasLength() {
				return ((bitField0_ & 0x00000004) == 0x00000004);
			}

			/**
			 * <code>optional uint64 length = 3;</code>
			 */
			public long getLength() {
				return length_;
			}

			/**
			 * <code>optional uint64 length = 3;</code>
			 */
			public Builder setLength(long value) {
				bitField0_ |= 0x00000004;
				length_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional uint64 length = 3;</code>
			 */
			public Builder clearLength() {
				bitField0_ = (bitField0_ & ~0x00000004);
				length_ = 0L;
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:Stream)
		}

		static {
			defaultInstance = new Stream(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:Stream)
	}

	public interface ColumnEncodingOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// required .ColumnEncoding.Kind kind = 1;
		/**
		 * <code>required .ColumnEncoding.Kind kind = 1;</code>
		 */
		boolean hasKind();

		/**
		 * <code>required .ColumnEncoding.Kind kind = 1;</code>
		 */
		OrcProto.ColumnEncoding.Kind getKind();

		// optional uint32 dictionarySize = 2;
		/**
		 * <code>optional uint32 dictionarySize = 2;</code>
		 */
		boolean hasDictionarySize();

		/**
		 * <code>optional uint32 dictionarySize = 2;</code>
		 */
		int getDictionarySize();
	}

	/**
	 * Protobuf type {@code ColumnEncoding}
	 */
	public static final class ColumnEncoding extends com.google.protobuf.GeneratedMessage implements
			ColumnEncodingOrBuilder {
		// Use ColumnEncoding.newBuilder() to construct.
		private ColumnEncoding(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private ColumnEncoding(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final ColumnEncoding defaultInstance;

		public static ColumnEncoding getDefaultInstance() {
			return defaultInstance;
		}

		public ColumnEncoding getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private ColumnEncoding(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 8: {
						int rawValue = input.readEnum();
						OrcProto.ColumnEncoding.Kind value = OrcProto.ColumnEncoding.Kind.valueOf(rawValue);
						if (value == null) {
							unknownFields.mergeVarintField(1, rawValue);
						} else {
							bitField0_ |= 0x00000001;
							kind_ = value;
						}
						break;
					}
					case 16: {
						bitField0_ |= 0x00000002;
						dictionarySize_ = input.readUInt32();
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
			} finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnEncoding_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnEncoding_fieldAccessorTable
					.ensureFieldAccessorsInitialized(OrcProto.ColumnEncoding.class,
							OrcProto.ColumnEncoding.Builder.class);
		}

		public static com.google.protobuf.Parser<ColumnEncoding> PARSER = new com.google.protobuf.AbstractParser<ColumnEncoding>() {
			public ColumnEncoding parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new ColumnEncoding(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<ColumnEncoding> getParserForType() {
			return PARSER;
		}

		/**
		 * Protobuf enum {@code ColumnEncoding.Kind}
		 */
		public enum Kind implements com.google.protobuf.ProtocolMessageEnum {
			/**
			 * <code>DIRECT = 0;</code>
			 */
			DIRECT(0, 0),
			/**
			 * <code>DICTIONARY = 1;</code>
			 */
			DICTIONARY(1, 1),
			/**
			 * <code>DIRECT_V2 = 2;</code>
			 */
			DIRECT_V2(2, 2),
			/**
			 * <code>DICTIONARY_V2 = 3;</code>
			 */
			DICTIONARY_V2(3, 3), ;

			/**
			 * <code>DIRECT = 0;</code>
			 */
			public static final int DIRECT_VALUE = 0;
			/**
			 * <code>DICTIONARY = 1;</code>
			 */
			public static final int DICTIONARY_VALUE = 1;
			/**
			 * <code>DIRECT_V2 = 2;</code>
			 */
			public static final int DIRECT_V2_VALUE = 2;
			/**
			 * <code>DICTIONARY_V2 = 3;</code>
			 */
			public static final int DICTIONARY_V2_VALUE = 3;

			public final int getNumber() {
				return value;
			}

			public static Kind valueOf(int value) {
				switch (value) {
				case 0:
					return DIRECT;
				case 1:
					return DICTIONARY;
				case 2:
					return DIRECT_V2;
				case 3:
					return DICTIONARY_V2;
				default:
					return null;
				}
			}

			public static com.google.protobuf.Internal.EnumLiteMap<Kind> internalGetValueMap() {
				return internalValueMap;
			}

			private static com.google.protobuf.Internal.EnumLiteMap<Kind> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<Kind>() {
				public Kind findValueByNumber(int number) {
					return Kind.valueOf(number);
				}
			};

			public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
				return getDescriptor().getValues().get(index);
			}

			public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
				return getDescriptor();
			}

			public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
				return OrcProto.ColumnEncoding.getDescriptor().getEnumTypes().get(0);
			}

			private static final Kind[] VALUES = values();

			public static Kind valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
				if (desc.getType() != getDescriptor()) {
					throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
				}
				return VALUES[desc.getIndex()];
			}

			private final int index;
			private final int value;

			private Kind(int index, int value) {
				this.index = index;
				this.value = value;
			}

			// @@protoc_insertion_point(enum_scope:ColumnEncoding.Kind)
		}

		private int bitField0_;
		// required .ColumnEncoding.Kind kind = 1;
		public static final int KIND_FIELD_NUMBER = 1;
		private OrcProto.ColumnEncoding.Kind kind_;

		/**
		 * <code>required .ColumnEncoding.Kind kind = 1;</code>
		 */
		public boolean hasKind() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>required .ColumnEncoding.Kind kind = 1;</code>
		 */
		public OrcProto.ColumnEncoding.Kind getKind() {
			return kind_;
		}

		// optional uint32 dictionarySize = 2;
		public static final int DICTIONARYSIZE_FIELD_NUMBER = 2;
		private int dictionarySize_;

		/**
		 * <code>optional uint32 dictionarySize = 2;</code>
		 */
		public boolean hasDictionarySize() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>optional uint32 dictionarySize = 2;</code>
		 */
		public int getDictionarySize() {
			return dictionarySize_;
		}

		private void initFields() {
			kind_ = OrcProto.ColumnEncoding.Kind.DIRECT;
			dictionarySize_ = 0;
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			if (!hasKind()) {
				memoizedIsInitialized = 0;
				return false;
			}
			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeEnum(1, kind_.getNumber());
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeUInt32(2, dictionarySize_);
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, kind_.getNumber());
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream.computeUInt32Size(2, dictionarySize_);
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static OrcProto.ColumnEncoding parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.ColumnEncoding parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.ColumnEncoding parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.ColumnEncoding parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.ColumnEncoding parseFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.ColumnEncoding parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static OrcProto.ColumnEncoding parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static OrcProto.ColumnEncoding parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static OrcProto.ColumnEncoding parseFrom(com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.ColumnEncoding parseFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(OrcProto.ColumnEncoding prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code ColumnEncoding}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				OrcProto.ColumnEncodingOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnEncoding_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnEncoding_fieldAccessorTable
						.ensureFieldAccessorsInitialized(OrcProto.ColumnEncoding.class,
								OrcProto.ColumnEncoding.Builder.class);
			}

			// Construct using OrcProto.ColumnEncoding.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				kind_ = OrcProto.ColumnEncoding.Kind.DIRECT;
				bitField0_ = (bitField0_ & ~0x00000001);
				dictionarySize_ = 0;
				bitField0_ = (bitField0_ & ~0x00000002);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnEncoding_descriptor;
			}

			public OrcProto.ColumnEncoding getDefaultInstanceForType() {
				return OrcProto.ColumnEncoding.getDefaultInstance();
			}

			public OrcProto.ColumnEncoding build() {
				OrcProto.ColumnEncoding result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public OrcProto.ColumnEncoding buildPartial() {
				OrcProto.ColumnEncoding result = new OrcProto.ColumnEncoding(this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.kind_ = kind_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				result.dictionarySize_ = dictionarySize_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof OrcProto.ColumnEncoding) {
					return mergeFrom((OrcProto.ColumnEncoding) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(OrcProto.ColumnEncoding other) {
				if (other == OrcProto.ColumnEncoding.getDefaultInstance())
					return this;
				if (other.hasKind()) {
					setKind(other.getKind());
				}
				if (other.hasDictionarySize()) {
					setDictionarySize(other.getDictionarySize());
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				if (!hasKind()) {

					return false;
				}
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				OrcProto.ColumnEncoding parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (OrcProto.ColumnEncoding) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			// required .ColumnEncoding.Kind kind = 1;
			private OrcProto.ColumnEncoding.Kind kind_ = OrcProto.ColumnEncoding.Kind.DIRECT;

			/**
			 * <code>required .ColumnEncoding.Kind kind = 1;</code>
			 */
			public boolean hasKind() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <code>required .ColumnEncoding.Kind kind = 1;</code>
			 */
			public OrcProto.ColumnEncoding.Kind getKind() {
				return kind_;
			}

			/**
			 * <code>required .ColumnEncoding.Kind kind = 1;</code>
			 */
			public Builder setKind(OrcProto.ColumnEncoding.Kind value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000001;
				kind_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>required .ColumnEncoding.Kind kind = 1;</code>
			 */
			public Builder clearKind() {
				bitField0_ = (bitField0_ & ~0x00000001);
				kind_ = OrcProto.ColumnEncoding.Kind.DIRECT;
				onChanged();
				return this;
			}

			// optional uint32 dictionarySize = 2;
			private int dictionarySize_;

			/**
			 * <code>optional uint32 dictionarySize = 2;</code>
			 */
			public boolean hasDictionarySize() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			/**
			 * <code>optional uint32 dictionarySize = 2;</code>
			 */
			public int getDictionarySize() {
				return dictionarySize_;
			}

			/**
			 * <code>optional uint32 dictionarySize = 2;</code>
			 */
			public Builder setDictionarySize(int value) {
				bitField0_ |= 0x00000002;
				dictionarySize_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional uint32 dictionarySize = 2;</code>
			 */
			public Builder clearDictionarySize() {
				bitField0_ = (bitField0_ & ~0x00000002);
				dictionarySize_ = 0;
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:ColumnEncoding)
		}

		static {
			defaultInstance = new ColumnEncoding(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:ColumnEncoding)
	}

	public interface StripeFooterOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// repeated .Stream streams = 1;
		/**
		 * <code>repeated .Stream streams = 1;</code>
		 */
		java.util.List<OrcProto.Stream> getStreamsList();

		/**
		 * <code>repeated .Stream streams = 1;</code>
		 */
		OrcProto.Stream getStreams(int index);

		/**
		 * <code>repeated .Stream streams = 1;</code>
		 */
		int getStreamsCount();

		/**
		 * <code>repeated .Stream streams = 1;</code>
		 */
		java.util.List<? extends OrcProto.StreamOrBuilder> getStreamsOrBuilderList();

		/**
		 * <code>repeated .Stream streams = 1;</code>
		 */
		OrcProto.StreamOrBuilder getStreamsOrBuilder(int index);

		// repeated .ColumnEncoding columns = 2;
		/**
		 * <code>repeated .ColumnEncoding columns = 2;</code>
		 */
		java.util.List<OrcProto.ColumnEncoding> getColumnsList();

		/**
		 * <code>repeated .ColumnEncoding columns = 2;</code>
		 */
		OrcProto.ColumnEncoding getColumns(int index);

		/**
		 * <code>repeated .ColumnEncoding columns = 2;</code>
		 */
		int getColumnsCount();

		/**
		 * <code>repeated .ColumnEncoding columns = 2;</code>
		 */
		java.util.List<? extends OrcProto.ColumnEncodingOrBuilder> getColumnsOrBuilderList();

		/**
		 * <code>repeated .ColumnEncoding columns = 2;</code>
		 */
		OrcProto.ColumnEncodingOrBuilder getColumnsOrBuilder(int index);
	}

	/**
	 * Protobuf type {@code StripeFooter}
	 */
	public static final class StripeFooter extends com.google.protobuf.GeneratedMessage implements
			StripeFooterOrBuilder {
		// Use StripeFooter.newBuilder() to construct.
		private StripeFooter(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private StripeFooter(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final StripeFooter defaultInstance;

		public static StripeFooter getDefaultInstance() {
			return defaultInstance;
		}

		public StripeFooter getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private StripeFooter(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			int mutable_bitField0_ = 0;
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 10: {
						if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
							streams_ = new java.util.ArrayList<OrcProto.Stream>();
							mutable_bitField0_ |= 0x00000001;
						}
						streams_.add(input.readMessage(OrcProto.Stream.PARSER, extensionRegistry));
						break;
					}
					case 18: {
						if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
							columns_ = new java.util.ArrayList<OrcProto.ColumnEncoding>();
							mutable_bitField0_ |= 0x00000002;
						}
						columns_.add(input.readMessage(OrcProto.ColumnEncoding.PARSER, extensionRegistry));
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
			} finally {
				if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
					streams_ = java.util.Collections.unmodifiableList(streams_);
				}
				if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
					columns_ = java.util.Collections.unmodifiableList(columns_);
				}
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_StripeFooter_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_StripeFooter_fieldAccessorTable
					.ensureFieldAccessorsInitialized(OrcProto.StripeFooter.class, OrcProto.StripeFooter.Builder.class);
		}

		public static com.google.protobuf.Parser<StripeFooter> PARSER = new com.google.protobuf.AbstractParser<StripeFooter>() {
			public StripeFooter parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new StripeFooter(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<StripeFooter> getParserForType() {
			return PARSER;
		}

		// repeated .Stream streams = 1;
		public static final int STREAMS_FIELD_NUMBER = 1;
		private java.util.List<OrcProto.Stream> streams_;

		/**
		 * <code>repeated .Stream streams = 1;</code>
		 */
		public java.util.List<OrcProto.Stream> getStreamsList() {
			return streams_;
		}

		/**
		 * <code>repeated .Stream streams = 1;</code>
		 */
		public java.util.List<? extends OrcProto.StreamOrBuilder> getStreamsOrBuilderList() {
			return streams_;
		}

		/**
		 * <code>repeated .Stream streams = 1;</code>
		 */
		public int getStreamsCount() {
			return streams_.size();
		}

		/**
		 * <code>repeated .Stream streams = 1;</code>
		 */
		public OrcProto.Stream getStreams(int index) {
			return streams_.get(index);
		}

		/**
		 * <code>repeated .Stream streams = 1;</code>
		 */
		public OrcProto.StreamOrBuilder getStreamsOrBuilder(int index) {
			return streams_.get(index);
		}

		// repeated .ColumnEncoding columns = 2;
		public static final int COLUMNS_FIELD_NUMBER = 2;
		private java.util.List<OrcProto.ColumnEncoding> columns_;

		/**
		 * <code>repeated .ColumnEncoding columns = 2;</code>
		 */
		public java.util.List<OrcProto.ColumnEncoding> getColumnsList() {
			return columns_;
		}

		/**
		 * <code>repeated .ColumnEncoding columns = 2;</code>
		 */
		public java.util.List<? extends OrcProto.ColumnEncodingOrBuilder> getColumnsOrBuilderList() {
			return columns_;
		}

		/**
		 * <code>repeated .ColumnEncoding columns = 2;</code>
		 */
		public int getColumnsCount() {
			return columns_.size();
		}

		/**
		 * <code>repeated .ColumnEncoding columns = 2;</code>
		 */
		public OrcProto.ColumnEncoding getColumns(int index) {
			return columns_.get(index);
		}

		/**
		 * <code>repeated .ColumnEncoding columns = 2;</code>
		 */
		public OrcProto.ColumnEncodingOrBuilder getColumnsOrBuilder(int index) {
			return columns_.get(index);
		}

		private void initFields() {
			streams_ = java.util.Collections.emptyList();
			columns_ = java.util.Collections.emptyList();
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			for (int i = 0; i < getStreamsCount(); i++) {
				if (!getStreams(i).isInitialized()) {
					memoizedIsInitialized = 0;
					return false;
				}
			}
			for (int i = 0; i < getColumnsCount(); i++) {
				if (!getColumns(i).isInitialized()) {
					memoizedIsInitialized = 0;
					return false;
				}
			}
			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			for (int i = 0; i < streams_.size(); i++) {
				output.writeMessage(1, streams_.get(i));
			}
			for (int i = 0; i < columns_.size(); i++) {
				output.writeMessage(2, columns_.get(i));
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			for (int i = 0; i < streams_.size(); i++) {
				size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, streams_.get(i));
			}
			for (int i = 0; i < columns_.size(); i++) {
				size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, columns_.get(i));
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static OrcProto.StripeFooter parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.StripeFooter parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.StripeFooter parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.StripeFooter parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.StripeFooter parseFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.StripeFooter parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static OrcProto.StripeFooter parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static OrcProto.StripeFooter parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static OrcProto.StripeFooter parseFrom(com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.StripeFooter parseFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(OrcProto.StripeFooter prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code StripeFooter}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				OrcProto.StripeFooterOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_StripeFooter_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_StripeFooter_fieldAccessorTable
						.ensureFieldAccessorsInitialized(OrcProto.StripeFooter.class,
								OrcProto.StripeFooter.Builder.class);
			}

			// Construct using OrcProto.StripeFooter.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
					getStreamsFieldBuilder();
					getColumnsFieldBuilder();
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				if (streamsBuilder_ == null) {
					streams_ = java.util.Collections.emptyList();
					bitField0_ = (bitField0_ & ~0x00000001);
				} else {
					streamsBuilder_.clear();
				}
				if (columnsBuilder_ == null) {
					columns_ = java.util.Collections.emptyList();
					bitField0_ = (bitField0_ & ~0x00000002);
				} else {
					columnsBuilder_.clear();
				}
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_StripeFooter_descriptor;
			}

			public OrcProto.StripeFooter getDefaultInstanceForType() {
				return OrcProto.StripeFooter.getDefaultInstance();
			}

			public OrcProto.StripeFooter build() {
				OrcProto.StripeFooter result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public OrcProto.StripeFooter buildPartial() {
				OrcProto.StripeFooter result = new OrcProto.StripeFooter(this);
				if (streamsBuilder_ == null) {
					if (((bitField0_ & 0x00000001) == 0x00000001)) {
						streams_ = java.util.Collections.unmodifiableList(streams_);
						bitField0_ = (bitField0_ & ~0x00000001);
					}
					result.streams_ = streams_;
				} else {
					result.streams_ = streamsBuilder_.build();
				}
				if (columnsBuilder_ == null) {
					if (((bitField0_ & 0x00000002) == 0x00000002)) {
						columns_ = java.util.Collections.unmodifiableList(columns_);
						bitField0_ = (bitField0_ & ~0x00000002);
					}
					result.columns_ = columns_;
				} else {
					result.columns_ = columnsBuilder_.build();
				}
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof OrcProto.StripeFooter) {
					return mergeFrom((OrcProto.StripeFooter) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(OrcProto.StripeFooter other) {
				if (other == OrcProto.StripeFooter.getDefaultInstance())
					return this;
				if (streamsBuilder_ == null) {
					if (!other.streams_.isEmpty()) {
						if (streams_.isEmpty()) {
							streams_ = other.streams_;
							bitField0_ = (bitField0_ & ~0x00000001);
						} else {
							ensureStreamsIsMutable();
							streams_.addAll(other.streams_);
						}
						onChanged();
					}
				} else {
					if (!other.streams_.isEmpty()) {
						if (streamsBuilder_.isEmpty()) {
							streamsBuilder_.dispose();
							streamsBuilder_ = null;
							streams_ = other.streams_;
							bitField0_ = (bitField0_ & ~0x00000001);
							streamsBuilder_ = com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ? getStreamsFieldBuilder()
									: null;
						} else {
							streamsBuilder_.addAllMessages(other.streams_);
						}
					}
				}
				if (columnsBuilder_ == null) {
					if (!other.columns_.isEmpty()) {
						if (columns_.isEmpty()) {
							columns_ = other.columns_;
							bitField0_ = (bitField0_ & ~0x00000002);
						} else {
							ensureColumnsIsMutable();
							columns_.addAll(other.columns_);
						}
						onChanged();
					}
				} else {
					if (!other.columns_.isEmpty()) {
						if (columnsBuilder_.isEmpty()) {
							columnsBuilder_.dispose();
							columnsBuilder_ = null;
							columns_ = other.columns_;
							bitField0_ = (bitField0_ & ~0x00000002);
							columnsBuilder_ = com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ? getColumnsFieldBuilder()
									: null;
						} else {
							columnsBuilder_.addAllMessages(other.columns_);
						}
					}
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				for (int i = 0; i < getStreamsCount(); i++) {
					if (!getStreams(i).isInitialized()) {

						return false;
					}
				}
				for (int i = 0; i < getColumnsCount(); i++) {
					if (!getColumns(i).isInitialized()) {

						return false;
					}
				}
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				OrcProto.StripeFooter parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (OrcProto.StripeFooter) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			// repeated .Stream streams = 1;
			private java.util.List<OrcProto.Stream> streams_ = java.util.Collections.emptyList();

			private void ensureStreamsIsMutable() {
				if (!((bitField0_ & 0x00000001) == 0x00000001)) {
					streams_ = new java.util.ArrayList<OrcProto.Stream>(streams_);
					bitField0_ |= 0x00000001;
				}
			}

			private com.google.protobuf.RepeatedFieldBuilder<OrcProto.Stream, OrcProto.Stream.Builder, OrcProto.StreamOrBuilder> streamsBuilder_;

			/**
			 * <code>repeated .Stream streams = 1;</code>
			 */
			public java.util.List<OrcProto.Stream> getStreamsList() {
				if (streamsBuilder_ == null) {
					return java.util.Collections.unmodifiableList(streams_);
				} else {
					return streamsBuilder_.getMessageList();
				}
			}

			/**
			 * <code>repeated .Stream streams = 1;</code>
			 */
			public int getStreamsCount() {
				if (streamsBuilder_ == null) {
					return streams_.size();
				} else {
					return streamsBuilder_.getCount();
				}
			}

			/**
			 * <code>repeated .Stream streams = 1;</code>
			 */
			public OrcProto.Stream getStreams(int index) {
				if (streamsBuilder_ == null) {
					return streams_.get(index);
				} else {
					return streamsBuilder_.getMessage(index);
				}
			}

			/**
			 * <code>repeated .Stream streams = 1;</code>
			 */
			public Builder setStreams(int index, OrcProto.Stream value) {
				if (streamsBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureStreamsIsMutable();
					streams_.set(index, value);
					onChanged();
				} else {
					streamsBuilder_.setMessage(index, value);
				}
				return this;
			}

			/**
			 * <code>repeated .Stream streams = 1;</code>
			 */
			public Builder setStreams(int index, OrcProto.Stream.Builder builderForValue) {
				if (streamsBuilder_ == null) {
					ensureStreamsIsMutable();
					streams_.set(index, builderForValue.build());
					onChanged();
				} else {
					streamsBuilder_.setMessage(index, builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .Stream streams = 1;</code>
			 */
			public Builder addStreams(OrcProto.Stream value) {
				if (streamsBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureStreamsIsMutable();
					streams_.add(value);
					onChanged();
				} else {
					streamsBuilder_.addMessage(value);
				}
				return this;
			}

			/**
			 * <code>repeated .Stream streams = 1;</code>
			 */
			public Builder addStreams(int index, OrcProto.Stream value) {
				if (streamsBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureStreamsIsMutable();
					streams_.add(index, value);
					onChanged();
				} else {
					streamsBuilder_.addMessage(index, value);
				}
				return this;
			}

			/**
			 * <code>repeated .Stream streams = 1;</code>
			 */
			public Builder addStreams(OrcProto.Stream.Builder builderForValue) {
				if (streamsBuilder_ == null) {
					ensureStreamsIsMutable();
					streams_.add(builderForValue.build());
					onChanged();
				} else {
					streamsBuilder_.addMessage(builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .Stream streams = 1;</code>
			 */
			public Builder addStreams(int index, OrcProto.Stream.Builder builderForValue) {
				if (streamsBuilder_ == null) {
					ensureStreamsIsMutable();
					streams_.add(index, builderForValue.build());
					onChanged();
				} else {
					streamsBuilder_.addMessage(index, builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .Stream streams = 1;</code>
			 */
			public Builder addAllStreams(java.lang.Iterable<? extends OrcProto.Stream> values) {
				if (streamsBuilder_ == null) {
					ensureStreamsIsMutable();
					super.addAll(values, streams_);
					onChanged();
				} else {
					streamsBuilder_.addAllMessages(values);
				}
				return this;
			}

			/**
			 * <code>repeated .Stream streams = 1;</code>
			 */
			public Builder clearStreams() {
				if (streamsBuilder_ == null) {
					streams_ = java.util.Collections.emptyList();
					bitField0_ = (bitField0_ & ~0x00000001);
					onChanged();
				} else {
					streamsBuilder_.clear();
				}
				return this;
			}

			/**
			 * <code>repeated .Stream streams = 1;</code>
			 */
			public Builder removeStreams(int index) {
				if (streamsBuilder_ == null) {
					ensureStreamsIsMutable();
					streams_.remove(index);
					onChanged();
				} else {
					streamsBuilder_.remove(index);
				}
				return this;
			}

			/**
			 * <code>repeated .Stream streams = 1;</code>
			 */
			public OrcProto.Stream.Builder getStreamsBuilder(int index) {
				return getStreamsFieldBuilder().getBuilder(index);
			}

			/**
			 * <code>repeated .Stream streams = 1;</code>
			 */
			public OrcProto.StreamOrBuilder getStreamsOrBuilder(int index) {
				if (streamsBuilder_ == null) {
					return streams_.get(index);
				} else {
					return streamsBuilder_.getMessageOrBuilder(index);
				}
			}

			/**
			 * <code>repeated .Stream streams = 1;</code>
			 */
			public java.util.List<? extends OrcProto.StreamOrBuilder> getStreamsOrBuilderList() {
				if (streamsBuilder_ != null) {
					return streamsBuilder_.getMessageOrBuilderList();
				} else {
					return java.util.Collections.unmodifiableList(streams_);
				}
			}

			/**
			 * <code>repeated .Stream streams = 1;</code>
			 */
			public OrcProto.Stream.Builder addStreamsBuilder() {
				return getStreamsFieldBuilder().addBuilder(OrcProto.Stream.getDefaultInstance());
			}

			/**
			 * <code>repeated .Stream streams = 1;</code>
			 */
			public OrcProto.Stream.Builder addStreamsBuilder(int index) {
				return getStreamsFieldBuilder().addBuilder(index, OrcProto.Stream.getDefaultInstance());
			}

			/**
			 * <code>repeated .Stream streams = 1;</code>
			 */
			public java.util.List<OrcProto.Stream.Builder> getStreamsBuilderList() {
				return getStreamsFieldBuilder().getBuilderList();
			}

			private com.google.protobuf.RepeatedFieldBuilder<OrcProto.Stream, OrcProto.Stream.Builder, OrcProto.StreamOrBuilder> getStreamsFieldBuilder() {
				if (streamsBuilder_ == null) {
					streamsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<OrcProto.Stream, OrcProto.Stream.Builder, OrcProto.StreamOrBuilder>(
							streams_, ((bitField0_ & 0x00000001) == 0x00000001), getParentForChildren(), isClean());
					streams_ = null;
				}
				return streamsBuilder_;
			}

			// repeated .ColumnEncoding columns = 2;
			private java.util.List<OrcProto.ColumnEncoding> columns_ = java.util.Collections.emptyList();

			private void ensureColumnsIsMutable() {
				if (!((bitField0_ & 0x00000002) == 0x00000002)) {
					columns_ = new java.util.ArrayList<OrcProto.ColumnEncoding>(columns_);
					bitField0_ |= 0x00000002;
				}
			}

			private com.google.protobuf.RepeatedFieldBuilder<OrcProto.ColumnEncoding, OrcProto.ColumnEncoding.Builder, OrcProto.ColumnEncodingOrBuilder> columnsBuilder_;

			/**
			 * <code>repeated .ColumnEncoding columns = 2;</code>
			 */
			public java.util.List<OrcProto.ColumnEncoding> getColumnsList() {
				if (columnsBuilder_ == null) {
					return java.util.Collections.unmodifiableList(columns_);
				} else {
					return columnsBuilder_.getMessageList();
				}
			}

			/**
			 * <code>repeated .ColumnEncoding columns = 2;</code>
			 */
			public int getColumnsCount() {
				if (columnsBuilder_ == null) {
					return columns_.size();
				} else {
					return columnsBuilder_.getCount();
				}
			}

			/**
			 * <code>repeated .ColumnEncoding columns = 2;</code>
			 */
			public OrcProto.ColumnEncoding getColumns(int index) {
				if (columnsBuilder_ == null) {
					return columns_.get(index);
				} else {
					return columnsBuilder_.getMessage(index);
				}
			}

			/**
			 * <code>repeated .ColumnEncoding columns = 2;</code>
			 */
			public Builder setColumns(int index, OrcProto.ColumnEncoding value) {
				if (columnsBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureColumnsIsMutable();
					columns_.set(index, value);
					onChanged();
				} else {
					columnsBuilder_.setMessage(index, value);
				}
				return this;
			}

			/**
			 * <code>repeated .ColumnEncoding columns = 2;</code>
			 */
			public Builder setColumns(int index, OrcProto.ColumnEncoding.Builder builderForValue) {
				if (columnsBuilder_ == null) {
					ensureColumnsIsMutable();
					columns_.set(index, builderForValue.build());
					onChanged();
				} else {
					columnsBuilder_.setMessage(index, builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .ColumnEncoding columns = 2;</code>
			 */
			public Builder addColumns(OrcProto.ColumnEncoding value) {
				if (columnsBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureColumnsIsMutable();
					columns_.add(value);
					onChanged();
				} else {
					columnsBuilder_.addMessage(value);
				}
				return this;
			}

			/**
			 * <code>repeated .ColumnEncoding columns = 2;</code>
			 */
			public Builder addColumns(int index, OrcProto.ColumnEncoding value) {
				if (columnsBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureColumnsIsMutable();
					columns_.add(index, value);
					onChanged();
				} else {
					columnsBuilder_.addMessage(index, value);
				}
				return this;
			}

			/**
			 * <code>repeated .ColumnEncoding columns = 2;</code>
			 */
			public Builder addColumns(OrcProto.ColumnEncoding.Builder builderForValue) {
				if (columnsBuilder_ == null) {
					ensureColumnsIsMutable();
					columns_.add(builderForValue.build());
					onChanged();
				} else {
					columnsBuilder_.addMessage(builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .ColumnEncoding columns = 2;</code>
			 */
			public Builder addColumns(int index, OrcProto.ColumnEncoding.Builder builderForValue) {
				if (columnsBuilder_ == null) {
					ensureColumnsIsMutable();
					columns_.add(index, builderForValue.build());
					onChanged();
				} else {
					columnsBuilder_.addMessage(index, builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .ColumnEncoding columns = 2;</code>
			 */
			public Builder addAllColumns(java.lang.Iterable<? extends OrcProto.ColumnEncoding> values) {
				if (columnsBuilder_ == null) {
					ensureColumnsIsMutable();
					super.addAll(values, columns_);
					onChanged();
				} else {
					columnsBuilder_.addAllMessages(values);
				}
				return this;
			}

			/**
			 * <code>repeated .ColumnEncoding columns = 2;</code>
			 */
			public Builder clearColumns() {
				if (columnsBuilder_ == null) {
					columns_ = java.util.Collections.emptyList();
					bitField0_ = (bitField0_ & ~0x00000002);
					onChanged();
				} else {
					columnsBuilder_.clear();
				}
				return this;
			}

			/**
			 * <code>repeated .ColumnEncoding columns = 2;</code>
			 */
			public Builder removeColumns(int index) {
				if (columnsBuilder_ == null) {
					ensureColumnsIsMutable();
					columns_.remove(index);
					onChanged();
				} else {
					columnsBuilder_.remove(index);
				}
				return this;
			}

			/**
			 * <code>repeated .ColumnEncoding columns = 2;</code>
			 */
			public OrcProto.ColumnEncoding.Builder getColumnsBuilder(int index) {
				return getColumnsFieldBuilder().getBuilder(index);
			}

			/**
			 * <code>repeated .ColumnEncoding columns = 2;</code>
			 */
			public OrcProto.ColumnEncodingOrBuilder getColumnsOrBuilder(int index) {
				if (columnsBuilder_ == null) {
					return columns_.get(index);
				} else {
					return columnsBuilder_.getMessageOrBuilder(index);
				}
			}

			/**
			 * <code>repeated .ColumnEncoding columns = 2;</code>
			 */
			public java.util.List<? extends OrcProto.ColumnEncodingOrBuilder> getColumnsOrBuilderList() {
				if (columnsBuilder_ != null) {
					return columnsBuilder_.getMessageOrBuilderList();
				} else {
					return java.util.Collections.unmodifiableList(columns_);
				}
			}

			/**
			 * <code>repeated .ColumnEncoding columns = 2;</code>
			 */
			public OrcProto.ColumnEncoding.Builder addColumnsBuilder() {
				return getColumnsFieldBuilder().addBuilder(OrcProto.ColumnEncoding.getDefaultInstance());
			}

			/**
			 * <code>repeated .ColumnEncoding columns = 2;</code>
			 */
			public OrcProto.ColumnEncoding.Builder addColumnsBuilder(int index) {
				return getColumnsFieldBuilder().addBuilder(index, OrcProto.ColumnEncoding.getDefaultInstance());
			}

			/**
			 * <code>repeated .ColumnEncoding columns = 2;</code>
			 */
			public java.util.List<OrcProto.ColumnEncoding.Builder> getColumnsBuilderList() {
				return getColumnsFieldBuilder().getBuilderList();
			}

			private com.google.protobuf.RepeatedFieldBuilder<OrcProto.ColumnEncoding, OrcProto.ColumnEncoding.Builder, OrcProto.ColumnEncodingOrBuilder> getColumnsFieldBuilder() {
				if (columnsBuilder_ == null) {
					columnsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<OrcProto.ColumnEncoding, OrcProto.ColumnEncoding.Builder, OrcProto.ColumnEncodingOrBuilder>(
							columns_, ((bitField0_ & 0x00000002) == 0x00000002), getParentForChildren(), isClean());
					columns_ = null;
				}
				return columnsBuilder_;
			}

			// @@protoc_insertion_point(builder_scope:StripeFooter)
		}

		static {
			defaultInstance = new StripeFooter(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:StripeFooter)
	}

	public interface TypeOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// required .Type.Kind kind = 1;
		/**
		 * <code>required .Type.Kind kind = 1;</code>
		 */
		boolean hasKind();

		/**
		 * <code>required .Type.Kind kind = 1;</code>
		 */
		OrcProto.Type.Kind getKind();

		// repeated uint32 subtypes = 2 [packed = true];
		/**
		 * <code>repeated uint32 subtypes = 2 [packed = true];</code>
		 */
		java.util.List<java.lang.Integer> getSubtypesList();

		/**
		 * <code>repeated uint32 subtypes = 2 [packed = true];</code>
		 */
		int getSubtypesCount();

		/**
		 * <code>repeated uint32 subtypes = 2 [packed = true];</code>
		 */
		int getSubtypes(int index);

		// repeated string fieldNames = 3;
		/**
		 * <code>repeated string fieldNames = 3;</code>
		 */
		java.util.List<java.lang.String> getFieldNamesList();

		/**
		 * <code>repeated string fieldNames = 3;</code>
		 */
		int getFieldNamesCount();

		/**
		 * <code>repeated string fieldNames = 3;</code>
		 */
		java.lang.String getFieldNames(int index);

		/**
		 * <code>repeated string fieldNames = 3;</code>
		 */
		com.google.protobuf.ByteString getFieldNamesBytes(int index);

		// optional uint32 maximumLength = 4;
		/**
		 * <code>optional uint32 maximumLength = 4;</code>
		 */
		boolean hasMaximumLength();

		/**
		 * <code>optional uint32 maximumLength = 4;</code>
		 */
		int getMaximumLength();

		// optional uint32 precision = 5;
		/**
		 * <code>optional uint32 precision = 5;</code>
		 */
		boolean hasPrecision();

		/**
		 * <code>optional uint32 precision = 5;</code>
		 */
		int getPrecision();

		// optional uint32 scale = 6;
		/**
		 * <code>optional uint32 scale = 6;</code>
		 */
		boolean hasScale();

		/**
		 * <code>optional uint32 scale = 6;</code>
		 */
		int getScale();
	}

	/**
	 * Protobuf type {@code Type}
	 */
	public static final class Type extends com.google.protobuf.GeneratedMessage implements TypeOrBuilder {
		// Use Type.newBuilder() to construct.
		private Type(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private Type(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final Type defaultInstance;

		public static Type getDefaultInstance() {
			return defaultInstance;
		}

		public Type getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private Type(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			int mutable_bitField0_ = 0;
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 8: {
						int rawValue = input.readEnum();
						OrcProto.Type.Kind value = OrcProto.Type.Kind.valueOf(rawValue);
						if (value == null) {
							unknownFields.mergeVarintField(1, rawValue);
						} else {
							bitField0_ |= 0x00000001;
							kind_ = value;
						}
						break;
					}
					case 16: {
						if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
							subtypes_ = new java.util.ArrayList<java.lang.Integer>();
							mutable_bitField0_ |= 0x00000002;
						}
						subtypes_.add(input.readUInt32());
						break;
					}
					case 18: {
						int length = input.readRawVarint32();
						int limit = input.pushLimit(length);
						if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
							subtypes_ = new java.util.ArrayList<java.lang.Integer>();
							mutable_bitField0_ |= 0x00000002;
						}
						while (input.getBytesUntilLimit() > 0) {
							subtypes_.add(input.readUInt32());
						}
						input.popLimit(limit);
						break;
					}
					case 26: {
						if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
							fieldNames_ = new com.google.protobuf.LazyStringArrayList();
							mutable_bitField0_ |= 0x00000004;
						}
						fieldNames_.add(input.readBytes());
						break;
					}
					case 32: {
						bitField0_ |= 0x00000002;
						maximumLength_ = input.readUInt32();
						break;
					}
					case 40: {
						bitField0_ |= 0x00000004;
						precision_ = input.readUInt32();
						break;
					}
					case 48: {
						bitField0_ |= 0x00000008;
						scale_ = input.readUInt32();
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
			} finally {
				if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
					subtypes_ = java.util.Collections.unmodifiableList(subtypes_);
				}
				if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
					fieldNames_ = new com.google.protobuf.UnmodifiableLazyStringList(fieldNames_);
				}
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_Type_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_Type_fieldAccessorTable
					.ensureFieldAccessorsInitialized(OrcProto.Type.class, OrcProto.Type.Builder.class);
		}

		public static com.google.protobuf.Parser<Type> PARSER = new com.google.protobuf.AbstractParser<Type>() {
			public Type parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new Type(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<Type> getParserForType() {
			return PARSER;
		}

		/**
		 * Protobuf enum {@code Type.Kind}
		 */
		public enum Kind implements com.google.protobuf.ProtocolMessageEnum {
			/**
			 * <code>BOOLEAN = 0;</code>
			 */
			BOOLEAN(0, 0),
			/**
			 * <code>BYTE = 1;</code>
			 */
			BYTE(1, 1),
			/**
			 * <code>SHORT = 2;</code>
			 */
			SHORT(2, 2),
			/**
			 * <code>INT = 3;</code>
			 */
			INT(3, 3),
			/**
			 * <code>LONG = 4;</code>
			 */
			LONG(4, 4),
			/**
			 * <code>FLOAT = 5;</code>
			 */
			FLOAT(5, 5),
			/**
			 * <code>DOUBLE = 6;</code>
			 */
			DOUBLE(6, 6),
			/**
			 * <code>STRING = 7;</code>
			 */
			STRING(7, 7),
			/**
			 * <code>BINARY = 8;</code>
			 */
			BINARY(8, 8),
			/**
			 * <code>TIMESTAMP = 9;</code>
			 */
			TIMESTAMP(9, 9),
			/**
			 * <code>LIST = 10;</code>
			 */
			LIST(10, 10),
			/**
			 * <code>MAP = 11;</code>
			 */
			MAP(11, 11),
			/**
			 * <code>STRUCT = 12;</code>
			 */
			STRUCT(12, 12),
			/**
			 * <code>UNION = 13;</code>
			 */
			UNION(13, 13),
			/**
			 * <code>DECIMAL = 14;</code>
			 */
			DECIMAL(14, 14),
			/**
			 * <code>DATE = 15;</code>
			 */
			DATE(15, 15),
			/**
			 * <code>VARCHAR = 16;</code>
			 */
			VARCHAR(16, 16), ;

			/**
			 * <code>BOOLEAN = 0;</code>
			 */
			public static final int BOOLEAN_VALUE = 0;
			/**
			 * <code>BYTE = 1;</code>
			 */
			public static final int BYTE_VALUE = 1;
			/**
			 * <code>SHORT = 2;</code>
			 */
			public static final int SHORT_VALUE = 2;
			/**
			 * <code>INT = 3;</code>
			 */
			public static final int INT_VALUE = 3;
			/**
			 * <code>LONG = 4;</code>
			 */
			public static final int LONG_VALUE = 4;
			/**
			 * <code>FLOAT = 5;</code>
			 */
			public static final int FLOAT_VALUE = 5;
			/**
			 * <code>DOUBLE = 6;</code>
			 */
			public static final int DOUBLE_VALUE = 6;
			/**
			 * <code>STRING = 7;</code>
			 */
			public static final int STRING_VALUE = 7;
			/**
			 * <code>BINARY = 8;</code>
			 */
			public static final int BINARY_VALUE = 8;
			/**
			 * <code>TIMESTAMP = 9;</code>
			 */
			public static final int TIMESTAMP_VALUE = 9;
			/**
			 * <code>LIST = 10;</code>
			 */
			public static final int LIST_VALUE = 10;
			/**
			 * <code>MAP = 11;</code>
			 */
			public static final int MAP_VALUE = 11;
			/**
			 * <code>STRUCT = 12;</code>
			 */
			public static final int STRUCT_VALUE = 12;
			/**
			 * <code>UNION = 13;</code>
			 */
			public static final int UNION_VALUE = 13;
			/**
			 * <code>DECIMAL = 14;</code>
			 */
			public static final int DECIMAL_VALUE = 14;
			/**
			 * <code>DATE = 15;</code>
			 */
			public static final int DATE_VALUE = 15;
			/**
			 * <code>VARCHAR = 16;</code>
			 */
			public static final int VARCHAR_VALUE = 16;

			public final int getNumber() {
				return value;
			}

			public static Kind valueOf(int value) {
				switch (value) {
				case 0:
					return BOOLEAN;
				case 1:
					return BYTE;
				case 2:
					return SHORT;
				case 3:
					return INT;
				case 4:
					return LONG;
				case 5:
					return FLOAT;
				case 6:
					return DOUBLE;
				case 7:
					return STRING;
				case 8:
					return BINARY;
				case 9:
					return TIMESTAMP;
				case 10:
					return LIST;
				case 11:
					return MAP;
				case 12:
					return STRUCT;
				case 13:
					return UNION;
				case 14:
					return DECIMAL;
				case 15:
					return DATE;
				case 16:
					return VARCHAR;
				default:
					return null;
				}
			}

			public static com.google.protobuf.Internal.EnumLiteMap<Kind> internalGetValueMap() {
				return internalValueMap;
			}

			private static com.google.protobuf.Internal.EnumLiteMap<Kind> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<Kind>() {
				public Kind findValueByNumber(int number) {
					return Kind.valueOf(number);
				}
			};

			public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
				return getDescriptor().getValues().get(index);
			}

			public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
				return getDescriptor();
			}

			public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
				return OrcProto.Type.getDescriptor().getEnumTypes().get(0);
			}

			private static final Kind[] VALUES = values();

			public static Kind valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
				if (desc.getType() != getDescriptor()) {
					throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
				}
				return VALUES[desc.getIndex()];
			}

			private final int index;
			private final int value;

			private Kind(int index, int value) {
				this.index = index;
				this.value = value;
			}

			// @@protoc_insertion_point(enum_scope:Type.Kind)
		}

		private int bitField0_;
		// required .Type.Kind kind = 1;
		public static final int KIND_FIELD_NUMBER = 1;
		private OrcProto.Type.Kind kind_;

		/**
		 * <code>required .Type.Kind kind = 1;</code>
		 */
		public boolean hasKind() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>required .Type.Kind kind = 1;</code>
		 */
		public OrcProto.Type.Kind getKind() {
			return kind_;
		}

		// repeated uint32 subtypes = 2 [packed = true];
		public static final int SUBTYPES_FIELD_NUMBER = 2;
		private java.util.List<java.lang.Integer> subtypes_;

		/**
		 * <code>repeated uint32 subtypes = 2 [packed = true];</code>
		 */
		public java.util.List<java.lang.Integer> getSubtypesList() {
			return subtypes_;
		}

		/**
		 * <code>repeated uint32 subtypes = 2 [packed = true];</code>
		 */
		public int getSubtypesCount() {
			return subtypes_.size();
		}

		/**
		 * <code>repeated uint32 subtypes = 2 [packed = true];</code>
		 */
		public int getSubtypes(int index) {
			return subtypes_.get(index);
		}

		private int subtypesMemoizedSerializedSize = -1;

		// repeated string fieldNames = 3;
		public static final int FIELDNAMES_FIELD_NUMBER = 3;
		private com.google.protobuf.LazyStringList fieldNames_;

		/**
		 * <code>repeated string fieldNames = 3;</code>
		 */
		public java.util.List<java.lang.String> getFieldNamesList() {
			return fieldNames_;
		}

		/**
		 * <code>repeated string fieldNames = 3;</code>
		 */
		public int getFieldNamesCount() {
			return fieldNames_.size();
		}

		/**
		 * <code>repeated string fieldNames = 3;</code>
		 */
		public java.lang.String getFieldNames(int index) {
			return fieldNames_.get(index);
		}

		/**
		 * <code>repeated string fieldNames = 3;</code>
		 */
		public com.google.protobuf.ByteString getFieldNamesBytes(int index) {
			return fieldNames_.getByteString(index);
		}

		// optional uint32 maximumLength = 4;
		public static final int MAXIMUMLENGTH_FIELD_NUMBER = 4;
		private int maximumLength_;

		/**
		 * <code>optional uint32 maximumLength = 4;</code>
		 */
		public boolean hasMaximumLength() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>optional uint32 maximumLength = 4;</code>
		 */
		public int getMaximumLength() {
			return maximumLength_;
		}

		// optional uint32 precision = 5;
		public static final int PRECISION_FIELD_NUMBER = 5;
		private int precision_;

		/**
		 * <code>optional uint32 precision = 5;</code>
		 */
		public boolean hasPrecision() {
			return ((bitField0_ & 0x00000004) == 0x00000004);
		}

		/**
		 * <code>optional uint32 precision = 5;</code>
		 */
		public int getPrecision() {
			return precision_;
		}

		// optional uint32 scale = 6;
		public static final int SCALE_FIELD_NUMBER = 6;
		private int scale_;

		/**
		 * <code>optional uint32 scale = 6;</code>
		 */
		public boolean hasScale() {
			return ((bitField0_ & 0x00000008) == 0x00000008);
		}

		/**
		 * <code>optional uint32 scale = 6;</code>
		 */
		public int getScale() {
			return scale_;
		}

		private void initFields() {
			kind_ = OrcProto.Type.Kind.BOOLEAN;
			subtypes_ = java.util.Collections.emptyList();
			fieldNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
			maximumLength_ = 0;
			precision_ = 0;
			scale_ = 0;
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			if (!hasKind()) {
				memoizedIsInitialized = 0;
				return false;
			}
			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeEnum(1, kind_.getNumber());
			}
			if (getSubtypesList().size() > 0) {
				output.writeRawVarint32(18);
				output.writeRawVarint32(subtypesMemoizedSerializedSize);
			}
			for (int i = 0; i < subtypes_.size(); i++) {
				output.writeUInt32NoTag(subtypes_.get(i));
			}
			for (int i = 0; i < fieldNames_.size(); i++) {
				output.writeBytes(3, fieldNames_.getByteString(i));
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeUInt32(4, maximumLength_);
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				output.writeUInt32(5, precision_);
			}
			if (((bitField0_ & 0x00000008) == 0x00000008)) {
				output.writeUInt32(6, scale_);
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, kind_.getNumber());
			}
			{
				int dataSize = 0;
				for (int i = 0; i < subtypes_.size(); i++) {
					dataSize += com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(subtypes_.get(i));
				}
				size += dataSize;
				if (!getSubtypesList().isEmpty()) {
					size += 1;
					size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
				}
				subtypesMemoizedSerializedSize = dataSize;
			}
			{
				int dataSize = 0;
				for (int i = 0; i < fieldNames_.size(); i++) {
					dataSize += com.google.protobuf.CodedOutputStream.computeBytesSizeNoTag(fieldNames_
							.getByteString(i));
				}
				size += dataSize;
				size += 1 * getFieldNamesList().size();
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream.computeUInt32Size(4, maximumLength_);
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				size += com.google.protobuf.CodedOutputStream.computeUInt32Size(5, precision_);
			}
			if (((bitField0_ & 0x00000008) == 0x00000008)) {
				size += com.google.protobuf.CodedOutputStream.computeUInt32Size(6, scale_);
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static OrcProto.Type parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.Type parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.Type parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.Type parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.Type parseFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.Type parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static OrcProto.Type parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static OrcProto.Type parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static OrcProto.Type parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.Type parseFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(OrcProto.Type prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code Type}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				OrcProto.TypeOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_Type_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_Type_fieldAccessorTable
						.ensureFieldAccessorsInitialized(OrcProto.Type.class, OrcProto.Type.Builder.class);
			}

			// Construct using OrcProto.Type.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				kind_ = OrcProto.Type.Kind.BOOLEAN;
				bitField0_ = (bitField0_ & ~0x00000001);
				subtypes_ = java.util.Collections.emptyList();
				bitField0_ = (bitField0_ & ~0x00000002);
				fieldNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
				bitField0_ = (bitField0_ & ~0x00000004);
				maximumLength_ = 0;
				bitField0_ = (bitField0_ & ~0x00000008);
				precision_ = 0;
				bitField0_ = (bitField0_ & ~0x00000010);
				scale_ = 0;
				bitField0_ = (bitField0_ & ~0x00000020);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_Type_descriptor;
			}

			public OrcProto.Type getDefaultInstanceForType() {
				return OrcProto.Type.getDefaultInstance();
			}

			public OrcProto.Type build() {
				OrcProto.Type result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public OrcProto.Type buildPartial() {
				OrcProto.Type result = new OrcProto.Type(this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.kind_ = kind_;
				if (((bitField0_ & 0x00000002) == 0x00000002)) {
					subtypes_ = java.util.Collections.unmodifiableList(subtypes_);
					bitField0_ = (bitField0_ & ~0x00000002);
				}
				result.subtypes_ = subtypes_;
				if (((bitField0_ & 0x00000004) == 0x00000004)) {
					fieldNames_ = new com.google.protobuf.UnmodifiableLazyStringList(fieldNames_);
					bitField0_ = (bitField0_ & ~0x00000004);
				}
				result.fieldNames_ = fieldNames_;
				if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
					to_bitField0_ |= 0x00000002;
				}
				result.maximumLength_ = maximumLength_;
				if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
					to_bitField0_ |= 0x00000004;
				}
				result.precision_ = precision_;
				if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
					to_bitField0_ |= 0x00000008;
				}
				result.scale_ = scale_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof OrcProto.Type) {
					return mergeFrom((OrcProto.Type) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(OrcProto.Type other) {
				if (other == OrcProto.Type.getDefaultInstance())
					return this;
				if (other.hasKind()) {
					setKind(other.getKind());
				}
				if (!other.subtypes_.isEmpty()) {
					if (subtypes_.isEmpty()) {
						subtypes_ = other.subtypes_;
						bitField0_ = (bitField0_ & ~0x00000002);
					} else {
						ensureSubtypesIsMutable();
						subtypes_.addAll(other.subtypes_);
					}
					onChanged();
				}
				if (!other.fieldNames_.isEmpty()) {
					if (fieldNames_.isEmpty()) {
						fieldNames_ = other.fieldNames_;
						bitField0_ = (bitField0_ & ~0x00000004);
					} else {
						ensureFieldNamesIsMutable();
						fieldNames_.addAll(other.fieldNames_);
					}
					onChanged();
				}
				if (other.hasMaximumLength()) {
					setMaximumLength(other.getMaximumLength());
				}
				if (other.hasPrecision()) {
					setPrecision(other.getPrecision());
				}
				if (other.hasScale()) {
					setScale(other.getScale());
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				if (!hasKind()) {

					return false;
				}
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				OrcProto.Type parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (OrcProto.Type) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			// required .Type.Kind kind = 1;
			private OrcProto.Type.Kind kind_ = OrcProto.Type.Kind.BOOLEAN;

			/**
			 * <code>required .Type.Kind kind = 1;</code>
			 */
			public boolean hasKind() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <code>required .Type.Kind kind = 1;</code>
			 */
			public OrcProto.Type.Kind getKind() {
				return kind_;
			}

			/**
			 * <code>required .Type.Kind kind = 1;</code>
			 */
			public Builder setKind(OrcProto.Type.Kind value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000001;
				kind_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>required .Type.Kind kind = 1;</code>
			 */
			public Builder clearKind() {
				bitField0_ = (bitField0_ & ~0x00000001);
				kind_ = OrcProto.Type.Kind.BOOLEAN;
				onChanged();
				return this;
			}

			// repeated uint32 subtypes = 2 [packed = true];
			private java.util.List<java.lang.Integer> subtypes_ = java.util.Collections.emptyList();

			private void ensureSubtypesIsMutable() {
				if (!((bitField0_ & 0x00000002) == 0x00000002)) {
					subtypes_ = new java.util.ArrayList<java.lang.Integer>(subtypes_);
					bitField0_ |= 0x00000002;
				}
			}

			/**
			 * <code>repeated uint32 subtypes = 2 [packed = true];</code>
			 */
			public java.util.List<java.lang.Integer> getSubtypesList() {
				return java.util.Collections.unmodifiableList(subtypes_);
			}

			/**
			 * <code>repeated uint32 subtypes = 2 [packed = true];</code>
			 */
			public int getSubtypesCount() {
				return subtypes_.size();
			}

			/**
			 * <code>repeated uint32 subtypes = 2 [packed = true];</code>
			 */
			public int getSubtypes(int index) {
				return subtypes_.get(index);
			}

			/**
			 * <code>repeated uint32 subtypes = 2 [packed = true];</code>
			 */
			public Builder setSubtypes(int index, int value) {
				ensureSubtypesIsMutable();
				subtypes_.set(index, value);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated uint32 subtypes = 2 [packed = true];</code>
			 */
			public Builder addSubtypes(int value) {
				ensureSubtypesIsMutable();
				subtypes_.add(value);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated uint32 subtypes = 2 [packed = true];</code>
			 */
			public Builder addAllSubtypes(java.lang.Iterable<? extends java.lang.Integer> values) {
				ensureSubtypesIsMutable();
				super.addAll(values, subtypes_);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated uint32 subtypes = 2 [packed = true];</code>
			 */
			public Builder clearSubtypes() {
				subtypes_ = java.util.Collections.emptyList();
				bitField0_ = (bitField0_ & ~0x00000002);
				onChanged();
				return this;
			}

			// repeated string fieldNames = 3;
			private com.google.protobuf.LazyStringList fieldNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;

			private void ensureFieldNamesIsMutable() {
				if (!((bitField0_ & 0x00000004) == 0x00000004)) {
					fieldNames_ = new com.google.protobuf.LazyStringArrayList(fieldNames_);
					bitField0_ |= 0x00000004;
				}
			}

			/**
			 * <code>repeated string fieldNames = 3;</code>
			 */
			public java.util.List<java.lang.String> getFieldNamesList() {
				return java.util.Collections.unmodifiableList(fieldNames_);
			}

			/**
			 * <code>repeated string fieldNames = 3;</code>
			 */
			public int getFieldNamesCount() {
				return fieldNames_.size();
			}

			/**
			 * <code>repeated string fieldNames = 3;</code>
			 */
			public java.lang.String getFieldNames(int index) {
				return fieldNames_.get(index);
			}

			/**
			 * <code>repeated string fieldNames = 3;</code>
			 */
			public com.google.protobuf.ByteString getFieldNamesBytes(int index) {
				return fieldNames_.getByteString(index);
			}

			/**
			 * <code>repeated string fieldNames = 3;</code>
			 */
			public Builder setFieldNames(int index, java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensureFieldNamesIsMutable();
				fieldNames_.set(index, value);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated string fieldNames = 3;</code>
			 */
			public Builder addFieldNames(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensureFieldNamesIsMutable();
				fieldNames_.add(value);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated string fieldNames = 3;</code>
			 */
			public Builder addAllFieldNames(java.lang.Iterable<java.lang.String> values) {
				ensureFieldNamesIsMutable();
				super.addAll(values, fieldNames_);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated string fieldNames = 3;</code>
			 */
			public Builder clearFieldNames() {
				fieldNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
				bitField0_ = (bitField0_ & ~0x00000004);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated string fieldNames = 3;</code>
			 */
			public Builder addFieldNamesBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensureFieldNamesIsMutable();
				fieldNames_.add(value);
				onChanged();
				return this;
			}

			// optional uint32 maximumLength = 4;
			private int maximumLength_;

			/**
			 * <code>optional uint32 maximumLength = 4;</code>
			 */
			public boolean hasMaximumLength() {
				return ((bitField0_ & 0x00000008) == 0x00000008);
			}

			/**
			 * <code>optional uint32 maximumLength = 4;</code>
			 */
			public int getMaximumLength() {
				return maximumLength_;
			}

			/**
			 * <code>optional uint32 maximumLength = 4;</code>
			 */
			public Builder setMaximumLength(int value) {
				bitField0_ |= 0x00000008;
				maximumLength_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional uint32 maximumLength = 4;</code>
			 */
			public Builder clearMaximumLength() {
				bitField0_ = (bitField0_ & ~0x00000008);
				maximumLength_ = 0;
				onChanged();
				return this;
			}

			// optional uint32 precision = 5;
			private int precision_;

			/**
			 * <code>optional uint32 precision = 5;</code>
			 */
			public boolean hasPrecision() {
				return ((bitField0_ & 0x00000010) == 0x00000010);
			}

			/**
			 * <code>optional uint32 precision = 5;</code>
			 */
			public int getPrecision() {
				return precision_;
			}

			/**
			 * <code>optional uint32 precision = 5;</code>
			 */
			public Builder setPrecision(int value) {
				bitField0_ |= 0x00000010;
				precision_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional uint32 precision = 5;</code>
			 */
			public Builder clearPrecision() {
				bitField0_ = (bitField0_ & ~0x00000010);
				precision_ = 0;
				onChanged();
				return this;
			}

			// optional uint32 scale = 6;
			private int scale_;

			/**
			 * <code>optional uint32 scale = 6;</code>
			 */
			public boolean hasScale() {
				return ((bitField0_ & 0x00000020) == 0x00000020);
			}

			/**
			 * <code>optional uint32 scale = 6;</code>
			 */
			public int getScale() {
				return scale_;
			}

			/**
			 * <code>optional uint32 scale = 6;</code>
			 */
			public Builder setScale(int value) {
				bitField0_ |= 0x00000020;
				scale_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional uint32 scale = 6;</code>
			 */
			public Builder clearScale() {
				bitField0_ = (bitField0_ & ~0x00000020);
				scale_ = 0;
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:Type)
		}

		static {
			defaultInstance = new Type(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:Type)
	}

	public interface StripeInformationOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// optional uint64 offset = 1;
		/**
		 * <code>optional uint64 offset = 1;</code>
		 */
		boolean hasOffset();

		/**
		 * <code>optional uint64 offset = 1;</code>
		 */
		long getOffset();

		// optional uint64 indexLength = 2;
		/**
		 * <code>optional uint64 indexLength = 2;</code>
		 */
		boolean hasIndexLength();

		/**
		 * <code>optional uint64 indexLength = 2;</code>
		 */
		long getIndexLength();

		// optional uint64 dataLength = 3;
		/**
		 * <code>optional uint64 dataLength = 3;</code>
		 */
		boolean hasDataLength();

		/**
		 * <code>optional uint64 dataLength = 3;</code>
		 */
		long getDataLength();

		// optional uint64 footerLength = 4;
		/**
		 * <code>optional uint64 footerLength = 4;</code>
		 */
		boolean hasFooterLength();

		/**
		 * <code>optional uint64 footerLength = 4;</code>
		 */
		long getFooterLength();

		// optional uint64 numberOfRows = 5;
		/**
		 * <code>optional uint64 numberOfRows = 5;</code>
		 */
		boolean hasNumberOfRows();

		/**
		 * <code>optional uint64 numberOfRows = 5;</code>
		 */
		long getNumberOfRows();
	}

	/**
	 * Protobuf type {@code StripeInformation}
	 */
	public static final class StripeInformation extends com.google.protobuf.GeneratedMessage implements
			StripeInformationOrBuilder {
		// Use StripeInformation.newBuilder() to construct.
		private StripeInformation(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private StripeInformation(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final StripeInformation defaultInstance;

		public static StripeInformation getDefaultInstance() {
			return defaultInstance;
		}

		public StripeInformation getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private StripeInformation(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 8: {
						bitField0_ |= 0x00000001;
						offset_ = input.readUInt64();
						break;
					}
					case 16: {
						bitField0_ |= 0x00000002;
						indexLength_ = input.readUInt64();
						break;
					}
					case 24: {
						bitField0_ |= 0x00000004;
						dataLength_ = input.readUInt64();
						break;
					}
					case 32: {
						bitField0_ |= 0x00000008;
						footerLength_ = input.readUInt64();
						break;
					}
					case 40: {
						bitField0_ |= 0x00000010;
						numberOfRows_ = input.readUInt64();
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
			} finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_StripeInformation_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_StripeInformation_fieldAccessorTable
					.ensureFieldAccessorsInitialized(OrcProto.StripeInformation.class,
							OrcProto.StripeInformation.Builder.class);
		}

		public static com.google.protobuf.Parser<StripeInformation> PARSER = new com.google.protobuf.AbstractParser<StripeInformation>() {
			public StripeInformation parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new StripeInformation(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<StripeInformation> getParserForType() {
			return PARSER;
		}

		private int bitField0_;
		// optional uint64 offset = 1;
		public static final int OFFSET_FIELD_NUMBER = 1;
		private long offset_;

		/**
		 * <code>optional uint64 offset = 1;</code>
		 */
		public boolean hasOffset() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>optional uint64 offset = 1;</code>
		 */
		public long getOffset() {
			return offset_;
		}

		// optional uint64 indexLength = 2;
		public static final int INDEXLENGTH_FIELD_NUMBER = 2;
		private long indexLength_;

		/**
		 * <code>optional uint64 indexLength = 2;</code>
		 */
		public boolean hasIndexLength() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>optional uint64 indexLength = 2;</code>
		 */
		public long getIndexLength() {
			return indexLength_;
		}

		// optional uint64 dataLength = 3;
		public static final int DATALENGTH_FIELD_NUMBER = 3;
		private long dataLength_;

		/**
		 * <code>optional uint64 dataLength = 3;</code>
		 */
		public boolean hasDataLength() {
			return ((bitField0_ & 0x00000004) == 0x00000004);
		}

		/**
		 * <code>optional uint64 dataLength = 3;</code>
		 */
		public long getDataLength() {
			return dataLength_;
		}

		// optional uint64 footerLength = 4;
		public static final int FOOTERLENGTH_FIELD_NUMBER = 4;
		private long footerLength_;

		/**
		 * <code>optional uint64 footerLength = 4;</code>
		 */
		public boolean hasFooterLength() {
			return ((bitField0_ & 0x00000008) == 0x00000008);
		}

		/**
		 * <code>optional uint64 footerLength = 4;</code>
		 */
		public long getFooterLength() {
			return footerLength_;
		}

		// optional uint64 numberOfRows = 5;
		public static final int NUMBEROFROWS_FIELD_NUMBER = 5;
		private long numberOfRows_;

		/**
		 * <code>optional uint64 numberOfRows = 5;</code>
		 */
		public boolean hasNumberOfRows() {
			return ((bitField0_ & 0x00000010) == 0x00000010);
		}

		/**
		 * <code>optional uint64 numberOfRows = 5;</code>
		 */
		public long getNumberOfRows() {
			return numberOfRows_;
		}

		private void initFields() {
			offset_ = 0L;
			indexLength_ = 0L;
			dataLength_ = 0L;
			footerLength_ = 0L;
			numberOfRows_ = 0L;
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeUInt64(1, offset_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeUInt64(2, indexLength_);
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				output.writeUInt64(3, dataLength_);
			}
			if (((bitField0_ & 0x00000008) == 0x00000008)) {
				output.writeUInt64(4, footerLength_);
			}
			if (((bitField0_ & 0x00000010) == 0x00000010)) {
				output.writeUInt64(5, numberOfRows_);
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream.computeUInt64Size(1, offset_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream.computeUInt64Size(2, indexLength_);
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				size += com.google.protobuf.CodedOutputStream.computeUInt64Size(3, dataLength_);
			}
			if (((bitField0_ & 0x00000008) == 0x00000008)) {
				size += com.google.protobuf.CodedOutputStream.computeUInt64Size(4, footerLength_);
			}
			if (((bitField0_ & 0x00000010) == 0x00000010)) {
				size += com.google.protobuf.CodedOutputStream.computeUInt64Size(5, numberOfRows_);
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static OrcProto.StripeInformation parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.StripeInformation parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.StripeInformation parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.StripeInformation parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.StripeInformation parseFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.StripeInformation parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static OrcProto.StripeInformation parseDelimitedFrom(java.io.InputStream input)
				throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static OrcProto.StripeInformation parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static OrcProto.StripeInformation parseFrom(com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.StripeInformation parseFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(OrcProto.StripeInformation prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code StripeInformation}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				OrcProto.StripeInformationOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_StripeInformation_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_StripeInformation_fieldAccessorTable
						.ensureFieldAccessorsInitialized(OrcProto.StripeInformation.class,
								OrcProto.StripeInformation.Builder.class);
			}

			// Construct using OrcProto.StripeInformation.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				offset_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000001);
				indexLength_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000002);
				dataLength_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000004);
				footerLength_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000008);
				numberOfRows_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000010);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_StripeInformation_descriptor;
			}

			public OrcProto.StripeInformation getDefaultInstanceForType() {
				return OrcProto.StripeInformation.getDefaultInstance();
			}

			public OrcProto.StripeInformation build() {
				OrcProto.StripeInformation result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public OrcProto.StripeInformation buildPartial() {
				OrcProto.StripeInformation result = new OrcProto.StripeInformation(this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.offset_ = offset_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				result.indexLength_ = indexLength_;
				if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
					to_bitField0_ |= 0x00000004;
				}
				result.dataLength_ = dataLength_;
				if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
					to_bitField0_ |= 0x00000008;
				}
				result.footerLength_ = footerLength_;
				if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
					to_bitField0_ |= 0x00000010;
				}
				result.numberOfRows_ = numberOfRows_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof OrcProto.StripeInformation) {
					return mergeFrom((OrcProto.StripeInformation) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(OrcProto.StripeInformation other) {
				if (other == OrcProto.StripeInformation.getDefaultInstance())
					return this;
				if (other.hasOffset()) {
					setOffset(other.getOffset());
				}
				if (other.hasIndexLength()) {
					setIndexLength(other.getIndexLength());
				}
				if (other.hasDataLength()) {
					setDataLength(other.getDataLength());
				}
				if (other.hasFooterLength()) {
					setFooterLength(other.getFooterLength());
				}
				if (other.hasNumberOfRows()) {
					setNumberOfRows(other.getNumberOfRows());
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				OrcProto.StripeInformation parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (OrcProto.StripeInformation) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			// optional uint64 offset = 1;
			private long offset_;

			/**
			 * <code>optional uint64 offset = 1;</code>
			 */
			public boolean hasOffset() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <code>optional uint64 offset = 1;</code>
			 */
			public long getOffset() {
				return offset_;
			}

			/**
			 * <code>optional uint64 offset = 1;</code>
			 */
			public Builder setOffset(long value) {
				bitField0_ |= 0x00000001;
				offset_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional uint64 offset = 1;</code>
			 */
			public Builder clearOffset() {
				bitField0_ = (bitField0_ & ~0x00000001);
				offset_ = 0L;
				onChanged();
				return this;
			}

			// optional uint64 indexLength = 2;
			private long indexLength_;

			/**
			 * <code>optional uint64 indexLength = 2;</code>
			 */
			public boolean hasIndexLength() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			/**
			 * <code>optional uint64 indexLength = 2;</code>
			 */
			public long getIndexLength() {
				return indexLength_;
			}

			/**
			 * <code>optional uint64 indexLength = 2;</code>
			 */
			public Builder setIndexLength(long value) {
				bitField0_ |= 0x00000002;
				indexLength_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional uint64 indexLength = 2;</code>
			 */
			public Builder clearIndexLength() {
				bitField0_ = (bitField0_ & ~0x00000002);
				indexLength_ = 0L;
				onChanged();
				return this;
			}

			// optional uint64 dataLength = 3;
			private long dataLength_;

			/**
			 * <code>optional uint64 dataLength = 3;</code>
			 */
			public boolean hasDataLength() {
				return ((bitField0_ & 0x00000004) == 0x00000004);
			}

			/**
			 * <code>optional uint64 dataLength = 3;</code>
			 */
			public long getDataLength() {
				return dataLength_;
			}

			/**
			 * <code>optional uint64 dataLength = 3;</code>
			 */
			public Builder setDataLength(long value) {
				bitField0_ |= 0x00000004;
				dataLength_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional uint64 dataLength = 3;</code>
			 */
			public Builder clearDataLength() {
				bitField0_ = (bitField0_ & ~0x00000004);
				dataLength_ = 0L;
				onChanged();
				return this;
			}

			// optional uint64 footerLength = 4;
			private long footerLength_;

			/**
			 * <code>optional uint64 footerLength = 4;</code>
			 */
			public boolean hasFooterLength() {
				return ((bitField0_ & 0x00000008) == 0x00000008);
			}

			/**
			 * <code>optional uint64 footerLength = 4;</code>
			 */
			public long getFooterLength() {
				return footerLength_;
			}

			/**
			 * <code>optional uint64 footerLength = 4;</code>
			 */
			public Builder setFooterLength(long value) {
				bitField0_ |= 0x00000008;
				footerLength_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional uint64 footerLength = 4;</code>
			 */
			public Builder clearFooterLength() {
				bitField0_ = (bitField0_ & ~0x00000008);
				footerLength_ = 0L;
				onChanged();
				return this;
			}

			// optional uint64 numberOfRows = 5;
			private long numberOfRows_;

			/**
			 * <code>optional uint64 numberOfRows = 5;</code>
			 */
			public boolean hasNumberOfRows() {
				return ((bitField0_ & 0x00000010) == 0x00000010);
			}

			/**
			 * <code>optional uint64 numberOfRows = 5;</code>
			 */
			public long getNumberOfRows() {
				return numberOfRows_;
			}

			/**
			 * <code>optional uint64 numberOfRows = 5;</code>
			 */
			public Builder setNumberOfRows(long value) {
				bitField0_ |= 0x00000010;
				numberOfRows_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional uint64 numberOfRows = 5;</code>
			 */
			public Builder clearNumberOfRows() {
				bitField0_ = (bitField0_ & ~0x00000010);
				numberOfRows_ = 0L;
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:StripeInformation)
		}

		static {
			defaultInstance = new StripeInformation(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:StripeInformation)
	}

	public interface UserMetadataItemOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// required string name = 1;
		/**
		 * <code>required string name = 1;</code>
		 */
		boolean hasName();

		/**
		 * <code>required string name = 1;</code>
		 */
		java.lang.String getName();

		/**
		 * <code>required string name = 1;</code>
		 */
		com.google.protobuf.ByteString getNameBytes();

		// required bytes value = 2;
		/**
		 * <code>required bytes value = 2;</code>
		 */
		boolean hasValue();

		/**
		 * <code>required bytes value = 2;</code>
		 */
		com.google.protobuf.ByteString getValue();
	}

	/**
	 * Protobuf type {@code UserMetadataItem}
	 */
	public static final class UserMetadataItem extends com.google.protobuf.GeneratedMessage implements
			UserMetadataItemOrBuilder {
		// Use UserMetadataItem.newBuilder() to construct.
		private UserMetadataItem(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private UserMetadataItem(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final UserMetadataItem defaultInstance;

		public static UserMetadataItem getDefaultInstance() {
			return defaultInstance;
		}

		public UserMetadataItem getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private UserMetadataItem(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 10: {
						bitField0_ |= 0x00000001;
						name_ = input.readBytes();
						break;
					}
					case 18: {
						bitField0_ |= 0x00000002;
						value_ = input.readBytes();
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
			} finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_UserMetadataItem_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_UserMetadataItem_fieldAccessorTable
					.ensureFieldAccessorsInitialized(OrcProto.UserMetadataItem.class,
							OrcProto.UserMetadataItem.Builder.class);
		}

		public static com.google.protobuf.Parser<UserMetadataItem> PARSER = new com.google.protobuf.AbstractParser<UserMetadataItem>() {
			public UserMetadataItem parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new UserMetadataItem(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<UserMetadataItem> getParserForType() {
			return PARSER;
		}

		private int bitField0_;
		// required string name = 1;
		public static final int NAME_FIELD_NUMBER = 1;
		private java.lang.Object name_;

		/**
		 * <code>required string name = 1;</code>
		 */
		public boolean hasName() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>required string name = 1;</code>
		 */
		public java.lang.String getName() {
			java.lang.Object ref = name_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				if (bs.isValidUtf8()) {
					name_ = s;
				}
				return s;
			}
		}

		/**
		 * <code>required string name = 1;</code>
		 */
		public com.google.protobuf.ByteString getNameBytes() {
			java.lang.Object ref = name_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				name_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		// required bytes value = 2;
		public static final int VALUE_FIELD_NUMBER = 2;
		private com.google.protobuf.ByteString value_;

		/**
		 * <code>required bytes value = 2;</code>
		 */
		public boolean hasValue() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>required bytes value = 2;</code>
		 */
		public com.google.protobuf.ByteString getValue() {
			return value_;
		}

		private void initFields() {
			name_ = "";
			value_ = com.google.protobuf.ByteString.EMPTY;
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			if (!hasName()) {
				memoizedIsInitialized = 0;
				return false;
			}
			if (!hasValue()) {
				memoizedIsInitialized = 0;
				return false;
			}
			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeBytes(1, getNameBytes());
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeBytes(2, value_);
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, getNameBytes());
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, value_);
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static OrcProto.UserMetadataItem parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.UserMetadataItem parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.UserMetadataItem parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.UserMetadataItem parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.UserMetadataItem parseFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.UserMetadataItem parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static OrcProto.UserMetadataItem parseDelimitedFrom(java.io.InputStream input)
				throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static OrcProto.UserMetadataItem parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static OrcProto.UserMetadataItem parseFrom(com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.UserMetadataItem parseFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(OrcProto.UserMetadataItem prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code UserMetadataItem}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				OrcProto.UserMetadataItemOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_UserMetadataItem_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_UserMetadataItem_fieldAccessorTable
						.ensureFieldAccessorsInitialized(OrcProto.UserMetadataItem.class,
								OrcProto.UserMetadataItem.Builder.class);
			}

			// Construct using OrcProto.UserMetadataItem.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				name_ = "";
				bitField0_ = (bitField0_ & ~0x00000001);
				value_ = com.google.protobuf.ByteString.EMPTY;
				bitField0_ = (bitField0_ & ~0x00000002);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_UserMetadataItem_descriptor;
			}

			public OrcProto.UserMetadataItem getDefaultInstanceForType() {
				return OrcProto.UserMetadataItem.getDefaultInstance();
			}

			public OrcProto.UserMetadataItem build() {
				OrcProto.UserMetadataItem result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public OrcProto.UserMetadataItem buildPartial() {
				OrcProto.UserMetadataItem result = new OrcProto.UserMetadataItem(this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.name_ = name_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				result.value_ = value_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof OrcProto.UserMetadataItem) {
					return mergeFrom((OrcProto.UserMetadataItem) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(OrcProto.UserMetadataItem other) {
				if (other == OrcProto.UserMetadataItem.getDefaultInstance())
					return this;
				if (other.hasName()) {
					bitField0_ |= 0x00000001;
					name_ = other.name_;
					onChanged();
				}
				if (other.hasValue()) {
					setValue(other.getValue());
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				if (!hasName()) {

					return false;
				}
				if (!hasValue()) {

					return false;
				}
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				OrcProto.UserMetadataItem parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (OrcProto.UserMetadataItem) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			// required string name = 1;
			private java.lang.Object name_ = "";

			/**
			 * <code>required string name = 1;</code>
			 */
			public boolean hasName() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <code>required string name = 1;</code>
			 */
			public java.lang.String getName() {
				java.lang.Object ref = name_;
				if (!(ref instanceof java.lang.String)) {
					java.lang.String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
					name_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <code>required string name = 1;</code>
			 */
			public com.google.protobuf.ByteString getNameBytes() {
				java.lang.Object ref = name_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					name_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>required string name = 1;</code>
			 */
			public Builder setName(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000001;
				name_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>required string name = 1;</code>
			 */
			public Builder clearName() {
				bitField0_ = (bitField0_ & ~0x00000001);
				name_ = getDefaultInstance().getName();
				onChanged();
				return this;
			}

			/**
			 * <code>required string name = 1;</code>
			 */
			public Builder setNameBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000001;
				name_ = value;
				onChanged();
				return this;
			}

			// required bytes value = 2;
			private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;

			/**
			 * <code>required bytes value = 2;</code>
			 */
			public boolean hasValue() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			/**
			 * <code>required bytes value = 2;</code>
			 */
			public com.google.protobuf.ByteString getValue() {
				return value_;
			}

			/**
			 * <code>required bytes value = 2;</code>
			 */
			public Builder setValue(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000002;
				value_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>required bytes value = 2;</code>
			 */
			public Builder clearValue() {
				bitField0_ = (bitField0_ & ~0x00000002);
				value_ = getDefaultInstance().getValue();
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:UserMetadataItem)
		}

		static {
			defaultInstance = new UserMetadataItem(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:UserMetadataItem)
	}

	public interface FooterOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// optional uint64 headerLength = 1;
		/**
		 * <code>optional uint64 headerLength = 1;</code>
		 */
		boolean hasHeaderLength();

		/**
		 * <code>optional uint64 headerLength = 1;</code>
		 */
		long getHeaderLength();

		// optional uint64 contentLength = 2;
		/**
		 * <code>optional uint64 contentLength = 2;</code>
		 */
		boolean hasContentLength();

		/**
		 * <code>optional uint64 contentLength = 2;</code>
		 */
		long getContentLength();

		// repeated .StripeInformation stripes = 3;
		/**
		 * <code>repeated .StripeInformation stripes = 3;</code>
		 */
		java.util.List<OrcProto.StripeInformation> getStripesList();

		/**
		 * <code>repeated .StripeInformation stripes = 3;</code>
		 */
		OrcProto.StripeInformation getStripes(int index);

		/**
		 * <code>repeated .StripeInformation stripes = 3;</code>
		 */
		int getStripesCount();

		/**
		 * <code>repeated .StripeInformation stripes = 3;</code>
		 */
		java.util.List<? extends OrcProto.StripeInformationOrBuilder> getStripesOrBuilderList();

		/**
		 * <code>repeated .StripeInformation stripes = 3;</code>
		 */
		OrcProto.StripeInformationOrBuilder getStripesOrBuilder(int index);

		// repeated .Type types = 4;
		/**
		 * <code>repeated .Type types = 4;</code>
		 */
		java.util.List<OrcProto.Type> getTypesList();

		/**
		 * <code>repeated .Type types = 4;</code>
		 */
		OrcProto.Type getTypes(int index);

		/**
		 * <code>repeated .Type types = 4;</code>
		 */
		int getTypesCount();

		/**
		 * <code>repeated .Type types = 4;</code>
		 */
		java.util.List<? extends OrcProto.TypeOrBuilder> getTypesOrBuilderList();

		/**
		 * <code>repeated .Type types = 4;</code>
		 */
		OrcProto.TypeOrBuilder getTypesOrBuilder(int index);

		// repeated .UserMetadataItem metadata = 5;
		/**
		 * <code>repeated .UserMetadataItem metadata = 5;</code>
		 */
		java.util.List<OrcProto.UserMetadataItem> getMetadataList();

		/**
		 * <code>repeated .UserMetadataItem metadata = 5;</code>
		 */
		OrcProto.UserMetadataItem getMetadata(int index);

		/**
		 * <code>repeated .UserMetadataItem metadata = 5;</code>
		 */
		int getMetadataCount();

		/**
		 * <code>repeated .UserMetadataItem metadata = 5;</code>
		 */
		java.util.List<? extends OrcProto.UserMetadataItemOrBuilder> getMetadataOrBuilderList();

		/**
		 * <code>repeated .UserMetadataItem metadata = 5;</code>
		 */
		OrcProto.UserMetadataItemOrBuilder getMetadataOrBuilder(int index);

		// optional uint64 numberOfRows = 6;
		/**
		 * <code>optional uint64 numberOfRows = 6;</code>
		 */
		boolean hasNumberOfRows();

		/**
		 * <code>optional uint64 numberOfRows = 6;</code>
		 */
		long getNumberOfRows();

		// repeated .ColumnStatistics statistics = 7;
		/**
		 * <code>repeated .ColumnStatistics statistics = 7;</code>
		 */
		java.util.List<OrcProto.ColumnStatistics> getStatisticsList();

		/**
		 * <code>repeated .ColumnStatistics statistics = 7;</code>
		 */
		OrcProto.ColumnStatistics getStatistics(int index);

		/**
		 * <code>repeated .ColumnStatistics statistics = 7;</code>
		 */
		int getStatisticsCount();

		/**
		 * <code>repeated .ColumnStatistics statistics = 7;</code>
		 */
		java.util.List<? extends OrcProto.ColumnStatisticsOrBuilder> getStatisticsOrBuilderList();

		/**
		 * <code>repeated .ColumnStatistics statistics = 7;</code>
		 */
		OrcProto.ColumnStatisticsOrBuilder getStatisticsOrBuilder(int index);

		// optional uint32 rowIndexStride = 8;
		/**
		 * <code>optional uint32 rowIndexStride = 8;</code>
		 */
		boolean hasRowIndexStride();

		/**
		 * <code>optional uint32 rowIndexStride = 8;</code>
		 */
		int getRowIndexStride();
	}

	/**
	 * Protobuf type {@code Footer}
	 */
	public static final class Footer extends com.google.protobuf.GeneratedMessage implements FooterOrBuilder {
		// Use Footer.newBuilder() to construct.
		private Footer(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private Footer(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final Footer defaultInstance;

		public static Footer getDefaultInstance() {
			return defaultInstance;
		}

		public Footer getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private Footer(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			int mutable_bitField0_ = 0;
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 8: {
						bitField0_ |= 0x00000001;
						headerLength_ = input.readUInt64();
						break;
					}
					case 16: {
						bitField0_ |= 0x00000002;
						contentLength_ = input.readUInt64();
						break;
					}
					case 26: {
						if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
							stripes_ = new java.util.ArrayList<OrcProto.StripeInformation>();
							mutable_bitField0_ |= 0x00000004;
						}
						stripes_.add(input.readMessage(OrcProto.StripeInformation.PARSER, extensionRegistry));
						break;
					}
					case 34: {
						if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
							types_ = new java.util.ArrayList<OrcProto.Type>();
							mutable_bitField0_ |= 0x00000008;
						}
						types_.add(input.readMessage(OrcProto.Type.PARSER, extensionRegistry));
						break;
					}
					case 42: {
						if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
							metadata_ = new java.util.ArrayList<OrcProto.UserMetadataItem>();
							mutable_bitField0_ |= 0x00000010;
						}
						metadata_.add(input.readMessage(OrcProto.UserMetadataItem.PARSER, extensionRegistry));
						break;
					}
					case 48: {
						bitField0_ |= 0x00000004;
						numberOfRows_ = input.readUInt64();
						break;
					}
					case 58: {
						if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
							statistics_ = new java.util.ArrayList<OrcProto.ColumnStatistics>();
							mutable_bitField0_ |= 0x00000040;
						}
						statistics_.add(input.readMessage(OrcProto.ColumnStatistics.PARSER, extensionRegistry));
						break;
					}
					case 64: {
						bitField0_ |= 0x00000008;
						rowIndexStride_ = input.readUInt32();
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
			} finally {
				if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
					stripes_ = java.util.Collections.unmodifiableList(stripes_);
				}
				if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
					types_ = java.util.Collections.unmodifiableList(types_);
				}
				if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
					metadata_ = java.util.Collections.unmodifiableList(metadata_);
				}
				if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
					statistics_ = java.util.Collections.unmodifiableList(statistics_);
				}
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_Footer_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_Footer_fieldAccessorTable
					.ensureFieldAccessorsInitialized(OrcProto.Footer.class, OrcProto.Footer.Builder.class);
		}

		public static com.google.protobuf.Parser<Footer> PARSER = new com.google.protobuf.AbstractParser<Footer>() {
			public Footer parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new Footer(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<Footer> getParserForType() {
			return PARSER;
		}

		private int bitField0_;
		// optional uint64 headerLength = 1;
		public static final int HEADERLENGTH_FIELD_NUMBER = 1;
		private long headerLength_;

		/**
		 * <code>optional uint64 headerLength = 1;</code>
		 */
		public boolean hasHeaderLength() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>optional uint64 headerLength = 1;</code>
		 */
		public long getHeaderLength() {
			return headerLength_;
		}

		// optional uint64 contentLength = 2;
		public static final int CONTENTLENGTH_FIELD_NUMBER = 2;
		private long contentLength_;

		/**
		 * <code>optional uint64 contentLength = 2;</code>
		 */
		public boolean hasContentLength() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>optional uint64 contentLength = 2;</code>
		 */
		public long getContentLength() {
			return contentLength_;
		}

		// repeated .StripeInformation stripes = 3;
		public static final int STRIPES_FIELD_NUMBER = 3;
		private java.util.List<OrcProto.StripeInformation> stripes_;

		/**
		 * <code>repeated .StripeInformation stripes = 3;</code>
		 */
		public java.util.List<OrcProto.StripeInformation> getStripesList() {
			return stripes_;
		}

		/**
		 * <code>repeated .StripeInformation stripes = 3;</code>
		 */
		public java.util.List<? extends OrcProto.StripeInformationOrBuilder> getStripesOrBuilderList() {
			return stripes_;
		}

		/**
		 * <code>repeated .StripeInformation stripes = 3;</code>
		 */
		public int getStripesCount() {
			return stripes_.size();
		}

		/**
		 * <code>repeated .StripeInformation stripes = 3;</code>
		 */
		public OrcProto.StripeInformation getStripes(int index) {
			return stripes_.get(index);
		}

		/**
		 * <code>repeated .StripeInformation stripes = 3;</code>
		 */
		public OrcProto.StripeInformationOrBuilder getStripesOrBuilder(int index) {
			return stripes_.get(index);
		}

		// repeated .Type types = 4;
		public static final int TYPES_FIELD_NUMBER = 4;
		private java.util.List<OrcProto.Type> types_;

		/**
		 * <code>repeated .Type types = 4;</code>
		 */
		public java.util.List<OrcProto.Type> getTypesList() {
			return types_;
		}

		/**
		 * <code>repeated .Type types = 4;</code>
		 */
		public java.util.List<? extends OrcProto.TypeOrBuilder> getTypesOrBuilderList() {
			return types_;
		}

		/**
		 * <code>repeated .Type types = 4;</code>
		 */
		public int getTypesCount() {
			return types_.size();
		}

		/**
		 * <code>repeated .Type types = 4;</code>
		 */
		public OrcProto.Type getTypes(int index) {
			return types_.get(index);
		}

		/**
		 * <code>repeated .Type types = 4;</code>
		 */
		public OrcProto.TypeOrBuilder getTypesOrBuilder(int index) {
			return types_.get(index);
		}

		// repeated .UserMetadataItem metadata = 5;
		public static final int METADATA_FIELD_NUMBER = 5;
		private java.util.List<OrcProto.UserMetadataItem> metadata_;

		/**
		 * <code>repeated .UserMetadataItem metadata = 5;</code>
		 */
		public java.util.List<OrcProto.UserMetadataItem> getMetadataList() {
			return metadata_;
		}

		/**
		 * <code>repeated .UserMetadataItem metadata = 5;</code>
		 */
		public java.util.List<? extends OrcProto.UserMetadataItemOrBuilder> getMetadataOrBuilderList() {
			return metadata_;
		}

		/**
		 * <code>repeated .UserMetadataItem metadata = 5;</code>
		 */
		public int getMetadataCount() {
			return metadata_.size();
		}

		/**
		 * <code>repeated .UserMetadataItem metadata = 5;</code>
		 */
		public OrcProto.UserMetadataItem getMetadata(int index) {
			return metadata_.get(index);
		}

		/**
		 * <code>repeated .UserMetadataItem metadata = 5;</code>
		 */
		public OrcProto.UserMetadataItemOrBuilder getMetadataOrBuilder(int index) {
			return metadata_.get(index);
		}

		// optional uint64 numberOfRows = 6;
		public static final int NUMBEROFROWS_FIELD_NUMBER = 6;
		private long numberOfRows_;

		/**
		 * <code>optional uint64 numberOfRows = 6;</code>
		 */
		public boolean hasNumberOfRows() {
			return ((bitField0_ & 0x00000004) == 0x00000004);
		}

		/**
		 * <code>optional uint64 numberOfRows = 6;</code>
		 */
		public long getNumberOfRows() {
			return numberOfRows_;
		}

		// repeated .ColumnStatistics statistics = 7;
		public static final int STATISTICS_FIELD_NUMBER = 7;
		private java.util.List<OrcProto.ColumnStatistics> statistics_;

		/**
		 * <code>repeated .ColumnStatistics statistics = 7;</code>
		 */
		public java.util.List<OrcProto.ColumnStatistics> getStatisticsList() {
			return statistics_;
		}

		/**
		 * <code>repeated .ColumnStatistics statistics = 7;</code>
		 */
		public java.util.List<? extends OrcProto.ColumnStatisticsOrBuilder> getStatisticsOrBuilderList() {
			return statistics_;
		}

		/**
		 * <code>repeated .ColumnStatistics statistics = 7;</code>
		 */
		public int getStatisticsCount() {
			return statistics_.size();
		}

		/**
		 * <code>repeated .ColumnStatistics statistics = 7;</code>
		 */
		public OrcProto.ColumnStatistics getStatistics(int index) {
			return statistics_.get(index);
		}

		/**
		 * <code>repeated .ColumnStatistics statistics = 7;</code>
		 */
		public OrcProto.ColumnStatisticsOrBuilder getStatisticsOrBuilder(int index) {
			return statistics_.get(index);
		}

		// optional uint32 rowIndexStride = 8;
		public static final int ROWINDEXSTRIDE_FIELD_NUMBER = 8;
		private int rowIndexStride_;

		/**
		 * <code>optional uint32 rowIndexStride = 8;</code>
		 */
		public boolean hasRowIndexStride() {
			return ((bitField0_ & 0x00000008) == 0x00000008);
		}

		/**
		 * <code>optional uint32 rowIndexStride = 8;</code>
		 */
		public int getRowIndexStride() {
			return rowIndexStride_;
		}

		private void initFields() {
			headerLength_ = 0L;
			contentLength_ = 0L;
			stripes_ = java.util.Collections.emptyList();
			types_ = java.util.Collections.emptyList();
			metadata_ = java.util.Collections.emptyList();
			numberOfRows_ = 0L;
			statistics_ = java.util.Collections.emptyList();
			rowIndexStride_ = 0;
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			for (int i = 0; i < getTypesCount(); i++) {
				if (!getTypes(i).isInitialized()) {
					memoizedIsInitialized = 0;
					return false;
				}
			}
			for (int i = 0; i < getMetadataCount(); i++) {
				if (!getMetadata(i).isInitialized()) {
					memoizedIsInitialized = 0;
					return false;
				}
			}
			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeUInt64(1, headerLength_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeUInt64(2, contentLength_);
			}
			for (int i = 0; i < stripes_.size(); i++) {
				output.writeMessage(3, stripes_.get(i));
			}
			for (int i = 0; i < types_.size(); i++) {
				output.writeMessage(4, types_.get(i));
			}
			for (int i = 0; i < metadata_.size(); i++) {
				output.writeMessage(5, metadata_.get(i));
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				output.writeUInt64(6, numberOfRows_);
			}
			for (int i = 0; i < statistics_.size(); i++) {
				output.writeMessage(7, statistics_.get(i));
			}
			if (((bitField0_ & 0x00000008) == 0x00000008)) {
				output.writeUInt32(8, rowIndexStride_);
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream.computeUInt64Size(1, headerLength_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream.computeUInt64Size(2, contentLength_);
			}
			for (int i = 0; i < stripes_.size(); i++) {
				size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, stripes_.get(i));
			}
			for (int i = 0; i < types_.size(); i++) {
				size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, types_.get(i));
			}
			for (int i = 0; i < metadata_.size(); i++) {
				size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, metadata_.get(i));
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				size += com.google.protobuf.CodedOutputStream.computeUInt64Size(6, numberOfRows_);
			}
			for (int i = 0; i < statistics_.size(); i++) {
				size += com.google.protobuf.CodedOutputStream.computeMessageSize(7, statistics_.get(i));
			}
			if (((bitField0_ & 0x00000008) == 0x00000008)) {
				size += com.google.protobuf.CodedOutputStream.computeUInt32Size(8, rowIndexStride_);
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static OrcProto.Footer parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.Footer parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.Footer parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.Footer parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.Footer parseFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.Footer parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static OrcProto.Footer parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static OrcProto.Footer parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static OrcProto.Footer parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.Footer parseFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(OrcProto.Footer prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code Footer}
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				OrcProto.FooterOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_Footer_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_Footer_fieldAccessorTable
						.ensureFieldAccessorsInitialized(OrcProto.Footer.class, OrcProto.Footer.Builder.class);
			}

			// Construct using OrcProto.Footer.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
					getStripesFieldBuilder();
					getTypesFieldBuilder();
					getMetadataFieldBuilder();
					getStatisticsFieldBuilder();
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				headerLength_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000001);
				contentLength_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000002);
				if (stripesBuilder_ == null) {
					stripes_ = java.util.Collections.emptyList();
					bitField0_ = (bitField0_ & ~0x00000004);
				} else {
					stripesBuilder_.clear();
				}
				if (typesBuilder_ == null) {
					types_ = java.util.Collections.emptyList();
					bitField0_ = (bitField0_ & ~0x00000008);
				} else {
					typesBuilder_.clear();
				}
				if (metadataBuilder_ == null) {
					metadata_ = java.util.Collections.emptyList();
					bitField0_ = (bitField0_ & ~0x00000010);
				} else {
					metadataBuilder_.clear();
				}
				numberOfRows_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000020);
				if (statisticsBuilder_ == null) {
					statistics_ = java.util.Collections.emptyList();
					bitField0_ = (bitField0_ & ~0x00000040);
				} else {
					statisticsBuilder_.clear();
				}
				rowIndexStride_ = 0;
				bitField0_ = (bitField0_ & ~0x00000080);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_Footer_descriptor;
			}

			public OrcProto.Footer getDefaultInstanceForType() {
				return OrcProto.Footer.getDefaultInstance();
			}

			public OrcProto.Footer build() {
				OrcProto.Footer result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public OrcProto.Footer buildPartial() {
				OrcProto.Footer result = new OrcProto.Footer(this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.headerLength_ = headerLength_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				result.contentLength_ = contentLength_;
				if (stripesBuilder_ == null) {
					if (((bitField0_ & 0x00000004) == 0x00000004)) {
						stripes_ = java.util.Collections.unmodifiableList(stripes_);
						bitField0_ = (bitField0_ & ~0x00000004);
					}
					result.stripes_ = stripes_;
				} else {
					result.stripes_ = stripesBuilder_.build();
				}
				if (typesBuilder_ == null) {
					if (((bitField0_ & 0x00000008) == 0x00000008)) {
						types_ = java.util.Collections.unmodifiableList(types_);
						bitField0_ = (bitField0_ & ~0x00000008);
					}
					result.types_ = types_;
				} else {
					result.types_ = typesBuilder_.build();
				}
				if (metadataBuilder_ == null) {
					if (((bitField0_ & 0x00000010) == 0x00000010)) {
						metadata_ = java.util.Collections.unmodifiableList(metadata_);
						bitField0_ = (bitField0_ & ~0x00000010);
					}
					result.metadata_ = metadata_;
				} else {
					result.metadata_ = metadataBuilder_.build();
				}
				if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
					to_bitField0_ |= 0x00000004;
				}
				result.numberOfRows_ = numberOfRows_;
				if (statisticsBuilder_ == null) {
					if (((bitField0_ & 0x00000040) == 0x00000040)) {
						statistics_ = java.util.Collections.unmodifiableList(statistics_);
						bitField0_ = (bitField0_ & ~0x00000040);
					}
					result.statistics_ = statistics_;
				} else {
					result.statistics_ = statisticsBuilder_.build();
				}
				if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
					to_bitField0_ |= 0x00000008;
				}
				result.rowIndexStride_ = rowIndexStride_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof OrcProto.Footer) {
					return mergeFrom((OrcProto.Footer) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(OrcProto.Footer other) {
				if (other == OrcProto.Footer.getDefaultInstance())
					return this;
				if (other.hasHeaderLength()) {
					setHeaderLength(other.getHeaderLength());
				}
				if (other.hasContentLength()) {
					setContentLength(other.getContentLength());
				}
				if (stripesBuilder_ == null) {
					if (!other.stripes_.isEmpty()) {
						if (stripes_.isEmpty()) {
							stripes_ = other.stripes_;
							bitField0_ = (bitField0_ & ~0x00000004);
						} else {
							ensureStripesIsMutable();
							stripes_.addAll(other.stripes_);
						}
						onChanged();
					}
				} else {
					if (!other.stripes_.isEmpty()) {
						if (stripesBuilder_.isEmpty()) {
							stripesBuilder_.dispose();
							stripesBuilder_ = null;
							stripes_ = other.stripes_;
							bitField0_ = (bitField0_ & ~0x00000004);
							stripesBuilder_ = com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ? getStripesFieldBuilder()
									: null;
						} else {
							stripesBuilder_.addAllMessages(other.stripes_);
						}
					}
				}
				if (typesBuilder_ == null) {
					if (!other.types_.isEmpty()) {
						if (types_.isEmpty()) {
							types_ = other.types_;
							bitField0_ = (bitField0_ & ~0x00000008);
						} else {
							ensureTypesIsMutable();
							types_.addAll(other.types_);
						}
						onChanged();
					}
				} else {
					if (!other.types_.isEmpty()) {
						if (typesBuilder_.isEmpty()) {
							typesBuilder_.dispose();
							typesBuilder_ = null;
							types_ = other.types_;
							bitField0_ = (bitField0_ & ~0x00000008);
							typesBuilder_ = com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ? getTypesFieldBuilder()
									: null;
						} else {
							typesBuilder_.addAllMessages(other.types_);
						}
					}
				}
				if (metadataBuilder_ == null) {
					if (!other.metadata_.isEmpty()) {
						if (metadata_.isEmpty()) {
							metadata_ = other.metadata_;
							bitField0_ = (bitField0_ & ~0x00000010);
						} else {
							ensureMetadataIsMutable();
							metadata_.addAll(other.metadata_);
						}
						onChanged();
					}
				} else {
					if (!other.metadata_.isEmpty()) {
						if (metadataBuilder_.isEmpty()) {
							metadataBuilder_.dispose();
							metadataBuilder_ = null;
							metadata_ = other.metadata_;
							bitField0_ = (bitField0_ & ~0x00000010);
							metadataBuilder_ = com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ? getMetadataFieldBuilder()
									: null;
						} else {
							metadataBuilder_.addAllMessages(other.metadata_);
						}
					}
				}
				if (other.hasNumberOfRows()) {
					setNumberOfRows(other.getNumberOfRows());
				}
				if (statisticsBuilder_ == null) {
					if (!other.statistics_.isEmpty()) {
						if (statistics_.isEmpty()) {
							statistics_ = other.statistics_;
							bitField0_ = (bitField0_ & ~0x00000040);
						} else {
							ensureStatisticsIsMutable();
							statistics_.addAll(other.statistics_);
						}
						onChanged();
					}
				} else {
					if (!other.statistics_.isEmpty()) {
						if (statisticsBuilder_.isEmpty()) {
							statisticsBuilder_.dispose();
							statisticsBuilder_ = null;
							statistics_ = other.statistics_;
							bitField0_ = (bitField0_ & ~0x00000040);
							statisticsBuilder_ = com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ? getStatisticsFieldBuilder()
									: null;
						} else {
							statisticsBuilder_.addAllMessages(other.statistics_);
						}
					}
				}
				if (other.hasRowIndexStride()) {
					setRowIndexStride(other.getRowIndexStride());
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				for (int i = 0; i < getTypesCount(); i++) {
					if (!getTypes(i).isInitialized()) {

						return false;
					}
				}
				for (int i = 0; i < getMetadataCount(); i++) {
					if (!getMetadata(i).isInitialized()) {

						return false;
					}
				}
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				OrcProto.Footer parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (OrcProto.Footer) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			// optional uint64 headerLength = 1;
			private long headerLength_;

			/**
			 * <code>optional uint64 headerLength = 1;</code>
			 */
			public boolean hasHeaderLength() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <code>optional uint64 headerLength = 1;</code>
			 */
			public long getHeaderLength() {
				return headerLength_;
			}

			/**
			 * <code>optional uint64 headerLength = 1;</code>
			 */
			public Builder setHeaderLength(long value) {
				bitField0_ |= 0x00000001;
				headerLength_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional uint64 headerLength = 1;</code>
			 */
			public Builder clearHeaderLength() {
				bitField0_ = (bitField0_ & ~0x00000001);
				headerLength_ = 0L;
				onChanged();
				return this;
			}

			// optional uint64 contentLength = 2;
			private long contentLength_;

			/**
			 * <code>optional uint64 contentLength = 2;</code>
			 */
			public boolean hasContentLength() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			/**
			 * <code>optional uint64 contentLength = 2;</code>
			 */
			public long getContentLength() {
				return contentLength_;
			}

			/**
			 * <code>optional uint64 contentLength = 2;</code>
			 */
			public Builder setContentLength(long value) {
				bitField0_ |= 0x00000002;
				contentLength_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional uint64 contentLength = 2;</code>
			 */
			public Builder clearContentLength() {
				bitField0_ = (bitField0_ & ~0x00000002);
				contentLength_ = 0L;
				onChanged();
				return this;
			}

			// repeated .StripeInformation stripes = 3;
			private java.util.List<OrcProto.StripeInformation> stripes_ = java.util.Collections.emptyList();

			private void ensureStripesIsMutable() {
				if (!((bitField0_ & 0x00000004) == 0x00000004)) {
					stripes_ = new java.util.ArrayList<OrcProto.StripeInformation>(stripes_);
					bitField0_ |= 0x00000004;
				}
			}

			private com.google.protobuf.RepeatedFieldBuilder<OrcProto.StripeInformation, OrcProto.StripeInformation.Builder, OrcProto.StripeInformationOrBuilder> stripesBuilder_;

			/**
			 * <code>repeated .StripeInformation stripes = 3;</code>
			 */
			public java.util.List<OrcProto.StripeInformation> getStripesList() {
				if (stripesBuilder_ == null) {
					return java.util.Collections.unmodifiableList(stripes_);
				} else {
					return stripesBuilder_.getMessageList();
				}
			}

			/**
			 * <code>repeated .StripeInformation stripes = 3;</code>
			 */
			public int getStripesCount() {
				if (stripesBuilder_ == null) {
					return stripes_.size();
				} else {
					return stripesBuilder_.getCount();
				}
			}

			/**
			 * <code>repeated .StripeInformation stripes = 3;</code>
			 */
			public OrcProto.StripeInformation getStripes(int index) {
				if (stripesBuilder_ == null) {
					return stripes_.get(index);
				} else {
					return stripesBuilder_.getMessage(index);
				}
			}

			/**
			 * <code>repeated .StripeInformation stripes = 3;</code>
			 */
			public Builder setStripes(int index, OrcProto.StripeInformation value) {
				if (stripesBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureStripesIsMutable();
					stripes_.set(index, value);
					onChanged();
				} else {
					stripesBuilder_.setMessage(index, value);
				}
				return this;
			}

			/**
			 * <code>repeated .StripeInformation stripes = 3;</code>
			 */
			public Builder setStripes(int index, OrcProto.StripeInformation.Builder builderForValue) {
				if (stripesBuilder_ == null) {
					ensureStripesIsMutable();
					stripes_.set(index, builderForValue.build());
					onChanged();
				} else {
					stripesBuilder_.setMessage(index, builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .StripeInformation stripes = 3;</code>
			 */
			public Builder addStripes(OrcProto.StripeInformation value) {
				if (stripesBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureStripesIsMutable();
					stripes_.add(value);
					onChanged();
				} else {
					stripesBuilder_.addMessage(value);
				}
				return this;
			}

			/**
			 * <code>repeated .StripeInformation stripes = 3;</code>
			 */
			public Builder addStripes(int index, OrcProto.StripeInformation value) {
				if (stripesBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureStripesIsMutable();
					stripes_.add(index, value);
					onChanged();
				} else {
					stripesBuilder_.addMessage(index, value);
				}
				return this;
			}

			/**
			 * <code>repeated .StripeInformation stripes = 3;</code>
			 */
			public Builder addStripes(OrcProto.StripeInformation.Builder builderForValue) {
				if (stripesBuilder_ == null) {
					ensureStripesIsMutable();
					stripes_.add(builderForValue.build());
					onChanged();
				} else {
					stripesBuilder_.addMessage(builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .StripeInformation stripes = 3;</code>
			 */
			public Builder addStripes(int index, OrcProto.StripeInformation.Builder builderForValue) {
				if (stripesBuilder_ == null) {
					ensureStripesIsMutable();
					stripes_.add(index, builderForValue.build());
					onChanged();
				} else {
					stripesBuilder_.addMessage(index, builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .StripeInformation stripes = 3;</code>
			 */
			public Builder addAllStripes(java.lang.Iterable<? extends OrcProto.StripeInformation> values) {
				if (stripesBuilder_ == null) {
					ensureStripesIsMutable();
					super.addAll(values, stripes_);
					onChanged();
				} else {
					stripesBuilder_.addAllMessages(values);
				}
				return this;
			}

			/**
			 * <code>repeated .StripeInformation stripes = 3;</code>
			 */
			public Builder clearStripes() {
				if (stripesBuilder_ == null) {
					stripes_ = java.util.Collections.emptyList();
					bitField0_ = (bitField0_ & ~0x00000004);
					onChanged();
				} else {
					stripesBuilder_.clear();
				}
				return this;
			}

			/**
			 * <code>repeated .StripeInformation stripes = 3;</code>
			 */
			public Builder removeStripes(int index) {
				if (stripesBuilder_ == null) {
					ensureStripesIsMutable();
					stripes_.remove(index);
					onChanged();
				} else {
					stripesBuilder_.remove(index);
				}
				return this;
			}

			/**
			 * <code>repeated .StripeInformation stripes = 3;</code>
			 */
			public OrcProto.StripeInformation.Builder getStripesBuilder(int index) {
				return getStripesFieldBuilder().getBuilder(index);
			}

			/**
			 * <code>repeated .StripeInformation stripes = 3;</code>
			 */
			public OrcProto.StripeInformationOrBuilder getStripesOrBuilder(int index) {
				if (stripesBuilder_ == null) {
					return stripes_.get(index);
				} else {
					return stripesBuilder_.getMessageOrBuilder(index);
				}
			}

			/**
			 * <code>repeated .StripeInformation stripes = 3;</code>
			 */
			public java.util.List<? extends OrcProto.StripeInformationOrBuilder> getStripesOrBuilderList() {
				if (stripesBuilder_ != null) {
					return stripesBuilder_.getMessageOrBuilderList();
				} else {
					return java.util.Collections.unmodifiableList(stripes_);
				}
			}

			/**
			 * <code>repeated .StripeInformation stripes = 3;</code>
			 */
			public OrcProto.StripeInformation.Builder addStripesBuilder() {
				return getStripesFieldBuilder().addBuilder(OrcProto.StripeInformation.getDefaultInstance());
			}

			/**
			 * <code>repeated .StripeInformation stripes = 3;</code>
			 */
			public OrcProto.StripeInformation.Builder addStripesBuilder(int index) {
				return getStripesFieldBuilder().addBuilder(index, OrcProto.StripeInformation.getDefaultInstance());
			}

			/**
			 * <code>repeated .StripeInformation stripes = 3;</code>
			 */
			public java.util.List<OrcProto.StripeInformation.Builder> getStripesBuilderList() {
				return getStripesFieldBuilder().getBuilderList();
			}

			private com.google.protobuf.RepeatedFieldBuilder<OrcProto.StripeInformation, OrcProto.StripeInformation.Builder, OrcProto.StripeInformationOrBuilder> getStripesFieldBuilder() {
				if (stripesBuilder_ == null) {
					stripesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<OrcProto.StripeInformation, OrcProto.StripeInformation.Builder, OrcProto.StripeInformationOrBuilder>(
							stripes_, ((bitField0_ & 0x00000004) == 0x00000004), getParentForChildren(), isClean());
					stripes_ = null;
				}
				return stripesBuilder_;
			}

			// repeated .Type types = 4;
			private java.util.List<OrcProto.Type> types_ = java.util.Collections.emptyList();

			private void ensureTypesIsMutable() {
				if (!((bitField0_ & 0x00000008) == 0x00000008)) {
					types_ = new java.util.ArrayList<OrcProto.Type>(types_);
					bitField0_ |= 0x00000008;
				}
			}

			private com.google.protobuf.RepeatedFieldBuilder<OrcProto.Type, OrcProto.Type.Builder, OrcProto.TypeOrBuilder> typesBuilder_;

			/**
			 * <code>repeated .Type types = 4;</code>
			 */
			public java.util.List<OrcProto.Type> getTypesList() {
				if (typesBuilder_ == null) {
					return java.util.Collections.unmodifiableList(types_);
				} else {
					return typesBuilder_.getMessageList();
				}
			}

			/**
			 * <code>repeated .Type types = 4;</code>
			 */
			public int getTypesCount() {
				if (typesBuilder_ == null) {
					return types_.size();
				} else {
					return typesBuilder_.getCount();
				}
			}

			/**
			 * <code>repeated .Type types = 4;</code>
			 */
			public OrcProto.Type getTypes(int index) {
				if (typesBuilder_ == null) {
					return types_.get(index);
				} else {
					return typesBuilder_.getMessage(index);
				}
			}

			/**
			 * <code>repeated .Type types = 4;</code>
			 */
			public Builder setTypes(int index, OrcProto.Type value) {
				if (typesBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureTypesIsMutable();
					types_.set(index, value);
					onChanged();
				} else {
					typesBuilder_.setMessage(index, value);
				}
				return this;
			}

			/**
			 * <code>repeated .Type types = 4;</code>
			 */
			public Builder setTypes(int index, OrcProto.Type.Builder builderForValue) {
				if (typesBuilder_ == null) {
					ensureTypesIsMutable();
					types_.set(index, builderForValue.build());
					onChanged();
				} else {
					typesBuilder_.setMessage(index, builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .Type types = 4;</code>
			 */
			public Builder addTypes(OrcProto.Type value) {
				if (typesBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureTypesIsMutable();
					types_.add(value);
					onChanged();
				} else {
					typesBuilder_.addMessage(value);
				}
				return this;
			}

			/**
			 * <code>repeated .Type types = 4;</code>
			 */
			public Builder addTypes(int index, OrcProto.Type value) {
				if (typesBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureTypesIsMutable();
					types_.add(index, value);
					onChanged();
				} else {
					typesBuilder_.addMessage(index, value);
				}
				return this;
			}

			/**
			 * <code>repeated .Type types = 4;</code>
			 */
			public Builder addTypes(OrcProto.Type.Builder builderForValue) {
				if (typesBuilder_ == null) {
					ensureTypesIsMutable();
					types_.add(builderForValue.build());
					onChanged();
				} else {
					typesBuilder_.addMessage(builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .Type types = 4;</code>
			 */
			public Builder addTypes(int index, OrcProto.Type.Builder builderForValue) {
				if (typesBuilder_ == null) {
					ensureTypesIsMutable();
					types_.add(index, builderForValue.build());
					onChanged();
				} else {
					typesBuilder_.addMessage(index, builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .Type types = 4;</code>
			 */
			public Builder addAllTypes(java.lang.Iterable<? extends OrcProto.Type> values) {
				if (typesBuilder_ == null) {
					ensureTypesIsMutable();
					super.addAll(values, types_);
					onChanged();
				} else {
					typesBuilder_.addAllMessages(values);
				}
				return this;
			}

			/**
			 * <code>repeated .Type types = 4;</code>
			 */
			public Builder clearTypes() {
				if (typesBuilder_ == null) {
					types_ = java.util.Collections.emptyList();
					bitField0_ = (bitField0_ & ~0x00000008);
					onChanged();
				} else {
					typesBuilder_.clear();
				}
				return this;
			}

			/**
			 * <code>repeated .Type types = 4;</code>
			 */
			public Builder removeTypes(int index) {
				if (typesBuilder_ == null) {
					ensureTypesIsMutable();
					types_.remove(index);
					onChanged();
				} else {
					typesBuilder_.remove(index);
				}
				return this;
			}

			/**
			 * <code>repeated .Type types = 4;</code>
			 */
			public OrcProto.Type.Builder getTypesBuilder(int index) {
				return getTypesFieldBuilder().getBuilder(index);
			}

			/**
			 * <code>repeated .Type types = 4;</code>
			 */
			public OrcProto.TypeOrBuilder getTypesOrBuilder(int index) {
				if (typesBuilder_ == null) {
					return types_.get(index);
				} else {
					return typesBuilder_.getMessageOrBuilder(index);
				}
			}

			/**
			 * <code>repeated .Type types = 4;</code>
			 */
			public java.util.List<? extends OrcProto.TypeOrBuilder> getTypesOrBuilderList() {
				if (typesBuilder_ != null) {
					return typesBuilder_.getMessageOrBuilderList();
				} else {
					return java.util.Collections.unmodifiableList(types_);
				}
			}

			/**
			 * <code>repeated .Type types = 4;</code>
			 */
			public OrcProto.Type.Builder addTypesBuilder() {
				return getTypesFieldBuilder().addBuilder(OrcProto.Type.getDefaultInstance());
			}

			/**
			 * <code>repeated .Type types = 4;</code>
			 */
			public OrcProto.Type.Builder addTypesBuilder(int index) {
				return getTypesFieldBuilder().addBuilder(index, OrcProto.Type.getDefaultInstance());
			}

			/**
			 * <code>repeated .Type types = 4;</code>
			 */
			public java.util.List<OrcProto.Type.Builder> getTypesBuilderList() {
				return getTypesFieldBuilder().getBuilderList();
			}

			private com.google.protobuf.RepeatedFieldBuilder<OrcProto.Type, OrcProto.Type.Builder, OrcProto.TypeOrBuilder> getTypesFieldBuilder() {
				if (typesBuilder_ == null) {
					typesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<OrcProto.Type, OrcProto.Type.Builder, OrcProto.TypeOrBuilder>(
							types_, ((bitField0_ & 0x00000008) == 0x00000008), getParentForChildren(), isClean());
					types_ = null;
				}
				return typesBuilder_;
			}

			// repeated .UserMetadataItem metadata = 5;
			private java.util.List<OrcProto.UserMetadataItem> metadata_ = java.util.Collections.emptyList();

			private void ensureMetadataIsMutable() {
				if (!((bitField0_ & 0x00000010) == 0x00000010)) {
					metadata_ = new java.util.ArrayList<OrcProto.UserMetadataItem>(metadata_);
					bitField0_ |= 0x00000010;
				}
			}

			private com.google.protobuf.RepeatedFieldBuilder<OrcProto.UserMetadataItem, OrcProto.UserMetadataItem.Builder, OrcProto.UserMetadataItemOrBuilder> metadataBuilder_;

			/**
			 * <code>repeated .UserMetadataItem metadata = 5;</code>
			 */
			public java.util.List<OrcProto.UserMetadataItem> getMetadataList() {
				if (metadataBuilder_ == null) {
					return java.util.Collections.unmodifiableList(metadata_);
				} else {
					return metadataBuilder_.getMessageList();
				}
			}

			/**
			 * <code>repeated .UserMetadataItem metadata = 5;</code>
			 */
			public int getMetadataCount() {
				if (metadataBuilder_ == null) {
					return metadata_.size();
				} else {
					return metadataBuilder_.getCount();
				}
			}

			/**
			 * <code>repeated .UserMetadataItem metadata = 5;</code>
			 */
			public OrcProto.UserMetadataItem getMetadata(int index) {
				if (metadataBuilder_ == null) {
					return metadata_.get(index);
				} else {
					return metadataBuilder_.getMessage(index);
				}
			}

			/**
			 * <code>repeated .UserMetadataItem metadata = 5;</code>
			 */
			public Builder setMetadata(int index, OrcProto.UserMetadataItem value) {
				if (metadataBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureMetadataIsMutable();
					metadata_.set(index, value);
					onChanged();
				} else {
					metadataBuilder_.setMessage(index, value);
				}
				return this;
			}

			/**
			 * <code>repeated .UserMetadataItem metadata = 5;</code>
			 */
			public Builder setMetadata(int index, OrcProto.UserMetadataItem.Builder builderForValue) {
				if (metadataBuilder_ == null) {
					ensureMetadataIsMutable();
					metadata_.set(index, builderForValue.build());
					onChanged();
				} else {
					metadataBuilder_.setMessage(index, builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .UserMetadataItem metadata = 5;</code>
			 */
			public Builder addMetadata(OrcProto.UserMetadataItem value) {
				if (metadataBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureMetadataIsMutable();
					metadata_.add(value);
					onChanged();
				} else {
					metadataBuilder_.addMessage(value);
				}
				return this;
			}

			/**
			 * <code>repeated .UserMetadataItem metadata = 5;</code>
			 */
			public Builder addMetadata(int index, OrcProto.UserMetadataItem value) {
				if (metadataBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureMetadataIsMutable();
					metadata_.add(index, value);
					onChanged();
				} else {
					metadataBuilder_.addMessage(index, value);
				}
				return this;
			}

			/**
			 * <code>repeated .UserMetadataItem metadata = 5;</code>
			 */
			public Builder addMetadata(OrcProto.UserMetadataItem.Builder builderForValue) {
				if (metadataBuilder_ == null) {
					ensureMetadataIsMutable();
					metadata_.add(builderForValue.build());
					onChanged();
				} else {
					metadataBuilder_.addMessage(builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .UserMetadataItem metadata = 5;</code>
			 */
			public Builder addMetadata(int index, OrcProto.UserMetadataItem.Builder builderForValue) {
				if (metadataBuilder_ == null) {
					ensureMetadataIsMutable();
					metadata_.add(index, builderForValue.build());
					onChanged();
				} else {
					metadataBuilder_.addMessage(index, builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .UserMetadataItem metadata = 5;</code>
			 */
			public Builder addAllMetadata(java.lang.Iterable<? extends OrcProto.UserMetadataItem> values) {
				if (metadataBuilder_ == null) {
					ensureMetadataIsMutable();
					super.addAll(values, metadata_);
					onChanged();
				} else {
					metadataBuilder_.addAllMessages(values);
				}
				return this;
			}

			/**
			 * <code>repeated .UserMetadataItem metadata = 5;</code>
			 */
			public Builder clearMetadata() {
				if (metadataBuilder_ == null) {
					metadata_ = java.util.Collections.emptyList();
					bitField0_ = (bitField0_ & ~0x00000010);
					onChanged();
				} else {
					metadataBuilder_.clear();
				}
				return this;
			}

			/**
			 * <code>repeated .UserMetadataItem metadata = 5;</code>
			 */
			public Builder removeMetadata(int index) {
				if (metadataBuilder_ == null) {
					ensureMetadataIsMutable();
					metadata_.remove(index);
					onChanged();
				} else {
					metadataBuilder_.remove(index);
				}
				return this;
			}

			/**
			 * <code>repeated .UserMetadataItem metadata = 5;</code>
			 */
			public OrcProto.UserMetadataItem.Builder getMetadataBuilder(int index) {
				return getMetadataFieldBuilder().getBuilder(index);
			}

			/**
			 * <code>repeated .UserMetadataItem metadata = 5;</code>
			 */
			public OrcProto.UserMetadataItemOrBuilder getMetadataOrBuilder(int index) {
				if (metadataBuilder_ == null) {
					return metadata_.get(index);
				} else {
					return metadataBuilder_.getMessageOrBuilder(index);
				}
			}

			/**
			 * <code>repeated .UserMetadataItem metadata = 5;</code>
			 */
			public java.util.List<? extends OrcProto.UserMetadataItemOrBuilder> getMetadataOrBuilderList() {
				if (metadataBuilder_ != null) {
					return metadataBuilder_.getMessageOrBuilderList();
				} else {
					return java.util.Collections.unmodifiableList(metadata_);
				}
			}

			/**
			 * <code>repeated .UserMetadataItem metadata = 5;</code>
			 */
			public OrcProto.UserMetadataItem.Builder addMetadataBuilder() {
				return getMetadataFieldBuilder().addBuilder(OrcProto.UserMetadataItem.getDefaultInstance());
			}

			/**
			 * <code>repeated .UserMetadataItem metadata = 5;</code>
			 */
			public OrcProto.UserMetadataItem.Builder addMetadataBuilder(int index) {
				return getMetadataFieldBuilder().addBuilder(index, OrcProto.UserMetadataItem.getDefaultInstance());
			}

			/**
			 * <code>repeated .UserMetadataItem metadata = 5;</code>
			 */
			public java.util.List<OrcProto.UserMetadataItem.Builder> getMetadataBuilderList() {
				return getMetadataFieldBuilder().getBuilderList();
			}

			private com.google.protobuf.RepeatedFieldBuilder<OrcProto.UserMetadataItem, OrcProto.UserMetadataItem.Builder, OrcProto.UserMetadataItemOrBuilder> getMetadataFieldBuilder() {
				if (metadataBuilder_ == null) {
					metadataBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<OrcProto.UserMetadataItem, OrcProto.UserMetadataItem.Builder, OrcProto.UserMetadataItemOrBuilder>(
							metadata_, ((bitField0_ & 0x00000010) == 0x00000010), getParentForChildren(), isClean());
					metadata_ = null;
				}
				return metadataBuilder_;
			}

			// optional uint64 numberOfRows = 6;
			private long numberOfRows_;

			/**
			 * <code>optional uint64 numberOfRows = 6;</code>
			 */
			public boolean hasNumberOfRows() {
				return ((bitField0_ & 0x00000020) == 0x00000020);
			}

			/**
			 * <code>optional uint64 numberOfRows = 6;</code>
			 */
			public long getNumberOfRows() {
				return numberOfRows_;
			}

			/**
			 * <code>optional uint64 numberOfRows = 6;</code>
			 */
			public Builder setNumberOfRows(long value) {
				bitField0_ |= 0x00000020;
				numberOfRows_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional uint64 numberOfRows = 6;</code>
			 */
			public Builder clearNumberOfRows() {
				bitField0_ = (bitField0_ & ~0x00000020);
				numberOfRows_ = 0L;
				onChanged();
				return this;
			}

			// repeated .ColumnStatistics statistics = 7;
			private java.util.List<OrcProto.ColumnStatistics> statistics_ = java.util.Collections.emptyList();

			private void ensureStatisticsIsMutable() {
				if (!((bitField0_ & 0x00000040) == 0x00000040)) {
					statistics_ = new java.util.ArrayList<OrcProto.ColumnStatistics>(statistics_);
					bitField0_ |= 0x00000040;
				}
			}

			private com.google.protobuf.RepeatedFieldBuilder<OrcProto.ColumnStatistics, OrcProto.ColumnStatistics.Builder, OrcProto.ColumnStatisticsOrBuilder> statisticsBuilder_;

			/**
			 * <code>repeated .ColumnStatistics statistics = 7;</code>
			 */
			public java.util.List<OrcProto.ColumnStatistics> getStatisticsList() {
				if (statisticsBuilder_ == null) {
					return java.util.Collections.unmodifiableList(statistics_);
				} else {
					return statisticsBuilder_.getMessageList();
				}
			}

			/**
			 * <code>repeated .ColumnStatistics statistics = 7;</code>
			 */
			public int getStatisticsCount() {
				if (statisticsBuilder_ == null) {
					return statistics_.size();
				} else {
					return statisticsBuilder_.getCount();
				}
			}

			/**
			 * <code>repeated .ColumnStatistics statistics = 7;</code>
			 */
			public OrcProto.ColumnStatistics getStatistics(int index) {
				if (statisticsBuilder_ == null) {
					return statistics_.get(index);
				} else {
					return statisticsBuilder_.getMessage(index);
				}
			}

			/**
			 * <code>repeated .ColumnStatistics statistics = 7;</code>
			 */
			public Builder setStatistics(int index, OrcProto.ColumnStatistics value) {
				if (statisticsBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureStatisticsIsMutable();
					statistics_.set(index, value);
					onChanged();
				} else {
					statisticsBuilder_.setMessage(index, value);
				}
				return this;
			}

			/**
			 * <code>repeated .ColumnStatistics statistics = 7;</code>
			 */
			public Builder setStatistics(int index, OrcProto.ColumnStatistics.Builder builderForValue) {
				if (statisticsBuilder_ == null) {
					ensureStatisticsIsMutable();
					statistics_.set(index, builderForValue.build());
					onChanged();
				} else {
					statisticsBuilder_.setMessage(index, builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .ColumnStatistics statistics = 7;</code>
			 */
			public Builder addStatistics(OrcProto.ColumnStatistics value) {
				if (statisticsBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureStatisticsIsMutable();
					statistics_.add(value);
					onChanged();
				} else {
					statisticsBuilder_.addMessage(value);
				}
				return this;
			}

			/**
			 * <code>repeated .ColumnStatistics statistics = 7;</code>
			 */
			public Builder addStatistics(int index, OrcProto.ColumnStatistics value) {
				if (statisticsBuilder_ == null) {
					if (value == null) {
						throw new NullPointerException();
					}
					ensureStatisticsIsMutable();
					statistics_.add(index, value);
					onChanged();
				} else {
					statisticsBuilder_.addMessage(index, value);
				}
				return this;
			}

			/**
			 * <code>repeated .ColumnStatistics statistics = 7;</code>
			 */
			public Builder addStatistics(OrcProto.ColumnStatistics.Builder builderForValue) {
				if (statisticsBuilder_ == null) {
					ensureStatisticsIsMutable();
					statistics_.add(builderForValue.build());
					onChanged();
				} else {
					statisticsBuilder_.addMessage(builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .ColumnStatistics statistics = 7;</code>
			 */
			public Builder addStatistics(int index, OrcProto.ColumnStatistics.Builder builderForValue) {
				if (statisticsBuilder_ == null) {
					ensureStatisticsIsMutable();
					statistics_.add(index, builderForValue.build());
					onChanged();
				} else {
					statisticsBuilder_.addMessage(index, builderForValue.build());
				}
				return this;
			}

			/**
			 * <code>repeated .ColumnStatistics statistics = 7;</code>
			 */
			public Builder addAllStatistics(java.lang.Iterable<? extends OrcProto.ColumnStatistics> values) {
				if (statisticsBuilder_ == null) {
					ensureStatisticsIsMutable();
					super.addAll(values, statistics_);
					onChanged();
				} else {
					statisticsBuilder_.addAllMessages(values);
				}
				return this;
			}

			/**
			 * <code>repeated .ColumnStatistics statistics = 7;</code>
			 */
			public Builder clearStatistics() {
				if (statisticsBuilder_ == null) {
					statistics_ = java.util.Collections.emptyList();
					bitField0_ = (bitField0_ & ~0x00000040);
					onChanged();
				} else {
					statisticsBuilder_.clear();
				}
				return this;
			}

			/**
			 * <code>repeated .ColumnStatistics statistics = 7;</code>
			 */
			public Builder removeStatistics(int index) {
				if (statisticsBuilder_ == null) {
					ensureStatisticsIsMutable();
					statistics_.remove(index);
					onChanged();
				} else {
					statisticsBuilder_.remove(index);
				}
				return this;
			}

			/**
			 * <code>repeated .ColumnStatistics statistics = 7;</code>
			 */
			public OrcProto.ColumnStatistics.Builder getStatisticsBuilder(int index) {
				return getStatisticsFieldBuilder().getBuilder(index);
			}

			/**
			 * <code>repeated .ColumnStatistics statistics = 7;</code>
			 */
			public OrcProto.ColumnStatisticsOrBuilder getStatisticsOrBuilder(int index) {
				if (statisticsBuilder_ == null) {
					return statistics_.get(index);
				} else {
					return statisticsBuilder_.getMessageOrBuilder(index);
				}
			}

			/**
			 * <code>repeated .ColumnStatistics statistics = 7;</code>
			 */
			public java.util.List<? extends OrcProto.ColumnStatisticsOrBuilder> getStatisticsOrBuilderList() {
				if (statisticsBuilder_ != null) {
					return statisticsBuilder_.getMessageOrBuilderList();
				} else {
					return java.util.Collections.unmodifiableList(statistics_);
				}
			}

			/**
			 * <code>repeated .ColumnStatistics statistics = 7;</code>
			 */
			public OrcProto.ColumnStatistics.Builder addStatisticsBuilder() {
				return getStatisticsFieldBuilder().addBuilder(OrcProto.ColumnStatistics.getDefaultInstance());
			}

			/**
			 * <code>repeated .ColumnStatistics statistics = 7;</code>
			 */
			public OrcProto.ColumnStatistics.Builder addStatisticsBuilder(int index) {
				return getStatisticsFieldBuilder().addBuilder(index, OrcProto.ColumnStatistics.getDefaultInstance());
			}

			/**
			 * <code>repeated .ColumnStatistics statistics = 7;</code>
			 */
			public java.util.List<OrcProto.ColumnStatistics.Builder> getStatisticsBuilderList() {
				return getStatisticsFieldBuilder().getBuilderList();
			}

			private com.google.protobuf.RepeatedFieldBuilder<OrcProto.ColumnStatistics, OrcProto.ColumnStatistics.Builder, OrcProto.ColumnStatisticsOrBuilder> getStatisticsFieldBuilder() {
				if (statisticsBuilder_ == null) {
					statisticsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<OrcProto.ColumnStatistics, OrcProto.ColumnStatistics.Builder, OrcProto.ColumnStatisticsOrBuilder>(
							statistics_, ((bitField0_ & 0x00000040) == 0x00000040), getParentForChildren(), isClean());
					statistics_ = null;
				}
				return statisticsBuilder_;
			}

			// optional uint32 rowIndexStride = 8;
			private int rowIndexStride_;

			/**
			 * <code>optional uint32 rowIndexStride = 8;</code>
			 */
			public boolean hasRowIndexStride() {
				return ((bitField0_ & 0x00000080) == 0x00000080);
			}

			/**
			 * <code>optional uint32 rowIndexStride = 8;</code>
			 */
			public int getRowIndexStride() {
				return rowIndexStride_;
			}

			/**
			 * <code>optional uint32 rowIndexStride = 8;</code>
			 */
			public Builder setRowIndexStride(int value) {
				bitField0_ |= 0x00000080;
				rowIndexStride_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional uint32 rowIndexStride = 8;</code>
			 */
			public Builder clearRowIndexStride() {
				bitField0_ = (bitField0_ & ~0x00000080);
				rowIndexStride_ = 0;
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:Footer)
		}

		static {
			defaultInstance = new Footer(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:Footer)
	}

	public interface PostScriptOrBuilder extends com.google.protobuf.MessageOrBuilder {

		// optional uint64 footerLength = 1;
		/**
		 * <code>optional uint64 footerLength = 1;</code>
		 */
		boolean hasFooterLength();

		/**
		 * <code>optional uint64 footerLength = 1;</code>
		 */
		long getFooterLength();

		// optional .CompressionKind compression = 2;
		/**
		 * <code>optional .CompressionKind compression = 2;</code>
		 */
		boolean hasCompression();

		/**
		 * <code>optional .CompressionKind compression = 2;</code>
		 */
		OrcProto.CompressionKind getCompression();

		// optional uint64 compressionBlockSize = 3;
		/**
		 * <code>optional uint64 compressionBlockSize = 3;</code>
		 */
		boolean hasCompressionBlockSize();

		/**
		 * <code>optional uint64 compressionBlockSize = 3;</code>
		 */
		long getCompressionBlockSize();

		// repeated uint32 version = 4 [packed = true];
		/**
		 * <code>repeated uint32 version = 4 [packed = true];</code>
		 */
		java.util.List<java.lang.Integer> getVersionList();

		/**
		 * <code>repeated uint32 version = 4 [packed = true];</code>
		 */
		int getVersionCount();

		/**
		 * <code>repeated uint32 version = 4 [packed = true];</code>
		 */
		int getVersion(int index);

		// optional string magic = 8000;
		/**
		 * <code>optional string magic = 8000;</code>
		 * 
		 * <pre>
		 * Leave this last in the record
		 * </pre>
		 */
		boolean hasMagic();

		/**
		 * <code>optional string magic = 8000;</code>
		 * 
		 * <pre>
		 * Leave this last in the record
		 * </pre>
		 */
		java.lang.String getMagic();

		/**
		 * <code>optional string magic = 8000;</code>
		 * 
		 * <pre>
		 * Leave this last in the record
		 * </pre>
		 */
		com.google.protobuf.ByteString getMagicBytes();
	}

	/**
	 * Protobuf type {@code PostScript}
	 * 
	 * <pre>
	 * Serialized length must be less that 255 bytes
	 * </pre>
	 */
	public static final class PostScript extends com.google.protobuf.GeneratedMessage implements PostScriptOrBuilder {
		// Use PostScript.newBuilder() to construct.
		private PostScript(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private PostScript(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private static final PostScript defaultInstance;

		public static PostScript getDefaultInstance() {
			return defaultInstance;
		}

		public PostScript getDefaultInstanceForType() {
			return defaultInstance;
		}

		private final com.google.protobuf.UnknownFieldSet unknownFields;

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private PostScript(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			int mutable_bitField0_ = 0;
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 8: {
						bitField0_ |= 0x00000001;
						footerLength_ = input.readUInt64();
						break;
					}
					case 16: {
						int rawValue = input.readEnum();
						OrcProto.CompressionKind value = OrcProto.CompressionKind.valueOf(rawValue);
						if (value == null) {
							unknownFields.mergeVarintField(2, rawValue);
						} else {
							bitField0_ |= 0x00000002;
							compression_ = value;
						}
						break;
					}
					case 24: {
						bitField0_ |= 0x00000004;
						compressionBlockSize_ = input.readUInt64();
						break;
					}
					case 32: {
						if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
							version_ = new java.util.ArrayList<java.lang.Integer>();
							mutable_bitField0_ |= 0x00000008;
						}
						version_.add(input.readUInt32());
						break;
					}
					case 34: {
						int length = input.readRawVarint32();
						int limit = input.pushLimit(length);
						if (!((mutable_bitField0_ & 0x00000008) == 0x00000008) && input.getBytesUntilLimit() > 0) {
							version_ = new java.util.ArrayList<java.lang.Integer>();
							mutable_bitField0_ |= 0x00000008;
						}
						while (input.getBytesUntilLimit() > 0) {
							version_.add(input.readUInt32());
						}
						input.popLimit(limit);
						break;
					}
					case 64002: {
						bitField0_ |= 0x00000008;
						magic_ = input.readBytes();
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
			} finally {
				if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
					version_ = java.util.Collections.unmodifiableList(version_);
				}
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_PostScript_descriptor;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_PostScript_fieldAccessorTable
					.ensureFieldAccessorsInitialized(OrcProto.PostScript.class, OrcProto.PostScript.Builder.class);
		}

		public static com.google.protobuf.Parser<PostScript> PARSER = new com.google.protobuf.AbstractParser<PostScript>() {
			public PostScript parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new PostScript(input, extensionRegistry);
			}
		};

		@java.lang.Override
		public com.google.protobuf.Parser<PostScript> getParserForType() {
			return PARSER;
		}

		private int bitField0_;
		// optional uint64 footerLength = 1;
		public static final int FOOTERLENGTH_FIELD_NUMBER = 1;
		private long footerLength_;

		/**
		 * <code>optional uint64 footerLength = 1;</code>
		 */
		public boolean hasFooterLength() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>optional uint64 footerLength = 1;</code>
		 */
		public long getFooterLength() {
			return footerLength_;
		}

		// optional .CompressionKind compression = 2;
		public static final int COMPRESSION_FIELD_NUMBER = 2;
		private OrcProto.CompressionKind compression_;

		/**
		 * <code>optional .CompressionKind compression = 2;</code>
		 */
		public boolean hasCompression() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>optional .CompressionKind compression = 2;</code>
		 */
		public OrcProto.CompressionKind getCompression() {
			return compression_;
		}

		// optional uint64 compressionBlockSize = 3;
		public static final int COMPRESSIONBLOCKSIZE_FIELD_NUMBER = 3;
		private long compressionBlockSize_;

		/**
		 * <code>optional uint64 compressionBlockSize = 3;</code>
		 */
		public boolean hasCompressionBlockSize() {
			return ((bitField0_ & 0x00000004) == 0x00000004);
		}

		/**
		 * <code>optional uint64 compressionBlockSize = 3;</code>
		 */
		public long getCompressionBlockSize() {
			return compressionBlockSize_;
		}

		// repeated uint32 version = 4 [packed = true];
		public static final int VERSION_FIELD_NUMBER = 4;
		private java.util.List<java.lang.Integer> version_;

		/**
		 * <code>repeated uint32 version = 4 [packed = true];</code>
		 */
		public java.util.List<java.lang.Integer> getVersionList() {
			return version_;
		}

		/**
		 * <code>repeated uint32 version = 4 [packed = true];</code>
		 */
		public int getVersionCount() {
			return version_.size();
		}

		/**
		 * <code>repeated uint32 version = 4 [packed = true];</code>
		 */
		public int getVersion(int index) {
			return version_.get(index);
		}

		private int versionMemoizedSerializedSize = -1;

		// optional string magic = 8000;
		public static final int MAGIC_FIELD_NUMBER = 8000;
		private java.lang.Object magic_;

		/**
		 * <code>optional string magic = 8000;</code>
		 * 
		 * <pre>
		 * Leave this last in the record
		 * </pre>
		 */
		public boolean hasMagic() {
			return ((bitField0_ & 0x00000008) == 0x00000008);
		}

		/**
		 * <code>optional string magic = 8000;</code>
		 * 
		 * <pre>
		 * Leave this last in the record
		 * </pre>
		 */
		public java.lang.String getMagic() {
			java.lang.Object ref = magic_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				if (bs.isValidUtf8()) {
					magic_ = s;
				}
				return s;
			}
		}

		/**
		 * <code>optional string magic = 8000;</code>
		 * 
		 * <pre>
		 * Leave this last in the record
		 * </pre>
		 */
		public com.google.protobuf.ByteString getMagicBytes() {
			java.lang.Object ref = magic_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				magic_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		private void initFields() {
			footerLength_ = 0L;
			compression_ = OrcProto.CompressionKind.NONE;
			compressionBlockSize_ = 0L;
			version_ = java.util.Collections.emptyList();
			magic_ = "";
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1)
				return isInitialized == 1;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeUInt64(1, footerLength_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeEnum(2, compression_.getNumber());
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				output.writeUInt64(3, compressionBlockSize_);
			}
			if (getVersionList().size() > 0) {
				output.writeRawVarint32(34);
				output.writeRawVarint32(versionMemoizedSerializedSize);
			}
			for (int i = 0; i < version_.size(); i++) {
				output.writeUInt32NoTag(version_.get(i));
			}
			if (((bitField0_ & 0x00000008) == 0x00000008)) {
				output.writeBytes(8000, getMagicBytes());
			}
			getUnknownFields().writeTo(output);
		}

		private int memoizedSerializedSize = -1;

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1)
				return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream.computeUInt64Size(1, footerLength_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, compression_.getNumber());
			}
			if (((bitField0_ & 0x00000004) == 0x00000004)) {
				size += com.google.protobuf.CodedOutputStream.computeUInt64Size(3, compressionBlockSize_);
			}
			{
				int dataSize = 0;
				for (int i = 0; i < version_.size(); i++) {
					dataSize += com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(version_.get(i));
				}
				size += dataSize;
				if (!getVersionList().isEmpty()) {
					size += 1;
					size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
				}
				versionMemoizedSerializedSize = dataSize;
			}
			if (((bitField0_ & 0x00000008) == 0x00000008)) {
				size += com.google.protobuf.CodedOutputStream.computeBytesSize(8000, getMagicBytes());
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		private static final long serialVersionUID = 0L;

		@java.lang.Override
		protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		public static OrcProto.PostScript parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.PostScript parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.PostScript parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static OrcProto.PostScript parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static OrcProto.PostScript parseFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.PostScript parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static OrcProto.PostScript parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static OrcProto.PostScript parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static OrcProto.PostScript parseFrom(com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static OrcProto.PostScript parseFrom(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder(OrcProto.PostScript prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		/**
		 * Protobuf type {@code PostScript}
		 * 
		 * <pre>
		 * Serialized length must be less that 255 bytes
		 * </pre>
		 */
		public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements
				OrcProto.PostScriptOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_PostScript_descriptor;
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_PostScript_fieldAccessorTable
						.ensureFieldAccessorsInitialized(OrcProto.PostScript.class, OrcProto.PostScript.Builder.class);
			}

			// Construct using OrcProto.PostScript.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
				}
			}

			private static Builder create() {
				return new Builder();
			}

			public Builder clear() {
				super.clear();
				footerLength_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000001);
				compression_ = OrcProto.CompressionKind.NONE;
				bitField0_ = (bitField0_ & ~0x00000002);
				compressionBlockSize_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000004);
				version_ = java.util.Collections.emptyList();
				bitField0_ = (bitField0_ & ~0x00000008);
				magic_ = "";
				bitField0_ = (bitField0_ & ~0x00000010);
				return this;
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return OrcProto.internal_static_org_apache_hadoop_hive_ql_io_orc_PostScript_descriptor;
			}

			public OrcProto.PostScript getDefaultInstanceForType() {
				return OrcProto.PostScript.getDefaultInstance();
			}

			public OrcProto.PostScript build() {
				OrcProto.PostScript result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public OrcProto.PostScript buildPartial() {
				OrcProto.PostScript result = new OrcProto.PostScript(this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.footerLength_ = footerLength_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				result.compression_ = compression_;
				if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
					to_bitField0_ |= 0x00000004;
				}
				result.compressionBlockSize_ = compressionBlockSize_;
				if (((bitField0_ & 0x00000008) == 0x00000008)) {
					version_ = java.util.Collections.unmodifiableList(version_);
					bitField0_ = (bitField0_ & ~0x00000008);
				}
				result.version_ = version_;
				if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
					to_bitField0_ |= 0x00000008;
				}
				result.magic_ = magic_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof OrcProto.PostScript) {
					return mergeFrom((OrcProto.PostScript) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(OrcProto.PostScript other) {
				if (other == OrcProto.PostScript.getDefaultInstance())
					return this;
				if (other.hasFooterLength()) {
					setFooterLength(other.getFooterLength());
				}
				if (other.hasCompression()) {
					setCompression(other.getCompression());
				}
				if (other.hasCompressionBlockSize()) {
					setCompressionBlockSize(other.getCompressionBlockSize());
				}
				if (!other.version_.isEmpty()) {
					if (version_.isEmpty()) {
						version_ = other.version_;
						bitField0_ = (bitField0_ & ~0x00000008);
					} else {
						ensureVersionIsMutable();
						version_.addAll(other.version_);
					}
					onChanged();
				}
				if (other.hasMagic()) {
					bitField0_ |= 0x00000010;
					magic_ = other.magic_;
					onChanged();
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				OrcProto.PostScript parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (OrcProto.PostScript) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private int bitField0_;

			// optional uint64 footerLength = 1;
			private long footerLength_;

			/**
			 * <code>optional uint64 footerLength = 1;</code>
			 */
			public boolean hasFooterLength() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <code>optional uint64 footerLength = 1;</code>
			 */
			public long getFooterLength() {
				return footerLength_;
			}

			/**
			 * <code>optional uint64 footerLength = 1;</code>
			 */
			public Builder setFooterLength(long value) {
				bitField0_ |= 0x00000001;
				footerLength_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional uint64 footerLength = 1;</code>
			 */
			public Builder clearFooterLength() {
				bitField0_ = (bitField0_ & ~0x00000001);
				footerLength_ = 0L;
				onChanged();
				return this;
			}

			// optional .CompressionKind compression = 2;
			private OrcProto.CompressionKind compression_ = OrcProto.CompressionKind.NONE;

			/**
			 * <code>optional .CompressionKind compression = 2;</code>
			 */
			public boolean hasCompression() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			/**
			 * <code>optional .CompressionKind compression = 2;</code>
			 */
			public OrcProto.CompressionKind getCompression() {
				return compression_;
			}

			/**
			 * <code>optional .CompressionKind compression = 2;</code>
			 */
			public Builder setCompression(OrcProto.CompressionKind value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000002;
				compression_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional .CompressionKind compression = 2;</code>
			 */
			public Builder clearCompression() {
				bitField0_ = (bitField0_ & ~0x00000002);
				compression_ = OrcProto.CompressionKind.NONE;
				onChanged();
				return this;
			}

			// optional uint64 compressionBlockSize = 3;
			private long compressionBlockSize_;

			/**
			 * <code>optional uint64 compressionBlockSize = 3;</code>
			 */
			public boolean hasCompressionBlockSize() {
				return ((bitField0_ & 0x00000004) == 0x00000004);
			}

			/**
			 * <code>optional uint64 compressionBlockSize = 3;</code>
			 */
			public long getCompressionBlockSize() {
				return compressionBlockSize_;
			}

			/**
			 * <code>optional uint64 compressionBlockSize = 3;</code>
			 */
			public Builder setCompressionBlockSize(long value) {
				bitField0_ |= 0x00000004;
				compressionBlockSize_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional uint64 compressionBlockSize = 3;</code>
			 */
			public Builder clearCompressionBlockSize() {
				bitField0_ = (bitField0_ & ~0x00000004);
				compressionBlockSize_ = 0L;
				onChanged();
				return this;
			}

			// repeated uint32 version = 4 [packed = true];
			private java.util.List<java.lang.Integer> version_ = java.util.Collections.emptyList();

			private void ensureVersionIsMutable() {
				if (!((bitField0_ & 0x00000008) == 0x00000008)) {
					version_ = new java.util.ArrayList<java.lang.Integer>(version_);
					bitField0_ |= 0x00000008;
				}
			}

			/**
			 * <code>repeated uint32 version = 4 [packed = true];</code>
			 */
			public java.util.List<java.lang.Integer> getVersionList() {
				return java.util.Collections.unmodifiableList(version_);
			}

			/**
			 * <code>repeated uint32 version = 4 [packed = true];</code>
			 */
			public int getVersionCount() {
				return version_.size();
			}

			/**
			 * <code>repeated uint32 version = 4 [packed = true];</code>
			 */
			public int getVersion(int index) {
				return version_.get(index);
			}

			/**
			 * <code>repeated uint32 version = 4 [packed = true];</code>
			 */
			public Builder setVersion(int index, int value) {
				ensureVersionIsMutable();
				version_.set(index, value);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated uint32 version = 4 [packed = true];</code>
			 */
			public Builder addVersion(int value) {
				ensureVersionIsMutable();
				version_.add(value);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated uint32 version = 4 [packed = true];</code>
			 */
			public Builder addAllVersion(java.lang.Iterable<? extends java.lang.Integer> values) {
				ensureVersionIsMutable();
				super.addAll(values, version_);
				onChanged();
				return this;
			}

			/**
			 * <code>repeated uint32 version = 4 [packed = true];</code>
			 */
			public Builder clearVersion() {
				version_ = java.util.Collections.emptyList();
				bitField0_ = (bitField0_ & ~0x00000008);
				onChanged();
				return this;
			}

			// optional string magic = 8000;
			private java.lang.Object magic_ = "";

			/**
			 * <code>optional string magic = 8000;</code>
			 * 
			 * <pre>
			 * Leave this last in the record
			 * </pre>
			 */
			public boolean hasMagic() {
				return ((bitField0_ & 0x00000010) == 0x00000010);
			}

			/**
			 * <code>optional string magic = 8000;</code>
			 * 
			 * <pre>
			 * Leave this last in the record
			 * </pre>
			 */
			public java.lang.String getMagic() {
				java.lang.Object ref = magic_;
				if (!(ref instanceof java.lang.String)) {
					java.lang.String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
					magic_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <code>optional string magic = 8000;</code>
			 * 
			 * <pre>
			 * Leave this last in the record
			 * </pre>
			 */
			public com.google.protobuf.ByteString getMagicBytes() {
				java.lang.Object ref = magic_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					magic_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>optional string magic = 8000;</code>
			 * 
			 * <pre>
			 * Leave this last in the record
			 * </pre>
			 */
			public Builder setMagic(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000010;
				magic_ = value;
				onChanged();
				return this;
			}

			/**
			 * <code>optional string magic = 8000;</code>
			 * 
			 * <pre>
			 * Leave this last in the record
			 * </pre>
			 */
			public Builder clearMagic() {
				bitField0_ = (bitField0_ & ~0x00000010);
				magic_ = getDefaultInstance().getMagic();
				onChanged();
				return this;
			}

			/**
			 * <code>optional string magic = 8000;</code>
			 * 
			 * <pre>
			 * Leave this last in the record
			 * </pre>
			 */
			public Builder setMagicBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000010;
				magic_ = value;
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:PostScript)
		}

		static {
			defaultInstance = new PostScript(true);
			defaultInstance.initFields();
		}

		// @@protoc_insertion_point(class_scope:PostScript)
	}

	private static com.google.protobuf.Descriptors.Descriptor internal_static_org_apache_hadoop_hive_ql_io_orc_IntegerStatistics_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_org_apache_hadoop_hive_ql_io_orc_IntegerStatistics_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.Descriptor internal_static_org_apache_hadoop_hive_ql_io_orc_DoubleStatistics_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_org_apache_hadoop_hive_ql_io_orc_DoubleStatistics_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.Descriptor internal_static_org_apache_hadoop_hive_ql_io_orc_StringStatistics_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_org_apache_hadoop_hive_ql_io_orc_StringStatistics_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.Descriptor internal_static_org_apache_hadoop_hive_ql_io_orc_BucketStatistics_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_org_apache_hadoop_hive_ql_io_orc_BucketStatistics_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.Descriptor internal_static_org_apache_hadoop_hive_ql_io_orc_DecimalStatistics_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_org_apache_hadoop_hive_ql_io_orc_DecimalStatistics_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.Descriptor internal_static_org_apache_hadoop_hive_ql_io_orc_DateStatistics_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_org_apache_hadoop_hive_ql_io_orc_DateStatistics_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.Descriptor internal_static_org_apache_hadoop_hive_ql_io_orc_BinaryStatistics_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_org_apache_hadoop_hive_ql_io_orc_BinaryStatistics_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.Descriptor internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnStatistics_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnStatistics_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.Descriptor internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndexEntry_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndexEntry_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.Descriptor internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndex_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndex_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.Descriptor internal_static_org_apache_hadoop_hive_ql_io_orc_Stream_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_org_apache_hadoop_hive_ql_io_orc_Stream_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.Descriptor internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnEncoding_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnEncoding_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.Descriptor internal_static_org_apache_hadoop_hive_ql_io_orc_StripeFooter_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_org_apache_hadoop_hive_ql_io_orc_StripeFooter_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.Descriptor internal_static_org_apache_hadoop_hive_ql_io_orc_Type_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_org_apache_hadoop_hive_ql_io_orc_Type_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.Descriptor internal_static_org_apache_hadoop_hive_ql_io_orc_StripeInformation_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_org_apache_hadoop_hive_ql_io_orc_StripeInformation_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.Descriptor internal_static_org_apache_hadoop_hive_ql_io_orc_UserMetadataItem_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_org_apache_hadoop_hive_ql_io_orc_UserMetadataItem_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.Descriptor internal_static_org_apache_hadoop_hive_ql_io_orc_Footer_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_org_apache_hadoop_hive_ql_io_orc_Footer_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.Descriptor internal_static_org_apache_hadoop_hive_ql_io_orc_PostScript_descriptor;
	private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_org_apache_hadoop_hive_ql_io_orc_PostScript_fieldAccessorTable;

	public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
		return descriptor;
	}

	private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
	static {
		java.lang.String[] descriptorData = {
				"\n\017orc_proto.proto\022 org.apache.hadoop.hiv"
						+ "e.ql.io.orc\"B\n\021IntegerStatistics\022\017\n\007mini"
						+ "mum\030\001 \001(\022\022\017\n\007maximum\030\002 \001(\022\022\013\n\003sum\030\003 \001(\022\""
						+ "A\n\020DoubleStatistics\022\017\n\007minimum\030\001 \001(\001\022\017\n\007"
						+ "maximum\030\002 \001(\001\022\013\n\003sum\030\003 \001(\001\"A\n\020StringStat"
						+ "istics\022\017\n\007minimum\030\001 \001(\t\022\017\n\007maximum\030\002 \001(\t"
						+ "\022\013\n\003sum\030\003 \001(\022\"%\n\020BucketStatistics\022\021\n\005cou"
						+ "nt\030\001 \003(\004B\002\020\001\"B\n\021DecimalStatistics\022\017\n\007min"
						+ "imum\030\001 \001(\t\022\017\n\007maximum\030\002 \001(\t\022\013\n\003sum\030\003 \001(\t"
						+ "\"2\n\016DateStatistics\022\017\n\007minimum\030\001 \001(\021\022\017\n\007m",
				"aximum\030\002 \001(\021\"\037\n\020BinaryStatistics\022\013\n\003sum\030"
						+ "\001 \001(\022\"\310\004\n\020ColumnStatistics\022\026\n\016numberOfVa"
						+ "lues\030\001 \001(\004\022J\n\rintStatistics\030\002 \001(\01323.org."
						+ "apache.hadoop.hive.ql.io.orc.IntegerStat"
						+ "istics\022L\n\020doubleStatistics\030\003 \001(\01322.org.a"
						+ "pache.hadoop.hive.ql.io.orc.DoubleStatis"
						+ "tics\022L\n\020stringStatistics\030\004 \001(\01322.org.apa"
						+ "che.hadoop.hive.ql.io.orc.StringStatisti"
						+ "cs\022L\n\020bucketStatistics\030\005 \001(\01322.org.apach"
						+ "e.hadoop.hive.ql.io.orc.BucketStatistics",
				"\022N\n\021decimalStatistics\030\006 \001(\01323.org.apache"
						+ ".hadoop.hive.ql.io.orc.DecimalStatistics"
						+ "\022H\n\016dateStatistics\030\007 \001(\01320.org.apache.ha"
						+ "doop.hive.ql.io.orc.DateStatistics\022L\n\020bi"
						+ "naryStatistics\030\010 \001(\01322.org.apache.hadoop"
						+ ".hive.ql.io.orc.BinaryStatistics\"n\n\rRowI"
						+ "ndexEntry\022\025\n\tpositions\030\001 \003(\004B\002\020\001\022F\n\nstat"
						+ "istics\030\002 \001(\01322.org.apache.hadoop.hive.ql"
						+ ".io.orc.ColumnStatistics\"J\n\010RowIndex\022>\n\005"
						+ "entry\030\001 \003(\0132/.org.apache.hadoop.hive.ql.",
				"io.orc.RowIndexEntry\"\331\001\n\006Stream\022;\n\004kind\030"
						+ "\001 \002(\0162-.org.apache.hadoop.hive.ql.io.orc"
						+ ".Stream.Kind\022\016\n\006column\030\002 \001(\r\022\016\n\006length\030\003"
						+ " \001(\004\"r\n\004Kind\022\013\n\007PRESENT\020\000\022\010\n\004DATA\020\001\022\n\n\006L"
						+ "ENGTH\020\002\022\023\n\017DICTIONARY_DATA\020\003\022\024\n\020DICTIONA"
						+ "RY_COUNT\020\004\022\r\n\tSECONDARY\020\005\022\r\n\tROW_INDEX\020\006"
						+ "\"\263\001\n\016ColumnEncoding\022C\n\004kind\030\001 \002(\01625.org."
						+ "apache.hadoop.hive.ql.io.orc.ColumnEncod"
						+ "ing.Kind\022\026\n\016dictionarySize\030\002 \001(\r\"D\n\004Kind"
						+ "\022\n\n\006DIRECT\020\000\022\016\n\nDICTIONARY\020\001\022\r\n\tDIRECT_V",
				"2\020\002\022\021\n\rDICTIONARY_V2\020\003\"\214\001\n\014StripeFooter\022"
						+ "9\n\007streams\030\001 \003(\0132(.org.apache.hadoop.hiv"
						+ "e.ql.io.orc.Stream\022A\n\007columns\030\002 \003(\01320.or"
						+ "g.apache.hadoop.hive.ql.io.orc.ColumnEnc"
						+ "oding\"\356\002\n\004Type\0229\n\004kind\030\001 \002(\0162+.org.apach"
						+ "e.hadoop.hive.ql.io.orc.Type.Kind\022\024\n\010sub"
						+ "types\030\002 \003(\rB\002\020\001\022\022\n\nfieldNames\030\003 \003(\t\022\025\n\rm"
						+ "aximumLength\030\004 \001(\r\022\021\n\tprecision\030\005 \001(\r\022\r\n"
						+ "\005scale\030\006 \001(\r\"\307\001\n\004Kind\022\013\n\007BOOLEAN\020\000\022\010\n\004BY"
						+ "TE\020\001\022\t\n\005SHORT\020\002\022\007\n\003INT\020\003\022\010\n\004LONG\020\004\022\t\n\005FL",
				"OAT\020\005\022\n\n\006DOUBLE\020\006\022\n\n\006STRING\020\007\022\n\n\006BINARY\020"
						+ "\010\022\r\n\tTIMESTAMP\020\t\022\010\n\004LIST\020\n\022\007\n\003MAP\020\013\022\n\n\006S"
						+ "TRUCT\020\014\022\t\n\005UNION\020\r\022\013\n\007DECIMAL\020\016\022\010\n\004DATE\020"
						+ "\017\022\013\n\007VARCHAR\020\020\"x\n\021StripeInformation\022\016\n\006o"
						+ "ffset\030\001 \001(\004\022\023\n\013indexLength\030\002 \001(\004\022\022\n\ndata"
						+ "Length\030\003 \001(\004\022\024\n\014footerLength\030\004 \001(\004\022\024\n\014nu"
						+ "mberOfRows\030\005 \001(\004\"/\n\020UserMetadataItem\022\014\n\004"
						+ "name\030\001 \002(\t\022\r\n\005value\030\002 \002(\014\"\356\002\n\006Footer\022\024\n\014"
						+ "headerLength\030\001 \001(\004\022\025\n\rcontentLength\030\002 \001("
						+ "\004\022D\n\007stripes\030\003 \003(\01323.org.apache.hadoop.h",
				"ive.ql.io.orc.StripeInformation\0225\n\005types"
						+ "\030\004 \003(\0132&.org.apache.hadoop.hive.ql.io.or"
						+ "c.Type\022D\n\010metadata\030\005 \003(\01322.org.apache.ha"
						+ "doop.hive.ql.io.orc.UserMetadataItem\022\024\n\014"
						+ "numberOfRows\030\006 \001(\004\022F\n\nstatistics\030\007 \003(\01322" + ".Column"
						+ "Statistics\022\026\n\016rowIndexStride\030\010 \001(\r\"\255\001\n\nP"
						+ "ostScript\022\024\n\014footerLength\030\001 \001(\004\022F\n\013compr"
						+ "ession\030\002 \001(\01621.org.apache.hadoop.hive.ql"
						+ ".io.orc.CompressionKind\022\034\n\024compressionBl",
				"ockSize\030\003 \001(\004\022\023\n\007version\030\004 \003(\rB\002\020\001\022\016\n\005ma"
						+ "gic\030\300> \001(\t*:\n\017CompressionKind\022\010\n\004NONE\020\000\022"
						+ "\010\n\004ZLIB\020\001\022\n\n\006SNAPPY\020\002\022\007\n\003LZO\020\003" };
		com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
			public com.google.protobuf.ExtensionRegistry assignDescriptors(
					com.google.protobuf.Descriptors.FileDescriptor root) {
				descriptor = root;
				internal_static_org_apache_hadoop_hive_ql_io_orc_IntegerStatistics_descriptor = getDescriptor()
						.getMessageTypes().get(0);
				internal_static_org_apache_hadoop_hive_ql_io_orc_IntegerStatistics_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_org_apache_hadoop_hive_ql_io_orc_IntegerStatistics_descriptor,
						new java.lang.String[] { "Minimum", "Maximum", "Sum", });
				internal_static_org_apache_hadoop_hive_ql_io_orc_DoubleStatistics_descriptor = getDescriptor()
						.getMessageTypes().get(1);
				internal_static_org_apache_hadoop_hive_ql_io_orc_DoubleStatistics_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_org_apache_hadoop_hive_ql_io_orc_DoubleStatistics_descriptor,
						new java.lang.String[] { "Minimum", "Maximum", "Sum", });
				internal_static_org_apache_hadoop_hive_ql_io_orc_StringStatistics_descriptor = getDescriptor()
						.getMessageTypes().get(2);
				internal_static_org_apache_hadoop_hive_ql_io_orc_StringStatistics_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_org_apache_hadoop_hive_ql_io_orc_StringStatistics_descriptor,
						new java.lang.String[] { "Minimum", "Maximum", "Sum", });
				internal_static_org_apache_hadoop_hive_ql_io_orc_BucketStatistics_descriptor = getDescriptor()
						.getMessageTypes().get(3);
				internal_static_org_apache_hadoop_hive_ql_io_orc_BucketStatistics_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_org_apache_hadoop_hive_ql_io_orc_BucketStatistics_descriptor,
						new java.lang.String[] { "Count", });
				internal_static_org_apache_hadoop_hive_ql_io_orc_DecimalStatistics_descriptor = getDescriptor()
						.getMessageTypes().get(4);
				internal_static_org_apache_hadoop_hive_ql_io_orc_DecimalStatistics_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_org_apache_hadoop_hive_ql_io_orc_DecimalStatistics_descriptor,
						new java.lang.String[] { "Minimum", "Maximum", "Sum", });
				internal_static_org_apache_hadoop_hive_ql_io_orc_DateStatistics_descriptor = getDescriptor()
						.getMessageTypes().get(5);
				internal_static_org_apache_hadoop_hive_ql_io_orc_DateStatistics_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_org_apache_hadoop_hive_ql_io_orc_DateStatistics_descriptor,
						new java.lang.String[] { "Minimum", "Maximum", });
				internal_static_org_apache_hadoop_hive_ql_io_orc_BinaryStatistics_descriptor = getDescriptor()
						.getMessageTypes().get(6);
				internal_static_org_apache_hadoop_hive_ql_io_orc_BinaryStatistics_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_org_apache_hadoop_hive_ql_io_orc_BinaryStatistics_descriptor,
						new java.lang.String[] { "Sum", });
				internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnStatistics_descriptor = getDescriptor()
						.getMessageTypes().get(7);
				internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnStatistics_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnStatistics_descriptor,
						new java.lang.String[] { "NumberOfValues", "IntStatistics", "DoubleStatistics",
								"StringStatistics", "BucketStatistics", "DecimalStatistics", "DateStatistics",
								"BinaryStatistics", });
				internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndexEntry_descriptor = getDescriptor()
						.getMessageTypes().get(8);
				internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndexEntry_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndexEntry_descriptor,
						new java.lang.String[] { "Positions", "Statistics", });
				internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndex_descriptor = getDescriptor()
						.getMessageTypes().get(9);
				internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndex_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_org_apache_hadoop_hive_ql_io_orc_RowIndex_descriptor,
						new java.lang.String[] { "Entry", });
				internal_static_org_apache_hadoop_hive_ql_io_orc_Stream_descriptor = getDescriptor().getMessageTypes()
						.get(10);
				internal_static_org_apache_hadoop_hive_ql_io_orc_Stream_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_org_apache_hadoop_hive_ql_io_orc_Stream_descriptor, new java.lang.String[] {
								"Kind", "Column", "Length", });
				internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnEncoding_descriptor = getDescriptor()
						.getMessageTypes().get(11);
				internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnEncoding_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_org_apache_hadoop_hive_ql_io_orc_ColumnEncoding_descriptor,
						new java.lang.String[] { "Kind", "DictionarySize", });
				internal_static_org_apache_hadoop_hive_ql_io_orc_StripeFooter_descriptor = getDescriptor()
						.getMessageTypes().get(12);
				internal_static_org_apache_hadoop_hive_ql_io_orc_StripeFooter_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_org_apache_hadoop_hive_ql_io_orc_StripeFooter_descriptor,
						new java.lang.String[] { "Streams", "Columns", });
				internal_static_org_apache_hadoop_hive_ql_io_orc_Type_descriptor = getDescriptor().getMessageTypes()
						.get(13);
				internal_static_org_apache_hadoop_hive_ql_io_orc_Type_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_org_apache_hadoop_hive_ql_io_orc_Type_descriptor, new java.lang.String[] {
								"Kind", "Subtypes", "FieldNames", "MaximumLength", "Precision", "Scale", });
				internal_static_org_apache_hadoop_hive_ql_io_orc_StripeInformation_descriptor = getDescriptor()
						.getMessageTypes().get(14);
				internal_static_org_apache_hadoop_hive_ql_io_orc_StripeInformation_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_org_apache_hadoop_hive_ql_io_orc_StripeInformation_descriptor,
						new java.lang.String[] { "Offset", "IndexLength", "DataLength", "FooterLength", "NumberOfRows", });
				internal_static_org_apache_hadoop_hive_ql_io_orc_UserMetadataItem_descriptor = getDescriptor()
						.getMessageTypes().get(15);
				internal_static_org_apache_hadoop_hive_ql_io_orc_UserMetadataItem_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_org_apache_hadoop_hive_ql_io_orc_UserMetadataItem_descriptor,
						new java.lang.String[] { "Name", "Value", });
				internal_static_org_apache_hadoop_hive_ql_io_orc_Footer_descriptor = getDescriptor().getMessageTypes()
						.get(16);
				internal_static_org_apache_hadoop_hive_ql_io_orc_Footer_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_org_apache_hadoop_hive_ql_io_orc_Footer_descriptor, new java.lang.String[] {
								"HeaderLength", "ContentLength", "Stripes", "Types", "Metadata", "NumberOfRows",
								"Statistics", "RowIndexStride", });
				internal_static_org_apache_hadoop_hive_ql_io_orc_PostScript_descriptor = getDescriptor()
						.getMessageTypes().get(17);
				internal_static_org_apache_hadoop_hive_ql_io_orc_PostScript_fieldAccessorTable = new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
						internal_static_org_apache_hadoop_hive_ql_io_orc_PostScript_descriptor, new java.lang.String[] {
								"FooterLength", "Compression", "CompressionBlockSize", "Version", "Magic", });
				return null;
			}
		};
		com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData,
				new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
	}

	// @@protoc_insertion_point(outer_class_scope)
}
