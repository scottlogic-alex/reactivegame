package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlFormatCurrency implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olFormatCurrencyDecimal(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olFormatCurrencyNonDecimal(2),
  ;

  private final int value;
  OlFormatCurrency(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
