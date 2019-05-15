package com.microsoft.outlook.events;

import com4j.DISPID;
import com4j.IID;

@IID("{00063104-0000-0000-C000-000000000046}")
public abstract class AccountSelectorEvents {
  // Methods:
  /**
   * @param selectedAccount Mandatory com.microsoft.outlook._Account parameter.
   */

  @DISPID(64627)
  public void selectedAccountChange(
    com.microsoft.outlook._Account selectedAccount) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
