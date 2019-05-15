package com.microsoft.outlook;

import com4j.*;
import com4j.stdole.IPictureDisp;

@IID("{00067367-0000-0000-C000-000000000046}")
public interface _OlkTimeZoneControl extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "AppointmentTimeField"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlAppointmentTimeField
   */

  @DISPID(64559) //= 0xfc2f. The runtime will prefer the VTID if present
  @VTID(7)
  com.microsoft.outlook.OlAppointmentTimeField appointmentTimeField();


  /**
   * <p>
   * Setter method for the COM property "AppointmentTimeField"
   * </p>
   * @param appointmentTimeField Mandatory com.microsoft.outlook.OlAppointmentTimeField parameter.
   */

  @DISPID(64559) //= 0xfc2f. The runtime will prefer the VTID if present
  @VTID(8)
  void appointmentTimeField(
          com.microsoft.outlook.OlAppointmentTimeField appointmentTimeField);


  /**
   * <p>
   * Getter method for the COM property "BorderStyle"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlBorderStyle
   */

  @DISPID(-504) //= 0xfffffe08. The runtime will prefer the VTID if present
  @VTID(9)
  OlBorderStyle borderStyle();


  /**
   * <p>
   * Setter method for the COM property "BorderStyle"
   * </p>
   * @param borderStyle Mandatory com.microsoft.outlook.OlBorderStyle parameter.
   */

  @DISPID(-504) //= 0xfffffe08. The runtime will prefer the VTID if present
  @VTID(10)
  void borderStyle(
          OlBorderStyle borderStyle);


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-514) //= 0xfffffdfe. The runtime will prefer the VTID if present
  @VTID(11)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param enabled Mandatory boolean parameter.
   */

  @DISPID(-514) //= 0xfffffdfe. The runtime will prefer the VTID if present
  @VTID(12)
  void enabled(
          boolean enabled);


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(13)
  boolean locked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param locked Mandatory boolean parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(14)
  void locked(
          boolean locked);


  /**
   * <p>
   * Getter method for the COM property "MouseIcon"
   * </p>
   * @return  Returns a value of type IPictureDisp
   */

  @DISPID(-522) //= 0xfffffdf6. The runtime will prefer the VTID if present
  @VTID(15)
  IPictureDisp mouseIcon();


  /**
   * <p>
   * Setter method for the COM property "MouseIcon"
   * </p>
   * @param mouseIcon Mandatory IPictureDisp parameter.
   */

  @DISPID(-522) //= 0xfffffdf6. The runtime will prefer the VTID if present
  @VTID(16)
  void mouseIcon(
          IPictureDisp mouseIcon);


  /**
   * <p>
   * Getter method for the COM property "MousePointer"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlMousePointer
   */

  @DISPID(-521) //= 0xfffffdf7. The runtime will prefer the VTID if present
  @VTID(17)
  OlMousePointer mousePointer();


  /**
   * <p>
   * Setter method for the COM property "MousePointer"
   * </p>
   * @param mousePointer Mandatory com.microsoft.outlook.OlMousePointer parameter.
   */

  @DISPID(-521) //= 0xfffffdf7. The runtime will prefer the VTID if present
  @VTID(18)
  void mousePointer(
          OlMousePointer mousePointer);


  /**
   * <p>
   * Getter method for the COM property "SelectedTimeZoneIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64560) //= 0xfc30. The runtime will prefer the VTID if present
  @VTID(19)
  int selectedTimeZoneIndex();


  /**
   * <p>
   * Setter method for the COM property "SelectedTimeZoneIndex"
   * </p>
   * @param selectedTimeZoneIndex Mandatory int parameter.
   */

  @DISPID(64560) //= 0xfc30. The runtime will prefer the VTID if present
  @VTID(20)
  void selectedTimeZoneIndex(
          int selectedTimeZoneIndex);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(21)
  @DefaultMethod
  @ReturnValue(type=NativeType.VARIANT)
  Object value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(22)
  @DefaultMethod
  void value(
          @MarshalAs(NativeType.VARIANT) Object value);


  /**
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(23)
  void dropDown();


  // Properties:
}
