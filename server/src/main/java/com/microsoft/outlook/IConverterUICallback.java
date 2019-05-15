package com.microsoft.outlook;

import com4j.Com4jObject;
import com4j.IID;
import com4j.ReturnValue;
import com4j.VTID;

@IID("{000C03D6-0000-0000-C000-000000000046}")
public interface IConverterUICallback extends Com4jObject {
  // Methods:
  /**
   * @param uPercentComplete Mandatory int parameter.
   */

  @VTID(3)
  void hrReportProgress(
          int uPercentComplete);


  /**
   * @param bstrText Mandatory java.lang.String parameter.
   * @param bstrCaption Mandatory java.lang.String parameter.
   * @param uType Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @VTID(4)
  int hrMessageBox(
          String bstrText,
          String bstrCaption,
          int uType);


  /**
   * @param bstrText Mandatory java.lang.String parameter.
   * @param bstrCaption Mandatory java.lang.String parameter.
   * @param fPassword Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(5)
  @ReturnValue(index=2)
  String hrInputBox(
          String bstrText,
          String bstrCaption,
          int fPassword);


  // Properties:
}
