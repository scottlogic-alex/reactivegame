package com.microsoft.outlook;

import com4j.*;
import com4j.stdole.IFontDisp;
import com4j.stdole.IPictureDisp;

@IID("{000672EF-0000-0000-C000-000000000046}")
public interface _OlkTimeControl extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "AutoSize"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-500) //= 0xfffffe0c. The runtime will prefer the VTID if present
  @VTID(7)
  boolean autoSize();


  /**
   * <p>
   * Setter method for the COM property "AutoSize"
   * </p>
   * @param autoSize Mandatory boolean parameter.
   */

  @DISPID(-500) //= 0xfffffe0c. The runtime will prefer the VTID if present
  @VTID(8)
  void autoSize(
          boolean autoSize);


  /**
   * <p>
   * Getter method for the COM property "AutoWordSelect"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(9)
  boolean autoWordSelect();


  /**
   * <p>
   * Setter method for the COM property "AutoWordSelect"
   * </p>
   * @param autoWordSelect Mandatory boolean parameter.
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(10)
  void autoWordSelect(
          boolean autoWordSelect);


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
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-514) //= 0xfffffdfe. The runtime will prefer the VTID if present
  @VTID(15)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param enabled Mandatory boolean parameter.
   */

  @DISPID(-514) //= 0xfffffdfe. The runtime will prefer the VTID if present
  @VTID(16)
  void enabled(
          boolean enabled);


  /**
   * <p>
   * Getter method for the COM property "EnterFieldBehavior"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlEnterFieldBehavior
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(17)
  com.microsoft.outlook.OlEnterFieldBehavior enterFieldBehavior();


  /**
   * <p>
   * Setter method for the COM property "EnterFieldBehavior"
   * </p>
   * @param enterFieldBehavior Mandatory com.microsoft.outlook.OlEnterFieldBehavior parameter.
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(18)
  void enterFieldBehavior(
          com.microsoft.outlook.OlEnterFieldBehavior enterFieldBehavior);


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
   * Getter method for the COM property "HideSelection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(22)
  boolean hideSelection();


  /**
   * <p>
   * Setter method for the COM property "HideSelection"
   * </p>
   * @param hideSelection Mandatory boolean parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(23)
  void hideSelection(
          boolean hideSelection);


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(24)
  boolean locked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param locked Mandatory boolean parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(25)
  void locked(
          boolean locked);


  /**
   * <p>
   * Getter method for the COM property "MouseIcon"
   * </p>
   * @return  Returns a value of type IPictureDisp
   */

  @DISPID(-522) //= 0xfffffdf6. The runtime will prefer the VTID if present
  @VTID(26)
  IPictureDisp mouseIcon();


  /**
   * <p>
   * Setter method for the COM property "MouseIcon"
   * </p>
   * @param mouseIcon Mandatory IPictureDisp parameter.
   */

  @DISPID(-522) //= 0xfffffdf6. The runtime will prefer the VTID if present
  @VTID(27)
  void mouseIcon(
          IPictureDisp mouseIcon);


  /**
   * <p>
   * Getter method for the COM property "MousePointer"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlMousePointer
   */

  @DISPID(-521) //= 0xfffffdf7. The runtime will prefer the VTID if present
  @VTID(28)
  OlMousePointer mousePointer();


  /**
   * <p>
   * Setter method for the COM property "MousePointer"
   * </p>
   * @param mousePointer Mandatory com.microsoft.outlook.OlMousePointer parameter.
   */

  @DISPID(-521) //= 0xfffffdf7. The runtime will prefer the VTID if present
  @VTID(29)
  void mousePointer(
          OlMousePointer mousePointer);


  /**
   * <p>
   * Getter method for the COM property "ReferenceTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(64468) //= 0xfbd4. The runtime will prefer the VTID if present
  @VTID(30)
  java.util.Date referenceTime();


  /**
   * <p>
   * Setter method for the COM property "ReferenceTime"
   * </p>
   * @param referenceTime Mandatory java.util.Date parameter.
   */

  @DISPID(64468) //= 0xfbd4. The runtime will prefer the VTID if present
  @VTID(31)
  void referenceTime(
          java.util.Date referenceTime);


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlTimeStyle
   */

  @DISPID(64469) //= 0xfbd5. The runtime will prefer the VTID if present
  @VTID(32)
  OlTimeStyle style();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param timeStyle Mandatory com.microsoft.outlook.OlTimeStyle parameter.
   */

  @DISPID(64469) //= 0xfbd5. The runtime will prefer the VTID if present
  @VTID(33)
  void style(
          OlTimeStyle timeStyle);


  /**
   * <p>
   * Getter method for the COM property "Time"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(64466) //= 0xfbd2. The runtime will prefer the VTID if present
  @VTID(34)
  java.util.Date time();


  /**
   * <p>
   * Setter method for the COM property "Time"
   * </p>
   * @param time Mandatory java.util.Date parameter.
   */

  @DISPID(64466) //= 0xfbd2. The runtime will prefer the VTID if present
  @VTID(35)
  void time(
          java.util.Date time);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-517) //= 0xfffffdfb. The runtime will prefer the VTID if present
  @VTID(36)
  String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(-517) //= 0xfffffdfb. The runtime will prefer the VTID if present
  @VTID(37)
  void text(
          String text);


  /**
   * <p>
   * Getter method for the COM property "TextAlign"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlTextAlign
   */

  @DISPID(10004) //= 0x2714. The runtime will prefer the VTID if present
  @VTID(38)
  OlTextAlign textAlign();


  /**
   * <p>
   * Setter method for the COM property "TextAlign"
   * </p>
   * @param textAlign Mandatory com.microsoft.outlook.OlTextAlign parameter.
   */

  @DISPID(10004) //= 0x2714. The runtime will prefer the VTID if present
  @VTID(39)
  void textAlign(
          OlTextAlign textAlign);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(40)
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
  @VTID(41)
  @DefaultMethod
  void value(
          @MarshalAs(NativeType.VARIANT) Object value);


  /**
   * <p>
   * Getter method for the COM property "IntervalTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(64475) //= 0xfbdb. The runtime will prefer the VTID if present
  @VTID(42)
  java.util.Date intervalTime();


  /**
   * <p>
   * Setter method for the COM property "IntervalTime"
   * </p>
   * @param intervalTime Mandatory java.util.Date parameter.
   */

  @DISPID(64475) //= 0xfbdb. The runtime will prefer the VTID if present
  @VTID(43)
  void intervalTime(
          java.util.Date intervalTime);


  /**
   */

  @DISPID(1001) //= 0x3e9. The runtime will prefer the VTID if present
  @VTID(44)
  void dropDown();


  // Properties:
}
