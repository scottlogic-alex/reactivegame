package com.microsoft.outlook;

import com4j.*;

@IID("{00063033-0000-0000-C000-000000000046}")
public interface _AppointmentItem extends Com4jObject {
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
   * Getter method for the COM property "Actions"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Actions
   */

  @DISPID(63511) //= 0xf817. The runtime will prefer the VTID if present
  @VTID(11)
  Actions actions();


  /**
   * <p>
   * Getter method for the COM property "Attachments"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Attachments
   */

  @DISPID(63509) //= 0xf815. The runtime will prefer the VTID if present
  @VTID(12)
  Attachments attachments();


  /**
   * <p>
   * Getter method for the COM property "BillingInformation"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(34101) //= 0x8535. The runtime will prefer the VTID if present
  @VTID(13)
  String billingInformation();


  /**
   * <p>
   * Setter method for the COM property "BillingInformation"
   * </p>
   * @param billingInformation Mandatory java.lang.String parameter.
   */

  @DISPID(34101) //= 0x8535. The runtime will prefer the VTID if present
  @VTID(14)
  void billingInformation(
          String billingInformation);


  /**
   * <p>
   * Getter method for the COM property "Body"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(37120) //= 0x9100. The runtime will prefer the VTID if present
  @VTID(15)
  String body();


  /**
   * <p>
   * Setter method for the COM property "Body"
   * </p>
   * @param body Mandatory java.lang.String parameter.
   */

  @DISPID(37120) //= 0x9100. The runtime will prefer the VTID if present
  @VTID(16)
  void body(
          String body);


  /**
   * <p>
   * Getter method for the COM property "Categories"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(36865) //= 0x9001. The runtime will prefer the VTID if present
  @VTID(17)
  String categories();


  /**
   * <p>
   * Setter method for the COM property "Categories"
   * </p>
   * @param categories Mandatory java.lang.String parameter.
   */

  @DISPID(36865) //= 0x9001. The runtime will prefer the VTID if present
  @VTID(18)
  void categories(
          String categories);


  /**
   * <p>
   * Getter method for the COM property "Companies"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(34107) //= 0x853b. The runtime will prefer the VTID if present
  @VTID(19)
  String companies();


  /**
   * <p>
   * Setter method for the COM property "Companies"
   * </p>
   * @param companies Mandatory java.lang.String parameter.
   */

  @DISPID(34107) //= 0x853b. The runtime will prefer the VTID if present
  @VTID(20)
  void companies(
          String companies);


  /**
   * <p>
   * Getter method for the COM property "ConversationIndex"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64192) //= 0xfac0. The runtime will prefer the VTID if present
  @VTID(21)
  String conversationIndex();


  /**
   * <p>
   * Getter method for the COM property "ConversationTopic"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(22)
  String conversationTopic();


  /**
   * <p>
   * Getter method for the COM property "CreationTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(12295) //= 0x3007. The runtime will prefer the VTID if present
  @VTID(23)
  java.util.Date creationTime();


  /**
   * <p>
   * Getter method for the COM property "EntryID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(61470) //= 0xf01e. The runtime will prefer the VTID if present
  @VTID(24)
  String entryID();


  /**
   * <p>
   * Getter method for the COM property "FormDescription"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.FormDescription
   */

  @DISPID(61589) //= 0xf095. The runtime will prefer the VTID if present
  @VTID(25)
  FormDescription formDescription();


  /**
   * <p>
   * Getter method for the COM property "GetInspector"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Inspector
   */

  @DISPID(61502) //= 0xf03e. The runtime will prefer the VTID if present
  @VTID(26)
  _Inspector getInspector();


  /**
   * <p>
   * Getter method for the COM property "Importance"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlImportance
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(27)
  OlImportance importance();


  /**
   * <p>
   * Setter method for the COM property "Importance"
   * </p>
   * @param importance Mandatory com.microsoft.outlook.OlImportance parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(28)
  void importance(
          OlImportance importance);


  /**
   * <p>
   * Getter method for the COM property "LastModificationTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(12296) //= 0x3008. The runtime will prefer the VTID if present
  @VTID(29)
  java.util.Date lastModificationTime();


  /**
   * <p>
   * Getter method for the COM property "MAPIOBJECT"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61696) //= 0xf100. The runtime will prefer the VTID if present
  @VTID(30)
  Com4jObject mapiobject();


  /**
   * <p>
   * Getter method for the COM property "MessageClass"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(31)
  String messageClass();


  /**
   * <p>
   * Setter method for the COM property "MessageClass"
   * </p>
   * @param messageClass Mandatory java.lang.String parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(32)
  void messageClass(
          String messageClass);


  /**
   * <p>
   * Getter method for the COM property "Mileage"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(34100) //= 0x8534. The runtime will prefer the VTID if present
  @VTID(33)
  String mileage();


  /**
   * <p>
   * Setter method for the COM property "Mileage"
   * </p>
   * @param mileage Mandatory java.lang.String parameter.
   */

