package com.microsoft.outlook;

import com4j.*;

@IID("{000C03D8-0000-0000-C000-000000000046}")
public interface Model3DFormat extends _IMsoDispObj {
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
   * <p>
   * Getter method for the COM property "AutoFit"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(10)
  MsoTriState autoFit();


  /**
   * <p>
   * Setter method for the COM property "AutoFit"
   * </p>
   * @param autoFit Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  void autoFit(
          MsoTriState autoFit);


  /**
   * <p>
   * Getter method for the COM property "RotationX"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(12)
  float rotationX();


  /**
   * <p>
   * Setter method for the COM property "RotationX"
   * </p>
   * @param rotationX Mandatory float parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(13)
  void rotationX(
          float rotationX);


  /**
   * <p>
   * Getter method for the COM property "RotationY"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(14)
  float rotationY();


  /**
   * <p>
   * Setter method for the COM property "RotationY"
   * </p>
   * @param rotationY Mandatory float parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(15)
  void rotationY(
          float rotationY);


  /**
   * <p>
   * Getter method for the COM property "RotationZ"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  float rotationZ();


  /**
   * <p>
   * Setter method for the COM property "RotationZ"
   * </p>
   * @param rotationZ Mandatory float parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  void rotationZ(
          float rotationZ);


  /**
   * <p>
   * Getter method for the COM property "FieldOfView"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(18)
  float fieldOfView();


  /**
   * <p>
   * Setter method for the COM property "FieldOfView"
   * </p>
   * @param fov Mandatory float parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(19)
  void fieldOfView(
          float fov);


  /**
   * <p>
   * Getter method for the COM property "CameraPositionX"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(20)
  float cameraPositionX();


  /**
   * <p>
   * Setter method for the COM property "CameraPositionX"
   * </p>
   * @param positionX Mandatory float parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(21)
  void cameraPositionX(
          float positionX);


  /**
   * <p>
   * Getter method for the COM property "CameraPositionY"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(22)
  float cameraPositionY();


  /**
   * <p>
   * Setter method for the COM property "CameraPositionY"
   * </p>
   * @param positionY Mandatory float parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(23)
  void cameraPositionY(
          float positionY);


  /**
   * <p>
   * Getter method for the COM property "CameraPositionZ"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(24)
  float cameraPositionZ();


  /**
   * <p>
   * Setter method for the COM property "CameraPositionZ"
   * </p>
   * @param positionZ Mandatory float parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(25)
  void cameraPositionZ(
          float positionZ);


  /**
   * <p>
   * Getter method for the COM property "LookAtPointX"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(26)
  float lookAtPointX();


  /**
   * <p>
   * Setter method for the COM property "LookAtPointX"
   * </p>
   * @param lookAtPointX Mandatory float parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(27)
  void lookAtPointX(
          float lookAtPointX);


  /**
   * <p>
   * Getter method for the COM property "LookAtPointY"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(28)
  float lookAtPointY();


  /**
   * <p>
   * Setter method for the COM property "LookAtPointY"
   * </p>
   * @param lookAtPointY Mandatory float parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(29)
  void lookAtPointY(
          float lookAtPointY);


  /**
   * <p>
   * Getter method for the COM property "LookAtPointZ"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(30)
  float lookAtPointZ();


  /**
   * <p>
   * Setter method for the COM property "LookAtPointZ"
   * </p>
   * @param lookAtPointZ Mandatory float parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(31)
  void lookAtPointZ(
          float lookAtPointZ);


  /**
   * @param resetSize Optional parameter. Default value is false
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(32)
  void resetModel(
          @Optional @DefaultValue("0") boolean resetSize);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(33)
  void incrementRotationX(
          float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(34)
  void incrementRotationY(
          float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(35)
  void incrementRotationZ(
          float increment);


  // Properties:
}
