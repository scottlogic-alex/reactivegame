package com.microsoft.outlook;

import com4j.*;

@IID("{000630D0-0000-0000-C000-000000000046}")
public interface _MoveOrCopyRuleAction extends Com4jObject {
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
   * Getter method for the COM property "ActionType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlRuleActionType
   */

  @DISPID(64271) //= 0xfb0f. The runtime will prefer the VTID if present
  @VTID(13)
  OlRuleActionType actionType();


  /**
   * <p>
   * Getter method for the COM property "Folder"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(64273) //= 0xfb11. The runtime will prefer the VTID if present
  @VTID(14)
  MAPIFolder folder();


  /**
   * <p>
   * Setter method for the COM property "Folder"
   * </p>
   * @param folder Mandatory com.microsoft.outlook.MAPIFolder parameter.
   */

  @DISPID(64273) //= 0xfb11. The runtime will prefer the VTID if present
  @VTID(15)
  void folder(
          MAPIFolder folder);


  // Properties:
}
