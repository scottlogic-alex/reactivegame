package com.microsoft.outlook;

import com4j.*;

@IID("{00063099-0000-0000-C000-000000000046}")
public interface _CalendarView extends Com4jObject {
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
   * Getter method for the COM property "CalendarViewMode"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlCalendarViewMode
   */

  @DISPID(64375) //= 0xfb77. The runtime will prefer the VTID if present
  @VTID(34)
  com.microsoft.outlook.OlCalendarViewMode calendarViewMode();


  /**
   * <p>
   * Setter method for the COM property "CalendarViewMode"
   * </p>
   * @param calendarViewMode Mandatory com.microsoft.outlook.OlCalendarViewMode parameter.
   */

  @DISPID(64375) //= 0xfb77. The runtime will prefer the VTID if present
  @VTID(35)
  void calendarViewMode(
          com.microsoft.outlook.OlCalendarViewMode calendarViewMode);


  /**
   * <p>
   * Getter method for the COM property "DayWeekTimeScale"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlDayWeekTimeScale
   */

  @DISPID(64365) //= 0xfb6d. The runtime will prefer the VTID if present
  @VTID(36)
  com.microsoft.outlook.OlDayWeekTimeScale dayWeekTimeScale();


  /**
   * <p>
   * Setter method for the COM property "DayWeekTimeScale"
   * </p>
   * @param dayWeekTimeScale Mandatory com.microsoft.outlook.OlDayWeekTimeScale parameter.
   */

  @DISPID(64365) //= 0xfb6d. The runtime will prefer the VTID if present
  @VTID(37)
  void dayWeekTimeScale(
          com.microsoft.outlook.OlDayWeekTimeScale dayWeekTimeScale);


  /**
   * <p>
   * Getter method for the COM property "MonthShowEndTime"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64369) //= 0xfb71. The runtime will prefer the VTID if present
  @VTID(38)
  boolean monthShowEndTime();


  /**
   * <p>
   * Setter method for the COM property "MonthShowEndTime"
   * </p>
   * @param monthShowEndTime Mandatory boolean parameter.
   */

  @DISPID(64369) //= 0xfb71. The runtime will prefer the VTID if present
  @VTID(39)
  void monthShowEndTime(
          boolean monthShowEndTime);


  /**
   * <p>
   * Getter method for the COM property "BoldDatesWithItems"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64371) //= 0xfb73. The runtime will prefer the VTID if present
  @VTID(40)
  boolean boldDatesWithItems();


  /**
   * <p>
   * Setter method for the COM property "BoldDatesWithItems"
   * </p>
   * @param boldDatesWithItems Mandatory boolean parameter.
   */

  @DISPID(64371) //= 0xfb73. The runtime will prefer the VTID if present
  @VTID(41)
  void boldDatesWithItems(
          boolean boldDatesWithItems);


  /**
   * <p>
   * Getter method for the COM property "DayWeekTimeFont"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._ViewFont
   */

  @DISPID(64380) //= 0xfb7c. The runtime will prefer the VTID if present
  @VTID(42)
  _ViewFont dayWeekTimeFont();


  /**
   * <p>
   * Getter method for the COM property "DayWeekFont"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._ViewFont
   */

  @DISPID(64381) //= 0xfb7d. The runtime will prefer the VTID if present
  @VTID(43)
  _ViewFont dayWeekFont();


  /**
   * <p>
   * Getter method for the COM property "MonthFont"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._ViewFont
   */

  @DISPID(64383) //= 0xfb7f. The runtime will prefer the VTID if present
  @VTID(44)
  _ViewFont monthFont();


  /**
   * <p>
   * Getter method for the COM property "AutoFormatRules"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._AutoFormatRules
   */

  @DISPID(64059) //= 0xfa3b. The runtime will prefer the VTID if present
  @VTID(45)
  com.microsoft.outlook._AutoFormatRules autoFormatRules();


  /**
   * <p>
   * Getter method for the COM property "DaysInMultiDayMode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64386) //= 0xfb82. The runtime will prefer the VTID if present
  @VTID(46)
  int daysInMultiDayMode();


  /**
   * <p>
   * Setter method for the COM property "DaysInMultiDayMode"
   * </p>
   * @param daysInMultiDayMode Mandatory int parameter.
   */

  @DISPID(64386) //= 0xfb82. The runtime will prefer the VTID if present
  @VTID(47)
  void daysInMultiDayMode(
          int daysInMultiDayMode);


  /**
   * <p>
   * Getter method for the COM property "DisplayedDates"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(64519) //= 0xfc07. The runtime will prefer the VTID if present
  @VTID(48)
  @ReturnValue(type=NativeType.VARIANT)
  Object displayedDates();


  /**
   * <p>
   * Getter method for the COM property "BoldSubjects"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64529) //= 0xfc11. The runtime will prefer the VTID if present
  @VTID(49)
  boolean boldSubjects();


  /**
   * <p>
   * Setter method for the COM property "BoldSubjects"
   * </p>
   * @param boldSubjects Mandatory boolean parameter.
   */

  @DISPID(64529) //= 0xfc11. The runtime will prefer the VTID if present
  @VTID(50)
  void boldSubjects(
          boolean boldSubjects);


  /**
   * <p>
   * Getter method for the COM property "SelectedStartTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(64570) //= 0xfc3a. The runtime will prefer the VTID if present
  @VTID(51)
  java.util.Date selectedStartTime();


  /**
   * <p>
   * Getter method for the COM property "SelectedEndTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(64571) //= 0xfc3b. The runtime will prefer the VTID if present
  @VTID(52)
  java.util.Date selectedEndTime();


  // Properties:
}
