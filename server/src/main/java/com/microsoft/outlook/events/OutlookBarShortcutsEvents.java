package com.microsoft.outlook.events;

import com4j.DISPID;
import com4j.Holder;
import com4j.IID;

@IID("{0006307C-0000-0000-C000-000000000046}")
public abstract class OutlookBarShortcutsEvents {
  // Methods:
  /**
   * @param newShortcut Mandatory com.microsoft.outlook.OutlookBarShortcut parameter.
   */

  @DISPID(61441)
  public void shortcutAdd(
    com.microsoft.outlook.OutlookBarShortcut newShortcut) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61442)
  public void beforeShortcutAdd(
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shortcut Mandatory com.microsoft.outlook.OutlookBarShortcut parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61443)
  public void beforeShortcutRemove(
    com.microsoft.outlook.OutlookBarShortcut shortcut,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
