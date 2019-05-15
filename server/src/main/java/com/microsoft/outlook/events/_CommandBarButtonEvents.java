package com.microsoft.outlook.events;

import com4j.DISPID;
import com4j.Holder;
import com4j.IID;

@IID("{000C0351-0000-0000-C000-000000000046}")
public abstract class _CommandBarButtonEvents {
  // Methods:
  /**
   * @param ctrl Mandatory com.microsoft.outlook._CommandBarButton parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1)
  public void click(
    com.microsoft.outlook._CommandBarButton ctrl,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
