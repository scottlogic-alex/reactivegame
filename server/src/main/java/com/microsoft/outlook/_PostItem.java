package com.microsoft.outlook;

import com4j.*;

@IID("{00063024-0000-0000-C000-000000000046}")
public interface _PostItem extends Com4jObject {
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
  com.microsoft.outlook.Attachments attachments();


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
  com.microsoft.outlook.FormDescription formDescription();


  /**
   * <p>
   * Getter method for the COM property "GetInspector"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Inspector
   */

  @DISPID(61502) //= 0xf03e. The runtime will prefer the VTID if present
  @VTID(26)
  com.microsoft.outlook._Inspector getInspector();


  /**
   * <p>
   * Getter method for the COM property "Importance"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlImportance
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(27)
  com.microsoft.outlook.OlImportance importance();


  /**
   * <p>
   * Setter method for the COM property "Importance"
   * </p>
   * @param importance Mandatory com.microsoft.outlook.OlImportance parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(28)
  void importance(
          com.microsoft.outlook.OlImportance importance);


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
  com.microsoft.outlook.OlSensitivity sensitivity();


  /**
   * <p>
   * Setter method for the COM property "Sensitivity"
   * </p>
   * @param sensitivity Mandatory com.microsoft.outlook.OlSensitivity parameter.
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(41)
  void sensitivity(
          com.microsoft.outlook.OlSensitivity sensitivity);


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
  com.microsoft.outlook.UserProperties userProperties();


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
          com.microsoft.outlook.MAPIFolder destFldr);


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
   * Getter method for the COM property "ExpiryTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(56)
  java.util.Date expiryTime();


  /**
   * <p>
   * Setter method for the COM property "ExpiryTime"
   * </p>
   * @param expiryTime Mandatory java.util.Date parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(57)
  void expiryTime(
          java.util.Date expiryTime);


  /**
   * <p>
   * Getter method for the COM property "HTMLBody"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(62468) //= 0xf404. The runtime will prefer the VTID if present
  @VTID(58)
  String htmlBody();


  /**
   * <p>
   * Setter method for the COM property "HTMLBody"
   * </p>
   * @param htmlBody Mandatory java.lang.String parameter.
   */

  @DISPID(62468) //= 0xf404. The runtime will prefer the VTID if present
  @VTID(59)
  void htmlBody(
          String htmlBody);


  /**
   * <p>
   * Getter method for the COM property "ReceivedTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(3590) //= 0xe06. The runtime will prefer the VTID if present
  @VTID(60)
  java.util.Date receivedTime();


  /**
   * <p>
   * Getter method for the COM property "SenderName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3098) //= 0xc1a. The runtime will prefer the VTID if present
  @VTID(61)
  String senderName();


  /**
   * <p>
   * Getter method for the COM property "SentOn"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(62)
  java.util.Date sentOn();


  /**
   */

  @DISPID(63522) //= 0xf822. The runtime will prefer the VTID if present
  @VTID(63)
  void clearConversationIndex();


  /**
   * @return  Returns a value of type com.microsoft.outlook._MailItem
   */

  @DISPID(63507) //= 0xf813. The runtime will prefer the VTID if present
  @VTID(64)
  _MailItem forward();


  /**
   */

  @DISPID(61557) //= 0xf075. The runtime will prefer the VTID if present
  @VTID(65)
  void post();


  /**
   * @return  Returns a value of type com.microsoft.outlook._MailItem
   */

  @DISPID(63504) //= 0xf810. The runtime will prefer the VTID if present
  @VTID(66)
  _MailItem reply();


  /**
   * <p>
   * Getter method for the COM property "Links"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Links
   */

  @DISPID(62469) //= 0xf405. The runtime will prefer the VTID if present
  @VTID(67)
  Links links();


  /**
   * <p>
   * Getter method for the COM property "ItemProperties"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ItemProperties
   */

  @DISPID(64009) //= 0xfa09. The runtime will prefer the VTID if present
  @VTID(68)
  com.microsoft.outlook.ItemProperties itemProperties();


