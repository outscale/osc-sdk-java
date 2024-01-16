/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> Throttling: To protect against overloads, the number of identical requests allowed in a given time period is limited.<br /> Brute force: To protect against brute force attacks, the number of failed authentication attempts in a given time period is limited.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).<br /> # Authentication Schemes ### Access Key/Secret Key The main way to authenticate your requests to the OUTSCALE API is to use an access key and a secret key.<br /> The mechanism behind this is based on AWS Signature Version 4, whose technical implementation details are described in [Signature of API Requests](https://docs.outscale.com/en/userguide/Signature-of-API-Requests.html).<br /><br /> In practice, the way to specify your access key and secret key depends on the tool or SDK you want to use to interact with the API.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify your access key, secret key, and the Region of your account. > 2. You then specify the `--profile` option when executing OSC CLI commands. >  > For more information, see [Installing and Configuring OSC CLI](https://docs.outscale.com/en/userguide/Installing-and-Configuring-OSC-CLI.html).  See the code samples in each section of this documentation for specific examples in different programming languages.<br /> For more information about access keys, see [About Access Keys](https://docs.outscale.com/en/userguide/About-Access-Keys.html). ### Login/Password For certain API actions, you can also use basic authentication with the login (email address) and password of your TINA account.<br /> This is useful only in special circumstances, for example if you do not know your access key/secret key and want to retrieve them programmatically.<br /> In most cases, however, you can use the Cockpit web interface to retrieve them.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify the Region of your account, but you leave the access key value and secret key value empty (`&quot;&quot;`). > 2. You then specify the `--profile`, `--authentication-method`, `--login`, and `--password` options when executing OSC CLI commands.  See the code samples in each section of this documentation for specific examples in different programming languages. ### No Authentication A few API actions do not require any authentication. They are indicated as such in this documentation.<br /> ### Other Security Mechanisms In parallel with the authentication schemes, you can add other security mechanisms to your OUTSCALE account, for example to restrict API requests by IP or other criteria.<br /> For more information, see [Managing Your API Accesses](https://docs.outscale.com/en/userguide/Managing-Your-API-Accesses.html).
 *
 * The version of the OpenAPI document: 1.28.5
 * Contact: support@outscale.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.outscale.osc_sdk_java.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.outscale.osc_sdk_java.client.JSON;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** One or more filters. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FiltersNetPeering {
    public static final String SERIALIZED_NAME_ACCEPTER_NET_ACCOUNT_IDS = "AccepterNetAccountIds";

    @SerializedName(SERIALIZED_NAME_ACCEPTER_NET_ACCOUNT_IDS)
    private List<String> accepterNetAccountIds = null;

    public static final String SERIALIZED_NAME_ACCEPTER_NET_IP_RANGES = "AccepterNetIpRanges";

    @SerializedName(SERIALIZED_NAME_ACCEPTER_NET_IP_RANGES)
    private List<String> accepterNetIpRanges = null;

    public static final String SERIALIZED_NAME_ACCEPTER_NET_NET_IDS = "AccepterNetNetIds";

    @SerializedName(SERIALIZED_NAME_ACCEPTER_NET_NET_IDS)
    private List<String> accepterNetNetIds = null;

    public static final String SERIALIZED_NAME_EXPIRATION_DATES = "ExpirationDates";

    @SerializedName(SERIALIZED_NAME_EXPIRATION_DATES)
    private List<OffsetDateTime> expirationDates = null;

    public static final String SERIALIZED_NAME_NET_PEERING_IDS = "NetPeeringIds";

    @SerializedName(SERIALIZED_NAME_NET_PEERING_IDS)
    private List<String> netPeeringIds = null;

    public static final String SERIALIZED_NAME_SOURCE_NET_ACCOUNT_IDS = "SourceNetAccountIds";

    @SerializedName(SERIALIZED_NAME_SOURCE_NET_ACCOUNT_IDS)
    private List<String> sourceNetAccountIds = null;

    public static final String SERIALIZED_NAME_SOURCE_NET_IP_RANGES = "SourceNetIpRanges";

    @SerializedName(SERIALIZED_NAME_SOURCE_NET_IP_RANGES)
    private List<String> sourceNetIpRanges = null;

    public static final String SERIALIZED_NAME_SOURCE_NET_NET_IDS = "SourceNetNetIds";

    @SerializedName(SERIALIZED_NAME_SOURCE_NET_NET_IDS)
    private List<String> sourceNetNetIds = null;

    public static final String SERIALIZED_NAME_STATE_MESSAGES = "StateMessages";

    @SerializedName(SERIALIZED_NAME_STATE_MESSAGES)
    private List<String> stateMessages = null;

    public static final String SERIALIZED_NAME_STATE_NAMES = "StateNames";

    @SerializedName(SERIALIZED_NAME_STATE_NAMES)
    private List<String> stateNames = null;

    public static final String SERIALIZED_NAME_TAG_KEYS = "TagKeys";

    @SerializedName(SERIALIZED_NAME_TAG_KEYS)
    private List<String> tagKeys = null;

    public static final String SERIALIZED_NAME_TAG_VALUES = "TagValues";

    @SerializedName(SERIALIZED_NAME_TAG_VALUES)
    private List<String> tagValues = null;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<String> tags = null;

    public FiltersNetPeering() {}

    public FiltersNetPeering accepterNetAccountIds(List<String> accepterNetAccountIds) {

        this.accepterNetAccountIds = accepterNetAccountIds;
        return this;
    }

    public FiltersNetPeering addAccepterNetAccountIdsItem(String accepterNetAccountIdsItem) {
        if (this.accepterNetAccountIds == null) {
            this.accepterNetAccountIds = new ArrayList<>();
        }
        this.accepterNetAccountIds.add(accepterNetAccountIdsItem);
        return this;
    }

    /**
     * The account IDs of the owners of the peer Nets.
     *
     * @return accepterNetAccountIds
     */
    @javax.annotation.Nullable
    public List<String> getAccepterNetAccountIds() {
        return accepterNetAccountIds;
    }

    public void setAccepterNetAccountIds(List<String> accepterNetAccountIds) {
        this.accepterNetAccountIds = accepterNetAccountIds;
    }

    public FiltersNetPeering accepterNetIpRanges(List<String> accepterNetIpRanges) {

        this.accepterNetIpRanges = accepterNetIpRanges;
        return this;
    }

    public FiltersNetPeering addAccepterNetIpRangesItem(String accepterNetIpRangesItem) {
        if (this.accepterNetIpRanges == null) {
            this.accepterNetIpRanges = new ArrayList<>();
        }
        this.accepterNetIpRanges.add(accepterNetIpRangesItem);
        return this;
    }

    /**
     * The IP ranges of the peer Nets, in CIDR notation (for example, &#x60;10.0.0.0/24&#x60;).
     *
     * @return accepterNetIpRanges
     */
    @javax.annotation.Nullable
    public List<String> getAccepterNetIpRanges() {
        return accepterNetIpRanges;
    }

    public void setAccepterNetIpRanges(List<String> accepterNetIpRanges) {
        this.accepterNetIpRanges = accepterNetIpRanges;
    }

    public FiltersNetPeering accepterNetNetIds(List<String> accepterNetNetIds) {

        this.accepterNetNetIds = accepterNetNetIds;
        return this;
    }

    public FiltersNetPeering addAccepterNetNetIdsItem(String accepterNetNetIdsItem) {
        if (this.accepterNetNetIds == null) {
            this.accepterNetNetIds = new ArrayList<>();
        }
        this.accepterNetNetIds.add(accepterNetNetIdsItem);
        return this;
    }

    /**
     * The IDs of the peer Nets.
     *
     * @return accepterNetNetIds
     */
    @javax.annotation.Nullable
    public List<String> getAccepterNetNetIds() {
        return accepterNetNetIds;
    }

    public void setAccepterNetNetIds(List<String> accepterNetNetIds) {
        this.accepterNetNetIds = accepterNetNetIds;
    }

    public FiltersNetPeering expirationDates(List<OffsetDateTime> expirationDates) {

        this.expirationDates = expirationDates;
        return this;
    }

    public FiltersNetPeering addExpirationDatesItem(OffsetDateTime expirationDatesItem) {
        if (this.expirationDates == null) {
            this.expirationDates = new ArrayList<>();
        }
        this.expirationDates.add(expirationDatesItem);
        return this;
    }

    /**
     * The dates and times at which the Net peerings expire, in ISO 8601 date-time format (for
     * example, &#x60;2020-06-14T00:00:00.000Z&#x60;).
     *
     * @return expirationDates
     */
    @javax.annotation.Nullable
    public List<OffsetDateTime> getExpirationDates() {
        return expirationDates;
    }

    public void setExpirationDates(List<OffsetDateTime> expirationDates) {
        this.expirationDates = expirationDates;
    }

    public FiltersNetPeering netPeeringIds(List<String> netPeeringIds) {

        this.netPeeringIds = netPeeringIds;
        return this;
    }

    public FiltersNetPeering addNetPeeringIdsItem(String netPeeringIdsItem) {
        if (this.netPeeringIds == null) {
            this.netPeeringIds = new ArrayList<>();
        }
        this.netPeeringIds.add(netPeeringIdsItem);
        return this;
    }

    /**
     * The IDs of the Net peerings.
     *
     * @return netPeeringIds
     */
    @javax.annotation.Nullable
    public List<String> getNetPeeringIds() {
        return netPeeringIds;
    }

    public void setNetPeeringIds(List<String> netPeeringIds) {
        this.netPeeringIds = netPeeringIds;
    }

    public FiltersNetPeering sourceNetAccountIds(List<String> sourceNetAccountIds) {

        this.sourceNetAccountIds = sourceNetAccountIds;
        return this;
    }

    public FiltersNetPeering addSourceNetAccountIdsItem(String sourceNetAccountIdsItem) {
        if (this.sourceNetAccountIds == null) {
            this.sourceNetAccountIds = new ArrayList<>();
        }
        this.sourceNetAccountIds.add(sourceNetAccountIdsItem);
        return this;
    }

    /**
     * The account IDs of the owners of the peer Nets.
     *
     * @return sourceNetAccountIds
     */
    @javax.annotation.Nullable
    public List<String> getSourceNetAccountIds() {
        return sourceNetAccountIds;
    }

    public void setSourceNetAccountIds(List<String> sourceNetAccountIds) {
        this.sourceNetAccountIds = sourceNetAccountIds;
    }

    public FiltersNetPeering sourceNetIpRanges(List<String> sourceNetIpRanges) {

        this.sourceNetIpRanges = sourceNetIpRanges;
        return this;
    }

    public FiltersNetPeering addSourceNetIpRangesItem(String sourceNetIpRangesItem) {
        if (this.sourceNetIpRanges == null) {
            this.sourceNetIpRanges = new ArrayList<>();
        }
        this.sourceNetIpRanges.add(sourceNetIpRangesItem);
        return this;
    }

    /**
     * The IP ranges of the peer Nets.
     *
     * @return sourceNetIpRanges
     */
    @javax.annotation.Nullable
    public List<String> getSourceNetIpRanges() {
        return sourceNetIpRanges;
    }

    public void setSourceNetIpRanges(List<String> sourceNetIpRanges) {
        this.sourceNetIpRanges = sourceNetIpRanges;
    }

    public FiltersNetPeering sourceNetNetIds(List<String> sourceNetNetIds) {

        this.sourceNetNetIds = sourceNetNetIds;
        return this;
    }

    public FiltersNetPeering addSourceNetNetIdsItem(String sourceNetNetIdsItem) {
        if (this.sourceNetNetIds == null) {
            this.sourceNetNetIds = new ArrayList<>();
        }
        this.sourceNetNetIds.add(sourceNetNetIdsItem);
        return this;
    }

    /**
     * The IDs of the peer Nets.
     *
     * @return sourceNetNetIds
     */
    @javax.annotation.Nullable
    public List<String> getSourceNetNetIds() {
        return sourceNetNetIds;
    }

    public void setSourceNetNetIds(List<String> sourceNetNetIds) {
        this.sourceNetNetIds = sourceNetNetIds;
    }

    public FiltersNetPeering stateMessages(List<String> stateMessages) {

        this.stateMessages = stateMessages;
        return this;
    }

    public FiltersNetPeering addStateMessagesItem(String stateMessagesItem) {
        if (this.stateMessages == null) {
            this.stateMessages = new ArrayList<>();
        }
        this.stateMessages.add(stateMessagesItem);
        return this;
    }

    /**
     * Additional information about the states of the Net peerings.
     *
     * @return stateMessages
     */
    @javax.annotation.Nullable
    public List<String> getStateMessages() {
        return stateMessages;
    }

    public void setStateMessages(List<String> stateMessages) {
        this.stateMessages = stateMessages;
    }

    public FiltersNetPeering stateNames(List<String> stateNames) {

        this.stateNames = stateNames;
        return this;
    }

    public FiltersNetPeering addStateNamesItem(String stateNamesItem) {
        if (this.stateNames == null) {
            this.stateNames = new ArrayList<>();
        }
        this.stateNames.add(stateNamesItem);
        return this;
    }

    /**
     * The states of the Net peerings (&#x60;pending-acceptance&#x60; \\| &#x60;active&#x60; \\|
     * &#x60;rejected&#x60; \\| &#x60;failed&#x60; \\| &#x60;expired&#x60; \\| &#x60;deleted&#x60;).
     *
     * @return stateNames
     */
    @javax.annotation.Nullable
    public List<String> getStateNames() {
        return stateNames;
    }

    public void setStateNames(List<String> stateNames) {
        this.stateNames = stateNames;
    }

    public FiltersNetPeering tagKeys(List<String> tagKeys) {

        this.tagKeys = tagKeys;
        return this;
    }

    public FiltersNetPeering addTagKeysItem(String tagKeysItem) {
        if (this.tagKeys == null) {
            this.tagKeys = new ArrayList<>();
        }
        this.tagKeys.add(tagKeysItem);
        return this;
    }

    /**
     * The keys of the tags associated with the Net peerings.
     *
     * @return tagKeys
     */
    @javax.annotation.Nullable
    public List<String> getTagKeys() {
        return tagKeys;
    }

    public void setTagKeys(List<String> tagKeys) {
        this.tagKeys = tagKeys;
    }

    public FiltersNetPeering tagValues(List<String> tagValues) {

        this.tagValues = tagValues;
        return this;
    }

    public FiltersNetPeering addTagValuesItem(String tagValuesItem) {
        if (this.tagValues == null) {
            this.tagValues = new ArrayList<>();
        }
        this.tagValues.add(tagValuesItem);
        return this;
    }

    /**
     * The values of the tags associated with the Net peerings.
     *
     * @return tagValues
     */
    @javax.annotation.Nullable
    public List<String> getTagValues() {
        return tagValues;
    }

    public void setTagValues(List<String> tagValues) {
        this.tagValues = tagValues;
    }

    public FiltersNetPeering tags(List<String> tags) {

        this.tags = tags;
        return this;
    }

    public FiltersNetPeering addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * The key/value combination of the tags associated with the Net peerings, in the following
     * format:
     * &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}.
     *
     * @return tags
     */
    @javax.annotation.Nullable
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
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
        FiltersNetPeering filtersNetPeering = (FiltersNetPeering) o;
        return Objects.equals(this.accepterNetAccountIds, filtersNetPeering.accepterNetAccountIds)
                && Objects.equals(this.accepterNetIpRanges, filtersNetPeering.accepterNetIpRanges)
                && Objects.equals(this.accepterNetNetIds, filtersNetPeering.accepterNetNetIds)
                && Objects.equals(this.expirationDates, filtersNetPeering.expirationDates)
                && Objects.equals(this.netPeeringIds, filtersNetPeering.netPeeringIds)
                && Objects.equals(this.sourceNetAccountIds, filtersNetPeering.sourceNetAccountIds)
                && Objects.equals(this.sourceNetIpRanges, filtersNetPeering.sourceNetIpRanges)
                && Objects.equals(this.sourceNetNetIds, filtersNetPeering.sourceNetNetIds)
                && Objects.equals(this.stateMessages, filtersNetPeering.stateMessages)
                && Objects.equals(this.stateNames, filtersNetPeering.stateNames)
                && Objects.equals(this.tagKeys, filtersNetPeering.tagKeys)
                && Objects.equals(this.tagValues, filtersNetPeering.tagValues)
                && Objects.equals(this.tags, filtersNetPeering.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                accepterNetAccountIds,
                accepterNetIpRanges,
                accepterNetNetIds,
                expirationDates,
                netPeeringIds,
                sourceNetAccountIds,
                sourceNetIpRanges,
                sourceNetNetIds,
                stateMessages,
                stateNames,
                tagKeys,
                tagValues,
                tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FiltersNetPeering {\n");
        sb.append("    accepterNetAccountIds: ")
                .append(toIndentedString(accepterNetAccountIds))
                .append("\n");
        sb.append("    accepterNetIpRanges: ")
                .append(toIndentedString(accepterNetIpRanges))
                .append("\n");
        sb.append("    accepterNetNetIds: ")
                .append(toIndentedString(accepterNetNetIds))
                .append("\n");
        sb.append("    expirationDates: ").append(toIndentedString(expirationDates)).append("\n");
        sb.append("    netPeeringIds: ").append(toIndentedString(netPeeringIds)).append("\n");
        sb.append("    sourceNetAccountIds: ")
                .append(toIndentedString(sourceNetAccountIds))
                .append("\n");
        sb.append("    sourceNetIpRanges: ")
                .append(toIndentedString(sourceNetIpRanges))
                .append("\n");
        sb.append("    sourceNetNetIds: ").append(toIndentedString(sourceNetNetIds)).append("\n");
        sb.append("    stateMessages: ").append(toIndentedString(stateMessages)).append("\n");
        sb.append("    stateNames: ").append(toIndentedString(stateNames)).append("\n");
        sb.append("    tagKeys: ").append(toIndentedString(tagKeys)).append("\n");
        sb.append("    tagValues: ").append(toIndentedString(tagValues)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
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
        openapiFields.add("AccepterNetAccountIds");
        openapiFields.add("AccepterNetIpRanges");
        openapiFields.add("AccepterNetNetIds");
        openapiFields.add("ExpirationDates");
        openapiFields.add("NetPeeringIds");
        openapiFields.add("SourceNetAccountIds");
        openapiFields.add("SourceNetIpRanges");
        openapiFields.add("SourceNetNetIds");
        openapiFields.add("StateMessages");
        openapiFields.add("StateNames");
        openapiFields.add("TagKeys");
        openapiFields.add("TagValues");
        openapiFields.add("Tags");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to FiltersNetPeering
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!FiltersNetPeering.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FiltersNetPeering is not found in the"
                                        + " empty JSON string",
                                FiltersNetPeering.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!FiltersNetPeering.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FiltersNetPeering` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("AccepterNetAccountIds") != null
                && !jsonObj.get("AccepterNetAccountIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `AccepterNetAccountIds` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("AccepterNetAccountIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("AccepterNetIpRanges") != null
                && !jsonObj.get("AccepterNetIpRanges").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `AccepterNetIpRanges` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("AccepterNetIpRanges").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("AccepterNetNetIds") != null
                && !jsonObj.get("AccepterNetNetIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `AccepterNetNetIds` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("AccepterNetNetIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("ExpirationDates") != null
                && !jsonObj.get("ExpirationDates").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ExpirationDates` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("ExpirationDates").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("NetPeeringIds") != null && !jsonObj.get("NetPeeringIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NetPeeringIds` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("NetPeeringIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("SourceNetAccountIds") != null
                && !jsonObj.get("SourceNetAccountIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SourceNetAccountIds` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("SourceNetAccountIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("SourceNetIpRanges") != null
                && !jsonObj.get("SourceNetIpRanges").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SourceNetIpRanges` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("SourceNetIpRanges").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("SourceNetNetIds") != null
                && !jsonObj.get("SourceNetNetIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SourceNetNetIds` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("SourceNetNetIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("StateMessages") != null && !jsonObj.get("StateMessages").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `StateMessages` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("StateMessages").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("StateNames") != null && !jsonObj.get("StateNames").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `StateNames` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("StateNames").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("TagKeys") != null && !jsonObj.get("TagKeys").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `TagKeys` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("TagKeys").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("TagValues") != null && !jsonObj.get("TagValues").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `TagValues` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("TagValues").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Tags` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("Tags").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FiltersNetPeering.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FiltersNetPeering' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FiltersNetPeering> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FiltersNetPeering.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FiltersNetPeering>() {
                        @Override
                        public void write(JsonWriter out, FiltersNetPeering value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FiltersNetPeering read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FiltersNetPeering given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FiltersNetPeering
     * @throws IOException if the JSON string is invalid with respect to FiltersNetPeering
     */
    public static FiltersNetPeering fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FiltersNetPeering.class);
    }

    /**
     * Convert an instance of FiltersNetPeering to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
