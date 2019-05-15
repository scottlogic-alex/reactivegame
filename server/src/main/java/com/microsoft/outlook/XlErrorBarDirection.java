package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum XlErrorBarDirection implements ComEnum {
  /**
   * <p>
   * The value of this constant is -4168
   * </p>
   */
  xlChartX(-4168),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  xlChartY(1),
  ;

  private final int value;
  XlErrorBarDirection(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
