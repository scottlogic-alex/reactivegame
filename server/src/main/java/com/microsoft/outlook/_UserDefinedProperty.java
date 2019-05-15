package com.microsoft.outlook;

import com4j.*;

@IID("{0006305C-0000-0000-C000-000000000046}")
public interface _UserDefinedProperty extends Com4jObject {
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
   * Getter method for the COM property "Formula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(11)
  String formula();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(12)
  String name();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlUserPropertyType
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(13)
  OlUserPropertyType type();


  /**
   * <p>
   * Getter method for the COM property "DisplayFormat"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64039) //= 0xfa27. The runtime will prefer the VTID if present
  @VTID(14)
  int displayFormat();


  /**
   */

  @DISPID(64523) //= 0xfc0b. The runtime will prefer the VTID if present
  @VTID(15)
  void delete();


  // Properties:
}
