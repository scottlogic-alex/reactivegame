package com.microsoft.outlook;

import com4j.*;

@IID("{00063059-0000-0000-C000-000000000046}")
public interface _FormRegionStartup extends Com4jObject {
  // Methods:
  /**
   * @param formRegionName Mandatory java.lang.String parameter.
   * @param item Mandatory com4j.Com4jObject parameter.
   * @param lcid Mandatory int parameter.
   * @param formRegionMode Mandatory com.microsoft.outlook.OlFormRegionMode parameter.
   * @param formRegionSize Mandatory com.microsoft.outlook.OlFormRegionSize parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(64310) //= 0xfb36. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT)
  Object getFormRegionStorage(
          String formRegionName,
          @MarshalAs(NativeType.Dispatch) Com4jObject item,
          int lcid,
          OlFormRegionMode formRegionMode,
          OlFormRegionSize formRegionSize);


  /**
   * @param formRegion Mandatory com.microsoft.outlook._FormRegion parameter.
   */

  @DISPID(64317) //= 0xfb3d. The runtime will prefer the VTID if present
  @VTID(8)
  void beforeFormRegionShow(
          _FormRegion formRegion);


  /**
   * @param formRegionName Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(64563) //= 0xfc33. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  Object getFormRegionManifest(
          String formRegionName,
          int lcid);


  /**
   * @param formRegionName Mandatory java.lang.String parameter.
   * @param lcid Mandatory int parameter.
   * @param icon Mandatory com.microsoft.outlook.OlFormRegionIcon parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(64564) //= 0xfc34. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  Object getFormRegionIcon(
          String formRegionName,
          int lcid,
          OlFormRegionIcon icon);


  // Properties:
}
