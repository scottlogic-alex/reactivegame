package com.microsoft.outlook;

import com4j.*;

@IID("{000C038A-0000-0000-C000-000000000046}")
public interface MsoDebugOptions_UTs extends _IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type com.microsoft.outlook.MsoDebugOptions_UT
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  MsoDebugOptions_UT item(
          int index);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(11)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param bstrCollectionName Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.microsoft.outlook.MsoDebugOptions_UTs
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  MsoDebugOptions_UTs getUnitTestsInCollection(
          String bstrCollectionName);


  /**
   * @param bstrCollectionName Mandatory java.lang.String parameter.
   * @param bstrUnitTestName Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.microsoft.outlook.MsoDebugOptions_UT
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  MsoDebugOptions_UT getUnitTest(
          String bstrCollectionName,
          String bstrUnitTestName);


  /**
   * @param bstrCollectionName Mandatory java.lang.String parameter.
   * @param bstrUnitTestNameFilter Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.microsoft.outlook.MsoDebugOptions_UTs
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  MsoDebugOptions_UTs getMatchingUnitTestsInCollection(
          String bstrCollectionName,
          String bstrUnitTestNameFilter);


  // Properties:
}
