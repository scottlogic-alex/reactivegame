package com.microsoft.outlook;

import com4j.*;

@IID("{000C1730-0000-0000-C000-000000000046}")
public interface IMsoChartFormat extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.FillFormat
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  FillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "Glow"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.GlowFormat
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  GlowFormat glow();


  /**
   * <p>
   * Getter method for the COM property "Line"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.LineFormat
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  LineFormat line();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "PictureFormat"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.PictureFormat
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  PictureFormat pictureFormat();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ShadowFormat
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  ShadowFormat shadow();


  /**
   * <p>
   * Getter method for the COM property "SoftEdge"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.SoftEdgeFormat
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  SoftEdgeFormat softEdge();


  /**
   * <p>
   * Getter method for the COM property "TextFrame2"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.TextFrame2
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  TextFrame2 textFrame2();


  /**
   * <p>
   * Getter method for the COM property "ThreeD"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ThreeDFormat
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  ThreeDFormat threeD();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(17)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "Adjustments"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Adjustments
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(18)
  Adjustments adjustments();


  @VTID(18)
  @ReturnValue(defaultPropertyThrough={Adjustments.class})
  float adjustments(
          int index);

  /**
   * <p>
   * Getter method for the COM property "AutoShapeType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoAutoShapeType
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(19)
  com.microsoft.outlook.MsoAutoShapeType autoShapeType();


  /**
   * <p>
   * Setter method for the COM property "AutoShapeType"
   * </p>
   * @param autoShapeType Mandatory com.microsoft.outlook.MsoAutoShapeType parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(20)
  void autoShapeType(
          com.microsoft.outlook.MsoAutoShapeType autoShapeType);


  // Properties:
}
