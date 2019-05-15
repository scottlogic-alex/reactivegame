package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlFormatDateTime implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olFormatDateTimeLongDayDateTime(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olFormatDateTimeShortDateTime(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olFormatDateTimeShortDayDateTime(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olFormatDateTimeShortDayMonthDateTime(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  OlFormatDateTimeLongDayDate(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  olFormatDateTimeLongDate(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  olFormatDateTimeLongDateReversed(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  olFormatDateTimeShortDate(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  olFormatDateTimeShortDateNumOnly(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  olFormatDateTimeShortDayMonth(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  olFormatDateTimeShortMonthYear(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  olFormatDateTimeShortMonthYearNumOnly(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  olFormatDateTimeShortDayDate(13),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  olFormatDateTimeLongTime(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  olFormatDateTimeShortTime(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  olFormatDateTimeBestFit(17),
  ;

  private final int value;
  OlFormatDateTime(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
