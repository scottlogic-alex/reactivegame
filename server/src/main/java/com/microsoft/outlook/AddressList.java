package com.microsoft.outlook;

import com4j.*;

@IID("{00063049-0000-0000-C000-000000000046}")
public interface AddressList extends Com4jObject {
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
   * Getter method for the COM property "AddressEntries"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.AddressEntries
   */

  @DISPID(256) //= 0x100. The runtime will prefer the VTID if present
  @VTID(11)
  com.microsoft.outlook.AddressEntries addressEntries();


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(61470) //= 0xf01e. The runtime will prefer the VTID if present
  @VTID(12)
  String id();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(91) //= 0x5b. The runtime will prefer the VTID if present
  @VTID(13)
  int index();


  /**
   * <p>
   * Getter method for the COM property "IsReadOnly"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(61463) //= 0xf017. The runtime will prefer the VTID if present
  @VTID(14)
  boolean isReadOnly();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(15)
  String name();


  /**
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(64250) //= 0xfafa. The runtime will prefer the VTID if present
  @VTID(16)
  MAPIFolder getContactsFolder();


  /**
   * <p>
   * Getter method for the COM property "AddressListType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlAddressListType
   */

  @DISPID(64237) //= 0xfaed. The runtime will prefer the VTID if present
  @VTID(17)
  com.microsoft.outlook.OlAddressListType addressListType();


  /**
   * <p>
   * Getter method for the COM property "ResolutionOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64238) //= 0xfaee. The runtime will prefer the VTID if present
  @VTID(18)
  int resolutionOrder();


  /**
   * <p>
   * Getter method for the COM property "IsInitialAddressList"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64248) //= 0xfaf8. The runtime will prefer the VTID if present
  @VTID(19)
  boolean isInitialAddressList();


  /**
   * <p>
   * Getter method for the COM property "PropertyAccessor"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._PropertyAccessor
   */

  @DISPID(64253) //= 0xfafd. The runtime will prefer the VTID if present
  @VTID(20)
  com.microsoft.outlook._PropertyAccessor propertyAccessor();


  // Properties:
}
