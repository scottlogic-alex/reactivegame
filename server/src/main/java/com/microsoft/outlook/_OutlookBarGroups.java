package com.microsoft.outlook;

import com4j.*;

@IID("{00063072-0000-0000-C000-000000000046}")
public interface _OutlookBarGroups extends Com4jObject {
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
   * @return  Returns a value of type com.microsoft.outlook.OutlookBarGroup
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(12)
  OutlookBarGroup item(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com.microsoft.outlook.OutlookBarGroup
   */

  @DISPID(95) //= 0x5f. The runtime will prefer the VTID if present
  @VTID(13)
  OutlookBarGroup add(
          String name,
          @Optional @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(84) //= 0x54. The runtime will prefer the VTID if present
  @VTID(14)
  void remove(
          @MarshalAs(NativeType.VARIANT) Object index);


  // Properties:
}
