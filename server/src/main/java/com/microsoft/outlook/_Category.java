package com.microsoft.outlook;

import com4j.*;

@IID("{000630E3-0000-0000-C000-000000000046}")
public interface _Category extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Application
   */

  @DISPID(61440) //= 0xf000. The runtime will prefer the VTID if present
  @VTID(7)
  com.microsoft.outlook._Application application();


  /**
   * <p>
   * Getter method for the COM property "Class"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlObjectClass
   */

  @DISPID(61450) //= 0xf00a. The runtime will prefer the VTID if present
  @VTID(8)
  com.microsoft.outlook.OlObjectClass _class();


  /**
   * <p>
   * Getter method for the COM property "Session"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._NameSpace
   */

  @DISPID(61451) //= 0xf00b. The runtime will prefer the VTID if present
  @VTID(9)
  com.microsoft.outlook._NameSpace session();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61441) //= 0xf001. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8450) //= 0x2102. The runtime will prefer the VTID if present
  @VTID(11)
  String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(8450) //= 0x2102. The runtime will prefer the VTID if present
  @VTID(12)
  void name(
          String name);


  /**
   * <p>
   * Getter method for the COM property "Color"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlCategoryColor
   */

  @DISPID(64419) //= 0xfba3. The runtime will prefer the VTID if present
  @VTID(13)
  com.microsoft.outlook.OlCategoryColor color();


  /**
   * <p>
   * Setter method for the COM property "Color"
   * </p>
   * @param color Mandatory com.microsoft.outlook.OlCategoryColor parameter.
   */

  @DISPID(64419) //= 0xfba3. The runtime will prefer the VTID if present
  @VTID(14)
  void color(
          com.microsoft.outlook.OlCategoryColor color);


  /**
   * <p>
   * Getter method for the COM property "ShortcutKey"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlCategoryShortcutKey
   */

  @DISPID(64420) //= 0xfba4. The runtime will prefer the VTID if present
  @VTID(15)
  com.microsoft.outlook.OlCategoryShortcutKey shortcutKey();


  /**
   * <p>
   * Setter method for the COM property "ShortcutKey"
   * </p>
   * @param shortcutKey Mandatory com.microsoft.outlook.OlCategoryShortcutKey parameter.
   */

  @DISPID(64420) //= 0xfba4. The runtime will prefer the VTID if present
  @VTID(16)
  void shortcutKey(
          com.microsoft.outlook.OlCategoryShortcutKey shortcutKey);


  /**
   * <p>
   * Getter method for the COM property "CategoryID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64464) //= 0xfbd0. The runtime will prefer the VTID if present
  @VTID(17)
  String categoryID();


  /**
   * <p>
   * Getter method for the COM property "CategoryBorderColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64539) //= 0xfc1b. The runtime will prefer the VTID if present
  @VTID(18)
  int categoryBorderColor();


  /**
   * <p>
   * Getter method for the COM property "CategoryGradientTopColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64540) //= 0xfc1c. The runtime will prefer the VTID if present
  @VTID(19)
  int categoryGradientTopColor();


  /**
   * <p>
   * Getter method for the COM property "CategoryGradientBottomColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64541) //= 0xfc1d. The runtime will prefer the VTID if present
  @VTID(20)
  int categoryGradientBottomColor();


  // Properties:
}
