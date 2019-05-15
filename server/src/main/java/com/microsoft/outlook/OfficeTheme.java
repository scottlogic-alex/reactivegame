package com.microsoft.outlook;

import com4j.*;

@IID("{000C03A0-0000-0000-C000-000000000046}")
public interface OfficeTheme extends com.microsoft.outlook._IMsoDispObj {
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
   * Getter method for the COM property "ThemeColorScheme"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ThemeColorScheme
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  com.microsoft.outlook.ThemeColorScheme themeColorScheme();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.ThemeColorScheme.class})
  ThemeColor themeColorScheme(
          com.microsoft.outlook.MsoThemeColorSchemeIndex index);

  /**
   * <p>
   * Getter method for the COM property "ThemeFontScheme"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ThemeFontScheme
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  com.microsoft.outlook.ThemeFontScheme themeFontScheme();


  /**
   * <p>
   * Getter method for the COM property "ThemeEffectScheme"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ThemeEffectScheme
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  com.microsoft.outlook.ThemeEffectScheme themeEffectScheme();


  // Properties:
}
