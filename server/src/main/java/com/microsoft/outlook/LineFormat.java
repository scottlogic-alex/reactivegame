package com.microsoft.outlook;

import com4j.*;

@IID("{000C0317-0000-0000-C000-000000000046}")
public interface LineFormat extends com.microsoft.outlook._IMsoDispObj {
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
   * Getter method for the COM property "BackColor"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ColorFormat
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(10)
  com.microsoft.outlook.ColorFormat backColor();


  /**
   * <p>
   * Setter method for the COM property "BackColor"
   * </p>
   * @param backColor Mandatory com.microsoft.outlook.ColorFormat parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  void backColor(
          com.microsoft.outlook.ColorFormat backColor);


  /**
   * <p>
   * Getter method for the COM property "BeginArrowheadLength"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoArrowheadLength
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(12)
  com.microsoft.outlook.MsoArrowheadLength beginArrowheadLength();


  /**
   * <p>
   * Setter method for the COM property "BeginArrowheadLength"
   * </p>
   * @param beginArrowheadLength Mandatory com.microsoft.outlook.MsoArrowheadLength parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  void beginArrowheadLength(
          com.microsoft.outlook.MsoArrowheadLength beginArrowheadLength);


  /**
   * <p>
   * Getter method for the COM property "BeginArrowheadStyle"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoArrowheadStyle
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  com.microsoft.outlook.MsoArrowheadStyle beginArrowheadStyle();


  /**
   * <p>
   * Setter method for the COM property "BeginArrowheadStyle"
   * </p>
   * @param beginArrowheadStyle Mandatory com.microsoft.outlook.MsoArrowheadStyle parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  void beginArrowheadStyle(
          com.microsoft.outlook.MsoArrowheadStyle beginArrowheadStyle);


  /**
   * <p>
   * Getter method for the COM property "BeginArrowheadWidth"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoArrowheadWidth
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  com.microsoft.outlook.MsoArrowheadWidth beginArrowheadWidth();


  /**
   * <p>
   * Setter method for the COM property "BeginArrowheadWidth"
   * </p>
   * @param beginArrowheadWidth Mandatory com.microsoft.outlook.MsoArrowheadWidth parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  void beginArrowheadWidth(
          com.microsoft.outlook.MsoArrowheadWidth beginArrowheadWidth);


  /**
   * <p>
   * Getter method for the COM property "DashStyle"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoLineDashStyle
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(18)
  com.microsoft.outlook.MsoLineDashStyle dashStyle();


  /**
   * <p>
   * Setter method for the COM property "DashStyle"
   * </p>
   * @param dashStyle Mandatory com.microsoft.outlook.MsoLineDashStyle parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(19)
  void dashStyle(
          com.microsoft.outlook.MsoLineDashStyle dashStyle);


  /**
   * <p>
   * Getter method for the COM property "EndArrowheadLength"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoArrowheadLength
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(20)
  com.microsoft.outlook.MsoArrowheadLength endArrowheadLength();


  /**
   * <p>
   * Setter method for the COM property "EndArrowheadLength"
   * </p>
   * @param endArrowheadLength Mandatory com.microsoft.outlook.MsoArrowheadLength parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(21)
  void endArrowheadLength(
          com.microsoft.outlook.MsoArrowheadLength endArrowheadLength);


  /**
   * <p>
   * Getter method for the COM property "EndArrowheadStyle"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoArrowheadStyle
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(22)
  com.microsoft.outlook.MsoArrowheadStyle endArrowheadStyle();


  /**
   * <p>
   * Setter method for the COM property "EndArrowheadStyle"
   * </p>
   * @param endArrowheadStyle Mandatory com.microsoft.outlook.MsoArrowheadStyle parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(23)
  void endArrowheadStyle(
          com.microsoft.outlook.MsoArrowheadStyle endArrowheadStyle);


  /**
   * <p>
   * Getter method for the COM property "EndArrowheadWidth"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoArrowheadWidth
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(24)
  com.microsoft.outlook.MsoArrowheadWidth endArrowheadWidth();


  /**
   * <p>
   * Setter method for the COM property "EndArrowheadWidth"
   * </p>
   * @param endArrowheadWidth Mandatory com.microsoft.outlook.MsoArrowheadWidth parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(25)
  void endArrowheadWidth(
          com.microsoft.outlook.MsoArrowheadWidth endArrowheadWidth);


  /**
   * <p>
   * Getter method for the COM property "ForeColor"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ColorFormat
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(26)
  com.microsoft.outlook.ColorFormat foreColor();


  /**
   * <p>
   * Setter method for the COM property "ForeColor"
   * </p>
   * @param foreColor Mandatory com.microsoft.outlook.ColorFormat parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(27)
  void foreColor(
          com.microsoft.outlook.ColorFormat foreColor);


  /**
   * <p>
   * Getter method for the COM property "Pattern"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoPatternType
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(28)
  com.microsoft.outlook.MsoPatternType pattern();


  /**
   * <p>
   * Setter method for the COM property "Pattern"
   * </p>
   * @param pattern Mandatory com.microsoft.outlook.MsoPatternType parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(29)
  void pattern(
          com.microsoft.outlook.MsoPatternType pattern);


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoLineStyle
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(30)
  com.microsoft.outlook.MsoLineStyle style();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param style Mandatory com.microsoft.outlook.MsoLineStyle parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(31)
  void style(
          com.microsoft.outlook.MsoLineStyle style);


  /**
   * <p>
   * Getter method for the COM property "Transparency"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(32)
  float transparency();


  /**
   * <p>
   * Setter method for the COM property "Transparency"
   * </p>
   * @param transparency Mandatory float parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(33)
  void transparency(
          float transparency);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(34)
  com.microsoft.outlook.MsoTriState visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param visible Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(35)
  void visible(
          com.microsoft.outlook.MsoTriState visible);


  /**
   * <p>
   * Getter method for the COM property "Weight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(36)
  float weight();


  /**
   * <p>
   * Setter method for the COM property "Weight"
   * </p>
   * @param weight Mandatory float parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(37)
  void weight(
          float weight);


  /**
   * <p>
   * Getter method for the COM property "InsetPen"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(38)
  com.microsoft.outlook.MsoTriState insetPen();


  /**
   * <p>
   * Setter method for the COM property "InsetPen"
   * </p>
   * @param insetPen Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(39)
  void insetPen(
          com.microsoft.outlook.MsoTriState insetPen);


  // Properties:
}
