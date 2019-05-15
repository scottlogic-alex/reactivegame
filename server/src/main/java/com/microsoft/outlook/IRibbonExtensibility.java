package com.microsoft.outlook;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

@IID("{000C0396-0000-0000-C000-000000000046}")
public interface IRibbonExtensibility extends Com4jObject {
  // Methods:
  /**
   * @param ribbonID Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  String getCustomUI(
          String ribbonID);


  // Properties:
}
