package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum MsoBroadcastCapabilities implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  BroadcastCapFileSizeLimited(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  BroadcastCapSupportsMeetingNotes(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  BroadcastCapSupportsUpdateDoc(4),
  ;

  private final int value;
  MsoBroadcastCapabilities(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
