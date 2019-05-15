package com.microsoft.outlook;

import com4j.*;

@IID("{0006304A-0000-0000-C000-000000000046}")
public interface AddressEntries extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Application
   */

  @DISPID(61440) //= 0xf000. The runtime will prefer the VTID if present
  @VTID(7)
  _Application application();


  /**
   * <p>
   * Getter method for the COM property "Class"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlObjectClass
   */

  @DISPID(61450) //= 0xf00a. The runtime will prefer the VTID if present
  @VTID(8)
  OlObjectClass _class();


  /**
   * <p>
   * Getter method for the COM property "Session"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._NameSpace
   */

  @DISPID(61451) //= 0xf00b. The runtime will prefer the VTID if present
  @VTID(9)
  _NameSpace session();


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
   * @return  Returns a value of type com.microsoft.outlook.AddressEntry
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(12)
  AddressEntry item(
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
   * @param type Mandatory java.lang.String parameter.
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param address Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com.microsoft.outlook.AddressEntry
   */

  @DISPID(95) //= 0x5f. The runtime will prefer the VTID if present
  @VTID(14)
  AddressEntry add(
          String type,
          @Optional @MarshalAs(NativeType.VARIANT) Object name,
          @Optional @MarshalAs(NativeType.VARIANT) Object address);


  /**
   * @return  Returns a value of type com.microsoft.outlook.AddressEntry
   */

  @DISPID(86) //= 0x56. The runtime will prefer the VTID if present
  @VTID(15)
  AddressEntry getFirst();


  /**
   * @return  Returns a value of type com.microsoft.outlook.AddressEntry
   */

  @DISPID(88) //= 0x58. The runtime will prefer the VTID if present
  @VTID(16)
  AddressEntry getLast();


  /**
   * @return  Returns a value of type com.microsoft.outlook.AddressEntry
   */

  @DISPID(87) //= 0x57. The runtime will prefer the VTID if present
  @VTID(17)
  AddressEntry getNext();


  /**
   * @return  Returns a value of type com.microsoft.outlook.AddressEntry
   */

  @DISPID(89) //= 0x59. The runtime will prefer the VTID if present
  @VTID(18)
  AddressEntry getPrevious();


  /**
   * @param property Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(97) //= 0x61. The runtime will prefer the VTID if present
  @VTID(19)
  void sort(
          @Optional @MarshalAs(NativeType.VARIANT) Object property,
          @Optional @MarshalAs(NativeType.VARIANT) Object order);


  // Properties:
}
