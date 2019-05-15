package com.microsoft.outlook;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

@IID("{000C03E0-0000-0000-C000-000000000046}")
public interface PickerField extends com.microsoft.outlook._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  String name();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoPickerField
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  com.microsoft.outlook.MsoPickerField type();


  /**
   * <p>
   * Getter method for the COM property "IsHidden"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  boolean isHidden();


  // Properties:
}