  @DISPID(34100) //= 0x8534. The runtime will prefer the VTID if present
  @VTID(34)
  void mileage(
          String mileage);


  /**
   * <p>
   * Getter method for the COM property "NoAging"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(34062) //= 0x850e. The runtime will prefer the VTID if present
  @VTID(35)
  boolean noAging();


  /**
   * <p>
   * Setter method for the COM property "NoAging"
   * </p>
   * @param noAging Mandatory boolean parameter.
   */

  @DISPID(34062) //= 0x850e. The runtime will prefer the VTID if present
  @VTID(36)
  void noAging(
          boolean noAging);


  /**
   * <p>
   * Getter method for the COM property "OutlookInternalVersion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(34130) //= 0x8552. The runtime will prefer the VTID if present
  @VTID(37)
  int outlookInternalVersion();


  /**
   * <p>
   * Getter method for the COM property "OutlookVersion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(34132) //= 0x8554. The runtime will prefer the VTID if present
  @VTID(38)
  String outlookVersion();


  /**
   * <p>
   * Getter method for the COM property "Saved"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(61603) //= 0xf0a3. The runtime will prefer the VTID if present
  @VTID(39)
  boolean saved();


  /**
   * <p>
   * Getter method for the COM property "Sensitivity"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlSensitivity
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(40)
  OlSensitivity sensitivity();


  /**
   * <p>
   * Setter method for the COM property "Sensitivity"
   * </p>
   * @param sensitivity Mandatory com.microsoft.outlook.OlSensitivity parameter.
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(41)
  void sensitivity(
          OlSensitivity sensitivity);


  /**
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3592) //= 0xe08. The runtime will prefer the VTID if present
  @VTID(42)
  int size();


  /**
   * <p>
   * Getter method for the COM property "Subject"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(43)
  String subject();


  /**
   * <p>
   * Setter method for the COM property "Subject"
   * </p>
   * @param subject Mandatory java.lang.String parameter.
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(44)
  void subject(
          String subject);


  /**
   * <p>
   * Getter method for the COM property "UnRead"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(61468) //= 0xf01c. The runtime will prefer the VTID if present
  @VTID(45)
  boolean unRead();


  /**
   * <p>
   * Setter method for the COM property "UnRead"
   * </p>
   * @param unRead Mandatory boolean parameter.
   */

  @DISPID(61468) //= 0xf01c. The runtime will prefer the VTID if present
  @VTID(46)
  void unRead(
          boolean unRead);


  /**
   * <p>
   * Getter method for the COM property "UserProperties"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.UserProperties
   */

  @DISPID(63510) //= 0xf816. The runtime will prefer the VTID if present
  @VTID(47)
  UserProperties userProperties();


  /**
   * @param saveMode Mandatory com.microsoft.outlook.OlInspectorClose parameter.
   */

