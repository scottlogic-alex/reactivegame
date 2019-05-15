package com.microsoft.outlook;

import com4j.*;

@IID("{000CD6A3-0000-0000-C000-000000000046}")
public interface SignatureProvider extends Com4jObject {
  // Methods:
  /**
   * @param siglnimg Mandatory com.microsoft.outlook.SignatureLineImage parameter.
   * @param psigsetup Mandatory com.microsoft.outlook.SignatureSetup parameter.
   * @param psiginfo Mandatory com.microsoft.outlook.SignatureInfo parameter.
   * @param xmlDsigStream Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type Holder<com4j.stdole.IPictureDisp>
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  Holder<com4j.stdole.IPictureDisp> generateSignatureLineImage(
          com.microsoft.outlook.SignatureLineImage siglnimg,
          SignatureSetup psigsetup,
          SignatureInfo psiginfo,
          Com4jObject xmlDsigStream);


  /**
   * @param parentWindow Mandatory com4j.Com4jObject parameter.
   * @param psigsetup Mandatory com.microsoft.outlook.SignatureSetup parameter.
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  void showSignatureSetup(
          Com4jObject parentWindow,
          SignatureSetup psigsetup);


  /**
   * @param parentWindow Mandatory com4j.Com4jObject parameter.
   * @param psigsetup Mandatory com.microsoft.outlook.SignatureSetup parameter.
   * @param psiginfo Mandatory com.microsoft.outlook.SignatureInfo parameter.
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  void showSigningCeremony(
          Com4jObject parentWindow,
          SignatureSetup psigsetup,
          SignatureInfo psiginfo);


  /**
   * @param queryContinue Mandatory com4j.Com4jObject parameter.
   * @param psigsetup Mandatory com.microsoft.outlook.SignatureSetup parameter.
   * @param psiginfo Mandatory com.microsoft.outlook.SignatureInfo parameter.
   * @param xmlDsigStream Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  void signXmlDsig(
          Com4jObject queryContinue,
          SignatureSetup psigsetup,
          SignatureInfo psiginfo,
          Com4jObject xmlDsigStream);


  /**
   * @param parentWindow Mandatory com4j.Com4jObject parameter.
   * @param psigsetup Mandatory com.microsoft.outlook.SignatureSetup parameter.
   * @param psiginfo Mandatory com.microsoft.outlook.SignatureInfo parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  void notifySignatureAdded(
          Com4jObject parentWindow,
          SignatureSetup psigsetup,
          SignatureInfo psiginfo);


  /**
   * @param queryContinue Mandatory com4j.Com4jObject parameter.
   * @param psigsetup Mandatory com.microsoft.outlook.SignatureSetup parameter.
   * @param psiginfo Mandatory com.microsoft.outlook.SignatureInfo parameter.
   * @param xmlDsigStream Mandatory com4j.Com4jObject parameter.
   * @param pcontverres Mandatory Holder<com.microsoft.outlook.ContentVerificationResults> parameter.
   * @param pcertverres Mandatory Holder<com.microsoft.outlook.CertificateVerificationResults> parameter.
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  void verifyXmlDsig(
          Com4jObject queryContinue,
          SignatureSetup psigsetup,
          SignatureInfo psiginfo,
          Com4jObject xmlDsigStream,
          Holder<com.microsoft.outlook.ContentVerificationResults> pcontverres,
          Holder<com.microsoft.outlook.CertificateVerificationResults> pcertverres);


  /**
   * @param parentWindow Mandatory com4j.Com4jObject parameter.
   * @param psigsetup Mandatory com.microsoft.outlook.SignatureSetup parameter.
   * @param psiginfo Mandatory com.microsoft.outlook.SignatureInfo parameter.
   * @param xmlDsigStream Mandatory com4j.Com4jObject parameter.
   * @param pcontverres Mandatory Holder<com.microsoft.outlook.ContentVerificationResults> parameter.
   * @param pcertverres Mandatory Holder<com.microsoft.outlook.CertificateVerificationResults> parameter.
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  void showSignatureDetails(
          Com4jObject parentWindow,
          SignatureSetup psigsetup,
          SignatureInfo psiginfo,
          Com4jObject xmlDsigStream,
          Holder<com.microsoft.outlook.ContentVerificationResults> pcontverres,
          Holder<com.microsoft.outlook.CertificateVerificationResults> pcertverres);


  /**
   * @param sigprovdet Mandatory com.microsoft.outlook.SignatureProviderDetail parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  Object getProviderDetail(
          com.microsoft.outlook.SignatureProviderDetail sigprovdet);


  /**
   * @param queryContinue Mandatory com4j.Com4jObject parameter.
   * @param stream Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type byte[]
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  byte[] hashStream(
          Com4jObject queryContinue,
          Com4jObject stream);


  // Properties:
}
