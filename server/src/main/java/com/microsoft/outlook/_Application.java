package com.microsoft.outlook;

import com4j.*;

@IID("{00063001-0000-0000-C000-000000000046}")
public interface _Application extends Com4jObject {
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
   * Getter method for the COM property "Assistant"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Assistant
   */

  @DISPID(276) //= 0x114. The runtime will prefer the VTID if present
  @VTID(11)
  Assistant assistant();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(12)
  String name();


  /**
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(278) //= 0x116. The runtime will prefer the VTID if present
  @VTID(13)
  String version();


  /**
   * @return  Returns a value of type com.microsoft.outlook._Explorer
   */

  @DISPID(273) //= 0x111. The runtime will prefer the VTID if present
  @VTID(14)
  _Explorer activeExplorer();


  /**
   * @return  Returns a value of type com.microsoft.outlook._Inspector
   */

  @DISPID(274) //= 0x112. The runtime will prefer the VTID if present
  @VTID(15)
  _Inspector activeInspector();


  /**
   * @param itemType Mandatory com.microsoft.outlook.OlItemType parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(266) //= 0x10a. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject createItem(
          OlItemType itemType);


  /**
   * @param templatePath Mandatory java.lang.String parameter.
   * @param inFolder Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(267) //= 0x10b. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject createItemFromTemplate(
          String templatePath,
          @Optional @MarshalAs(NativeType.VARIANT) Object inFolder);


  /**
   * @param objectName Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(277) //= 0x115. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject createObject(
          String objectName);


  /**
   * @param type Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.microsoft.outlook._NameSpace
   */

  @DISPID(272) //= 0x110. The runtime will prefer the VTID if present
  @VTID(19)
  _NameSpace getNamespace(
          String type);


  /**
   */

  @DISPID(275) //= 0x113. The runtime will prefer the VTID if present
  @VTID(20)
  void quit();


  /**
   * <p>
   * Getter method for the COM property "COMAddIns"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.COMAddIns
   */

  @DISPID(280) //= 0x118. The runtime will prefer the VTID if present
  @VTID(21)
  COMAddIns comAddIns();


  @VTID(21)
  @ReturnValue(defaultPropertyThrough={COMAddIns.class})
  COMAddIn comAddIns(
          Object index);

  /**
   * <p>
   * Getter method for the COM property "Explorers"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Explorers
   */

  @DISPID(281) //= 0x119. The runtime will prefer the VTID if present
  @VTID(22)
  _Explorers explorers();


  /**
   * <p>
   * Getter method for the COM property "Inspectors"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Inspectors
   */

  @DISPID(282) //= 0x11a. The runtime will prefer the VTID if present
  @VTID(23)
  _Inspectors inspectors();


  /**
   * <p>
   * Getter method for the COM property "LanguageSettings"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.LanguageSettings
   */

  @DISPID(283) //= 0x11b. The runtime will prefer the VTID if present
  @VTID(24)
  com.microsoft.outlook.LanguageSettings languageSettings();


  /**
   * <p>
   * Getter method for the COM property "ProductCode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(284) //= 0x11c. The runtime will prefer the VTID if present
  @VTID(25)
  String productCode();


  /**
   * <p>
   * Getter method for the COM property "AnswerWizard"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.AnswerWizard
   */

  @DISPID(285) //= 0x11d. The runtime will prefer the VTID if present
  @VTID(26)
  com.microsoft.outlook.AnswerWizard answerWizard();


  /**
   * <p>
   * Getter method for the COM property "FeatureInstall"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoFeatureInstall
   */

  @DISPID(286) //= 0x11e. The runtime will prefer the VTID if present
  @VTID(27)
  com.microsoft.outlook.MsoFeatureInstall featureInstall();


  /**
   * <p>
   * Setter method for the COM property "FeatureInstall"
   * </p>
   * @param featureInstall Mandatory com.microsoft.outlook.MsoFeatureInstall parameter.
   */

