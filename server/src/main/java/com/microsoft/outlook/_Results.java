package com.microsoft.outlook;

import com4j.*;

@IID("{0006300C-0000-0000-C000-000000000046}")
public interface _Results extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Application
   */

  @DISPID(61440) //= 0xf000. The runtime will prefer the VTID if present
  @VTID(7)
  com.microsoft.outlook._Application application();


  /**
   * <p>
   * Getter method for the COM property "Class"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlObjectClass
   */

  @DISPID(61450) //= 0xf00a. The runtime will prefer the VTID if present
  @VTID(8)
  com.microsoft.outlook.OlObjectClass _class();


  /**
   * <p>
   * Getter method for the COM property "Session"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._NameSpace
   */

  @DISPID(61451) //= 0xf00b. The runtime will prefer the VTID if present
  @VTID(9)
  com.microsoft.outlook._NameSpace session();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61441) //= 0xf001. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(80) //= 0x50. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject item(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * <p>
   * Getter method for the COM property "RawTable"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(90) //= 0x5a. The runtime will prefer the VTID if present
  @VTID(13)
  Com4jObject rawTable();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(86) //= 0x56. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject getFirst();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(88) //= 0x58. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject getLast();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(87) //= 0x57. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject getNext();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(89) //= 0x59. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject getPrevious();


  /**
   */

  @DISPID(93) //= 0x5d. The runtime will prefer the VTID if present
  @VTID(18)
  void resetColumns();


  /**
   * @param columns Mandatory java.lang.String parameter.
   */

  @DISPID(92) //= 0x5c. The runtime will prefer the VTID if present
  @VTID(19)
  void setColumns(
          String columns);


  /**
   * @param property Mandatory java.lang.String parameter.
   * @param descending Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(97) //= 0x61. The runtime will prefer the VTID if present
  @VTID(20)
  void sort(
          String property,
          @Optional @MarshalAs(NativeType.VARIANT) Object descending);


  /**
   * <p>
   * Getter method for the COM property "DefaultItemType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlItemType
   */

  @DISPID(64143) //= 0xfa8f. The runtime will prefer the VTID if present
  @VTID(21)
  com.microsoft.outlook.OlItemType defaultItemType();


  /**
   * <p>
   * Setter method for the COM property "DefaultItemType"
   * </p>
   * @param defaultItemType Mandatory com.microsoft.outlook.OlItemType parameter.
   */

  @DISPID(64143) //= 0xfa8f. The runtime will prefer the VTID if present
  @VTID(22)
  void defaultItemType(
          com.microsoft.outlook.OlItemType defaultItemType);


  // Properties:
}
