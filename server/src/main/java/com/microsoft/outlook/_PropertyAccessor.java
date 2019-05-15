package com.microsoft.outlook;

import com4j.*;

@IID("{0006302D-0000-0000-C000-000000000046}")
public interface _PropertyAccessor extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Application
   */

  @DISPID(61440) //= 0xf000. The runtime will prefer the VTID if present
  @VTID(7)
  _Application application();


  /**
   * <p>
   * Getter method for the COM property "Class"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlObjectClass
   */

  @DISPID(61450) //= 0xf00a. The runtime will prefer the VTID if present
  @VTID(8)
  OlObjectClass _class();


  /**
   * <p>
   * Getter method for the COM property "Session"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._NameSpace
   */

  @DISPID(61451) //= 0xf00b. The runtime will prefer the VTID if present
  @VTID(9)
  _NameSpace session();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61441) //= 0xf001. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * @param schemaName Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(64251) //= 0xfafb. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  Object getProperty(
          String schemaName);


  /**
   * @param schemaName Mandatory java.lang.String parameter.
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(64252) //= 0xfafc. The runtime will prefer the VTID if present
  @VTID(12)
  void setProperty(
          String schemaName,
          @MarshalAs(NativeType.VARIANT) Object value);


  /**
   * @param schemaNames Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(64254) //= 0xfafe. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  Object getProperties(
          @MarshalAs(NativeType.VARIANT) Object schemaNames);


  /**
   * @param schemaNames Mandatory java.lang.Object parameter.
   * @param values Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(64255) //= 0xfaff. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  Object setProperties(
          @MarshalAs(NativeType.VARIANT) Object schemaNames,
          @MarshalAs(NativeType.VARIANT) Object values);


  /**
   * @param value Mandatory java.util.Date parameter.
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(64256) //= 0xfb00. The runtime will prefer the VTID if present
  @VTID(15)
  java.util.Date utcToLocalTime(
          java.util.Date value);


  /**
   * @param value Mandatory java.util.Date parameter.
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(64257) //= 0xfb01. The runtime will prefer the VTID if present
  @VTID(16)
  java.util.Date localTimeToUTC(
          java.util.Date value);


  /**
   * @param value Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(64258) //= 0xfb02. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  Object stringToBinary(
          String value);


  /**
   * @param value Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64259) //= 0xfb03. The runtime will prefer the VTID if present
  @VTID(18)
  String binaryToString(
          @MarshalAs(NativeType.VARIANT) Object value);


  /**
   * @param schemaName Mandatory java.lang.String parameter.
   */

  @DISPID(64401) //= 0xfb91. The runtime will prefer the VTID if present
  @VTID(19)
  void deleteProperty(
          String schemaName);


  /**
   * @param schemaNames Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(64402) //= 0xfb92. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.VARIANT)
  Object deleteProperties(
          Object schemaNames);


  // Properties:
}
