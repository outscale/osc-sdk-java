package com.outscale.example;


// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.model.*;
import com.outscale.osc_sdk_java.client.api.RegionApi;

public class App {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();    

    RegionApi apiInstance = new RegionApi(defaultClient);
    ReadRegionsRequest createAccessKeyRequest = new ReadRegionsRequest(); // CreateAccessKeyRequest | 
    try {
      ReadRegionsResponse result = apiInstance.readRegions(createAccessKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessKeyApi#createAccessKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}