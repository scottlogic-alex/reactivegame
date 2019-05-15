package com.microsoft.outlook.events;

import com4j.DISPID;
import com4j.IID;

@IID("{00063105-0000-0000-C000-000000000046}")
public abstract class AccountsEvents {
  // Methods:
  /**
   * @param account Mandatory com.microsoft.outlook._Account parameter.
   */

  @DISPID(64620)
  public void autoDiscoverComplete(
    com.microsoft.outlook._Account account) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
