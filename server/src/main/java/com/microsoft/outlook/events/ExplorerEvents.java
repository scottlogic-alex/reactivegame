package com.microsoft.outlook.events;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.Holder;
import com4j.IID;

@IID("{0006304F-0000-0000-C000-000000000046}")
public abstract class ExplorerEvents {
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


  // Properties:
}
