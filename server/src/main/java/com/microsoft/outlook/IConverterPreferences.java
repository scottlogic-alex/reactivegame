package com.microsoft.outlook;

import com4j.Com4jObject;
import com4j.IID;
import com4j.VTID;

@IID("{000C03D4-0000-0000-C000-000000000046}")
public interface IConverterPreferences extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type int
   */

  @VTID(3)
  int hrGetMacroEnabled();


  /**
   * @return  Returns a value of type int
   */

  @VTID(4)
  int hrCheckFormat();


  /**
   * @return  Returns a value of type int
   */

  @VTID(5)
  int hrGetLossySave();


  // Properties:
}
