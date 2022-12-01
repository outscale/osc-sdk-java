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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * One or more filters.
 */
@ApiModel(description = "One or more filters.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T09:51:28.653202Z[Etc/UTC]")
public class FiltersDirectLinkInterface {
  public static final String SERIALIZED_NAME_DIRECT_LINK_IDS = "DirectLinkIds";
  @SerializedName(SERIALIZED_NAME_DIRECT_LINK_IDS)
  private List<String> directLinkIds = null;

  public static final String SERIALIZED_NAME_DIRECT_LINK_INTERFACE_IDS = "DirectLinkInterfaceIds";
  @SerializedName(SERIALIZED_NAME_DIRECT_LINK_INTERFACE_IDS)
  private List<String> directLinkInterfaceIds = null;


  public FiltersDirectLinkInterface directLinkIds(List<String> directLinkIds) {
    
    this.directLinkIds = directLinkIds;
    return this;
  }

  public FiltersDirectLinkInterface addDirectLinkIdsItem(String directLinkIdsItem) {
    if (this.directLinkIds == null) {
      this.directLinkIds = new ArrayList<String>();
    }
    this.directLinkIds.add(directLinkIdsItem);
    return this;
  }

   /**
   * The IDs of the DirectLinks.
   * @return directLinkIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the DirectLinks.")

  public List<String> getDirectLinkIds() {
    return directLinkIds;
  }


  public void setDirectLinkIds(List<String> directLinkIds) {
    this.directLinkIds = directLinkIds;
  }


  public FiltersDirectLinkInterface directLinkInterfaceIds(List<String> directLinkInterfaceIds) {
    
    this.directLinkInterfaceIds = directLinkInterfaceIds;
    return this;
  }

  public FiltersDirectLinkInterface addDirectLinkInterfaceIdsItem(String directLinkInterfaceIdsItem) {
    if (this.directLinkInterfaceIds == null) {
      this.directLinkInterfaceIds = new ArrayList<String>();
    }
    this.directLinkInterfaceIds.add(directLinkInterfaceIdsItem);
    return this;
  }

   /**
   * The IDs of the DirectLink interfaces.
   * @return directLinkInterfaceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the DirectLink interfaces.")

  public List<String> getDirectLinkInterfaceIds() {
    return directLinkInterfaceIds;
  }


  public void setDirectLinkInterfaceIds(List<String> directLinkInterfaceIds) {
    this.directLinkInterfaceIds = directLinkInterfaceIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiltersDirectLinkInterface filtersDirectLinkInterface = (FiltersDirectLinkInterface) o;
    return Objects.equals(this.directLinkIds, filtersDirectLinkInterface.directLinkIds) &&
        Objects.equals(this.directLinkInterfaceIds, filtersDirectLinkInterface.directLinkInterfaceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directLinkIds, directLinkInterfaceIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltersDirectLinkInterface {\n");
    sb.append("    directLinkIds: ").append(toIndentedString(directLinkIds)).append("\n");
    sb.append("    directLinkInterfaceIds: ").append(toIndentedString(directLinkInterfaceIds)).append("\n");
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

