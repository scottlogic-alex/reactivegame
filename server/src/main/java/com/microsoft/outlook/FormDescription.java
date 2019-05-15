package com.microsoft.outlook;

import com4j.*;

@IID("{00063046-0000-0000-C000-000000000046}")
public interface FormDescription extends Com4jObject {
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
   * Getter method for the COM property "Category"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13060) //= 0x3304. The runtime will prefer the VTID if present
  @VTID(11)
  String category();


  /**
   * <p>
   * Setter method for the COM property "Category"
   * </p>
   * @param category Mandatory java.lang.String parameter.
   */

  @DISPID(13060) //= 0x3304. The runtime will prefer the VTID if present
  @VTID(12)
  void category(
          String category);


  /**
   * <p>
   * Getter method for the COM property "CategorySub"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13061) //= 0x3305. The runtime will prefer the VTID if present
  @VTID(13)
  String categorySub();


  /**
   * <p>
   * Setter method for the COM property "CategorySub"
   * </p>
   * @param categorySub Mandatory java.lang.String parameter.
   */

  @DISPID(13061) //= 0x3305. The runtime will prefer the VTID if present
  @VTID(14)
  void categorySub(
          String categorySub);


  /**
   * <p>
   * Getter method for the COM property "Comment"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12292) //= 0x3004. The runtime will prefer the VTID if present
  @VTID(15)
  String comment();


  /**
   * <p>
   * Setter method for the COM property "Comment"
   * </p>
   * @param comment Mandatory java.lang.String parameter.
   */

  @DISPID(12292) //= 0x3004. The runtime will prefer the VTID if present
  @VTID(16)
  void comment(
          String comment);


  /**
   * <p>
   * Getter method for the COM property "ContactName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13059) //= 0x3303. The runtime will prefer the VTID if present
  @VTID(17)
  String contactName();


  /**
   * <p>
   * Setter method for the COM property "ContactName"
   * </p>
   * @param contactName Mandatory java.lang.String parameter.
   */

  @DISPID(13059) //= 0x3303. The runtime will prefer the VTID if present
  @VTID(18)
  void contactName(
          String contactName);


  /**
   * <p>
   * Getter method for the COM property "DisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(19)
  String displayName();


  /**
   * <p>
   * Setter method for the COM property "DisplayName"
   * </p>
   * @param displayName Mandatory java.lang.String parameter.
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(20)
  void displayName(
          String displayName);


  /**
   * <p>
   * Getter method for the COM property "Hidden"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(13063) //= 0x3307. The runtime will prefer the VTID if present
  @VTID(21)
  boolean hidden();


  /**
   * <p>
   * Setter method for the COM property "Hidden"
   * </p>
   * @param hidden Mandatory boolean parameter.
   */

  @DISPID(13063) //= 0x3307. The runtime will prefer the VTID if present
  @VTID(22)
  void hidden(
          boolean hidden);


  /**
   * <p>
   * Getter method for the COM property "Icon"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4093) //= 0xffd. The runtime will prefer the VTID if present
  @VTID(23)
  String icon();


  /**
   * <p>
   * Setter method for the COM property "Icon"
   * </p>
   * @param icon Mandatory java.lang.String parameter.
   */

  @DISPID(4093) //= 0xffd. The runtime will prefer the VTID if present
  @VTID(24)
  void icon(
          String icon);


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(25)
  boolean locked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param locked Mandatory boolean parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(26)
  void locked(
          boolean locked);


  /**
   * <p>
   * Getter method for the COM property "MessageClass"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(27)
  String messageClass();


  /**
   * <p>
   * Getter method for the COM property "MiniIcon"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4092) //= 0xffc. The runtime will prefer the VTID if present
  @VTID(28)
  String miniIcon();


  /**
   * <p>
   * Setter method for the COM property "MiniIcon"
   * </p>
   * @param miniIcon Mandatory java.lang.String parameter.
   */

  @DISPID(4092) //= 0xffc. The runtime will prefer the VTID if present
  @VTID(29)
  void miniIcon(
          String miniIcon);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(61469) //= 0xf01d. The runtime will prefer the VTID if present
  @VTID(30)
  String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(61469) //= 0xf01d. The runtime will prefer the VTID if present
  @VTID(31)
  void name(
          String name);


  /**
   * <p>
   * Getter method for the COM property "Number"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(32)
  String number();


  /**
   * <p>
   * Setter method for the COM property "Number"
   * </p>
   * @param number Mandatory java.lang.String parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(33)
  void number(
          String number);


  /**
   * <p>
   * Getter method for the COM property "OneOff"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(34)
  boolean oneOff();


  /**
   * <p>
   * Setter method for the COM property "OneOff"
   * </p>
   * @param oneOff Mandatory boolean parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(35)
  void oneOff(
          boolean oneOff);


  /**
   * <p>
   * Getter method for the COM property "Password"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(36)
  String password();


  /**
   * <p>
   * Setter method for the COM property "Password"
   * </p>
   * @param password Mandatory java.lang.String parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(37)
  void password(
          String password);


  /**
   * <p>
   * Getter method for the COM property "ScriptText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(38)
  String scriptText();


  /**
   * <p>
   * Getter method for the COM property "Template"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(39)
  String template();


  /**
   * <p>
   * Setter method for the COM property "Template"
   * </p>
   * @param template Mandatory java.lang.String parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(40)
  void template(
          String template);


  /**
   * <p>
   * Getter method for the COM property "UseWordMail"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(41)
  boolean useWordMail();


  /**
   * <p>
   * Setter method for the COM property "UseWordMail"
   * </p>
   * @param useWordMail Mandatory boolean parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(42)
  void useWordMail(
          boolean useWordMail);


  /**
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13057) //= 0x3301. The runtime will prefer the VTID if present
  @VTID(43)
  String version();


  /**
   * <p>
   * Setter method for the COM property "Version"
   * </p>
   * @param version Mandatory java.lang.String parameter.
   */

  @DISPID(13057) //= 0x3301. The runtime will prefer the VTID if present
  @VTID(44)
  void version(
          String version);


  /**
   * @param registry Mandatory com.microsoft.outlook.OlFormRegistry parameter.
   * @param folder Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(45)
  void publishForm(
          OlFormRegistry registry,
          @Optional @MarshalAs(NativeType.VARIANT) Object folder);


  // Properties:
}
