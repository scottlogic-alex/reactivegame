package com.microsoft.outlook;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import com4j.stdole.IPictureDisp;

@IID("{00067355-0000-0000-C000-000000000046}")
public interface _OlkSenderPhoto extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-514) //= 0xfffffdfe. The runtime will prefer the VTID if present
  @VTID(7)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param enabled Mandatory boolean parameter.
   */

  @DISPID(-514) //= 0xfffffdfe. The runtime will prefer the VTID if present
  @VTID(8)
  void enabled(
          boolean enabled);


  /**
   * <p>
   * Getter method for the COM property "MouseIcon"
   * </p>
   * @return  Returns a value of type IPictureDisp
   */

  @DISPID(-522) //= 0xfffffdf6. The runtime will prefer the VTID if present
  @VTID(9)
  IPictureDisp mouseIcon();


  /**
   * <p>
   * Setter method for the COM property "MouseIcon"
   * </p>
   * @param mouseIcon Mandatory IPictureDisp parameter.
   */

  @DISPID(-522) //= 0xfffffdf6. The runtime will prefer the VTID if present
  @VTID(10)
  void mouseIcon(
          IPictureDisp mouseIcon);


  /**
   * <p>
   * Getter method for the COM property "MousePointer"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlMousePointer
   */

  @DISPID(-521) //= 0xfffffdf7. The runtime will prefer the VTID if present
  @VTID(11)
  OlMousePointer mousePointer();


  /**
   * <p>
   * Setter method for the COM property "MousePointer"
   * </p>
   * @param mousePointer Mandatory com.microsoft.outlook.OlMousePointer parameter.
   */

  @DISPID(-521) //= 0xfffffdf7. The runtime will prefer the VTID if present
  @VTID(12)
  void mousePointer(
          OlMousePointer mousePointer);


  /**
   * <p>
   * Getter method for the COM property "PreferredWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64485) //= 0xfbe5. The runtime will prefer the VTID if present
  @VTID(13)
  int preferredWidth();


  /**
   * <p>
   * Getter method for the COM property "PreferredHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64486) //= 0xfbe6. The runtime will prefer the VTID if present
  @VTID(14)
  int preferredHeight();


  // Properties:
}
