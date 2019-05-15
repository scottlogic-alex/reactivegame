package com.microsoft.outlook.events;

import com4j.DISPID;
import com4j.IID;

@IID("{000CDB07-0000-0000-C000-000000000046}")
public abstract class _CustomXMLPartEvents {
  // Methods:
  /**
   * @param newNode Mandatory com.microsoft.outlook.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(1)
  public void nodeAfterInsert(
    com.microsoft.outlook.CustomXMLNode newNode,
    boolean inUndoRedo) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param oldNode Mandatory com.microsoft.outlook.CustomXMLNode parameter.
   * @param oldParentNode Mandatory com.microsoft.outlook.CustomXMLNode parameter.
   * @param oldNextSibling Mandatory com.microsoft.outlook.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(2)
  public void nodeAfterDelete(
    com.microsoft.outlook.CustomXMLNode oldNode,
    com.microsoft.outlook.CustomXMLNode oldParentNode,
    com.microsoft.outlook.CustomXMLNode oldNextSibling,
    boolean inUndoRedo) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param oldNode Mandatory com.microsoft.outlook.CustomXMLNode parameter.
   * @param newNode Mandatory com.microsoft.outlook.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(3)
  public void nodeAfterReplace(
    com.microsoft.outlook.CustomXMLNode oldNode,
    com.microsoft.outlook.CustomXMLNode newNode,
    boolean inUndoRedo) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
