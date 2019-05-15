package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlMeetingResponse implements ComEnum {
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olMeetingTentative(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olMeetingAccepted(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olMeetingDeclined(4),
  ;

  private final int value;
  OlMeetingResponse(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
