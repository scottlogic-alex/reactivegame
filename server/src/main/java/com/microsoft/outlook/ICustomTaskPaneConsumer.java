package com.microsoft.outlook;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

@IID("{000C033E-0000-0000-C000-000000000046}")
public interface ICustomTaskPaneConsumer extends Com4jObject {
  // Methods:
  /**
   * @param ctpFactoryInst Mandatory com.microsoft.outlook.ICTPFactory parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void ctpFactoryAvailable(
          ICTPFactory ctpFactoryInst);


  // Properties:
}
