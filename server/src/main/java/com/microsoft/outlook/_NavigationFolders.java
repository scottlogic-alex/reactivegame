package com.microsoft.outlook;

import com4j.*;

@IID("{000630F1-0000-0000-C000-000000000046}")
public interface _NavigationFolders extends Com4jObject {
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
   * @return  Returns a value of type com.microsoft.outlook._NavigationFolder
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(12)
  _NavigationFolder item(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * @param folder Mandatory com.microsoft.outlook.MAPIFolder parameter.
   * @return  Returns a value of type com.microsoft.outlook._NavigationFolder
   */

  @DISPID(64450) //= 0xfbc2. The runtime will prefer the VTID if present
  @VTID(13)
  _NavigationFolder add(
          MAPIFolder folder);


  /**
   * @param removableFolder Mandatory com.microsoft.outlook._NavigationFolder parameter.
   */

  @DISPID(64451) //= 0xfbc3. The runtime will prefer the VTID if present
  @VTID(14)
  void remove(
          _NavigationFolder removableFolder);


  // Properties:
}
