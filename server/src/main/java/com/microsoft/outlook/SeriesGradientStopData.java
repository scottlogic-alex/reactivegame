package com.microsoft.outlook;

import com4j.*;

@IID("{847EA60C-C1E6-4DC1-9847-78BC03A80AF0}")
public interface SeriesGradientStopData extends Com4jObject {
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
   * Getter method for the COM property "StopColor"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.SeriesGradientStopColorFormat
   */

  @VTID(8)
  com.microsoft.outlook.SeriesGradientStopColorFormat stopColor();


  /**
   * <p>
   * Getter method for the COM property "StopPositionType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlGradientStopPositionType
   */

  @VTID(9)
  com.microsoft.outlook.XlGradientStopPositionType stopPositionType();


  /**
   * <p>
   * Setter method for the COM property "StopPositionType"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlGradientStopPositionType parameter.
   */

  @VTID(10)
  void stopPositionType(
          com.microsoft.outlook.XlGradientStopPositionType rhs);


  /**
   * <p>
   * Getter method for the COM property "StopValue"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(11)
  String stopValue();


  /**
   * <p>
   * Setter method for the COM property "StopValue"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(12)
  void stopValue(
          String rhs);


  // Properties:
}
