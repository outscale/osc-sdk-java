package io.github.outscale.example;

// Import classes:
import io.github.outscale.osc_sdk_java.client.*;
import io.github.outscale.osc_sdk_java.client.api.VolumeApi;
import io.github.outscale.osc_sdk_java.client.model.*;

public class App {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    String accessKey = System.getenv("OSC_ACCESS_KEY");
    String secretKey = System.getenv("OSC_SECRET_KEY");
    String region = System.getenv("OSC_REGION");
    String endpoint = System.getenv("OSC_ENDPOINT_API");

    defaultClient.setAWS4Configuration(accessKey, secretKey, region, "api");
    if (endpoint != null)
	    defaultClient.setBasePath(endpoint);

    VolumeApi apiInstance = new VolumeApi(defaultClient);
    ReadVolumesRequest request = new ReadVolumesRequest();
    try {
      ReadVolumesResponse result = apiInstance.readVolumes(request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessKeyApi#createAccessKey");
      System.err.println("Endpoint: " + defaultClient.getBasePath());
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
      System.exit(1);
    }
  }
}
