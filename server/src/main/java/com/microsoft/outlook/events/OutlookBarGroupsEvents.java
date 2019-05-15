package com.microsoft.outlook.events;

import com4j.DISPID;
import com4j.Holder;
import com4j.IID;

@IID("{0006307B-0000-0000-C000-000000000046}")
public abstract class OutlookBarGroupsEvents {
  // Methods:
  /**
   * @param newGroup Mandatory com.microsoft.outlook.OutlookBarGroup parameter.
   */

  @DISPID(61441)
  public void groupAdd(
    com.microsoft.outlook.OutlookBarGroup newGroup) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61442)
  public void beforeGroupAdd(
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param group Mandatory com.microsoft.outlook.OutlookBarGroup parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61443)
  public void beforeGroupRemove(
    com.microsoft.outlook.OutlookBarGroup group,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
