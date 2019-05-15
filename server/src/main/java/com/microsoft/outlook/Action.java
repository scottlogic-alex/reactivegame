package com.microsoft.outlook;

import com4j.*;

@IID("{00063043-0000-0000-C000-000000000046}")
public interface Action extends Com4jObject {
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
   * Getter method for the COM property "CopyLike"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlActionCopyLike
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  com.microsoft.outlook.OlActionCopyLike copyLike();


  /**
   * <p>
   * Setter method for the COM property "CopyLike"
   * </p>
   * @param copyLike Mandatory com.microsoft.outlook.OlActionCopyLike parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(12)
  void copyLike(
          com.microsoft.outlook.OlActionCopyLike copyLike);


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(13)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param enabled Mandatory boolean parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(14)
  void enabled(
          boolean enabled);


  /**
   * <p>
   * Getter method for the COM property "MessageClass"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(15)
  String messageClass();


  /**
   * <p>
   * Setter method for the COM property "MessageClass"
   * </p>
   * @param messageClass Mandatory java.lang.String parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(16)
  void messageClass(
          String messageClass);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(17)
  String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(18)
  void name(
          String name);


  /**
   * <p>
   * Getter method for the COM property "Prefix"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(19)
  String prefix();


  /**
   * <p>
   * Setter method for the COM property "Prefix"
   * </p>
   * @param prefix Mandatory java.lang.String parameter.
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(20)
  void prefix(
          String prefix);


  /**
   * <p>
   * Getter method for the COM property "ReplyStyle"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlActionReplyStyle
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(21)
  com.microsoft.outlook.OlActionReplyStyle replyStyle();


  /**
   * <p>
   * Setter method for the COM property "ReplyStyle"
   * </p>
   * @param replyStyle Mandatory com.microsoft.outlook.OlActionReplyStyle parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(22)
  void replyStyle(
          com.microsoft.outlook.OlActionReplyStyle replyStyle);


  /**
   * <p>
   * Getter method for the COM property "ResponseStyle"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlActionResponseStyle
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(23)
  com.microsoft.outlook.OlActionResponseStyle responseStyle();


  /**
   * <p>
   * Setter method for the COM property "ResponseStyle"
   * </p>
   * @param responseStyle Mandatory com.microsoft.outlook.OlActionResponseStyle parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(24)
  void responseStyle(
          com.microsoft.outlook.OlActionResponseStyle responseStyle);


  /**
   * <p>
   * Getter method for the COM property "ShowOn"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlActionShowOn
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(25)
  com.microsoft.outlook.OlActionShowOn showOn();


  /**
   * <p>
   * Setter method for the COM property "ShowOn"
   * </p>
   * @param showOn Mandatory com.microsoft.outlook.OlActionShowOn parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(26)
  void showOn(
          com.microsoft.outlook.OlActionShowOn showOn);


  /**
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(27)
  void delete();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(28)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject execute();


  // Properties:
}
