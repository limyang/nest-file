/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package parquet.format;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * Common types used by frameworks(e.g. hive, pig) using parquet.  This helps map
 * between types in those frameworks to the base types in parquet.  This is only
 * metadata and not needed to read or write the data.
 */
public enum ConvertedType implements TEnum {
  /**
   * a BYTE_ARRAY actually contains UTF8 encoded chars
   */
  UTF8(0),
  /**
   * a map is converted as an optional field containing a repeated key/value pair
   */
  MAP(1),
  /**
   * a key/value pair is converted into a group of two fields
   */
  MAP_KEY_VALUE(2),
  /**
   * a list is converted into an optional field containing a repeated field for its
   * values
   */
  LIST(3);

  private final int value;

  private ConvertedType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ConvertedType findByValue(int value) { 
    switch (value) {
      case 0:
        return UTF8;
      case 1:
        return MAP;
      case 2:
        return MAP_KEY_VALUE;
      case 3:
        return LIST;
      default:
        return null;
    }
  }
}