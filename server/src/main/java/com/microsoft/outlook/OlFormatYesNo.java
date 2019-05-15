package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlFormatYesNo implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olFormatYesNoYesNo(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olFormatYesNoOnOff(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olFormatYesNoTrueFalse(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olFormatYesNoIcon(4),
  ;

  private final int value;
  OlFormatYesNo(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
