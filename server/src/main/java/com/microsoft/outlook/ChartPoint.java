package com.microsoft.outlook;

import com4j.*;

@IID("{000C170C-0000-0000-C000-000000000046}")
public interface ChartPoint extends Com4jObject {
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
   * @param type Optional parameter. Default value is 2
   * @param iMsoLegendKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasLeaderLines Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT)
  Object _ApplyDataLabels(
          @Optional @DefaultValue("2") com.microsoft.outlook.XlDataLabelsType type,
          @Optional @MarshalAs(NativeType.VARIANT) Object iMsoLegendKey,
          @Optional @MarshalAs(NativeType.VARIANT) Object autoText,
          @Optional @MarshalAs(NativeType.VARIANT) Object hasLeaderLines);


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.IMsoBorder
   */

  @VTID(9)
  com.microsoft.outlook.IMsoBorder border();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  Object clearFormats();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  Object copy();


  /**
   * <p>
   * Getter method for the COM property "DataLabel"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.IMsoDataLabel
   */

  @VTID(12)
  com.microsoft.outlook.IMsoDataLabel dataLabel();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  Object delete();


  /**
   * <p>
   * Getter method for the COM property "Explosion"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(14)
  int explosion();


  /**
   * <p>
   * Setter method for the COM property "Explosion"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(15)
  void explosion(
          int rhs);


  /**
   * <p>
   * Getter method for the COM property "HasDataLabel"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(16)
  boolean hasDataLabel();


  /**
   * <p>
   * Setter method for the COM property "HasDataLabel"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(17)
  void hasDataLabel(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.IMsoInterior
   */

  @VTID(18)
  com.microsoft.outlook.IMsoInterior interior();


  /**
   * <p>
   * Getter method for the COM property "InvertIfNegative"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(19)
  boolean invertIfNegative();


  /**
   * <p>
   * Setter method for the COM property "InvertIfNegative"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(20)
  void invertIfNegative(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(21)
  int markerBackgroundColor();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(22)
  void markerBackgroundColor(
          int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlColorIndex
   */

  @VTID(23)
  com.microsoft.outlook.XlColorIndex markerBackgroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlColorIndex parameter.
   */

  @VTID(24)
  void markerBackgroundColorIndex(
          com.microsoft.outlook.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(25)
  int markerForegroundColor();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(26)
  void markerForegroundColor(
          int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlColorIndex
   */

  @VTID(27)
  com.microsoft.outlook.XlColorIndex markerForegroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlColorIndex parameter.
   */

  @VTID(28)
  void markerForegroundColorIndex(
          com.microsoft.outlook.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerSize"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(29)
  int markerSize();


  /**
   * <p>
   * Setter method for the COM property "MarkerSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(30)
  void markerSize(
          int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerStyle"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlMarkerStyle
   */

  @VTID(31)
  com.microsoft.outlook.XlMarkerStyle markerStyle();


  /**
   * <p>
   * Setter method for the COM property "MarkerStyle"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlMarkerStyle parameter.
   */

  @VTID(32)
  void markerStyle(
          com.microsoft.outlook.XlMarkerStyle rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  Object paste();


  /**
   * <p>
   * Getter method for the COM property "PictureType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlChartPictureType
   */

  @VTID(34)
  com.microsoft.outlook.XlChartPictureType pictureType();


  /**
   * <p>
   * Setter method for the COM property "PictureType"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlChartPictureType parameter.
   */

  @VTID(35)
  void pictureType(
          com.microsoft.outlook.XlChartPictureType rhs);


  /**
   * <p>
   * Getter method for the COM property "PictureUnit"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(36)
  double pictureUnit();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(37)
  void pictureUnit(
          double rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(38)
  @ReturnValue(type=NativeType.VARIANT)
  Object select();


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToSides"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(39)
  boolean applyPictToSides();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToSides"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(40)
  void applyPictToSides(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToFront"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(41)
  boolean applyPictToFront();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToFront"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(42)
  void applyPictToFront(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToEnd"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(43)
  boolean applyPictToEnd();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToEnd"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(44)
  void applyPictToEnd(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(45)
  boolean shadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(46)
  void shadow(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SecondaryPlot"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(47)
  boolean secondaryPlot();


  /**
   * <p>
   * Setter method for the COM property "SecondaryPlot"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(48)
  void secondaryPlot(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ChartFillFormat
   */

  @VTID(49)
  com.microsoft.outlook.ChartFillFormat fill();


  /**
   * @param type Optional parameter. Default value is 2
   * @param iMsoLegendKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasLeaderLines Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showSeriesName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showCategoryName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showValue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showPercentage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showBubbleSize Optional parameter. Default value is com4j.Variant.getMissing()
   * @param separator Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(50)
  @ReturnValue(type=NativeType.VARIANT)
  Object applyDataLabels(
          @Optional @DefaultValue("2") com.microsoft.outlook.XlDataLabelsType type,
          @Optional @MarshalAs(NativeType.VARIANT) Object iMsoLegendKey,
          @Optional @MarshalAs(NativeType.VARIANT) Object autoText,
          @Optional @MarshalAs(NativeType.VARIANT) Object hasLeaderLines,
          @Optional @MarshalAs(NativeType.VARIANT) Object showSeriesName,
          @Optional @MarshalAs(NativeType.VARIANT) Object showCategoryName,
          @Optional @MarshalAs(NativeType.VARIANT) Object showValue,
          @Optional @MarshalAs(NativeType.VARIANT) Object showPercentage,
          @Optional @MarshalAs(NativeType.VARIANT) Object showBubbleSize,
          @Optional @MarshalAs(NativeType.VARIANT) Object separator);


  /**
   * <p>
   * Getter method for the COM property "Has3DEffect"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(51)
  boolean has3DEffect();


  /**
   * <p>
   * Setter method for the COM property "Has3DEffect"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(52)
  void has3DEffect(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.IMsoChartFormat
   */

  @VTID(53)
  com.microsoft.outlook.IMsoChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(54)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(55)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "PictureUnit2"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(56)
  double pictureUnit2();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit2"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(57)
  void pictureUnit2(
          double rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(58)
  String name();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(59)
  double height();


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(60)
  double width();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(61)
  double left();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(62)
  double top();


  /**
   * @param loc Mandatory com.microsoft.outlook.XlPieSliceLocation parameter.
   * @param index Optional parameter. Default value is 2
   * @return  Returns a value of type double
   */

  @VTID(63)
  double pieSliceLocation(
          com.microsoft.outlook.XlPieSliceLocation loc,
          @Optional @DefaultValue("2") com.microsoft.outlook.XlPieSliceIndex index);


  /**
   * <p>
   * Getter method for the COM property "IsTotal"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(64)
  boolean isTotal();


  /**
   * <p>
   * Setter method for the COM property "IsTotal"
   * </p>
   * @param pval Mandatory boolean parameter.
   */

  @VTID(65)
  void isTotal(
          boolean pval);


  /**
   * @param bstrId Mandatory java.lang.String parameter.
   * @param value Mandatory java.lang.Object parameter.
   */

  @VTID(66)
  void setProperty(
          String bstrId,
          @MarshalAs(NativeType.VARIANT) Object value);


  /**
   * @param bstrId Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(67)
  @ReturnValue(type=NativeType.VARIANT)
  Object getProperty(
          String bstrId);


  // Properties:
}
