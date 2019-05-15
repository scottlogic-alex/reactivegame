package com.microsoft.outlook;

import com4j.*;

@IID("{000C0314-0000-0000-C000-000000000046}")
public interface FillFormat extends com.microsoft.outlook._IMsoDispObj {
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
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(10)
  void background();


  /**
   * @param style Mandatory com.microsoft.outlook.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   * @param degree Mandatory float parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(11)
  void oneColorGradient(
          com.microsoft.outlook.MsoGradientStyle style,
          int variant,
          float degree);


  /**
   * @param pattern Mandatory com.microsoft.outlook.MsoPatternType parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(12)
  void patterned(
          com.microsoft.outlook.MsoPatternType pattern);


  /**
   * @param style Mandatory com.microsoft.outlook.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   * @param presetGradientType Mandatory com.microsoft.outlook.MsoPresetGradientType parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(13)
  void presetGradient(
          com.microsoft.outlook.MsoGradientStyle style,
          int variant,
          com.microsoft.outlook.MsoPresetGradientType presetGradientType);


  /**
   * @param presetTexture Mandatory com.microsoft.outlook.MsoPresetTexture parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(14)
  void presetTextured(
          com.microsoft.outlook.MsoPresetTexture presetTexture);


  /**
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(15)
  void solid();


  /**
   * @param style Mandatory com.microsoft.outlook.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(16)
  void twoColorGradient(
          com.microsoft.outlook.MsoGradientStyle style,
          int variant);


  /**
   * @param pictureFile Mandatory java.lang.String parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(17)
  void userPicture(
          String pictureFile);


  /**
   * @param textureFile Mandatory java.lang.String parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(18)
  void userTextured(
          String textureFile);


  /**
   * <p>
   * Getter method for the COM property "BackColor"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ColorFormat
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(19)
  com.microsoft.outlook.ColorFormat backColor();


  /**
   * <p>
   * Setter method for the COM property "BackColor"
   * </p>
   * @param backColor Mandatory com.microsoft.outlook.ColorFormat parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(20)
  void backColor(
          com.microsoft.outlook.ColorFormat backColor);


  /**
   * <p>
   * Getter method for the COM property "ForeColor"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ColorFormat
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(21)
  com.microsoft.outlook.ColorFormat foreColor();


  /**
   * <p>
   * Setter method for the COM property "ForeColor"
   * </p>
   * @param foreColor Mandatory com.microsoft.outlook.ColorFormat parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(22)
  void foreColor(
          com.microsoft.outlook.ColorFormat foreColor);


  /**
   * <p>
   * Getter method for the COM property "GradientColorType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoGradientColorType
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(23)
  com.microsoft.outlook.MsoGradientColorType gradientColorType();


  /**
   * <p>
   * Getter method for the COM property "GradientDegree"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(24)
  float gradientDegree();


  /**
   * <p>
   * Getter method for the COM property "GradientStyle"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoGradientStyle
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(25)
  com.microsoft.outlook.MsoGradientStyle gradientStyle();


  /**
   * <p>
   * Getter method for the COM property "GradientVariant"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(26)
  int gradientVariant();


  /**
   * <p>
   * Getter method for the COM property "Pattern"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoPatternType
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(27)
  com.microsoft.outlook.MsoPatternType pattern();


  /**
   * <p>
   * Getter method for the COM property "PresetGradientType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoPresetGradientType
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(28)
  com.microsoft.outlook.MsoPresetGradientType presetGradientType();


  /**
   * <p>
   * Getter method for the COM property "PresetTexture"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoPresetTexture
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(29)
  com.microsoft.outlook.MsoPresetTexture presetTexture();


  /**
   * <p>
   * Getter method for the COM property "TextureName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(30)
  String textureName();


  /**
   * <p>
   * Getter method for the COM property "TextureType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTextureType
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(31)
  com.microsoft.outlook.MsoTextureType textureType();


  /**
   * <p>
   * Getter method for the COM property "Transparency"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(32)
  float transparency();


  /**
   * <p>
   * Setter method for the COM property "Transparency"
   * </p>
   * @param transparency Mandatory float parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(33)
  void transparency(
          float transparency);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoFillType
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(34)
  com.microsoft.outlook.MsoFillType type();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(35)
  com.microsoft.outlook.MsoTriState visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param visible Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(36)
  void visible(
          com.microsoft.outlook.MsoTriState visible);


  /**
   * <p>
   * Getter method for the COM property "GradientStops"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.GradientStops
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(37)
  com.microsoft.outlook.GradientStops gradientStops();


  @VTID(37)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.GradientStops.class})
  com.microsoft.outlook.GradientStop gradientStops(
          int index);

  /**
   * <p>
   * Getter method for the COM property "TextureOffsetX"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(38)
  float textureOffsetX();


  /**
   * <p>
   * Setter method for the COM property "TextureOffsetX"
   * </p>
   * @param textureOffsetX Mandatory float parameter.
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(39)
  void textureOffsetX(
          float textureOffsetX);


  /**
   * <p>
   * Getter method for the COM property "TextureOffsetY"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(40)
  float textureOffsetY();


  /**
   * <p>
   * Setter method for the COM property "TextureOffsetY"
   * </p>
   * @param textureOffsetY Mandatory float parameter.
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(41)
  void textureOffsetY(
          float textureOffsetY);


  /**
   * <p>
   * Getter method for the COM property "TextureAlignment"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTextureAlignment
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(42)
  com.microsoft.outlook.MsoTextureAlignment textureAlignment();


  /**
   * <p>
   * Setter method for the COM property "TextureAlignment"
   * </p>
   * @param textureAlignment Mandatory com.microsoft.outlook.MsoTextureAlignment parameter.
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(43)
  void textureAlignment(
          com.microsoft.outlook.MsoTextureAlignment textureAlignment);


  /**
   * <p>
   * Getter method for the COM property "TextureHorizontalScale"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(44)
  float textureHorizontalScale();


  /**
   * <p>
   * Setter method for the COM property "TextureHorizontalScale"
   * </p>
   * @param horizontalScale Mandatory float parameter.
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(45)
  void textureHorizontalScale(
          float horizontalScale);


  /**
   * <p>
   * Getter method for the COM property "TextureVerticalScale"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(46)
  float textureVerticalScale();


  /**
   * <p>
   * Setter method for the COM property "TextureVerticalScale"
   * </p>
   * @param verticalScale Mandatory float parameter.
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(47)
  void textureVerticalScale(
          float verticalScale);


  /**
   * <p>
   * Getter method for the COM property "TextureTile"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(48)
  com.microsoft.outlook.MsoTriState textureTile();


  /**
   * <p>
   * Setter method for the COM property "TextureTile"
   * </p>
   * @param textureTile Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(49)
  void textureTile(
          com.microsoft.outlook.MsoTriState textureTile);


  /**
   * <p>
   * Getter method for the COM property "RotateWithObject"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(50)
  com.microsoft.outlook.MsoTriState rotateWithObject();


  /**
   * <p>
   * Setter method for the COM property "RotateWithObject"
   * </p>
   * @param rotateWithObject Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(51)
  void rotateWithObject(
          com.microsoft.outlook.MsoTriState rotateWithObject);


  /**
   * <p>
   * Getter method for the COM property "PictureEffects"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.PictureEffects
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(52)
  com.microsoft.outlook.PictureEffects pictureEffects();


  @VTID(52)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.PictureEffects.class})
  com.microsoft.outlook.PictureEffect pictureEffects(
          int index);

  /**
   * <p>
   * Getter method for the COM property "GradientAngle"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(53)
  float gradientAngle();


  /**
   * <p>
   * Setter method for the COM property "GradientAngle"
   * </p>
   * @param gradientAngle Mandatory float parameter.
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(54)
  void gradientAngle(
          float gradientAngle);


  // Properties:
}
