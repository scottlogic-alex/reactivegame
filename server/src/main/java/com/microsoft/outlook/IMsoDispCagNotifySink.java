package com.microsoft.outlook;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

@IID("{000C0359-0000-0000-C000-000000000046}")
public interface IMsoDispCagNotifySink extends Com4jObject {
  // Methods:
  /**
   * @param pClipMoniker Mandatory com4j.Com4jObject parameter.
   * @param pItemMoniker Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void insertClip(
          Com4jObject pClipMoniker,
          Com4jObject pItemMoniker);


  /**
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void windowIsClosing();


  // Properties:
}
