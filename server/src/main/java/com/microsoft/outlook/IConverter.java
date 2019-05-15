package com.microsoft.outlook;

import com4j.*;

@IID("{000C03D7-0000-0000-C000-000000000046}")
public interface IConverter extends Com4jObject {
  // Methods:
  /**
   * @param pcap Mandatory com.microsoft.outlook.IConverterApplicationPreferences parameter.
   * @param pcuic Mandatory com.microsoft.outlook.IConverterUICallback parameter.
   * @return  Returns a value of type com.microsoft.outlook.IConverterPreferences
   */

  @VTID(3)
  @ReturnValue(index=1)
  com.microsoft.outlook.IConverterPreferences hrInitConverter(
          com.microsoft.outlook.IConverterApplicationPreferences pcap,
          com.microsoft.outlook.IConverterUICallback pcuic);


  /**
   * @param pcuic Mandatory com.microsoft.outlook.IConverterUICallback parameter.
   */

  @VTID(4)
  void hrUninitConverter(
          com.microsoft.outlook.IConverterUICallback pcuic);


  /**
   * @param bstrSourcePath Mandatory java.lang.String parameter.
   * @param bstrDestPath Mandatory java.lang.String parameter.
   * @param pcap Mandatory com.microsoft.outlook.IConverterApplicationPreferences parameter.
   * @param pcuic Mandatory com.microsoft.outlook.IConverterUICallback parameter.
   * @return  Returns a value of type com.microsoft.outlook.IConverterPreferences
   */

  @VTID(5)
  @ReturnValue(index=3)
  com.microsoft.outlook.IConverterPreferences hrImport(
          String bstrSourcePath,
          String bstrDestPath,
          com.microsoft.outlook.IConverterApplicationPreferences pcap,
          com.microsoft.outlook.IConverterUICallback pcuic);


  /**
   * @param bstrSourcePath Mandatory java.lang.String parameter.
   * @param bstrDestPath Mandatory java.lang.String parameter.
   * @param bstrClass Mandatory java.lang.String parameter.
   * @param pcap Mandatory com.microsoft.outlook.IConverterApplicationPreferences parameter.
   * @param pcuic Mandatory com.microsoft.outlook.IConverterUICallback parameter.
   * @return  Returns a value of type com.microsoft.outlook.IConverterPreferences
   */

  @VTID(6)
  @ReturnValue(index=4)
  com.microsoft.outlook.IConverterPreferences hrExport(
          String bstrSourcePath,
          String bstrDestPath,
          String bstrClass,
          com.microsoft.outlook.IConverterApplicationPreferences pcap,
          com.microsoft.outlook.IConverterUICallback pcuic);


  /**
   * @param bstrPath Mandatory java.lang.String parameter.
   * @param pbstrClass Mandatory Holder<java.lang.String> parameter.
   * @param pcap Mandatory com.microsoft.outlook.IConverterApplicationPreferences parameter.
   * @param ppcp Mandatory Holder<com.microsoft.outlook.IConverterPreferences> parameter.
   * @param pcuic Mandatory com.microsoft.outlook.IConverterUICallback parameter.
   */

  @VTID(7)
  void hrGetFormat(
          String bstrPath,
          Holder<String> pbstrClass,
          com.microsoft.outlook.IConverterApplicationPreferences pcap,
          Holder<com.microsoft.outlook.IConverterPreferences> ppcp,
          com.microsoft.outlook.IConverterUICallback pcuic);


  /**
   * @param hrErr Mandatory int parameter.
   * @param pcap Mandatory com.microsoft.outlook.IConverterApplicationPreferences parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(8)
  @ReturnValue(index=1)
  String hrGetErrorString(
          int hrErr,
          com.microsoft.outlook.IConverterApplicationPreferences pcap);


  // Properties:
}
