package com.microsoft.outlook;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface _DDocSiteControl extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ReadOnly"
   * </p>
   */

  @DISPID(-2147356664)
  @PropGet
  byte readOnly();


  /**
   * <p>
   * Setter method for the COM property "ReadOnly"
   * </p>
   * @param rhs Mandatory byte parameter.
   */

  @DISPID(-2147356664)
  @PropPut
  void readOnly(
          byte rhs);


  /**
   * <p>
   * Getter method for the COM property "SuppressAttachments"
   * </p>
   */

  @DISPID(64483)
  @PropGet
  byte suppressAttachments();


  /**
   * <p>
   * Setter method for the COM property "SuppressAttachments"
   * </p>
   * @param rhs Mandatory byte parameter.
   */

  @DISPID(64483)
  @PropPut
  void suppressAttachments(
          byte rhs);


  // Properties:
}
