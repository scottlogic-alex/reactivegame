package com.microsoft.outlook;

import com4j.DISPID;
import com4j.DefaultMethod;
import com4j.IID;
import com4j.VTID;

@IID("{000C0367-0000-0000-C000-000000000046}")
public interface SearchScope extends com.microsoft.outlook._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoSearchIn
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  MsoSearchIn type();


  /**
   * <p>
   * Getter method for the COM property "ScopeFolder"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ScopeFolder
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  ScopeFolder scopeFolder();


  // Properties:
}
