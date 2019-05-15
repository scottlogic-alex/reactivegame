package com.microsoft.outlook.events;

import com4j.DISPID;
import com4j.Holder;
import com4j.IID;

@IID("{0006307A-0000-0000-C000-000000000046}")
public abstract class OutlookBarPaneEvents {
  // Methods:
  /**
   * @param shortcut Mandatory com.microsoft.outlook.OutlookBarShortcut parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61441)
  public void beforeNavigate(
    com.microsoft.outlook.OutlookBarShortcut shortcut,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param toGroup Mandatory com.microsoft.outlook.OutlookBarGroup parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61442)
  public void beforeGroupSwitch(
    com.microsoft.outlook.OutlookBarGroup toGroup,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
