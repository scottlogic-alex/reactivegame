package com.microsoft.outlook;

import com4j.*;

@IID("{000C0397-0000-0000-C000-000000000046}")
public interface TextRange2 extends com.microsoft.outlook._IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param pbstrText Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  void text(
          String pbstrText);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type com.microsoft.outlook.TextRange2
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  TextRange2 item(
          @MarshalAs(NativeType.VARIANT) Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Paragraphs"
   * </p>
   * @param start Optional parameter. Default value is -1
   * @param length Optional parameter. Default value is -1
   * @return  Returns a value of type com.microsoft.outlook.TextRange2
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(15)
  TextRange2 paragraphs(
          @Optional @DefaultValue("-1") int start,
          @Optional @DefaultValue("-1") int length);


  /**
   * <p>
   * Getter method for the COM property "Sentences"
   * </p>
   * @param start Optional parameter. Default value is -1
   * @param length Optional parameter. Default value is -1
   * @return  Returns a value of type com.microsoft.outlook.TextRange2
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  TextRange2 sentences(
          @Optional @DefaultValue("-1") int start,
          @Optional @DefaultValue("-1") int length);


  /**
   * <p>
   * Getter method for the COM property "Words"
   * </p>
   * @param start Optional parameter. Default value is -1
   * @param length Optional parameter. Default value is -1
   * @return  Returns a value of type com.microsoft.outlook.TextRange2
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  TextRange2 words(
          @Optional @DefaultValue("-1") int start,
          @Optional @DefaultValue("-1") int length);


  /**
   * <p>
   * Getter method for the COM property "Characters"
   * </p>
   * @param start Optional parameter. Default value is -1
   * @param length Optional parameter. Default value is -1
   * @return  Returns a value of type com.microsoft.outlook.TextRange2
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  TextRange2 characters(
          @Optional @DefaultValue("-1") int start,
          @Optional @DefaultValue("-1") int length);


  /**
   * <p>
   * Getter method for the COM property "Lines"
   * </p>
   * @param start Optional parameter. Default value is -1
   * @param length Optional parameter. Default value is -1
   * @return  Returns a value of type com.microsoft.outlook.TextRange2
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(19)
  TextRange2 lines(
          @Optional @DefaultValue("-1") int start,
          @Optional @DefaultValue("-1") int length);


  /**
   * <p>
   * Getter method for the COM property "Runs"
   * </p>
   * @param start Optional parameter. Default value is -1
   * @param length Optional parameter. Default value is -1
   * @return  Returns a value of type com.microsoft.outlook.TextRange2
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(20)
  TextRange2 runs(
          @Optional @DefaultValue("-1") int start,
          @Optional @DefaultValue("-1") int length);


  /**
   * <p>
   * Getter method for the COM property "ParagraphFormat"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.ParagraphFormat2
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(21)
  com.microsoft.outlook.ParagraphFormat2 paragraphFormat();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.Font2
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(22)
  Font2 font();


  /**
   * <p>
   * Getter method for the COM property "Length"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(23)
  int length();


  /**
   * <p>
   * Getter method for the COM property "Start"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(24)
  int start();


  /**
   * <p>
   * Getter method for the COM property "BoundLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(25)
  float boundLeft();


  /**
   * <p>
   * Getter method for the COM property "BoundTop"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(26)
  float boundTop();


  /**
   * <p>
   * Getter method for the COM property "BoundWidth"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(27)
  float boundWidth();


  /**
   * <p>
   * Getter method for the COM property "BoundHeight"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(28)
  float boundHeight();


  /**
   * @return  Returns a value of type com.microsoft.outlook.TextRange2
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(29)
  TextRange2 trimText();


  /**
   * @param newText Optional parameter. Default value is ""
   * @return  Returns a value of type com.microsoft.outlook.TextRange2
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(30)
  TextRange2 insertAfter(
          @Optional @DefaultValue("") String newText);


  /**
   * @param newText Optional parameter. Default value is ""
   * @return  Returns a value of type com.microsoft.outlook.TextRange2
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(31)
  TextRange2 insertBefore(
          @Optional @DefaultValue("") String newText);


  /**
   * @param fontName Mandatory java.lang.String parameter.
   * @param charNumber Mandatory int parameter.
   * @param unicode Optional parameter. Default value is 0
   * @return  Returns a value of type com.microsoft.outlook.TextRange2
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(32)
  TextRange2 insertSymbol(
          String fontName,
          int charNumber,
          @Optional @DefaultValue("0") com.microsoft.outlook.MsoTriState unicode);


  /**
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(33)
  void select();


  /**
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(34)
  void cut();


  /**
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(35)
  void copy();


  /**
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(36)
  void delete();


  /**
   * @return  Returns a value of type com.microsoft.outlook.TextRange2
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(37)
  TextRange2 paste();


  /**
   * @param format Mandatory com.microsoft.outlook.MsoClipboardFormat parameter.
   * @return  Returns a value of type com.microsoft.outlook.TextRange2
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(38)
  TextRange2 pasteSpecial(
          com.microsoft.outlook.MsoClipboardFormat format);


  /**
   * @param type Mandatory com.microsoft.outlook.MsoTextChangeCase parameter.
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(39)
  void changeCase(
          com.microsoft.outlook.MsoTextChangeCase type);


  /**
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(40)
  void addPeriods();


  /**
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(41)
  void removePeriods();


  /**
   * @param findWhat Mandatory java.lang.String parameter.
   * @param after Optional parameter. Default value is 0
   * @param matchCase Optional parameter. Default value is 0
   * @param wholeWords Optional parameter. Default value is 0
   * @return  Returns a value of type com.microsoft.outlook.TextRange2
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(42)
  TextRange2 find(
          String findWhat,
          @Optional @DefaultValue("0") int after,
          @Optional @DefaultValue("0") com.microsoft.outlook.MsoTriState matchCase,
          @Optional @DefaultValue("0") com.microsoft.outlook.MsoTriState wholeWords);


  /**
   * @param findWhat Mandatory java.lang.String parameter.
   * @param replaceWhat Mandatory java.lang.String parameter.
   * @param after Optional parameter. Default value is 0
   * @param matchCase Optional parameter. Default value is 0
   * @param wholeWords Optional parameter. Default value is 0
   * @return  Returns a value of type com.microsoft.outlook.TextRange2
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(43)
  TextRange2 replace(
          String findWhat,
          String replaceWhat,
          @Optional @DefaultValue("0") int after,
          @Optional @DefaultValue("0") com.microsoft.outlook.MsoTriState matchCase,
          @Optional @DefaultValue("0") com.microsoft.outlook.MsoTriState wholeWords);


  /**
   * @param x1 Mandatory Holder<Float> parameter.
   * @param y1 Mandatory Holder<Float> parameter.
   * @param x2 Mandatory Holder<Float> parameter.
   * @param y2 Mandatory Holder<Float> parameter.
   * @param x3 Mandatory Holder<Float> parameter.
   * @param y3 Mandatory Holder<Float> parameter.
   * @param x4 Mandatory Holder<Float> parameter.
   * @param y4 Mandatory Holder<Float> parameter.
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(44)
  void rotatedBounds(
          Holder<Float> x1,
          Holder<Float> y1,
          Holder<Float> x2,
          Holder<Float> y2,
          Holder<Float> x3,
          Holder<Float> y3,
          Holder<Float> x4,
          Holder<Float> y4);


  /**
   * <p>
   * Getter method for the COM property "LanguageID"
   * </p>
   * @return  Returns a value of type com.microsoft.outlook.MsoLanguageID
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(45)
  com.microsoft.outlook.MsoLanguageID languageID();


  /**
   * <p>
   * Setter method for the COM property "LanguageID"
   * </p>
   * @param languageID Mandatory com.microsoft.outlook.MsoLanguageID parameter.
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(46)
  void languageID(
          com.microsoft.outlook.MsoLanguageID languageID);


  /**
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(47)
  void rtlRun();


  /**
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(48)
  void ltrRun();


  /**
   * <p>
   * Getter method for the COM property "MathZones"
   * </p>
   * @param start Optional parameter. Default value is -1
   * @param length Optional parameter. Default value is -1
   * @return  Returns a value of type com.microsoft.outlook.TextRange2
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(49)
  TextRange2 mathZones(
          @Optional @DefaultValue("-1") int start,
          @Optional @DefaultValue("-1") int length);


  /**
   * @param chartFieldType Mandatory com.microsoft.outlook.MsoChartFieldType parameter.
   * @param formula Optional parameter. Default value is ""
   * @param position Optional parameter. Default value is -1
   * @return  Returns a value of type com.microsoft.outlook.TextRange2
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(50)
  TextRange2 insertChartField(
          com.microsoft.outlook.MsoChartFieldType chartFieldType,
          @Optional @DefaultValue("") String formula,
          @Optional @DefaultValue("-1") int position);


  // Properties:
}
