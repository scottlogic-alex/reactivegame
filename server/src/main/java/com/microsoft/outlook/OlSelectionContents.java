package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlSelectionContents implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olConversationHeaders(1),
  ;

  private final int value;
  OlSelectionContents(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
