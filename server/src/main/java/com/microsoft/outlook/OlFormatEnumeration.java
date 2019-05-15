package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlFormatEnumeration implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olFormatEnumBitmap(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olFormatEnumText(2),
  ;

  private final int value;
  OlFormatEnumeration(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
