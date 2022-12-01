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
import com.outscale.osc_sdk_java.client.model.ResourceTag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Information about the Internet service.
 */
@ApiModel(description = "Information about the Internet service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T09:51:28.653202Z[Etc/UTC]")
public class InternetService {
  public static final String SERIALIZED_NAME_INTERNET_SERVICE_ID = "InternetServiceId";
  @SerializedName(SERIALIZED_NAME_INTERNET_SERVICE_ID)
  private String internetServiceId;

  public static final String SERIALIZED_NAME_NET_ID = "NetId";
  @SerializedName(SERIALIZED_NAME_NET_ID)
  private String netId;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<ResourceTag> tags = null;


  public InternetService internetServiceId(String internetServiceId) {
    
    this.internetServiceId = internetServiceId;
    return this;
  }

   /**
   * The ID of the Internet service.
   * @return internetServiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the Internet service.")

  public String getInternetServiceId() {
    return internetServiceId;
  }


  public void setInternetServiceId(String internetServiceId) {
    this.internetServiceId = internetServiceId;
  }


  public InternetService netId(String netId) {
    
    this.netId = netId;
    return this;
  }

   /**
   * The ID of the Net attached to the Internet service.
   * @return netId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the Net attached to the Internet service.")

  public String getNetId() {
    return netId;
  }


  public void setNetId(String netId) {
    this.netId = netId;
  }


  public InternetService state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state of the attachment of the Internet service to the Net (always &#x60;available&#x60;).
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state of the attachment of the Internet service to the Net (always `available`).")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public InternetService tags(List<ResourceTag> tags) {
    
    this.tags = tags;
    return this;
  }

  public InternetService addTagsItem(ResourceTag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<ResourceTag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * One or more tags associated with the Internet service.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One or more tags associated with the Internet service.")

  public List<ResourceTag> getTags() {
    return tags;
  }


  public void setTags(List<ResourceTag> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternetService internetService = (InternetService) o;
    return Objects.equals(this.internetServiceId, internetService.internetServiceId) &&
        Objects.equals(this.netId, internetService.netId) &&
        Objects.equals(this.state, internetService.state) &&
        Objects.equals(this.tags, internetService.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internetServiceId, netId, state, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternetService {\n");
    sb.append("    internetServiceId: ").append(toIndentedString(internetServiceId)).append("\n");
    sb.append("    netId: ").append(toIndentedString(netId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

