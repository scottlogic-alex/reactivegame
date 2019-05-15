package com.microsoft.outlook;

import com4j.*;
import com4j.stdole.IPictureDisp;

@IID("{00063006-0000-0000-C000-000000000046}")
public interface MAPIFolder extends Com4jObject {
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
   * Getter method for the COM property "DefaultItemType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlItemType
   */

  @DISPID(12550) //= 0x3106. The runtime will prefer the VTID if present
  @VTID(11)
  com.microsoft.outlook.OlItemType defaultItemType();


  /**
   * <p>
   * Getter method for the COM property "DefaultMessageClass"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12551) //= 0x3107. The runtime will prefer the VTID if present
  @VTID(12)
  String defaultMessageClass();


  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12292) //= 0x3004. The runtime will prefer the VTID if present
  @VTID(13)
  String description();


  /**
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param description Mandatory java.lang.String parameter.
   */

  @DISPID(12292) //= 0x3004. The runtime will prefer the VTID if present
  @VTID(14)
  void description(
          String description);


  /**
   * <p>
   * Getter method for the COM property "EntryID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(61470) //= 0xf01e. The runtime will prefer the VTID if present
  @VTID(15)
  String entryID();


  /**
   * <p>
   * Getter method for the COM property "Folders"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Folders
   */

  @DISPID(8451) //= 0x2103. The runtime will prefer the VTID if present
  @VTID(16)
  _Folders folders();


  /**
   * <p>
   * Getter method for the COM property "Items"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Items
   */

  @DISPID(12544) //= 0x3100. The runtime will prefer the VTID if present
  @VTID(17)
  _Items items();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(18)
  String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(19)
  void name(
          String name);


  /**
   * <p>
   * Getter method for the COM property "StoreID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12552) //= 0x3108. The runtime will prefer the VTID if present
  @VTID(20)
  String storeID();


  /**
   * <p>
   * Getter method for the COM property "UnReadItemCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(13827) //= 0x3603. The runtime will prefer the VTID if present
  @VTID(21)
  int unReadItemCount();


  /**
   * @param destinationFolder Mandatory com.microsoft.outlook.MAPIFolder parameter.
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(61490) //= 0xf032. The runtime will prefer the VTID if present
  @VTID(22)
  MAPIFolder copyTo(
          MAPIFolder destinationFolder);


  /**
   */

  @DISPID(61509) //= 0xf045. The runtime will prefer the VTID if present
  @VTID(23)
  void delete();


  /**
   */

  @DISPID(12548) //= 0x3104. The runtime will prefer the VTID if present
  @VTID(24)
  void display();


  /**
   * @param displayMode Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com.microsoft.outlook._Explorer
   */

  @DISPID(12545) //= 0x3101. The runtime will prefer the VTID if present
  @VTID(25)
  _Explorer getExplorer(
          @Optional @MarshalAs(NativeType.VARIANT) Object displayMode);


  /**
   * @param destinationFolder Mandatory com.microsoft.outlook.MAPIFolder parameter.
   */

  @DISPID(61492) //= 0xf034. The runtime will prefer the VTID if present
  @VTID(26)
  void moveTo(
          MAPIFolder destinationFolder);


  /**
   * <p>
   * Getter method for the COM property "UserPermissions"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(12561) //= 0x3111. The runtime will prefer the VTID if present
  @VTID(27)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject userPermissions();


  /**
   * <p>
   * Getter method for the COM property "WebViewOn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(12562) //= 0x3112. The runtime will prefer the VTID if present
  @VTID(28)
  boolean webViewOn();


  /**
   * <p>
   * Setter method for the COM property "WebViewOn"
   * </p>
   * @param webViewOn Mandatory boolean parameter.
   */

  @DISPID(12562) //= 0x3112. The runtime will prefer the VTID if present
  @VTID(29)
  void webViewOn(
          boolean webViewOn);


  /**
   * <p>
   * Getter method for the COM property "WebViewURL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12563) //= 0x3113. The runtime will prefer the VTID if present
  @VTID(30)
  String webViewURL();


  /**
   * <p>
   * Setter method for the COM property "WebViewURL"
   * </p>
   * @param webViewURL Mandatory java.lang.String parameter.
   */

