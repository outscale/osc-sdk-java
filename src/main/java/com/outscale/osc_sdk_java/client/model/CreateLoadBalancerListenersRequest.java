/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.23
 * Contact: support@outscale.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.outscale.osc_sdk_java.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.outscale.osc_sdk_java.client.model.ListenerForCreation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateLoadBalancerListenersRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T09:51:28.653202Z[Etc/UTC]")
public class CreateLoadBalancerListenersRequest {
  public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_LISTENERS = "Listeners";
  @SerializedName(SERIALIZED_NAME_LISTENERS)
  private List<ListenerForCreation> listeners = new ArrayList<ListenerForCreation>();

  public static final String SERIALIZED_NAME_LOAD_BALANCER_NAME = "LoadBalancerName";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_NAME)
  private String loadBalancerName;


  public CreateLoadBalancerListenersRequest dryRun(Boolean dryRun) {
    
    this.dryRun = dryRun;
    return this;
  }

   /**
   * If true, checks whether you have the required permissions to perform the action.
   * @return dryRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, checks whether you have the required permissions to perform the action.")

  public Boolean getDryRun() {
    return dryRun;
  }


  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }


  public CreateLoadBalancerListenersRequest listeners(List<ListenerForCreation> listeners) {
    
    this.listeners = listeners;
    return this;
  }

  public CreateLoadBalancerListenersRequest addListenersItem(ListenerForCreation listenersItem) {
    this.listeners.add(listenersItem);
    return this;
  }

   /**
   * One or more listeners for the load balancer.
   * @return listeners
  **/
  @ApiModelProperty(required = true, value = "One or more listeners for the load balancer.")

  public List<ListenerForCreation> getListeners() {
    return listeners;
  }


  public void setListeners(List<ListenerForCreation> listeners) {
    this.listeners = listeners;
  }


  public CreateLoadBalancerListenersRequest loadBalancerName(String loadBalancerName) {
    
    this.loadBalancerName = loadBalancerName;
    return this;
  }

   /**
   * The name of the load balancer for which you want to create listeners.
   * @return loadBalancerName
  **/
  @ApiModelProperty(required = true, value = "The name of the load balancer for which you want to create listeners.")

  public String getLoadBalancerName() {
    return loadBalancerName;
  }


  public void setLoadBalancerName(String loadBalancerName) {
    this.loadBalancerName = loadBalancerName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest = (CreateLoadBalancerListenersRequest) o;
    return Objects.equals(this.dryRun, createLoadBalancerListenersRequest.dryRun) &&
        Objects.equals(this.listeners, createLoadBalancerListenersRequest.listeners) &&
        Objects.equals(this.loadBalancerName, createLoadBalancerListenersRequest.loadBalancerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, listeners, loadBalancerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLoadBalancerListenersRequest {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
    sb.append("    loadBalancerName: ").append(toIndentedString(loadBalancerName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

