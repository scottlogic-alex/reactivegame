package com.microsoft.outlook;

import com4j.*;

@IID("{08D6CD0F-98AA-468B-81F3-A6B2CB6C84C9}")
public interface SeriesGradientStopColorFormat extends Com4jObject {
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
   * Getter method for the COM property "TintAndShade"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(8)
  float tintAndShade();


  /**
   * <p>
   * Setter method for the COM property "TintAndShade"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(9)
  void tintAndShade(
          float rhs);


  /**
   * <p>
   * Getter method for the COM property "ObjectThemeColor"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoThemeColorIndex
   */

  @VTID(10)
  MsoThemeColorIndex objectThemeColor();


  /**
   * <p>
   * Setter method for the COM property "ObjectThemeColor"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.MsoThemeColorIndex parameter.
   */

  @VTID(11)
  void objectThemeColor(
          MsoThemeColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "RGB"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(12)
  int rgb();


  /**
   * <p>
   * Setter method for the COM property "RGB"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(13)
  void rgb(
          int rhs);


  /**
   * <p>
   * Getter method for the COM property "Transparency"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(14)
  float transparency();


  /**
   * <p>
   * Setter method for the COM property "Transparency"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(15)
  void transparency(
          float rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory Holder<com.microsoft.outlook.MsoColorType> parameter.
   */

  @VTID(16)
  void type(
          Holder<MsoColorType> rhs);


  // Properties:
}