  @DISPID(12563) //= 0x3113. The runtime will prefer the VTID if present
  @VTID(31)
  void webViewURL(
          String webViewURL);


  /**
   * <p>
   * Getter method for the COM property "WebViewAllowNavigation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(12564) //= 0x3114. The runtime will prefer the VTID if present
  @VTID(32)
  boolean webViewAllowNavigation();


  /**
   * <p>
   * Setter method for the COM property "WebViewAllowNavigation"
   * </p>
   * @param webViewAllowNavigation Mandatory boolean parameter.
   */

  @DISPID(12564) //= 0x3114. The runtime will prefer the VTID if present
  @VTID(33)
  void webViewAllowNavigation(
          boolean webViewAllowNavigation);


  /**
   */

  @DISPID(12565) //= 0x3115. The runtime will prefer the VTID if present
  @VTID(34)
  void addToPFFavorites();


  /**
   * <p>
   * Getter method for the COM property "AddressBookName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64110) //= 0xfa6e. The runtime will prefer the VTID if present
  @VTID(35)
  String addressBookName();


  /**
   * <p>
   * Setter method for the COM property "AddressBookName"
   * </p>
   * @param addressBookName Mandatory java.lang.String parameter.
   */

  @DISPID(64110) //= 0xfa6e. The runtime will prefer the VTID if present
  @VTID(36)
  void addressBookName(
          String addressBookName);


  /**
   * <p>
   * Getter method for the COM property "ShowAsOutlookAB"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64111) //= 0xfa6f. The runtime will prefer the VTID if present
  @VTID(37)
  boolean showAsOutlookAB();


  /**
   * <p>
   * Setter method for the COM property "ShowAsOutlookAB"
   * </p>
   * @param showAsOutlookAB Mandatory boolean parameter.
   */

  @DISPID(64111) //= 0xfa6f. The runtime will prefer the VTID if present
  @VTID(38)
  void showAsOutlookAB(
          boolean showAsOutlookAB);


  /**
   * <p>
   * Getter method for the COM property "FolderPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64120) //= 0xfa78. The runtime will prefer the VTID if present
  @VTID(39)
  String folderPath();


  /**
   * @param fNoUI Optional parameter. Default value is com4j.Variant.getMissing()
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(64097) //= 0xfa61. The runtime will prefer the VTID if present
  @VTID(40)
  void addToFavorites(
          @Optional @MarshalAs(NativeType.VARIANT) Object fNoUI,
          @Optional @MarshalAs(NativeType.VARIANT) Object name);


  /**
   * <p>
   * Getter method for the COM property "InAppFolderSyncObject"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64075) //= 0xfa4b. The runtime will prefer the VTID if present
  @VTID(41)
  boolean inAppFolderSyncObject();


  /**
   * <p>
   * Setter method for the COM property "InAppFolderSyncObject"
   * </p>
   * @param inAppFolderSyncObject Mandatory boolean parameter.
   */

  @DISPID(64075) //= 0xfa4b. The runtime will prefer the VTID if present
  @VTID(42)
  void inAppFolderSyncObject(
          boolean inAppFolderSyncObject);


  /**
   * <p>
   * Getter method for the COM property "CurrentView"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.View
   */

  @DISPID(8704) //= 0x2200. The runtime will prefer the VTID if present
  @VTID(43)
  View currentView();


  /**
   * <p>
   * Getter method for the COM property "CustomViewsOnly"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64070) //= 0xfa46. The runtime will prefer the VTID if present
  @VTID(44)
  boolean customViewsOnly();


  /**
   * <p>
   * Setter method for the COM property "CustomViewsOnly"
   * </p>
   * @param customViewsOnly Mandatory boolean parameter.
   */

  @DISPID(64070) //= 0xfa46. The runtime will prefer the VTID if present
  @VTID(45)
  void customViewsOnly(
          boolean customViewsOnly);


  /**
   * <p>
   * Getter method for the COM property "Views"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Views
   */

