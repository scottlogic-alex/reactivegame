package com.microsoft.outlook;

import com4j.*;

@IID("{000C03A4-0000-0000-C000-000000000046}")
public interface ThemeFonts extends com.microsoft.outlook._IMsoDispObj,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * @param index Mandatory com.microsoft.outlook.MsoFontLanguageIndex parameter.
   * @return  Returns a value of type com.microsoft.outlook.ThemeFont
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  ThemeFont item(
          com.microsoft.outlook.MsoFontLanguageIndex index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(12)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
