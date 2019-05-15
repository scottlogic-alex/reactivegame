package com.microsoft.outlook;

import com4j.*;

@IID("{000630F2-0000-0000-C000-000000000046}")
public interface _NavigationFolder extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Application
   */

  @DISPID(61440) //= 0xf000. The runtime will prefer the VTID if present
  @VTID(7)
  _Application application();


  /**
   * <p>
   * Getter method for the COM property "Class"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlObjectClass
   */

  @DISPID(61450) //= 0xf00a. The runtime will prefer the VTID if present
  @VTID(8)
  OlObjectClass _class();


  /**
   * <p>
   * Getter method for the COM property "Session"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._NameSpace
   */

  @DISPID(61451) //= 0xf00b. The runtime will prefer the VTID if present
  @VTID(9)
  _NameSpace session();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61441) //= 0xf001. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Folder"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(64452) //= 0xfbc4. The runtime will prefer the VTID if present
  @VTID(11)
  MAPIFolder folder();


  /**
   * <p>
   * Getter method for the COM property "IsSelected"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64453) //= 0xfbc5. The runtime will prefer the VTID if present
  @VTID(12)
  boolean isSelected();


  /**
   * <p>
   * Setter method for the COM property "IsSelected"
   * </p>
   * @param isSelected Mandatory boolean parameter.
   */

  @DISPID(64453) //= 0xfbc5. The runtime will prefer the VTID if present
  @VTID(13)
  void isSelected(
          boolean isSelected);


  /**
   * <p>
   * Getter method for the COM property "IsSideBySide"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64454) //= 0xfbc6. The runtime will prefer the VTID if present
  @VTID(14)
  boolean isSideBySide();


  /**
   * <p>
   * Setter method for the COM property "IsSideBySide"
   * </p>
   * @param isSideBySide Mandatory boolean parameter.
   */

  @DISPID(64454) //= 0xfbc6. The runtime will prefer the VTID if present
  @VTID(15)
  void isSideBySide(
          boolean isSideBySide);


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64455) //= 0xfbc7. The runtime will prefer the VTID if present
  @VTID(16)
  int position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param position Mandatory int parameter.
   */

  @DISPID(64455) //= 0xfbc7. The runtime will prefer the VTID if present
  @VTID(17)
  void position(
          int position);


  /**
   * <p>
   * Getter method for the COM property "IsRemovable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64456) //= 0xfbc8. The runtime will prefer the VTID if present
  @VTID(18)
  boolean isRemovable();


  /**
   * <p>
   * Getter method for the COM property "DisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8450) //= 0x2102. The runtime will prefer the VTID if present
  @VTID(19)
  String displayName();


  // Properties:
}
