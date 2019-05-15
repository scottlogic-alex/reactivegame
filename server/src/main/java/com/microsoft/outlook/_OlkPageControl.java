package com.microsoft.outlook;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

@IID("{000672F8-0000-0000-C000-000000000046}")
public interface _OlkPageControl extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Page"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlPageType
   */

  @DISPID(64465) //= 0xfbd1. The runtime will prefer the VTID if present
  @VTID(7)
  OlPageType page();


  /**
   * <p>
   * Setter method for the COM property "Page"
   * </p>
   * @param pageID Mandatory com.microsoft.outlook.OlPageType parameter.
   */

  @DISPID(64465) //= 0xfbd1. The runtime will prefer the VTID if present
  @VTID(8)
  void page(
          OlPageType pageID);


  // Properties:
}
