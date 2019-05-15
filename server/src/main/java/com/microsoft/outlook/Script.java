package com.microsoft.outlook;

import com4j.*;

@IID("{000C0341-0000-0000-C000-000000000046}")
public interface Script extends com.microsoft.outlook._IMsoDispObj {
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
   * Getter method for the COM property "Extended"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(10)
  String extended();


  /**
   * <p>
   * Setter method for the COM property "Extended"
   * </p>
   * @param extended Mandatory java.lang.String parameter.
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(11)
  void extended(
          String extended);


  /**
   * <p>
   * Getter method for the COM property "Id"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(12)
  String id();


  /**
   * <p>
   * Setter method for the COM property "Id"
   * </p>
   * @param id Mandatory java.lang.String parameter.
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(13)
  void id(
          String id);


  /**
   * <p>
   * Getter method for the COM property "Language"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoScriptLanguage
   */

  @DISPID(1610809349) //= 0x60030005. The runtime will prefer the VTID if present
  @VTID(14)
  com.microsoft.outlook.MsoScriptLanguage language();


  /**
   * <p>
   * Setter method for the COM property "Language"
   * </p>
   * @param language Mandatory com.microsoft.outlook.MsoScriptLanguage parameter.
   */

  @DISPID(1610809349) //= 0x60030005. The runtime will prefer the VTID if present
  @VTID(15)
  void language(
          com.microsoft.outlook.MsoScriptLanguage language);


  /**
   * <p>
   * Getter method for the COM property "Location"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoScriptLocation
   */

  @DISPID(1610809351) //= 0x60030007. The runtime will prefer the VTID if present
  @VTID(16)
  com.microsoft.outlook.MsoScriptLocation location();


  /**
   */

  @DISPID(1610809352) //= 0x60030008. The runtime will prefer the VTID if present
  @VTID(17)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610809353) //= 0x60030009. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject shape();


  /**
   * <p>
   * Getter method for the COM property "ScriptText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(19)
  @DefaultMethod
  String scriptText();


  /**
   * <p>
   * Setter method for the COM property "ScriptText"
   * </p>
   * @param script Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(20)
  @DefaultMethod
  void scriptText(
          String script);


  // Properties:
}
