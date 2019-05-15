package com.microsoft.outlook;

import com4j.*;

@IID("{000CDB09-0000-0000-C000-000000000046}")
public interface _CustomXMLParts extends _IMsoDispObj,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com.microsoft.outlook._CustomXMLPart
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  _CustomXMLPart item(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * @param xml Optional parameter. Default value is ""
   * @param schemaCollection Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com.microsoft.outlook._CustomXMLPart
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(12)
  _CustomXMLPart add(
          @Optional @DefaultValue("") String xml,
          @Optional @MarshalAs(NativeType.VARIANT) Object schemaCollection);


  /**
   * @param id Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.microsoft.outlook._CustomXMLPart
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(13)
  _CustomXMLPart selectByID(
          String id);


  /**
   * @param namespaceURI Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.microsoft.outlook._CustomXMLParts
   */

  @DISPID(1610809349) //= 0x60030005. The runtime will prefer the VTID if present
  @VTID(14)
  _CustomXMLParts selectByNamespace(
          String namespaceURI);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(15)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