  @DISPID(286) //= 0x11e. The runtime will prefer the VTID if present
  @VTID(28)
  void featureInstall(
          com.microsoft.outlook.MsoFeatureInstall featureInstall);


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(287) //= 0x11f. The runtime will prefer the VTID if present
  @VTID(29)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject activeWindow();


  /**
   * @param filePath Mandatory java.lang.String parameter.
   * @param destFolderPath Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(64098) //= 0xfa62. The runtime will prefer the VTID if present
  @VTID(30)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject copyFile(
          String filePath,
          String destFolderPath);


  /**
   * @param scope Mandatory java.lang.String parameter.
   * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param searchSubFolders Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tag Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com.microsoft.outlook.Search
   */

  @DISPID(64101) //= 0xfa65. The runtime will prefer the VTID if present
  @VTID(31)
  Search advancedSearch(
          String scope,
          @Optional @MarshalAs(NativeType.VARIANT) Object filter,
          @Optional @MarshalAs(NativeType.VARIANT) Object searchSubFolders,
          @Optional @MarshalAs(NativeType.VARIANT) Object tag);


  /**
   * @param lookInFolders Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(64108) //= 0xfa6c. The runtime will prefer the VTID if present
  @VTID(32)
  boolean isSearchSynchronous(
          String lookInFolders);


  /**
   * @param pvar Mandatory java.lang.Object parameter.
   */

  @DISPID(64072) //= 0xfa48. The runtime will prefer the VTID if present
  @VTID(33)
  void getNewNickNames(
          Object pvar);


  /**
   * <p>
   * Getter method for the COM property "Reminders"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Reminders
   */

  @DISPID(64153) //= 0xfa99. The runtime will prefer the VTID if present
  @VTID(34)
  _Reminders reminders();


  @VTID(34)
  @ReturnValue(defaultPropertyThrough={_Reminders.class})
  _Reminder reminders(
          @MarshalAs(NativeType.VARIANT) Object index);

  /**
   * <p>
   * Getter method for the COM property "DefaultProfileName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64214) //= 0xfad6. The runtime will prefer the VTID if present
  @VTID(35)
  String defaultProfileName();


  /**
   * <p>
   * Getter method for the COM property "IsTrusted"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64499) //= 0xfbf3. The runtime will prefer the VTID if present
  @VTID(36)
  boolean isTrusted();


  /**
   * @param item Mandatory com4j.Com4jObject parameter.
   * @param referenceType Mandatory com.microsoft.outlook.OlReferenceType parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(64470) //= 0xfbd6. The runtime will prefer the VTID if present
  @VTID(37)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject getObjectReference(
          @MarshalAs(NativeType.Dispatch) Com4jObject item,
          com.microsoft.outlook.OlReferenceType referenceType);


  /**
   * <p>
   * Getter method for the COM property "Assistance"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.IAssistance
   */

  @DISPID(64520) //= 0xfc08. The runtime will prefer the VTID if present
  @VTID(38)
  IAssistance assistance();


  /**
   * <p>
   * Getter method for the COM property "TimeZones"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._TimeZones
   */

  @DISPID(64553) //= 0xfc29. The runtime will prefer the VTID if present
  @VTID(39)
  _TimeZones timeZones();


  /**
   * <p>
   * Getter method for the COM property "PickerDialog"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.PickerDialog
   */

  @DISPID(64613) //= 0xfc65. The runtime will prefer the VTID if present
  @VTID(40)
  com.microsoft.outlook.PickerDialog pickerDialog();


  /**
   * @param regionName Mandatory java.lang.String parameter.
   */

  @DISPID(64639) //= 0xfc7f. The runtime will prefer the VTID if present
  @VTID(41)
  void refreshFormRegionDefinition(
          String regionName);


  /**
   * <p>
   * Getter method for the COM property "MsoDebugOptions"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoDebugOptions
   */

  @DISPID(64673) //= 0xfca1. The runtime will prefer the VTID if present
  @VTID(42)
  com.microsoft.outlook.MsoDebugOptions msoDebugOptions();


  // Properties:
}
