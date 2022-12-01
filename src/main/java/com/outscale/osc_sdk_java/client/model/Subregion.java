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

/**
 * Information about the Subregion.
 */
@ApiModel(description = "Information about the Subregion.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T09:51:28.653202Z[Etc/UTC]")
public class Subregion {
  public static final String SERIALIZED_NAME_LOCATION_CODE = "LocationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private String locationCode;

  public static final String SERIALIZED_NAME_REGION_NAME = "RegionName";
  @SerializedName(SERIALIZED_NAME_REGION_NAME)
  private String regionName;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_SUBREGION_NAME = "SubregionName";
  @SerializedName(SERIALIZED_NAME_SUBREGION_NAME)
  private String subregionName;


  public Subregion locationCode(String locationCode) {
    
    this.locationCode = locationCode;
    return this;
  }

   /**
   * The location code of the Subregion.
   * @return locationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The location code of the Subregion.")

  public String getLocationCode() {
    return locationCode;
  }


  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }


  public Subregion regionName(String regionName) {
    
    this.regionName = regionName;
    return this;
  }

   /**
   * The name of the Region containing the Subregion.
   * @return regionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the Region containing the Subregion.")

  public String getRegionName() {
    return regionName;
  }


  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }


  public Subregion state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state of the Subregion (&#x60;available&#x60; \\| &#x60;information&#x60; \\| &#x60;impaired&#x60; \\| &#x60;unavailable&#x60;).
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state of the Subregion (`available` \\| `information` \\| `impaired` \\| `unavailable`).")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public Subregion subregionName(String subregionName) {
    
    this.subregionName = subregionName;
    return this;
  }

   /**
   * The name of the Subregion.
   * @return subregionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the Subregion.")

  public String getSubregionName() {
    return subregionName;
  }


  public void setSubregionName(String subregionName) {
    this.subregionName = subregionName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subregion subregion = (Subregion) o;
    return Objects.equals(this.locationCode, subregion.locationCode) &&
        Objects.equals(this.regionName, subregion.regionName) &&
        Objects.equals(this.state, subregion.state) &&
        Objects.equals(this.subregionName, subregion.subregionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationCode, regionName, state, subregionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subregion {\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subregionName: ").append(toIndentedString(subregionName)).append("\n");
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

