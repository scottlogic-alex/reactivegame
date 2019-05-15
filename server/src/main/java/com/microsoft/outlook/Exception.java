package com.microsoft.outlook;

import com4j.*;

@IID("{0006304D-0000-0000-C000-000000000046}")
public interface Exception extends Com4jObject {
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
   * <p>
   * Getter method for the COM property "AppointmentItem"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._AppointmentItem
   */

  @DISPID(8193) //= 0x2001. The runtime will prefer the VTID if present
  @VTID(11)
  com.microsoft.outlook._AppointmentItem appointmentItem();


  /**
   * <p>
   * Getter method for the COM property "Deleted"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(8194) //= 0x2002. The runtime will prefer the VTID if present
  @VTID(12)
  boolean deleted();


  /**
   * <p>
   * Getter method for the COM property "OriginalDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(8192) //= 0x2000. The runtime will prefer the VTID if present
  @VTID(13)
  java.util.Date originalDate();


  /**
   * <p>
   * Getter method for the COM property "ItemProperties"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ItemProperties
   */

  @DISPID(64009) //= 0xfa09. The runtime will prefer the VTID if present
  @VTID(14)
  com.microsoft.outlook.ItemProperties itemProperties();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.ItemProperties.class})
  com.microsoft.outlook.ItemProperty itemProperties(
          @MarshalAs(NativeType.VARIANT) Object index);

  // Properties:
}
