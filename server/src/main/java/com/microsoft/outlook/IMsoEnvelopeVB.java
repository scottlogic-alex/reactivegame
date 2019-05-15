package com.microsoft.outlook;

import com4j.*;

@IID("{000672AC-0000-0000-C000-000000000046}")
public interface IMsoEnvelopeVB extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Introduction"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  String introduction();


  /**
   * <p>
   * Setter method for the COM property "Introduction"
   * </p>
   * @param pbstrIntro Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void introduction(
          String pbstrIntro);


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject item();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "CommandBars"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject commandBars();


  // Properties:
}
