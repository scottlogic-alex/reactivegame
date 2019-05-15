package com.microsoft.outlook;

import com4j.*;

@IID("{00063044-0000-0000-C000-000000000046}")
public interface RecurrencePattern extends Com4jObject {
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
   * Getter method for the COM property "DayOfMonth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4096) //= 0x1000. The runtime will prefer the VTID if present
  @VTID(11)
  int dayOfMonth();


  /**
   * <p>
   * Setter method for the COM property "DayOfMonth"
   * </p>
   * @param dayOfMonth Mandatory int parameter.
   */

  @DISPID(4096) //= 0x1000. The runtime will prefer the VTID if present
  @VTID(12)
  void dayOfMonth(
          int dayOfMonth);


  /**
   * <p>
   * Getter method for the COM property "DayOfWeekMask"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlDaysOfWeek
   */

  @DISPID(4097) //= 0x1001. The runtime will prefer the VTID if present
  @VTID(13)
  OlDaysOfWeek dayOfWeekMask();


  /**
   * <p>
   * Setter method for the COM property "DayOfWeekMask"
   * </p>
   * @param dayOfWeekMask Mandatory com.microsoft.outlook.OlDaysOfWeek parameter.
   */

  @DISPID(4097) //= 0x1001. The runtime will prefer the VTID if present
  @VTID(14)
  void dayOfWeekMask(
          OlDaysOfWeek dayOfWeekMask);


  /**
   * <p>
   * Getter method for the COM property "Duration"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4109) //= 0x100d. The runtime will prefer the VTID if present
  @VTID(15)
  int duration();


  /**
   * <p>
   * Setter method for the COM property "Duration"
   * </p>
   * @param duration Mandatory int parameter.
   */

  @DISPID(4109) //= 0x100d. The runtime will prefer the VTID if present
  @VTID(16)
  void duration(
          int duration);


  /**
   * <p>
   * Getter method for the COM property "EndTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(4108) //= 0x100c. The runtime will prefer the VTID if present
  @VTID(17)
  java.util.Date endTime();


  /**
   * <p>
   * Setter method for the COM property "EndTime"
   * </p>
   * @param endTime Mandatory java.util.Date parameter.
   */

  @DISPID(4108) //= 0x100c. The runtime will prefer the VTID if present
  @VTID(18)
  void endTime(
          java.util.Date endTime);


  /**
   * <p>
   * Getter method for the COM property "Exceptions"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Exceptions
   */

  @DISPID(4110) //= 0x100e. The runtime will prefer the VTID if present
  @VTID(19)
  Exceptions exceptions();


  /**
   * <p>
   * Getter method for the COM property "Instance"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4099) //= 0x1003. The runtime will prefer the VTID if present
  @VTID(20)
  int instance();


  /**
   * <p>
   * Setter method for the COM property "Instance"
   * </p>
   * @param instance Mandatory int parameter.
   */

  @DISPID(4099) //= 0x1003. The runtime will prefer the VTID if present
  @VTID(21)
  void instance(
          int instance);


  /**
   * <p>
   * Getter method for the COM property "Interval"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4100) //= 0x1004. The runtime will prefer the VTID if present
  @VTID(22)
  int interval();


  /**
   * <p>
   * Setter method for the COM property "Interval"
   * </p>
   * @param interval Mandatory int parameter.
   */

  @DISPID(4100) //= 0x1004. The runtime will prefer the VTID if present
  @VTID(23)
  void interval(
          int interval);


  /**
   * <p>
   * Getter method for the COM property "MonthOfYear"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4102) //= 0x1006. The runtime will prefer the VTID if present
  @VTID(24)
  int monthOfYear();


  /**
   * <p>
   * Setter method for the COM property "MonthOfYear"
   * </p>
   * @param monthOfYear Mandatory int parameter.
   */

  @DISPID(4102) //= 0x1006. The runtime will prefer the VTID if present
  @VTID(25)
  void monthOfYear(
          int monthOfYear);


