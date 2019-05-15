package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlJournalRecipientType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olAssociatedContact(1),
  ;

  private final int value;
  OlJournalRecipientType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
