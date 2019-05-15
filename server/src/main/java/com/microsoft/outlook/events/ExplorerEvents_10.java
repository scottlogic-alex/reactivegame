package com.microsoft.outlook.events;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.Holder;
import com4j.IID;

@IID("{0006300F-0000-0000-C000-000000000046}")
public abstract class ExplorerEvents_10 {
  // Methods:
  /**
   */

  @DISPID(61441)
  public void activate() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(61442)
  public void folderSwitch() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param newFolder Mandatory com4j.Com4jObject parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61443)
  public void beforeFolderSwitch(
    Com4jObject newFolder,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(61444)
  public void viewSwitch() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param newView Mandatory java.lang.Object parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61445)
  public void beforeViewSwitch(
    Object newView,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(61446)
  public void deactivate() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(61447)
  public void selectionChange() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(61448)
  public void close() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(64017)
  public void beforeMaximize(
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(64018)
  public void beforeMinimize(
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(64019)
  public void beforeMove(
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(64020)
  public void beforeSize(
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(64014)
  public void beforeItemCopy(
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(64015)
  public void beforeItemCut(
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param clipboardContent Mandatory java.lang.Object parameter.
   * @param target Mandatory com.microsoft.outlook.MAPIFolder parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(64016)
  public void beforeItemPaste(
    Object clipboardContent,
    com.microsoft.outlook.MAPIFolder target,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(64633)
  public void attachmentSelectionChange() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param item Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(64658)
  public void inlineResponse(
    Com4jObject item) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(64662)
  public void inlineResponseClose() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param displayMode Mandatory com.microsoft.outlook.OlDisplayMode parameter.
   */

  @DISPID(64664)
  public void displayModeChange(
    com.microsoft.outlook.OlDisplayMode displayMode) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
