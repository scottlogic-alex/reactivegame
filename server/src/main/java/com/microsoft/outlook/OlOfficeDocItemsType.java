package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlOfficeDocItemsType implements ComEnum {
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  olExcelWorkSheetItem(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  olWordDocumentItem(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  olPowerPointShowItem(10),
  ;

  private final int value;
  OlOfficeDocItemsType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
