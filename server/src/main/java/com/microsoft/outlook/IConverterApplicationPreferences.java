package com.microsoft.outlook;

import com4j.Com4jObject;
import com4j.IID;
import com4j.VTID;

@IID("{000C03D5-0000-0000-C000-000000000046}")
public interface IConverterApplicationPreferences extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type int
   */

  @VTID(3)
  int hrGetLcid();


  /**
   * @return  Returns a value of type int
   */

  @VTID(4)
  int hrGetHwnd();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @VTID(5)
  String hrGetApplication();


  /**
   * @return  Returns a value of type int
   */

  @VTID(6)
  int hrCheckFormat();


  // Properties:
}
