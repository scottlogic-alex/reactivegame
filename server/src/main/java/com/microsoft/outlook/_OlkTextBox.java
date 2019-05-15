package com.microsoft.outlook;

import com4j.*;
import com4j.stdole.IFontDisp;
import com4j.stdole.IPictureDisp;

@IID("{000672DA-0000-0000-C000-000000000046}")
public interface _OlkTextBox extends Com4jObject {
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
   * Getter method for the COM property "AutoTab"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(9)
  boolean autoTab();


  /**
   * <p>
   * Setter method for the COM property "AutoTab"
   * </p>
   * @param autoTab Mandatory boolean parameter.
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(10)
  void autoTab(
          boolean autoTab);


  /**
   * <p>
   * Getter method for the COM property "AutoWordSelect"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(11)
  boolean autoWordSelect();


  /**
   * <p>
   * Setter method for the COM property "AutoWordSelect"
   * </p>
   * @param autoWordSelect Mandatory boolean parameter.
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(12)
  void autoWordSelect(
          boolean autoWordSelect);


  /**
   * <p>
   * Getter method for the COM property "BackColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(13)
  int backColor();


  /**
   * <p>
   * Setter method for the COM property "BackColor"
   * </p>
   * @param backColor Mandatory int parameter.
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(14)
  void backColor(
          int backColor);


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
   * Getter method for the COM property "DragBehavior"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlDragBehavior
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(17)
  com.microsoft.outlook.OlDragBehavior dragBehavior();


  /**
   * <p>
   * Setter method for the COM property "DragBehavior"
   * </p>
   * @param dragBehavior Mandatory com.microsoft.outlook.OlDragBehavior parameter.
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(18)
  void dragBehavior(
          com.microsoft.outlook.OlDragBehavior dragBehavior);


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
   * Getter method for the COM property "EnterFieldBehavior"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlEnterFieldBehavior
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(21)
  com.microsoft.outlook.OlEnterFieldBehavior enterFieldBehavior();


  /**
   * <p>
   * Setter method for the COM property "EnterFieldBehavior"
   * </p>
   * @param enterFieldBehavior Mandatory com.microsoft.outlook.OlEnterFieldBehavior parameter.
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(22)
  void enterFieldBehavior(
          com.microsoft.outlook.OlEnterFieldBehavior enterFieldBehavior);


  /**
   * <p>
   * Getter method for the COM property "EnterKeyBehavior"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-544) //= 0xfffffde0. The runtime will prefer the VTID if present
  @VTID(23)
  boolean enterKeyBehavior();


  /**
   * <p>
   * Setter method for the COM property "EnterKeyBehavior"
   * </p>
   * @param enterKeyBehavior Mandatory boolean parameter.
   */

  @DISPID(-544) //= 0xfffffde0. The runtime will prefer the VTID if present
  @VTID(24)
  void enterKeyBehavior(
          boolean enterKeyBehavior);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type IFontDisp
   */

  @DISPID(-512) //= 0xfffffe00. The runtime will prefer the VTID if present
  @VTID(25)
  IFontDisp font();


  /**
   * <p>
   * Getter method for the COM property "ForeColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-513) //= 0xfffffdff. The runtime will prefer the VTID if present
  @VTID(26)
  int foreColor();


  /**
   * <p>
   * Setter method for the COM property "ForeColor"
   * </p>
   * @param foreColor Mandatory int parameter.
   */

  @DISPID(-513) //= 0xfffffdff. The runtime will prefer the VTID if present
  @VTID(27)
  void foreColor(
          int foreColor);


  /**
   * <p>
   * Getter method for the COM property "HideSelection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(28)
  boolean hideSelection();


  /**
   * <p>
   * Setter method for the COM property "HideSelection"
   * </p>
   * @param hideSelection Mandatory boolean parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(29)
  void hideSelection(
          boolean hideSelection);


  /**
   * <p>
   * Getter method for the COM property "IntegralHeight"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(604) //= 0x25c. The runtime will prefer the VTID if present
  @VTID(30)
  boolean integralHeight();


  /**
   * <p>
   * Setter method for the COM property "IntegralHeight"
   * </p>
   * @param integralHeight Mandatory boolean parameter.
   */

