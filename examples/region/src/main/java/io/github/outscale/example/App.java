package io.github.outscale.example;

// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.model.*;
import io.github.outscale.osc_sdk_java.client.handler.RegionApi;

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
      System.exit(1);
    }
  }
}
