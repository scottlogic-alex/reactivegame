package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlFormRegistry implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  olDefaultRegistry(0),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olPersonalRegistry(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olFolderRegistry(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olOrganizationRegistry(4),
  ;

  private final int value;
  OlFormRegistry(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
