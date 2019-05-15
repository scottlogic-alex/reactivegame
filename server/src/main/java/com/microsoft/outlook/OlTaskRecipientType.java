package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlTaskRecipientType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olUpdate(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olFinalStatus(3),
  ;

  private final int value;
  OlTaskRecipientType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
