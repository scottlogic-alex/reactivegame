package com.microsoft.outlook;

import com4j.*;

@IID("{000C1732-0000-0000-C000-000000000046}")
public interface FullSeriesCollection extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(8)
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com.microsoft.outlook.IMsoSeries
   */

  @VTID(9)
  IMsoSeries item(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   */

  @VTID(10)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(12)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com.microsoft.outlook.IMsoSeries
   */

  @VTID(13)
  @DefaultMethod
  IMsoSeries _Default(
          @MarshalAs(NativeType.VARIANT) Object index);


  // Properties:
}
