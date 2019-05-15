package com.microsoft.outlook;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

@IID("{000CDB06-0000-0000-C000-000000000046}")
public interface ICustomXMLPartEvents extends Com4jObject {
  // Methods:
  /**
   * @param newNode Mandatory com.microsoft.outlook.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void nodeAfterInsert(
          CustomXMLNode newNode,
          boolean inUndoRedo);


  /**
   * @param oldNode Mandatory com.microsoft.outlook.CustomXMLNode parameter.
   * @param oldParentNode Mandatory com.microsoft.outlook.CustomXMLNode parameter.
   * @param oldNextSibling Mandatory com.microsoft.outlook.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void nodeAfterDelete(
          CustomXMLNode oldNode,
          CustomXMLNode oldParentNode,
          CustomXMLNode oldNextSibling,
          boolean inUndoRedo);


  /**
   * @param oldNode Mandatory com.microsoft.outlook.CustomXMLNode parameter.
   * @param newNode Mandatory com.microsoft.outlook.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void nodeAfterReplace(
          CustomXMLNode oldNode,
          CustomXMLNode newNode,
          boolean inUndoRedo);


  // Properties:
}
