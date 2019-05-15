package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlRecurrenceType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  olRecursDaily(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olRecursWeekly(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olRecursMonthly(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olRecursMonthNth(3),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  olRecursYearly(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  olRecursYearNth(6),
  ;

  private final int value;
  OlRecurrenceType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
