package com.microsoft.outlook;

import com4j.*;

@IID("{0006304B-0000-0000-C000-000000000046}")
public interface AddressEntry extends Com4jObject {
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
  com.microsoft.outlook._ExchangeUser getExchangeUser();


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


  // Properties:
}
