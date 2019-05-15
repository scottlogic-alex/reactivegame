package com.microsoft.outlook;

import com4j.*;

@IID("{000630CC-0000-0000-C000-000000000046}")
public interface _Rules extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Application
   */

  @DISPID(61440) //= 0xf000. The runtime will prefer the VTID if present
  @VTID(7)
  com.microsoft.outlook._Application application();


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
  com.microsoft.outlook._NameSpace session();


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
   * @return  Returns a value of type com.microsoft.outlook._Rule
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(12)
  _Rule item(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param ruleType Mandatory com.microsoft.outlook.OlRuleType parameter.
   * @return  Returns a value of type com.microsoft.outlook._Rule
   */

  @DISPID(64266) //= 0xfb0a. The runtime will prefer the VTID if present
  @VTID(13)
  _Rule create(
          String name,
          com.microsoft.outlook.OlRuleType ruleType);


  /**
   * @param showProgress Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(61512) //= 0xf048. The runtime will prefer the VTID if present
  @VTID(14)
  void save(
          @Optional @MarshalAs(NativeType.VARIANT) Object showProgress);


  /**
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(82) //= 0x52. The runtime will prefer the VTID if present
  @VTID(15)
  void remove(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * <p>
   * Getter method for the COM property "IsRssRulesProcessingEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64533) //= 0xfc15. The runtime will prefer the VTID if present
  @VTID(16)
  boolean isRssRulesProcessingEnabled();


  /**
   * <p>
   * Setter method for the COM property "IsRssRulesProcessingEnabled"
   * </p>
   * @param isRssRulesProcessingEnabled Mandatory boolean parameter.
   */

  @DISPID(64533) //= 0xfc15. The runtime will prefer the VTID if present
  @VTID(17)
  void isRssRulesProcessingEnabled(
          boolean isRssRulesProcessingEnabled);


  // Properties:
}
