/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.26
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
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.outscale.osc_sdk_java.client.JSON;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateAccessKeyRequestExpirationDate extends AbstractOpenApiSchema {
    private static final Logger log =
            Logger.getLogger(UpdateAccessKeyRequestExpirationDate.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateAccessKeyRequestExpirationDate.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateAccessKeyRequestExpirationDate'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<LocalDate> adapterLocalDate =
                    gson.getDelegateAdapter(this, TypeToken.get(LocalDate.class));
            final TypeAdapter<OffsetDateTime> adapterOffsetDateTime =
                    gson.getDelegateAdapter(this, TypeToken.get(OffsetDateTime.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateAccessKeyRequestExpirationDate>() {
                        @Override
                        public void write(
                                JsonWriter out, UpdateAccessKeyRequestExpirationDate value)
                                throws IOException {
                            if (value == null || value.getActualInstance() == null) {
                                elementAdapter.write(out, null);
                                return;
                            }

                            // check if the actual instance is of the type `LocalDate`
                            if (value.getActualInstance() instanceof LocalDate) {
                                JsonObject obj =
                                        adapterLocalDate
                                                .toJsonTree((LocalDate) value.getActualInstance())
                                                .getAsJsonObject();
                                elementAdapter.write(out, obj);
                                return;
                            }

                            // check if the actual instance is of the type `OffsetDateTime`
                            if (value.getActualInstance() instanceof OffsetDateTime) {
                                JsonObject obj =
                                        adapterOffsetDateTime
                                                .toJsonTree(
                                                        (OffsetDateTime) value.getActualInstance())
                                                .getAsJsonObject();
                                elementAdapter.write(out, obj);
                                return;
                            }

                            throw new IOException(
                                    "Failed to serialize as the type doesn't match oneOf schemas:"
                                            + " LocalDate, OffsetDateTime");
                        }

                        @Override
                        public UpdateAccessKeyRequestExpirationDate read(JsonReader in)
                                throws IOException {
                            Object deserialized = null;
                            JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                            int match = 0;
                            ArrayList<String> errorMessages = new ArrayList<>();
                            TypeAdapter actualAdapter = elementAdapter;

                            // deserialize LocalDate
                            try {
                                // validate the JSON object to see if any exception is thrown
                                LocalDate.validateJsonObject(jsonObject);
                                actualAdapter = adapterLocalDate;
                                match++;
                                log.log(Level.FINER, "Input data matches schema 'LocalDate'");
                            } catch (Exception e) {
                                // deserialization failed, continue
                                errorMessages.add(
                                        String.format(
                                                "Deserialization for LocalDate failed with `%s`.",
                                                e.getMessage()));
                                log.log(
                                        Level.FINER,
                                        "Input data does not match schema 'LocalDate'",
                                        e);
                            }

                            // deserialize OffsetDateTime
                            try {
                                // validate the JSON object to see if any exception is thrown
                                OffsetDateTime.validateJsonObject(jsonObject);
                                actualAdapter = adapterOffsetDateTime;
                                match++;
                                log.log(Level.FINER, "Input data matches schema 'OffsetDateTime'");
                            } catch (Exception e) {
                                // deserialization failed, continue
                                errorMessages.add(
                                        String.format(
                                                "Deserialization for OffsetDateTime failed with"
                                                        + " `%s`.",
                                                e.getMessage()));
                                log.log(
                                        Level.FINER,
                                        "Input data does not match schema 'OffsetDateTime'",
                                        e);
                            }

                            if (match == 1) {
                                UpdateAccessKeyRequestExpirationDate ret =
                                        new UpdateAccessKeyRequestExpirationDate();
                                ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                                return ret;
                            }

                            throw new IOException(
                                    String.format(
                                            "Failed deserialization for"
                                                + " UpdateAccessKeyRequestExpirationDate: %d"
                                                + " classes match result, expected 1. Detailed"
                                                + " failure message for oneOf schemas: %s. JSON:"
                                                + " %s",
                                            match, errorMessages, jsonObject.toString()));
                        }
                    }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public UpdateAccessKeyRequestExpirationDate() {
        super("oneOf", Boolean.FALSE);
    }

    public UpdateAccessKeyRequestExpirationDate(LocalDate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateAccessKeyRequestExpirationDate(OffsetDateTime o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("LocalDate", new GenericType<LocalDate>() {});
        schemas.put("OffsetDateTime", new GenericType<OffsetDateTime>() {});
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return UpdateAccessKeyRequestExpirationDate.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check the instance parameter is valid
     * against the oneOf child schemas: LocalDate, OffsetDateTime
     *
     * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be
     * a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof LocalDate) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof OffsetDateTime) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be LocalDate, OffsetDateTime");
    }

    /**
     * Get the actual instance, which can be the following: LocalDate, OffsetDateTime
     *
     * @return The actual instance (LocalDate, OffsetDateTime)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `LocalDate`. If the actual instance is not `LocalDate`, the
     * ClassCastException will be thrown.
     *
     * @return The actual instance of `LocalDate`
     * @throws ClassCastException if the instance is not `LocalDate`
     */
    public LocalDate getLocalDate() throws ClassCastException {
        return (LocalDate) super.getActualInstance();
    }

    /**
     * Get the actual instance of `OffsetDateTime`. If the actual instance is not `OffsetDateTime`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OffsetDateTime`
     * @throws ClassCastException if the instance is not `OffsetDateTime`
     */
    public OffsetDateTime getOffsetDateTime() throws ClassCastException {
        return (OffsetDateTime) super.getActualInstance();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to
     *     UpdateAccessKeyRequestExpirationDate
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with LocalDate
        try {
            LocalDate.validateJsonObject(jsonObj);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(
                    String.format(
                            "Deserialization for LocalDate failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with OffsetDateTime
        try {
            OffsetDateTime.validateJsonObject(jsonObj);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(
                    String.format(
                            "Deserialization for OffsetDateTime failed with `%s`.",
                            e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(
                    String.format(
                            "The JSON string is invalid for UpdateAccessKeyRequestExpirationDate"
                                    + " with oneOf schemas: LocalDate, OffsetDateTime. %d class(es)"
                                    + " match the result, expected 1. Detailed failure message for"
                                    + " oneOf schemas: %s. JSON: %s",
                            validCount, errorMessages, jsonObj.toString()));
        }
    }

    /**
     * Create an instance of UpdateAccessKeyRequestExpirationDate given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateAccessKeyRequestExpirationDate
     * @throws IOException if the JSON string is invalid with respect to
     *     UpdateAccessKeyRequestExpirationDate
     */
    public static UpdateAccessKeyRequestExpirationDate fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateAccessKeyRequestExpirationDate.class);
    }

    /**
     * Convert an instance of UpdateAccessKeyRequestExpirationDate to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
