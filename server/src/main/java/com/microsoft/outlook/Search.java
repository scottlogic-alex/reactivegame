package com.microsoft.outlook;

import com4j.*;

@IID("{0006300B-0000-0000-C000-000000000046}")
public interface Search extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Application
   */

  @DISPID(61440) //= 0xf000. The runtime will prefer the VTID if present
  @VTID(7)
  com.microsoft.outlook._Application application();


  /**
   * <p>
   * Getter method for the COM property "Class"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlObjectClass
   */

  @DISPID(61450) //= 0xf00a. The runtime will prefer the VTID if present
  @VTID(8)
  com.microsoft.outlook.OlObjectClass _class();


  /**
   * <p>
   * Getter method for the COM property "Session"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._NameSpace
   */

  @DISPID(61451) //= 0xf00b. The runtime will prefer the VTID if present
  @VTID(9)
  com.microsoft.outlook._NameSpace session();


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
   * Getter method for the COM property "Filter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64100) //= 0xfa64. The runtime will prefer the VTID if present
  @VTID(11)
  String filter();


  /**
   * <p>
   * Getter method for the COM property "IsSynchronous"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64104) //= 0xfa68. The runtime will prefer the VTID if present
  @VTID(12)
  boolean isSynchronous();


  /**
   * <p>
   * Getter method for the COM property "Results"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._Results
   */

  @DISPID(64105) //= 0xfa69. The runtime will prefer the VTID if present
  @VTID(13)
  com.microsoft.outlook._Results results();


  /**
   * <p>
   * Getter method for the COM property "SearchSubFolders"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64102) //= 0xfa66. The runtime will prefer the VTID if present
  @VTID(14)
  boolean searchSubFolders();


  /**
   */

  @DISPID(64103) //= 0xfa67. The runtime will prefer the VTID if present
  @VTID(15)
  void stop();


  /**
   * <p>
   * Getter method for the COM property "Tag"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64109) //= 0xfa6d. The runtime will prefer the VTID if present
  @VTID(16)
  String tag();


  /**
   * <p>
   * Getter method for the COM property "Scope"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64165) //= 0xfaa5. The runtime will prefer the VTID if present
  @VTID(17)
  String scope();


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.microsoft.outlook.MAPIFolder
   */

  @DISPID(64173) //= 0xfaad. The runtime will prefer the VTID if present
  @VTID(18)
  com.microsoft.outlook.MAPIFolder save(
          String name);


  /**
   * @return  Returns a value of type com.microsoft.outlook._Table
   */

  @DISPID(64285) //= 0xfb1d. The runtime will prefer the VTID if present
  @VTID(19)
  _Table getTable();


  // Properties:
}
