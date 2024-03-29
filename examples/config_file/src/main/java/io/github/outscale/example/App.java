package io.github.outscale.example;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.ConfigurationException;
import io.github.outscale.osc_sdk_java.client.ConfigurationFile;
import io.github.outscale.osc_sdk_java.client.JSON;
import io.github.outscale.osc_sdk_java.client.model.*;
import io.github.outscale.osc_sdk_java.client.api.RegionApi;
import io.github.outscale.osc_sdk_java.client.api.VmApi;

public class App {

  public static void createConfigurationFile(String path) {
    String accessKey = System.getenv("OSC_ACCESS_KEY");
    String secretKey = System.getenv("OSC_SECRET_KEY");
    String region = System.getenv("OSC_REGION");
    String endpointApi = System.getenv("OSC_ENDPOINT_API_NOPROTO");
    String protocol = System.getenv("OSC_PROTOCOL");

    if (endpointApi != null) {
	endpointApi = String.format("\"endpoints\": {\"api\": \"%s\"},", endpointApi);
    } else {
	endpointApi = "";
    }

    if (protocol != null) {
	protocol = String.format("\"protocol\": \"%s\",", protocol);
    } else {
	protocol = "";
    }

    String content = String.format(
        "{\"default\": {%s%s\"access_key\": \"%s\", \"secret_key\": \"%s\", \"region\": \"%s\"}}",
	endpointApi, protocol,
        accessKey, secretKey, region);

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
      bw.write(content);
    } catch (IOException e) {
      System.err.println("Error during the read of the file");
      return;
    }

  }

  public static void main(String[] args) {

    String path = "/tmp/osc-sdk-java-ConfigurationFile";
    createConfigurationFile(path);

    ConfigurationFile confFile = null;
    try {
      confFile = ConfigurationFile.loadConfigFile(path);
    } catch (ConfigurationException e1) {
      System.err.println(e1.toString());
      System.exit(1);
    }
    if (confFile == null) {
      return;
    }

    ApiClient apiClient = null;
    try {
      apiClient = confFile.getApiClient("default");
    } catch (ConfigurationException e1) {
      System.err.println(e1.toString());
      System.exit(1);
    }

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
