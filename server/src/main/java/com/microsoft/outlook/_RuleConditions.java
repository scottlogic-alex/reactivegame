package com.microsoft.outlook;

import com4j.*;

@IID("{000630D8-0000-0000-C000-000000000046}")
public interface _RuleConditions extends Com4jObject {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(80) //= 0x50. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type com.microsoft.outlook._RuleCondition
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(12)
  _RuleCondition item(
          int index);


  /**
   * <p>
   * Getter method for the COM property "CC"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._RuleCondition
   */

  @DISPID(64300) //= 0xfb2c. The runtime will prefer the VTID if present
  @VTID(13)
  _RuleCondition cc();


  /**
   * <p>
   * Getter method for the COM property "HasAttachment"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._RuleCondition
   */

  @DISPID(64301) //= 0xfb2d. The runtime will prefer the VTID if present
  @VTID(14)
  _RuleCondition hasAttachment();


  /**
   * <p>
   * Getter method for the COM property "Importance"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._ImportanceRuleCondition
   */

  @DISPID(64299) //= 0xfb2b. The runtime will prefer the VTID if present
  @VTID(15)
  com.microsoft.outlook._ImportanceRuleCondition importance();


  /**
   * <p>
   * Getter method for the COM property "MeetingInviteOrUpdate"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._RuleCondition
   */

  @DISPID(64302) //= 0xfb2e. The runtime will prefer the VTID if present
  @VTID(16)
  _RuleCondition meetingInviteOrUpdate();


  /**
   * <p>
   * Getter method for the COM property "NotTo"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._RuleCondition
   */

  @DISPID(64303) //= 0xfb2f. The runtime will prefer the VTID if present
  @VTID(17)
  _RuleCondition notTo();


  /**
   * <p>
   * Getter method for the COM property "OnlyToMe"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._RuleCondition
   */

  @DISPID(64304) //= 0xfb30. The runtime will prefer the VTID if present
  @VTID(18)
  _RuleCondition onlyToMe();


  /**
   * <p>
   * Getter method for the COM property "ToMe"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._RuleCondition
   */

  @DISPID(64305) //= 0xfb31. The runtime will prefer the VTID if present
  @VTID(19)
  _RuleCondition toMe();


  /**
   * <p>
   * Getter method for the COM property "ToOrCc"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._RuleCondition
   */

  @DISPID(64306) //= 0xfb32. The runtime will prefer the VTID if present
  @VTID(20)
  _RuleCondition toOrCc();


  /**
   * <p>
   * Getter method for the COM property "Account"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._AccountRuleCondition
   */

  @DISPID(64209) //= 0xfad1. The runtime will prefer the VTID if present
  @VTID(21)
  com.microsoft.outlook._AccountRuleCondition account();


  /**
   * <p>
   * Getter method for the COM property "Body"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._TextRuleCondition
   */

  @DISPID(64328) //= 0xfb48. The runtime will prefer the VTID if present
  @VTID(22)
  com.microsoft.outlook._TextRuleCondition body();


  /**
   * <p>
   * Getter method for the COM property "BodyOrSubject"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._TextRuleCondition
   */

  @DISPID(64329) //= 0xfb49. The runtime will prefer the VTID if present
  @VTID(23)
  com.microsoft.outlook._TextRuleCondition bodyOrSubject();


  /**
   * <p>
   * Getter method for the COM property "Category"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._CategoryRuleCondition
   */

  @DISPID(64330) //= 0xfb4a. The runtime will prefer the VTID if present
  @VTID(24)
  com.microsoft.outlook._CategoryRuleCondition category();


  /**
   * <p>
   * Getter method for the COM property "FormName"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._FormNameRuleCondition
   */

  @DISPID(64331) //= 0xfb4b. The runtime will prefer the VTID if present
  @VTID(25)
  com.microsoft.outlook._FormNameRuleCondition formName();


  /**
   * <p>
   * Getter method for the COM property "From"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._ToOrFromRuleCondition
   */

  @DISPID(64332) //= 0xfb4c. The runtime will prefer the VTID if present
  @VTID(26)
  com.microsoft.outlook._ToOrFromRuleCondition from();


  /**
   * <p>
   * Getter method for the COM property "MessageHeader"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._TextRuleCondition
   */

  @DISPID(64334) //= 0xfb4e. The runtime will prefer the VTID if present
  @VTID(27)
  com.microsoft.outlook._TextRuleCondition messageHeader();


  /**
   * <p>
   * Getter method for the COM property "RecipientAddress"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._AddressRuleCondition
   */

  @DISPID(64338) //= 0xfb52. The runtime will prefer the VTID if present
  @VTID(28)
  com.microsoft.outlook._AddressRuleCondition recipientAddress();


  /**
   * <p>
   * Getter method for the COM property "SenderAddress"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._AddressRuleCondition
   */

  @DISPID(64335) //= 0xfb4f. The runtime will prefer the VTID if present
  @VTID(29)
  com.microsoft.outlook._AddressRuleCondition senderAddress();


  /**
   * <p>
   * Getter method for the COM property "SenderInAddressList"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._SenderInAddressListRuleCondition
   */

  @DISPID(64336) //= 0xfb50. The runtime will prefer the VTID if present
  @VTID(30)
  com.microsoft.outlook._SenderInAddressListRuleCondition senderInAddressList();


  /**
   * <p>
   * Getter method for the COM property "Subject"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._TextRuleCondition
   */

  @DISPID(64337) //= 0xfb51. The runtime will prefer the VTID if present
  @VTID(31)
  com.microsoft.outlook._TextRuleCondition subject();


  /**
   * <p>
   * Getter method for the COM property "SentTo"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._ToOrFromRuleCondition
   */

  @DISPID(64339) //= 0xfb53. The runtime will prefer the VTID if present
  @VTID(32)
  com.microsoft.outlook._ToOrFromRuleCondition sentTo();


  /**
   * <p>
   * Getter method for the COM property "OnLocalMachine"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._RuleCondition
   */

  @DISPID(64340) //= 0xfb54. The runtime will prefer the VTID if present
  @VTID(33)
  _RuleCondition onLocalMachine();


  /**
   * <p>
   * Getter method for the COM property "OnOtherMachine"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._RuleCondition
   */

  @DISPID(64473) //= 0xfbd9. The runtime will prefer the VTID if present
  @VTID(34)
  _RuleCondition onOtherMachine();


  /**
   * <p>
   * Getter method for the COM property "AnyCategory"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._RuleCondition
   */

  @DISPID(64531) //= 0xfc13. The runtime will prefer the VTID if present
  @VTID(35)
  _RuleCondition anyCategory();


  /**
   * <p>
   * Getter method for the COM property "FromAnyRSSFeed"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._RuleCondition
   */

  @DISPID(64534) //= 0xfc16. The runtime will prefer the VTID if present
  @VTID(36)
  _RuleCondition fromAnyRSSFeed();


  /**
   * <p>
   * Getter method for the COM property "FromRssFeed"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._FromRssFeedRuleCondition
   */

  @DISPID(64535) //= 0xfc17. The runtime will prefer the VTID if present
  @VTID(37)
  com.microsoft.outlook._FromRssFeedRuleCondition fromRssFeed();


  /**
   * <p>
   * Getter method for the COM property "Sensitivity"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._SensitivityRuleCondition
   */

  @DISPID(64674) //= 0xfca2. The runtime will prefer the VTID if present
  @VTID(38)
  com.microsoft.outlook._SensitivityRuleCondition sensitivity();


  // Properties:
}
