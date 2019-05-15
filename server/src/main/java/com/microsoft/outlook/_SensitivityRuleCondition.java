package com.microsoft.outlook;

import com4j.*;

@IID("{00063108-0000-0000-C000-000000000046}")
public interface _SensitivityRuleCondition extends Com4jObject {
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
  OlObjectClass _class();


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
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(11)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param enabled Mandatory boolean parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(12)
  void enabled(
          boolean enabled);


  /**
   * <p>
   * Getter method for the COM property "ConditionType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlRuleConditionType
   */

  @DISPID(64298) //= 0xfb2a. The runtime will prefer the VTID if present
  @VTID(13)
  OlRuleConditionType conditionType();


  /**
   * <p>
   * Getter method for the COM property "Sensitivity"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlSensitivity
   */

  @DISPID(64674) //= 0xfca2. The runtime will prefer the VTID if present
  @VTID(14)
  OlSensitivity sensitivity();


  /**
   * <p>
   * Setter method for the COM property "Sensitivity"
   * </p>
   * @param sensitivity Mandatory com.microsoft.outlook.OlSensitivity parameter.
   */

  @DISPID(64674) //= 0xfca2. The runtime will prefer the VTID if present
  @VTID(15)
  void sensitivity(
          OlSensitivity sensitivity);


  // Properties:
}
