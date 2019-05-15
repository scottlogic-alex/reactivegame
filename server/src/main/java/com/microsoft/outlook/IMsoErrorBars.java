package com.microsoft.outlook;

import com4j.*;

@IID("{000C1721-0000-0000-C000-000000000046}")
public interface IMsoErrorBars extends Com4jObject {
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
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  Object clearFormats();


  /**
   * <p>
   * Getter method for the COM property "EndStyle"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.XlEndStyleCap
   */

  @VTID(13)
  com.microsoft.outlook.XlEndStyleCap endStyle();


  /**
   * <p>
   * Setter method for the COM property "EndStyle"
   * </p>
   * @param rhs Mandatory com.microsoft.outlook.XlEndStyleCap parameter.
   */

  @VTID(14)
  void endStyle(
          com.microsoft.outlook.XlEndStyleCap rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.IMsoChartFormat
   */

  @VTID(15)
  com.microsoft.outlook.IMsoChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(17)
  int creator();


  /**
   * @param bstrId Mandatory java.lang.String parameter.
   * @param value Mandatory java.lang.Object parameter.
   */

  @VTID(18)
  void setProperty(
          String bstrId,
          @MarshalAs(NativeType.VARIANT) Object value);


  /**
   * @param bstrId Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(19)
  @ReturnValue(type=NativeType.VARIANT)
  Object getProperty(
          String bstrId);


  // Properties:
}
