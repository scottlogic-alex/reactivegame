package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlPane implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olOutlookBar(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olFolderList(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olPreview(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olNavigationPane(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  olToDoBar(5),
  ;

  private final int value;
  OlPane(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
