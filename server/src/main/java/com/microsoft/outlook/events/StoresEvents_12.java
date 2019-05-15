package com.microsoft.outlook.events;

import com4j.DISPID;
import com4j.Holder;
import com4j.IID;

@IID("{000630F8-0000-0000-C000-000000000046}")
public abstract class StoresEvents_12 {
  // Methods:
  /**
   * @param store Mandatory com.microsoft.outlook._Store parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(64433)
  public void beforeStoreRemove(
    com.microsoft.outlook._Store store,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param store Mandatory com.microsoft.outlook._Store parameter.
   */

  @DISPID(61441)
  public void storeAdd(
    com.microsoft.outlook._Store store) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
