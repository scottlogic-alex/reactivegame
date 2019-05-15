package com.microsoft.outlook.events;

import com4j.DISPID;
import com4j.IID;

@IID("{000C033C-0000-0000-C000-000000000046}")
public abstract class _CustomTaskPaneEvents {
  // Methods:
  /**
   * @param customTaskPaneInst Mandatory com.microsoft.outlook._CustomTaskPane parameter.
   */

  @DISPID(1)
  public void visibleStateChange(
    com.microsoft.outlook._CustomTaskPane customTaskPaneInst) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param customTaskPaneInst Mandatory com.microsoft.outlook._CustomTaskPane parameter.
   */

  @DISPID(2)
  public void dockPositionStateChange(
    com.microsoft.outlook._CustomTaskPane customTaskPaneInst) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
