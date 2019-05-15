package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlShiftState implements ComEnum {
  /**
   * <p>
   * ShiftMask
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olShiftStateShiftMask(1),
  /**
   * <p>
   * CtrlMask
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olShiftStateCtrlMask(2),
  /**
   * <p>
   * AltMask
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olShiftStateAltMask(4),
  ;

  private final int value;
  OlShiftState(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
