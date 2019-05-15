package com.microsoft.outlook;

import com4j.*;

@IID("{000C0333-0000-0000-C000-000000000046}")
public interface PropertyTest extends _IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  String name();


  /**
   * <p>
   * Getter method for the COM property "Condition"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoCondition
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  MsoCondition condition();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  Object value();


  /**
   * <p>
   * Getter method for the COM property "SecondValue"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  Object secondValue();


  /**
   * <p>
   * Getter method for the COM property "Connector"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoConnector
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(13)
  MsoConnector connector();


  // Properties:
}
