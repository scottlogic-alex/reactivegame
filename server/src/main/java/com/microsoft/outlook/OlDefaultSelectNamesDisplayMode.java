package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlDefaultSelectNamesDisplayMode implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olDefaultMail(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olDefaultMeeting(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olDefaultSharingRequest(4),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olDefaultTask(3),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  olDefaultMembers(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  olDefaultDelegates(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  olDefaultSingleName(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  olDefaultPickRooms(8),
  ;

  private final int value;
  OlDefaultSelectNamesDisplayMode(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
