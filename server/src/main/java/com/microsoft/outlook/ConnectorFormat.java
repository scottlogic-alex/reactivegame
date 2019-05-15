package com.microsoft.outlook;

import com4j.*;

@IID("{000C0313-0000-0000-C000-000000000046}")
public interface ConnectorFormat extends _IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * @param connectedShape Mandatory com.microsoft.outlook.Shape parameter.
   * @param connectionSite Mandatory int parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(10)
  void beginConnect(
          Shape connectedShape,
          int connectionSite);


  /**
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(11)
  void beginDisconnect();


  /**
   * @param connectedShape Mandatory com.microsoft.outlook.Shape parameter.
   * @param connectionSite Mandatory int parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(12)
  void endConnect(
          Shape connectedShape,
          int connectionSite);


  /**
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(13)
  void endDisconnect();


  /**
   * <p>
   * Getter method for the COM property "BeginConnected"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(14)
  MsoTriState beginConnected();


  /**
   * <p>
   * Getter method for the COM property "BeginConnectedShape"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(15)
  Shape beginConnectedShape();


  /**
   * <p>
   * Getter method for the COM property "BeginConnectionSite"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(16)
  int beginConnectionSite();


  /**
   * <p>
   * Getter method for the COM property "EndConnected"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  MsoTriState endConnected();


  /**
   * <p>
   * Getter method for the COM property "EndConnectedShape"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(18)
  Shape endConnectedShape();


  /**
   * <p>
   * Getter method for the COM property "EndConnectionSite"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(19)
  int endConnectionSite();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoConnectorType
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(20)
  com.microsoft.outlook.MsoConnectorType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param type Mandatory com.microsoft.outlook.MsoConnectorType parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(21)
  void type(
          com.microsoft.outlook.MsoConnectorType type);


  // Properties:
}
