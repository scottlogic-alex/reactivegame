package com.microsoft.outlook.events;

import com4j.DISPID;
import com4j.IID;

@IID("{00063085-0000-0000-C000-000000000046}")
public abstract class SyncObjectEvents {
  // Methods:
  /**
   */

  @DISPID(61441)
  public void syncStart() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param state Mandatory com.microsoft.outlook.OlSyncState parameter.
   * @param description Mandatory java.lang.String parameter.
   * @param value Mandatory int parameter.
   * @param max Mandatory int parameter.
   */

  @DISPID(61442)
  public void progress(
    com.microsoft.outlook.OlSyncState state,
    String description,
    int value,
    int max) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param code Mandatory int parameter.
   * @param description Mandatory java.lang.String parameter.
   */

  @DISPID(61443)
  public void onError(
    int code,
    String description) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(61444)
  public void syncEnd() {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
