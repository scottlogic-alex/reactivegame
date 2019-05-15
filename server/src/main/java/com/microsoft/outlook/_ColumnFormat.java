package com.microsoft.outlook;

import com4j.*;

@IID("{0006309E-0000-0000-C000-000000000046}")
public interface _ColumnFormat extends Com4jObject {
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
  com.microsoft.outlook.OlObjectClass _class();


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
   * <p>
   * Getter method for the COM property "Label"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64030) //= 0xfa1e. The runtime will prefer the VTID if present
  @VTID(11)
  String label();


  /**
   * <p>
   * Setter method for the COM property "Label"
   * </p>
   * @param label Mandatory java.lang.String parameter.
   */

  @DISPID(64030) //= 0xfa1e. The runtime will prefer the VTID if present
  @VTID(12)
  void label(
          String label);


  /**
   * <p>
   * Getter method for the COM property "FieldFormat"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64396) //= 0xfb8c. The runtime will prefer the VTID if present
  @VTID(13)
  int fieldFormat();


  /**
   * <p>
   * Setter method for the COM property "FieldFormat"
   * </p>
   * @param fieldFormat Mandatory int parameter.
   */

  @DISPID(64396) //= 0xfb8c. The runtime will prefer the VTID if present
  @VTID(14)
  void fieldFormat(
          int fieldFormat);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8471) //= 0x2117. The runtime will prefer the VTID if present
  @VTID(15)
  int width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param width Mandatory int parameter.
   */

  @DISPID(8471) //= 0x2117. The runtime will prefer the VTID if present
  @VTID(16)
  void width(
          int width);


  /**
   * <p>
   * Getter method for the COM property "Align"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlAlign
   */

  @DISPID(64034) //= 0xfa22. The runtime will prefer the VTID if present
  @VTID(17)
  OlAlign align();


  /**
   * <p>
   * Setter method for the COM property "Align"
   * </p>
   * @param align Mandatory com.microsoft.outlook.OlAlign parameter.
   */

  @DISPID(64034) //= 0xfa22. The runtime will prefer the VTID if present
  @VTID(18)
  void align(
          OlAlign align);


  /**
   * <p>
   * Getter method for the COM property "FieldType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlUserPropertyType
   */

  @DISPID(64398) //= 0xfb8e. The runtime will prefer the VTID if present
  @VTID(19)
  com.microsoft.outlook.OlUserPropertyType fieldType();


  // Properties:
}
