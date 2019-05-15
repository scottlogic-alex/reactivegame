package com.microsoft.outlook;

import com4j.*;

@IID("{000C0362-0000-0000-C000-000000000046}")
public interface FileDialog extends com.microsoft.outlook._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Filters"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.FileDialogFilters
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(10)
  com.microsoft.outlook.FileDialogFilters filters();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.FileDialogFilters.class})
  com.microsoft.outlook.FileDialogFilter filters(
          int index);

  /**
   * <p>
   * Getter method for the COM property "FilterIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809346) //= 0x60030002. The runtime will prefer the VTID if present
  @VTID(11)
  int filterIndex();


  /**
   * <p>
   * Setter method for the COM property "FilterIndex"
   * </p>
   * @param filterIndex Mandatory int parameter.
   */

  @DISPID(1610809346) //= 0x60030002. The runtime will prefer the VTID if present
  @VTID(12)
  void filterIndex(
          int filterIndex);


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(13)
  String title();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param title Mandatory java.lang.String parameter.
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(14)
  void title(
          String title);


  /**
   * <p>
   * Getter method for the COM property "ButtonName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809350) //= 0x60030006. The runtime will prefer the VTID if present
  @VTID(15)
  String buttonName();


  /**
   * <p>
   * Setter method for the COM property "ButtonName"
   * </p>
   * @param buttonName Mandatory java.lang.String parameter.
   */

  @DISPID(1610809350) //= 0x60030006. The runtime will prefer the VTID if present
  @VTID(16)
  void buttonName(
          String buttonName);


  /**
   * <p>
   * Getter method for the COM property "AllowMultiSelect"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809352) //= 0x60030008. The runtime will prefer the VTID if present
  @VTID(17)
  boolean allowMultiSelect();


  /**
   * <p>
   * Setter method for the COM property "AllowMultiSelect"
   * </p>
   * @param pvarfAllowMultiSelect Mandatory boolean parameter.
   */

  @DISPID(1610809352) //= 0x60030008. The runtime will prefer the VTID if present
  @VTID(18)
  void allowMultiSelect(
          boolean pvarfAllowMultiSelect);


  /**
   * <p>
   * Getter method for the COM property "InitialView"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoFileDialogView
   */

  @DISPID(1610809354) //= 0x6003000a. The runtime will prefer the VTID if present
  @VTID(19)
  com.microsoft.outlook.MsoFileDialogView initialView();


  /**
   * <p>
   * Setter method for the COM property "InitialView"
   * </p>
   * @param pinitialview Mandatory com.microsoft.outlook.MsoFileDialogView parameter.
   */

  @DISPID(1610809354) //= 0x6003000a. The runtime will prefer the VTID if present
  @VTID(20)
  void initialView(
          com.microsoft.outlook.MsoFileDialogView pinitialview);


  /**
   * <p>
   * Getter method for the COM property "InitialFileName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809356) //= 0x6003000c. The runtime will prefer the VTID if present
  @VTID(21)
  String initialFileName();


  /**
   * <p>
   * Setter method for the COM property "InitialFileName"
   * </p>
   * @param initialFileName Mandatory java.lang.String parameter.
   */

  @DISPID(1610809356) //= 0x6003000c. The runtime will prefer the VTID if present
  @VTID(22)
  void initialFileName(
          String initialFileName);


  /**
   * <p>
   * Getter method for the COM property "SelectedItems"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.FileDialogSelectedItems
   */

  @DISPID(1610809358) //= 0x6003000e. The runtime will prefer the VTID if present
  @VTID(23)
  com.microsoft.outlook.FileDialogSelectedItems selectedItems();


  @VTID(23)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.FileDialogSelectedItems.class})
  String selectedItems(
          int index);

  /**
   * <p>
   * Getter method for the COM property "DialogType"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoFileDialogType
   */

  @DISPID(1610809359) //= 0x6003000f. The runtime will prefer the VTID if present
  @VTID(24)
  com.microsoft.outlook.MsoFileDialogType dialogType();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(25)
  @DefaultMethod
  String item();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(1610809361) //= 0x60030011. The runtime will prefer the VTID if present
  @VTID(26)
  int show();


  /**
   */

  @DISPID(1610809362) //= 0x60030012. The runtime will prefer the VTID if present
  @VTID(27)
  void execute();


  // Properties:
}
