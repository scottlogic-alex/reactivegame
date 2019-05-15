package com.microsoft.outlook.events;

import com4j.DISPID;
import com4j.IID;

@IID("{00063076-0000-0000-C000-000000000046}")
public abstract class FoldersEvents {
  // Methods:
  /**
   * @param folder Mandatory com.microsoft.outlook.MAPIFolder parameter.
   */

  @DISPID(61441)
  public void folderAdd(
    com.microsoft.outlook.MAPIFolder folder) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param folder Mandatory com.microsoft.outlook.MAPIFolder parameter.
   */

  @DISPID(61442)
  public void folderChange(
    com.microsoft.outlook.MAPIFolder folder) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(61443)
  public void folderRemove() {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
