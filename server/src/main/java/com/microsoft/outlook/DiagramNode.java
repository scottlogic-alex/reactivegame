package com.microsoft.outlook;

import com4j.*;

@IID("{000C0370-0000-0000-C000-000000000046}")
public interface DiagramNode extends com.microsoft.outlook._IMsoDispObj {
  // Methods:
  /**
   * @param pos Optional parameter. Default value is 2
   * @param nodeType Optional parameter. Default value is 1
   * @return  Returns a value of type com.microsoft.outlook.DiagramNode
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(9)
  DiagramNode addNode(
          @Optional @DefaultValue("2") com.microsoft.outlook.MsoRelativeNodePosition pos,
          @Optional @DefaultValue("1") com.microsoft.outlook.MsoDiagramNodeType nodeType);


  /**
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(10)
  void delete();


  /**
   * @param targetNode Mandatory com.microsoft.outlook.DiagramNode parameter.
   * @param pos Mandatory com.microsoft.outlook.MsoRelativeNodePosition parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(11)
  void moveNode(
          DiagramNode targetNode,
          com.microsoft.outlook.MsoRelativeNodePosition pos);


  /**
   * @param targetNode Mandatory com.microsoft.outlook.DiagramNode parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(12)
  void replaceNode(
          DiagramNode targetNode);


  /**
   * @param targetNode Mandatory com.microsoft.outlook.DiagramNode parameter.
   * @param swapChildren Optional parameter. Default value is false
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(13)
  void swapNode(
          DiagramNode targetNode,
          @Optional @DefaultValue("-1") boolean swapChildren);


  /**
   * @param copyChildren Mandatory boolean parameter.
   * @param targetNode Mandatory com.microsoft.outlook.DiagramNode parameter.
   * @param pos Optional parameter. Default value is 2
   * @return  Returns a value of type com.microsoft.outlook.DiagramNode
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(14)
  DiagramNode cloneNode(
          boolean copyChildren,
          DiagramNode targetNode,
          @Optional @DefaultValue("2") com.microsoft.outlook.MsoRelativeNodePosition pos);


  /**
   * @param receivingNode Mandatory com.microsoft.outlook.DiagramNode parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(15)
  void transferChildren(
          DiagramNode receivingNode);


  /**
   * @return  Returns a value of type com.microsoft.outlook.DiagramNode
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(16)
  DiagramNode nextNode();


  /**
   * @return  Returns a value of type com.microsoft.outlook.DiagramNode
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(17)
  DiagramNode prevNode();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Children"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.DiagramNodeChildren
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(19)
  com.microsoft.outlook.DiagramNodeChildren children();


  @VTID(19)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.DiagramNodeChildren.class})
  DiagramNode children(
          @MarshalAs(NativeType.VARIANT) Object index);

  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(20)
  Shape shape();


  /**
   * <p>
   * Getter method for the COM property "Root"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.DiagramNode
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(21)
  DiagramNode root();


  /**
   * <p>
   * Getter method for the COM property "Diagram"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.IMsoDiagram
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(22)
  com.microsoft.outlook.IMsoDiagram diagram();


  /**
   * <p>
   * Getter method for the COM property "Layout"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoOrgChartLayoutType
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(23)
  com.microsoft.outlook.MsoOrgChartLayoutType layout();


  /**
   * <p>
   * Setter method for the COM property "Layout"
   * </p>
   * @param type Mandatory com.microsoft.outlook.MsoOrgChartLayoutType parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(24)
  void layout(
          com.microsoft.outlook.MsoOrgChartLayoutType type);


  /**
   * <p>
   * Getter method for the COM property "TextShape"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Shape
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(25)
  Shape textShape();


  // Properties:
}