  @DISPID(604) //= 0x25c. The runtime will prefer the VTID if present
  @VTID(31)
  void integralHeight(
          boolean integralHeight);


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(32)
  boolean locked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param locked Mandatory boolean parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(33)
  void locked(
          boolean locked);


  /**
   * <p>
   * Getter method for the COM property "MaxLength"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-533) //= 0xfffffdeb. The runtime will prefer the VTID if present
  @VTID(34)
  int maxLength();


  /**
   * <p>
   * Setter method for the COM property "MaxLength"
   * </p>
   * @param maxLength Mandatory int parameter.
   */

  @DISPID(-533) //= 0xfffffdeb. The runtime will prefer the VTID if present
  @VTID(35)
  void maxLength(
          int maxLength);


  /**
   * <p>
   * Getter method for the COM property "MouseIcon"
   * </p>
   * @return  Returns a value of type IPictureDisp
   */

  @DISPID(-522) //= 0xfffffdf6. The runtime will prefer the VTID if present
  @VTID(36)
  IPictureDisp mouseIcon();


  /**
   * <p>
   * Setter method for the COM property "MouseIcon"
   * </p>
   * @param mouseIcon Mandatory IPictureDisp parameter.
   */

  @DISPID(-522) //= 0xfffffdf6. The runtime will prefer the VTID if present
  @VTID(37)
  void mouseIcon(
          IPictureDisp mouseIcon);


  /**
   * <p>
   * Getter method for the COM property "MousePointer"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlMousePointer
   */

  @DISPID(-521) //= 0xfffffdf7. The runtime will prefer the VTID if present
  @VTID(38)
  com.microsoft.outlook.OlMousePointer mousePointer();


  /**
   * <p>
   * Setter method for the COM property "MousePointer"
   * </p>
   * @param mousePointer Mandatory com.microsoft.outlook.OlMousePointer parameter.
   */

  @DISPID(-521) //= 0xfffffdf7. The runtime will prefer the VTID if present
  @VTID(39)
  void mousePointer(
          com.microsoft.outlook.OlMousePointer mousePointer);


  /**
   * <p>
   * Getter method for the COM property "MultiLine"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-537) //= 0xfffffde7. The runtime will prefer the VTID if present
  @VTID(40)
  boolean multiLine();


  /**
   * <p>
   * Setter method for the COM property "MultiLine"
   * </p>
   * @param multiLine Mandatory boolean parameter.
   */

  @DISPID(-537) //= 0xfffffde7. The runtime will prefer the VTID if present
  @VTID(41)
  void multiLine(
          boolean multiLine);


  /**
   * <p>
   * Getter method for the COM property "PasswordChar"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-534) //= 0xfffffdea. The runtime will prefer the VTID if present
  @VTID(42)
  String passwordChar();


  /**
   * <p>
   * Setter method for the COM property "PasswordChar"
   * </p>
   * @param passwordChar Mandatory java.lang.String parameter.
   */

  @DISPID(-534) //= 0xfffffdea. The runtime will prefer the VTID if present
  @VTID(43)
  void passwordChar(
          String passwordChar);


  /**
   * <p>
   * Getter method for the COM property "Scrollbars"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlScrollBars
   */

  @DISPID(-535) //= 0xfffffde9. The runtime will prefer the VTID if present
  @VTID(44)
  com.microsoft.outlook.OlScrollBars scrollbars();


  /**
   * <p>
   * Setter method for the COM property "Scrollbars"
   * </p>
   * @param scrollbars Mandatory com.microsoft.outlook.OlScrollBars parameter.
   */

  @DISPID(-535) //= 0xfffffde9. The runtime will prefer the VTID if present
  @VTID(45)
  void scrollbars(
          com.microsoft.outlook.OlScrollBars scrollbars);


