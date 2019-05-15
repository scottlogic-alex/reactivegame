package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlFormatDuration implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olFormatDurationShort(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olFormatDurationLong(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olFormatDurationShortBusiness(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olFormatDurationLongBusiness(4),
  ;

  private final int value;
  OlFormatDuration(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
