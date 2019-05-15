package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlFormatInteger implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olFormatIntegerPlain(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olFormatIntegerComputer1(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olFormatIntegerComputer2(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olFormatIntegerComputer3(4),
  ;

  private final int value;
  OlFormatInteger(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
