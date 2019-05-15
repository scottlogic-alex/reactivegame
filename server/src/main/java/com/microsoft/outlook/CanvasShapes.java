package com.microsoft.outlook;

import com4j.*;

@IID("{000C0371-0000-0000-C000-000000000046}")
public interface CanvasShapes extends _IMsoDispObj,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  Shape item(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(12)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param type Mandatory com.microsoft.outlook.MsoCalloutType parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(13)
  Shape addCallout(
          com.microsoft.outlook.MsoCalloutType type,
          float left,
          float top,
          float width,
          float height);


  /**
   * @param type Mandatory com.microsoft.outlook.MsoConnectorType parameter.
   * @param beginX Mandatory float parameter.
   * @param beginY Mandatory float parameter.
   * @param endX Mandatory float parameter.
   * @param endY Mandatory float parameter.
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(14)
  Shape addConnector(
          com.microsoft.outlook.MsoConnectorType type,
          float beginX,
          float beginY,
          float endX,
          float endY);


  /**
   * @param safeArrayOfPoints Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(15)
  Shape addCurve(
          @MarshalAs(NativeType.VARIANT) Object safeArrayOfPoints);


  /**
   * @param orientation Mandatory com.microsoft.outlook.MsoTextOrientation parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(16)
  Shape addLabel(
          com.microsoft.outlook.MsoTextOrientation orientation,
          float left,
          float top,
          float width,
          float height);


  /**
   * @param beginX Mandatory float parameter.
   * @param beginY Mandatory float parameter.
   * @param endX Mandatory float parameter.
   * @param endY Mandatory float parameter.
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(17)
  Shape addLine(
          float beginX,
          float beginY,
          float endX,
          float endY);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param linkToFile Mandatory com.microsoft.outlook.MsoTriState parameter.
   * @param saveWithDocument Mandatory com.microsoft.outlook.MsoTriState parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Optional parameter. Default value is -1.0f
   * @param height Optional parameter. Default value is -1.0f
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(18)
  Shape addPicture(
          String fileName,
          MsoTriState linkToFile,
          MsoTriState saveWithDocument,
          float left,
          float top,
          @Optional @DefaultValue("-1") float width,
          @Optional @DefaultValue("-1") float height);


  /**
   * @param safeArrayOfPoints Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(19)
  Shape addPolyline(
          @MarshalAs(NativeType.VARIANT) Object safeArrayOfPoints);


  /**
   * @param type Mandatory com.microsoft.outlook.MsoAutoShapeType parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(20)
  Shape addShape(
          com.microsoft.outlook.MsoAutoShapeType type,
          float left,
          float top,
          float width,
          float height);


  /**
   * @param presetTextEffect Mandatory com.microsoft.outlook.MsoPresetTextEffect parameter.
   * @param text Mandatory java.lang.String parameter.
   * @param fontName Mandatory java.lang.String parameter.
   * @param fontSize Mandatory float parameter.
   * @param fontBold Mandatory com.microsoft.outlook.MsoTriState parameter.
   * @param fontItalic Mandatory com.microsoft.outlook.MsoTriState parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(21)
  Shape addTextEffect(
          com.microsoft.outlook.MsoPresetTextEffect presetTextEffect,
          String text,
          String fontName,
          float fontSize,
          MsoTriState fontBold,
          MsoTriState fontItalic,
          float left,
          float top);


  /**
   * @param orientation Mandatory com.microsoft.outlook.MsoTextOrientation parameter.
   * @param left Mandatory float parameter.
   * @param top Mandatory float parameter.
   * @param width Mandatory float parameter.
   * @param height Mandatory float parameter.
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(22)
  Shape addTextbox(
          com.microsoft.outlook.MsoTextOrientation orientation,
          float left,
          float top,
          float width,
          float height);


  /**
   * @param editingType Mandatory com.microsoft.outlook.MsoEditingType parameter.
   * @param x1 Mandatory float parameter.
   * @param y1 Mandatory float parameter.
   * @return  Returns a value of type com.microsoft.outlook.FreeformBuilder
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(23)
  com.microsoft.outlook.FreeformBuilder buildFreeform(
          com.microsoft.outlook.MsoEditingType editingType,
          float x1,
          float y1);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com.microsoft.outlook.ShapeRange
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(24)
  ShapeRange range(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(25)
  void selectAll();


  /**
   * <p>
   * Getter method for the COM property "Background"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(26)
  Shape background();


  // Properties:
}
