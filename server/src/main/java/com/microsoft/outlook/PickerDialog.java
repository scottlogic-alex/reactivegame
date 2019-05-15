package com.microsoft.outlook;

import com4j.*;

@IID("{000C03E6-0000-0000-C000-000000000046}")
public interface PickerDialog extends _IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "DataHandlerId"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  String dataHandlerId();


  /**
   * <p>
   * Setter method for the COM property "DataHandlerId"
   * </p>
   * @param id Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  void dataHandlerId(
          String id);


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  String title();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param title Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  void title(
          String title);


  /**
   * <p>
   * Getter method for the COM property "Properties"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.PickerProperties
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(13)
  com.microsoft.outlook.PickerProperties properties();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.PickerProperties.class})
  com.microsoft.outlook.PickerProperty properties(
          int index);

  /**
   * @return  Returns a value of type com.microsoft.outlook.PickerResults
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(14)
  com.microsoft.outlook.PickerResults createPickerResults();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.PickerResults.class})
  com.microsoft.outlook.PickerResult createPickerResults(
          int index);

  /**
   * @param isMultiSelect Optional parameter. Default value is false
   * @param existingResults Optional parameter. Default value is 0
   * @return  Returns a value of type com.microsoft.outlook.PickerResults
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  com.microsoft.outlook.PickerResults show(
          @Optional @DefaultValue("-1") boolean isMultiSelect,
          @Optional @DefaultValue("0") com.microsoft.outlook.PickerResults existingResults);


  /**
   * @param tokenText Mandatory java.lang.String parameter.
   * @param duplicateDlgMode Mandatory int parameter.
   * @return  Returns a value of type com.microsoft.outlook.PickerResults
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  com.microsoft.outlook.PickerResults resolve(
          String tokenText,
          int duplicateDlgMode);


  // Properties:
}
