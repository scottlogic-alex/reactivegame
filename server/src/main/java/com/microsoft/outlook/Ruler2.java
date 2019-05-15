package com.microsoft.outlook;

import com4j.*;

@IID("{000C03C1-0000-0000-C000-000000000046}")
public interface Ruler2 extends com.microsoft.outlook._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Levels"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.RulerLevels2
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  com.microsoft.outlook.RulerLevels2 levels();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.RulerLevels2.class})
  com.microsoft.outlook.RulerLevel2 levels(
          @MarshalAs(NativeType.VARIANT) Object index);

  /**
   * <p>
   * Getter method for the COM property "TabStops"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.TabStops2
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  com.microsoft.outlook.TabStops2 tabStops();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.TabStops2.class})
  com.microsoft.outlook.TabStop2 tabStops(
          @MarshalAs(NativeType.VARIANT) Object index);

  // Properties:
}
