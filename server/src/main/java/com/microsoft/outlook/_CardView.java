package com.microsoft.outlook;

import com4j.*;

@IID("{00063098-0000-0000-C000-000000000046}")
public interface _CardView extends Com4jObject {
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
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(11)
  void apply();


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param saveOption Optional parameter. Default value is 0
   * @return  Returns a value of type com.microsoft.outlook.View
   */

  @DISPID(61490) //= 0xf032. The runtime will prefer the VTID if present
  @VTID(12)
  View copy(
          String name,
          @Optional com.microsoft.outlook.OlViewSaveOption saveOption);


  /**
   */

  @DISPID(61514) //= 0xf04a. The runtime will prefer the VTID if present
  @VTID(13)
  void delete();


  /**
   */

  @DISPID(64068) //= 0xfa44. The runtime will prefer the VTID if present
  @VTID(14)
  void reset();


  /**
   */

  @DISPID(61512) //= 0xf048. The runtime will prefer the VTID if present
  @VTID(15)
  void save();


  /**
   * <p>
   * Getter method for the COM property "Language"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64065) //= 0xfa41. The runtime will prefer the VTID if present
  @VTID(16)
  String language();


  /**
   * <p>
   * Setter method for the COM property "Language"
   * </p>
   * @param language Mandatory java.lang.String parameter.
   */

  @DISPID(64065) //= 0xfa41. The runtime will prefer the VTID if present
  @VTID(17)
  void language(
          String language);


  /**
   * <p>
   * Getter method for the COM property "LockUserChanges"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64064) //= 0xfa40. The runtime will prefer the VTID if present
  @VTID(18)
  boolean lockUserChanges();


  /**
   * <p>
   * Setter method for the COM property "LockUserChanges"
   * </p>
   * @param lockUserChanges Mandatory boolean parameter.
   */

  @DISPID(64064) //= 0xfa40. The runtime will prefer the VTID if present
  @VTID(19)
  void lockUserChanges(
          boolean lockUserChanges);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(20)
  @DefaultMethod
  String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(21)
  @DefaultMethod
  void name(
          String name);


  /**
   * <p>
   * Getter method for the COM property "SaveOption"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlViewSaveOption
   */

  @DISPID(64063) //= 0xfa3f. The runtime will prefer the VTID if present
  @VTID(22)
  com.microsoft.outlook.OlViewSaveOption saveOption();


  /**
   * <p>
   * Getter method for the COM property "Standard"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64062) //= 0xfa3e. The runtime will prefer the VTID if present
  @VTID(23)
  boolean standard();


  /**
   * <p>
   * Getter method for the COM property "ViewType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlViewType
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(24)
  com.microsoft.outlook.OlViewType viewType();


  /**
   * <p>
   * Getter method for the COM property "XML"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64060) //= 0xfa3c. The runtime will prefer the VTID if present
  @VTID(25)
  String xml();


  /**
   * <p>
   * Setter method for the COM property "XML"
   * </p>
   * @param xml Mandatory java.lang.String parameter.
   */

  @DISPID(64060) //= 0xfa3c. The runtime will prefer the VTID if present
  @VTID(26)
  void xml(
          String xml);


  /**
   * @param date Mandatory java.util.Date parameter.
   */

  @DISPID(64054) //= 0xfa36. The runtime will prefer the VTID if present
  @VTID(27)
  void goToDate(
          java.util.Date date);


  /**
   * <p>
   * Getter method for the COM property "Filter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(409) //= 0x199. The runtime will prefer the VTID if present
  @VTID(28)
  String filter();


  /**
   * <p>
   * Setter method for the COM property "Filter"
   * </p>
   * @param filter Mandatory java.lang.String parameter.
   */

  @DISPID(409) //= 0x199. The runtime will prefer the VTID if present
  @VTID(29)
  void filter(
          String filter);


  /**
   * <p>
   * Getter method for the COM property "SortFields"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._OrderFields
   */

  @DISPID(64346) //= 0xfb5a. The runtime will prefer the VTID if present
  @VTID(30)
  com.microsoft.outlook._OrderFields sortFields();


  /**
   * <p>
   * Getter method for the COM property "AllowInCellEditing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64351) //= 0xfb5f. The runtime will prefer the VTID if present
  @VTID(31)
  boolean allowInCellEditing();


  /**
   * <p>
   * Setter method for the COM property "AllowInCellEditing"
   * </p>
   * @param allowInCellEditing Mandatory boolean parameter.
   */

  @DISPID(64351) //= 0xfb5f. The runtime will prefer the VTID if present
  @VTID(32)
  void allowInCellEditing(
          boolean allowInCellEditing);


  /**
   * <p>
   * Getter method for the COM property "ShowEmptyFields"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64374) //= 0xfb76. The runtime will prefer the VTID if present
  @VTID(33)
  boolean showEmptyFields();


  /**
   * <p>
   * Setter method for the COM property "ShowEmptyFields"
   * </p>
   * @param showEmptyFields Mandatory boolean parameter.
   */

  @DISPID(64374) //= 0xfb76. The runtime will prefer the VTID if present
  @VTID(34)
  void showEmptyFields(
          boolean showEmptyFields);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8471) //= 0x2117. The runtime will prefer the VTID if present
  @VTID(35)
  int width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param width Mandatory int parameter.
   */

  @DISPID(8471) //= 0x2117. The runtime will prefer the VTID if present
  @VTID(36)
  void width(
          int width);


  /**
   * <p>
   * Getter method for the COM property "MultiLineFieldHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64364) //= 0xfb6c. The runtime will prefer the VTID if present
  @VTID(37)
  int multiLineFieldHeight();


  /**
   * <p>
   * Setter method for the COM property "MultiLineFieldHeight"
   * </p>
   * @param multiLineFieldHeight Mandatory int parameter.
   */

  @DISPID(64364) //= 0xfb6c. The runtime will prefer the VTID if present
  @VTID(38)
  void multiLineFieldHeight(
          int multiLineFieldHeight);


  /**
   * <p>
   * Getter method for the COM property "ViewFields"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._ViewFields
   */

  @DISPID(64341) //= 0xfb55. The runtime will prefer the VTID if present
  @VTID(39)
  com.microsoft.outlook._ViewFields viewFields();


  /**
   * <p>
   * Getter method for the COM property "HeadingsFont"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._ViewFont
   */

  @DISPID(64377) //= 0xfb79. The runtime will prefer the VTID if present
  @VTID(40)
  com.microsoft.outlook._ViewFont headingsFont();


  /**
   * <p>
   * Getter method for the COM property "BodyFont"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._ViewFont
   */

  @DISPID(64378) //= 0xfb7a. The runtime will prefer the VTID if present
  @VTID(41)
  com.microsoft.outlook._ViewFont bodyFont();


  /**
   * <p>
   * Getter method for the COM property "AutoFormatRules"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._AutoFormatRules
   */

  @DISPID(64059) //= 0xfa3b. The runtime will prefer the VTID if present
  @VTID(42)
  com.microsoft.outlook._AutoFormatRules autoFormatRules();


  // Properties:
}
