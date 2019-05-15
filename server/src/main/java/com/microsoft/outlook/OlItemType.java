package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlItemType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  olMailItem(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olAppointmentItem(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olContactItem(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olTaskItem(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olJournalItem(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  olNoteItem(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  olPostItem(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  olDistributionListItem(7),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  olMobileItemSMS(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  olMobileItemMMS(12),
  ;

  private final int value;
  OlItemType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
