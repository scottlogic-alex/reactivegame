package com.microsoft.outlook;

import com4j.*;

@IID("{000C03E4-0000-0000-C000-000000000046}")
public interface PickerResult extends _IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Id"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  String id();


  /**
   * <p>
   * Getter method for the COM property "DisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  String displayName();


  /**
   * <p>
   * Setter method for the COM property "DisplayName"
   * </p>
   * @param displayName Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  void displayName(
          String displayName);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  String type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param type Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  void type(
          String type);


  /**
   * <p>
   * Getter method for the COM property "SIPId"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  String sipId();


  /**
   * <p>
   * Setter method for the COM property "SIPId"
   * </p>
   * @param sipId Mandatory java.lang.String parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  void sipId(
          String sipId);


  /**
   * <p>
   * Getter method for the COM property "ItemData"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  Object itemData();


  /**
   * <p>
   * Setter method for the COM property "ItemData"
   * </p>
   * @param itemData Mandatory java.lang.Object parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(17)
  void itemData(
          @MarshalAs(NativeType.VARIANT) Object itemData);


  /**
   * <p>
   * Getter method for the COM property "SubItems"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  Object subItems();


  /**
   * <p>
   * Setter method for the COM property "SubItems"
   * </p>
   * @param subItems Mandatory java.lang.Object parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(19)
  void subItems(
          @MarshalAs(NativeType.VARIANT) Object subItems);


  /**
   * <p>
   * Getter method for the COM property "DuplicateResults"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.VARIANT)
  Object duplicateResults();


  /**
   * <p>
   * Getter method for the COM property "Fields"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.PickerFields
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(21)
  PickerFields fields();


  @VTID(21)
  @ReturnValue(defaultPropertyThrough={PickerFields.class})
  PickerField fields(
          int index);

  /**
   * <p>
   * Setter method for the COM property "Fields"
   * </p>
   * @param fields Mandatory com.microsoft.outlook.PickerFields parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(22)
  void fields(
          PickerFields fields);


  // Properties:
}
