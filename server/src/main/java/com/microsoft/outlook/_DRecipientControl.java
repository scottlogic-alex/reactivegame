package com.microsoft.outlook;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface _DRecipientControl extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   */

  @DISPID(-514)
  @PropGet
  byte enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param rhs Mandatory byte parameter.
   */

  @DISPID(-514)
  @PropPut
  void enabled(
          byte rhs);


  /**
   * <p>
   * Getter method for the COM property "BackColor"
   * </p>
   */

  @DISPID(-501)
  @PropGet
  int backColor();


  /**
   * <p>
   * Setter method for the COM property "BackColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(-501)
  @PropPut
  void backColor(
          int rhs);


  /**
   * <p>
   * Getter method for the COM property "ForeColor"
   * </p>
   */

  @DISPID(-513)
  @PropGet
  int foreColor();


  /**
   * <p>
   * Setter method for the COM property "ForeColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(-513)
  @PropPut
  void foreColor(
          int rhs);


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
   * Getter method for the COM property "Font"
   * </p>
   */

  @DISPID(-512)
  @PropGet
  Com4jObject font();


  /**
   * <p>
   * Setter method for the COM property "Font"
   * </p>
   * @param rhs Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(-512)
  @PropPut
  void font(
          Com4jObject rhs);


  /**
   * <p>
   * Getter method for the COM property "SpecialEffect"
   * </p>
   */

  @DISPID(12)
  @PropGet
  int specialEffect();


  /**
   * <p>
   * Setter method for the COM property "SpecialEffect"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(12)
  @PropPut
  void specialEffect(
          int rhs);


  // Properties:
}
