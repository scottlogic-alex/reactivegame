package com.microsoft.outlook;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import com4j.stdole.IPictureDisp;

@IID("{000672F4-0000-0000-C000-000000000046}")
public interface _OlkCategory extends Com4jObject {
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
   * Getter method for the COM property "BackColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(9)
  int backColor();


  /**
   * <p>
   * Setter method for the COM property "BackColor"
   * </p>
   * @param backColor Mandatory int parameter.
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(10)
  void backColor(
          int backColor);


  /**
   * <p>
   * Getter method for the COM property "BackStyle"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlBackStyle
   */

  @DISPID(-502) //= 0xfffffe0a. The runtime will prefer the VTID if present
  @VTID(11)
  OlBackStyle backStyle();


  /**
   * <p>
   * Setter method for the COM property "BackStyle"
   * </p>
   * @param backStyle Mandatory com.microsoft.outlook.OlBackStyle parameter.
   */

  @DISPID(-502) //= 0xfffffe0a. The runtime will prefer the VTID if present
  @VTID(12)
  void backStyle(
          OlBackStyle backStyle);


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-514) //= 0xfffffdfe. The runtime will prefer the VTID if present
  @VTID(13)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param enabled Mandatory boolean parameter.
   */

  @DISPID(-514) //= 0xfffffdfe. The runtime will prefer the VTID if present
  @VTID(14)
  void enabled(
          boolean enabled);


  /**
   * <p>
   * Getter method for the COM property "ForeColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-513) //= 0xfffffdff. The runtime will prefer the VTID if present
  @VTID(15)
  int foreColor();


  /**
   * <p>
   * Setter method for the COM property "ForeColor"
   * </p>
   * @param foreColor Mandatory int parameter.
   */

  @DISPID(-513) //= 0xfffffdff. The runtime will prefer the VTID if present
  @VTID(16)
  void foreColor(
          int foreColor);


  /**
   * <p>
   * Getter method for the COM property "MouseIcon"
   * </p>
   * @return  Returns a value of type IPictureDisp
   */

  @DISPID(-522) //= 0xfffffdf6. The runtime will prefer the VTID if present
  @VTID(17)
  IPictureDisp mouseIcon();


  /**
   * <p>
   * Setter method for the COM property "MouseIcon"
   * </p>
   * @param mouseIcon Mandatory IPictureDisp parameter.
   */

  @DISPID(-522) //= 0xfffffdf6. The runtime will prefer the VTID if present
  @VTID(18)
  void mouseIcon(
          IPictureDisp mouseIcon);


  /**
   * <p>
   * Getter method for the COM property "MousePointer"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlMousePointer
   */

  @DISPID(-521) //= 0xfffffdf7. The runtime will prefer the VTID if present
  @VTID(19)
  com.microsoft.outlook.OlMousePointer mousePointer();


  /**
   * <p>
   * Setter method for the COM property "MousePointer"
   * </p>
   * @param mousePointer Mandatory com.microsoft.outlook.OlMousePointer parameter.
   */

  @DISPID(-521) //= 0xfffffdf7. The runtime will prefer the VTID if present
  @VTID(20)
  void mousePointer(
          com.microsoft.outlook.OlMousePointer mousePointer);


  // Properties:
}
