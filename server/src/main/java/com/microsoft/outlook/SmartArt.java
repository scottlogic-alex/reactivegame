package com.microsoft.outlook;

import com4j.*;

@IID("{000C03C6-0000-0000-C000-000000000046}")
public interface SmartArt extends com.microsoft.outlook._IMsoDispObj {
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
   * Getter method for the COM property "AllNodes"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.SmartArtNodes
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  com.microsoft.outlook.SmartArtNodes allNodes();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.SmartArtNodes.class})
  com.microsoft.outlook.SmartArtNode allNodes(
          @MarshalAs(NativeType.VARIANT) Object index);

  /**
   * <p>
   * Getter method for the COM property "Nodes"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.SmartArtNodes
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  com.microsoft.outlook.SmartArtNodes nodes();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.SmartArtNodes.class})
  com.microsoft.outlook.SmartArtNode nodes(
          @MarshalAs(NativeType.VARIANT) Object index);

  /**
   * <p>
   * Getter method for the COM property "Layout"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.SmartArtLayout
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  com.microsoft.outlook.SmartArtLayout layout();


  /**
   * <p>
   * Setter method for the COM property "Layout"
   * </p>
   * @param layout Mandatory com.microsoft.outlook.SmartArtLayout parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void layout(
          com.microsoft.outlook.SmartArtLayout layout);


  /**
   * <p>
   * Getter method for the COM property "QuickStyle"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.SmartArtQuickStyle
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  com.microsoft.outlook.SmartArtQuickStyle quickStyle();


  /**
   * <p>
   * Setter method for the COM property "QuickStyle"
   * </p>
   * @param style Mandatory com.microsoft.outlook.SmartArtQuickStyle parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void quickStyle(
          com.microsoft.outlook.SmartArtQuickStyle style);


  /**
   * <p>
   * Getter method for the COM property "Color"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.SmartArtColor
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  com.microsoft.outlook.SmartArtColor color();


  /**
   * <p>
   * Setter method for the COM property "Color"
   * </p>
   * @param colorStyle Mandatory com.microsoft.outlook.SmartArtColor parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void color(
          com.microsoft.outlook.SmartArtColor colorStyle);


  /**
   * <p>
   * Getter method for the COM property "Reverse"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoTriState
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  com.microsoft.outlook.MsoTriState reverse();


  /**
   * <p>
   * Setter method for the COM property "Reverse"
   * </p>
   * @param reverse Mandatory com.microsoft.outlook.MsoTriState parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(19)
  void reverse(
          com.microsoft.outlook.MsoTriState reverse);


  /**
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  void reset();


  // Properties:
}
