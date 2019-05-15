package com.microsoft.outlook.events;

import com4j.DISPID;
import com4j.IID;

@IID("{000672F7-0000-0000-C000-000000000046}")
public abstract class OlkInfoBarEvents {
  // Methods:
  /**
   */

  @DISPID(-600)
  public void click() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(-601)
  public void doubleClick() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param button Mandatory com.microsoft.outlook.OlMouseButton parameter.
   * @param shift Mandatory com.microsoft.outlook.OlShiftState parameter.
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(-605)
  public void mouseDown(
    com.microsoft.outlook.OlMouseButton button,
    com.microsoft.outlook.OlShiftState shift,
    float x,
    float y) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param button Mandatory com.microsoft.outlook.OlMouseButton parameter.
   * @param shift Mandatory com.microsoft.outlook.OlShiftState parameter.
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(-606)
  public void mouseMove(
    com.microsoft.outlook.OlMouseButton button,
    com.microsoft.outlook.OlShiftState shift,
    float x,
    float y) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param button Mandatory com.microsoft.outlook.OlMouseButton parameter.
   * @param shift Mandatory com.microsoft.outlook.OlShiftState parameter.
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(-607)
  public void mouseUp(
    com.microsoft.outlook.OlMouseButton button,
    com.microsoft.outlook.OlShiftState shift,
    float x,
    float y) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
