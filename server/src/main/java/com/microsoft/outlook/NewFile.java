package com.microsoft.outlook;

import com4j.*;

@IID("{000C0936-0000-0000-C000-000000000046}")
public interface NewFile extends com.microsoft.outlook._IMsoDispObj {
  // Methods:
  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param section Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param action Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  boolean add(
          String fileName,
          @Optional @MarshalAs(NativeType.VARIANT) Object section,
          @Optional @MarshalAs(NativeType.VARIANT) Object displayName,
          @Optional @MarshalAs(NativeType.VARIANT) Object action);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param section Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param action Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  boolean remove(
          String fileName,
          @Optional @MarshalAs(NativeType.VARIANT) Object section,
          @Optional @MarshalAs(NativeType.VARIANT) Object displayName,
          @Optional @MarshalAs(NativeType.VARIANT) Object action);


  // Properties:
}
