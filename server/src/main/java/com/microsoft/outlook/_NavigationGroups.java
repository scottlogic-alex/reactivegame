package com.microsoft.outlook;

import com4j.*;

@IID("{000630EF-0000-0000-C000-000000000046}")
public interface _NavigationGroups extends Com4jObject {
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
   * @return  Returns a value of type com.microsoft.outlook._NavigationGroup
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(12)
  _NavigationGroup item(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * @param groupDisplayName Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.microsoft.outlook._NavigationGroup
   */

  @DISPID(64445) //= 0xfbbd. The runtime will prefer the VTID if present
  @VTID(13)
  _NavigationGroup create(
          String groupDisplayName);


  /**
   * @param group Mandatory com.microsoft.outlook._NavigationGroup parameter.
   */

  @DISPID(64446) //= 0xfbbe. The runtime will prefer the VTID if present
  @VTID(14)
  void delete(
          _NavigationGroup group);


  /**
   * @param defaultFolderGroup Mandatory com.microsoft.outlook.OlGroupType parameter.
   * @return  Returns a value of type com.microsoft.outlook._NavigationGroup
   */

  @DISPID(64447) //= 0xfbbf. The runtime will prefer the VTID if present
  @VTID(15)
  _NavigationGroup getDefaultNavigationGroup(
          OlGroupType defaultFolderGroup);


  // Properties:
}
