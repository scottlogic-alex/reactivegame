package com.microsoft.outlook;

import com4j.*;

@IID("{000C1720-0000-0000-C000-000000000046}")
public interface IMsoDataLabel extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(8)
  String name();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  Object select();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.IMsoBorder
   */

  @VTID(10)
  IMsoBorder border();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  Object delete();


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.IMsoInterior
   */

  @VTID(12)
  IMsoInterior interior();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ChartFillFormat
   */

  @VTID(13)
  com.microsoft.outlook.ChartFillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(14)
  String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(15)
  void caption(
          String rhs);


  /**
   * <p>
   * Getter method for the COM property "Characters"
   * </p>
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param length Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com.microsoft.outlook.IMsoCharacters
   */

  @VTID(16)
  com.microsoft.outlook.IMsoCharacters characters(
          @Optional @MarshalAs(NativeType.VARIANT) Object start,
          @Optional @MarshalAs(NativeType.VARIANT) Object length);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ChartFont
   */

  @VTID(17)
  ChartFont font();


  /**
   * <p>
   * Getter method for the COM property "HorizontalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  Object horizontalAlignment();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAlignment"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(19)
  void horizontalAlignment(
          @MarshalAs(NativeType.VARIANT) Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(20)
  double left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(21)
  void left(
          double rhs);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  Object orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(23)
  void orientation(
          @MarshalAs(NativeType.VARIANT) Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean shadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(25)
  void shadow(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(26)
  String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(27)
  void text(
          String rhs);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(28)
  double top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(29)
  void top(
          double rhs);


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(30)
  @ReturnValue(type=NativeType.VARIANT)
  Object verticalAlignment();


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(31)
  void verticalAlignment(
          @MarshalAs(NativeType.VARIANT) Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ReadingOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(32)
  int readingOrder();


  /**
   * <p>
   * Setter method for the COM property "ReadingOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(33)
  void readingOrder(
          int rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoScaleFont"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  Object autoScaleFont();


  /**
   * <p>
   * Setter method for the COM property "AutoScaleFont"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(35)
  void autoScaleFont(
          @MarshalAs(NativeType.VARIANT) Object rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(36)
  boolean autoText();


  /**
   * <p>
   * Setter method for the COM property "AutoText"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(37)
  void autoText(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(38)
  String numberFormat();


  /**
   * <p>
   * Setter method for the COM property "NumberFormat"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(39)
  void numberFormat(
          String rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberFormatLinked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(40)
  boolean numberFormatLinked();


  /**
   * <p>
   * Setter method for the COM property "NumberFormatLinked"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(41)
  void numberFormatLinked(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberFormatLocal"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(42)
  @ReturnValue(type=NativeType.VARIANT)
  Object numberFormatLocal();


  /**
   * <p>
   * Setter method for the COM property "NumberFormatLocal"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(43)
  void numberFormatLocal(
          @MarshalAs(NativeType.VARIANT) Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowLegendKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(44)
  boolean showLegendKey();


  /**
   * <p>
   * Setter method for the COM property "ShowLegendKey"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(45)
  void showLegendKey(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(46)
  @ReturnValue(type=NativeType.VARIANT)
  Object type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(47)
  void type(
          @MarshalAs(NativeType.VARIANT) Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlDataLabelPosition
   */

  @VTID(48)
  com.microsoft.outlook.XlDataLabelPosition position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlDataLabelPosition parameter.
   */

  @VTID(49)
  void position(
          com.microsoft.outlook.XlDataLabelPosition rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowSeriesName"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(50)
  boolean showSeriesName();


  /**
   * <p>
   * Setter method for the COM property "ShowSeriesName"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(51)
  void showSeriesName(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowCategoryName"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(52)
  boolean showCategoryName();


  /**
   * <p>
   * Setter method for the COM property "ShowCategoryName"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(53)
  void showCategoryName(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowValue"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(54)
  boolean showValue();


  /**
   * <p>
   * Setter method for the COM property "ShowValue"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(55)
  void showValue(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowPercentage"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(56)
  boolean showPercentage();


  /**
   * <p>
   * Setter method for the COM property "ShowPercentage"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(57)
  void showPercentage(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowBubbleSize"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(58)
  boolean showBubbleSize();


  /**
   * <p>
   * Setter method for the COM property "ShowBubbleSize"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(59)
  void showBubbleSize(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Separator"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(60)
  @ReturnValue(type=NativeType.VARIANT)
  Object separator();


  /**
   * <p>
   * Setter method for the COM property "Separator"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(61)
  void separator(
          @MarshalAs(NativeType.VARIANT) Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.IMsoChartFormat
   */

  @VTID(62)
  com.microsoft.outlook.IMsoChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "_Height"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(63)
  double _Height();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(64)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(65)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "_Width"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(66)
  double _Width();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @VTID(67)
  void formula(
          String pbstr);


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(68)
  String formula();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @VTID(69)
  void formulaR1C1(
          String pbstr);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(70)
  String formulaR1C1();


  /**
   * <p>
   * Setter method for the COM property "FormulaLocal"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @VTID(71)
  void formulaLocal(
          String pbstr);


  /**
   * <p>
   * Getter method for the COM property "FormulaLocal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(72)
  String formulaLocal();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1Local"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @VTID(73)
  void formulaR1C1Local(
          String pbstr);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1Local"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(74)
  String formulaR1C1Local();


  /**
   * <p>
   * Getter method for the COM property "ShowRange"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(75)
  boolean showRange();


  /**
   * <p>
   * Setter method for the COM property "ShowRange"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(76)
  void showRange(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(77)
  double height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param pHeight Mandatory double parameter.
   */

  @VTID(78)
  void height(
          double pHeight);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(79)
  double width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param pWidth Mandatory double parameter.
   */

  @VTID(80)
  void width(
          double pWidth);


  /**
   * @param bstrId Mandatory java.lang.String parameter.
   * @param value Mandatory java.lang.Object parameter.
   */

  @VTID(81)
  void setProperty(
          String bstrId,
          @MarshalAs(NativeType.VARIANT) Object value);


  /**
   * @param bstrId Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(82)
  @ReturnValue(type=NativeType.VARIANT)
  Object getProperty(
          String bstrId);


  // Properties:
}
