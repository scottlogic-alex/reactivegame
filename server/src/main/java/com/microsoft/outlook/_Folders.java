package com.microsoft.outlook;

import com4j.*;

@IID("{00063040-0000-0000-C000-000000000046}")
public interface _Folders extends Com4jObject {
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
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(12)
  com.microsoft.outlook.MAPIFolder item(
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
   * @param name Mandatory java.lang.String parameter.
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(95) //= 0x5f. The runtime will prefer the VTID if present
  @VTID(14)
  com.microsoft.outlook.MAPIFolder add(
          String name,
          @Optional @MarshalAs(NativeType.VARIANT) Object type);


  /**
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(86) //= 0x56. The runtime will prefer the VTID if present
  @VTID(15)
  com.microsoft.outlook.MAPIFolder getFirst();


  /**
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(88) //= 0x58. The runtime will prefer the VTID if present
  @VTID(16)
  com.microsoft.outlook.MAPIFolder getLast();


  /**
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(87) //= 0x57. The runtime will prefer the VTID if present
  @VTID(17)
  com.microsoft.outlook.MAPIFolder getNext();


  /**
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(89) //= 0x59. The runtime will prefer the VTID if present
  @VTID(18)
  com.microsoft.outlook.MAPIFolder getPrevious();


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(84) //= 0x54. The runtime will prefer the VTID if present
  @VTID(19)
  void remove(
          int index);


  // Properties:
}
