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
import com.outscale.osc_sdk_java.client.model.BlockDeviceMappingImage;
import com.outscale.osc_sdk_java.client.model.PermissionsOnResource;
import com.outscale.osc_sdk_java.client.model.ResourceTag;
import com.outscale.osc_sdk_java.client.model.StateComment;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.outscale.osc_sdk_java.client.JSON;

/**
 * Information about the OMI.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-02T08:39:48.703371583Z[GMT]")
public class Image {
  public static final String SERIALIZED_NAME_ACCOUNT_ALIAS = "AccountAlias";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ALIAS)
  private String accountAlias;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ARCHITECTURE = "Architecture";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
  private String architecture;

  public static final String SERIALIZED_NAME_BLOCK_DEVICE_MAPPINGS = "BlockDeviceMappings";
  @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_MAPPINGS)
  private List<BlockDeviceMappingImage> blockDeviceMappings = null;

  public static final String SERIALIZED_NAME_CREATION_DATE = "CreationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private LocalDate creationDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FILE_LOCATION = "FileLocation";
  @SerializedName(SERIALIZED_NAME_FILE_LOCATION)
  private String fileLocation;

  public static final String SERIALIZED_NAME_IMAGE_ID = "ImageId";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId;

  public static final String SERIALIZED_NAME_IMAGE_NAME = "ImageName";
  @SerializedName(SERIALIZED_NAME_IMAGE_NAME)
  private String imageName;

  public static final String SERIALIZED_NAME_IMAGE_TYPE = "ImageType";
  @SerializedName(SERIALIZED_NAME_IMAGE_TYPE)
  private String imageType;

  public static final String SERIALIZED_NAME_PERMISSIONS_TO_LAUNCH = "PermissionsToLaunch";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS_TO_LAUNCH)
  private PermissionsOnResource permissionsToLaunch;

  public static final String SERIALIZED_NAME_PRODUCT_CODES = "ProductCodes";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODES)
  private List<String> productCodes = null;

  public static final String SERIALIZED_NAME_ROOT_DEVICE_NAME = "RootDeviceName";
  @SerializedName(SERIALIZED_NAME_ROOT_DEVICE_NAME)
  private String rootDeviceName;

  public static final String SERIALIZED_NAME_ROOT_DEVICE_TYPE = "RootDeviceType";
  @SerializedName(SERIALIZED_NAME_ROOT_DEVICE_TYPE)
  private String rootDeviceType;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_STATE_COMMENT = "StateComment";
  @SerializedName(SERIALIZED_NAME_STATE_COMMENT)
  private StateComment stateComment;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<ResourceTag> tags = null;

  public Image() {
  }

  public Image accountAlias(String accountAlias) {
    
    this.accountAlias = accountAlias;
    return this;
  }

   /**
   * The account alias of the owner of the OMI.
   * @return accountAlias
  **/
  @javax.annotation.Nullable

  public String getAccountAlias() {
    return accountAlias;
  }


  public void setAccountAlias(String accountAlias) {
    this.accountAlias = accountAlias;
  }


  public Image accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID of the owner of the OMI.
   * @return accountId
  **/
  @javax.annotation.Nullable

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public Image architecture(String architecture) {
    
    this.architecture = architecture;
    return this;
  }

   /**
   * The architecture of the OMI (by default, &#x60;i386&#x60;).
   * @return architecture
  **/
  @javax.annotation.Nullable

  public String getArchitecture() {
    return architecture;
  }


  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }


  public Image blockDeviceMappings(List<BlockDeviceMappingImage> blockDeviceMappings) {
    
    this.blockDeviceMappings = blockDeviceMappings;
    return this;
  }

  public Image addBlockDeviceMappingsItem(BlockDeviceMappingImage blockDeviceMappingsItem) {
    if (this.blockDeviceMappings == null) {
      this.blockDeviceMappings = new ArrayList<>();
    }
    this.blockDeviceMappings.add(blockDeviceMappingsItem);
    return this;
  }

   /**
   * One or more block device mappings.
   * @return blockDeviceMappings
  **/
  @javax.annotation.Nullable

  public List<BlockDeviceMappingImage> getBlockDeviceMappings() {
    return blockDeviceMappings;
  }


  public void setBlockDeviceMappings(List<BlockDeviceMappingImage> blockDeviceMappings) {
    this.blockDeviceMappings = blockDeviceMappings;
  }


  public Image creationDate(LocalDate creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * The date and time at which the OMI was created.
   * @return creationDate
  **/
  @javax.annotation.Nullable

  public LocalDate getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }


  public Image description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the OMI.
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Image fileLocation(String fileLocation) {
    
    this.fileLocation = fileLocation;
    return this;
  }

   /**
   * The location of the bucket where the OMI files are stored.
   * @return fileLocation
  **/
  @javax.annotation.Nullable

  public String getFileLocation() {
    return fileLocation;
  }


  public void setFileLocation(String fileLocation) {
    this.fileLocation = fileLocation;
  }


  public Image imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * The ID of the OMI.
   * @return imageId
  **/
  @javax.annotation.Nullable

  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public Image imageName(String imageName) {
    
    this.imageName = imageName;
    return this;
  }

   /**
   * The name of the OMI.
   * @return imageName
  **/
  @javax.annotation.Nullable

  public String getImageName() {
    return imageName;
  }


  public void setImageName(String imageName) {
    this.imageName = imageName;
  }


  public Image imageType(String imageType) {
    
    this.imageType = imageType;
    return this;
  }

   /**
   * The type of the OMI.
   * @return imageType
  **/
  @javax.annotation.Nullable

  public String getImageType() {
    return imageType;
  }


  public void setImageType(String imageType) {
    this.imageType = imageType;
  }


  public Image permissionsToLaunch(PermissionsOnResource permissionsToLaunch) {
    
    this.permissionsToLaunch = permissionsToLaunch;
    return this;
  }

   /**
   * Get permissionsToLaunch
   * @return permissionsToLaunch
  **/
  @javax.annotation.Nullable

  public PermissionsOnResource getPermissionsToLaunch() {
    return permissionsToLaunch;
  }


  public void setPermissionsToLaunch(PermissionsOnResource permissionsToLaunch) {
    this.permissionsToLaunch = permissionsToLaunch;
  }


  public Image productCodes(List<String> productCodes) {
    
    this.productCodes = productCodes;
    return this;
  }

  public Image addProductCodesItem(String productCodesItem) {
    if (this.productCodes == null) {
      this.productCodes = new ArrayList<>();
    }
    this.productCodes.add(productCodesItem);
    return this;
  }

   /**
   * The product code associated with the OMI (&#x60;0001&#x60; Linux/Unix \\| &#x60;0002&#x60; Windows \\| &#x60;0004&#x60; Linux/Oracle \\| &#x60;0005&#x60; Windows 10).
   * @return productCodes
  **/
  @javax.annotation.Nullable

  public List<String> getProductCodes() {
    return productCodes;
  }


  public void setProductCodes(List<String> productCodes) {
    this.productCodes = productCodes;
  }


  public Image rootDeviceName(String rootDeviceName) {
    
    this.rootDeviceName = rootDeviceName;
    return this;
  }

   /**
   * The name of the root device.
   * @return rootDeviceName
  **/
  @javax.annotation.Nullable

  public String getRootDeviceName() {
    return rootDeviceName;
  }


  public void setRootDeviceName(String rootDeviceName) {
    this.rootDeviceName = rootDeviceName;
  }


  public Image rootDeviceType(String rootDeviceType) {
    
    this.rootDeviceType = rootDeviceType;
    return this;
  }

   /**
   * The type of root device used by the OMI (always &#x60;bsu&#x60;).
   * @return rootDeviceType
  **/
  @javax.annotation.Nullable

  public String getRootDeviceType() {
    return rootDeviceType;
  }


  public void setRootDeviceType(String rootDeviceType) {
    this.rootDeviceType = rootDeviceType;
  }


  public Image state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state of the OMI (&#x60;pending&#x60; \\| &#x60;available&#x60; \\| &#x60;failed&#x60;).
   * @return state
  **/
  @javax.annotation.Nullable

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public Image stateComment(StateComment stateComment) {
    
    this.stateComment = stateComment;
    return this;
  }

   /**
   * Get stateComment
   * @return stateComment
  **/
  @javax.annotation.Nullable

  public StateComment getStateComment() {
    return stateComment;
  }


  public void setStateComment(StateComment stateComment) {
    this.stateComment = stateComment;
  }


  public Image tags(List<ResourceTag> tags) {
    
    this.tags = tags;
    return this;
  }

  public Image addTagsItem(ResourceTag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * One or more tags associated with the OMI.
   * @return tags
  **/
  @javax.annotation.Nullable

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
    Image image = (Image) o;
    return Objects.equals(this.accountAlias, image.accountAlias) &&
        Objects.equals(this.accountId, image.accountId) &&
        Objects.equals(this.architecture, image.architecture) &&
        Objects.equals(this.blockDeviceMappings, image.blockDeviceMappings) &&
        Objects.equals(this.creationDate, image.creationDate) &&
        Objects.equals(this.description, image.description) &&
        Objects.equals(this.fileLocation, image.fileLocation) &&
        Objects.equals(this.imageId, image.imageId) &&
        Objects.equals(this.imageName, image.imageName) &&
        Objects.equals(this.imageType, image.imageType) &&
        Objects.equals(this.permissionsToLaunch, image.permissionsToLaunch) &&
        Objects.equals(this.productCodes, image.productCodes) &&
        Objects.equals(this.rootDeviceName, image.rootDeviceName) &&
        Objects.equals(this.rootDeviceType, image.rootDeviceType) &&
        Objects.equals(this.state, image.state) &&
        Objects.equals(this.stateComment, image.stateComment) &&
        Objects.equals(this.tags, image.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountAlias, accountId, architecture, blockDeviceMappings, creationDate, description, fileLocation, imageId, imageName, imageType, permissionsToLaunch, productCodes, rootDeviceName, rootDeviceType, state, stateComment, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    sb.append("    accountAlias: ").append(toIndentedString(accountAlias)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    blockDeviceMappings: ").append(toIndentedString(blockDeviceMappings)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fileLocation: ").append(toIndentedString(fileLocation)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    permissionsToLaunch: ").append(toIndentedString(permissionsToLaunch)).append("\n");
    sb.append("    productCodes: ").append(toIndentedString(productCodes)).append("\n");
    sb.append("    rootDeviceName: ").append(toIndentedString(rootDeviceName)).append("\n");
    sb.append("    rootDeviceType: ").append(toIndentedString(rootDeviceType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateComment: ").append(toIndentedString(stateComment)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("AccountAlias");
    openapiFields.add("AccountId");
    openapiFields.add("Architecture");
    openapiFields.add("BlockDeviceMappings");
    openapiFields.add("CreationDate");
    openapiFields.add("Description");
    openapiFields.add("FileLocation");
    openapiFields.add("ImageId");
    openapiFields.add("ImageName");
    openapiFields.add("ImageType");
    openapiFields.add("PermissionsToLaunch");
    openapiFields.add("ProductCodes");
    openapiFields.add("RootDeviceName");
    openapiFields.add("RootDeviceType");
    openapiFields.add("State");
    openapiFields.add("StateComment");
    openapiFields.add("Tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Image
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Image.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Image is not found in the empty JSON string", Image.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Image.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Image` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("AccountAlias") != null && !jsonObj.get("AccountAlias").isJsonNull()) && !jsonObj.get("AccountAlias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccountAlias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AccountAlias").toString()));
      }
      if ((jsonObj.get("AccountId") != null && !jsonObj.get("AccountId").isJsonNull()) && !jsonObj.get("AccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AccountId").toString()));
      }
      if ((jsonObj.get("Architecture") != null && !jsonObj.get("Architecture").isJsonNull()) && !jsonObj.get("Architecture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Architecture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Architecture").toString()));
      }
      if (jsonObj.get("BlockDeviceMappings") != null && !jsonObj.get("BlockDeviceMappings").isJsonNull()) {
        JsonArray jsonArrayblockDeviceMappings = jsonObj.getAsJsonArray("BlockDeviceMappings");
        if (jsonArrayblockDeviceMappings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("BlockDeviceMappings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `BlockDeviceMappings` to be an array in the JSON string but got `%s`", jsonObj.get("BlockDeviceMappings").toString()));
          }

          // validate the optional field `BlockDeviceMappings` (array)
          for (int i = 0; i < jsonArrayblockDeviceMappings.size(); i++) {
            BlockDeviceMappingImage.validateJsonObject(jsonArrayblockDeviceMappings.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      if ((jsonObj.get("FileLocation") != null && !jsonObj.get("FileLocation").isJsonNull()) && !jsonObj.get("FileLocation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FileLocation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FileLocation").toString()));
      }
      if ((jsonObj.get("ImageId") != null && !jsonObj.get("ImageId").isJsonNull()) && !jsonObj.get("ImageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ImageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ImageId").toString()));
      }
      if ((jsonObj.get("ImageName") != null && !jsonObj.get("ImageName").isJsonNull()) && !jsonObj.get("ImageName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ImageName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ImageName").toString()));
      }
      if ((jsonObj.get("ImageType") != null && !jsonObj.get("ImageType").isJsonNull()) && !jsonObj.get("ImageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ImageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ImageType").toString()));
      }
      // validate the optional field `PermissionsToLaunch`
      if (jsonObj.get("PermissionsToLaunch") != null && !jsonObj.get("PermissionsToLaunch").isJsonNull()) {
        PermissionsOnResource.validateJsonObject(jsonObj.getAsJsonObject("PermissionsToLaunch"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ProductCodes") != null && !jsonObj.get("ProductCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ProductCodes` to be an array in the JSON string but got `%s`", jsonObj.get("ProductCodes").toString()));
      }
      if ((jsonObj.get("RootDeviceName") != null && !jsonObj.get("RootDeviceName").isJsonNull()) && !jsonObj.get("RootDeviceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RootDeviceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RootDeviceName").toString()));
      }
      if ((jsonObj.get("RootDeviceType") != null && !jsonObj.get("RootDeviceType").isJsonNull()) && !jsonObj.get("RootDeviceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RootDeviceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RootDeviceType").toString()));
      }
      if ((jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull()) && !jsonObj.get("State").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `State` to be a primitive type in the JSON string but got `%s`", jsonObj.get("State").toString()));
      }
      // validate the optional field `StateComment`
      if (jsonObj.get("StateComment") != null && !jsonObj.get("StateComment").isJsonNull()) {
        StateComment.validateJsonObject(jsonObj.getAsJsonObject("StateComment"));
      }
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("Tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Tags` to be an array in the JSON string but got `%s`", jsonObj.get("Tags").toString()));
          }

          // validate the optional field `Tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            ResourceTag.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Image.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Image' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Image> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Image.class));

       return (TypeAdapter<T>) new TypeAdapter<Image>() {
           @Override
           public void write(JsonWriter out, Image value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Image read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Image given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Image
  * @throws IOException if the JSON string is invalid with respect to Image
  */
  public static Image fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Image.class);
  }

 /**
  * Convert an instance of Image to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

