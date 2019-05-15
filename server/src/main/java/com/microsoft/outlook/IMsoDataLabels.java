package com.microsoft.outlook;

import com4j.*;

@IID("{000C171F-0000-0000-C000-000000000046}")
public interface IMsoDataLabels extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Characters"
   * </p>
   * @param start Optional parameter. Default value is com4j.Variant.getMissing()
   * @param length Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com.microsoft.outlook.IMsoCharacters
   */

  @VTID(14)
  IMsoCharacters characters(
          @Optional @MarshalAs(NativeType.VARIANT) Object start,
          @Optional @MarshalAs(NativeType.VARIANT) Object length);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ChartFont
   */

  @VTID(15)
  ChartFont font();


  /**
   * <p>
   * Getter method for the COM property "HorizontalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  Object horizontalAlignment();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAlignment"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(17)
  void horizontalAlignment(
          @MarshalAs(NativeType.VARIANT) Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  Object orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(19)
  void orientation(
          @MarshalAs(NativeType.VARIANT) Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(20)
  boolean shadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(21)
  void shadow(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  Object verticalAlignment();


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(23)
  void verticalAlignment(
          @MarshalAs(NativeType.VARIANT) Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ReadingOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(24)
  int readingOrder();


  /**
   * <p>
   * Setter method for the COM property "ReadingOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(25)
  void readingOrder(
          int rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoScaleFont"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(26)
  @ReturnValue(type=NativeType.VARIANT)
  Object autoScaleFont();


  /**
   * <p>
   * Setter method for the COM property "AutoScaleFont"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(27)
  void autoScaleFont(
          @MarshalAs(NativeType.VARIANT) Object rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(28)
  boolean autoText();


  /**
   * <p>
   * Setter method for the COM property "AutoText"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(29)
  void autoText(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(30)
  String numberFormat();


  /**
   * <p>
   * Setter method for the COM property "NumberFormat"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(31)
  void numberFormat(
          String rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberFormatLinked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(32)
  boolean numberFormatLinked();


  /**
   * <p>
   * Setter method for the COM property "NumberFormatLinked"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(33)
  void numberFormatLinked(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberFormatLocal"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  Object numberFormatLocal();


  /**
   * <p>
   * Setter method for the COM property "NumberFormatLocal"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(35)
  void numberFormatLocal(
          @MarshalAs(NativeType.VARIANT) Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowLegendKey"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(36)
  boolean showLegendKey();


  /**
   * <p>
   * Setter method for the COM property "ShowLegendKey"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(37)
  void showLegendKey(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(38)
  @ReturnValue(type=NativeType.VARIANT)
  Object type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(39)
  void type(
          @MarshalAs(NativeType.VARIANT) Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlDataLabelPosition
   */

  @VTID(40)
  com.microsoft.outlook.XlDataLabelPosition position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlDataLabelPosition parameter.
   */

  @VTID(41)
  void position(
          com.microsoft.outlook.XlDataLabelPosition rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowSeriesName"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(42)
  boolean showSeriesName();


  /**
   * <p>
   * Setter method for the COM property "ShowSeriesName"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(43)
  void showSeriesName(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowCategoryName"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(44)
  boolean showCategoryName();


  /**
   * <p>
   * Setter method for the COM property "ShowCategoryName"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(45)
  void showCategoryName(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowValue"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(46)
  boolean showValue();


  /**
   * <p>
   * Setter method for the COM property "ShowValue"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(47)
  void showValue(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowPercentage"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(48)
  boolean showPercentage();


  /**
   * <p>
   * Setter method for the COM property "ShowPercentage"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(49)
  void showPercentage(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowBubbleSize"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(50)
  boolean showBubbleSize();


  /**
   * <p>
   * Setter method for the COM property "ShowBubbleSize"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(51)
  void showBubbleSize(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Separator"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(52)
  @ReturnValue(type=NativeType.VARIANT)
  Object separator();


  /**
   * <p>
   * Setter method for the COM property "Separator"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(53)
  void separator(
          @MarshalAs(NativeType.VARIANT) Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(54)
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com.microsoft.outlook.IMsoDataLabel
   */

  @VTID(55)
  IMsoDataLabel item(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   */

  @VTID(56)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.IMsoChartFormat
   */

  @VTID(57)
  com.microsoft.outlook.IMsoChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(58)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(59)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com.microsoft.outlook.IMsoDataLabel
   */

  @VTID(60)
  @DefaultMethod
  IMsoDataLabel _Default(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * @param index Mandatory java.lang.Object parameter.
   */

  @VTID(61)
  void propagate(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * <p>
   * Getter method for the COM property "ShowRange"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(62)
  boolean showRange();


  /**
   * <p>
   * Setter method for the COM property "ShowRange"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(63)
  void showRange(
          boolean rhs);


  /**
   * @param bstrId Mandatory java.lang.String parameter.
   * @param value Mandatory java.lang.Object parameter.
   */

  @VTID(64)
  void setProperty(
          String bstrId,
          @MarshalAs(NativeType.VARIANT) Object value);


  /**
   * @param bstrId Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(65)
  @ReturnValue(type=NativeType.VARIANT)
  Object getProperty(
          String bstrId);


  // Properties:
}
