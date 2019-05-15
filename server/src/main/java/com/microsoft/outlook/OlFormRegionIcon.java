package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlFormRegionIcon implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olFormRegionIconDefault(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olFormRegionIconUnread(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olFormRegionIconRead(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olFormRegionIconReplied(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  olFormRegionIconForwarded(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  olFormRegionIconUnsent(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  olFormRegionIconSubmitted(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  olFormRegionIconSigned(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  olFormRegionIconEncrypted(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  olFormRegionIconWindow(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  olFormRegionIconPage(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  olFormRegionIconRecurring(12),
  ;

  private final int value;
  OlFormRegionIcon(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
