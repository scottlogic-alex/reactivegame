package com.microsoft.outlook;

import com4j.*;

@IID("{D87E7E16-6897-11CE-A6C0-00AA00608FAA}")
public interface _IRecipientControl extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type byte
   */

  @VTID(7)
  byte enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param enabled Mandatory byte parameter.
   */

  @VTID(8)
  void enabled(
          byte enabled);


  /**
   * <p>
   * Getter method for the COM property "BackColor"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(9)
  int backColor();


  /**
   * <p>
   * Setter method for the COM property "BackColor"
   * </p>
   * @param backColor Mandatory int parameter.
   */

  @VTID(10)
  void backColor(
          int backColor);


  /**
   * <p>
   * Getter method for the COM property "ForeColor"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int foreColor();


  /**
   * <p>
   * Setter method for the COM property "ForeColor"
   * </p>
   * @param foreColor Mandatory int parameter.
   */

  @VTID(12)
  void foreColor(
          int foreColor);


  /**
   * <p>
   * Getter method for the COM property "ReadOnly"
   * </p>
   * @return  Returns a value of type byte
   */

  @VTID(13)
  byte readOnly();


  /**
   * <p>
   * Setter method for the COM property "ReadOnly"
   * </p>
   * @param readOnly Mandatory byte parameter.
   */

  @VTID(14)
  void readOnly(
          byte readOnly);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject font();


  /**
   * <p>
   * Setter method for the COM property "Font"
   * </p>
   * @param font Mandatory com4j.Com4jObject parameter.
   */

  @VTID(16)
  void font(
          @MarshalAs(NativeType.Dispatch) Com4jObject font);


  /**
   * <p>
   * Getter method for the COM property "SpecialEffect"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(17)
  int specialEffect();


  /**
   * <p>
   * Setter method for the COM property "SpecialEffect"
   * </p>
   * @param effect Mandatory int parameter.
   */

  @VTID(18)
  void specialEffect(
          int effect);


  // Properties:
}
