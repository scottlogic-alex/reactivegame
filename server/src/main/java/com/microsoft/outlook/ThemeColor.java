package com.microsoft.outlook;

import com4j.*;

@IID("{000C03A1-0000-0000-C000-000000000046}")
public interface ThemeColor extends com.microsoft.outlook._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "RGB"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  int rgb();


  /**
   * <p>
   * Setter method for the COM property "RGB"
   * </p>
   * @param rgb Mandatory int parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  void rgb(
          int rgb);


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "ThemeColorSchemeIndex"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoThemeColorSchemeIndex
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(12)
  com.microsoft.outlook.MsoThemeColorSchemeIndex themeColorSchemeIndex();


  // Properties:
}
