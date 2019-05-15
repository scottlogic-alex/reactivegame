package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlMeetingStatus implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  olNonMeeting(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olMeeting(1),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olMeetingReceived(3),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  olMeetingCanceled(5),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  olMeetingReceivedAndCanceled(7),
  ;

  private final int value;
  OlMeetingStatus(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
