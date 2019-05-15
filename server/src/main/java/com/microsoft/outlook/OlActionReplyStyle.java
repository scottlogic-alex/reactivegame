package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlActionReplyStyle implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  olOmitOriginalText(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olEmbedOriginalItem(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olIncludeOriginalText(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olIndentOriginalText(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olLinkOriginalItem(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  olUserPreference(5),
  /**
   * <p>
   * The value of this constant is 1000
   * </p>
   */
  olReplyTickOriginalText(1000),
  ;

  private final int value;
  OlActionReplyStyle(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
