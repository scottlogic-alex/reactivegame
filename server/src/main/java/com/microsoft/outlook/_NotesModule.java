package com.microsoft.outlook;

import com4j.*;

@IID("{000630EE-0000-0000-C000-000000000046}")
public interface _NotesModule extends Com4jObject {
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
  com.microsoft.outlook.OlObjectClass _class();


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
   * Getter method for the COM property "NavigationModuleType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlNavigationModuleType
   */

  @DISPID(64441) //= 0xfbb9. The runtime will prefer the VTID if present
  @VTID(11)
  com.microsoft.outlook.OlNavigationModuleType navigationModuleType();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8450) //= 0x2102. The runtime will prefer the VTID if present
  @VTID(12)
  String name();


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64442) //= 0xfbba. The runtime will prefer the VTID if present
  @VTID(13)
  int position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param position Mandatory int parameter.
   */

  @DISPID(64442) //= 0xfbba. The runtime will prefer the VTID if present
  @VTID(14)
  void position(
          int position);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64443) //= 0xfbbb. The runtime will prefer the VTID if present
  @VTID(15)
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param visible Mandatory boolean parameter.
   */

  @DISPID(64443) //= 0xfbbb. The runtime will prefer the VTID if present
  @VTID(16)
  void visible(
          boolean visible);


  /**
   * <p>
   * Getter method for the COM property "NavigationGroups"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._NavigationGroups
   */

  @DISPID(64444) //= 0xfbbc. The runtime will prefer the VTID if present
  @VTID(17)
  com.microsoft.outlook._NavigationGroups navigationGroups();


  // Properties:
}
