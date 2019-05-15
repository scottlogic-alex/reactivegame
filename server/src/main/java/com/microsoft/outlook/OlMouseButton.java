package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlMouseButton implements ComEnum {
  /**
   * <p>
   * Left
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olMouseButtonLeft(1),
  /**
   * <p>
   * Right
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olMouseButtonRight(2),
  /**
   * <p>
   * Middle
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olMouseButtonMiddle(4),
  ;

  private final int value;
  OlMouseButton(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
