package com.microsoft.outlook;

import com4j.*;

@IID("{0006309D-0000-0000-C000-000000000046}")
public interface _ViewFont extends Com4jObject {
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
   * Getter method for the COM property "Bold"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64385) //= 0xfb81. The runtime will prefer the VTID if present
  @VTID(11)
  boolean bold();


  /**
   * <p>
   * Setter method for the COM property "Bold"
   * </p>
   * @param bold Mandatory boolean parameter.
   */

  @DISPID(64385) //= 0xfb81. The runtime will prefer the VTID if present
  @VTID(12)
  void bold(
          boolean bold);


  /**
   * <p>
   * Getter method for the COM property "Italic"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64387) //= 0xfb83. The runtime will prefer the VTID if present
  @VTID(13)
  boolean italic();


  /**
   * <p>
   * Setter method for the COM property "Italic"
   * </p>
   * @param italic Mandatory boolean parameter.
   */

  @DISPID(64387) //= 0xfb83. The runtime will prefer the VTID if present
  @VTID(14)
  void italic(
          boolean italic);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64388) //= 0xfb84. The runtime will prefer the VTID if present
  @VTID(15)
  String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(64388) //= 0xfb84. The runtime will prefer the VTID if present
  @VTID(16)
  void name(
          String name);


  /**
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64389) //= 0xfb85. The runtime will prefer the VTID if present
  @VTID(17)
  int size();


  /**
   * <p>
   * Setter method for the COM property "Size"
   * </p>
   * @param size Mandatory int parameter.
   */

  @DISPID(64389) //= 0xfb85. The runtime will prefer the VTID if present
  @VTID(18)
  void size(
          int size);


  /**
   * <p>
   * Getter method for the COM property "Strikethrough"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64390) //= 0xfb86. The runtime will prefer the VTID if present
  @VTID(19)
  boolean strikethrough();


  /**
   * <p>
   * Setter method for the COM property "Strikethrough"
   * </p>
   * @param strikethrough Mandatory boolean parameter.
   */

  @DISPID(64390) //= 0xfb86. The runtime will prefer the VTID if present
  @VTID(20)
  void strikethrough(
          boolean strikethrough);


  /**
   * <p>
   * Getter method for the COM property "Underline"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64391) //= 0xfb87. The runtime will prefer the VTID if present
  @VTID(21)
  boolean underline();


  /**
   * <p>
   * Setter method for the COM property "Underline"
   * </p>
   * @param underline Mandatory boolean parameter.
   */

  @DISPID(64391) //= 0xfb87. The runtime will prefer the VTID if present
  @VTID(22)
  void underline(
          boolean underline);


  /**
   * <p>
   * Getter method for the COM property "Color"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlColor
   */

  @DISPID(64395) //= 0xfb8b. The runtime will prefer the VTID if present
  @VTID(23)
  OlColor color();


  /**
   * <p>
   * Setter method for the COM property "Color"
   * </p>
   * @param color Mandatory com.microsoft.outlook.OlColor parameter.
   */

  @DISPID(64395) //= 0xfb8b. The runtime will prefer the VTID if present
  @VTID(24)
  void color(
          OlColor color);


  /**
   * <p>
   * Getter method for the COM property "ExtendedColor"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlCategoryColor
   */

  @DISPID(64638) //= 0xfc7e. The runtime will prefer the VTID if present
  @VTID(25)
  com.microsoft.outlook.OlCategoryColor extendedColor();


  /**
   * <p>
   * Setter method for the COM property "ExtendedColor"
   * </p>
   * @param extendedColor Mandatory com.microsoft.outlook.OlCategoryColor parameter.
   */

  @DISPID(64638) //= 0xfc7e. The runtime will prefer the VTID if present
  @VTID(26)
  void extendedColor(
          com.microsoft.outlook.OlCategoryColor extendedColor);


  // Properties:
}
