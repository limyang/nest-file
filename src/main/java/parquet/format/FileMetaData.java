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

/**
 * Description for file metadata
 */
public class FileMetaData implements TBase<FileMetaData, FileMetaData._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("FileMetaData");

  private static final TField VERSION_FIELD_DESC = new TField("version", TType.I32, (short)1);
  private static final TField SCHEMA_FIELD_DESC = new TField("schema", TType.LIST, (short)2);
  private static final TField NUM_ROWS_FIELD_DESC = new TField("num_rows", TType.I64, (short)3);
  private static final TField ROW_GROUPS_FIELD_DESC = new TField("row_groups", TType.LIST, (short)4);
  private static final TField KEY_VALUE_METADATA_FIELD_DESC = new TField("key_value_metadata", TType.LIST, (short)5);
  private static final TField CREATED_BY_FIELD_DESC = new TField("created_by", TType.STRING, (short)6);

  /**
   * Version of this file *
   */
  public int version;
  /**
   * Parquet schema for this file.  This schema contains metadata for all the columns.
   * The schema is represented as a tree with a single root.  The nodes of the tree
   * are flattened to a list by doing a depth-first traversal.
   * The column metadata contains the path in the schema for that column which can be
   * used to map columns to nodes in the schema.
   * The first element is the root *
   */
  public List<SchemaElement> schema;
  /**
   * Number of rows in this file *
   */
  public long num_rows;
  /**
   * Row groups in this file *
   */
  public List<RowGroup> row_groups;
  /**
   * Optional key/value metadata *
   */
  public List<KeyValue> key_value_metadata;
  /**
   * String for application that wrote this file.  This should be in the format
   * <Application> version <App Version> (build <App Build Hash>).
   * e.g. impala version 1.0 (build 6cf94d29b2b7115df4de2c06e2ab4326d721eb55)
   * 
   */
  public String created_by;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    /**
     * Version of this file *
     */
    VERSION((short)1, "version"),
    /**
     * Parquet schema for this file.  This schema contains metadata for all the columns.
     * The schema is represented as a tree with a single root.  The nodes of the tree
     * are flattened to a list by doing a depth-first traversal.
     * The column metadata contains the path in the schema for that column which can be
     * used to map columns to nodes in the schema.
     * The first element is the root *
     */
    SCHEMA((short)2, "schema"),
    /**
     * Number of rows in this file *
     */
    NUM_ROWS((short)3, "num_rows"),
    /**
     * Row groups in this file *
     */
    ROW_GROUPS((short)4, "row_groups"),
    /**
     * Optional key/value metadata *
     */
    KEY_VALUE_METADATA((short)5, "key_value_metadata"),
    /**
     * String for application that wrote this file.  This should be in the format
     * <Application> version <App Version> (build <App Build Hash>).
     * e.g. impala version 1.0 (build 6cf94d29b2b7115df4de2c06e2ab4326d721eb55)
     * 
     */
    CREATED_BY((short)6, "created_by");

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
        case 1: // VERSION
          return VERSION;
        case 2: // SCHEMA
          return SCHEMA;
        case 3: // NUM_ROWS
          return NUM_ROWS;
        case 4: // ROW_GROUPS
          return ROW_GROUPS;
        case 5: // KEY_VALUE_METADATA
          return KEY_VALUE_METADATA;
        case 6: // CREATED_BY
          return CREATED_BY;
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
  private static final int __VERSION_ISSET_ID = 0;
  private static final int __NUM_ROWS_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION, new FieldMetaData("version", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.SCHEMA, new FieldMetaData("schema", TFieldRequirementType.REQUIRED, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, SchemaElement.class))));
    tmpMap.put(_Fields.NUM_ROWS, new FieldMetaData("num_rows", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.ROW_GROUPS, new FieldMetaData("row_groups", TFieldRequirementType.REQUIRED, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, RowGroup.class))));
    tmpMap.put(_Fields.KEY_VALUE_METADATA, new FieldMetaData("key_value_metadata", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, KeyValue.class))));
    tmpMap.put(_Fields.CREATED_BY, new FieldMetaData("created_by", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(FileMetaData.class, metaDataMap);
  }

  public FileMetaData() {
  }

  public FileMetaData(
    int version,
    List<SchemaElement> schema,
    long num_rows,
    List<RowGroup> row_groups)
  {
    this();
    this.version = version;
    setVersionIsSet(true);
    this.schema = schema;
    this.num_rows = num_rows;
    setNum_rowsIsSet(true);
    this.row_groups = row_groups;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FileMetaData(FileMetaData other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.version = other.version;
    if (other.isSetSchema()) {
      List<SchemaElement> __this__schema = new ArrayList<SchemaElement>();
      for (SchemaElement other_element : other.schema) {
        __this__schema.add(new SchemaElement(other_element));
      }
      this.schema = __this__schema;
    }
    this.num_rows = other.num_rows;
    if (other.isSetRow_groups()) {
      List<RowGroup> __this__row_groups = new ArrayList<RowGroup>();
      for (RowGroup other_element : other.row_groups) {
        __this__row_groups.add(new RowGroup(other_element));
      }
      this.row_groups = __this__row_groups;
    }
    if (other.isSetKey_value_metadata()) {
      List<KeyValue> __this__key_value_metadata = new ArrayList<KeyValue>();
      for (KeyValue other_element : other.key_value_metadata) {
        __this__key_value_metadata.add(new KeyValue(other_element));
      }
      this.key_value_metadata = __this__key_value_metadata;
    }
    if (other.isSetCreated_by()) {
      this.created_by = other.created_by;
    }
  }

  public FileMetaData deepCopy() {
    return new FileMetaData(this);
  }

  @Override
  public void clear() {
    setVersionIsSet(false);
    this.version = 0;
    this.schema = null;
    setNum_rowsIsSet(false);
    this.num_rows = 0;
    this.row_groups = null;
    this.key_value_metadata = null;
    this.created_by = null;
  }

  /**
   * Version of this file *
   */
  public int getVersion() {
    return this.version;
  }

  /**
   * Version of this file *
   */
  public FileMetaData setVersion(int version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bit_vector.clear(__VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been asigned a value) and false otherwise */
  public boolean isSetVersion() {
    return __isset_bit_vector.get(__VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bit_vector.set(__VERSION_ISSET_ID, value);
  }

  public int getSchemaSize() {
    return (this.schema == null) ? 0 : this.schema.size();
  }

  public java.util.Iterator<SchemaElement> getSchemaIterator() {
    return (this.schema == null) ? null : this.schema.iterator();
  }

  public void addToSchema(SchemaElement elem) {
    if (this.schema == null) {
      this.schema = new ArrayList<SchemaElement>();
    }
    this.schema.add(elem);
  }

  /**
   * Parquet schema for this file.  This schema contains metadata for all the columns.
   * The schema is represented as a tree with a single root.  The nodes of the tree
   * are flattened to a list by doing a depth-first traversal.
   * The column metadata contains the path in the schema for that column which can be
   * used to map columns to nodes in the schema.
   * The first element is the root *
   */
  public List<SchemaElement> getSchema() {
    return this.schema;
  }

  /**
   * Parquet schema for this file.  This schema contains metadata for all the columns.
   * The schema is represented as a tree with a single root.  The nodes of the tree
   * are flattened to a list by doing a depth-first traversal.
   * The column metadata contains the path in the schema for that column which can be
   * used to map columns to nodes in the schema.
   * The first element is the root *
   */
  public FileMetaData setSchema(List<SchemaElement> schema) {
    this.schema = schema;
    return this;
  }

  public void unsetSchema() {
    this.schema = null;
  }

  /** Returns true if field schema is set (has been asigned a value) and false otherwise */
  public boolean isSetSchema() {
    return this.schema != null;
  }

  public void setSchemaIsSet(boolean value) {
    if (!value) {
      this.schema = null;
    }
  }

  /**
   * Number of rows in this file *
   */
  public long getNum_rows() {
    return this.num_rows;
  }

  /**
   * Number of rows in this file *
   */
  public FileMetaData setNum_rows(long num_rows) {
    this.num_rows = num_rows;
    setNum_rowsIsSet(true);
    return this;
  }

  public void unsetNum_rows() {
    __isset_bit_vector.clear(__NUM_ROWS_ISSET_ID);
  }

  /** Returns true if field num_rows is set (has been asigned a value) and false otherwise */
  public boolean isSetNum_rows() {
    return __isset_bit_vector.get(__NUM_ROWS_ISSET_ID);
  }

  public void setNum_rowsIsSet(boolean value) {
    __isset_bit_vector.set(__NUM_ROWS_ISSET_ID, value);
  }

  public int getRow_groupsSize() {
    return (this.row_groups == null) ? 0 : this.row_groups.size();
  }

  public java.util.Iterator<RowGroup> getRow_groupsIterator() {
    return (this.row_groups == null) ? null : this.row_groups.iterator();
  }

  public void addToRow_groups(RowGroup elem) {
    if (this.row_groups == null) {
      this.row_groups = new ArrayList<RowGroup>();
    }
    this.row_groups.add(elem);
  }

  /**
   * Row groups in this file *
   */
  public List<RowGroup> getRow_groups() {
    return this.row_groups;
  }

  /**
   * Row groups in this file *
   */
  public FileMetaData setRow_groups(List<RowGroup> row_groups) {
    this.row_groups = row_groups;
    return this;
  }

  public void unsetRow_groups() {
    this.row_groups = null;
  }

  /** Returns true if field row_groups is set (has been asigned a value) and false otherwise */
  public boolean isSetRow_groups() {
    return this.row_groups != null;
  }

  public void setRow_groupsIsSet(boolean value) {
    if (!value) {
      this.row_groups = null;
    }
  }

  public int getKey_value_metadataSize() {
    return (this.key_value_metadata == null) ? 0 : this.key_value_metadata.size();
  }

  public java.util.Iterator<KeyValue> getKey_value_metadataIterator() {
    return (this.key_value_metadata == null) ? null : this.key_value_metadata.iterator();
  }

  public void addToKey_value_metadata(KeyValue elem) {
    if (this.key_value_metadata == null) {
      this.key_value_metadata = new ArrayList<KeyValue>();
    }
    this.key_value_metadata.add(elem);
  }

  /**
   * Optional key/value metadata *
   */
  public List<KeyValue> getKey_value_metadata() {
    return this.key_value_metadata;
  }

  /**
   * Optional key/value metadata *
   */
  public FileMetaData setKey_value_metadata(List<KeyValue> key_value_metadata) {
    this.key_value_metadata = key_value_metadata;
    return this;
  }

  public void unsetKey_value_metadata() {
    this.key_value_metadata = null;
  }

  /** Returns true if field key_value_metadata is set (has been asigned a value) and false otherwise */
  public boolean isSetKey_value_metadata() {
    return this.key_value_metadata != null;
  }

  public void setKey_value_metadataIsSet(boolean value) {
    if (!value) {
      this.key_value_metadata = null;
    }
  }

  /**
   * String for application that wrote this file.  This should be in the format
   * <Application> version <App Version> (build <App Build Hash>).
   * e.g. impala version 1.0 (build 6cf94d29b2b7115df4de2c06e2ab4326d721eb55)
   * 
   */
  public String getCreated_by() {
    return this.created_by;
  }

  /**
   * String for application that wrote this file.  This should be in the format
   * <Application> version <App Version> (build <App Build Hash>).
   * e.g. impala version 1.0 (build 6cf94d29b2b7115df4de2c06e2ab4326d721eb55)
   * 
   */
  public FileMetaData setCreated_by(String created_by) {
    this.created_by = created_by;
    return this;
  }

  public void unsetCreated_by() {
    this.created_by = null;
  }

  /** Returns true if field created_by is set (has been asigned a value) and false otherwise */
  public boolean isSetCreated_by() {
    return this.created_by != null;
  }

  public void setCreated_byIsSet(boolean value) {
    if (!value) {
      this.created_by = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Integer)value);
      }
      break;

    case SCHEMA:
      if (value == null) {
        unsetSchema();
      } else {
        setSchema((List<SchemaElement>)value);
      }
      break;

    case NUM_ROWS:
      if (value == null) {
        unsetNum_rows();
      } else {
        setNum_rows((Long)value);
      }
      break;

    case ROW_GROUPS:
      if (value == null) {
        unsetRow_groups();
      } else {
        setRow_groups((List<RowGroup>)value);
      }
      break;

    case KEY_VALUE_METADATA:
      if (value == null) {
        unsetKey_value_metadata();
      } else {
        setKey_value_metadata((List<KeyValue>)value);
      }
      break;

    case CREATED_BY:
      if (value == null) {
        unsetCreated_by();
      } else {
        setCreated_by((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return new Integer(getVersion());

    case SCHEMA:
      return getSchema();

    case NUM_ROWS:
      return new Long(getNum_rows());

    case ROW_GROUPS:
      return getRow_groups();

    case KEY_VALUE_METADATA:
      return getKey_value_metadata();

    case CREATED_BY:
      return getCreated_by();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VERSION:
      return isSetVersion();
    case SCHEMA:
      return isSetSchema();
    case NUM_ROWS:
      return isSetNum_rows();
    case ROW_GROUPS:
      return isSetRow_groups();
    case KEY_VALUE_METADATA:
      return isSetKey_value_metadata();
    case CREATED_BY:
      return isSetCreated_by();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FileMetaData)
      return this.equals((FileMetaData)that);
    return false;
  }

  public boolean equals(FileMetaData that) {
    if (that == null)
      return false;

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_schema = true && this.isSetSchema();
    boolean that_present_schema = true && that.isSetSchema();
    if (this_present_schema || that_present_schema) {
      if (!(this_present_schema && that_present_schema))
        return false;
      if (!this.schema.equals(that.schema))
        return false;
    }

    boolean this_present_num_rows = true;
    boolean that_present_num_rows = true;
    if (this_present_num_rows || that_present_num_rows) {
      if (!(this_present_num_rows && that_present_num_rows))
        return false;
      if (this.num_rows != that.num_rows)
        return false;
    }

    boolean this_present_row_groups = true && this.isSetRow_groups();
    boolean that_present_row_groups = true && that.isSetRow_groups();
    if (this_present_row_groups || that_present_row_groups) {
      if (!(this_present_row_groups && that_present_row_groups))
        return false;
      if (!this.row_groups.equals(that.row_groups))
        return false;
    }

    boolean this_present_key_value_metadata = true && this.isSetKey_value_metadata();
    boolean that_present_key_value_metadata = true && that.isSetKey_value_metadata();
    if (this_present_key_value_metadata || that_present_key_value_metadata) {
      if (!(this_present_key_value_metadata && that_present_key_value_metadata))
        return false;
      if (!this.key_value_metadata.equals(that.key_value_metadata))
        return false;
    }

    boolean this_present_created_by = true && this.isSetCreated_by();
    boolean that_present_created_by = true && that.isSetCreated_by();
    if (this_present_created_by || that_present_created_by) {
      if (!(this_present_created_by && that_present_created_by))
        return false;
      if (!this.created_by.equals(that.created_by))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_version = true;
    builder.append(present_version);
    if (present_version)
      builder.append(version);

    boolean present_schema = true && (isSetSchema());
    builder.append(present_schema);
    if (present_schema)
      builder.append(schema);

    boolean present_num_rows = true;
    builder.append(present_num_rows);
    if (present_num_rows)
      builder.append(num_rows);

    boolean present_row_groups = true && (isSetRow_groups());
    builder.append(present_row_groups);
    if (present_row_groups)
      builder.append(row_groups);

    boolean present_key_value_metadata = true && (isSetKey_value_metadata());
    builder.append(present_key_value_metadata);
    if (present_key_value_metadata)
      builder.append(key_value_metadata);

    boolean present_created_by = true && (isSetCreated_by());
    builder.append(present_created_by);
    if (present_created_by)
      builder.append(created_by);

    return builder.toHashCode();
  }

  public int compareTo(FileMetaData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    FileMetaData typedOther = (FileMetaData)other;

    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(typedOther.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = TBaseHelper.compareTo(this.version, typedOther.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSchema()).compareTo(typedOther.isSetSchema());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchema()) {
      lastComparison = TBaseHelper.compareTo(this.schema, typedOther.schema);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNum_rows()).compareTo(typedOther.isSetNum_rows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum_rows()) {
      lastComparison = TBaseHelper.compareTo(this.num_rows, typedOther.num_rows);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRow_groups()).compareTo(typedOther.isSetRow_groups());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRow_groups()) {
      lastComparison = TBaseHelper.compareTo(this.row_groups, typedOther.row_groups);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKey_value_metadata()).compareTo(typedOther.isSetKey_value_metadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey_value_metadata()) {
      lastComparison = TBaseHelper.compareTo(this.key_value_metadata, typedOther.key_value_metadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreated_by()).compareTo(typedOther.isSetCreated_by());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreated_by()) {
      lastComparison = TBaseHelper.compareTo(this.created_by, typedOther.created_by);
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
        case 1: // VERSION
          if (field.type == TType.I32) {
            this.version = iprot.readI32();
            setVersionIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SCHEMA
          if (field.type == TType.LIST) {
            {
              TList _list16 = iprot.readListBegin();
              this.schema = new ArrayList<SchemaElement>(_list16.size);
              for (int _i17 = 0; _i17 < _list16.size; ++_i17)
              {
                SchemaElement _elem18;
                _elem18 = new SchemaElement();
                _elem18.read(iprot);
                this.schema.add(_elem18);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // NUM_ROWS
          if (field.type == TType.I64) {
            this.num_rows = iprot.readI64();
            setNum_rowsIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // ROW_GROUPS
          if (field.type == TType.LIST) {
            {
              TList _list19 = iprot.readListBegin();
              this.row_groups = new ArrayList<RowGroup>(_list19.size);
              for (int _i20 = 0; _i20 < _list19.size; ++_i20)
              {
                RowGroup _elem21;
                _elem21 = new RowGroup();
                _elem21.read(iprot);
                this.row_groups.add(_elem21);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // KEY_VALUE_METADATA
          if (field.type == TType.LIST) {
            {
              TList _list22 = iprot.readListBegin();
              this.key_value_metadata = new ArrayList<KeyValue>(_list22.size);
              for (int _i23 = 0; _i23 < _list22.size; ++_i23)
              {
                KeyValue _elem24;
                _elem24 = new KeyValue();
                _elem24.read(iprot);
                this.key_value_metadata.add(_elem24);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // CREATED_BY
          if (field.type == TType.STRING) {
            this.created_by = iprot.readString();
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
    if (!isSetVersion()) {
      throw new TProtocolException("Required field 'version' was not found in serialized data! Struct: " + toString());
    }
    if (!isSetNum_rows()) {
      throw new TProtocolException("Required field 'num_rows' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(VERSION_FIELD_DESC);
    oprot.writeI32(this.version);
    oprot.writeFieldEnd();
    if (this.schema != null) {
      oprot.writeFieldBegin(SCHEMA_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.schema.size()));
        for (SchemaElement _iter25 : this.schema)
        {
          _iter25.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(NUM_ROWS_FIELD_DESC);
    oprot.writeI64(this.num_rows);
    oprot.writeFieldEnd();
    if (this.row_groups != null) {
      oprot.writeFieldBegin(ROW_GROUPS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.row_groups.size()));
        for (RowGroup _iter26 : this.row_groups)
        {
          _iter26.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.key_value_metadata != null) {
      if (isSetKey_value_metadata()) {
        oprot.writeFieldBegin(KEY_VALUE_METADATA_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.key_value_metadata.size()));
          for (KeyValue _iter27 : this.key_value_metadata)
          {
            _iter27.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.created_by != null) {
      if (isSetCreated_by()) {
        oprot.writeFieldBegin(CREATED_BY_FIELD_DESC);
        oprot.writeString(this.created_by);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("FileMetaData(");
    boolean first = true;

    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("schema:");
    if (this.schema == null) {
      sb.append("null");
    } else {
      sb.append(this.schema);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("num_rows:");
    sb.append(this.num_rows);
    first = false;
    if (!first) sb.append(", ");
    sb.append("row_groups:");
    if (this.row_groups == null) {
      sb.append("null");
    } else {
      sb.append(this.row_groups);
    }
    first = false;
    if (isSetKey_value_metadata()) {
      if (!first) sb.append(", ");
      sb.append("key_value_metadata:");
      if (this.key_value_metadata == null) {
        sb.append("null");
      } else {
        sb.append(this.key_value_metadata);
      }
      first = false;
    }
    if (isSetCreated_by()) {
      if (!first) sb.append(", ");
      sb.append("created_by:");
      if (this.created_by == null) {
        sb.append("null");
      } else {
        sb.append(this.created_by);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // alas, we cannot check 'version' because it's a primitive and you chose the non-beans generator.
    if (schema == null) {
      throw new TProtocolException("Required field 'schema' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'num_rows' because it's a primitive and you chose the non-beans generator.
    if (row_groups == null) {
      throw new TProtocolException("Required field 'row_groups' was not present! Struct: " + toString());
    }
  }

}