/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> Throttling: To protect against overloads, the number of identical requests allowed in a given time period is limited.<br /> Brute force: To protect against brute force attacks, the number of failed authentication attempts in a given time period is limited.<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/About-the-APIs.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).<br /> # Authentication Schemes ### Access Key/Secret Key The main way to authenticate your requests to the OUTSCALE API is to use an access key and a secret key.<br /> The mechanism behind this is based on AWS Signature Version 4, whose technical implementation details are described in [Signature of API Requests](https://docs.outscale.com/en/userguide/Signature-of-API-Requests.html).<br /><br /> In practice, the way to specify your access key and secret key depends on the tool or SDK you want to use to interact with the API.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify your access key, secret key, and the Region of your account. > 2. You then specify the `--profile` option when executing OSC CLI commands. >  > For more information, see [Installing and Configuring OSC CLI](https://docs.outscale.com/en/userguide/Installing-and-Configuring-OSC-CLI.html).  See the code samples in each section of this documentation for specific examples in different programming languages.<br /> For more information about access keys, see [About Access Keys](https://docs.outscale.com/en/userguide/About-Access-Keys.html).  > If you try to sign requests with an invalid access key four times in a row, further authentication attempts will be prevented for 1 minute. This lockout time increases 1 minute every four failed attempts, for up to 10 minutes.  ### Login/Password For certain API actions, you can also use basic authentication with the login (email address) and password of your TINA account.<br /> This is useful only in special circumstances, for example if you do not know your access key/secret key and want to retrieve them programmatically.<br /> In most cases, however, you can use the Cockpit web interface to retrieve them.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify the Region of your account, but you leave the access key value and secret key value empty (`&quot;&quot;`). > 2. You then specify the `--profile`, `--authentication-method`, `--login`, and `--password` options when executing OSC CLI commands.  See the code samples in each section of this documentation for specific examples in different programming languages.  > If you try to sign requests with an invalid password four times in a row, further authentication attempts will be prevented for 1 minute. This lockout time increases 1 minute every four failed attempts, for up to 10 minutes.  ### No Authentication A few API actions do not require any authentication. They are indicated as such in this documentation.<br /> ### Other Security Mechanisms In parallel with the authentication schemes, you can add other security mechanisms to your OUTSCALE account, for example to restrict API requests by IP or other criteria.<br /> For more information, see [Managing Your API Accesses](https://docs.outscale.com/en/userguide/Managing-Your-API-Accesses.html).<br /> # Error Codes Reference You can learn more about errors returned by the API in the dedicated [errors page](api-errors.html).
 *
 * The version of the OpenAPI document: 1.30.0
 * Contact: support@outscale.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.outscale.osc_sdk_java.client.model;

import java.util.Map;
import java.util.Objects;
import javax.ws.rs.core.GenericType;

// import com.fasterxml.jackson.annotation.JsonValue;

/** Abstract class for oneOf,anyOf schemas defined in OpenAPI spec */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public abstract class AbstractOpenApiSchema {

    // store the actual instance of the schema/object
    private Object instance;

    // is nullable
    private Boolean isNullable;

    // schema type (e.g. oneOf, anyOf)
    private final String schemaType;

    public AbstractOpenApiSchema(String schemaType, Boolean isNullable) {
        this.schemaType = schemaType;
        this.isNullable = isNullable;
    }

    /**
     * Get the list of oneOf/anyOf composed schemas allowed to be stored in this object
     *
     * @return an instance of the actual schema/object
     */
    public abstract Map<String, GenericType> getSchemas();

    /**
     * Get the actual instance
     *
     * @return an instance of the actual schema/object
     */
    // @JsonValue
    public Object getActualInstance() {
        return instance;
    }

    /**
     * Set the actual instance
     *
     * @param instance the actual instance of the schema/object
     */
    public void setActualInstance(Object instance) {
        this.instance = instance;
    }

    /**
     * Get the instant recursively when the schemas defined in oneOf/anyof happen to be oneOf/anyOf
     * schema as well
     *
     * @return an instance of the actual schema/object
     */
    public Object getActualInstanceRecursively() {
        return getActualInstanceRecursively(this);
    }

    private Object getActualInstanceRecursively(AbstractOpenApiSchema object) {
        if (object.getActualInstance() == null) {
            return null;
        } else if (object.getActualInstance() instanceof AbstractOpenApiSchema) {
            return getActualInstanceRecursively((AbstractOpenApiSchema) object.getActualInstance());
        } else {
            return object.getActualInstance();
        }
    }

    /**
     * Get the schema type (e.g. anyOf, oneOf)
     *
     * @return the schema type
     */
    public String getSchemaType() {
        return schemaType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ").append(getClass()).append(" {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    isNullable: ").append(toIndentedString(isNullable)).append("\n");
        sb.append("    schemaType: ").append(toIndentedString(schemaType)).append("\n");
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

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractOpenApiSchema a = (AbstractOpenApiSchema) o;
        return Objects.equals(this.instance, a.instance)
                && Objects.equals(this.isNullable, a.isNullable)
                && Objects.equals(this.schemaType, a.schemaType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance, isNullable, schemaType);
    }

    /**
     * Is nullable
     *
     * @return true if it's nullable
     */
    public Boolean isNullable() {
        if (Boolean.TRUE.equals(isNullable)) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
}
