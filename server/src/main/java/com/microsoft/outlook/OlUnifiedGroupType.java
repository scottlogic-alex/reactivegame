package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlUnifiedGroupType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  PrivateGroup(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  PublicGroup(2),
  ;

  private final int value;
  OlUnifiedGroupType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
