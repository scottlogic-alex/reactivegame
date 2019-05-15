package com.microsoft.outlook;

import com4j.*;

@IID("{000630D3-0000-0000-C000-000000000046}")
public interface _Row extends Com4jObject {
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
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64259) //= 0xfb03. The runtime will prefer the VTID if present
  @VTID(11)
  String binaryToString(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(64462) //= 0xfbce. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  Object getValues();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  Object item(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(64257) //= 0xfb01. The runtime will prefer the VTID if present
  @VTID(14)
  java.util.Date localTimeToUTC(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(64256) //= 0xfb00. The runtime will prefer the VTID if present
  @VTID(15)
  java.util.Date utcToLocalTime(
          @MarshalAs(NativeType.VARIANT) Object index);


  // Properties:
}
