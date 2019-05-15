package com.microsoft.outlook;

import com4j.*;
import com4j.stdole.IFontDisp;
import com4j.stdole.IPictureDisp;

@IID("{000672DC-0000-0000-C000-000000000046}")
public interface _OlkOptionButton extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Accelerator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-543) //= 0xfffffde1. The runtime will prefer the VTID if present
  @VTID(7)
  String accelerator();


  /**
   * <p>
   * Setter method for the COM property "Accelerator"
   * </p>
   * @param acceleratorChar Mandatory java.lang.String parameter.
   */

  @DISPID(-543) //= 0xfffffde1. The runtime will prefer the VTID if present
  @VTID(8)
  void accelerator(
          String acceleratorChar);


  /**
   * <p>
   * Getter method for the COM property "Alignment"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlAlignment
   */

  @DISPID(710) //= 0x2c6. The runtime will prefer the VTID if present
  @VTID(9)
  OlAlignment alignment();


  /**
   * <p>
   * Setter method for the COM property "Alignment"
   * </p>
   * @param alignment Mandatory com.microsoft.outlook.OlAlignment parameter.
   */

  @DISPID(710) //= 0x2c6. The runtime will prefer the VTID if present
  @VTID(10)
  void alignment(
          OlAlignment alignment);


  /**
   * <p>
   * Getter method for the COM property "BackColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(11)
  int backColor();


  /**
   * <p>
   * Setter method for the COM property "BackColor"
   * </p>
   * @param backColor Mandatory int parameter.
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(12)
  void backColor(
          int backColor);


  /**
   * <p>
   * Getter method for the COM property "BackStyle"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlBackStyle
   */

  @DISPID(-502) //= 0xfffffe0a. The runtime will prefer the VTID if present
  @VTID(13)
  OlBackStyle backStyle();


  /**
   * <p>
   * Setter method for the COM property "BackStyle"
   * </p>
   * @param backStyle Mandatory com.microsoft.outlook.OlBackStyle parameter.
   */

  @DISPID(-502) //= 0xfffffe0a. The runtime will prefer the VTID if present
  @VTID(14)
  void backStyle(
          OlBackStyle backStyle);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-518) //= 0xfffffdfa. The runtime will prefer the VTID if present
  @VTID(15)
  String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param caption Mandatory java.lang.String parameter.
   */

  @DISPID(-518) //= 0xfffffdfa. The runtime will prefer the VTID if present
  @VTID(16)
  void caption(
          String caption);


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-514) //= 0xfffffdfe. The runtime will prefer the VTID if present
  @VTID(17)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param enabled Mandatory boolean parameter.
   */

  @DISPID(-514) //= 0xfffffdfe. The runtime will prefer the VTID if present
  @VTID(18)
  void enabled(
          boolean enabled);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type IFontDisp
   */

  @DISPID(-512) //= 0xfffffe00. The runtime will prefer the VTID if present
  @VTID(19)
  IFontDisp font();


  /**
   * <p>
   * Getter method for the COM property "ForeColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-513) //= 0xfffffdff. The runtime will prefer the VTID if present
  @VTID(20)
  int foreColor();


  /**
   * <p>
   * Setter method for the COM property "ForeColor"
   * </p>
   * @param foreColor Mandatory int parameter.
   */

  @DISPID(-513) //= 0xfffffdff. The runtime will prefer the VTID if present
  @VTID(21)
  void foreColor(
          int foreColor);


  /**
   * <p>
   * Getter method for the COM property "GroupName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-541) //= 0xfffffde3. The runtime will prefer the VTID if present
  @VTID(22)
  String groupName();


  /**
   * <p>
   * Setter method for the COM property "GroupName"
   * </p>
   * @param groupName Mandatory java.lang.String parameter.
   */

  @DISPID(-541) //= 0xfffffde3. The runtime will prefer the VTID if present
  @VTID(23)
  void groupName(
          String groupName);


  /**
   * <p>
   * Getter method for the COM property "MouseIcon"
   * </p>
   * @return  Returns a value of type IPictureDisp
   */

  @DISPID(-522) //= 0xfffffdf6. The runtime will prefer the VTID if present
  @VTID(24)
  IPictureDisp mouseIcon();


  /**
   * <p>
   * Setter method for the COM property "MouseIcon"
   * </p>
   * @param mouseIcon Mandatory IPictureDisp parameter.
   */

  @DISPID(-522) //= 0xfffffdf6. The runtime will prefer the VTID if present
  @VTID(25)
  void mouseIcon(
          IPictureDisp mouseIcon);


  /**
   * <p>
   * Getter method for the COM property "MousePointer"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlMousePointer
   */

  @DISPID(-521) //= 0xfffffdf7. The runtime will prefer the VTID if present
  @VTID(26)
  OlMousePointer mousePointer();


  /**
   * <p>
   * Setter method for the COM property "MousePointer"
   * </p>
   * @param mousePointer Mandatory com.microsoft.outlook.OlMousePointer parameter.
   */

  @DISPID(-521) //= 0xfffffdf7. The runtime will prefer the VTID if present
  @VTID(27)
  void mousePointer(
          OlMousePointer mousePointer);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(28)
  @DefaultMethod
  @ReturnValue(type=NativeType.VARIANT)
  Object value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(29)
  @DefaultMethod
  void value(
          @MarshalAs(NativeType.VARIANT) Object value);


  /**
   * <p>
   * Getter method for the COM property "WordWrap"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-536) //= 0xfffffde8. The runtime will prefer the VTID if present
  @VTID(30)
  boolean wordWrap();


  /**
   * <p>
   * Setter method for the COM property "WordWrap"
   * </p>
   * @param wordWrap Mandatory boolean parameter.
   */

  @DISPID(-536) //= 0xfffffde8. The runtime will prefer the VTID if present
  @VTID(31)
  void wordWrap(
          boolean wordWrap);


  // Properties:
}
