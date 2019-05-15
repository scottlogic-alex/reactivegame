package com.microsoft.outlook;

import com4j.DISPID;
import com4j.DefaultMethod;
import com4j.IID;
import com4j.VTID;

@IID("{000C038B-0000-0000-C000-000000000046}")
public interface MsoDebugOptions_UT extends _IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  String name();


  /**
   * <p>
   * Getter method for the COM property "CollectionName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  String collectionName();


  /**
   * @return  Returns a value of type com.microsoft.outlook.MsoDebugOptions_UTRunResult
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  com.microsoft.outlook.MsoDebugOptions_UTRunResult run();


  // Properties:
}
