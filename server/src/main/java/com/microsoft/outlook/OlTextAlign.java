package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlTextAlign implements ComEnum {
  /**
   * <p>
   * Left
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olTextAlignLeft(1),
  /**
   * <p>
   * Center
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olTextAlignCenter(2),
  /**
   * <p>
   * Right
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olTextAlignRight(3),
  ;

  private final int value;
  OlTextAlign(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
