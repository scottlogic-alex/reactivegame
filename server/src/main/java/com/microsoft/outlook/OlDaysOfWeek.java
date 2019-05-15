package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlDaysOfWeek implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olSunday(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olMonday(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olTuesday(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  olWednesday(8),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  olThursday(16),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  olFriday(32),
  /**
   * <p>
   * The value of this constant is 64
   * </p>
   */
  olSaturday(64),
  ;

  private final int value;
  OlDaysOfWeek(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
