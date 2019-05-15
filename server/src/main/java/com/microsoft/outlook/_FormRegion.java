package com.microsoft.outlook;

import com4j.*;

@IID("{0006305A-0000-0000-C000-000000000046}")
public interface _FormRegion extends Com4jObject {
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
  _NameSpace session();


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
   * Getter method for the COM property "IsExpanded"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64312) //= 0xfb38. The runtime will prefer the VTID if present
  @VTID(11)
  boolean isExpanded();


  /**
   * <p>
   * Getter method for the COM property "Form"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(64313) //= 0xfb39. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject form();


  /**
   * <p>
   * Getter method for the COM property "Detail"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64309) //= 0xfb35. The runtime will prefer the VTID if present
  @VTID(13)
  String detail();


  /**
   * <p>
   * Setter method for the COM property "Detail"
   * </p>
   * @param detail Mandatory java.lang.String parameter.
   */

  @DISPID(64309) //= 0xfb35. The runtime will prefer the VTID if present
  @VTID(14)
  void detail(
          String detail);


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(64096) //= 0xfa60. The runtime will prefer the VTID if present
  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject item();


  /**
   * <p>
   * Getter method for the COM property "Inspector"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Inspector
   */

  @DISPID(61502) //= 0xf03e. The runtime will prefer the VTID if present
  @VTID(16)
  _Inspector inspector();


  /**
   * <p>
   * Getter method for the COM property "FormRegionMode"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlFormRegionMode
   */

  @DISPID(64308) //= 0xfb34. The runtime will prefer the VTID if present
  @VTID(17)
  com.microsoft.outlook.OlFormRegionMode formRegionMode();


  /**
   * <p>
   * Getter method for the COM property "Language"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64065) //= 0xfa41. The runtime will prefer the VTID if present
  @VTID(18)
  int language();


  /**
   */

  @DISPID(64315) //= 0xfb3b. The runtime will prefer the VTID if present
  @VTID(19)
  void reflow();


  /**
   * <p>
   * Getter method for the COM property "DisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(20)
  String displayName();


  /**
   * <p>
   * Getter method for the COM property "InternalName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8450) //= 0x2102. The runtime will prefer the VTID if present
  @VTID(21)
  String internalName();


  /**
   * @param control Mandatory com4j.Com4jObject parameter.
   * @param propertyName Mandatory java.lang.String parameter.
   */

  @DISPID(64201) //= 0xfac9. The runtime will prefer the VTID if present
  @VTID(22)
  void setControlItemProperty(
          @MarshalAs(NativeType.Dispatch) Com4jObject control,
          String propertyName);


  /**
   * <p>
   * Getter method for the COM property "SuppressControlReplacement"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64518) //= 0xfc06. The runtime will prefer the VTID if present
  @VTID(23)
  boolean suppressControlReplacement();


  /**
   * <p>
   * Setter method for the COM property "SuppressControlReplacement"
   * </p>
   * @param suppressControlReplacement Mandatory boolean parameter.
   */

  @DISPID(64518) //= 0xfc06. The runtime will prefer the VTID if present
  @VTID(24)
  void suppressControlReplacement(
          boolean suppressControlReplacement);


  /**
   */

  @DISPID(8457) //= 0x2109. The runtime will prefer the VTID if present
  @VTID(25)
  void select();


  /**
   * <p>
   * Getter method for the COM property "EnableAutoLayout"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64538) //= 0xfc1a. The runtime will prefer the VTID if present
  @VTID(26)
  boolean enableAutoLayout();


  /**
   * <p>
   * Setter method for the COM property "EnableAutoLayout"
   * </p>
   * @param enableAutoLayout Mandatory boolean parameter.
   */

  @DISPID(64538) //= 0xfc1a. The runtime will prefer the VTID if present
  @VTID(27)
  void enableAutoLayout(
          boolean enableAutoLayout);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(8451) //= 0x2103. The runtime will prefer the VTID if present
  @VTID(28)
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param visible Mandatory boolean parameter.
   */

  @DISPID(8451) //= 0x2103. The runtime will prefer the VTID if present
  @VTID(29)
  void visible(
          boolean visible);


  // Properties:
}
