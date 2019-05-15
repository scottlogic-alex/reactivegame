package com.microsoft.outlook;

import com4j.*;

@IID("{00063047-0000-0000-C000-000000000046}")
public interface _UserDefinedProperties extends Com4jObject {
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
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(80) //= 0x50. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com.microsoft.outlook._UserDefinedProperty
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(12)
  _UserDefinedProperty item(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param type Mandatory com.microsoft.outlook.OlUserPropertyType parameter.
   * @param displayFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com.microsoft.outlook._UserDefinedProperty
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(13)
  _UserDefinedProperty add(
          String name,
          OlUserPropertyType type,
          @Optional @MarshalAs(NativeType.VARIANT) Object displayFormat,
          @Optional @MarshalAs(NativeType.VARIANT) Object formula);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.microsoft.outlook._UserDefinedProperty
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(14)
  _UserDefinedProperty find(
          String name);


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(82) //= 0x52. The runtime will prefer the VTID if present
  @VTID(15)
  void remove(
          int index);


  /**
   */

  @DISPID(64069) //= 0xfa45. The runtime will prefer the VTID if present
  @VTID(16)
  void refresh();


  // Properties:
}
