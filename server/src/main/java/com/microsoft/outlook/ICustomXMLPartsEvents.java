package com.microsoft.outlook;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

@IID("{000CDB0A-0000-0000-C000-000000000046}")
public interface ICustomXMLPartsEvents extends Com4jObject {
  // Methods:
  /**
   * @param newPart Mandatory com.microsoft.outlook._CustomXMLPart parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void partAfterAdd(
          _CustomXMLPart newPart);


  /**
   * @param oldPart Mandatory com.microsoft.outlook._CustomXMLPart parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void partBeforeDelete(
          _CustomXMLPart oldPart);


  /**
   * @param part Mandatory com.microsoft.outlook._CustomXMLPart parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void partAfterLoad(
          _CustomXMLPart part);


  // Properties:
}