  /**
   * <p>
   * Getter method for the COM property "SelectionMargin"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(46)
  boolean selectionMargin();


  /**
   * <p>
   * Setter method for the COM property "SelectionMargin"
   * </p>
   * @param selectionMargin Mandatory boolean parameter.
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(47)
  void selectionMargin(
          boolean selectionMargin);


  /**
   * <p>
   * Getter method for the COM property "TabKeyBehavior"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-545) //= 0xfffffddf. The runtime will prefer the VTID if present
  @VTID(48)
  boolean tabKeyBehavior();


  /**
   * <p>
   * Setter method for the COM property "TabKeyBehavior"
   * </p>
   * @param tabKeyBehavior Mandatory boolean parameter.
   */

  @DISPID(-545) //= 0xfffffddf. The runtime will prefer the VTID if present
  @VTID(49)
  void tabKeyBehavior(
          boolean tabKeyBehavior);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-517) //= 0xfffffdfb. The runtime will prefer the VTID if present
  @VTID(50)
  String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(-517) //= 0xfffffdfb. The runtime will prefer the VTID if present
  @VTID(51)
  void text(
          String text);


  /**
   * <p>
   * Getter method for the COM property "TextAlign"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlTextAlign
   */

  @DISPID(10004) //= 0x2714. The runtime will prefer the VTID if present
  @VTID(52)
  com.microsoft.outlook.OlTextAlign textAlign();


  /**
   * <p>
   * Setter method for the COM property "TextAlign"
   * </p>
   * @param textAlign Mandatory com.microsoft.outlook.OlTextAlign parameter.
   */

  @DISPID(10004) //= 0x2714. The runtime will prefer the VTID if present
  @VTID(53)
  void textAlign(
          com.microsoft.outlook.OlTextAlign textAlign);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(54)
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
  @VTID(55)
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
  @VTID(56)
  boolean wordWrap();


  /**
   * <p>
   * Setter method for the COM property "WordWrap"
   * </p>
   * @param wordWrap Mandatory boolean parameter.
   */

  @DISPID(-536) //= 0xfffffde8. The runtime will prefer the VTID if present
  @VTID(57)
  void wordWrap(
          boolean wordWrap);


  /**
   * <p>
   * Getter method for the COM property "SelStart"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-547) //= 0xfffffddd. The runtime will prefer the VTID if present
  @VTID(58)
  int selStart();


  /**
   * <p>
   * Setter method for the COM property "SelStart"
   * </p>
   * @param selStart Mandatory int parameter.
   */

  @DISPID(-547) //= 0xfffffddd. The runtime will prefer the VTID if present
  @VTID(59)
  void selStart(
          int selStart);


  /**
   * <p>
   * Getter method for the COM property "SelLength"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-548) //= 0xfffffddc. The runtime will prefer the VTID if present
  @VTID(60)
  int selLength();


  /**
   * <p>
   * Setter method for the COM property "SelLength"
   * </p>
   * @param selLength Mandatory int parameter.
   */

  @DISPID(-548) //= 0xfffffddc. The runtime will prefer the VTID if present
  @VTID(61)
  void selLength(
          int selLength);


  /**
   * <p>
   * Getter method for the COM property "SelText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-546) //= 0xfffffdde. The runtime will prefer the VTID if present
  @VTID(62)
  String selText();


  /**
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(63)
  void cut();


  /**
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(64)
  void copy();


  /**
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(65)
  void paste();


  /**
   */

  @DISPID(-554) //= 0xfffffdd6. The runtime will prefer the VTID if present
  @VTID(66)
  void clear();


  /**
   * <p>
   * Getter method for the COM property "EnableRichText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64524) //= 0xfc0c. The runtime will prefer the VTID if present
  @VTID(67)
  boolean enableRichText();


  /**
   * <p>
   * Setter method for the COM property "EnableRichText"
   * </p>
   * @param enableRichText Mandatory boolean parameter.
   */

  @DISPID(64524) //= 0xfc0c. The runtime will prefer the VTID if present
  @VTID(68)
  void enableRichText(
          boolean enableRichText);


  // Properties:
}
