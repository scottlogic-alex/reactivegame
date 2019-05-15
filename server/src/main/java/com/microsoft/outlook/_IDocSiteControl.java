package com.microsoft.outlook;

import com4j.Com4jObject;
import com4j.IID;
import com4j.VTID;

@IID("{43507DD0-811D-11CE-B565-00AA00608FAA}")
public interface _IDocSiteControl extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ReadOnly"
   * </p>
   * @return  Returns a value of type byte
   */

  @VTID(7)
  byte readOnly();


  /**
   * <p>
   * Setter method for the COM property "ReadOnly"
   * </p>
   * @param readOnly Mandatory byte parameter.
   */

  @VTID(8)
  void readOnly(
          byte readOnly);


  /**
   * <p>
   * Getter method for the COM property "SuppressAttachments"
   * </p>
   * @return  Returns a value of type byte
   */

  @VTID(9)
  byte suppressAttachments();


  /**
   * <p>
   * Setter method for the COM property "SuppressAttachments"
   * </p>
   * @param suppressAttachments Mandatory byte parameter.
   */

  @VTID(10)
  void suppressAttachments(
          byte suppressAttachments);


  // Properties:
}
