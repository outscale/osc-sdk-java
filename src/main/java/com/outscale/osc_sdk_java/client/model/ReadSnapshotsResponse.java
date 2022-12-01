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
import com.outscale.osc_sdk_java.client.model.ResponseContext;
import com.outscale.osc_sdk_java.client.model.Snapshot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReadSnapshotsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T09:51:28.653202Z[Etc/UTC]")
public class ReadSnapshotsResponse {
  public static final String SERIALIZED_NAME_RESPONSE_CONTEXT = "ResponseContext";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CONTEXT)
  private ResponseContext responseContext;

  public static final String SERIALIZED_NAME_SNAPSHOTS = "Snapshots";
  @SerializedName(SERIALIZED_NAME_SNAPSHOTS)
  private List<Snapshot> snapshots = null;


  public ReadSnapshotsResponse responseContext(ResponseContext responseContext) {
    
    this.responseContext = responseContext;
    return this;
  }

   /**
   * Get responseContext
   * @return responseContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResponseContext getResponseContext() {
    return responseContext;
  }


  public void setResponseContext(ResponseContext responseContext) {
    this.responseContext = responseContext;
  }


  public ReadSnapshotsResponse snapshots(List<Snapshot> snapshots) {
    
    this.snapshots = snapshots;
    return this;
  }

  public ReadSnapshotsResponse addSnapshotsItem(Snapshot snapshotsItem) {
    if (this.snapshots == null) {
      this.snapshots = new ArrayList<Snapshot>();
    }
    this.snapshots.add(snapshotsItem);
    return this;
  }

   /**
   * Information about one or more snapshots and their permissions.
   * @return snapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about one or more snapshots and their permissions.")

  public List<Snapshot> getSnapshots() {
    return snapshots;
  }


  public void setSnapshots(List<Snapshot> snapshots) {
    this.snapshots = snapshots;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadSnapshotsResponse readSnapshotsResponse = (ReadSnapshotsResponse) o;
    return Objects.equals(this.responseContext, readSnapshotsResponse.responseContext) &&
        Objects.equals(this.snapshots, readSnapshotsResponse.snapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseContext, snapshots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadSnapshotsResponse {\n");
    sb.append("    responseContext: ").append(toIndentedString(responseContext)).append("\n");
    sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
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

