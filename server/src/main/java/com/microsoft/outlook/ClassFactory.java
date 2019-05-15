package com.microsoft.outlook;

import com4j.COM4J;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  public static com.microsoft.outlook._DRecipientControl create_RecipientControl() {
    return COM4J.createInstance( com.microsoft.outlook._DRecipientControl.class, "{0006F023-0000-0000-C000-000000000046}" );
  }

  public static com.microsoft.outlook._DDocSiteControl create_DocSiteControl() {
    return COM4J.createInstance( com.microsoft.outlook._DDocSiteControl.class, "{0006F024-0000-0000-C000-000000000046}" );
  }

  /**
   * Outlook TextBox
   */
  public static _OlkTextBox createOlkTextBox() {
    return COM4J.createInstance( _OlkTextBox.class, "{0006F068-0000-0000-C000-000000000046}" );
  }

  public static _OlkLabel createOlkLabel() {
    return COM4J.createInstance( _OlkLabel.class, "{0006F067-0000-0000-C000-000000000046}" );
  }

  public static com.microsoft.outlook._OlkCommandButton createOlkCommandButton() {
    return COM4J.createInstance( com.microsoft.outlook._OlkCommandButton.class, "{0006F04A-0000-0000-C000-000000000046}" );
  }

  public static _OlkCheckBox createOlkCheckBox() {
    return COM4J.createInstance( _OlkCheckBox.class, "{0006F04C-0000-0000-C000-000000000046}" );
  }

  public static com.microsoft.outlook._OlkOptionButton createOlkOptionButton() {
    return COM4J.createInstance( com.microsoft.outlook._OlkOptionButton.class, "{0006F04B-0000-0000-C000-000000000046}" );
  }

  public static _OlkComboBox createOlkComboBox() {
    return COM4J.createInstance( _OlkComboBox.class, "{0006F04D-0000-0000-C000-000000000046}" );
  }

  public static _OlkListBox createOlkListBox() {
    return COM4J.createInstance( _OlkListBox.class, "{0006F04E-0000-0000-C000-000000000046}" );
  }

  public static _OlkInfoBar createOlkInfoBar() {
    return COM4J.createInstance( _OlkInfoBar.class, "{0006F054-0000-0000-C000-000000000046}" );
  }

  public static com.microsoft.outlook._OlkContactPhoto createOlkContactPhoto() {
    return COM4J.createInstance( com.microsoft.outlook._OlkContactPhoto.class, "{0006F04F-0000-0000-C000-000000000046}" );
  }

  public static com.microsoft.outlook._OlkBusinessCardControl createOlkBusinessCardControl() {
    return COM4J.createInstance( com.microsoft.outlook._OlkBusinessCardControl.class, "{0006F050-0000-0000-C000-000000000046}" );
  }

  public static com.microsoft.outlook._OlkPageControl createOlkPageControl() {
    return COM4J.createInstance( com.microsoft.outlook._OlkPageControl.class, "{0006F055-0000-0000-C000-000000000046}" );
  }

  public static com.microsoft.outlook._OlkDateControl createOlkDateControl() {
    return COM4J.createInstance( com.microsoft.outlook._OlkDateControl.class, "{0006F056-0000-0000-C000-000000000046}" );
  }

  public static com.microsoft.outlook._OlkTimeControl createOlkTimeControl() {
    return COM4J.createInstance( com.microsoft.outlook._OlkTimeControl.class, "{0006F051-0000-0000-C000-000000000046}" );
  }

  public static _OlkCategory createOlkCategory() {
    return COM4J.createInstance( _OlkCategory.class, "{0006F053-0000-0000-C000-000000000046}" );
  }

  public static com.microsoft.outlook._OlkFrameHeader createOlkFrameHeader() {
    return COM4J.createInstance( com.microsoft.outlook._OlkFrameHeader.class, "{0006F057-0000-0000-C000-000000000046}" );
  }

  public static com.microsoft.outlook._OlkSenderPhoto createOlkSenderPhoto() {
    return COM4J.createInstance( com.microsoft.outlook._OlkSenderPhoto.class, "{0006F058-0000-0000-C000-000000000046}" );
  }

  public static com.microsoft.outlook._OlkTimeZoneControl createOlkTimeZoneControl() {
    return COM4J.createInstance( com.microsoft.outlook._OlkTimeZoneControl.class, "{0006F059-0000-0000-C000-000000000046}" );
  }

  public static _Application createApplication() {
    return COM4J.createInstance( _Application.class, "{0006F03A-0000-0000-C000-000000000046}" );
  }

  public static com.microsoft.outlook._CustomXMLSchemaCollection createCustomXMLSchemaCollection() {
    return COM4J.createInstance( com.microsoft.outlook._CustomXMLSchemaCollection.class, "{000CDB0D-0000-0000-C000-000000000046}" );
  }
}
