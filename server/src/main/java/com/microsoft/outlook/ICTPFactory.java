package com.microsoft.outlook;

import com4j.*;

@IID("{000C033D-0000-0000-C000-000000000046}")
public interface ICTPFactory extends Com4jObject {
  // Methods:
  /**
   * @param ctpAxID Mandatory java.lang.String parameter.
   * @param ctpTitle Mandatory java.lang.String parameter.
   * @param ctpParentWindow Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com.microsoft.outlook._CustomTaskPane
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  com.microsoft.outlook._CustomTaskPane createCTP(
          String ctpAxID,
          String ctpTitle,
          @Optional @MarshalAs(NativeType.VARIANT) Object ctpParentWindow);


  // Properties:
}
