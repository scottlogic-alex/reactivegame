package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlFormatNumber implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olFormatNumberAllDigits(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olFormatNumberTruncated(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olFormatNumber1Decimal(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olFormatNumber2Decimal(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  olFormatNumberScientific(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  olFormatNumberComputer1(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  olFormatNumberComputer2(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  olFormatNumberComputer3(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  olFormatNumberRaw(9),
  ;

  private final int value;
  OlFormatNumber(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
