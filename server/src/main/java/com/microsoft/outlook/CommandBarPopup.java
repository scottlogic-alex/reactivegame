package com.microsoft.outlook;

import com4j.*;

@IID("{000C030A-0000-0000-C000-000000000046}")
public interface CommandBarPopup extends com.microsoft.outlook.CommandBarControl {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CommandBar"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.CommandBar
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(83)
  CommandBar commandBar();


  /**
   * <p>
   * Getter method for the COM property "Controls"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.CommandBarControls
   */

  @DISPID(1610940417) //= 0x60050001. The runtime will prefer the VTID if present
  @VTID(84)
  com.microsoft.outlook.CommandBarControls controls();


  @VTID(84)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.CommandBarControls.class})
  com.microsoft.outlook.CommandBarControl controls(
          @MarshalAs(NativeType.VARIANT) Object index);

  /**
   * <p>
   * Getter method for the COM property "OLEMenuGroup"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoOLEMenuGroup
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(85)
  com.microsoft.outlook.MsoOLEMenuGroup oleMenuGroup();


  /**
   * <p>
   * Setter method for the COM property "OLEMenuGroup"
   * </p>
   * @param pomg Mandatory com.microsoft.outlook.MsoOLEMenuGroup parameter.
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(86)
  void oleMenuGroup(
          com.microsoft.outlook.MsoOLEMenuGroup pomg);


  /**
   * <p>
   * Getter method for the COM property "InstanceIdPtr"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610940420) //= 0x60050004. The runtime will prefer the VTID if present
  @VTID(87)
  @ReturnValue(type=NativeType.VARIANT)
  Object instanceIdPtr();


  // Properties:
}
