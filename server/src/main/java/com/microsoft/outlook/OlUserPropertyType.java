package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlUserPropertyType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  olOutlookInternal(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olText(1),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olNumber(3),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  olDateTime(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  olYesNo(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  olDuration(7),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  olKeywords(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  olPercent(12),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  olCurrency(14),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  olFormula(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  olCombination(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  olInteger(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  olEnumeration(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  olSmartFrom(22),
  ;

  private final int value;
  OlUserPropertyType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
