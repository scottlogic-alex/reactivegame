package com.microsoft.outlook;

import com4j.*;

@IID("{000C031D-0000-0000-C000-000000000046}")
public interface ShapeRange extends com.microsoft.outlook._IMsoDispObj,Iterable<Com4jObject> {
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
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  Shape item(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(12)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param alignCmd Mandatory com.microsoft.outlook.MsoAlignCmd parameter.
   * @param relativeTo Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(13)
  void align(
          com.microsoft.outlook.MsoAlignCmd alignCmd,
          com.microsoft.outlook.MsoTriState relativeTo);


  /**
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(14)
  void apply();


  /**
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(15)
  void delete();


  /**
   * @param distributeCmd Mandatory com.microsoft.outlook.MsoDistributeCmd parameter.
   * @param relativeTo Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(16)
  void distribute(
          com.microsoft.outlook.MsoDistributeCmd distributeCmd,
          com.microsoft.outlook.MsoTriState relativeTo);


  /**
   * @return  Returns a value of type com.microsoft.outlook.ShapeRange
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(17)
  ShapeRange duplicate();


  @VTID(17)
  @ReturnValue(defaultPropertyThrough={ShapeRange.class})
  Shape duplicate(
          @MarshalAs(NativeType.VARIANT) Object index);

  /**
   * @param flipCmd Mandatory com.microsoft.outlook.MsoFlipCmd parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(18)
  void flip(
          MsoFlipCmd flipCmd);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(19)
  void incrementLeft(
          float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(20)
  void incrementRotation(
          float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(21)
  void incrementTop(
          float increment);


  /**
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(22)
  Shape group();


  /**
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(23)
  void pickUp();


  /**
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(24)
  Shape regroup();


  /**
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(25)
  void rerouteConnections();


  /**
   * @param factor Mandatory float parameter.
   * @param relativeToOriginalSize Mandatory com.microsoft.outlook.MsoTriState parameter.
   * @param fScale Optional parameter. Default value is 0
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(26)
  void scaleHeight(
          float factor,
          com.microsoft.outlook.MsoTriState relativeToOriginalSize,
          @Optional @DefaultValue("0") com.microsoft.outlook.MsoScaleFrom fScale);


  /**
   * @param factor Mandatory float parameter.
   * @param relativeToOriginalSize Mandatory com.microsoft.outlook.MsoTriState parameter.
   * @param fScale Optional parameter. Default value is 0
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(27)
  void scaleWidth(
          float factor,
          com.microsoft.outlook.MsoTriState relativeToOriginalSize,
          @Optional @DefaultValue("0") com.microsoft.outlook.MsoScaleFrom fScale);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(28)
  void select(
          @Optional @MarshalAs(NativeType.VARIANT) Object replace);


  /**
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(29)
  void setShapesDefaultProperties();


  /**
   * @return  Returns a value of type com.microsoft.outlook.ShapeRange
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(30)
  ShapeRange ungroup();


  @VTID(30)
  @ReturnValue(defaultPropertyThrough={ShapeRange.class})
  Shape ungroup(
          @MarshalAs(NativeType.VARIANT) Object index);

  /**
   * @param zOrderCmd Mandatory com.microsoft.outlook.MsoZOrderCmd parameter.
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(31)
  void zOrder(
          com.microsoft.outlook.MsoZOrderCmd zOrderCmd);


  /**
   * <p>
   * Getter method for the COM property "Adjustments"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Adjustments
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(32)
  com.microsoft.outlook.Adjustments adjustments();


  @VTID(32)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.Adjustments.class})
  float adjustments(
          int index);

  /**
   * <p>
   * Getter method for the COM property "AutoShapeType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoAutoShapeType
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(33)
  com.microsoft.outlook.MsoAutoShapeType autoShapeType();


  /**
   * <p>
   * Setter method for the COM property "AutoShapeType"
   * </p>
   * @param autoShapeType Mandatory com.microsoft.outlook.MsoAutoShapeType parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(34)
  void autoShapeType(
          com.microsoft.outlook.MsoAutoShapeType autoShapeType);


  /**
   * <p>
   * Getter method for the COM property "BlackWhiteMode"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoBlackWhiteMode
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(35)
  com.microsoft.outlook.MsoBlackWhiteMode blackWhiteMode();


  /**
   * <p>
   * Setter method for the COM property "BlackWhiteMode"
   * </p>
   * @param blackWhiteMode Mandatory com.microsoft.outlook.MsoBlackWhiteMode parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(36)
  void blackWhiteMode(
          com.microsoft.outlook.MsoBlackWhiteMode blackWhiteMode);


  /**
   * <p>
   * Getter method for the COM property "Callout"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.CalloutFormat
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(37)
  com.microsoft.outlook.CalloutFormat callout();


  /**
   * <p>
   * Getter method for the COM property "ConnectionSiteCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(38)
  int connectionSiteCount();


  /**
   * <p>
   * Getter method for the COM property "Connector"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(39)
  com.microsoft.outlook.MsoTriState connector();


  /**
   * <p>
   * Getter method for the COM property "ConnectorFormat"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ConnectorFormat
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(40)
  com.microsoft.outlook.ConnectorFormat connectorFormat();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.FillFormat
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(41)
  FillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "GroupItems"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.GroupShapes
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(42)
  com.microsoft.outlook.GroupShapes groupItems();


  @VTID(42)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.GroupShapes.class})
  Shape groupItems(
          @MarshalAs(NativeType.VARIANT) Object index);

  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(43)
  float height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param height Mandatory float parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(44)
  void height(
          float height);


  /**
   * <p>
   * Getter method for the COM property "HorizontalFlip"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(45)
  com.microsoft.outlook.MsoTriState horizontalFlip();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(46)
  float left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param left Mandatory float parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(47)
  void left(
          float left);


  /**
   * <p>
   * Getter method for the COM property "Line"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.LineFormat
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(48)
  LineFormat line();


  /**
   * <p>
   * Getter method for the COM property "LockAspectRatio"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(49)
  com.microsoft.outlook.MsoTriState lockAspectRatio();


  /**
   * <p>
   * Setter method for the COM property "LockAspectRatio"
   * </p>
   * @param lockAspectRatio Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(50)
  void lockAspectRatio(
          com.microsoft.outlook.MsoTriState lockAspectRatio);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(51)
  String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(52)
  void name(
          String name);


  /**
   * <p>
   * Getter method for the COM property "Nodes"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ShapeNodes
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(53)
  ShapeNodes nodes();


  @VTID(53)
  @ReturnValue(defaultPropertyThrough={ShapeNodes.class})
  ShapeNode nodes(
          @MarshalAs(NativeType.VARIANT) Object index);

  /**
   * <p>
   * Getter method for the COM property "Rotation"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(54)
  float rotation();


  /**
   * <p>
   * Setter method for the COM property "Rotation"
   * </p>
   * @param rotation Mandatory float parameter.
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(55)
  void rotation(
          float rotation);


  /**
   * <p>
   * Getter method for the COM property "PictureFormat"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.PictureFormat
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(56)
  com.microsoft.outlook.PictureFormat pictureFormat();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ShadowFormat
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(57)
  com.microsoft.outlook.ShadowFormat shadow();


  /**
   * <p>
   * Getter method for the COM property "TextEffect"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.TextEffectFormat
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(58)
  com.microsoft.outlook.TextEffectFormat textEffect();


  /**
   * <p>
   * Getter method for the COM property "TextFrame"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.TextFrame
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(59)
  TextFrame textFrame();


  /**
   * <p>
   * Getter method for the COM property "ThreeD"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ThreeDFormat
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(60)
  com.microsoft.outlook.ThreeDFormat threeD();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(61)
  float top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param top Mandatory float parameter.
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(62)
  void top(
          float top);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoShapeType
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(63)
  com.microsoft.outlook.MsoShapeType type();


  /**
   * <p>
   * Getter method for the COM property "VerticalFlip"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(64)
  com.microsoft.outlook.MsoTriState verticalFlip();


  /**
   * <p>
   * Getter method for the COM property "Vertices"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(65)
  @ReturnValue(type=NativeType.VARIANT)
  Object vertices();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(66)
  com.microsoft.outlook.MsoTriState visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param visible Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(67)
  void visible(
          com.microsoft.outlook.MsoTriState visible);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(68)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param width Mandatory float parameter.
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(69)
  void width(
          float width);


  /**
   * <p>
   * Getter method for the COM property "ZOrderPosition"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(70)
  int zOrderPosition();


  /**
   * <p>
   * Getter method for the COM property "Script"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Script
   */

  @DISPID(130) //= 0x82. The runtime will prefer the VTID if present
  @VTID(71)
  Script script();


  /**
   * <p>
   * Getter method for the COM property "AlternativeText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(72)
  String alternativeText();


  /**
   * <p>
   * Setter method for the COM property "AlternativeText"
   * </p>
   * @param alternativeText Mandatory java.lang.String parameter.
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(73)
  void alternativeText(
          String alternativeText);


  /**
   * <p>
   * Getter method for the COM property "HasDiagram"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(74)
  com.microsoft.outlook.MsoTriState hasDiagram();


  /**
   * <p>
   * Getter method for the COM property "Diagram"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.IMsoDiagram
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(75)
  com.microsoft.outlook.IMsoDiagram diagram();


  /**
   * <p>
   * Getter method for the COM property "HasDiagramNode"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(134) //= 0x86. The runtime will prefer the VTID if present
  @VTID(76)
  com.microsoft.outlook.MsoTriState hasDiagramNode();


  /**
   * <p>
   * Getter method for the COM property "DiagramNode"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.DiagramNode
   */

  @DISPID(135) //= 0x87. The runtime will prefer the VTID if present
  @VTID(77)
  com.microsoft.outlook.DiagramNode diagramNode();


  /**
   * <p>
   * Getter method for the COM property "Child"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(136) //= 0x88. The runtime will prefer the VTID if present
  @VTID(78)
  com.microsoft.outlook.MsoTriState child();


  /**
   * <p>
   * Getter method for the COM property "ParentGroup"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(137) //= 0x89. The runtime will prefer the VTID if present
  @VTID(79)
  Shape parentGroup();


  /**
   * <p>
   * Getter method for the COM property "CanvasItems"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.CanvasShapes
   */

  @DISPID(138) //= 0x8a. The runtime will prefer the VTID if present
  @VTID(80)
  com.microsoft.outlook.CanvasShapes canvasItems();


  @VTID(80)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.CanvasShapes.class})
  Shape canvasItems(
          @MarshalAs(NativeType.VARIANT) Object index);

  /**
   * <p>
   * Getter method for the COM property "Id"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(81)
  int id();


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(140) //= 0x8c. The runtime will prefer the VTID if present
  @VTID(82)
  void canvasCropLeft(
          float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(141) //= 0x8d. The runtime will prefer the VTID if present
  @VTID(83)
  void canvasCropTop(
          float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(142) //= 0x8e. The runtime will prefer the VTID if present
  @VTID(84)
  void canvasCropRight(
          float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(143) //= 0x8f. The runtime will prefer the VTID if present
  @VTID(85)
  void canvasCropBottom(
          float increment);


  /**
   * <p>
   * Setter method for the COM property "RTF"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(144) //= 0x90. The runtime will prefer the VTID if present
  @VTID(86)
  void rtf(
          String rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFrame2"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.TextFrame2
   */

  @DISPID(145) //= 0x91. The runtime will prefer the VTID if present
  @VTID(87)
  com.microsoft.outlook.TextFrame2 textFrame2();


  /**
   */

  @DISPID(146) //= 0x92. The runtime will prefer the VTID if present
  @VTID(88)
  void cut();


  /**
   */

  @DISPID(147) //= 0x93. The runtime will prefer the VTID if present
  @VTID(89)
  void copy();


  /**
   * <p>
   * Getter method for the COM property "HasChart"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(90)
  com.microsoft.outlook.MsoTriState hasChart();


  /**
   * <p>
   * Getter method for the COM property "Chart"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.IMsoChart
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(91)
  IMsoChart chart();


  /**
   * <p>
   * Getter method for the COM property "ShapeStyle"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoShapeStyleIndex
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(92)
  com.microsoft.outlook.MsoShapeStyleIndex shapeStyle();


  /**
   * <p>
   * Setter method for the COM property "ShapeStyle"
   * </p>
   * @param shapeStyle Mandatory com.microsoft.outlook.MsoShapeStyleIndex parameter.
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(93)
  void shapeStyle(
          com.microsoft.outlook.MsoShapeStyleIndex shapeStyle);


  /**
   * <p>
   * Getter method for the COM property "BackgroundStyle"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoBackgroundStyleIndex
   */

  @DISPID(151) //= 0x97. The runtime will prefer the VTID if present
  @VTID(94)
  com.microsoft.outlook.MsoBackgroundStyleIndex backgroundStyle();


  /**
   * <p>
   * Setter method for the COM property "BackgroundStyle"
   * </p>
   * @param backgroundStyle Mandatory com.microsoft.outlook.MsoBackgroundStyleIndex parameter.
   */

  @DISPID(151) //= 0x97. The runtime will prefer the VTID if present
  @VTID(95)
  void backgroundStyle(
          com.microsoft.outlook.MsoBackgroundStyleIndex backgroundStyle);


  /**
   * <p>
   * Getter method for the COM property "SoftEdge"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.SoftEdgeFormat
   */

  @DISPID(152) //= 0x98. The runtime will prefer the VTID if present
  @VTID(96)
  com.microsoft.outlook.SoftEdgeFormat softEdge();


  /**
   * <p>
   * Getter method for the COM property "Glow"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.GlowFormat
   */

  @DISPID(153) //= 0x99. The runtime will prefer the VTID if present
  @VTID(97)
  GlowFormat glow();


  /**
   * <p>
   * Getter method for the COM property "Reflection"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ReflectionFormat
   */

  @DISPID(154) //= 0x9a. The runtime will prefer the VTID if present
  @VTID(98)
  com.microsoft.outlook.ReflectionFormat reflection();


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(155) //= 0x9b. The runtime will prefer the VTID if present
  @VTID(99)
  String title();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param title Mandatory java.lang.String parameter.
   */

  @DISPID(155) //= 0x9b. The runtime will prefer the VTID if present
  @VTID(100)
  void title(
          String title);


  /**
   * @param mergeCmd Mandatory com.microsoft.outlook.MsoMergeCmd parameter.
   * @param primaryShape Optional parameter. Default value is 0
   */

  @DISPID(156) //= 0x9c. The runtime will prefer the VTID if present
  @VTID(101)
  void mergeShapes(
          com.microsoft.outlook.MsoMergeCmd mergeCmd,
          @Optional @DefaultValue("0") Shape primaryShape);


  /**
   * <p>
   * Getter method for the COM property "GraphicStyle"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoGraphicStyleIndex
   */

  @DISPID(157) //= 0x9d. The runtime will prefer the VTID if present
  @VTID(102)
  com.microsoft.outlook.MsoGraphicStyleIndex graphicStyle();


  /**
   * <p>
   * Setter method for the COM property "GraphicStyle"
   * </p>
   * @param graphicStyle Mandatory com.microsoft.outlook.MsoGraphicStyleIndex parameter.
   */

  @DISPID(157) //= 0x9d. The runtime will prefer the VTID if present
  @VTID(103)
  void graphicStyle(
          com.microsoft.outlook.MsoGraphicStyleIndex graphicStyle);


  /**
   * @param pictureType Mandatory com.microsoft.outlook.MsoPictureType parameter.
   * @param fileName Mandatory java.lang.String parameter.
   * @param fSaveShapesIndividually Mandatory boolean parameter.
   */

  @DISPID(158) //= 0x9e. The runtime will prefer the VTID if present
  @VTID(104)
  void saveAsPicture(
          com.microsoft.outlook.MsoPictureType pictureType,
          String fileName,
          boolean fSaveShapesIndividually);


  /**
   * <p>
   * Getter method for the COM property "Model3D"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Model3DFormat
   */

  @DISPID(159) //= 0x9f. The runtime will prefer the VTID if present
  @VTID(105)
  com.microsoft.outlook.Model3DFormat model3D();


  /**
   * <p>
   * Getter method for the COM property "Decorative"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(160) //= 0xa0. The runtime will prefer the VTID if present
  @VTID(106)
  com.microsoft.outlook.MsoTriState decorative();


  /**
   * <p>
   * Setter method for the COM property "Decorative"
   * </p>
   * @param fDecorative Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(160) //= 0xa0. The runtime will prefer the VTID if present
  @VTID(107)
  void decorative(
          com.microsoft.outlook.MsoTriState fDecorative);


  // Properties:
}
