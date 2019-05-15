package com.microsoft.outlook;

import com4j.*;

@IID("{000C0385-0000-0000-C000-000000000046}")
public interface SharedWorkspace extends _IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  void name(
          String name);


  /**
   * <p>
   * Getter method for the COM property "Members"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.SharedWorkspaceMembers
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  com.microsoft.outlook.SharedWorkspaceMembers members();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.SharedWorkspaceMembers.class})
  com.microsoft.outlook.SharedWorkspaceMember members(
          int index);

  /**
   * <p>
   * Getter method for the COM property "Tasks"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.SharedWorkspaceTasks
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  com.microsoft.outlook.SharedWorkspaceTasks tasks();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.SharedWorkspaceTasks.class})
  com.microsoft.outlook.SharedWorkspaceTask tasks(
          int index);

  /**
   * <p>
   * Getter method for the COM property "Files"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.SharedWorkspaceFiles
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  com.microsoft.outlook.SharedWorkspaceFiles files();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.SharedWorkspaceFiles.class})
  com.microsoft.outlook.SharedWorkspaceFile files(
          int index);

  /**
   * <p>
   * Getter method for the COM property "Folders"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.SharedWorkspaceFolders
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  com.microsoft.outlook.SharedWorkspaceFolders folders();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.SharedWorkspaceFolders.class})
  com.microsoft.outlook.SharedWorkspaceFolder folders(
          int index);

  /**
   * <p>
   * Getter method for the COM property "Links"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.SharedWorkspaceLinks
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  com.microsoft.outlook.SharedWorkspaceLinks links();


  @VTID(15)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.SharedWorkspaceLinks.class})
  com.microsoft.outlook.SharedWorkspaceLink links(
          int index);

  /**
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  void refresh();


  /**
   * @param url Optional parameter. Default value is com4j.Variant.getMissing()
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(17)
  void createNew(
          @Optional @MarshalAs(NativeType.VARIANT) Object url,
          @Optional @MarshalAs(NativeType.VARIANT) Object name);


  /**
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(18)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "URL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(20)
  String url();


  /**
   * <p>
   * Getter method for the COM property "Connected"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(21)
  boolean connected();


  /**
   * <p>
   * Getter method for the COM property "LastRefreshed"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  Object lastRefreshed();


  /**
   * <p>
   * Getter method for the COM property "SourceURL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(23)
  String sourceURL();


  /**
   * <p>
   * Setter method for the COM property "SourceURL"
   * </p>
   * @param pbstrSourceURL Mandatory java.lang.String parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(24)
  void sourceURL(
          String pbstrSourceURL);


  /**
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(25)
  void removeDocument();


  /**
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(26)
  void disconnect();


  // Properties:
}
