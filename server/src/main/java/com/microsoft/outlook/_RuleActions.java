package com.microsoft.outlook;

import com4j.*;

@IID("{000630CE-0000-0000-C000-000000000046}")
public interface _RuleActions extends Com4jObject {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(80) //= 0x50. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type com.microsoft.outlook._RuleAction
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(12)
  _RuleAction item(
          int index);


  /**
   * <p>
   * Getter method for the COM property "CopyToFolder"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._MoveOrCopyRuleAction
   */

  @DISPID(64274) //= 0xfb12. The runtime will prefer the VTID if present
  @VTID(13)
  com.microsoft.outlook._MoveOrCopyRuleAction copyToFolder();


  /**
   * <p>
   * Getter method for the COM property "DeletePermanently"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._RuleAction
   */

  @DISPID(64275) //= 0xfb13. The runtime will prefer the VTID if present
  @VTID(14)
  _RuleAction deletePermanently();


  /**
   * <p>
   * Getter method for the COM property "Delete"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._RuleAction
   */

  @DISPID(61509) //= 0xf045. The runtime will prefer the VTID if present
  @VTID(15)
  _RuleAction delete();


  /**
   * <p>
   * Getter method for the COM property "DesktopAlert"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._RuleAction
   */

  @DISPID(64279) //= 0xfb17. The runtime will prefer the VTID if present
  @VTID(16)
  _RuleAction desktopAlert();


  /**
   * <p>
   * Getter method for the COM property "NotifyDelivery"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._RuleAction
   */

  @DISPID(64278) //= 0xfb16. The runtime will prefer the VTID if present
  @VTID(17)
  _RuleAction notifyDelivery();


  /**
   * <p>
   * Getter method for the COM property "NotifyRead"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._RuleAction
   */

  @DISPID(64277) //= 0xfb15. The runtime will prefer the VTID if present
  @VTID(18)
  _RuleAction notifyRead();


  /**
   * <p>
   * Getter method for the COM property "Stop"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._RuleAction
   */

  @DISPID(64276) //= 0xfb14. The runtime will prefer the VTID if present
  @VTID(19)
  _RuleAction stop();


  /**
   * <p>
   * Getter method for the COM property "MoveToFolder"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._MoveOrCopyRuleAction
   */

  @DISPID(64280) //= 0xfb18. The runtime will prefer the VTID if present
  @VTID(20)
  com.microsoft.outlook._MoveOrCopyRuleAction moveToFolder();


  /**
   * <p>
   * Getter method for the COM property "CC"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._SendRuleAction
   */

  @DISPID(64281) //= 0xfb19. The runtime will prefer the VTID if present
  @VTID(21)
  com.microsoft.outlook._SendRuleAction cc();


  /**
   * <p>
   * Getter method for the COM property "Forward"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._SendRuleAction
   */

  @DISPID(64282) //= 0xfb1a. The runtime will prefer the VTID if present
  @VTID(22)
  com.microsoft.outlook._SendRuleAction forward();


  /**
   * <p>
   * Getter method for the COM property "ForwardAsAttachment"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._SendRuleAction
   */

  @DISPID(64283) //= 0xfb1b. The runtime will prefer the VTID if present
  @VTID(23)
  com.microsoft.outlook._SendRuleAction forwardAsAttachment();


  /**
   * <p>
   * Getter method for the COM property "Redirect"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._SendRuleAction
   */

  @DISPID(64284) //= 0xfb1c. The runtime will prefer the VTID if present
  @VTID(24)
  com.microsoft.outlook._SendRuleAction redirect();


  /**
   * <p>
   * Getter method for the COM property "AssignToCategory"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._AssignToCategoryRuleAction
   */

  @DISPID(64290) //= 0xfb22. The runtime will prefer the VTID if present
  @VTID(25)
  com.microsoft.outlook._AssignToCategoryRuleAction assignToCategory();


  /**
   * <p>
   * Getter method for the COM property "PlaySound"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._PlaySoundRuleAction
   */

  @DISPID(64291) //= 0xfb23. The runtime will prefer the VTID if present
  @VTID(26)
  com.microsoft.outlook._PlaySoundRuleAction playSound();


  /**
   * <p>
   * Getter method for the COM property "MarkAsTask"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._MarkAsTaskRuleAction
   */

  @DISPID(64294) //= 0xfb26. The runtime will prefer the VTID if present
  @VTID(27)
  com.microsoft.outlook._MarkAsTaskRuleAction markAsTask();


  /**
   * <p>
   * Getter method for the COM property "NewItemAlert"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._NewItemAlertRuleAction
   */

  @DISPID(64296) //= 0xfb28. The runtime will prefer the VTID if present
  @VTID(28)
  com.microsoft.outlook._NewItemAlertRuleAction newItemAlert();


  /**
   * <p>
   * Getter method for the COM property "ClearCategories"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._RuleAction
   */

  @DISPID(64530) //= 0xfc12. The runtime will prefer the VTID if present
  @VTID(29)
  _RuleAction clearCategories();


  // Properties:
}
