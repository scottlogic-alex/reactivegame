package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlAddressEntryUserType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  olExchangeUserAddressEntry(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olExchangeDistributionListAddressEntry(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olExchangePublicFolderAddressEntry(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olExchangeAgentAddressEntry(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olExchangeOrganizationAddressEntry(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  olExchangeRemoteUserAddressEntry(5),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  olOutlookContactAddressEntry(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  olOutlookDistributionListAddressEntry(11),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  olLdapAddressEntry(20),
  /**
   * <p>
   * The value of this constant is 30
   * </p>
   */
  olSmtpAddressEntry(30),
  /**
   * <p>
   * The value of this constant is 40
   * </p>
   */
  olOtherAddressEntry(40),
  ;

  private final int value;
  OlAddressEntryUserType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
