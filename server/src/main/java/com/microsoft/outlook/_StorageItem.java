package com.microsoft.outlook;

import com4j.*;

@IID("{000630CB-0000-0000-C000-000000000046}")
public interface _StorageItem extends Com4jObject {
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
   * Getter method for the COM property "CreationTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(12295) //= 0x3007. The runtime will prefer the VTID if present
  @VTID(11)
  java.util.Date creationTime();


  /**
   * <p>
   * Getter method for the COM property "LastModificationTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(12296) //= 0x3008. The runtime will prefer the VTID if present
  @VTID(12)
  java.util.Date lastModificationTime();


  /**
   * <p>
   * Getter method for the COM property "EntryID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(61470) //= 0xf01e. The runtime will prefer the VTID if present
  @VTID(13)
  String entryID();


  /**
   */

  @DISPID(61512) //= 0xf048. The runtime will prefer the VTID if present
  @VTID(14)
  void save();


  /**
   */

  @DISPID(61514) //= 0xf04a. The runtime will prefer the VTID if present
  @VTID(15)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Body"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(37120) //= 0x9100. The runtime will prefer the VTID if present
  @VTID(16)
  String body();


  /**
   * <p>
   * Setter method for the COM property "Body"
   * </p>
   * @param body Mandatory java.lang.String parameter.
   */

  @DISPID(37120) //= 0x9100. The runtime will prefer the VTID if present
  @VTID(17)
  void body(
          String body);


  /**
   * <p>
   * Getter method for the COM property "Attachments"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Attachments
   */

  @DISPID(63509) //= 0xf815. The runtime will prefer the VTID if present
  @VTID(18)
  Attachments attachments();


  /**
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3592) //= 0xe08. The runtime will prefer the VTID if present
  @VTID(19)
  int size();


  /**
   * <p>
   * Getter method for the COM property "UserProperties"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.UserProperties
   */

  @DISPID(63510) //= 0xf816. The runtime will prefer the VTID if present
  @VTID(20)
  com.microsoft.outlook.UserProperties userProperties();


  /**
   * <p>
   * Getter method for the COM property "PropertyAccessor"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._PropertyAccessor
   */

  @DISPID(64253) //= 0xfafd. The runtime will prefer the VTID if present
  @VTID(21)
  com.microsoft.outlook._PropertyAccessor propertyAccessor();


  /**
   * <p>
   * Getter method for the COM property "Subject"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(22)
  String subject();


  /**
   * <p>
   * Setter method for the COM property "Subject"
   * </p>
   * @param subject Mandatory java.lang.String parameter.
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(23)
  void subject(
          String subject);


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(34236) //= 0x85bc. The runtime will prefer the VTID if present
  @VTID(24)
  String creator();


  /**
   * <p>
   * Setter method for the COM property "Creator"
   * </p>
   * @param creator Mandatory java.lang.String parameter.
   */

  @DISPID(34236) //= 0x85bc. The runtime will prefer the VTID if present
  @VTID(25)
  void creator(
          String creator);


  // Properties:
}
