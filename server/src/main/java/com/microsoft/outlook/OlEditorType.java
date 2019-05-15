package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlEditorType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olEditorText(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olEditorHTML(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olEditorRTF(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olEditorWord(4),
  ;

  private final int value;
  OlEditorType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
