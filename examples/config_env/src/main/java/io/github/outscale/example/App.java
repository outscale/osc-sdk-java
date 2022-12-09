package io.github.outscale.example;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.ConfigurationEnv;
import com.outscale.osc_sdk_java.client.ConfigurationFile;
import com.outscale.osc_sdk_java.client.JSON;
import com.outscale.osc_sdk_java.client.model.*;
import com.outscale.osc_sdk_java.client.api.RegionApi;
import com.outscale.osc_sdk_java.client.api.VmApi;

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