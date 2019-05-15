package com.microsoft.outlook.events;

import com4j.DISPID;
import com4j.Holder;
import com4j.IID;

@IID("{000630B2-0000-0000-C000-000000000046}")
public abstract class ReminderCollectionEvents {
  // Methods:
  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(64147)
  public void beforeReminderShow(
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param reminderObject Mandatory com.microsoft.outlook._Reminder parameter.
   */

  @DISPID(64148)
  public void reminderAdd(
    com.microsoft.outlook._Reminder reminderObject) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param reminderObject Mandatory com.microsoft.outlook._Reminder parameter.
   */

  @DISPID(64149)
  public void reminderChange(
    com.microsoft.outlook._Reminder reminderObject) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param reminderObject Mandatory com.microsoft.outlook._Reminder parameter.
   */

  @DISPID(64150)
  public void reminderFire(
    com.microsoft.outlook._Reminder reminderObject) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(64151)
  public void reminderRemove() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param reminderObject Mandatory com.microsoft.outlook._Reminder parameter.
   */

  @DISPID(64152)
  public void snooze(
    com.microsoft.outlook._Reminder reminderObject) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
