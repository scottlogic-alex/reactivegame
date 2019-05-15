package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlAppointmentTimeField implements ComEnum {
  /**
   * <p>
   * None
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olAppointmentTimeFieldNone(1),
  /**
   * <p>
   * Start
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olAppointmentTimeFieldStart(2),
  /**
   * <p>
   * End
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  olAppointmentTimeFieldEnd(3),
  ;

  private final int value;
  OlAppointmentTimeField(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
