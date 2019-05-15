package com.microsoft.outlook.events;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.Holder;
import com4j.IID;

@IID("{0006304E-0000-0000-C000-000000000046}")
public abstract class ApplicationEvents {
  // Methods:
  /**
   * @param item Mandatory com4j.Com4jObject parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61442)
  public void itemSend(
    Com4jObject item,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(61443)
  public void newMail() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param item Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(61444)
  public void reminder(
    Com4jObject item) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pages Mandatory com.microsoft.outlook.PropertyPages parameter.
   */

  @DISPID(61445)
  public void optionsPagesAdd(
    com.microsoft.outlook.PropertyPages pages) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(61446)
  public void startup() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(61447)
  public void quit() {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
