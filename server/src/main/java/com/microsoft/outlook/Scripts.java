package com.microsoft.outlook;

import com4j.*;

@IID("{000C0340-0000-0000-C000-000000000046}")
public interface Scripts extends com.microsoft.outlook._IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(11)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com.microsoft.outlook.Script
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  Script item(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * @param anchor Optional parameter. Default value is unprintable.
   * @param location Optional parameter. Default value is 2
   * @param language Optional parameter. Default value is 2
   * @param id Optional parameter. Default value is ""
   * @param extended Optional parameter. Default value is ""
   * @param scriptText Optional parameter. Default value is ""
   * @return  Returns a value of type com.microsoft.outlook.Script
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(13)
  Script add(
          @Optional @MarshalAs(NativeType.Dispatch) Com4jObject anchor,
          @Optional @DefaultValue("2") com.microsoft.outlook.MsoScriptLocation location,
          @Optional @DefaultValue("2") com.microsoft.outlook.MsoScriptLanguage language,
          @Optional @DefaultValue("") String id,
          @Optional @DefaultValue("") String extended,
          @Optional @DefaultValue("") String scriptText);


  /**
   */

  @DISPID(1610809349) //= 0x60030005. The runtime will prefer the VTID if present
  @VTID(14)
  void delete();


  // Properties:
}
