package com.microsoft.outlook.events;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;

@IID("{0006300D-0000-0000-C000-000000000046}")
public abstract class ResultsEvents {
  // Methods:
  /**
   * @param item Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(61441)
  public void itemAdd(
    Com4jObject item) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param item Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(61442)
  public void itemChange(
    Com4jObject item) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(61443)
  public void itemRemove() {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
