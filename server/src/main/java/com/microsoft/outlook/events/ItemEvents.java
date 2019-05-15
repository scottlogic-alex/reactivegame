package com.microsoft.outlook.events;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.Holder;
import com4j.IID;

@IID("{0006303A-0000-0000-C000-000000000046}")
public abstract class ItemEvents {
  // Methods:
  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61443)
  public void open(
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param action Mandatory com4j.Com4jObject parameter.
   * @param response Mandatory com4j.Com4jObject parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61446)
  public void customAction(
    Com4jObject action,
    Com4jObject response,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(61448)
  public void customPropertyChange(
    String name) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param forward Mandatory com4j.Com4jObject parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(62568)
  public void forward(
    Com4jObject forward,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61444)
  public void close(
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(61449)
  public void propertyChange(
    String name) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(61441)
  public void read() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param response Mandatory com4j.Com4jObject parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(62566)
  public void reply(
    Com4jObject response,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param response Mandatory com4j.Com4jObject parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(62567)
  public void replyAll(
    Com4jObject response,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61445)
  public void send(
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61442)
  public void write(
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61450)
  public void beforeCheckNames(
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param attachment Mandatory com.microsoft.outlook.Attachment parameter.
   */

  @DISPID(61451)
  public void attachmentAdd(
    com.microsoft.outlook.Attachment attachment) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param attachment Mandatory com.microsoft.outlook.Attachment parameter.
   */

  @DISPID(61452)
  public void attachmentRead(
    com.microsoft.outlook.Attachment attachment) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param attachment Mandatory com.microsoft.outlook.Attachment parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61453)
  public void beforeAttachmentSave(
    com.microsoft.outlook.Attachment attachment,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
