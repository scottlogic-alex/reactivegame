package com.microsoft.outlook;

import com4j.*;

@IID("{000C03C8-0000-0000-C000-000000000046}")
public interface SmartArtNode extends _IMsoDispObj {
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
   * @param position Optional parameter. Default value is 1
   * @param type Optional parameter. Default value is 1
   * @return  Returns a value of type com.microsoft.outlook.SmartArtNode
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  SmartArtNode addNode(
          @Optional @DefaultValue("1") com.microsoft.outlook.MsoSmartArtNodePosition position,
          @Optional @DefaultValue("1") com.microsoft.outlook.MsoSmartArtNodeType type);


  /**
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  void delete();


  /**
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  void promote();


  /**
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(13)
  void demote();


  /**
   * <p>
   * Getter method for the COM property "OrgChartLayout"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoOrgChartLayoutType
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(14)
  com.microsoft.outlook.MsoOrgChartLayoutType orgChartLayout();


  /**
   * <p>
   * Setter method for the COM property "OrgChartLayout"
   * </p>
   * @param type Mandatory com.microsoft.outlook.MsoOrgChartLayoutType parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(15)
  void orgChartLayout(
          com.microsoft.outlook.MsoOrgChartLayoutType type);


  /**
   * <p>
   * Getter method for the COM property "Shapes"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ShapeRange
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(16)
  ShapeRange shapes();


  @VTID(16)
  @ReturnValue(defaultPropertyThrough={ShapeRange.class})
  Shape shapes(
          @MarshalAs(NativeType.VARIANT) Object index);

  /**
   * <p>
   * Getter method for the COM property "TextFrame2"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.TextFrame2
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(17)
  TextFrame2 textFrame2();


  /**
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(18)
  void larger();


  /**
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(19)
  void smaller();


  /**
   * <p>
   * Getter method for the COM property "Level"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(20)
  int level();


  /**
   * <p>
   * Getter method for the COM property "Hidden"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(21)
  MsoTriState hidden();


  /**
   * <p>
   * Getter method for the COM property "Nodes"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.SmartArtNodes
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(22)
  com.microsoft.outlook.SmartArtNodes nodes();


  @VTID(22)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.SmartArtNodes.class})
  SmartArtNode nodes(
          @MarshalAs(NativeType.VARIANT) Object index);

  /**
   * <p>
   * Getter method for the COM property "ParentNode"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.SmartArtNode
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(23)
  SmartArtNode parentNode();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoSmartArtNodeType
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(24)
  com.microsoft.outlook.MsoSmartArtNodeType type();


  /**
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(25)
  void reorderUp();


  /**
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(26)
  void reorderDown();


  // Properties:
}
