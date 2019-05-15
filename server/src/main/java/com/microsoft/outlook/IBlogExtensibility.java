package com.microsoft.outlook;

import com4j.*;

@IID("{000C03C4-0000-0000-C000-000000000046}")
public interface IBlogExtensibility extends Com4jObject {
  // Methods:
  /**
   * @param blogProvider Mandatory Holder<java.lang.String> parameter.
   * @param friendlyName Mandatory Holder<java.lang.String> parameter.
   * @param categorySupport Mandatory Holder<com.microsoft.outlook.MsoBlogCategorySupport> parameter.
   * @param padding Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void blogProviderProperties(
          Holder<String> blogProvider,
          Holder<String> friendlyName,
          Holder<com.microsoft.outlook.MsoBlogCategorySupport> categorySupport,
          Holder<Boolean> padding);


  /**
   * @param account Mandatory java.lang.String parameter.
   * @param parentWindow Mandatory int parameter.
   * @param document Mandatory com4j.Com4jObject parameter.
   * @param newAccount Mandatory boolean parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  boolean setupBlogAccount(
          String account,
          int parentWindow,
          @MarshalAs(NativeType.Dispatch) Com4jObject document,
          boolean newAccount);


        /**
         * @param account Mandatory java.lang.String parameter.
         * @param parentWindow Mandatory int parameter.
         * @param document Mandatory com4j.Com4jObject parameter.
         * @param xHTML Mandatory java.lang.String parameter.
         * @param title Mandatory java.lang.String parameter.
         * @param dateTime Mandatory java.lang.String parameter.
         * @param categories Mandatory java.lang.String[] parameter.
         * @param draft Mandatory boolean parameter.
         * @param postID Mandatory Holder<java.lang.String> parameter.
         * @param publishMessage Mandatory Holder<java.lang.String> parameter.
         */

        @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
        @VTID(12)
        void publishPost(
                String account,
                int parentWindow,
                @MarshalAs(NativeType.Dispatch) Com4jObject document,
                String xHTML,
                String title,
                String dateTime,
                String[] categories,
                boolean draft,
                Holder<String> postID,
                Holder<String> publishMessage);


        /**
         * @param account Mandatory java.lang.String parameter.
         * @param parentWindow Mandatory int parameter.
         * @param document Mandatory com4j.Com4jObject parameter.
         * @param postID Mandatory java.lang.String parameter.
         * @param xHTML Mandatory java.lang.String parameter.
         * @param title Mandatory java.lang.String parameter.
         * @param dateTime Mandatory java.lang.String parameter.
         * @param categories Mandatory java.lang.String[] parameter.
         * @param draft Mandatory boolean parameter.
         * @return  Returns a value of type java.lang.String
         */

        @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
        @VTID(13)
        String republishPost(
                String account,
                int parentWindow,
                @MarshalAs(NativeType.Dispatch) Com4jObject document,
                String postID,
                String xHTML,
                String title,
                String dateTime,
                String[] categories,
                boolean draft);


        /**
         * @param account Mandatory java.lang.String parameter.
         * @param parentWindow Mandatory int parameter.
         * @param document Mandatory com4j.Com4jObject parameter.
         * @return  Returns a value of type java.lang.String[]
         */

        @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
        @VTID(14)
        String[] getCategories(
                String account,
                int parentWindow,
                @MarshalAs(NativeType.Dispatch) Com4jObject document);


        // Properties:
      }
