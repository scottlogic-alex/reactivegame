package com.microsoft.outlook;

import com4j.*;
import com4j.stdole.IFontDisp;
import com4j.stdole.IPictureDisp;

@IID("{000672D9-0000-0000-C000-000000000046}")
public interface _OlkLabel extends Com4jObject {
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
   * Getter method for the COM property "AutoSize"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-500) //= 0xfffffe0c. The runtime will prefer the VTID if present
  @VTID(9)
  boolean autoSize();


  /**
   * <p>
   * Setter method for the COM property "AutoSize"
   * </p>
   * @param autoSize Mandatory boolean parameter.
   */

  @DISPID(-500) //= 0xfffffe0c. The runtime will prefer the VTID if present
  @VTID(10)
  void autoSize(
          boolean autoSize);


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
  com.microsoft.outlook.OlBackStyle backStyle();


  /**
   * <p>
   * Setter method for the COM property "BackStyle"
   * </p>
   * @param backStyle Mandatory com.microsoft.outlook.OlBackStyle parameter.
   */

  @DISPID(-502) //= 0xfffffe0a. The runtime will prefer the VTID if present
  @VTID(14)
  void backStyle(
          com.microsoft.outlook.OlBackStyle backStyle);


  /**
   * <p>
   * Getter method for the COM property "BorderStyle"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlBorderStyle
   */

  @DISPID(-504) //= 0xfffffe08. The runtime will prefer the VTID if present
  @VTID(15)
  com.microsoft.outlook.OlBorderStyle borderStyle();


  /**
   * <p>
   * Setter method for the COM property "BorderStyle"
   * </p>
   * @param borderStyle Mandatory com.microsoft.outlook.OlBorderStyle parameter.
   */

  @DISPID(-504) //= 0xfffffe08. The runtime will prefer the VTID if present
  @VTID(16)
  void borderStyle(
          com.microsoft.outlook.OlBorderStyle borderStyle);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-518) //= 0xfffffdfa. The runtime will prefer the VTID if present
  @VTID(17)
  String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param caption Mandatory java.lang.String parameter.
   */

  @DISPID(-518) //= 0xfffffdfa. The runtime will prefer the VTID if present
  @VTID(18)
  void caption(
          String caption);


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-514) //= 0xfffffdfe. The runtime will prefer the VTID if present
  @VTID(19)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param enabled Mandatory boolean parameter.
   */

  @DISPID(-514) //= 0xfffffdfe. The runtime will prefer the VTID if present
  @VTID(20)
  void enabled(
          boolean enabled);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type IFontDisp
   */

  @DISPID(-512) //= 0xfffffe00. The runtime will prefer the VTID if present
  @VTID(21)
  IFontDisp font();


  /**
   * <p>
   * Getter method for the COM property "ForeColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-513) //= 0xfffffdff. The runtime will prefer the VTID if present
  @VTID(22)
  int foreColor();


  /**
   * <p>
   * Setter method for the COM property "ForeColor"
   * </p>
   * @param foreColor Mandatory int parameter.
   */

  @DISPID(-513) //= 0xfffffdff. The runtime will prefer the VTID if present
  @VTID(23)
  void foreColor(
          int foreColor);


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
  com.microsoft.outlook.OlMousePointer mousePointer();


  /**
   * <p>
   * Setter method for the COM property "MousePointer"
   * </p>
   * @param mousePointer Mandatory com.microsoft.outlook.OlMousePointer parameter.
   */

  @DISPID(-521) //= 0xfffffdf7. The runtime will prefer the VTID if present
  @VTID(27)
  void mousePointer(
          com.microsoft.outlook.OlMousePointer mousePointer);


  /**
   * <p>
   * Getter method for the COM property "TextAlign"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlTextAlign
   */

  @DISPID(10004) //= 0x2714. The runtime will prefer the VTID if present
  @VTID(28)
  com.microsoft.outlook.OlTextAlign textAlign();


  /**
   * <p>
   * Setter method for the COM property "TextAlign"
   * </p>
   * @param textAlign Mandatory com.microsoft.outlook.OlTextAlign parameter.
   */

  @DISPID(10004) //= 0x2714. The runtime will prefer the VTID if present
  @VTID(29)
  void textAlign(
          com.microsoft.outlook.OlTextAlign textAlign);


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


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(32)
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
  @VTID(33)
  @DefaultMethod
  void value(
          @MarshalAs(NativeType.VARIANT) Object value);


  /**
   * <p>
   * Getter method for the COM property "UseHeaderColor"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64537) //= 0xfc19. The runtime will prefer the VTID if present
  @VTID(34)
  boolean useHeaderColor();


  /**
   * <p>
   * Setter method for the COM property "UseHeaderColor"
   * </p>
   * @param useHeaderColor Mandatory boolean parameter.
   */

  @DISPID(64537) //= 0xfc19. The runtime will prefer the VTID if present
  @VTID(35)
  void useHeaderColor(
          boolean useHeaderColor);


  // Properties:
}
