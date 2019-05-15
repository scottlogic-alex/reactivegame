package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlComboBoxStyle implements ComEnum {
  /**
   * <p>
   * Combo
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  olComboBoxStyleCombo(0),
  /**
   * <p>
   * List
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olComboBoxStyleList(2),
  ;

  private final int value;
  OlComboBoxStyle(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
