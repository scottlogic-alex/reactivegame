package com.microsoft.outlook;

import com4j.*;

@IID("{00063070-0000-0000-C000-000000000046}")
public interface _OutlookBarPane extends Com4jObject {
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
   * Getter method for the COM property "Contents"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OutlookBarStorage
   */

  @DISPID(8448) //= 0x2100. The runtime will prefer the VTID if present
  @VTID(11)
  com.microsoft.outlook.OutlookBarStorage contents();


  /**
   * <p>
   * Getter method for the COM property "CurrentGroup"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OutlookBarGroup
   */

  @DISPID(8449) //= 0x2101. The runtime will prefer the VTID if present
  @VTID(12)
  com.microsoft.outlook.OutlookBarGroup currentGroup();


  /**
   * <p>
   * Setter method for the COM property "CurrentGroup"
   * </p>
   * @param currentGroup Mandatory com.microsoft.outlook.OutlookBarGroup parameter.
   */

  @DISPID(8449) //= 0x2101. The runtime will prefer the VTID if present
  @VTID(13)
  void currentGroup(
          com.microsoft.outlook.OutlookBarGroup currentGroup);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(14)
  @DefaultMethod
  String name();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(8451) //= 0x2103. The runtime will prefer the VTID if present
  @VTID(15)
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param visible Mandatory boolean parameter.
   */

  @DISPID(8451) //= 0x2103. The runtime will prefer the VTID if present
  @VTID(16)
  void visible(
          boolean visible);


  // Properties:
}
