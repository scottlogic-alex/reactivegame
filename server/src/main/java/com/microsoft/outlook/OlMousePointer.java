package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlMousePointer implements ComEnum {
  /**
   * <p>
   * Default
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  olMousePointerDefault(0),
  /**
   * <p>
   * Arrow
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olMousePointerArrow(1),
  /**
   * <p>
   * Cross
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olMousePointerCross(2),
  /**
   * <p>
   * IBeam
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olMousePointerIBeam(3),
  /**
   * <p>
   * SizeNESW
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  olMousePointerSizeNESW(6),
  /**
   * <p>
   * SizeNS
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  olMousePointerSizeNS(7),
  /**
   * <p>
   * SizeNWSE
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  olMousePointerSizeNWSE(8),
  /**
   * <p>
   * SizeWE
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  olMousePointerSizeWE(9),
  /**
   * <p>
   * UpArrow
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  olMousePointerUpArrow(10),
  /**
   * <p>
   * HourGlass
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  olMousePointerHourGlass(11),
  /**
   * <p>
   * NoDrop
   * </p>
   * <p>
   * The value of this constant is 12
   * </p>
   */
  olMousePointerNoDrop(12),
  /**
   * <p>
   * AppStarting
   * </p>
   * <p>
   * The value of this constant is 13
   * </p>
   */
  olMousePointerAppStarting(13),
  /**
   * <p>
   * Help
   * </p>
   * <p>
   * The value of this constant is 14
   * </p>
   */
  olMousePointerHelp(14),
  /**
   * <p>
   * SizeAll
   * </p>
   * <p>
   * The value of this constant is 15
   * </p>
   */
  olMousePointerSizeAll(15),
  /**
   * <p>
   * Custom
   * </p>
   * <p>
   * The value of this constant is 99
   * </p>
   */
  olMousePointerCustom(99),
  ;

  private final int value;
  OlMousePointer(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
