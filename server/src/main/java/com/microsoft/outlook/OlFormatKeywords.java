package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlFormatKeywords implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olFormatKeywordsText(1),
  ;

  private final int value;
  OlFormatKeywords(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