  @VTID(68)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.ItemProperties.class})
  com.microsoft.outlook.ItemProperty itemProperties(
          @MarshalAs(NativeType.VARIANT) Object index);

  /**
   * <p>
   * Getter method for the COM property "BodyFormat"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlBodyFormat
   */

  @DISPID(64073) //= 0xfa49. The runtime will prefer the VTID if present
  @VTID(69)
  com.microsoft.outlook.OlBodyFormat bodyFormat();


  /**
   * <p>
   * Setter method for the COM property "BodyFormat"
   * </p>
   * @param bodyFormat Mandatory com.microsoft.outlook.OlBodyFormat parameter.
   */

  @DISPID(64073) //= 0xfa49. The runtime will prefer the VTID if present
  @VTID(70)
  void bodyFormat(
          com.microsoft.outlook.OlBodyFormat bodyFormat);


  /**
   * <p>
   * Getter method for the COM property "DownloadState"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlDownloadState
   */

  @DISPID(64077) //= 0xfa4d. The runtime will prefer the VTID if present
  @VTID(71)
  com.microsoft.outlook.OlDownloadState downloadState();


  /**
   */

  @DISPID(64011) //= 0xfa0b. The runtime will prefer the VTID if present
  @VTID(72)
  void showCategoriesDialog();


  /**
   * <p>
   * Getter method for the COM property "InternetCodepage"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(16350) //= 0x3fde. The runtime will prefer the VTID if present
  @VTID(73)
  int internetCodepage();


  /**
   * <p>
   * Setter method for the COM property "InternetCodepage"
   * </p>
   * @param internetCodepage Mandatory int parameter.
   */

  @DISPID(16350) //= 0x3fde. The runtime will prefer the VTID if present
  @VTID(74)
  void internetCodepage(
          int internetCodepage);


  /**
   * <p>
   * Getter method for the COM property "MarkForDownload"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlRemoteStatus
   */

  @DISPID(34161) //= 0x8571. The runtime will prefer the VTID if present
  @VTID(75)
  com.microsoft.outlook.OlRemoteStatus markForDownload();


  /**
   * <p>
   * Setter method for the COM property "MarkForDownload"
   * </p>
   * @param markForDownload Mandatory com.microsoft.outlook.OlRemoteStatus parameter.
   */

  @DISPID(34161) //= 0x8571. The runtime will prefer the VTID if present
  @VTID(76)
  void markForDownload(
          com.microsoft.outlook.OlRemoteStatus markForDownload);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(64163) //= 0xfaa3. The runtime will prefer the VTID if present
  @VTID(77)
  boolean setACLs();


  /**
   * <p>
   * Getter method for the COM property "IsConflict"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64164) //= 0xfaa4. The runtime will prefer the VTID if present
  @VTID(78)
  boolean isConflict();


  /**
   * <p>
   * Getter method for the COM property "AutoResolvedWinner"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64186) //= 0xfaba. The runtime will prefer the VTID if present
  @VTID(79)
  boolean autoResolvedWinner();


  /**
   * <p>
   * Getter method for the COM property "Conflicts"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Conflicts
   */

  @DISPID(64187) //= 0xfabb. The runtime will prefer the VTID if present
  @VTID(80)
  com.microsoft.outlook.Conflicts conflicts();


  /**
   * <p>
   * Getter method for the COM property "SenderEmailAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3103) //= 0xc1f. The runtime will prefer the VTID if present
  @VTID(81)
  String senderEmailAddress();


  /**
   * <p>
   * Getter method for the COM property "SenderEmailType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3102) //= 0xc1e. The runtime will prefer the VTID if present
  @VTID(82)
  String senderEmailType();


  /**
   * <p>
   * Getter method for the COM property "PropertyAccessor"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._PropertyAccessor
   */

  @DISPID(64253) //= 0xfafd. The runtime will prefer the VTID if present
  @VTID(83)
  com.microsoft.outlook._PropertyAccessor propertyAccessor();


  /**
   * <p>
   * Getter method for the COM property "TaskSubject"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64543) //= 0xfc1f. The runtime will prefer the VTID if present
  @VTID(84)
  String taskSubject();


  /**
   * <p>
   * Setter method for the COM property "TaskSubject"
   * </p>
   * @param taskSubject Mandatory java.lang.String parameter.
   */

  @DISPID(64543) //= 0xfc1f. The runtime will prefer the VTID if present
  @VTID(85)
  void taskSubject(
          String taskSubject);


  /**
   * <p>
   * Getter method for the COM property "TaskDueDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(33029) //= 0x8105. The runtime will prefer the VTID if present
  @VTID(86)
  java.util.Date taskDueDate();


  /**
   * <p>
   * Setter method for the COM property "TaskDueDate"
   * </p>
   * @param taskDueDate Mandatory java.util.Date parameter.
   */

  @DISPID(33029) //= 0x8105. The runtime will prefer the VTID if present
  @VTID(87)
  void taskDueDate(
          java.util.Date taskDueDate);


  /**
   * <p>
   * Getter method for the COM property "TaskStartDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(33028) //= 0x8104. The runtime will prefer the VTID if present
  @VTID(88)
  java.util.Date taskStartDate();


  /**
   * <p>
   * Setter method for the COM property "TaskStartDate"
   * </p>
   * @param taskStartDate Mandatory java.util.Date parameter.
   */

  @DISPID(33028) //= 0x8104. The runtime will prefer the VTID if present
  @VTID(89)
  void taskStartDate(
          java.util.Date taskStartDate);


  /**
   * <p>
   * Getter method for the COM property "TaskCompletedDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(33039) //= 0x810f. The runtime will prefer the VTID if present
  @VTID(90)
  java.util.Date taskCompletedDate();


  /**
   * <p>
   * Setter method for the COM property "TaskCompletedDate"
   * </p>
   * @param taskCompletedDate Mandatory java.util.Date parameter.
   */

  @DISPID(33039) //= 0x810f. The runtime will prefer the VTID if present
  @VTID(91)
  void taskCompletedDate(
          java.util.Date taskCompletedDate);


  /**
   * <p>
   * Getter method for the COM property "ToDoTaskOrdinal"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(34208) //= 0x85a0. The runtime will prefer the VTID if present
  @VTID(92)
  java.util.Date toDoTaskOrdinal();


  /**
   * <p>
   * Setter method for the COM property "ToDoTaskOrdinal"
   * </p>
   * @param toDoTaskOrdinal Mandatory java.util.Date parameter.
   */

  @DISPID(34208) //= 0x85a0. The runtime will prefer the VTID if present
  @VTID(93)
  void toDoTaskOrdinal(
          java.util.Date toDoTaskOrdinal);


  /**
   * <p>
   * Getter method for the COM property "ReminderOverrideDefault"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(34076) //= 0x851c. The runtime will prefer the VTID if present
  @VTID(94)
  boolean reminderOverrideDefault();


  /**
   * <p>
   * Setter method for the COM property "ReminderOverrideDefault"
   * </p>
   * @param reminderOverrideDefault Mandatory boolean parameter.
   */

  @DISPID(34076) //= 0x851c. The runtime will prefer the VTID if present
  @VTID(95)
  void reminderOverrideDefault(
          boolean reminderOverrideDefault);


  /**
   * <p>
   * Getter method for the COM property "ReminderPlaySound"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(34078) //= 0x851e. The runtime will prefer the VTID if present
  @VTID(96)
  boolean reminderPlaySound();


  /**
   * <p>
   * Setter method for the COM property "ReminderPlaySound"
   * </p>
   * @param reminderPlaySound Mandatory boolean parameter.
   */

  @DISPID(34078) //= 0x851e. The runtime will prefer the VTID if present
  @VTID(97)
  void reminderPlaySound(
          boolean reminderPlaySound);


  /**
   * <p>
   * Getter method for the COM property "ReminderSet"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(34051) //= 0x8503. The runtime will prefer the VTID if present
  @VTID(98)
  boolean reminderSet();


  /**
   * <p>
   * Setter method for the COM property "ReminderSet"
   * </p>
   * @param reminderSet Mandatory boolean parameter.
   */

  @DISPID(34051) //= 0x8503. The runtime will prefer the VTID if present
  @VTID(99)
  void reminderSet(
          boolean reminderSet);


  /**
   * <p>
   * Getter method for the COM property "ReminderSoundFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(34079) //= 0x851f. The runtime will prefer the VTID if present
  @VTID(100)
  String reminderSoundFile();


  /**
   * <p>
   * Setter method for the COM property "ReminderSoundFile"
   * </p>
   * @param reminderSoundFile Mandatory java.lang.String parameter.
   */

  @DISPID(34079) //= 0x851f. The runtime will prefer the VTID if present
  @VTID(101)
  void reminderSoundFile(
          String reminderSoundFile);


  /**
   * <p>
   * Getter method for the COM property "ReminderTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(34050) //= 0x8502. The runtime will prefer the VTID if present
  @VTID(102)
  java.util.Date reminderTime();


  /**
   * <p>
   * Setter method for the COM property "ReminderTime"
   * </p>
   * @param reminderTime Mandatory java.util.Date parameter.
   */

  @DISPID(34050) //= 0x8502. The runtime will prefer the VTID if present
  @VTID(103)
  void reminderTime(
          java.util.Date reminderTime);


  /**
   * @param markInterval Mandatory com.microsoft.outlook.OlMarkInterval parameter.
   */

  @DISPID(64510) //= 0xfbfe. The runtime will prefer the VTID if present
  @VTID(104)
  void markAsTask(
          com.microsoft.outlook.OlMarkInterval markInterval);


  /**
   */

  @DISPID(64521) //= 0xfc09. The runtime will prefer the VTID if present
  @VTID(105)
  void clearTaskFlag();


  /**
   * <p>
   * Getter method for the COM property "IsMarkedAsTask"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64522) //= 0xfc0a. The runtime will prefer the VTID if present
  @VTID(106)
  boolean isMarkedAsTask();


  /**
   * @return  Returns a value of type com.microsoft.outlook._Conversation
   */

  @DISPID(64596) //= 0xfc54. The runtime will prefer the VTID if present
  @VTID(107)
  com.microsoft.outlook._Conversation getConversation();


  /**
   * <p>
   * Getter method for the COM property "ConversationID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64629) //= 0xfc75. The runtime will prefer the VTID if present
  @VTID(108)
  String conversationID();


  /**
   * <p>
   * Getter method for the COM property "RTFBody"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(64644) //= 0xfc84. The runtime will prefer the VTID if present
  @VTID(109)
  @ReturnValue(type=NativeType.VARIANT)
  Object rtfBody();


  /**
   * <p>
   * Setter method for the COM property "RTFBody"
   * </p>
   * @param rtfBody Mandatory java.lang.Object parameter.
   */

  @DISPID(64644) //= 0xfc84. The runtime will prefer the VTID if present
  @VTID(110)
  void rtfBody(
          @MarshalAs(NativeType.VARIANT) Object rtfBody);


  // Properties:
}
