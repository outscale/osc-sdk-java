package io.github.outscale.example;

// Import classes:
import io.github.outscale.osc_sdk_java.client.*;
import io.github.outscale.osc_sdk_java.client.api.AccountApi;
import io.github.outscale.osc_sdk_java.client.api.ApiAccessPolicyApi;
import io.github.outscale.osc_sdk_java.client.api.VmApi;
import io.github.outscale.osc_sdk_java.client.model.*;

public class App {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    String username = System.getenv("OSC_USERNAME");
    String password = System.getenv("OSC_PASSWORD");
    defaultClient.setUsername(username);
    defaultClient.setPassword(password);

    ApiAccessPolicyApi api = new ApiAccessPolicyApi(defaultClient);
    ReadApiAccessPolicyRequest request = new ReadApiAccessPolicyRequest(); // CreateAccessKeyRequest |
    try {
      ReadApiAccessPolicyResponse result = api.readApiAccessPolicy(request);
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