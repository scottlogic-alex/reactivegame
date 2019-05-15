package com.microsoft.outlook.events;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.Holder;
import com4j.IID;

@IID("{000630F7-0000-0000-C000-000000000046}")
public abstract class MAPIFolderEvents_12 {
  // Methods:
  /**
   * @param moveTo Mandatory com.microsoft.outlook.MAPIFolder parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(64424)
  public void beforeFolderMove(
    com.microsoft.outlook.MAPIFolder moveTo,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param item Mandatory com4j.Com4jObject parameter.
   * @param moveTo Mandatory com.microsoft.outlook.MAPIFolder parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(64425)
  public void beforeItemMove(
    Com4jObject item,
    com.microsoft.outlook.MAPIFolder moveTo,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
