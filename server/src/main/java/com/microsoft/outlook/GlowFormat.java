package com.microsoft.outlook;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

@IID("{000C03BD-0000-0000-C000-000000000046}")
public interface GlowFormat extends com.microsoft.outlook._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Radius"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  float radius();


  /**
   * <p>
   * Setter method for the COM property "Radius"
   * </p>
   * @param radius Mandatory float parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  void radius(
          float radius);


  /**
   * <p>
   * Getter method for the COM property "Color"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ColorFormat
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  com.microsoft.outlook.ColorFormat color();


  /**
   * <p>
   * Getter method for the COM property "Transparency"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  float transparency();


  /**
   * <p>
   * Setter method for the COM property "Transparency"
   * </p>
   * @param transparency Mandatory float parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  void transparency(
          float transparency);


  // Properties:
}
