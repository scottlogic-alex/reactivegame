package com.microsoft.outlook.events;

import com4j.DISPID;
import com4j.IID;

@IID("{0006308C-0000-0000-C000-000000000046}")
public abstract class NameSpaceEvents {
  // Methods:
  /**
   * @param pages Mandatory com.microsoft.outlook.PropertyPages parameter.
   * @param folder Mandatory com.microsoft.outlook.MAPIFolder parameter.
   */

  @DISPID(61445)
  public void optionsPagesAdd(
    com.microsoft.outlook.PropertyPages pages,
    com.microsoft.outlook.MAPIFolder folder) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(64557)
  public void autoDiscoverComplete() {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
