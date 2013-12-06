/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package parquet.format;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class ColumnChunk implements TBase<ColumnChunk, ColumnChunk._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ColumnChunk");

  private static final TField FILE_PATH_FIELD_DESC = new TField("file_path", TType.STRING, (short)1);
  private static final TField FILE_OFFSET_FIELD_DESC = new TField("file_offset", TType.I64, (short)2);
  private static final TField META_DATA_FIELD_DESC = new TField("meta_data", TType.STRUCT, (short)3);

  /**
   * File where column data is stored.  If not set, assumed to be same file as
   * metadata.  This path is relative to the current file.
   * 
   */
  public String file_path;
  /**
   * Byte offset in file_path to the ColumnMetaData *
   */
  public long file_offset;
  /**
   * Column metadata for this chunk. This is the same content as what is at
   * file_path/file_offset.  Having it here has it replicated in the file
   * metadata.
   * 
   */
  public ColumnMetaData meta_data;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    /**
     * File where column data is stored.  If not set, assumed to be same file as
     * metadata.  This path is relative to the current file.
     * 
     */
    FILE_PATH((short)1, "file_path"),
    /**
     * Byte offset in file_path to the ColumnMetaData *
     */
    FILE_OFFSET((short)2, "file_offset"),
    /**
     * Column metadata for this chunk. This is the same content as what is at
     * file_path/file_offset.  Having it here has it replicated in the file
     * metadata.
     * 
     */
    META_DATA((short)3, "meta_data");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FILE_PATH
          return FILE_PATH;
        case 2: // FILE_OFFSET
          return FILE_OFFSET;
        case 3: // META_DATA
          return META_DATA;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __FILE_OFFSET_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FILE_PATH, new FieldMetaData("file_path", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.FILE_OFFSET, new FieldMetaData("file_offset", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.META_DATA, new FieldMetaData("meta_data", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, ColumnMetaData.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ColumnChunk.class, metaDataMap);
  }

  public ColumnChunk() {
  }

  public ColumnChunk(
    long file_offset)
  {
    this();
    this.file_offset = file_offset;
    setFile_offsetIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ColumnChunk(ColumnChunk other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetFile_path()) {
      this.file_path = other.file_path;
    }
    this.file_offset = other.file_offset;
    if (other.isSetMeta_data()) {
      this.meta_data = new ColumnMetaData(other.meta_data);
    }
  }

  public ColumnChunk deepCopy() {
    return new ColumnChunk(this);
  }

  @Override
  public void clear() {
    this.file_path = null;
    setFile_offsetIsSet(false);
    this.file_offset = 0;
    this.meta_data = null;
  }

  /**
   * File where column data is stored.  If not set, assumed to be same file as
   * metadata.  This path is relative to the current file.
   * 
   */
  public String getFile_path() {
    return this.file_path;
  }

  /**
   * File where column data is stored.  If not set, assumed to be same file as
   * metadata.  This path is relative to the current file.
   * 
   */
  public ColumnChunk setFile_path(String file_path) {
    this.file_path = file_path;
    return this;
  }

  public void unsetFile_path() {
    this.file_path = null;
  }

  /** Returns true if field file_path is set (has been asigned a value) and false otherwise */
  public boolean isSetFile_path() {
    return this.file_path != null;
  }

  public void setFile_pathIsSet(boolean value) {
    if (!value) {
      this.file_path = null;
    }
  }

  /**
   * Byte offset in file_path to the ColumnMetaData *
   */
  public long getFile_offset() {
    return this.file_offset;
  }

  /**
   * Byte offset in file_path to the ColumnMetaData *
   */
  public ColumnChunk setFile_offset(long file_offset) {
    this.file_offset = file_offset;
    setFile_offsetIsSet(true);
    return this;
  }

  public void unsetFile_offset() {
    __isset_bit_vector.clear(__FILE_OFFSET_ISSET_ID);
  }

  /** Returns true if field file_offset is set (has been asigned a value) and false otherwise */
  public boolean isSetFile_offset() {
    return __isset_bit_vector.get(__FILE_OFFSET_ISSET_ID);
  }

  public void setFile_offsetIsSet(boolean value) {
    __isset_bit_vector.set(__FILE_OFFSET_ISSET_ID, value);
  }

  /**
   * Column metadata for this chunk. This is the same content as what is at
   * file_path/file_offset.  Having it here has it replicated in the file
   * metadata.
   * 
   */
  public ColumnMetaData getMeta_data() {
    return this.meta_data;
  }

  /**
   * Column metadata for this chunk. This is the same content as what is at
   * file_path/file_offset.  Having it here has it replicated in the file
   * metadata.
   * 
   */
  public ColumnChunk setMeta_data(ColumnMetaData meta_data) {
    this.meta_data = meta_data;
    return this;
  }

  public void unsetMeta_data() {
    this.meta_data = null;
  }

  /** Returns true if field meta_data is set (has been asigned a value) and false otherwise */
  public boolean isSetMeta_data() {
    return this.meta_data != null;
  }

  public void setMeta_dataIsSet(boolean value) {
    if (!value) {
      this.meta_data = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FILE_PATH:
      if (value == null) {
        unsetFile_path();
      } else {
        setFile_path((String)value);
      }
      break;

    case FILE_OFFSET:
      if (value == null) {
        unsetFile_offset();
      } else {
        setFile_offset((Long)value);
      }
      break;

    case META_DATA:
      if (value == null) {
        unsetMeta_data();
      } else {
        setMeta_data((ColumnMetaData)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FILE_PATH:
      return getFile_path();

    case FILE_OFFSET:
      return new Long(getFile_offset());

    case META_DATA:
      return getMeta_data();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FILE_PATH:
      return isSetFile_path();
    case FILE_OFFSET:
      return isSetFile_offset();
    case META_DATA:
      return isSetMeta_data();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ColumnChunk)
      return this.equals((ColumnChunk)that);
    return false;
  }

  public boolean equals(ColumnChunk that) {
    if (that == null)
      return false;

    boolean this_present_file_path = true && this.isSetFile_path();
    boolean that_present_file_path = true && that.isSetFile_path();
    if (this_present_file_path || that_present_file_path) {
      if (!(this_present_file_path && that_present_file_path))
        return false;
      if (!this.file_path.equals(that.file_path))
        return false;
    }

    boolean this_present_file_offset = true;
    boolean that_present_file_offset = true;
    if (this_present_file_offset || that_present_file_offset) {
      if (!(this_present_file_offset && that_present_file_offset))
        return false;
      if (this.file_offset != that.file_offset)
        return false;
    }

    boolean this_present_meta_data = true && this.isSetMeta_data();
    boolean that_present_meta_data = true && that.isSetMeta_data();
    if (this_present_meta_data || that_present_meta_data) {
      if (!(this_present_meta_data && that_present_meta_data))
        return false;
      if (!this.meta_data.equals(that.meta_data))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_file_path = true && (isSetFile_path());
    builder.append(present_file_path);
    if (present_file_path)
      builder.append(file_path);

    boolean present_file_offset = true;
    builder.append(present_file_offset);
    if (present_file_offset)
      builder.append(file_offset);

    boolean present_meta_data = true && (isSetMeta_data());
    builder.append(present_meta_data);
    if (present_meta_data)
      builder.append(meta_data);

    return builder.toHashCode();
  }

  public int compareTo(ColumnChunk other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ColumnChunk typedOther = (ColumnChunk)other;

    lastComparison = Boolean.valueOf(isSetFile_path()).compareTo(typedOther.isSetFile_path());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFile_path()) {
      lastComparison = TBaseHelper.compareTo(this.file_path, typedOther.file_path);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFile_offset()).compareTo(typedOther.isSetFile_offset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFile_offset()) {
      lastComparison = TBaseHelper.compareTo(this.file_offset, typedOther.file_offset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMeta_data()).compareTo(typedOther.isSetMeta_data());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMeta_data()) {
      lastComparison = TBaseHelper.compareTo(this.meta_data, typedOther.meta_data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // FILE_PATH
          if (field.type == TType.STRING) {
            this.file_path = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // FILE_OFFSET
          if (field.type == TType.I64) {
            this.file_offset = iprot.readI64();
            setFile_offsetIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // META_DATA
          if (field.type == TType.STRUCT) {
            this.meta_data = new ColumnMetaData();
            this.meta_data.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    if (!isSetFile_offset()) {
      throw new TProtocolException("Required field 'file_offset' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.file_path != null) {
      if (isSetFile_path()) {
        oprot.writeFieldBegin(FILE_PATH_FIELD_DESC);
        oprot.writeString(this.file_path);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldBegin(FILE_OFFSET_FIELD_DESC);
    oprot.writeI64(this.file_offset);
    oprot.writeFieldEnd();
    if (this.meta_data != null) {
      if (isSetMeta_data()) {
        oprot.writeFieldBegin(META_DATA_FIELD_DESC);
        this.meta_data.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ColumnChunk(");
    boolean first = true;

    if (isSetFile_path()) {
      sb.append("file_path:");
      if (this.file_path == null) {
        sb.append("null");
      } else {
        sb.append(this.file_path);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("file_offset:");
    sb.append(this.file_offset);
    first = false;
    if (isSetMeta_data()) {
      if (!first) sb.append(", ");
      sb.append("meta_data:");
      if (this.meta_data == null) {
        sb.append("null");
      } else {
        sb.append(this.meta_data);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // alas, we cannot check 'file_offset' because it's a primitive and you chose the non-beans generator.
  }

}