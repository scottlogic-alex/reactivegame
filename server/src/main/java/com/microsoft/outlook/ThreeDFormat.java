package com.microsoft.outlook;

import com4j.*;

@IID("{000C0321-0000-0000-C000-000000000046}")
public interface ThreeDFormat extends _IMsoDispObj {
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
   * @param increment Mandatory float parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(10)
  void incrementRotationX(
          float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(11)
  void incrementRotationY(
          float increment);


  /**
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(12)
  void resetRotation();


  /**
   * @param presetThreeDFormat Mandatory com.microsoft.outlook.MsoPresetThreeDFormat parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(13)
  void setThreeDFormat(
          com.microsoft.outlook.MsoPresetThreeDFormat presetThreeDFormat);


  /**
   * @param presetExtrusionDirection Mandatory com.microsoft.outlook.MsoPresetExtrusionDirection parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(14)
  void setExtrusionDirection(
          com.microsoft.outlook.MsoPresetExtrusionDirection presetExtrusionDirection);


  /**
   * <p>
   * Getter method for the COM property "Depth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(15)
  float depth();


  /**
   * <p>
   * Setter method for the COM property "Depth"
   * </p>
   * @param depth Mandatory float parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(16)
  void depth(
          float depth);


  /**
   * <p>
   * Getter method for the COM property "ExtrusionColor"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ColorFormat
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(17)
  ColorFormat extrusionColor();


  /**
   * <p>
   * Getter method for the COM property "ExtrusionColorType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoExtrusionColorType
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(18)
  com.microsoft.outlook.MsoExtrusionColorType extrusionColorType();


  /**
   * <p>
   * Setter method for the COM property "ExtrusionColorType"
   * </p>
   * @param extrusionColorType Mandatory com.microsoft.outlook.MsoExtrusionColorType parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(19)
  void extrusionColorType(
          com.microsoft.outlook.MsoExtrusionColorType extrusionColorType);


  /**
   * <p>
   * Getter method for the COM property "Perspective"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(20)
  MsoTriState perspective();


  /**
   * <p>
   * Setter method for the COM property "Perspective"
   * </p>
   * @param perspective Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(21)
  void perspective(
          MsoTriState perspective);


  /**
   * <p>
   * Getter method for the COM property "PresetExtrusionDirection"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoPresetExtrusionDirection
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(22)
  com.microsoft.outlook.MsoPresetExtrusionDirection presetExtrusionDirection();


  /**
   * <p>
   * Getter method for the COM property "PresetLightingDirection"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoPresetLightingDirection
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(23)
  com.microsoft.outlook.MsoPresetLightingDirection presetLightingDirection();


  /**
   * <p>
   * Setter method for the COM property "PresetLightingDirection"
   * </p>
   * @param presetLightingDirection Mandatory com.microsoft.outlook.MsoPresetLightingDirection parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(24)
  void presetLightingDirection(
          com.microsoft.outlook.MsoPresetLightingDirection presetLightingDirection);


  /**
   * <p>
   * Getter method for the COM property "PresetLightingSoftness"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoPresetLightingSoftness
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(25)
  com.microsoft.outlook.MsoPresetLightingSoftness presetLightingSoftness();


  /**
   * <p>
   * Setter method for the COM property "PresetLightingSoftness"
   * </p>
   * @param presetLightingSoftness Mandatory com.microsoft.outlook.MsoPresetLightingSoftness parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(26)
  void presetLightingSoftness(
          com.microsoft.outlook.MsoPresetLightingSoftness presetLightingSoftness);


  /**
   * <p>
   * Getter method for the COM property "PresetMaterial"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoPresetMaterial
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(27)
  com.microsoft.outlook.MsoPresetMaterial presetMaterial();


  /**
   * <p>
   * Setter method for the COM property "PresetMaterial"
   * </p>
   * @param presetMaterial Mandatory com.microsoft.outlook.MsoPresetMaterial parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(28)
  void presetMaterial(
          com.microsoft.outlook.MsoPresetMaterial presetMaterial);


  /**
   * <p>
   * Getter method for the COM property "PresetThreeDFormat"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoPresetThreeDFormat
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(29)
  com.microsoft.outlook.MsoPresetThreeDFormat presetThreeDFormat();


  /**
   * <p>
   * Getter method for the COM property "RotationX"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(30)
  float rotationX();


  /**
   * <p>
   * Setter method for the COM property "RotationX"
   * </p>
   * @param rotationX Mandatory float parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(31)
  void rotationX(
          float rotationX);


  /**
   * <p>
   * Getter method for the COM property "RotationY"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(32)
  float rotationY();


  /**
   * <p>
   * Setter method for the COM property "RotationY"
   * </p>
   * @param rotationY Mandatory float parameter.
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(33)
  void rotationY(
          float rotationY);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(34)
  MsoTriState visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param visible Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(35)
  void visible(
          MsoTriState visible);


  /**
   * @param presetCamera Mandatory com.microsoft.outlook.MsoPresetCamera parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(36)
  void setPresetCamera(
          com.microsoft.outlook.MsoPresetCamera presetCamera);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(37)
  void incrementRotationZ(
          float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(38)
  void incrementRotationHorizontal(
          float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(39)
  void incrementRotationVertical(
          float increment);


  /**
   * <p>
   * Getter method for the COM property "PresetLighting"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoLightRigType
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(40)
  com.microsoft.outlook.MsoLightRigType presetLighting();


  /**
   * <p>
   * Setter method for the COM property "PresetLighting"
   * </p>
   * @param presetLightRigType Mandatory com.microsoft.outlook.MsoLightRigType parameter.
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(41)
  void presetLighting(
          com.microsoft.outlook.MsoLightRigType presetLightRigType);


  /**
   * <p>
   * Getter method for the COM property "Z"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(42)
  float z();


  /**
   * <p>
   * Setter method for the COM property "Z"
   * </p>
   * @param z Mandatory float parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(43)
  void z(
          float z);


  /**
   * <p>
   * Getter method for the COM property "BevelTopType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoBevelType
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(44)
  MsoBevelType bevelTopType();


  /**
   * <p>
   * Setter method for the COM property "BevelTopType"
   * </p>
   * @param bevelTopType Mandatory com.microsoft.outlook.MsoBevelType parameter.
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(45)
  void bevelTopType(
          MsoBevelType bevelTopType);


  /**
   * <p>
   * Getter method for the COM property "BevelTopInset"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(46)
  float bevelTopInset();


  /**
   * <p>
   * Setter method for the COM property "BevelTopInset"
   * </p>
   * @param bevelTopInset Mandatory float parameter.
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(47)
  void bevelTopInset(
          float bevelTopInset);


  /**
   * <p>
   * Getter method for the COM property "BevelTopDepth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(48)
  float bevelTopDepth();


  /**
   * <p>
   * Setter method for the COM property "BevelTopDepth"
   * </p>
   * @param bevelTopDepth Mandatory float parameter.
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(49)
  void bevelTopDepth(
          float bevelTopDepth);


  /**
   * <p>
   * Getter method for the COM property "BevelBottomType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoBevelType
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(50)
  MsoBevelType bevelBottomType();


  /**
   * <p>
   * Setter method for the COM property "BevelBottomType"
   * </p>
   * @param bevelBottomType Mandatory com.microsoft.outlook.MsoBevelType parameter.
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(51)
  void bevelBottomType(
          MsoBevelType bevelBottomType);


  /**
   * <p>
   * Getter method for the COM property "BevelBottomInset"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(52)
  float bevelBottomInset();


  /**
   * <p>
   * Setter method for the COM property "BevelBottomInset"
   * </p>
   * @param bevelBottomInset Mandatory float parameter.
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(53)
  void bevelBottomInset(
          float bevelBottomInset);


  /**
   * <p>
   * Getter method for the COM property "BevelBottomDepth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(54)
  float bevelBottomDepth();


  /**
   * <p>
   * Setter method for the COM property "BevelBottomDepth"
   * </p>
   * @param bevelBottomDepth Mandatory float parameter.
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(55)
  void bevelBottomDepth(
          float bevelBottomDepth);


  /**
   * <p>
   * Getter method for the COM property "PresetCamera"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoPresetCamera
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(56)
  com.microsoft.outlook.MsoPresetCamera presetCamera();


  /**
   * <p>
   * Getter method for the COM property "RotationZ"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(57)
  float rotationZ();


  /**
   * <p>
   * Setter method for the COM property "RotationZ"
   * </p>
   * @param rotationZ Mandatory float parameter.
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(58)
  void rotationZ(
          float rotationZ);


  /**
   * <p>
   * Getter method for the COM property "ContourWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(59)
  float contourWidth();


  /**
   * <p>
   * Setter method for the COM property "ContourWidth"
   * </p>
   * @param width Mandatory float parameter.
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(60)
  void contourWidth(
          float width);


  /**
   * <p>
   * Getter method for the COM property "ContourColor"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ColorFormat
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(61)
  ColorFormat contourColor();


  /**
   * <p>
   * Getter method for the COM property "FieldOfView"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(62)
  float fieldOfView();


  /**
   * <p>
   * Setter method for the COM property "FieldOfView"
   * </p>
   * @param fov Mandatory float parameter.
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(63)
  void fieldOfView(
          float fov);


  /**
   * <p>
   * Getter method for the COM property "ProjectText"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(64)
  MsoTriState projectText();


  /**
   * <p>
   * Setter method for the COM property "ProjectText"
   * </p>
   * @param projectText Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(65)
  void projectText(
          MsoTriState projectText);


  /**
   * <p>
   * Getter method for the COM property "LightAngle"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(66)
  float lightAngle();


  /**
   * <p>
   * Setter method for the COM property "LightAngle"
   * </p>
   * @param lightAngle Mandatory float parameter.
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(67)
  void lightAngle(
          float lightAngle);


  // Properties:
}
