package io.github.outscale.example;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.ConfigurationEnv;
import io.github.outscale.osc_sdk_java.client.ConfigurationFile;
import io.github.outscale.osc_sdk_java.client.JSON;
import io.github.outscale.osc_sdk_java.client.model.*;
import io.github.outscale.osc_sdk_java.client.api.RegionApi;
import io.github.outscale.osc_sdk_java.client.api.VmApi;

public class App {

  public static void main(String[] args) {

    ConfigurationEnv confEnv = ConfigurationEnv.loadConfigEnv();
    if (confEnv == null) {
      return;
    }

    ApiClient apiClient = confEnv.getApiClient();
    if (apiClient == null) {
      return;
    }

    VmApi apiInstance = new VmApi(apiClient);
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