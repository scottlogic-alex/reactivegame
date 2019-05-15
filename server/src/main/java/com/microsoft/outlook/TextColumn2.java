package com.microsoft.outlook;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

@IID("{000C03B2-0000-0000-C000-000000000046}")
public interface TextColumn2 extends com.microsoft.outlook._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Number"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  int number();


  /**
   * <p>
   * Setter method for the COM property "Number"
   * </p>
   * @param number Mandatory int parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  void number(
          int number);


  /**
   * <p>
   * Getter method for the COM property "Spacing"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  float spacing();


  /**
   * <p>
   * Setter method for the COM property "Spacing"
   * </p>
   * @param spacing Mandatory float parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  void spacing(
          float spacing);


  /**
   * <p>
   * Getter method for the COM property "TextDirection"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTextDirection
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  com.microsoft.outlook.MsoTextDirection textDirection();


  /**
   * <p>
   * Setter method for the COM property "TextDirection"
   * </p>
   * @param direction Mandatory com.microsoft.outlook.MsoTextDirection parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  void textDirection(
          com.microsoft.outlook.MsoTextDirection direction);


  // Properties:
}
