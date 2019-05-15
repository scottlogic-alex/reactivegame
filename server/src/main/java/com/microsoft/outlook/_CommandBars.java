package com.microsoft.outlook;

import com4j.*;

@IID("{000C0302-0000-0000-C000-000000000046}")
public interface _CommandBars extends com.microsoft.outlook._IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ActionControl"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.CommandBarControl
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(9)
  com.microsoft.outlook.CommandBarControl actionControl();


  /**
   * <p>
   * Getter method for the COM property "ActiveMenuBar"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.CommandBar
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(10)
  CommandBar activeMenuBar();


  /**
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param position Optional parameter. Default value is com4j.Variant.getMissing()
   * @param menuBar Optional parameter. Default value is com4j.Variant.getMissing()
   * @param temporary Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com.microsoft.outlook.CommandBar
   */

  @DISPID(1610809346) //= 0x60030002. The runtime will prefer the VTID if present
  @VTID(11)
  CommandBar add(
          @Optional @MarshalAs(NativeType.VARIANT) Object name,
          @Optional @MarshalAs(NativeType.VARIANT) Object position,
          @Optional @MarshalAs(NativeType.VARIANT) Object menuBar,
          @Optional @MarshalAs(NativeType.VARIANT) Object temporary);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(12)
  int count();


  /**
   * <p>
   * Getter method for the COM property "DisplayTooltips"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(13)
  boolean displayTooltips();


  /**
   * <p>
   * Setter method for the COM property "DisplayTooltips"
   * </p>
   * @param pvarfDisplayTooltips Mandatory boolean parameter.
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(14)
  void displayTooltips(
          boolean pvarfDisplayTooltips);


  /**
   * <p>
   * Getter method for the COM property "DisplayKeysInTooltips"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809350) //= 0x60030006. The runtime will prefer the VTID if present
  @VTID(15)
  boolean displayKeysInTooltips();


  /**
   * <p>
   * Setter method for the COM property "DisplayKeysInTooltips"
   * </p>
   * @param pvarfDisplayKeys Mandatory boolean parameter.
   */

  @DISPID(1610809350) //= 0x60030006. The runtime will prefer the VTID if present
  @VTID(16)
  void displayKeysInTooltips(
          boolean pvarfDisplayKeys);


  /**
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param id Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tag Optional parameter. Default value is com4j.Variant.getMissing()
   * @param visible Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com.microsoft.outlook.CommandBarControl
   */

  @DISPID(1610809352) //= 0x60030008. The runtime will prefer the VTID if present
  @VTID(17)
  com.microsoft.outlook.CommandBarControl findControl(
          @Optional @MarshalAs(NativeType.VARIANT) Object type,
          @Optional @MarshalAs(NativeType.VARIANT) Object id,
          @Optional @MarshalAs(NativeType.VARIANT) Object tag,
          @Optional @MarshalAs(NativeType.VARIANT) Object visible);


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com.microsoft.outlook.CommandBar
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(18)
  @DefaultMethod
  CommandBar item(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * <p>
   * Getter method for the COM property "LargeButtons"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809354) //= 0x6003000a. The runtime will prefer the VTID if present
  @VTID(19)
  boolean largeButtons();


  /**
   * <p>
   * Setter method for the COM property "LargeButtons"
   * </p>
   * @param pvarfLargeButtons Mandatory boolean parameter.
   */

  @DISPID(1610809354) //= 0x6003000a. The runtime will prefer the VTID if present
  @VTID(20)
  void largeButtons(
          boolean pvarfLargeButtons);


  /**
   * <p>
   * Getter method for the COM property "MenuAnimationStyle"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoMenuAnimation
   */

  @DISPID(1610809356) //= 0x6003000c. The runtime will prefer the VTID if present
  @VTID(21)
  com.microsoft.outlook.MsoMenuAnimation menuAnimationStyle();


  /**
   * <p>
   * Setter method for the COM property "MenuAnimationStyle"
   * </p>
   * @param pma Mandatory com.microsoft.outlook.MsoMenuAnimation parameter.
   */

  @DISPID(1610809356) //= 0x6003000c. The runtime will prefer the VTID if present
  @VTID(22)
  void menuAnimationStyle(
          com.microsoft.outlook.MsoMenuAnimation pma);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(23)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610809359) //= 0x6003000f. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   */

  @DISPID(1610809360) //= 0x60030010. The runtime will prefer the VTID if present
  @VTID(25)
  void releaseFocus();


  /**
   * <p>
   * Getter method for the COM property "IdsString"
   * </p>
   * @param ids Mandatory int parameter.
   * @param pbstrName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610809361) //= 0x60030011. The runtime will prefer the VTID if present
  @VTID(26)
  int idsString(
          int ids,
          Holder<String> pbstrName);


  /**
   * <p>
   * Getter method for the COM property "TmcGetName"
   * </p>
   * @param tmc Mandatory int parameter.
   * @param pbstrName Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1610809362) //= 0x60030012. The runtime will prefer the VTID if present
  @VTID(27)
  int tmcGetName(
          int tmc,
          Holder<String> pbstrName);


  /**
   * <p>
   * Getter method for the COM property "AdaptiveMenus"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809363) //= 0x60030013. The runtime will prefer the VTID if present
  @VTID(28)
  boolean adaptiveMenus();


  /**
   * <p>
   * Setter method for the COM property "AdaptiveMenus"
   * </p>
   * @param pvarfAdaptiveMenus Mandatory boolean parameter.
   */

  @DISPID(1610809363) //= 0x60030013. The runtime will prefer the VTID if present
  @VTID(29)
  void adaptiveMenus(
          boolean pvarfAdaptiveMenus);


  /**
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param id Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tag Optional parameter. Default value is com4j.Variant.getMissing()
   * @param visible Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com.microsoft.outlook.CommandBarControls
   */

  @DISPID(1610809365) //= 0x60030015. The runtime will prefer the VTID if present
  @VTID(30)
  com.microsoft.outlook.CommandBarControls findControls(
          @Optional @MarshalAs(NativeType.VARIANT) Object type,
          @Optional @MarshalAs(NativeType.VARIANT) Object id,
          @Optional @MarshalAs(NativeType.VARIANT) Object tag,
          @Optional @MarshalAs(NativeType.VARIANT) Object visible);


  /**
   * @param tbidOrName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param position Optional parameter. Default value is com4j.Variant.getMissing()
   * @param menuBar Optional parameter. Default value is com4j.Variant.getMissing()
   * @param temporary Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tbtrProtection Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com.microsoft.outlook.CommandBar
   */

  @DISPID(1610809366) //= 0x60030016. The runtime will prefer the VTID if present
  @VTID(31)
  CommandBar addEx(
          @Optional @MarshalAs(NativeType.VARIANT) Object tbidOrName,
          @Optional @MarshalAs(NativeType.VARIANT) Object position,
          @Optional @MarshalAs(NativeType.VARIANT) Object menuBar,
          @Optional @MarshalAs(NativeType.VARIANT) Object temporary,
          @Optional @MarshalAs(NativeType.VARIANT) Object tbtrProtection);


  /**
   * <p>
   * Getter method for the COM property "DisplayFonts"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809367) //= 0x60030017. The runtime will prefer the VTID if present
  @VTID(32)
  boolean displayFonts();


  /**
   * <p>
   * Setter method for the COM property "DisplayFonts"
   * </p>
   * @param pvarfDisplayFonts Mandatory boolean parameter.
   */

  @DISPID(1610809367) //= 0x60030017. The runtime will prefer the VTID if present
  @VTID(33)
  void displayFonts(
          boolean pvarfDisplayFonts);


  /**
   * <p>
   * Getter method for the COM property "DisableCustomize"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809369) //= 0x60030019. The runtime will prefer the VTID if present
  @VTID(34)
  boolean disableCustomize();


  /**
   * <p>
   * Setter method for the COM property "DisableCustomize"
   * </p>
   * @param pvarfDisableCustomize Mandatory boolean parameter.
   */

  @DISPID(1610809369) //= 0x60030019. The runtime will prefer the VTID if present
  @VTID(35)
  void disableCustomize(
          boolean pvarfDisableCustomize);


  /**
   * <p>
   * Getter method for the COM property "DisableAskAQuestionDropdown"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809371) //= 0x6003001b. The runtime will prefer the VTID if present
  @VTID(36)
  boolean disableAskAQuestionDropdown();


  /**
   * <p>
   * Setter method for the COM property "DisableAskAQuestionDropdown"
   * </p>
   * @param pvarfDisableAskAQuestionDropdown Mandatory boolean parameter.
   */

  @DISPID(1610809371) //= 0x6003001b. The runtime will prefer the VTID if present
  @VTID(37)
  void disableAskAQuestionDropdown(
          boolean pvarfDisableAskAQuestionDropdown);


  /**
   * @param idMso Mandatory java.lang.String parameter.
   */

  @DISPID(1610809373) //= 0x6003001d. The runtime will prefer the VTID if present
  @VTID(38)
  void executeMso(
          String idMso);


  /**
   * @param idMso Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809374) //= 0x6003001e. The runtime will prefer the VTID if present
  @VTID(39)
  boolean getEnabledMso(
          String idMso);


  /**
   * @param idMso Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809375) //= 0x6003001f. The runtime will prefer the VTID if present
  @VTID(40)
  boolean getVisibleMso(
          String idMso);


  /**
   * @param idMso Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809376) //= 0x60030020. The runtime will prefer the VTID if present
  @VTID(41)
  boolean getPressedMso(
          String idMso);


  /**
   * @param idMso Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809377) //= 0x60030021. The runtime will prefer the VTID if present
  @VTID(42)
  String getLabelMso(
          String idMso);


  /**
   * @param idMso Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809378) //= 0x60030022. The runtime will prefer the VTID if present
  @VTID(43)
  String getScreentipMso(
          String idMso);


  /**
   * @param idMso Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809379) //= 0x60030023. The runtime will prefer the VTID if present
  @VTID(44)
  String getSupertipMso(
          String idMso);


  /**
   * @param idMso Mandatory java.lang.String parameter.
   * @param width Mandatory int parameter.
   * @param height Mandatory int parameter.
   * @return  Returns a value of type Holder<com4j.stdole.IPictureDisp>
   */

  @DISPID(1610809380) //= 0x60030024. The runtime will prefer the VTID if present
  @VTID(45)
  Holder<com4j.stdole.IPictureDisp> getImageMso(
          String idMso,
          int width,
          int height);


  /**
   * @param hwnd Mandatory int parameter.
   */

  @DISPID(1610809381) //= 0x60030025. The runtime will prefer the VTID if present
  @VTID(46)
  void commitRenderingTransaction(
          int hwnd);


  // Properties:
}
