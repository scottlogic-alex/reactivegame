package com.microsoft.outlook;

import com4j.*;

@IID("{000CDB05-0000-0000-C000-000000000046}")
public interface _CustomXMLPart extends _IMsoDispObj {
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
   * Getter method for the COM property "DocumentElement"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.CustomXMLNode
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(10)
  CustomXMLNode documentElement();


  /**
   * <p>
   * Getter method for the COM property "Id"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809346) //= 0x60030002. The runtime will prefer the VTID if present
  @VTID(11)
  String id();


  /**
   * <p>
   * Getter method for the COM property "NamespaceURI"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(12)
  String namespaceURI();


  /**
   * <p>
   * Getter method for the COM property "SchemaCollection"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook._CustomXMLSchemaCollection
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(13)
  com.microsoft.outlook._CustomXMLSchemaCollection schemaCollection();


  /**
   * <p>
   * Setter method for the COM property "SchemaCollection"
   * </p>
   * @param ppSchemaCollection Mandatory com.microsoft.outlook._CustomXMLSchemaCollection parameter.
   */

  @DISPID(1610809348) //= 0x60030004. The runtime will prefer the VTID if present
  @VTID(14)
  void schemaCollection(
          com.microsoft.outlook._CustomXMLSchemaCollection ppSchemaCollection);


  /**
   * <p>
   * Getter method for the COM property "NamespaceManager"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.CustomXMLPrefixMappings
   */

  @DISPID(1610809350) //= 0x60030006. The runtime will prefer the VTID if present
  @VTID(15)
  com.microsoft.outlook.CustomXMLPrefixMappings namespaceManager();


  @VTID(15)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.CustomXMLPrefixMappings.class})
  com.microsoft.outlook.CustomXMLPrefixMapping namespaceManager(
          @MarshalAs(NativeType.VARIANT) Object index);

  /**
   * <p>
   * Getter method for the COM property "XML"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809351) //= 0x60030007. The runtime will prefer the VTID if present
  @VTID(16)
  String xml();


  /**
   * @param parent Mandatory com.microsoft.outlook.CustomXMLNode parameter.
   * @param name Optional parameter. Default value is ""
   * @param namespaceURI Optional parameter. Default value is ""
   * @param nextSibling Optional parameter. Default value is 0
   * @param nodeType Optional parameter. Default value is 1
   * @param nodeValue Optional parameter. Default value is ""
   */

  @DISPID(1610809352) //= 0x60030008. The runtime will prefer the VTID if present
  @VTID(17)
  void addNode(
          CustomXMLNode parent,
          @Optional @DefaultValue("") String name,
          @Optional @DefaultValue("") String namespaceURI,
          @Optional @DefaultValue("0") CustomXMLNode nextSibling,
          @Optional @DefaultValue("1") com.microsoft.outlook.MsoCustomXMLNodeType nodeType,
          @Optional @DefaultValue("") String nodeValue);


  /**
   */

  @DISPID(1610809353) //= 0x60030009. The runtime will prefer the VTID if present
  @VTID(18)
  void delete();


  /**
   * @param filePath Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809354) //= 0x6003000a. The runtime will prefer the VTID if present
  @VTID(19)
  boolean load(
          String filePath);


  /**
   * @param xml Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809355) //= 0x6003000b. The runtime will prefer the VTID if present
  @VTID(20)
  boolean loadXML(
          String xml);


  /**
   * @param xPath Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.microsoft.outlook.CustomXMLNodes
   */

  @DISPID(1610809356) //= 0x6003000c. The runtime will prefer the VTID if present
  @VTID(21)
  com.microsoft.outlook.CustomXMLNodes selectNodes(
          String xPath);


  /**
   * @param xPath Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.microsoft.outlook.CustomXMLNode
   */

  @DISPID(1610809357) //= 0x6003000d. The runtime will prefer the VTID if present
  @VTID(22)
  CustomXMLNode selectSingleNode(
          String xPath);


  /**
   * <p>
   * Getter method for the COM property "Errors"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.CustomXMLValidationErrors
   */

  @DISPID(1610809358) //= 0x6003000e. The runtime will prefer the VTID if present
  @VTID(23)
  com.microsoft.outlook.CustomXMLValidationErrors errors();


  @VTID(23)
  @ReturnValue(defaultPropertyThrough={com.microsoft.outlook.CustomXMLValidationErrors.class})
  com.microsoft.outlook.CustomXMLValidationError errors(
          int index);

  /**
   * <p>
   * Getter method for the COM property "BuiltIn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610809359) //= 0x6003000f. The runtime will prefer the VTID if present
  @VTID(24)
  boolean builtIn();


  // Properties:
}
