package com.microsoft.outlook;

import com4j.*;

@IID("{000C03E3-0000-0000-C000-000000000046}")
public interface PickerProperties extends _IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type com.microsoft.outlook.PickerProperty
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  PickerProperty item(
          int index);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * @param id Mandatory java.lang.String parameter.
   * @param value Mandatory java.lang.String parameter.
   * @param type Mandatory com.microsoft.outlook.MsoPickerField parameter.
   * @return  Returns a value of type com.microsoft.outlook.PickerProperty
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  PickerProperty add(
          String id,
          String value,
          MsoPickerField type);


  /**
   * @param id Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  void remove(
          String id);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
