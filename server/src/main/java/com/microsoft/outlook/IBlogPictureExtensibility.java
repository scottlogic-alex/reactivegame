package com.microsoft.outlook;

import com4j.*;

@IID("{000C03C5-0000-0000-C000-000000000046}")
public interface IBlogPictureExtensibility extends Com4jObject {
  // Methods:
  /**
   * @param blogPictureProvider Mandatory Holder<java.lang.String> parameter.
   * @param friendlyName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void blogPictureProviderProperties(
          Holder<String> blogPictureProvider,
          Holder<String> friendlyName);


  /**
   * @param account Mandatory java.lang.String parameter.
   * @param blogProvider Mandatory java.lang.String parameter.
   * @param parentWindow Mandatory int parameter.
   * @param document Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void createPictureAccount(
          String account,
          String blogProvider,
          int parentWindow,
          @MarshalAs(NativeType.Dispatch) Com4jObject document);


  /**
   * @param account Mandatory java.lang.String parameter.
   * @param parentWindow Mandatory int parameter.
   * @param document Mandatory com4j.Com4jObject parameter.
   * @param image Mandatory com4j.Com4jObject parameter.
   * @param imageType Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(index=4)
  String publishPicture(
          String account,
          int parentWindow,
          @MarshalAs(NativeType.Dispatch) Com4jObject document,
          Com4jObject image,
          int imageType);


  // Properties:
}
