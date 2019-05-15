package com.microsoft.outlook;

import com4j.*;

@IID("{000C0356-0000-0000-C000-000000000046}")
public interface HTMLProject extends com.microsoft.outlook._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "State"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoHTMLProjectState
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  com.microsoft.outlook.MsoHTMLProjectState state();


  /**
   * @param refresh Optional parameter. Default value is false
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  void refreshProject(
          @Optional @DefaultValue("-1") boolean refresh);


  /**
   * @param refresh Optional parameter. Default value is false
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  void refreshDocument(
          @Optional @DefaultValue("-1") boolean refresh);


  /**
   * <p>
   * Getter method for the COM property "HTMLProjectItems"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.HTMLProjectItems
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  com.microsoft.outlook.HTMLProjectItems htmlProjectItems();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.HTMLProjectItems.class})
  com.microsoft.outlook.HTMLProjectItem htmlProjectItems(
          Object index);

  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * @param openKind Optional parameter. Default value is 0
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  void open(
          @Optional @DefaultValue("0") com.microsoft.outlook.MsoHTMLProjectOpen openKind);


  // Properties:
}
