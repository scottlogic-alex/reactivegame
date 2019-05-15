package com.microsoft.outlook;

import com4j.*;

@IID("{000630C7-0000-0000-C000-000000000046}")
public interface _Store extends Com4jObject {
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
   * Getter method for the COM property "DisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(11)
  String displayName();


  /**
   * <p>
   * Getter method for the COM property "StoreID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12552) //= 0x3108. The runtime will prefer the VTID if present
  @VTID(12)
  String storeID();


  /**
   * <p>
   * Getter method for the COM property "ExchangeStoreType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlExchangeStoreType
   */

  @DISPID(64218) //= 0xfada. The runtime will prefer the VTID if present
  @VTID(13)
  com.microsoft.outlook.OlExchangeStoreType exchangeStoreType();


  /**
   * <p>
   * Getter method for the COM property "FilePath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64221) //= 0xfadd. The runtime will prefer the VTID if present
  @VTID(14)
  String filePath();


  /**
   * <p>
   * Getter method for the COM property "IsCachedExchange"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64222) //= 0xfade. The runtime will prefer the VTID if present
  @VTID(15)
  boolean isCachedExchange();


  /**
   * <p>
   * Getter method for the COM property "IsDataFileStore"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64223) //= 0xfadf. The runtime will prefer the VTID if present
  @VTID(16)
  boolean isDataFileStore();


  /**
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(64219) //= 0xfadb. The runtime will prefer the VTID if present
  @VTID(17)
  com.microsoft.outlook.MAPIFolder getRootFolder();


  /**
   * @return  Returns a value of type com.microsoft.outlook._Folders
   */

  @DISPID(64220) //= 0xfadc. The runtime will prefer the VTID if present
  @VTID(18)
  com.microsoft.outlook._Folders getSearchFolders();


  /**
   * <p>
   * Getter method for the COM property "IsOpen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64224) //= 0xfae0. The runtime will prefer the VTID if present
  @VTID(19)
  boolean isOpen();


  /**
   * <p>
   * Getter method for the COM property "MAPIOBJECT"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61696) //= 0xf100. The runtime will prefer the VTID if present
  @VTID(20)
  Com4jObject mapiobject();


  /**
   * @return  Returns a value of type com.microsoft.outlook._Rules
   */

  @DISPID(64265) //= 0xfb09. The runtime will prefer the VTID if present
  @VTID(21)
  _Rules getRules();


  /**
   * <p>
   * Getter method for the COM property "PropertyAccessor"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._PropertyAccessor
   */

  @DISPID(64253) //= 0xfafd. The runtime will prefer the VTID if present
  @VTID(22)
  com.microsoft.outlook._PropertyAccessor propertyAccessor();


  /**
   * @param folderType Mandatory com.microsoft.outlook.OlSpecialFolders parameter.
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(8456) //= 0x2108. The runtime will prefer the VTID if present
  @VTID(23)
  com.microsoft.outlook.MAPIFolder getSpecialFolder(
          com.microsoft.outlook.OlSpecialFolders folderType);


  /**
   * <p>
   * Getter method for the COM property "IsInstantSearchEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64532) //= 0xfc14. The runtime will prefer the VTID if present
  @VTID(24)
  boolean isInstantSearchEnabled();


  /**
   */

  @DISPID(64590) //= 0xfc4e. The runtime will prefer the VTID if present
  @VTID(25)
  void refreshQuotaDisplay();


  /**
   * @param folderType Mandatory com.microsoft.outlook.OlDefaultFolders parameter.
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(64621) //= 0xfc6d. The runtime will prefer the VTID if present
  @VTID(26)
  com.microsoft.outlook.MAPIFolder getDefaultFolder(
          com.microsoft.outlook.OlDefaultFolders folderType);


  /**
   * <p>
   * Getter method for the COM property "IsConversationEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64630) //= 0xfc76. The runtime will prefer the VTID if present
  @VTID(27)
  boolean isConversationEnabled();


  /**
   * <p>
   * Getter method for the COM property "Categories"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Categories
   */

  @DISPID(64421) //= 0xfba5. The runtime will prefer the VTID if present
  @VTID(28)
  com.microsoft.outlook._Categories categories();


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param alias Mandatory java.lang.String parameter.
   * @param description Mandatory java.lang.String parameter.
   * @param fAutoSubscribeMembers Mandatory boolean parameter.
   * @param groupType Mandatory com.microsoft.outlook.OlUnifiedGroupType parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64669) //= 0xfc9d. The runtime will prefer the VTID if present
  @VTID(29)
  String createUnifiedGroup(
          String name,
          String alias,
          String description,
          boolean fAutoSubscribeMembers,
          com.microsoft.outlook.OlUnifiedGroupType groupType);


  /**
   * @param groupSmtpAddress Mandatory java.lang.String parameter.
   */

  @DISPID(64670) //= 0xfc9e. The runtime will prefer the VTID if present
  @VTID(30)
  void deleteUnifiedGroup(
          String groupSmtpAddress);


  // Properties:
}
