package com.microsoft.outlook;

import com4j.*;

@IID("{000C1712-0000-0000-C000-000000000046}")
public interface Axes extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param type Mandatory com.microsoft.outlook.XlAxisType parameter.
   * @param axisGroup Optional parameter. Default value is 1
   * @return  Returns a value of type com.microsoft.outlook.IMsoAxis
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  com.microsoft.outlook.IMsoAxis item(
          com.microsoft.outlook.XlAxisType type,
          @Optional @DefaultValue("1") com.microsoft.outlook.XlAxisGroup axisGroup);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(11)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param type Mandatory com.microsoft.outlook.XlAxisType parameter.
   * @param axisGroup Optional parameter. Default value is 1
   * @return  Returns a value of type com.microsoft.outlook.IMsoAxis
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  com.microsoft.outlook.IMsoAxis _Default(
          com.microsoft.outlook.XlAxisType type,
          @Optional @DefaultValue("1") com.microsoft.outlook.XlAxisGroup axisGroup);


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  // Properties:
}
