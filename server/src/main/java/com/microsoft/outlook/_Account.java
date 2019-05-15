package com.microsoft.outlook;

import com4j.*;

@IID("{000630C5-0000-0000-C000-000000000046}")
public interface _Account extends Com4jObject {
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
   * Getter method for the COM property "AccountType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlAccountType
   */

  @DISPID(64210) //= 0xfad2. The runtime will prefer the VTID if present
  @VTID(11)
  com.microsoft.outlook.OlAccountType accountType();


  /**
   * <p>
   * Getter method for the COM property "DisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(12)
  String displayName();


  /**
   * <p>
   * Getter method for the COM property "UserName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64211) //= 0xfad3. The runtime will prefer the VTID if present
  @VTID(13)
  String userName();


  /**
   * <p>
   * Getter method for the COM property "SmtpAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64212) //= 0xfad4. The runtime will prefer the VTID if present
  @VTID(14)
  String smtpAddress();


  /**
   * <p>
   * Getter method for the COM property "AutoDiscoverConnectionMode"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlAutoDiscoverConnectionMode
   */

  @DISPID(64623) //= 0xfc6f. The runtime will prefer the VTID if present
  @VTID(15)
  com.microsoft.outlook.OlAutoDiscoverConnectionMode autoDiscoverConnectionMode();


  /**
   * <p>
   * Getter method for the COM property "CurrentUser"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Recipient
   */

  @DISPID(64622) //= 0xfc6e. The runtime will prefer the VTID if present
  @VTID(16)
  com.microsoft.outlook.Recipient currentUser();


  /**
   * <p>
   * Getter method for the COM property "AutoDiscoverXml"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64624) //= 0xfc70. The runtime will prefer the VTID if present
  @VTID(17)
  String autoDiscoverXml();


  /**
   * <p>
   * Getter method for the COM property "DeliveryStore"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Store
   */

  @DISPID(64614) //= 0xfc66. The runtime will prefer the VTID if present
  @VTID(18)
  _Store deliveryStore();


  /**
   * <p>
   * Getter method for the COM property "ExchangeConnectionMode"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlExchangeConnectionMode
   */

  @DISPID(64615) //= 0xfc67. The runtime will prefer the VTID if present
  @VTID(19)
  com.microsoft.outlook.OlExchangeConnectionMode exchangeConnectionMode();


  /**
   * <p>
   * Getter method for the COM property "ExchangeMailboxServerName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64616) //= 0xfc68. The runtime will prefer the VTID if present
  @VTID(20)
  String exchangeMailboxServerName();


  /**
   * <p>
   * Getter method for the COM property "ExchangeMailboxServerVersion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64617) //= 0xfc69. The runtime will prefer the VTID if present
  @VTID(21)
  String exchangeMailboxServerVersion();


  /**
   * @param id Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.microsoft.outlook.AddressEntry
   */

  @DISPID(64618) //= 0xfc6a. The runtime will prefer the VTID if present
  @VTID(22)
  com.microsoft.outlook.AddressEntry getAddressEntryFromID(
          String id);


  /**
   * @param entryID Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.microsoft.outlook.Recipient
   */

  @DISPID(64619) //= 0xfc6b. The runtime will prefer the VTID if present
  @VTID(23)
  com.microsoft.outlook.Recipient getRecipientFromID(
          String entryID);


  /**
   * <p>
   * Getter method for the COM property "IOlkAccount"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(24)
  Com4jObject iOlkAccount();


  // Properties:
}
