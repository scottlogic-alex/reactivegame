package com.microsoft.outlook;

import com4j.*;

@IID("{00063042-0000-0000-C000-000000000046}")
public interface UserProperty extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Application
   */

  @DISPID(61440) //= 0xf000. The runtime will prefer the VTID if present
  @VTID(7)
  _Application application();


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
   * Getter method for the COM property "Formula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(11)
  String formula();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param formula Mandatory java.lang.String parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(12)
  void formula(
          String formula);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(13)
  String name();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlUserPropertyType
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(14)
  com.microsoft.outlook.OlUserPropertyType type();


  /**
   * <p>
   * Getter method for the COM property "ValidationFormula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(15)
  String validationFormula();


  /**
   * <p>
   * Setter method for the COM property "ValidationFormula"
   * </p>
   * @param validationFormula Mandatory java.lang.String parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(16)
  void validationFormula(
          String validationFormula);


  /**
   * <p>
   * Getter method for the COM property "ValidationText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(17)
  String validationText();


  /**
   * <p>
   * Setter method for the COM property "ValidationText"
   * </p>
   * @param validationText Mandatory java.lang.String parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(18)
  void validationText(
          String validationText);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(19)
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
  @VTID(20)
  @DefaultMethod
  void value(
          @MarshalAs(NativeType.VARIANT) Object value);


  /**
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(21)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "IsUserProperty"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64008) //= 0xfa08. The runtime will prefer the VTID if present
  @VTID(22)
  boolean isUserProperty();


  // Properties:
}
