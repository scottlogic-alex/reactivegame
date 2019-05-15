package com.microsoft.outlook.events;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.Holder;
import com4j.IID;

@IID("{0006302C-0000-0000-C000-000000000046}")
public abstract class ApplicationEvents_11 {
  // Methods:
  /**
   * @param item Mandatory com4j.Com4jObject parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61442)
  public void itemSend(
    Com4jObject item,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(61443)
  public void newMail() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param item Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(61444)
  public void reminder(
    Com4jObject item) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pages Mandatory com.microsoft.outlook.PropertyPages parameter.
   */

  @DISPID(61445)
  public void optionsPagesAdd(
    com.microsoft.outlook.PropertyPages pages) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(61446)
  public void startup() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(61447)
  public void quit() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param searchObject Mandatory com.microsoft.outlook.Search parameter.
   */

  @DISPID(64106)
  public void advancedSearchComplete(
    com.microsoft.outlook.Search searchObject) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param searchObject Mandatory com.microsoft.outlook.Search parameter.
   */

  @DISPID(64107)
  public void advancedSearchStopped(
    com.microsoft.outlook.Search searchObject) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(64144)
  public void mapiLogonComplete() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param entryIDCollection Mandatory java.lang.String parameter.
   */

  @DISPID(64181)
  public void newMailEx(
    String entryIDCollection) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param commandBar Mandatory com.microsoft.outlook.CommandBar parameter.
   * @param attachments Mandatory com.microsoft.outlook._AttachmentSelection parameter.
   */

  @DISPID(64318)
  public void attachmentContextMenuDisplay(
    com.microsoft.outlook.CommandBar commandBar,
    com.microsoft.outlook._AttachmentSelection attachments) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param commandBar Mandatory com.microsoft.outlook.CommandBar parameter.
   * @param folder Mandatory com.microsoft.outlook.MAPIFolder parameter.
   */

  @DISPID(64322)
  public void folderContextMenuDisplay(
    com.microsoft.outlook.CommandBar commandBar,
    com.microsoft.outlook.MAPIFolder folder) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param commandBar Mandatory com.microsoft.outlook.CommandBar parameter.
   * @param store Mandatory com.microsoft.outlook._Store parameter.
   */

  @DISPID(64323)
  public void storeContextMenuDisplay(
    com.microsoft.outlook.CommandBar commandBar,
    com.microsoft.outlook._Store store) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param commandBar Mandatory com.microsoft.outlook.CommandBar parameter.
   * @param shortcut Mandatory com.microsoft.outlook.OutlookBarShortcut parameter.
   */

  @DISPID(64324)
  public void shortcutContextMenuDisplay(
    com.microsoft.outlook.CommandBar commandBar,
    com.microsoft.outlook.OutlookBarShortcut shortcut) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param commandBar Mandatory com.microsoft.outlook.CommandBar parameter.
   * @param view Mandatory com.microsoft.outlook.View parameter.
   */

  @DISPID(64320)
  public void viewContextMenuDisplay(
    com.microsoft.outlook.CommandBar commandBar,
    com.microsoft.outlook.View view) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param commandBar Mandatory com.microsoft.outlook.CommandBar parameter.
   * @param selection Mandatory com.microsoft.outlook.Selection parameter.
   */

  @DISPID(64321)
  public void itemContextMenuDisplay(
    com.microsoft.outlook.CommandBar commandBar,
    com.microsoft.outlook.Selection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param contextMenu Mandatory com.microsoft.outlook.OlContextMenu parameter.
   */

  @DISPID(64422)
  public void contextMenuClose(
    com.microsoft.outlook.OlContextMenu contextMenu) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param item Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(64423)
  public void itemLoad(
    Com4jObject item) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param folderToShare Mandatory com.microsoft.outlook.MAPIFolder parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(64513)
  public void beforeFolderSharingDialog(
    com.microsoft.outlook.MAPIFolder folderToShare,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
