package com.microsoft.outlook;

import com4j.*;

@IID("{000630C8-0000-0000-C000-000000000046}")
public interface _SelectNamesDialog extends Com4jObject {
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
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64226) //= 0xfae2. The runtime will prefer the VTID if present
  @VTID(11)
  String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param caption Mandatory java.lang.String parameter.
   */

  @DISPID(64226) //= 0xfae2. The runtime will prefer the VTID if present
  @VTID(12)
  void caption(
          String caption);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(61473) //= 0xf021. The runtime will prefer the VTID if present
  @VTID(13)
  boolean display();


  /**
   * <p>
   * Getter method for the COM property "Recipients"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Recipients
   */

  @DISPID(63508) //= 0xf814. The runtime will prefer the VTID if present
  @VTID(14)
  Recipients recipients();


  /**
   * <p>
   * Setter method for the COM property "Recipients"
   * </p>
   * @param recipients Mandatory com.microsoft.outlook.Recipients parameter.
   */

  @DISPID(63508) //= 0xf814. The runtime will prefer the VTID if present
  @VTID(15)
  void recipients(
          Recipients recipients);


  /**
   * <p>
   * Getter method for the COM property "BccLabel"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64227) //= 0xfae3. The runtime will prefer the VTID if present
  @VTID(16)
  String bccLabel();


  /**
   * <p>
   * Setter method for the COM property "BccLabel"
   * </p>
   * @param bccLabel Mandatory java.lang.String parameter.
   */

  @DISPID(64227) //= 0xfae3. The runtime will prefer the VTID if present
  @VTID(17)
  void bccLabel(
          String bccLabel);


  /**
   * <p>
   * Getter method for the COM property "CcLabel"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64228) //= 0xfae4. The runtime will prefer the VTID if present
  @VTID(18)
  String ccLabel();


  /**
   * <p>
   * Setter method for the COM property "CcLabel"
   * </p>
   * @param ccLabel Mandatory java.lang.String parameter.
   */

  @DISPID(64228) //= 0xfae4. The runtime will prefer the VTID if present
  @VTID(19)
  void ccLabel(
          String ccLabel);


  /**
   * <p>
   * Getter method for the COM property "ToLabel"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64229) //= 0xfae5. The runtime will prefer the VTID if present
  @VTID(20)
  String toLabel();


  /**
   * <p>
   * Setter method for the COM property "ToLabel"
   * </p>
   * @param toLabel Mandatory java.lang.String parameter.
   */

  @DISPID(64229) //= 0xfae5. The runtime will prefer the VTID if present
  @VTID(21)
  void toLabel(
          String toLabel);


  /**
   * <p>
   * Getter method for the COM property "AllowMultipleSelection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64230) //= 0xfae6. The runtime will prefer the VTID if present
  @VTID(22)
  boolean allowMultipleSelection();


  /**
   * <p>
   * Setter method for the COM property "AllowMultipleSelection"
   * </p>
   * @param allowMultipleSelection Mandatory boolean parameter.
   */

  @DISPID(64230) //= 0xfae6. The runtime will prefer the VTID if present
  @VTID(23)
  void allowMultipleSelection(
          boolean allowMultipleSelection);


  /**
   * <p>
   * Getter method for the COM property "ForceResolution"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64231) //= 0xfae7. The runtime will prefer the VTID if present
  @VTID(24)
  boolean forceResolution();


  /**
   * <p>
   * Setter method for the COM property "ForceResolution"
   * </p>
   * @param forceResolution Mandatory boolean parameter.
   */

  @DISPID(64231) //= 0xfae7. The runtime will prefer the VTID if present
  @VTID(25)
  void forceResolution(
          boolean forceResolution);


  /**
   * <p>
   * Getter method for the COM property "ShowOnlyInitialAddressList"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64232) //= 0xfae8. The runtime will prefer the VTID if present
  @VTID(26)
  boolean showOnlyInitialAddressList();


  /**
   * <p>
   * Setter method for the COM property "ShowOnlyInitialAddressList"
   * </p>
   * @param showOnlyInitialAddressList Mandatory boolean parameter.
   */

  @DISPID(64232) //= 0xfae8. The runtime will prefer the VTID if present
  @VTID(27)
  void showOnlyInitialAddressList(
          boolean showOnlyInitialAddressList);


  /**
   * <p>
   * Getter method for the COM property "NumberOfRecipientSelectors"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlRecipientSelectors
   */

  @DISPID(64233) //= 0xfae9. The runtime will prefer the VTID if present
  @VTID(28)
  com.microsoft.outlook.OlRecipientSelectors numberOfRecipientSelectors();


  /**
   * <p>
   * Setter method for the COM property "NumberOfRecipientSelectors"
   * </p>
   * @param numberOfRecipientSelectors Mandatory com.microsoft.outlook.OlRecipientSelectors parameter.
   */

  @DISPID(64233) //= 0xfae9. The runtime will prefer the VTID if present
  @VTID(29)
  void numberOfRecipientSelectors(
          com.microsoft.outlook.OlRecipientSelectors numberOfRecipientSelectors);


  /**
   * <p>
   * Getter method for the COM property "InitialAddressList"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.AddressList
   */

  @DISPID(64234) //= 0xfaea. The runtime will prefer the VTID if present
  @VTID(30)
  AddressList initialAddressList();


  /**
   * <p>
   * Setter method for the COM property "InitialAddressList"
   * </p>
   * @param initialAddressList Mandatory com.microsoft.outlook.AddressList parameter.
   */

  @DISPID(64234) //= 0xfaea. The runtime will prefer the VTID if present
  @VTID(31)
  void initialAddressList(
          AddressList initialAddressList);


  /**
   * @param defaultMode Mandatory com.microsoft.outlook.OlDefaultSelectNamesDisplayMode parameter.
   */

  @DISPID(64235) //= 0xfaeb. The runtime will prefer the VTID if present
  @VTID(32)
  void setDefaultDisplayMode(
          com.microsoft.outlook.OlDefaultSelectNamesDisplayMode defaultMode);


  // Properties:
}
