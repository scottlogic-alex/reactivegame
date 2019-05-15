package com.microsoft.outlook;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

@IID("{55F88896-7708-11D1-ACEB-006008961DA5}")
public interface ICommandBarComboBoxEvents extends Com4jObject {
  // Methods:
  /**
   * @param ctrl Mandatory com.microsoft.outlook._CommandBarComboBox parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void change(
          _CommandBarComboBox ctrl);


  // Properties:
}
