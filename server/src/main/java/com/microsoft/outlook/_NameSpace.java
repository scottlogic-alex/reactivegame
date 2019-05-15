package com.microsoft.outlook;

import com4j.*;

@IID("{00063002-0000-0000-C000-000000000046}")
public interface _NameSpace extends Com4jObject {
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
   * Getter method for the COM property "CurrentUser"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Recipient
   */

  @DISPID(8449) //= 0x2101. The runtime will prefer the VTID if present
  @VTID(11)
  Recipient currentUser();


  /**
   * <p>
   * Getter method for the COM property "Folders"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Folders
   */

  @DISPID(8451) //= 0x2103. The runtime will prefer the VTID if present
  @VTID(12)
  _Folders folders();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8452) //= 0x2104. The runtime will prefer the VTID if present
  @VTID(13)
  String type();


  /**
   * <p>
   * Getter method for the COM property "AddressLists"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.AddressLists
   */

  @DISPID(8461) //= 0x210d. The runtime will prefer the VTID if present
  @VTID(14)
  com.microsoft.outlook.AddressLists addressLists();


  /**
   * @param recipientName Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.microsoft.outlook.Recipient
   */

  @DISPID(8458) //= 0x210a. The runtime will prefer the VTID if present
  @VTID(15)
  Recipient createRecipient(
          String recipientName);


  /**
   * @param folderType Mandatory com.microsoft.outlook.OlDefaultFolders parameter.
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(8459) //= 0x210b. The runtime will prefer the VTID if present
  @VTID(16)
  com.microsoft.outlook.MAPIFolder getDefaultFolder(
          com.microsoft.outlook.OlDefaultFolders folderType);


  /**
   * @param entryIDFolder Mandatory java.lang.String parameter.
   * @param entryIDStore Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(8456) //= 0x2108. The runtime will prefer the VTID if present
  @VTID(17)
  com.microsoft.outlook.MAPIFolder getFolderFromID(
          String entryIDFolder,
          @Optional @MarshalAs(NativeType.VARIANT) Object entryIDStore);


  /**
   * @param entryIDItem Mandatory java.lang.String parameter.
   * @param entryIDStore Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(8457) //= 0x2109. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject getItemFromID(
          String entryIDItem,
          @Optional @MarshalAs(NativeType.VARIANT) Object entryIDStore);


  /**
   * @param entryID Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.microsoft.outlook.Recipient
   */

  @DISPID(8455) //= 0x2107. The runtime will prefer the VTID if present
  @VTID(19)
  Recipient getRecipientFromID(
          String entryID);


  /**
   * @param recipient Mandatory com.microsoft.outlook.Recipient parameter.
   * @param folderType Mandatory com.microsoft.outlook.OlDefaultFolders parameter.
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(8460) //= 0x210c. The runtime will prefer the VTID if present
  @VTID(20)
  com.microsoft.outlook.MAPIFolder getSharedDefaultFolder(
          Recipient recipient,
          com.microsoft.outlook.OlDefaultFolders folderType);


  /**
   */

  @DISPID(8454) //= 0x2106. The runtime will prefer the VTID if present
  @VTID(21)
  void logoff();


  /**
   * @param profile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showDialog Optional parameter. Default value is com4j.Variant.getMissing()
   * @param newSession Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(8453) //= 0x2105. The runtime will prefer the VTID if present
  @VTID(22)
  void logon(
          @Optional @MarshalAs(NativeType.VARIANT) Object profile,
          @Optional @MarshalAs(NativeType.VARIANT) Object password,
          @Optional @MarshalAs(NativeType.VARIANT) Object showDialog,
          @Optional @MarshalAs(NativeType.VARIANT) Object newSession);


  /**
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(8462) //= 0x210e. The runtime will prefer the VTID if present
  @VTID(23)
  com.microsoft.outlook.MAPIFolder pickFolder();


  /**
   */

  @DISPID(8471) //= 0x2117. The runtime will prefer the VTID if present
  @VTID(24)
  void refreshRemoteHeaders();


  /**
   * <p>
   * Getter method for the COM property "SyncObjects"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.SyncObjects
   */

  @DISPID(8472) //= 0x2118. The runtime will prefer the VTID if present
  @VTID(25)
  com.microsoft.outlook.SyncObjects syncObjects();


  /**
   * @param store Mandatory java.lang.Object parameter.
   */

  @DISPID(8473) //= 0x2119. The runtime will prefer the VTID if present
  @VTID(26)
  void addStore(
          @MarshalAs(NativeType.VARIANT) Object store);


  /**
   * @param folder Mandatory com.microsoft.outlook.MAPIFolder parameter.
   */

  @DISPID(8474) //= 0x211a. The runtime will prefer the VTID if present
  @VTID(27)
  void removeStore(
          com.microsoft.outlook.MAPIFolder folder);


  /**
   * <p>
   * Getter method for the COM property "Offline"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64076) //= 0xfa4c. The runtime will prefer the VTID if present
  @VTID(28)
  boolean offline();


  /**
   * @param contactItem Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(64013) //= 0xfa0d. The runtime will prefer the VTID if present
  @VTID(29)
  void dial(
          @Optional @MarshalAs(NativeType.VARIANT) Object contactItem);


  /**
   * <p>
   * Getter method for the COM property "MAPIOBJECT"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61696) //= 0xf100. The runtime will prefer the VTID if present
  @VTID(30)
  Com4jObject mapiobject();


  /**
   * <p>
   * Getter method for the COM property "ExchangeConnectionMode"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlExchangeConnectionMode
   */

  @DISPID(64193) //= 0xfac1. The runtime will prefer the VTID if present
  @VTID(31)
  com.microsoft.outlook.OlExchangeConnectionMode exchangeConnectionMode();


  /**
   * @param store Mandatory java.lang.Object parameter.
   * @param type Mandatory com.microsoft.outlook.OlStoreType parameter.
   */

  @DISPID(64197) //= 0xfac5. The runtime will prefer the VTID if present
  @VTID(32)
  void addStoreEx(
          @MarshalAs(NativeType.VARIANT) Object store,
          com.microsoft.outlook.OlStoreType type);


  /**
   * <p>
   * Getter method for the COM property "Accounts"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Accounts
   */

  @DISPID(64208) //= 0xfad0. The runtime will prefer the VTID if present
  @VTID(33)
  _Accounts accounts();


  /**
   * <p>
   * Getter method for the COM property "CurrentProfileName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64213) //= 0xfad5. The runtime will prefer the VTID if present
  @VTID(34)
  String currentProfileName();


  /**
   * <p>
   * Getter method for the COM property "Stores"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Stores
   */

  @DISPID(64216) //= 0xfad8. The runtime will prefer the VTID if present
  @VTID(35)
  _Stores stores();


  /**
   * @return  Returns a value of type com.microsoft.outlook._SelectNamesDialog
   */

  @DISPID(64225) //= 0xfae1. The runtime will prefer the VTID if present
  @VTID(36)
  com.microsoft.outlook._SelectNamesDialog getSelectNamesDialog();


  /**
   * @param showProgressDialog Mandatory boolean parameter.
   */

  @DISPID(64215) //= 0xfad7. The runtime will prefer the VTID if present
  @VTID(37)
  void sendAndReceive(
          boolean showProgressDialog);


  /**
   * <p>
   * Getter method for the COM property "DefaultStore"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Store
   */

  @DISPID(64236) //= 0xfaec. The runtime will prefer the VTID if present
  @VTID(38)
  _Store defaultStore();


  /**
   * @param id Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.microsoft.outlook.AddressEntry
   */

  @DISPID(64260) //= 0xfb04. The runtime will prefer the VTID if present
  @VTID(39)
  com.microsoft.outlook.AddressEntry getAddressEntryFromID(
          String id);


  /**
   * @return  Returns a value of type com.microsoft.outlook.AddressList
   */

  @DISPID(64261) //= 0xfb05. The runtime will prefer the VTID if present
  @VTID(40)
  com.microsoft.outlook.AddressList getGlobalAddressList();


  /**
   * @param id Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.microsoft.outlook._Store
   */

  @DISPID(64262) //= 0xfb06. The runtime will prefer the VTID if present
  @VTID(41)
  _Store getStoreFromID(
          String id);


  /**
   * <p>
   * Getter method for the COM property "Categories"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Categories
   */

  @DISPID(64421) //= 0xfba5. The runtime will prefer the VTID if present
  @VTID(42)
  com.microsoft.outlook._Categories categories();


  /**
   * @param path Mandatory java.lang.String parameter.
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param downloadAttachments Optional parameter. Default value is com4j.Variant.getMissing()
   * @param useTTL Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(64502) //= 0xfbf6. The runtime will prefer the VTID if present
  @VTID(43)
  com.microsoft.outlook.MAPIFolder openSharedFolder(
          String path,
          @Optional @MarshalAs(NativeType.VARIANT) Object name,
          @Optional @MarshalAs(NativeType.VARIANT) Object downloadAttachments,
          @Optional @MarshalAs(NativeType.VARIANT) Object useTTL);


  /**
   * @param path Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(64503) //= 0xfbf7. The runtime will prefer the VTID if present
  @VTID(44)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject openSharedItem(
          String path);


  /**
   * @param context Mandatory java.lang.Object parameter.
   * @param provider Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com.microsoft.outlook._SharingItem
   */

  @DISPID(64484) //= 0xfbe4. The runtime will prefer the VTID if present
  @VTID(45)
  com.microsoft.outlook._SharingItem createSharingItem(
          @MarshalAs(NativeType.VARIANT) Object context,
          @Optional @MarshalAs(NativeType.VARIANT) Object provider);


  /**
   * <p>
   * Getter method for the COM property "ExchangeMailboxServerName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64517) //= 0xfc05. The runtime will prefer the VTID if present
  @VTID(46)
  String exchangeMailboxServerName();


  /**
   * <p>
   * Getter method for the COM property "ExchangeMailboxServerVersion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64516) //= 0xfc04. The runtime will prefer the VTID if present
  @VTID(47)
  String exchangeMailboxServerVersion();


  /**
   * @param firstEntryID Mandatory java.lang.String parameter.
   * @param secondEntryID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(64508) //= 0xfbfc. The runtime will prefer the VTID if present
  @VTID(48)
  boolean compareEntryIDs(
          String firstEntryID,
          String secondEntryID);


  /**
   * <p>
   * Getter method for the COM property "AutoDiscoverXml"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64515) //= 0xfc03. The runtime will prefer the VTID if present
  @VTID(49)
  String autoDiscoverXml();


  /**
   * <p>
   * Getter method for the COM property "AutoDiscoverConnectionMode"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlAutoDiscoverConnectionMode
   */

  @DISPID(64558) //= 0xfc2e. The runtime will prefer the VTID if present
  @VTID(50)
  com.microsoft.outlook.OlAutoDiscoverConnectionMode autoDiscoverConnectionMode();


  /**
   * @param addressEntry Mandatory com.microsoft.outlook.AddressEntry parameter.
   * @return  Returns a value of type com.microsoft.outlook.ContactCard
   */

  @DISPID(64645) //= 0xfc85. The runtime will prefer the VTID if present
  @VTID(51)
  com.microsoft.outlook.ContactCard createContactCard(
          com.microsoft.outlook.AddressEntry addressEntry);


  // Properties:
}
