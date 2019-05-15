package com.microsoft.outlook;

import com4j.*;

@IID("{000C170B-0000-0000-C000-000000000046}")
public interface IMsoSeries extends Com4jObject {
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
   * Getter method for the COM property "AxisGroup"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlAxisGroup
   */

  @VTID(9)
  com.microsoft.outlook.XlAxisGroup axisGroup();


  /**
   * <p>
   * Setter method for the COM property "AxisGroup"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlAxisGroup parameter.
   */

  @VTID(10)
  void axisGroup(
          com.microsoft.outlook.XlAxisGroup rhs);


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.IMsoBorder
   */

  @VTID(11)
  IMsoBorder border();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  Object clearFormats();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  Object copy();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject dataLabels(
          @Optional @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(15)
  @ReturnValue(type=NativeType.VARIANT)
  Object delete();


  /**
   * @param direction Mandatory com.microsoft.outlook.XlErrorBarDirection parameter.
   * @param include Mandatory com.microsoft.outlook.XlErrorBarInclude parameter.
   * @param type Mandatory com.microsoft.outlook.XlErrorBarType parameter.
   * @param amount Optional parameter. Default value is com4j.Variant.getMissing()
   * @param minusValues Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  Object errorBar(
          com.microsoft.outlook.XlErrorBarDirection direction,
          com.microsoft.outlook.XlErrorBarInclude include,
          com.microsoft.outlook.XlErrorBarType type,
          @Optional @MarshalAs(NativeType.VARIANT) Object amount,
          @Optional @MarshalAs(NativeType.VARIANT) Object minusValues);


  /**
   * <p>
   * Getter method for the COM property "ErrorBars"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.IMsoErrorBars
   */

  @VTID(17)
  com.microsoft.outlook.IMsoErrorBars errorBars();


  /**
   * <p>
   * Getter method for the COM property "Explosion"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(18)
  int explosion();


  /**
   * <p>
   * Setter method for the COM property "Explosion"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(19)
  void explosion(
          int rhs);


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(20)
  String formula();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(21)
  void formula(
          String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaLocal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(22)
  String formulaLocal();


  /**
   * <p>
   * Setter method for the COM property "FormulaLocal"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(23)
  void formulaLocal(
          String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(24)
  String formulaR1C1();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(25)
  void formulaR1C1(
          String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1Local"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(26)
  String formulaR1C1Local();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1Local"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(27)
  void formulaR1C1Local(
          String rhs);


  /**
   * <p>
   * Getter method for the COM property "HasDataLabels"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(28)
  boolean hasDataLabels();


  /**
   * <p>
   * Setter method for the COM property "HasDataLabels"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(29)
  void hasDataLabels(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasErrorBars"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(30)
  boolean hasErrorBars();


  /**
   * <p>
   * Setter method for the COM property "HasErrorBars"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(31)
  void hasErrorBars(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.IMsoInterior
   */

  @VTID(32)
  com.microsoft.outlook.IMsoInterior interior();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ChartFillFormat
   */

  @VTID(33)
  com.microsoft.outlook.ChartFillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "InvertIfNegative"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(34)
  boolean invertIfNegative();


  /**
   * <p>
   * Setter method for the COM property "InvertIfNegative"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(35)
  void invertIfNegative(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(36)
  int markerBackgroundColor();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(37)
  void markerBackgroundColor(
          int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlColorIndex
   */

  @VTID(38)
  com.microsoft.outlook.XlColorIndex markerBackgroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlColorIndex parameter.
   */

  @VTID(39)
  void markerBackgroundColorIndex(
          com.microsoft.outlook.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(40)
  int markerForegroundColor();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(41)
  void markerForegroundColor(
          int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlColorIndex
   */

  @VTID(42)
  com.microsoft.outlook.XlColorIndex markerForegroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlColorIndex parameter.
   */

  @VTID(43)
  void markerForegroundColorIndex(
          com.microsoft.outlook.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerSize"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(44)
  int markerSize();


  /**
   * <p>
   * Setter method for the COM property "MarkerSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(45)
  void markerSize(
          int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerStyle"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlMarkerStyle
   */

  @VTID(46)
  com.microsoft.outlook.XlMarkerStyle markerStyle();


  /**
   * <p>
   * Setter method for the COM property "MarkerStyle"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlMarkerStyle parameter.
   */

  @VTID(47)
  void markerStyle(
          com.microsoft.outlook.XlMarkerStyle rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(48)
  String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(49)
  void name(
          String rhs);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(50)
  @ReturnValue(type=NativeType.VARIANT)
  Object paste();


  /**
   * <p>
   * Getter method for the COM property "PictureType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlChartPictureType
   */

  @VTID(51)
  com.microsoft.outlook.XlChartPictureType pictureType();


  /**
   * <p>
   * Setter method for the COM property "PictureType"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlChartPictureType parameter.
   */

  @VTID(52)
  void pictureType(
          com.microsoft.outlook.XlChartPictureType rhs);


  /**
   * <p>
   * Getter method for the COM property "PictureUnit"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(53)
  double pictureUnit();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(54)
  void pictureUnit(
          double rhs);


  /**
   * <p>
   * Getter method for the COM property "PlotOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(55)
  int plotOrder();


  /**
   * <p>
   * Setter method for the COM property "PlotOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(56)
  void plotOrder(
          int rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(57)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject points(
          @Optional @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(58)
  @ReturnValue(type=NativeType.VARIANT)
  Object select();


  /**
   * <p>
   * Getter method for the COM property "Smooth"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(59)
  boolean smooth();


  /**
   * <p>
   * Setter method for the COM property "Smooth"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(60)
  void smooth(
          boolean rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(61)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject trendlines(
          @Optional @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(62)
  int type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(63)
  void type(
          int rhs);


  /**
   * <p>
   * Getter method for the COM property "ChartType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlChartType
   */

  @VTID(64)
  com.microsoft.outlook.XlChartType chartType();


  /**
   * <p>
   * Setter method for the COM property "ChartType"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlChartType parameter.
   */

  @VTID(65)
  void chartType(
          com.microsoft.outlook.XlChartType rhs);


  /**
   * @param chartType Mandatory com.microsoft.outlook.XlChartType parameter.
   */

  @VTID(66)
  void applyCustomType(
          com.microsoft.outlook.XlChartType chartType);


  /**
   * <p>
   * Getter method for the COM property "Values"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(67)
  @ReturnValue(type=NativeType.VARIANT)
  Object values();


  /**
   * <p>
   * Setter method for the COM property "Values"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(68)
  void values(
          @MarshalAs(NativeType.VARIANT) Object rhs);


  /**
   * <p>
   * Getter method for the COM property "XValues"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(69)
  @ReturnValue(type=NativeType.VARIANT)
  Object xValues();


  /**
   * <p>
   * Setter method for the COM property "XValues"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(70)
  void xValues(
          @MarshalAs(NativeType.VARIANT) Object rhs);


  /**
   * <p>
   * Getter method for the COM property "BubbleSizes"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(71)
  @ReturnValue(type=NativeType.VARIANT)
  Object bubbleSizes();


  /**
   * <p>
   * Setter method for the COM property "BubbleSizes"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(72)
  void bubbleSizes(
          @MarshalAs(NativeType.VARIANT) Object rhs);


  /**
   * <p>
   * Getter method for the COM property "BarShape"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlBarShape
   */

  @VTID(73)
  com.microsoft.outlook.XlBarShape barShape();


  /**
   * <p>
   * Setter method for the COM property "BarShape"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlBarShape parameter.
   */

  @VTID(74)
  void barShape(
          com.microsoft.outlook.XlBarShape rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToSides"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(75)
  boolean applyPictToSides();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToSides"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(76)
  void applyPictToSides(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToFront"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(77)
  boolean applyPictToFront();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToFront"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(78)
  void applyPictToFront(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToEnd"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(79)
  boolean applyPictToEnd();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToEnd"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(80)
  void applyPictToEnd(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Has3DEffect"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(81)
  boolean has3DEffect();


  /**
   * <p>
   * Setter method for the COM property "Has3DEffect"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(82)
  void has3DEffect(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(83)
  boolean shadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(84)
  void shadow(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasLeaderLines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(85)
  boolean hasLeaderLines();


  /**
   * <p>
   * Setter method for the COM property "HasLeaderLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(86)
  void hasLeaderLines(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LeaderLines"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.IMsoLeaderLines
   */

  @VTID(87)
  com.microsoft.outlook.IMsoLeaderLines leaderLines();


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

  @VTID(88)
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
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.IMsoChartFormat
   */

  @VTID(89)
  com.microsoft.outlook.IMsoChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(90)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(91)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "PictureUnit2"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(92)
  double pictureUnit2();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit2"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(93)
  void pictureUnit2(
          double rhs);


  /**
   * <p>
   * Getter method for the COM property "PlotColorIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(94)
  int plotColorIndex();


  /**
   * <p>
   * Getter method for the COM property "InvertColor"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(95)
  int invertColor();


  /**
   * <p>
   * Setter method for the COM property "InvertColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(96)
  void invertColor(
          int rhs);


  /**
   * <p>
   * Getter method for the COM property "InvertColorIndex"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlColorIndex
   */

  @VTID(97)
  com.microsoft.outlook.XlColorIndex invertColorIndex();


  /**
   * <p>
   * Setter method for the COM property "InvertColorIndex"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlColorIndex parameter.
   */

  @VTID(98)
  void invertColorIndex(
          com.microsoft.outlook.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "IsFiltered"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(99)
  boolean isFiltered();


  /**
   * <p>
   * Setter method for the COM property "IsFiltered"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(100)
  void isFiltered(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ParentDataLabelOption"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlParentDataLabelOptions
   */

  @VTID(101)
  com.microsoft.outlook.XlParentDataLabelOptions parentDataLabelOption();


  /**
   * <p>
   * Setter method for the COM property "ParentDataLabelOption"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlParentDataLabelOptions parameter.
   */

  @VTID(102)
  void parentDataLabelOption(
          com.microsoft.outlook.XlParentDataLabelOptions rhs);


  /**
   * <p>
   * Getter method for the COM property "QuartileCalculationInclusiveMedian"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(103)
  boolean quartileCalculationInclusiveMedian();


  /**
   * <p>
   * Setter method for the COM property "QuartileCalculationInclusiveMedian"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(104)
  void quartileCalculationInclusiveMedian(
          boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ValueSortOrder"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlValueSortOrder
   */

  @VTID(105)
  com.microsoft.outlook.XlValueSortOrder valueSortOrder();


  /**
   * <p>
   * Setter method for the COM property "ValueSortOrder"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlValueSortOrder parameter.
   */

  @VTID(106)
  void valueSortOrder(
          com.microsoft.outlook.XlValueSortOrder rhs);


  /**
   * <p>
   * Getter method for the COM property "GeoProjectionType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlGeoProjectionType
   */

  @VTID(107)
  com.microsoft.outlook.XlGeoProjectionType geoProjectionType();


  /**
   * <p>
   * Setter method for the COM property "GeoProjectionType"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlGeoProjectionType parameter.
   */

  @VTID(108)
  void geoProjectionType(
          com.microsoft.outlook.XlGeoProjectionType rhs);


  /**
   * <p>
   * Getter method for the COM property "GeoMappingLevel"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlGeoMappingLevel
   */

  @VTID(109)
  com.microsoft.outlook.XlGeoMappingLevel geoMappingLevel();


  /**
   * <p>
   * Setter method for the COM property "GeoMappingLevel"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlGeoMappingLevel parameter.
   */

  @VTID(110)
  void geoMappingLevel(
          com.microsoft.outlook.XlGeoMappingLevel rhs);


  /**
   * <p>
   * Getter method for the COM property "RegionLabelOption"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlRegionLabelOptions
   */

  @VTID(111)
  com.microsoft.outlook.XlRegionLabelOptions regionLabelOption();


  /**
   * <p>
   * Setter method for the COM property "RegionLabelOption"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlRegionLabelOptions parameter.
   */

  @VTID(112)
  void regionLabelOption(
          com.microsoft.outlook.XlRegionLabelOptions rhs);


  /**
   * <p>
   * Getter method for the COM property "SeriesColorGradientStyle"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlSeriesColorGradientStyle
   */

  @VTID(113)
  com.microsoft.outlook.XlSeriesColorGradientStyle seriesColorGradientStyle();


  /**
   * <p>
   * Setter method for the COM property "SeriesColorGradientStyle"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlSeriesColorGradientStyle parameter.
   */

  @VTID(114)
  void seriesColorGradientStyle(
          com.microsoft.outlook.XlSeriesColorGradientStyle rhs);


  /**
   * <p>
   * Getter method for the COM property "SeriesColorMinGradientStop"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.SeriesGradientStopData
   */

  @VTID(115)
  com.microsoft.outlook.SeriesGradientStopData seriesColorMinGradientStop();


  /**
   * <p>
   * Getter method for the COM property "SeriesColorMidGradientStop"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.SeriesGradientStopData
   */

  @VTID(116)
  com.microsoft.outlook.SeriesGradientStopData seriesColorMidGradientStop();


  /**
   * <p>
   * Getter method for the COM property "SeriesColorMaxGradientStop"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.SeriesGradientStopData
   */

  @VTID(117)
  com.microsoft.outlook.SeriesGradientStopData seriesColorMaxGradientStop();


  /**
   * @param bstrId Mandatory java.lang.String parameter.
   * @param value Mandatory java.lang.Object parameter.
   */

  @VTID(118)
  void setProperty(
          String bstrId,
          @MarshalAs(NativeType.VARIANT) Object value);


  /**
   * @param bstrId Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(119)
  @ReturnValue(type=NativeType.VARIANT)
  Object getProperty(
          String bstrId);


  // Properties:
}
