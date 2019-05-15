package com.microsoft.outlook.events;

import com4j.DISPID;
import com4j.IID;

@IID("{000CDB0B-0000-0000-C000-000000000046}")
public abstract class _CustomXMLPartsEvents {
  // Methods:
  /**
   * @param newPart Mandatory com.microsoft.outlook._CustomXMLPart parameter.
   */

  @DISPID(1)
  public void partAfterAdd(
    com.microsoft.outlook._CustomXMLPart newPart) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param oldPart Mandatory com.microsoft.outlook._CustomXMLPart parameter.
   */

  @DISPID(2)
  public void partBeforeDelete(
    com.microsoft.outlook._CustomXMLPart oldPart) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param part Mandatory com.microsoft.outlook._CustomXMLPart parameter.
   */

  @DISPID(3)
  public void partAfterLoad(
    com.microsoft.outlook._CustomXMLPart part) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
