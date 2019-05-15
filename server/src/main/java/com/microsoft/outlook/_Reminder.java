package com.microsoft.outlook;

import com4j.*;

@IID("{000630B0-0000-0000-C000-000000000046}")
public interface _Reminder extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Application
   */

  @DISPID(61440) //= 0xf000. The runtime will prefer the VTID if present
  @VTID(7)
  com.microsoft.outlook._Application application();


  /**
   * <p>
   * Getter method for the COM property "Class"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlObjectClass
   */

  @DISPID(61450) //= 0xf00a. The runtime will prefer the VTID if present
  @VTID(8)
  com.microsoft.outlook.OlObjectClass _class();


  /**
   * <p>
   * Getter method for the COM property "Session"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._NameSpace
   */

  @DISPID(61451) //= 0xf00b. The runtime will prefer the VTID if present
  @VTID(9)
  com.microsoft.outlook._NameSpace session();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61441) //= 0xf001. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   */

  @DISPID(64154) //= 0xfa9a. The runtime will prefer the VTID if present
  @VTID(11)
  void dismiss();


  /**
   * @param snoozeTime Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(64155) //= 0xfa9b. The runtime will prefer the VTID if present
  @VTID(12)
  void snooze(
          @Optional @MarshalAs(NativeType.VARIANT) Object snoozeTime);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(13)
  @DefaultMethod
  String caption();


  /**
   * <p>
   * Getter method for the COM property "IsVisible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64157) //= 0xfa9d. The runtime will prefer the VTID if present
  @VTID(14)
  boolean isVisible();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(64158) //= 0xfa9e. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject item();


  /**
   * <p>
   * Getter method for the COM property "NextReminderDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(64159) //= 0xfa9f. The runtime will prefer the VTID if present
  @VTID(16)
  java.util.Date nextReminderDate();


  /**
   * <p>
   * Getter method for the COM property "OriginalReminderDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(64160) //= 0xfaa0. The runtime will prefer the VTID if present
  @VTID(17)
  java.util.Date originalReminderDate();


  // Properties:
}