  @DISPID(61475) //= 0xf023. The runtime will prefer the VTID if present
  @VTID(48)
  void close(
          com.microsoft.outlook.OlInspectorClose saveMode);


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61490) //= 0xf032. The runtime will prefer the VTID if present
  @VTID(49)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject copy();


  /**
   */

  @DISPID(61514) //= 0xf04a. The runtime will prefer the VTID if present
  @VTID(50)
  void delete();


  /**
   * @param modal Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(61606) //= 0xf0a6. The runtime will prefer the VTID if present
  @VTID(51)
  void display(
          @Optional @MarshalAs(NativeType.VARIANT) Object modal);


  /**
   * @param destFldr Mandatory com.microsoft.outlook.MAPIFolder parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61492) //= 0xf034. The runtime will prefer the VTID if present
  @VTID(52)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject move(
          MAPIFolder destFldr);


  /**
   */

  @DISPID(61491) //= 0xf033. The runtime will prefer the VTID if present
  @VTID(53)
  void printOut();


  /**
   */

  @DISPID(61512) //= 0xf048. The runtime will prefer the VTID if present
  @VTID(54)
  void save();


  /**
   * @param path Mandatory java.lang.String parameter.
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(61521) //= 0xf051. The runtime will prefer the VTID if present
  @VTID(55)
  void saveAs(
          String path,
          @Optional @MarshalAs(NativeType.VARIANT) Object type);


  /**
   * <p>
   * Getter method for the COM property "AllDayEvent"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(33301) //= 0x8215. The runtime will prefer the VTID if present
  @VTID(56)
  boolean allDayEvent();


  /**
   * <p>
   * Setter method for the COM property "AllDayEvent"
   * </p>
   * @param allDayEvent Mandatory boolean parameter.
   */

  @DISPID(33301) //= 0x8215. The runtime will prefer the VTID if present
  @VTID(57)
  void allDayEvent(
          boolean allDayEvent);


  /**
   * <p>
   * Getter method for the COM property "BusyStatus"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlBusyStatus
   */

  @DISPID(33285) //= 0x8205. The runtime will prefer the VTID if present
  @VTID(58)
  OlBusyStatus busyStatus();


  /**
   * <p>
   * Setter method for the COM property "BusyStatus"
   * </p>
   * @param busyStatus Mandatory com.microsoft.outlook.OlBusyStatus parameter.
   */

  @DISPID(33285) //= 0x8205. The runtime will prefer the VTID if present
  @VTID(59)
  void busyStatus(
          OlBusyStatus busyStatus);


  /**
   * <p>
   * Getter method for the COM property "Duration"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(33299) //= 0x8213. The runtime will prefer the VTID if present
  @VTID(60)
  int duration();


  /**
   * <p>
   * Setter method for the COM property "Duration"
   * </p>
   * @param duration Mandatory int parameter.
   */

  @DISPID(33299) //= 0x8213. The runtime will prefer the VTID if present
  @VTID(61)
  void duration(
          int duration);


  /**
   * <p>
   * Getter method for the COM property "End"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(33294) //= 0x820e. The runtime will prefer the VTID if present
  @VTID(62)
  java.util.Date end();


  /**
   * <p>
   * Setter method for the COM property "End"
   * </p>
   * @param end Mandatory java.util.Date parameter.
   */

  @DISPID(33294) //= 0x820e. The runtime will prefer the VTID if present
  @VTID(63)
  void end(
          java.util.Date end);


  /**
   * <p>
   * Getter method for the COM property "IsOnlineMeeting"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(33344) //= 0x8240. The runtime will prefer the VTID if present
  @VTID(64)
  boolean isOnlineMeeting();


  /**
   * <p>
   * Setter method for the COM property "IsOnlineMeeting"
   * </p>
   * @param isOnlineMeeting Mandatory boolean parameter.
   */

  @DISPID(33344) //= 0x8240. The runtime will prefer the VTID if present
  @VTID(65)
  void isOnlineMeeting(
          boolean isOnlineMeeting);


  /**
   * <p>
   * Getter method for the COM property "IsRecurring"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(33315) //= 0x8223. The runtime will prefer the VTID if present
  @VTID(66)
  boolean isRecurring();


  /**
   * <p>
   * Getter method for the COM property "Location"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(33288) //= 0x8208. The runtime will prefer the VTID if present
  @VTID(67)
  String location();


  /**
   * <p>
   * Setter method for the COM property "Location"
   * </p>
   * @param location Mandatory java.lang.String parameter.
   */

  @DISPID(33288) //= 0x8208. The runtime will prefer the VTID if present
  @VTID(68)
  void location(
          String location);


  /**
   * <p>
   * Getter method for the COM property "MeetingStatus"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlMeetingStatus
   */

  @DISPID(33303) //= 0x8217. The runtime will prefer the VTID if present
  @VTID(69)
  OlMeetingStatus meetingStatus();


  /**
   * <p>
   * Setter method for the COM property "MeetingStatus"
   * </p>
   * @param meetingStatus Mandatory com.microsoft.outlook.OlMeetingStatus parameter.
   */

  @DISPID(33303) //= 0x8217. The runtime will prefer the VTID if present
  @VTID(70)
  void meetingStatus(
          OlMeetingStatus meetingStatus);


  /**
   * <p>
   * Getter method for the COM property "NetMeetingAutoStart"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(33348) //= 0x8244. The runtime will prefer the VTID if present
  @VTID(71)
  boolean netMeetingAutoStart();


  /**
   * <p>
   * Setter method for the COM property "NetMeetingAutoStart"
   * </p>
   * @param netMeetingAutoStart Mandatory boolean parameter.
   */

  @DISPID(33348) //= 0x8244. The runtime will prefer the VTID if present
  @VTID(72)
  void netMeetingAutoStart(
          boolean netMeetingAutoStart);


  /**
   * <p>
   * Getter method for the COM property "NetMeetingOrganizerAlias"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(33347) //= 0x8243. The runtime will prefer the VTID if present
  @VTID(73)
  String netMeetingOrganizerAlias();


  /**
   * <p>
   * Setter method for the COM property "NetMeetingOrganizerAlias"
   * </p>
   * @param netMeetingOrganizerAlias Mandatory java.lang.String parameter.
   */

  @DISPID(33347) //= 0x8243. The runtime will prefer the VTID if present
  @VTID(74)
  void netMeetingOrganizerAlias(
          String netMeetingOrganizerAlias);


  /**
   * <p>
   * Getter method for the COM property "NetMeetingServer"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(33346) //= 0x8242. The runtime will prefer the VTID if present
  @VTID(75)
  String netMeetingServer();


  /**
   * <p>
   * Setter method for the COM property "NetMeetingServer"
   * </p>
   * @param netMeetingServer Mandatory java.lang.String parameter.
   */

  @DISPID(33346) //= 0x8242. The runtime will prefer the VTID if present
  @VTID(76)
  void netMeetingServer(
          String netMeetingServer);


  /**
   * <p>
   * Getter method for the COM property "NetMeetingType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlNetMeetingType
   */

  @DISPID(33345) //= 0x8241. The runtime will prefer the VTID if present
  @VTID(77)
  com.microsoft.outlook.OlNetMeetingType netMeetingType();


  /**
   * <p>
   * Setter method for the COM property "NetMeetingType"
   * </p>
   * @param netMeetingType Mandatory com.microsoft.outlook.OlNetMeetingType parameter.
   */

  @DISPID(33345) //= 0x8241. The runtime will prefer the VTID if present
  @VTID(78)
  void netMeetingType(
          com.microsoft.outlook.OlNetMeetingType netMeetingType);


  /**
   * <p>
   * Getter method for the COM property "OptionalAttendees"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3587) //= 0xe03. The runtime will prefer the VTID if present
  @VTID(79)
  String optionalAttendees();


  /**
   * <p>
   * Setter method for the COM property "OptionalAttendees"
   * </p>
   * @param optionalAttendees Mandatory java.lang.String parameter.
   */

  @DISPID(3587) //= 0xe03. The runtime will prefer the VTID if present
  @VTID(80)
  void optionalAttendees(
          String optionalAttendees);


  /**
   * <p>
   * Getter method for the COM property "Organizer"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(66) //= 0x42. The runtime will prefer the VTID if present
  @VTID(81)
  String organizer();


  /**
   * <p>
   * Getter method for the COM property "Recipients"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Recipients
   */

  @DISPID(63508) //= 0xf814. The runtime will prefer the VTID if present
  @VTID(82)
  Recipients recipients();


  /**
   * <p>
   * Getter method for the COM property "RecurrenceState"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlRecurrenceState
   */

  @DISPID(62789) //= 0xf545. The runtime will prefer the VTID if present
  @VTID(83)
  com.microsoft.outlook.OlRecurrenceState recurrenceState();


  /**
   * <p>
   * Getter method for the COM property "ReminderMinutesBeforeStart"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(34049) //= 0x8501. The runtime will prefer the VTID if present
  @VTID(84)
  int reminderMinutesBeforeStart();


  /**
   * <p>
   * Setter method for the COM property "ReminderMinutesBeforeStart"
   * </p>
   * @param reminderMinutesBeforeStart Mandatory int parameter.
   */

  @DISPID(34049) //= 0x8501. The runtime will prefer the VTID if present
  @VTID(85)
  void reminderMinutesBeforeStart(
          int reminderMinutesBeforeStart);


  /**
   * <p>
   * Getter method for the COM property "ReminderOverrideDefault"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(34076) //= 0x851c. The runtime will prefer the VTID if present
  @VTID(86)
  boolean reminderOverrideDefault();


  /**
   * <p>
   * Setter method for the COM property "ReminderOverrideDefault"
   * </p>
   * @param reminderOverrideDefault Mandatory boolean parameter.
   */

  @DISPID(34076) //= 0x851c. The runtime will prefer the VTID if present
  @VTID(87)
  void reminderOverrideDefault(
          boolean reminderOverrideDefault);


  /**
   * <p>
   * Getter method for the COM property "ReminderPlaySound"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(34078) //= 0x851e. The runtime will prefer the VTID if present
  @VTID(88)
  boolean reminderPlaySound();


  /**
   * <p>
   * Setter method for the COM property "ReminderPlaySound"
   * </p>
   * @param reminderPlaySound Mandatory boolean parameter.
   */

  @DISPID(34078) //= 0x851e. The runtime will prefer the VTID if present
  @VTID(89)
  void reminderPlaySound(
          boolean reminderPlaySound);


  /**
   * <p>
   * Getter method for the COM property "ReminderSet"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(34051) //= 0x8503. The runtime will prefer the VTID if present
  @VTID(90)
  boolean reminderSet();


  /**
   * <p>
   * Setter method for the COM property "ReminderSet"
   * </p>
   * @param reminderSet Mandatory boolean parameter.
   */

  @DISPID(34051) //= 0x8503. The runtime will prefer the VTID if present
  @VTID(91)
  void reminderSet(
          boolean reminderSet);


  /**
   * <p>
   * Getter method for the COM property "ReminderSoundFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(34079) //= 0x851f. The runtime will prefer the VTID if present
  @VTID(92)
  String reminderSoundFile();


  /**
   * <p>
   * Setter method for the COM property "ReminderSoundFile"
   * </p>
   * @param reminderSoundFile Mandatory java.lang.String parameter.
   */

  @DISPID(34079) //= 0x851f. The runtime will prefer the VTID if present
  @VTID(93)
  void reminderSoundFile(
          String reminderSoundFile);


  /**
   * <p>
   * Getter method for the COM property "ReplyTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(33312) //= 0x8220. The runtime will prefer the VTID if present
  @VTID(94)
  java.util.Date replyTime();


  /**
   * <p>
   * Setter method for the COM property "ReplyTime"
   * </p>
   * @param replyTime Mandatory java.util.Date parameter.
   */

  @DISPID(33312) //= 0x8220. The runtime will prefer the VTID if present
  @VTID(95)
  void replyTime(
          java.util.Date replyTime);


  /**
   * <p>
   * Getter method for the COM property "RequiredAttendees"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3588) //= 0xe04. The runtime will prefer the VTID if present
  @VTID(96)
  String requiredAttendees();


  /**
   * <p>
   * Setter method for the COM property "RequiredAttendees"
   * </p>
   * @param requiredAttendees Mandatory java.lang.String parameter.
   */

  @DISPID(3588) //= 0xe04. The runtime will prefer the VTID if present
  @VTID(97)
  void requiredAttendees(
          String requiredAttendees);


  /**
   * <p>
   * Getter method for the COM property "Resources"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3586) //= 0xe02. The runtime will prefer the VTID if present
  @VTID(98)
  String resources();


  /**
   * <p>
   * Setter method for the COM property "Resources"
   * </p>
   * @param resources Mandatory java.lang.String parameter.
   */

  @DISPID(3586) //= 0xe02. The runtime will prefer the VTID if present
  @VTID(99)
  void resources(
          String resources);


  /**
   * <p>
   * Getter method for the COM property "ResponseRequested"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(99) //= 0x63. The runtime will prefer the VTID if present
  @VTID(100)
  boolean responseRequested();


  /**
   * <p>
   * Setter method for the COM property "ResponseRequested"
   * </p>
   * @param responseRequested Mandatory boolean parameter.
   */

  @DISPID(99) //= 0x63. The runtime will prefer the VTID if present
  @VTID(101)
  void responseRequested(
          boolean responseRequested);


  /**
   * <p>
   * Getter method for the COM property "ResponseStatus"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlResponseStatus
   */

  @DISPID(33304) //= 0x8218. The runtime will prefer the VTID if present
  @VTID(102)
  com.microsoft.outlook.OlResponseStatus responseStatus();


  /**
   * <p>
   * Getter method for the COM property "Start"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(33293) //= 0x820d. The runtime will prefer the VTID if present
  @VTID(103)
  java.util.Date start();


  /**
   * <p>
   * Setter method for the COM property "Start"
   * </p>
   * @param start Mandatory java.util.Date parameter.
   */

  @DISPID(33293) //= 0x820d. The runtime will prefer the VTID if present
  @VTID(104)
  void start(
          java.util.Date start);


  /**
   */

  @DISPID(61605) //= 0xf0a5. The runtime will prefer the VTID if present
  @VTID(105)
  void clearRecurrencePattern();


  /**
   * @return  Returns a value of type com.microsoft.outlook._MailItem
   */

  @DISPID(62791) //= 0xf547. The runtime will prefer the VTID if present
  @VTID(106)
  _MailItem forwardAsVcal();


  /**
   * @return  Returns a value of type com.microsoft.outlook.RecurrencePattern
   */

  @DISPID(61604) //= 0xf0a4. The runtime will prefer the VTID if present
  @VTID(107)
  com.microsoft.outlook.RecurrencePattern getRecurrencePattern();


  /**
   * @param response Mandatory com.microsoft.outlook.OlMeetingResponse parameter.
   * @param fNoUI Optional parameter. Default value is com4j.Variant.getMissing()
   * @param fAdditionalTextDialog Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com.microsoft.outlook._MeetingItem
   */

  @DISPID(62722) //= 0xf502. The runtime will prefer the VTID if present
  @VTID(108)
  _MeetingItem respond(
          com.microsoft.outlook.OlMeetingResponse response,
          @Optional @MarshalAs(NativeType.VARIANT) Object fNoUI,
          @Optional @MarshalAs(NativeType.VARIANT) Object fAdditionalTextDialog);


  /**
   */

  @DISPID(61557) //= 0xf075. The runtime will prefer the VTID if present
  @VTID(109)
  void send();


  /**
   * <p>
   * Getter method for the COM property "NetMeetingDocPathName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(33351) //= 0x8247. The runtime will prefer the VTID if present
  @VTID(110)
  String netMeetingDocPathName();


  /**
   * <p>
   * Setter method for the COM property "NetMeetingDocPathName"
   * </p>
   * @param netMeetingDocPathName Mandatory java.lang.String parameter.
   */

  @DISPID(33351) //= 0x8247. The runtime will prefer the VTID if present
  @VTID(111)
  void netMeetingDocPathName(
          String netMeetingDocPathName);


  /**
   * <p>
   * Getter method for the COM property "NetShowURL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(33352) //= 0x8248. The runtime will prefer the VTID if present
  @VTID(112)
  String netShowURL();


  /**
   * <p>
   * Setter method for the COM property "NetShowURL"
   * </p>
   * @param netShowURL Mandatory java.lang.String parameter.
   */

  @DISPID(33352) //= 0x8248. The runtime will prefer the VTID if present
  @VTID(113)
  void netShowURL(
          String netShowURL);


  /**
   * <p>
   * Getter method for the COM property "Links"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Links
   */

  @DISPID(62469) //= 0xf405. The runtime will prefer the VTID if present
  @VTID(114)
  Links links();


  /**
   * <p>
   * Getter method for the COM property "ConferenceServerAllowExternal"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(33350) //= 0x8246. The runtime will prefer the VTID if present
  @VTID(115)
  boolean conferenceServerAllowExternal();


  /**
   * <p>
   * Setter method for the COM property "ConferenceServerAllowExternal"
   * </p>
   * @param conferenceServerAllowExternal Mandatory boolean parameter.
   */

  @DISPID(33350) //= 0x8246. The runtime will prefer the VTID if present
  @VTID(116)
  void conferenceServerAllowExternal(
          boolean conferenceServerAllowExternal);


  /**
   * <p>
   * Getter method for the COM property "ConferenceServerPassword"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(33353) //= 0x8249. The runtime will prefer the VTID if present
  @VTID(117)
  String conferenceServerPassword();


  /**
   * <p>
   * Setter method for the COM property "ConferenceServerPassword"
   * </p>
   * @param conferenceServerPassword Mandatory java.lang.String parameter.
   */

  @DISPID(33353) //= 0x8249. The runtime will prefer the VTID if present
  @VTID(118)
  void conferenceServerPassword(
          String conferenceServerPassword);


  /**
   * <p>
   * Getter method for the COM property "ItemProperties"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ItemProperties
   */

  @DISPID(64009) //= 0xfa09. The runtime will prefer the VTID if present
  @VTID(119)
  ItemProperties itemProperties();


  @VTID(119)
  @ReturnValue(defaultPropertyThrough={ItemProperties.class})
  ItemProperty itemProperties(
          @MarshalAs(NativeType.VARIANT) Object index);

  /**
   * <p>
   * Getter method for the COM property "DownloadState"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlDownloadState
   */

  @DISPID(64077) //= 0xfa4d. The runtime will prefer the VTID if present
  @VTID(120)
  OlDownloadState downloadState();


  /**
   */

  @DISPID(64011) //= 0xfa0b. The runtime will prefer the VTID if present
  @VTID(121)
  void showCategoriesDialog();


  /**
   * <p>
   * Getter method for the COM property "InternetCodepage"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(16350) //= 0x3fde. The runtime will prefer the VTID if present
  @VTID(122)
  int internetCodepage();


  /**
   * <p>
   * Setter method for the COM property "InternetCodepage"
   * </p>
   * @param internetCodepage Mandatory int parameter.
   */

  @DISPID(16350) //= 0x3fde. The runtime will prefer the VTID if present
  @VTID(123)
  void internetCodepage(
          int internetCodepage);


  /**
   * <p>
   * Getter method for the COM property "MarkForDownload"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlRemoteStatus
   */

  @DISPID(34161) //= 0x8571. The runtime will prefer the VTID if present
  @VTID(124)
  OlRemoteStatus markForDownload();


  /**
   * <p>
   * Setter method for the COM property "MarkForDownload"
   * </p>
   * @param markForDownload Mandatory com.microsoft.outlook.OlRemoteStatus parameter.
   */

  @DISPID(34161) //= 0x8571. The runtime will prefer the VTID if present
  @VTID(125)
  void markForDownload(
          OlRemoteStatus markForDownload);


  /**
   * <p>
   * Getter method for the COM property "IsConflict"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64164) //= 0xfaa4. The runtime will prefer the VTID if present
  @VTID(126)
  boolean isConflict();


  /**
   * <p>
   * Getter method for the COM property "MeetingWorkspaceURL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(33289) //= 0x8209. The runtime will prefer the VTID if present
  @VTID(127)
  String meetingWorkspaceURL();


  /**
   * <p>
   * Getter method for the COM property "AutoResolvedWinner"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64186) //= 0xfaba. The runtime will prefer the VTID if present
  @VTID(128)
  boolean autoResolvedWinner();


  /**
   * <p>
   * Getter method for the COM property "Conflicts"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Conflicts
   */

  @DISPID(64187) //= 0xfabb. The runtime will prefer the VTID if present
  @VTID(129)
  Conflicts conflicts();


  /**
   * <p>
   * Getter method for the COM property "PropertyAccessor"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._PropertyAccessor
   */

  @DISPID(64253) //= 0xfafd. The runtime will prefer the VTID if present
  @VTID(130)
  com.microsoft.outlook._PropertyAccessor propertyAccessor();


  /**
   * <p>
   * Getter method for the COM property "SendUsingAccount"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Account
   */

  @DISPID(64209) //= 0xfad1. The runtime will prefer the VTID if present
  @VTID(131)
  _Account sendUsingAccount();


  /**
   * <p>
   * Setter method for the COM property "SendUsingAccount"
   * </p>
   * @param sendUsingAccount Mandatory com.microsoft.outlook._Account parameter.
   */

  @DISPID(64209) //= 0xfad1. The runtime will prefer the VTID if present
  @VTID(132)
  void sendUsingAccount(
          _Account sendUsingAccount);


  /**
   * <p>
   * Getter method for the COM property "GlobalAppointmentID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64509) //= 0xfbfd. The runtime will prefer the VTID if present
  @VTID(133)
  String globalAppointmentID();


  /**
   * <p>
   * Getter method for the COM property "ForceUpdateToAllAttendees"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(62778) //= 0xf53a. The runtime will prefer the VTID if present
  @VTID(134)
  boolean forceUpdateToAllAttendees();


  /**
   * <p>
   * Setter method for the COM property "ForceUpdateToAllAttendees"
   * </p>
   * @param forceUpdateToAllAttendees Mandatory boolean parameter.
   */

  @DISPID(62778) //= 0xf53a. The runtime will prefer the VTID if present
  @VTID(135)
  void forceUpdateToAllAttendees(
          boolean forceUpdateToAllAttendees);


  /**
   * <p>
   * Getter method for the COM property "StartUTC"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(33384) //= 0x8268. The runtime will prefer the VTID if present
  @VTID(136)
  java.util.Date startUTC();


  /**
   * <p>
   * Setter method for the COM property "StartUTC"
   * </p>
   * @param startUTC Mandatory java.util.Date parameter.
   */

  @DISPID(33384) //= 0x8268. The runtime will prefer the VTID if present
  @VTID(137)
  void startUTC(
          java.util.Date startUTC);


  /**
   * <p>
   * Getter method for the COM property "EndUTC"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(33385) //= 0x8269. The runtime will prefer the VTID if present
  @VTID(138)
  java.util.Date endUTC();


  /**
   * <p>
   * Setter method for the COM property "EndUTC"
   * </p>
   * @param endUTC Mandatory java.util.Date parameter.
   */

  @DISPID(33385) //= 0x8269. The runtime will prefer the VTID if present
  @VTID(139)
  void endUTC(
          java.util.Date endUTC);


  /**
   * <p>
   * Getter method for the COM property "StartInStartTimeZone"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(33382) //= 0x8266. The runtime will prefer the VTID if present
  @VTID(140)
  java.util.Date startInStartTimeZone();


  /**
   * <p>
   * Setter method for the COM property "StartInStartTimeZone"
   * </p>
   * @param startInStartTimeZone Mandatory java.util.Date parameter.
   */

  @DISPID(33382) //= 0x8266. The runtime will prefer the VTID if present
  @VTID(141)
  void startInStartTimeZone(
          java.util.Date startInStartTimeZone);


  /**
   * <p>
   * Getter method for the COM property "EndInEndTimeZone"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(33383) //= 0x8267. The runtime will prefer the VTID if present
  @VTID(142)
  java.util.Date endInEndTimeZone();


  /**
   * <p>
   * Setter method for the COM property "EndInEndTimeZone"
   * </p>
   * @param endInEndTimeZone Mandatory java.util.Date parameter.
   */

  @DISPID(33383) //= 0x8267. The runtime will prefer the VTID if present
  @VTID(143)
  void endInEndTimeZone(
          java.util.Date endInEndTimeZone);


  /**
   * <p>
   * Getter method for the COM property "StartTimeZone"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._TimeZone
   */

  @DISPID(64551) //= 0xfc27. The runtime will prefer the VTID if present
  @VTID(144)
  _TimeZone startTimeZone();


  /**
   * <p>
   * Setter method for the COM property "StartTimeZone"
   * </p>
   * @param startTimeZone Mandatory com.microsoft.outlook._TimeZone parameter.
   */

  @DISPID(64551) //= 0xfc27. The runtime will prefer the VTID if present
  @VTID(145)
  void startTimeZone(
          _TimeZone startTimeZone);


  /**
   * <p>
   * Getter method for the COM property "EndTimeZone"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._TimeZone
   */

  @DISPID(64552) //= 0xfc28. The runtime will prefer the VTID if present
  @VTID(146)
  _TimeZone endTimeZone();


  /**
   * <p>
   * Setter method for the COM property "EndTimeZone"
   * </p>
   * @param endTimeZone Mandatory com.microsoft.outlook._TimeZone parameter.
   */

  @DISPID(64552) //= 0xfc28. The runtime will prefer the VTID if present
  @VTID(147)
  void endTimeZone(
          _TimeZone endTimeZone);


  /**
   * @return  Returns a value of type com.microsoft.outlook._Conversation
   */

  @DISPID(64596) //= 0xfc54. The runtime will prefer the VTID if present
  @VTID(148)
  _Conversation getConversation();


  /**
   * <p>
   * Getter method for the COM property "ConversationID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64629) //= 0xfc75. The runtime will prefer the VTID if present
  @VTID(149)
  String conversationID();


  /**
   * @param destinationFolder Mandatory com.microsoft.outlook.MAPIFolder parameter.
   * @param copyOptions Mandatory com.microsoft.outlook.OlAppointmentCopyOptions parameter.
   * @return  Returns a value of type com.microsoft.outlook._AppointmentItem
   */

  @DISPID(64274) //= 0xfb12. The runtime will prefer the VTID if present
  @VTID(150)
  _AppointmentItem copyTo(
          MAPIFolder destinationFolder,
          com.microsoft.outlook.OlAppointmentCopyOptions copyOptions);


  /**
   * <p>
   * Getter method for the COM property "RTFBody"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(64644) //= 0xfc84. The runtime will prefer the VTID if present
  @VTID(151)
  @ReturnValue(type=NativeType.VARIANT)
  Object rtfBody();


  /**
   * <p>
   * Setter method for the COM property "RTFBody"
   * </p>
   * @param rtfBody Mandatory java.lang.Object parameter.
   */

  @DISPID(64644) //= 0xfc84. The runtime will prefer the VTID if present
  @VTID(152)
  void rtfBody(
          @MarshalAs(NativeType.VARIANT) Object rtfBody);


  /**
   * @return  Returns a value of type com.microsoft.outlook.AddressEntry
   */

  @DISPID(64648) //= 0xfc88. The runtime will prefer the VTID if present
  @VTID(153)
  AddressEntry getOrganizer();


  /**
   * <p>
   * Getter method for the COM property "BodyFormat"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlBodyFormat
   */

  @DISPID(64073) //= 0xfa49. The runtime will prefer the VTID if present
  @VTID(154)
  OlBodyFormat bodyFormat();


  /**
   * <p>
   * Setter method for the COM property "BodyFormat"
   * </p>
   * @param bodyFormat Mandatory com.microsoft.outlook.OlBodyFormat parameter.
   */

  @DISPID(64073) //= 0xfa49. The runtime will prefer the VTID if present
  @VTID(155)
  void bodyFormat(
          OlBodyFormat bodyFormat);


  /**
   * <p>
   * Getter method for the COM property "DoNotForwardMeeting"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(35887) //= 0x8c2f. The runtime will prefer the VTID if present
  @VTID(156)
  boolean doNotForwardMeeting();


  /**
   * <p>
   * Setter method for the COM property "DoNotForwardMeeting"
   * </p>
   * @param doNotForwardMeeting Mandatory boolean parameter.
   */

  @DISPID(35887) //= 0x8c2f. The runtime will prefer the VTID if present
  @VTID(157)
  void doNotForwardMeeting(
          boolean doNotForwardMeeting);


  // Properties:
}
