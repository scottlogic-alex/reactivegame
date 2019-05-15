package com.microsoft.outlook;

import com4j.*;

@IID("{000630E1-0000-0000-C000-000000000046}")
public interface _Columns extends Com4jObject {
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
   * @return  Returns a value of type com.microsoft.outlook._Column
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(12)
  _Column item(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.microsoft.outlook._Column
   */

  @DISPID(95) //= 0x5f. The runtime will prefer the VTID if present
  @VTID(13)
  _Column add(
          String name);


  /**
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(82) //= 0x52. The runtime will prefer the VTID if present
  @VTID(14)
  void remove(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   */

  @DISPID(83) //= 0x53. The runtime will prefer the VTID if present
  @VTID(15)
  void removeAll();


  // Properties:
}
