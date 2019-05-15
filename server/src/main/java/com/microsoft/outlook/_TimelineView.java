package com.microsoft.outlook;

import com4j.*;

@IID("{0006309C-0000-0000-C000-000000000046}")
public interface _TimelineView extends Com4jObject {
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
  OlViewType viewType();


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
   * Getter method for the COM property "StartField"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8449) //= 0x2101. The runtime will prefer the VTID if present
  @VTID(30)
  String startField();


  /**
   * <p>
   * Setter method for the COM property "StartField"
   * </p>
   * @param startField Mandatory java.lang.String parameter.
   */

  @DISPID(8449) //= 0x2101. The runtime will prefer the VTID if present
  @VTID(31)
  void startField(
          String startField);


  /**
   * <p>
   * Getter method for the COM property "EndField"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64379) //= 0xfb7b. The runtime will prefer the VTID if present
  @VTID(32)
  String endField();


  /**
   * <p>
   * Setter method for the COM property "EndField"
   * </p>
   * @param endField Mandatory java.lang.String parameter.
   */

  @DISPID(64379) //= 0xfb7b. The runtime will prefer the VTID if present
  @VTID(33)
  void endField(
          String endField);


  /**
   * <p>
   * Getter method for the COM property "GroupByFields"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._OrderFields
   */

  @DISPID(64344) //= 0xfb58. The runtime will prefer the VTID if present
  @VTID(34)
  _OrderFields groupByFields();


  /**
   * <p>
   * Getter method for the COM property "DefaultExpandCollapseSetting"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlDefaultExpandCollapseSetting
   */

  @DISPID(64384) //= 0xfb80. The runtime will prefer the VTID if present
  @VTID(35)
  com.microsoft.outlook.OlDefaultExpandCollapseSetting defaultExpandCollapseSetting();


  /**
   * <p>
   * Setter method for the COM property "DefaultExpandCollapseSetting"
   * </p>
   * @param defaultExpandCollapseSetting Mandatory com.microsoft.outlook.OlDefaultExpandCollapseSetting parameter.
   */

  @DISPID(64384) //= 0xfb80. The runtime will prefer the VTID if present
  @VTID(36)
  void defaultExpandCollapseSetting(
          com.microsoft.outlook.OlDefaultExpandCollapseSetting defaultExpandCollapseSetting);


  /**
   * <p>
   * Getter method for the COM property "ShowWeekNumbers"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64373) //= 0xfb75. The runtime will prefer the VTID if present
  @VTID(37)
  boolean showWeekNumbers();


  /**
   * <p>
   * Setter method for the COM property "ShowWeekNumbers"
   * </p>
   * @param showWeekNumbers Mandatory boolean parameter.
   */

  @DISPID(64373) //= 0xfb75. The runtime will prefer the VTID if present
  @VTID(38)
  void showWeekNumbers(
          boolean showWeekNumbers);


  /**
   * <p>
   * Getter method for the COM property "MaxLabelWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64043) //= 0xfa2b. The runtime will prefer the VTID if present
  @VTID(39)
  int maxLabelWidth();


  /**
   * <p>
   * Setter method for the COM property "MaxLabelWidth"
   * </p>
   * @param maxLabelWidth Mandatory int parameter.
   */

  @DISPID(64043) //= 0xfa2b. The runtime will prefer the VTID if present
  @VTID(40)
  void maxLabelWidth(
          int maxLabelWidth);


  /**
   * <p>
   * Getter method for the COM property "ShowLabelWhenViewingByMonth"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64372) //= 0xfb74. The runtime will prefer the VTID if present
  @VTID(41)
  boolean showLabelWhenViewingByMonth();


  /**
   * <p>
   * Setter method for the COM property "ShowLabelWhenViewingByMonth"
   * </p>
   * @param showLabelWhenViewingByMonth Mandatory boolean parameter.
   */

  @DISPID(64372) //= 0xfb74. The runtime will prefer the VTID if present
  @VTID(42)
  void showLabelWhenViewingByMonth(
          boolean showLabelWhenViewingByMonth);


  /**
   * <p>
   * Getter method for the COM property "UpperScaleFont"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._ViewFont
   */

  @DISPID(64040) //= 0xfa28. The runtime will prefer the VTID if present
  @VTID(43)
  _ViewFont upperScaleFont();


  /**
   * <p>
   * Getter method for the COM property "LowerScaleFont"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._ViewFont
   */

  @DISPID(64044) //= 0xfa2c. The runtime will prefer the VTID if present
  @VTID(44)
  _ViewFont lowerScaleFont();


  /**
   * <p>
   * Getter method for the COM property "ItemFont"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._ViewFont
   */

  @DISPID(64045) //= 0xfa2d. The runtime will prefer the VTID if present
  @VTID(45)
  _ViewFont itemFont();


  /**
   * <p>
   * Getter method for the COM property "TimelineViewMode"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlTimelineViewMode
   */

  @DISPID(64392) //= 0xfb88. The runtime will prefer the VTID if present
  @VTID(46)
  com.microsoft.outlook.OlTimelineViewMode timelineViewMode();


  /**
   * <p>
   * Setter method for the COM property "TimelineViewMode"
   * </p>
   * @param timelineViewMode Mandatory com.microsoft.outlook.OlTimelineViewMode parameter.
   */

  @DISPID(64392) //= 0xfb88. The runtime will prefer the VTID if present
  @VTID(47)
  void timelineViewMode(
          com.microsoft.outlook.OlTimelineViewMode timelineViewMode);


  // Properties:
}
