package com.microsoft.outlook;

import com4j.*;
import com4j.stdole.IPictureDisp;

@IID("{000630C9-0000-0000-C000-000000000046}")
public interface _ExchangeUser extends Com4jObject {
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
   * Getter method for the COM property "Address"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12291) //= 0x3003. The runtime will prefer the VTID if present
  @VTID(11)
  String address();


  /**
   * <p>
   * Setter method for the COM property "Address"
   * </p>
   * @param address Mandatory java.lang.String parameter.
   */

  @DISPID(12291) //= 0x3003. The runtime will prefer the VTID if present
  @VTID(12)
  void address(
          String address);


  /**
   * <p>
   * Getter method for the COM property "DisplayType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlDisplayType
   */

  @DISPID(14592) //= 0x3900. The runtime will prefer the VTID if present
  @VTID(13)
  com.microsoft.outlook.OlDisplayType displayType();


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(61470) //= 0xf01e. The runtime will prefer the VTID if present
  @VTID(14)
  String id();


  /**
   * <p>
   * Getter method for the COM property "Manager"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.AddressEntry
   */

  @DISPID(771) //= 0x303. The runtime will prefer the VTID if present
  @VTID(15)
  AddressEntry manager();


  /**
   * <p>
   * Getter method for the COM property "MAPIOBJECT"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61696) //= 0xf100. The runtime will prefer the VTID if present
  @VTID(16)
  Com4jObject mapiobject();


  /**
   * <p>
   * Setter method for the COM property "MAPIOBJECT"
   * </p>
   * @param mapiobject Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(61696) //= 0xf100. The runtime will prefer the VTID if present
  @VTID(17)
  void mapiobject(
          Com4jObject mapiobject);


  /**
   * <p>
   * Getter method for the COM property "Members"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.AddressEntries
   */

  @DISPID(772) //= 0x304. The runtime will prefer the VTID if present
  @VTID(18)
  com.microsoft.outlook.AddressEntries members();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(19)
  String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(20)
  void name(
          String name);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12290) //= 0x3002. The runtime will prefer the VTID if present
  @VTID(21)
  String type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param type Mandatory java.lang.String parameter.
   */

  @DISPID(12290) //= 0x3002. The runtime will prefer the VTID if present
  @VTID(22)
  void type(
          String type);


  /**
   */

  @DISPID(770) //= 0x302. The runtime will prefer the VTID if present
  @VTID(23)
  void delete();


  /**
   * @param hWnd Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(769) //= 0x301. The runtime will prefer the VTID if present
  @VTID(24)
  void details(
          @Optional @MarshalAs(NativeType.VARIANT) Object hWnd);


  /**
   * @param start Mandatory java.util.Date parameter.
   * @param minPerChar Mandatory int parameter.
   * @param completeFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(774) //= 0x306. The runtime will prefer the VTID if present
  @VTID(25)
  String getFreeBusy(
          java.util.Date start,
          int minPerChar,
          @Optional @MarshalAs(NativeType.VARIANT) Object completeFormat);


  /**
   * @param makePermanent Optional parameter. Default value is com4j.Variant.getMissing()
   * @param refresh Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(768) //= 0x300. The runtime will prefer the VTID if present
  @VTID(26)
  void update(
          @Optional @MarshalAs(NativeType.VARIANT) Object makePermanent,
          @Optional @MarshalAs(NativeType.VARIANT) Object refresh);


  /**
   */

  @DISPID(775) //= 0x307. The runtime will prefer the VTID if present
  @VTID(27)
  void updateFreeBusy();


  /**
   * @return  Returns a value of type com.microsoft.outlook._ContactItem
   */

  @DISPID(64240) //= 0xfaf0. The runtime will prefer the VTID if present
  @VTID(28)
  _ContactItem getContact();


  /**
   * @return  Returns a value of type com.microsoft.outlook._ExchangeUser
   */

  @DISPID(64241) //= 0xfaf1. The runtime will prefer the VTID if present
  @VTID(29)
  _ExchangeUser getExchangeUser();


  /**
   * <p>
   * Getter method for the COM property "AddressEntryUserType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlAddressEntryUserType
   */

  @DISPID(64242) //= 0xfaf2. The runtime will prefer the VTID if present
  @VTID(30)
  com.microsoft.outlook.OlAddressEntryUserType addressEntryUserType();


  /**
   * @return  Returns a value of type com.microsoft.outlook._ExchangeDistributionList
   */

  @DISPID(64239) //= 0xfaef. The runtime will prefer the VTID if present
  @VTID(31)
  com.microsoft.outlook._ExchangeDistributionList getExchangeDistributionList();


  /**
   * <p>
   * Getter method for the COM property "PropertyAccessor"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._PropertyAccessor
   */

  @DISPID(64253) //= 0xfafd. The runtime will prefer the VTID if present
  @VTID(32)
  com.microsoft.outlook._PropertyAccessor propertyAccessor();


  /**
   * @return  Returns a value of type com.microsoft.outlook.AddressEntries
   */

  @DISPID(64243) //= 0xfaf3. The runtime will prefer the VTID if present
  @VTID(33)
  com.microsoft.outlook.AddressEntries getDirectReports();


  /**
   * @return  Returns a value of type com.microsoft.outlook.AddressEntries
   */

  @DISPID(64244) //= 0xfaf4. The runtime will prefer the VTID if present
  @VTID(34)
  com.microsoft.outlook.AddressEntries getMemberOfList();


  /**
   * <p>
   * Getter method for the COM property "Alias"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14848) //= 0x3a00. The runtime will prefer the VTID if present
  @VTID(35)
  String alias();


  /**
   * <p>
   * Getter method for the COM property "AssistantName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14896) //= 0x3a30. The runtime will prefer the VTID if present
  @VTID(36)
  String assistantName();


  /**
   * <p>
   * Setter method for the COM property "AssistantName"
   * </p>
   * @param assistantName Mandatory java.lang.String parameter.
   */

  @DISPID(14896) //= 0x3a30. The runtime will prefer the VTID if present
  @VTID(37)
  void assistantName(
          String assistantName);


  /**
   * <p>
   * Getter method for the COM property "BusinessTelephoneNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14856) //= 0x3a08. The runtime will prefer the VTID if present
  @VTID(38)
  String businessTelephoneNumber();


  /**
   * <p>
   * Setter method for the COM property "BusinessTelephoneNumber"
   * </p>
   * @param businessTelephoneNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14856) //= 0x3a08. The runtime will prefer the VTID if present
  @VTID(39)
  void businessTelephoneNumber(
          String businessTelephoneNumber);


  /**
   * <p>
   * Getter method for the COM property "City"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14887) //= 0x3a27. The runtime will prefer the VTID if present
  @VTID(40)
  String city();


  /**
   * <p>
   * Setter method for the COM property "City"
   * </p>
   * @param city Mandatory java.lang.String parameter.
   */

  @DISPID(14887) //= 0x3a27. The runtime will prefer the VTID if present
  @VTID(41)
  void city(
          String city);


  /**
   * <p>
   * Getter method for the COM property "Comments"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12292) //= 0x3004. The runtime will prefer the VTID if present
  @VTID(42)
  String comments();


  /**
   * <p>
   * Setter method for the COM property "Comments"
   * </p>
   * @param comments Mandatory java.lang.String parameter.
   */

  @DISPID(12292) //= 0x3004. The runtime will prefer the VTID if present
  @VTID(43)
  void comments(
          String comments);


  /**
   * <p>
   * Getter method for the COM property "CompanyName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14870) //= 0x3a16. The runtime will prefer the VTID if present
  @VTID(44)
  String companyName();


  /**
   * <p>
   * Setter method for the COM property "CompanyName"
   * </p>
   * @param companyName Mandatory java.lang.String parameter.
   */

  @DISPID(14870) //= 0x3a16. The runtime will prefer the VTID if present
  @VTID(45)
  void companyName(
          String companyName);


  /**
   * <p>
   * Getter method for the COM property "Department"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14872) //= 0x3a18. The runtime will prefer the VTID if present
  @VTID(46)
  String department();


  /**
   * <p>
   * Setter method for the COM property "Department"
   * </p>
   * @param department Mandatory java.lang.String parameter.
   */

  @DISPID(14872) //= 0x3a18. The runtime will prefer the VTID if present
  @VTID(47)
  void department(
          String department);


  /**
   * <p>
   * Getter method for the COM property "FirstName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14854) //= 0x3a06. The runtime will prefer the VTID if present
  @VTID(48)
  String firstName();


  /**
   * <p>
   * Setter method for the COM property "FirstName"
   * </p>
   * @param firstName Mandatory java.lang.String parameter.
   */

  @DISPID(14854) //= 0x3a06. The runtime will prefer the VTID if present
  @VTID(49)
  void firstName(
          String firstName);


  /**
   * <p>
   * Getter method for the COM property "JobTitle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14871) //= 0x3a17. The runtime will prefer the VTID if present
  @VTID(50)
  String jobTitle();


  /**
   * <p>
   * Setter method for the COM property "JobTitle"
   * </p>
   * @param jobTitle Mandatory java.lang.String parameter.
   */

  @DISPID(14871) //= 0x3a17. The runtime will prefer the VTID if present
  @VTID(51)
  void jobTitle(
          String jobTitle);


  /**
   * <p>
   * Getter method for the COM property "LastName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14865) //= 0x3a11. The runtime will prefer the VTID if present
  @VTID(52)
  String lastName();


  /**
   * <p>
   * Setter method for the COM property "LastName"
   * </p>
   * @param lastName Mandatory java.lang.String parameter.
   */

  @DISPID(14865) //= 0x3a11. The runtime will prefer the VTID if present
  @VTID(53)
  void lastName(
          String lastName);


  /**
   * <p>
   * Getter method for the COM property "MobileTelephoneNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14876) //= 0x3a1c. The runtime will prefer the VTID if present
  @VTID(54)
  String mobileTelephoneNumber();


  /**
   * <p>
   * Setter method for the COM property "MobileTelephoneNumber"
   * </p>
   * @param mobileTelephoneNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14876) //= 0x3a1c. The runtime will prefer the VTID if present
  @VTID(55)
  void mobileTelephoneNumber(
          String mobileTelephoneNumber);


  /**
   * <p>
   * Getter method for the COM property "OfficeLocation"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14873) //= 0x3a19. The runtime will prefer the VTID if present
  @VTID(56)
  String officeLocation();


  /**
   * <p>
   * Setter method for the COM property "OfficeLocation"
   * </p>
   * @param officeLocation Mandatory java.lang.String parameter.
   */

  @DISPID(14873) //= 0x3a19. The runtime will prefer the VTID if present
  @VTID(57)
  void officeLocation(
          String officeLocation);


  /**
   * <p>
   * Getter method for the COM property "PostalCode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14890) //= 0x3a2a. The runtime will prefer the VTID if present
  @VTID(58)
  String postalCode();


  /**
   * <p>
   * Setter method for the COM property "PostalCode"
   * </p>
   * @param postalCode Mandatory java.lang.String parameter.
   */

  @DISPID(14890) //= 0x3a2a. The runtime will prefer the VTID if present
  @VTID(59)
  void postalCode(
          String postalCode);


  /**
   * <p>
   * Getter method for the COM property "PrimarySmtpAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64245) //= 0xfaf5. The runtime will prefer the VTID if present
  @VTID(60)
  String primarySmtpAddress();


  /**
   * <p>
   * Getter method for the COM property "StateOrProvince"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14888) //= 0x3a28. The runtime will prefer the VTID if present
  @VTID(61)
  String stateOrProvince();


  /**
   * <p>
   * Setter method for the COM property "StateOrProvince"
   * </p>
   * @param stateOrProvince Mandatory java.lang.String parameter.
   */

  @DISPID(14888) //= 0x3a28. The runtime will prefer the VTID if present
  @VTID(62)
  void stateOrProvince(
          String stateOrProvince);


  /**
   * <p>
   * Getter method for the COM property "StreetAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14889) //= 0x3a29. The runtime will prefer the VTID if present
  @VTID(63)
  String streetAddress();


  /**
   * <p>
   * Setter method for the COM property "StreetAddress"
   * </p>
   * @param streetAddress Mandatory java.lang.String parameter.
   */

  @DISPID(14889) //= 0x3a29. The runtime will prefer the VTID if present
  @VTID(64)
  void streetAddress(
          String streetAddress);


  /**
   * @return  Returns a value of type com.microsoft.outlook._ExchangeUser
   */

  @DISPID(64249) //= 0xfaf9. The runtime will prefer the VTID if present
  @VTID(65)
  _ExchangeUser getExchangeUserManager();


  /**
   * <p>
   * Getter method for the COM property "YomiCompanyName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32814) //= 0x802e. The runtime will prefer the VTID if present
  @VTID(66)
  String yomiCompanyName();


  /**
   * <p>
   * Setter method for the COM property "YomiCompanyName"
   * </p>
   * @param yomiCompanyName Mandatory java.lang.String parameter.
   */

  @DISPID(32814) //= 0x802e. The runtime will prefer the VTID if present
  @VTID(67)
  void yomiCompanyName(
          String yomiCompanyName);


  /**
   * <p>
   * Getter method for the COM property "YomiFirstName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32812) //= 0x802c. The runtime will prefer the VTID if present
  @VTID(68)
  String yomiFirstName();


  /**
   * <p>
   * Setter method for the COM property "YomiFirstName"
   * </p>
   * @param yomiFirstName Mandatory java.lang.String parameter.
   */

  @DISPID(32812) //= 0x802c. The runtime will prefer the VTID if present
  @VTID(69)
  void yomiFirstName(
          String yomiFirstName);


  /**
   * <p>
   * Getter method for the COM property "YomiLastName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32813) //= 0x802d. The runtime will prefer the VTID if present
  @VTID(70)
  String yomiLastName();


  /**
   * <p>
   * Setter method for the COM property "YomiLastName"
   * </p>
   * @param yomiLastName Mandatory java.lang.String parameter.
   */

  @DISPID(32813) //= 0x802d. The runtime will prefer the VTID if present
  @VTID(71)
  void yomiLastName(
          String yomiLastName);


  /**
   * <p>
   * Getter method for the COM property "YomiDisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64487) //= 0xfbe7. The runtime will prefer the VTID if present
  @VTID(72)
  String yomiDisplayName();


  /**
   * <p>
   * Setter method for the COM property "YomiDisplayName"
   * </p>
   * @param yomiDisplayName Mandatory java.lang.String parameter.
   */

  @DISPID(64487) //= 0xfbe7. The runtime will prefer the VTID if present
  @VTID(73)
  void yomiDisplayName(
          String yomiDisplayName);


  /**
   * <p>
   * Getter method for the COM property "YomiDepartment"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64488) //= 0xfbe8. The runtime will prefer the VTID if present
  @VTID(74)
  String yomiDepartment();


  /**
   * <p>
   * Setter method for the COM property "YomiDepartment"
   * </p>
   * @param yomiDepartment Mandatory java.lang.String parameter.
   */

  @DISPID(64488) //= 0xfbe8. The runtime will prefer the VTID if present
  @VTID(75)
  void yomiDepartment(
          String yomiDepartment);


  /**
   * @return  Returns a value of type IPictureDisp
   */

  @DISPID(64631) //= 0xfc77. The runtime will prefer the VTID if present
  @VTID(76)
  IPictureDisp getPicture();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(64666) //= 0xfc9a. The runtime will prefer the VTID if present
  @VTID(77)
  boolean isUnifiedGroup();


  /**
   * @param groupType Mandatory com.microsoft.outlook.OlUnifiedGroupFolderType parameter.
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(64667) //= 0xfc9b. The runtime will prefer the VTID if present
  @VTID(78)
  MAPIFolder getUnifiedGroup(
          com.microsoft.outlook.OlUnifiedGroupFolderType groupType);


  /**
   * @param groupType Mandatory com.microsoft.outlook.OlUnifiedGroupFolderType parameter.
   * @param storeID Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(64668) //= 0xfc9c. The runtime will prefer the VTID if present
  @VTID(79)
  MAPIFolder getUnifiedGroupFromStore(
          com.microsoft.outlook.OlUnifiedGroupFolderType groupType,
          String storeID);


  // Properties:
}
