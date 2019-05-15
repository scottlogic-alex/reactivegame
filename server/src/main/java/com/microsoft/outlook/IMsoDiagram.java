package com.microsoft.outlook;

import com4j.*;

@IID("{000C036D-0000-0000-C000-000000000046}")
public interface IMsoDiagram extends com.microsoft.outlook._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Nodes"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.DiagramNodes
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(10)
  com.microsoft.outlook.DiagramNodes nodes();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.DiagramNodes.class})
  DiagramNode nodes(
          @MarshalAs(NativeType.VARIANT) Object index);

  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoDiagramType
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(11)
  com.microsoft.outlook.MsoDiagramType type();


  /**
   * <p>
   * Getter method for the COM property "AutoLayout"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(12)
  com.microsoft.outlook.MsoTriState autoLayout();


  /**
   * <p>
   * Setter method for the COM property "AutoLayout"
   * </p>
   * @param autoLayout Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(13)
  void autoLayout(
          com.microsoft.outlook.MsoTriState autoLayout);


  /**
   * <p>
   * Getter method for the COM property "Reverse"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(14)
  com.microsoft.outlook.MsoTriState reverse();


  /**
   * <p>
   * Setter method for the COM property "Reverse"
   * </p>
   * @param reverse Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(15)
  void reverse(
          com.microsoft.outlook.MsoTriState reverse);


  /**
   * <p>
   * Getter method for the COM property "AutoFormat"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(16)
  com.microsoft.outlook.MsoTriState autoFormat();


  /**
   * <p>
   * Setter method for the COM property "AutoFormat"
   * </p>
   * @param autoFormat Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(17)
  void autoFormat(
          com.microsoft.outlook.MsoTriState autoFormat);


  /**
   * @param type Mandatory com.microsoft.outlook.MsoDiagramType parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(18)
  void convert(
          com.microsoft.outlook.MsoDiagramType type);


  /**
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(19)
  void fitText();


  // Properties:
}
