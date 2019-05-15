package com.microsoft.outlook;

import com4j.*;

@IID("{000CD706-0000-0000-C000-000000000046}")
public interface IDocumentInspector extends Com4jObject {
  // Methods:
  /**
   * @param name Mandatory Holder<java.lang.String> parameter.
   * @param desc Mandatory Holder<java.lang.String> parameter.
   */

  @VTID(3)
  void getInfo(
          Holder<String> name,
          Holder<String> desc);


  /**
   * @param doc Mandatory com4j.Com4jObject parameter.
   * @param status Mandatory Holder<com.microsoft.outlook.MsoDocInspectorStatus> parameter.
   * @param result Mandatory Holder<java.lang.String> parameter.
   * @param action Mandatory Holder<java.lang.String> parameter.
   */

  @VTID(4)
  void inspect(
          @MarshalAs(NativeType.Dispatch) Com4jObject doc,
          Holder<com.microsoft.outlook.MsoDocInspectorStatus> status,
          Holder<String> result,
          Holder<String> action);


  /**
   * @param doc Mandatory com4j.Com4jObject parameter.
   * @param hwnd Mandatory int parameter.
   * @param status Mandatory Holder<com.microsoft.outlook.MsoDocInspectorStatus> parameter.
   * @param result Mandatory Holder<java.lang.String> parameter.
   */

  @VTID(5)
  void fix(
          @MarshalAs(NativeType.Dispatch) Com4jObject doc,
          int hwnd,
          Holder<com.microsoft.outlook.MsoDocInspectorStatus> status,
          Holder<String> result);


  // Properties:
}