  @DISPID(12553) //= 0x3109. The runtime will prefer the VTID if present
  @VTID(46)
  _Views views();


  @VTID(46)
  @ReturnValue(defaultPropertyThrough={_Views.class})
  View views(
          @MarshalAs(NativeType.VARIANT) Object index);

  /**
   * <p>
   * Getter method for the COM property "MAPIOBJECT"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61696) //= 0xf100. The runtime will prefer the VTID if present
  @VTID(47)
  Com4jObject mapiobject();


  /**
   * <p>
   * Getter method for the COM property "FullFolderPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64145) //= 0xfa91. The runtime will prefer the VTID if present
  @VTID(48)
  String fullFolderPath();


  /**
   * <p>
   * Getter method for the COM property "IsSharePointFolder"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64182) //= 0xfab6. The runtime will prefer the VTID if present
  @VTID(49)
  boolean isSharePointFolder();


  /**
   * <p>
   * Getter method for the COM property "ShowItemCount"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlShowItemCount
   */

  @DISPID(64194) //= 0xfac2. The runtime will prefer the VTID if present
  @VTID(50)
  com.microsoft.outlook.OlShowItemCount showItemCount();


  /**
   * <p>
   * Setter method for the COM property "ShowItemCount"
   * </p>
   * @param showItemCount Mandatory com.microsoft.outlook.OlShowItemCount parameter.
   */

  @DISPID(64194) //= 0xfac2. The runtime will prefer the VTID if present
  @VTID(51)
  void showItemCount(
          com.microsoft.outlook.OlShowItemCount showItemCount);


  /**
   * <p>
   * Getter method for the COM property "Store"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Store
   */

  @DISPID(64217) //= 0xfad9. The runtime will prefer the VTID if present
  @VTID(52)
  _Store store();


  /**
   * @param storageIdentifier Mandatory java.lang.String parameter.
   * @param storageIdentifierType Mandatory com.microsoft.outlook.OlStorageIdentifierType parameter.
   * @return  Returns a value of type com.microsoft.outlook._StorageItem
   */

  @DISPID(64264) //= 0xfb08. The runtime will prefer the VTID if present
  @VTID(53)
  com.microsoft.outlook._StorageItem getStorage(
          String storageIdentifier,
          com.microsoft.outlook.OlStorageIdentifierType storageIdentifierType);


  /**
   * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tableContents Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com.microsoft.outlook._Table
   */

  @DISPID(64285) //= 0xfb1d. The runtime will prefer the VTID if present
  @VTID(54)
  _Table getTable(
          @Optional @MarshalAs(NativeType.VARIANT) Object filter,
          @Optional @MarshalAs(NativeType.VARIANT) Object tableContents);


  /**
   * <p>
   * Getter method for the COM property "PropertyAccessor"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._PropertyAccessor
   */

  @DISPID(64253) //= 0xfafd. The runtime will prefer the VTID if present
  @VTID(55)
  com.microsoft.outlook._PropertyAccessor propertyAccessor();


  /**
   * @return  Returns a value of type com.microsoft.outlook._CalendarSharing
   */

  @DISPID(64418) //= 0xfba2. The runtime will prefer the VTID if present
  @VTID(56)
  com.microsoft.outlook._CalendarSharing getCalendarExporter();


  /**
   * <p>
   * Getter method for the COM property "UserDefinedProperties"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._UserDefinedProperties
   */

  @DISPID(63510) //= 0xf816. The runtime will prefer the VTID if present
  @VTID(57)
  com.microsoft.outlook._UserDefinedProperties userDefinedProperties();


  /**
   * @return  Returns a value of type IPictureDisp
   */

  @DISPID(64572) //= 0xfc3c. The runtime will prefer the VTID if present
  @VTID(58)
  IPictureDisp getCustomIcon();


  /**
   * @param picture Mandatory IPictureDisp parameter.
   */

  @DISPID(64573) //= 0xfc3d. The runtime will prefer the VTID if present
  @VTID(59)
  void setCustomIcon(
          IPictureDisp picture);


  // Properties:
}
