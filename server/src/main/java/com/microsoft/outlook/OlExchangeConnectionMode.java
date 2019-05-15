package com.microsoft.outlook;

import com4j.ComEnum;

/**
 */
public enum OlExchangeConnectionMode implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  olNoExchange(0),
  /**
   * <p>
   * The value of this constant is 100
   * </p>
   */
  olOffline(100),
  /**
   * <p>
   * The value of this constant is 200
   * </p>
   */
  olCachedOffline(200),
  /**
   * <p>
   * The value of this constant is 300
   * </p>
   */
  olDisconnected(300),
  /**
   * <p>
   * The value of this constant is 400
   * </p>
   */
  olCachedDisconnected(400),
  /**
   * <p>
   * The value of this constant is 500
   * </p>
   */
  olCachedConnectedHeaders(500),
  /**
   * <p>
   * The value of this constant is 600
   * </p>
   */
  olCachedConnectedDrizzle(600),
  /**
   * <p>
   * The value of this constant is 700
   * </p>
   */
  olCachedConnectedFull(700),
  /**
   * <p>
   * The value of this constant is 800
   * </p>
   */
  olOnline(800),
  ;

  private final int value;
  OlExchangeConnectionMode(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
