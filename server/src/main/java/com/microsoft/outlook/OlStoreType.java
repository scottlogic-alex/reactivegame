package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlStoreType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olStoreDefault(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olStoreUnicode(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olStoreANSI(3),
  ;

  private final int value;
  OlStoreType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
