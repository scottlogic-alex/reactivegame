package com.microsoft.outlook;

import com4j.*;

@IID("{00063003-0000-0000-C000-000000000046}")
public interface _Explorer extends Com4jObject {
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
   * Getter method for the COM property "CurrentFolder"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(8449) //= 0x2101. The runtime will prefer the VTID if present
  @VTID(12)
  com.microsoft.outlook.MAPIFolder currentFolder();


  /**
   * <p>
   * Setter method for the COM property "CurrentFolder"
   * </p>
   * @param currentFolder Mandatory com.microsoft.outlook.MAPIFolder parameter.
   */

  @DISPID(8449) //= 0x2101. The runtime will prefer the VTID if present
  @VTID(13)
  void currentFolder(
          com.microsoft.outlook.MAPIFolder currentFolder);


  /**
   */

  @DISPID(8451) //= 0x2103. The runtime will prefer the VTID if present
  @VTID(14)
  void close();


  /**
   */

  @DISPID(8452) //= 0x2104. The runtime will prefer the VTID if present
  @VTID(15)
  void display();


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8465) //= 0x2111. The runtime will prefer the VTID if present
  @VTID(16)
  String caption();


  /**
   * <p>
   * Getter method for the COM property "CurrentView"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(8704) //= 0x2200. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  Object currentView();


  /**
   * <p>
   * Setter method for the COM property "CurrentView"
   * </p>
   * @param currentView Mandatory java.lang.Object parameter.
   */

  @DISPID(8704) //= 0x2200. The runtime will prefer the VTID if present
  @VTID(18)
  void currentView(
          @MarshalAs(NativeType.VARIANT) Object currentView);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8468) //= 0x2114. The runtime will prefer the VTID if present
  @VTID(19)
  int height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param height Mandatory int parameter.
   */

  @DISPID(8468) //= 0x2114. The runtime will prefer the VTID if present
  @VTID(20)
  void height(
          int height);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8469) //= 0x2115. The runtime will prefer the VTID if present
  @VTID(21)
  int left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param left Mandatory int parameter.
   */

  @DISPID(8469) //= 0x2115. The runtime will prefer the VTID if present
  @VTID(22)
  void left(
          int left);


  /**
   * <p>
   * Getter method for the COM property "Panes"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Panes
   */

  @DISPID(8705) //= 0x2201. The runtime will prefer the VTID if present
  @VTID(23)
  Panes panes();


  /**
   * <p>
   * Getter method for the COM property "Selection"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Selection
   */

  @DISPID(8706) //= 0x2202. The runtime will prefer the VTID if present
  @VTID(24)
  com.microsoft.outlook.Selection selection();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8470) //= 0x2116. The runtime will prefer the VTID if present
  @VTID(25)
  int top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param top Mandatory int parameter.
   */

  @DISPID(8470) //= 0x2116. The runtime will prefer the VTID if present
  @VTID(26)
  void top(
          int top);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8471) //= 0x2117. The runtime will prefer the VTID if present
  @VTID(27)
  int width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param width Mandatory int parameter.
   */

  @DISPID(8471) //= 0x2117. The runtime will prefer the VTID if present
  @VTID(28)
  void width(
          int width);


  /**
   * <p>
   * Getter method for the COM property "WindowState"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlWindowState
   */

  @DISPID(8466) //= 0x2112. The runtime will prefer the VTID if present
  @VTID(29)
  com.microsoft.outlook.OlWindowState windowState();


  /**
   * <p>
   * Setter method for the COM property "WindowState"
   * </p>
   * @param windowState Mandatory com.microsoft.outlook.OlWindowState parameter.
   */

  @DISPID(8466) //= 0x2112. The runtime will prefer the VTID if present
  @VTID(30)
  void windowState(
          com.microsoft.outlook.OlWindowState windowState);


  /**
   */

  @DISPID(8467) //= 0x2113. The runtime will prefer the VTID if present
  @VTID(31)
  void activate();


  /**
   * @param pane Mandatory com.microsoft.outlook.OlPane parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(8707) //= 0x2203. The runtime will prefer the VTID if present
  @VTID(32)
  boolean isPaneVisible(
          OlPane pane);


  /**
   * @param pane Mandatory com.microsoft.outlook.OlPane parameter.
   * @param visible Mandatory boolean parameter.
   */

  @DISPID(8708) //= 0x2204. The runtime will prefer the VTID if present
  @VTID(33)
  void showPane(
          OlPane pane,
          boolean visible);


  /**
   * <p>
   * Getter method for the COM property "Views"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(12553) //= 0x3109. The runtime will prefer the VTID if present
  @VTID(34)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject views();


  /**
   * <p>
   * Getter method for the COM property "HTMLDocument"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(64146) //= 0xfa92. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject htmlDocument();


  /**
   * @param folder Mandatory com.microsoft.outlook.MAPIFolder parameter.
   */

  @DISPID(64177) //= 0xfab1. The runtime will prefer the VTID if present
  @VTID(36)
  void selectFolder(
          com.microsoft.outlook.MAPIFolder folder);


  /**
   * @param folder Mandatory com.microsoft.outlook.MAPIFolder parameter.
   */

  @DISPID(64178) //= 0xfab2. The runtime will prefer the VTID if present
  @VTID(37)
  void deselectFolder(
          com.microsoft.outlook.MAPIFolder folder);


  /**
   * @param folder Mandatory com.microsoft.outlook.MAPIFolder parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(64179) //= 0xfab3. The runtime will prefer the VTID if present
  @VTID(38)
  boolean isFolderSelected(
          com.microsoft.outlook.MAPIFolder folder);


  /**
   * <p>
   * Getter method for the COM property "NavigationPane"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._NavigationPane
   */

  @DISPID(64435) //= 0xfbb3. The runtime will prefer the VTID if present
  @VTID(39)
  com.microsoft.outlook._NavigationPane navigationPane();


  /**
   */

  @DISPID(64461) //= 0xfbcd. The runtime will prefer the VTID if present
  @VTID(40)
  void clearSearch();


  /**
   * @param query Mandatory java.lang.String parameter.
   * @param searchScope Mandatory com.microsoft.outlook.OlSearchScope parameter.
   */

  @DISPID(64101) //= 0xfa65. The runtime will prefer the VTID if present
  @VTID(41)
  void search(
          String query,
          com.microsoft.outlook.OlSearchScope searchScope);


  /**
   * @param item Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(64565) //= 0xfc35. The runtime will prefer the VTID if present
  @VTID(42)
  boolean isItemSelectableInView(
          @MarshalAs(NativeType.Dispatch) Com4jObject item);


  /**
   * @param item Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(64566) //= 0xfc36. The runtime will prefer the VTID if present
  @VTID(43)
  void addToSelection(
          @MarshalAs(NativeType.Dispatch) Com4jObject item);


  /**
   * @param item Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(64567) //= 0xfc37. The runtime will prefer the VTID if present
  @VTID(44)
  void removeFromSelection(
          @MarshalAs(NativeType.Dispatch) Com4jObject item);


  /**
   */

  @DISPID(64568) //= 0xfc38. The runtime will prefer the VTID if present
  @VTID(45)
  void selectAllItems();


  /**
   */

  @DISPID(64569) //= 0xfc39. The runtime will prefer the VTID if present
  @VTID(46)
  void clearSelection();


  /**
   * <p>
   * Getter method for the COM property "AccountSelector"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._AccountSelector
   */

  @DISPID(64625) //= 0xfc71. The runtime will prefer the VTID if present
  @VTID(47)
  com.microsoft.outlook._AccountSelector accountSelector();


  /**
   * <p>
   * Getter method for the COM property "AttachmentSelection"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._AttachmentSelection
   */

  @DISPID(64632) //= 0xfc78. The runtime will prefer the VTID if present
  @VTID(48)
  com.microsoft.outlook._AttachmentSelection attachmentSelection();


  /**
   * <p>
   * Getter method for the COM property "ActiveInlineResponse"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(64659) //= 0xfc93. The runtime will prefer the VTID if present
  @VTID(49)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject activeInlineResponse();


  /**
   * <p>
   * Getter method for the COM property "ActiveInlineResponseWordEditor"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(64660) //= 0xfc94. The runtime will prefer the VTID if present
  @VTID(50)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject activeInlineResponseWordEditor();


  /**
   * <p>
   * Getter method for the COM property "DisplayMode"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlDisplayMode
   */

  @DISPID(64663) //= 0xfc97. The runtime will prefer the VTID if present
  @VTID(51)
  com.microsoft.outlook.OlDisplayMode displayMode();


  /**
   * <p>
   * Getter method for the COM property "PreviewPane"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._PreviewPane
   */

  @DISPID(64671) //= 0xfc9f. The runtime will prefer the VTID if present
  @VTID(52)
  com.microsoft.outlook._PreviewPane previewPane();


  // Properties:
}
