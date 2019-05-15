package com.microsoft.outlook;

import com4j.*;

@IID("{00063007-0000-0000-C000-000000000046}")
public interface Attachment extends Com4jObject {
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
  _NameSpace session();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "DisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(11)
  String displayName();


  /**
   * <p>
   * Setter method for the COM property "DisplayName"
   * </p>
   * @param displayName Mandatory java.lang.String parameter.
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(12)
  void displayName(
          String displayName);


  /**
   * <p>
   * Getter method for the COM property "FileName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14084) //= 0x3704. The runtime will prefer the VTID if present
  @VTID(13)
  String fileName();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(91) //= 0x5b. The runtime will prefer the VTID if present
  @VTID(14)
  int index();


  /**
   * <p>
   * Getter method for the COM property "MAPIOBJECT"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61696) //= 0xf100. The runtime will prefer the VTID if present
  @VTID(15)
  Com4jObject mapiobject();


  /**
   * <p>
   * Getter method for the COM property "PathName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14088) //= 0x3708. The runtime will prefer the VTID if present
  @VTID(16)
  String pathName();


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(17)
  int position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param position Mandatory int parameter.
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(18)
  void position(
          int position);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlAttachmentType
   */

  @DISPID(14085) //= 0x3705. The runtime will prefer the VTID if present
  @VTID(19)
  com.microsoft.outlook.OlAttachmentType type();


  /**
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(20)
  void delete();


  /**
   * @param path Mandatory java.lang.String parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(21)
  void saveAsFile(
          String path);


  /**
   * <p>
   * Getter method for the COM property "PropertyAccessor"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._PropertyAccessor
   */

  @DISPID(64253) //= 0xfafd. The runtime will prefer the VTID if present
  @VTID(22)
  com.microsoft.outlook._PropertyAccessor propertyAccessor();


  /**
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64489) //= 0xfbe9. The runtime will prefer the VTID if present
  @VTID(23)
  int size();


  /**
   * <p>
   * Getter method for the COM property "BlockLevel"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.OlAttachmentBlockLevel
   */

  @DISPID(64536) //= 0xfc18. The runtime will prefer the VTID if present
  @VTID(24)
  com.microsoft.outlook.OlAttachmentBlockLevel blockLevel();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64634) //= 0xfc7a. The runtime will prefer the VTID if present
  @VTID(25)
  String getTemporaryFilePath();


  // Properties:
}
