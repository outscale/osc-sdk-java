package io.github.outscale.example;

// Import classes:
import io.github.outscale.osc_sdk_java.client.*;
import io.github.outscale.osc_sdk_java.client.api.VmApi;
import io.github.outscale.osc_sdk_java.client.model.*;

public class App {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    String accessKey = System.getenv("OSC_ACCESS_KEY");
    String secretKey = System.getenv("OSC_SECRET_KEY");
    String region = System.getenv("OSC_REGION");
    defaultClient.setAWS4Configuration(accessKey, secretKey, region, "api");
    String endpoint = System.getenv("OSC_ENDPOINT_API_PROTO");
    if (endpoint != null)
	    defaultClient.setBasePath(endpoint);

    VmApi apiInstance = new VmApi(defaultClient);
    ReadVmsRequest createAccessKeyRequest = new ReadVmsRequest(); // CreateAccessKeyRequest |
    FiltersVm filter = new FiltersVm();
    createAccessKeyRequest.setFilters(filter);
    try {
      ReadVmsResponse result = apiInstance.readVms(createAccessKeyRequest);
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
