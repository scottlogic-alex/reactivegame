package com.microsoft.outlook;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;
import com4j.stdole.IPictureDisp;

@IID("{000672F6-0000-0000-C000-000000000046}")
public interface _OlkInfoBar extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "MouseIcon"
   * </p>
   * @return  Returns a value of type IPictureDisp
   */

  @DISPID(-522) //= 0xfffffdf6. The runtime will prefer the VTID if present
  @VTID(7)
  IPictureDisp mouseIcon();


  /**
   * <p>
   * Setter method for the COM property "MouseIcon"
   * </p>
   * @param mouseIcon Mandatory IPictureDisp parameter.
   */

  @DISPID(-522) //= 0xfffffdf6. The runtime will prefer the VTID if present
  @VTID(8)
  void mouseIcon(
          IPictureDisp mouseIcon);


  /**
   * <p>
   * Getter method for the COM property "MousePointer"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlMousePointer
   */

  @DISPID(-521) //= 0xfffffdf7. The runtime will prefer the VTID if present
  @VTID(9)
  com.microsoft.outlook.OlMousePointer mousePointer();


  /**
   * <p>
   * Setter method for the COM property "MousePointer"
   * </p>
   * @param mousePointer Mandatory com.microsoft.outlook.OlMousePointer parameter.
   */

  @DISPID(-521) //= 0xfffffdf7. The runtime will prefer the VTID if present
  @VTID(10)
  void mousePointer(
          com.microsoft.outlook.OlMousePointer mousePointer);


  // Properties:
}
