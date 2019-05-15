package com.microsoft.outlook;

import com4j.*;

@IID("{000C0398-0000-0000-C000-000000000046}")
public interface TextFrame2 extends com.microsoft.outlook._IMsoDispObj {
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
   * Getter method for the COM property "MarginBottom"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(10)
  float marginBottom();


  /**
   * <p>
   * Setter method for the COM property "MarginBottom"
   * </p>
   * @param marginBottom Mandatory float parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  void marginBottom(
          float marginBottom);


  /**
   * <p>
   * Getter method for the COM property "MarginLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(12)
  float marginLeft();


  /**
   * <p>
   * Setter method for the COM property "MarginLeft"
   * </p>
   * @param marginLeft Mandatory float parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  void marginLeft(
          float marginLeft);


  /**
   * <p>
   * Getter method for the COM property "MarginRight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  float marginRight();


  /**
   * <p>
   * Setter method for the COM property "MarginRight"
   * </p>
   * @param marginRight Mandatory float parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  void marginRight(
          float marginRight);


  /**
   * <p>
   * Getter method for the COM property "MarginTop"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  float marginTop();


  /**
   * <p>
   * Setter method for the COM property "MarginTop"
   * </p>
   * @param marginTop Mandatory float parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  void marginTop(
          float marginTop);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTextOrientation
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(18)
  com.microsoft.outlook.MsoTextOrientation orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param orientation Mandatory com.microsoft.outlook.MsoTextOrientation parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(19)
  void orientation(
          com.microsoft.outlook.MsoTextOrientation orientation);


  /**
   * <p>
   * Getter method for the COM property "HorizontalAnchor"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoHorizontalAnchor
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(20)
  com.microsoft.outlook.MsoHorizontalAnchor horizontalAnchor();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAnchor"
   * </p>
   * @param horizontalAnchor Mandatory com.microsoft.outlook.MsoHorizontalAnchor parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(21)
  void horizontalAnchor(
          com.microsoft.outlook.MsoHorizontalAnchor horizontalAnchor);


  /**
   * <p>
   * Getter method for the COM property "VerticalAnchor"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoVerticalAnchor
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(22)
  com.microsoft.outlook.MsoVerticalAnchor verticalAnchor();


  /**
   * <p>
   * Setter method for the COM property "VerticalAnchor"
   * </p>
   * @param verticalAnchor Mandatory com.microsoft.outlook.MsoVerticalAnchor parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(23)
  void verticalAnchor(
          com.microsoft.outlook.MsoVerticalAnchor verticalAnchor);


  /**
   * <p>
   * Getter method for the COM property "PathFormat"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoPathFormat
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(24)
  com.microsoft.outlook.MsoPathFormat pathFormat();


  /**
   * <p>
   * Setter method for the COM property "PathFormat"
   * </p>
   * @param pathFormat Mandatory com.microsoft.outlook.MsoPathFormat parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(25)
  void pathFormat(
          com.microsoft.outlook.MsoPathFormat pathFormat);


  /**
   * <p>
   * Getter method for the COM property "WarpFormat"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoWarpFormat
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(26)
  com.microsoft.outlook.MsoWarpFormat warpFormat();


  /**
   * <p>
   * Setter method for the COM property "WarpFormat"
   * </p>
   * @param warpFormat Mandatory com.microsoft.outlook.MsoWarpFormat parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(27)
  void warpFormat(
          com.microsoft.outlook.MsoWarpFormat warpFormat);


  /**
   * <p>
   * Getter method for the COM property "WordArtformat"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoPresetTextEffect
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(28)
  com.microsoft.outlook.MsoPresetTextEffect wordArtformat();


  /**
   * <p>
   * Setter method for the COM property "WordArtformat"
   * </p>
   * @param wordArtformat Mandatory com.microsoft.outlook.MsoPresetTextEffect parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(29)
  void wordArtformat(
          com.microsoft.outlook.MsoPresetTextEffect wordArtformat);


  /**
   * <p>
   * Getter method for the COM property "WordWrap"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(30)
  com.microsoft.outlook.MsoTriState wordWrap();


  /**
   * <p>
   * Setter method for the COM property "WordWrap"
   * </p>
   * @param wordWrap Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(31)
  void wordWrap(
          com.microsoft.outlook.MsoTriState wordWrap);


  /**
   * <p>
   * Getter method for the COM property "AutoSize"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoAutoSize
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(32)
  com.microsoft.outlook.MsoAutoSize autoSize();


  /**
   * <p>
   * Setter method for the COM property "AutoSize"
   * </p>
   * @param autoSize Mandatory com.microsoft.outlook.MsoAutoSize parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(33)
  void autoSize(
          com.microsoft.outlook.MsoAutoSize autoSize);


  /**
   * <p>
   * Getter method for the COM property "ThreeD"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ThreeDFormat
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(34)
  com.microsoft.outlook.ThreeDFormat threeD();


  /**
   * <p>
   * Getter method for the COM property "HasText"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(35)
  com.microsoft.outlook.MsoTriState hasText();


  /**
   * <p>
   * Getter method for the COM property "TextRange"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.TextRange2
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(36)
  com.microsoft.outlook.TextRange2 textRange();


  /**
   * <p>
   * Getter method for the COM property "Column"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.TextColumn2
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(37)
  com.microsoft.outlook.TextColumn2 column();


  /**
   * <p>
   * Getter method for the COM property "Ruler"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Ruler2
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(38)
  Ruler2 ruler();


  /**
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(39)
  void deleteText();


  /**
   * <p>
   * Getter method for the COM property "NoTextRotation"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(40)
  com.microsoft.outlook.MsoTriState noTextRotation();


  /**
   * <p>
   * Setter method for the COM property "NoTextRotation"
   * </p>
   * @param noTextRotation Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(41)
  void noTextRotation(
          com.microsoft.outlook.MsoTriState noTextRotation);


  // Properties:
}