  /**
   * <p>
   * Getter method for the COM property "NoEndDate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4107) //= 0x100b. The runtime will prefer the VTID if present
  @VTID(26)
  boolean noEndDate();


  /**
   * <p>
   * Setter method for the COM property "NoEndDate"
   * </p>
   * @param noEndDate Mandatory boolean parameter.
   */

  @DISPID(4107) //= 0x100b. The runtime will prefer the VTID if present
  @VTID(27)
  void noEndDate(
          boolean noEndDate);


  /**
   * <p>
   * Getter method for the COM property "Occurrences"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4101) //= 0x1005. The runtime will prefer the VTID if present
  @VTID(28)
  int occurrences();


  /**
   * <p>
   * Setter method for the COM property "Occurrences"
   * </p>
   * @param occurrences Mandatory int parameter.
   */

  @DISPID(4101) //= 0x1005. The runtime will prefer the VTID if present
  @VTID(29)
  void occurrences(
          int occurrences);


  /**
   * <p>
   * Getter method for the COM property "PatternEndDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(4098) //= 0x1002. The runtime will prefer the VTID if present
  @VTID(30)
  java.util.Date patternEndDate();


  /**
   * <p>
   * Setter method for the COM property "PatternEndDate"
   * </p>
   * @param patternEndDate Mandatory java.util.Date parameter.
   */

  @DISPID(4098) //= 0x1002. The runtime will prefer the VTID if present
  @VTID(31)
  void patternEndDate(
          java.util.Date patternEndDate);


  /**
   * <p>
   * Getter method for the COM property "PatternStartDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(4104) //= 0x1008. The runtime will prefer the VTID if present
  @VTID(32)
  java.util.Date patternStartDate();


  /**
   * <p>
   * Setter method for the COM property "PatternStartDate"
   * </p>
   * @param patternStartDate Mandatory java.util.Date parameter.
   */

  @DISPID(4104) //= 0x1008. The runtime will prefer the VTID if present
  @VTID(33)
  void patternStartDate(
          java.util.Date patternStartDate);


  /**
   * <p>
   * Getter method for the COM property "RecurrenceType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlRecurrenceType
   */

  @DISPID(4103) //= 0x1007. The runtime will prefer the VTID if present
  @VTID(34)
  OlRecurrenceType recurrenceType();


  /**
   * <p>
   * Setter method for the COM property "RecurrenceType"
   * </p>
   * @param recurrenceType Mandatory com.microsoft.outlook.OlRecurrenceType parameter.
   */

  @DISPID(4103) //= 0x1007. The runtime will prefer the VTID if present
  @VTID(35)
  void recurrenceType(
          OlRecurrenceType recurrenceType);


  /**
   * <p>
   * Getter method for the COM property "Regenerate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(4106) //= 0x100a. The runtime will prefer the VTID if present
  @VTID(36)
  boolean regenerate();


  /**
   * <p>
   * Setter method for the COM property "Regenerate"
   * </p>
   * @param regenerate Mandatory boolean parameter.
   */

  @DISPID(4106) //= 0x100a. The runtime will prefer the VTID if present
  @VTID(37)
  void regenerate(
          boolean regenerate);


  /**
   * <p>
   * Getter method for the COM property "StartTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(4105) //= 0x1009. The runtime will prefer the VTID if present
  @VTID(38)
  java.util.Date startTime();


  /**
   * <p>
   * Setter method for the COM property "StartTime"
   * </p>
   * @param startTime Mandatory java.util.Date parameter.
   */

  @DISPID(4105) //= 0x1009. The runtime will prefer the VTID if present
  @VTID(39)
  void startTime(
          java.util.Date startTime);


  /**
   * @param startDate Mandatory java.util.Date parameter.
   * @return  Returns a value of type com.microsoft.outlook._AppointmentItem
   */

  @DISPID(4111) //= 0x100f. The runtime will prefer the VTID if present
  @VTID(40)
  _AppointmentItem getOccurrence(
          java.util.Date startDate);


  // Properties:
}
