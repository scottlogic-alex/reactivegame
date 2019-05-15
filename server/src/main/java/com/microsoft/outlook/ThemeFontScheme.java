package com.microsoft.outlook;

import com4j.*;

@IID("{000C03A5-0000-0000-C000-000000000046}")
public interface ThemeFontScheme extends _IMsoDispObj {
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
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  void load(
          String fileName);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void save(
          String fileName);


  /**
   * <p>
   * Getter method for the COM property "MinorFont"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ThemeFonts
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  ThemeFonts minorFont();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={ThemeFonts.class})
  ThemeFont minorFont(
          com.microsoft.outlook.MsoFontLanguageIndex index);

  /**
   * <p>
   * Getter method for the COM property "MajorFont"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ThemeFonts
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(13)
  ThemeFonts majorFont();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={ThemeFonts.class})
  ThemeFont majorFont(
          com.microsoft.outlook.MsoFontLanguageIndex index);

  // Properties:
}
