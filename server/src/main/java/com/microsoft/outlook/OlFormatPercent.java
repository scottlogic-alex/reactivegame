package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlFormatPercent implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olFormatPercentRounded(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olFormatPercent1Decimal(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olFormatPercent2Decimal(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olFormatPercentAllDigits(4),
  ;

  private final int value;
  OlFormatPercent(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
