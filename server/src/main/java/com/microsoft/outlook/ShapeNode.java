package com.microsoft.outlook;

import com4j.*;

@IID("{000C0318-0000-0000-C000-000000000046}")
public interface ShapeNode extends com.microsoft.outlook._IMsoDispObj {
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
   * Getter method for the COM property "EditingType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoEditingType
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(10)
  com.microsoft.outlook.MsoEditingType editingType();


  /**
   * <p>
   * Getter method for the COM property "Points"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  Object points();


  /**
   * <p>
   * Getter method for the COM property "SegmentType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoSegmentType
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(12)
  com.microsoft.outlook.MsoSegmentType segmentType();


  // Properties:
}
