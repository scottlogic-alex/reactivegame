package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlAttachmentType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olByValue(1),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olByReference(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  olEmbeddeditem(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  olOLE(6),
  ;

  private final int value;
  OlAttachmentType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
