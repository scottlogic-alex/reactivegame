package com.microsoft.outlook;

import com4j.*;

@IID("{00063005-0000-0000-C000-000000000046}")
public interface _Inspector extends Com4jObject {
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
   * Getter method for the COM property "CommandBars"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._CommandBars
   */

  @DISPID(8448) //= 0x2100. The runtime will prefer the VTID if present
  @VTID(11)
  com.microsoft.outlook._CommandBars commandBars();


  /**
   * <p>
   * Getter method for the COM property "CurrentItem"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(8450) //= 0x2102. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject currentItem();


  /**
   * <p>
   * Getter method for the COM property "EditorType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlEditorType
   */

  @DISPID(8464) //= 0x2110. The runtime will prefer the VTID if present
  @VTID(13)
  com.microsoft.outlook.OlEditorType editorType();


  /**
   * <p>
   * Getter method for the COM property "ModifiedFormPages"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(8454) //= 0x2106. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject modifiedFormPages();


  /**
   * @param saveMode Mandatory com.microsoft.outlook.OlInspectorClose parameter.
   */

  @DISPID(8451) //= 0x2103. The runtime will prefer the VTID if present
  @VTID(15)
  void close(
          com.microsoft.outlook.OlInspectorClose saveMode);


  /**
   * @param modal Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(8452) //= 0x2104. The runtime will prefer the VTID if present
  @VTID(16)
  void display(
          @Optional @MarshalAs(NativeType.VARIANT) Object modal);


  /**
   * @param pageName Mandatory java.lang.String parameter.
   */

  @DISPID(8456) //= 0x2108. The runtime will prefer the VTID if present
  @VTID(17)
  void hideFormPage(
          String pageName);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(8453) //= 0x2105. The runtime will prefer the VTID if present
  @VTID(18)
  boolean isWordMail();


  /**
   * @param pageName Mandatory java.lang.String parameter.
   */

  @DISPID(8460) //= 0x210c. The runtime will prefer the VTID if present
  @VTID(19)
  void setCurrentFormPage(
          String pageName);


  /**
   * @param pageName Mandatory java.lang.String parameter.
   */

  @DISPID(8457) //= 0x2109. The runtime will prefer the VTID if present
  @VTID(20)
  void showFormPage(
          String pageName);


  /**
   * <p>
   * Getter method for the COM property "HTMLEditor"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(8462) //= 0x210e. The runtime will prefer the VTID if present
  @VTID(21)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject htmlEditor();


  /**
   * <p>
   * Getter method for the COM property "WordEditor"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(8463) //= 0x210f. The runtime will prefer the VTID if present
  @VTID(22)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject wordEditor();


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8465) //= 0x2111. The runtime will prefer the VTID if present
  @VTID(23)
  String caption();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8468) //= 0x2114. The runtime will prefer the VTID if present
  @VTID(24)
  int height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param height Mandatory int parameter.
   */

  @DISPID(8468) //= 0x2114. The runtime will prefer the VTID if present
  @VTID(25)
  void height(
          int height);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8469) //= 0x2115. The runtime will prefer the VTID if present
  @VTID(26)
  int left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param left Mandatory int parameter.
   */

  @DISPID(8469) //= 0x2115. The runtime will prefer the VTID if present
  @VTID(27)
  void left(
          int left);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8470) //= 0x2116. The runtime will prefer the VTID if present
  @VTID(28)
  int top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param top Mandatory int parameter.
   */

  @DISPID(8470) //= 0x2116. The runtime will prefer the VTID if present
  @VTID(29)
  void top(
          int top);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8471) //= 0x2117. The runtime will prefer the VTID if present
  @VTID(30)
  int width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param width Mandatory int parameter.
   */

  @DISPID(8471) //= 0x2117. The runtime will prefer the VTID if present
  @VTID(31)
  void width(
          int width);


  /**
   * <p>
   * Getter method for the COM property "WindowState"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlWindowState
   */

  @DISPID(8466) //= 0x2112. The runtime will prefer the VTID if present
  @VTID(32)
  com.microsoft.outlook.OlWindowState windowState();


  /**
   * <p>
   * Setter method for the COM property "WindowState"
   * </p>
   * @param windowState Mandatory com.microsoft.outlook.OlWindowState parameter.
   */

  @DISPID(8466) //= 0x2112. The runtime will prefer the VTID if present
  @VTID(33)
  void windowState(
          com.microsoft.outlook.OlWindowState windowState);


  /**
   */

  @DISPID(8467) //= 0x2113. The runtime will prefer the VTID if present
  @VTID(34)
  void activate();


  /**
   * @param control Mandatory com4j.Com4jObject parameter.
   * @param propertyName Mandatory java.lang.String parameter.
   */

  @DISPID(64201) //= 0xfac9. The runtime will prefer the VTID if present
  @VTID(35)
  void setControlItemProperty(
          @MarshalAs(NativeType.Dispatch) Com4jObject control,
          String propertyName);


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(64493) //= 0xfbed. The runtime will prefer the VTID if present
  @VTID(36)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject newFormRegion();


  /**
   * @param path Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(64511) //= 0xfbff. The runtime will prefer the VTID if present
  @VTID(37)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject openFormRegion(
          String path);


  /**
   * @param page Mandatory com4j.Com4jObject parameter.
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(64512) //= 0xfc00. The runtime will prefer the VTID if present
  @VTID(38)
  void saveFormRegion(
          @MarshalAs(NativeType.Dispatch) Com4jObject page,
          String fileName);


  /**
   * <p>
   * Getter method for the COM property "AttachmentSelection"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._AttachmentSelection
   */

  @DISPID(64632) //= 0xfc78. The runtime will prefer the VTID if present
  @VTID(39)
  com.microsoft.outlook._AttachmentSelection attachmentSelection();


  /**
   * @param start Mandatory java.util.Date parameter.
   */

  @DISPID(64647) //= 0xfc87. The runtime will prefer the VTID if present
  @VTID(40)
  void setSchedulingStartTime(
          java.util.Date start);


  // Properties:
}
