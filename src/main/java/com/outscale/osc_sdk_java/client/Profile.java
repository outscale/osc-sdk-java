package com.outscale.osc_sdk_java.client;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class Profile {
    public static final String SERIALIZED_NAME_ACCESS_KEY = "access_key";
    @SerializedName(SERIALIZED_NAME_ACCESS_KEY)
    private String accessKey;

    public static final String SERIALIZED_NAME_SECRET_KEY = "secret_key";
    @SerializedName(SERIALIZED_NAME_SECRET_KEY)
    private String secretKey;

    public static final String SERIALIZED_NAME_X509_CLIENT_CERT = "x509_client_cert";
    @SerializedName(SERIALIZED_NAME_X509_CLIENT_CERT)
    private String x509ClientCert;

    public static final String SERIALIZED_NAME_X509_CLIENT_CERT_B64 = "x509_client_cert_b64";
    @SerializedName(SERIALIZED_NAME_X509_CLIENT_CERT_B64)
    private String x509ClientCertB64;

    public static final String SERIALIZED_NAME_X509_CLIENT_KEY = "x509_client_key";
    @SerializedName(SERIALIZED_NAME_X509_CLIENT_KEY)
    private String x509ClientKey;

    public static final String SERIALIZED_NAME_X509_CLIENT_KEY_B64 = "x509_client_key_b64";
    @SerializedName(SERIALIZED_NAME_X509_CLIENT_KEY_B64)
    private String x509ClientKeyB64;

    public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
    @SerializedName(SERIALIZED_NAME_PROTOCOL)
    private String protocol;

    public static final String SERIALIZED_NAME_METHOD = "method";
    @SerializedName(SERIALIZED_NAME_METHOD)
    private String method;

    public static final String SERIALIZED_NAME_REGION = "region";
    @SerializedName(SERIALIZED_NAME_REGION)
    private String region;

    public static final String SERIALIZED_NAME_ENDPOINTS = "endpoints";
    @SerializedName(SERIALIZED_NAME_ENDPOINTS)
    private Endpoint endpoints;

    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Profile.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Profile' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Profile> thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(Profile.class));

            return (TypeAdapter<T>) new TypeAdapter<Profile>() {
                @Override
                public void write(JsonWriter out, Profile value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public Profile read(JsonReader in) throws IOException {
                    JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                    return thisAdapter.fromJsonTree(jsonObj);
                }

            }.nullSafe();
        }
    }

    /**
     * Create an instance of Profile given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Profile
     * @throws IOException if the JSON string is invalid with respect to
     *                     AcceptNetPeeringRequest
     */
    public static Profile fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Profile.class);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Profile {\n");
        sb.append("    accessKey: ").append(accessKey).append("\n");
        sb.append("    secretKey: ").append(secretKey).append("\n");
        sb.append("    region: ").append(region).append("\n");
        sb.append("    x509ClientCert: ").append(x509ClientCert).append("\n");
        sb.append("    x509ClientCertB64: ").append(x509ClientCertB64).append("\n");
        sb.append("    x509ClientKey: ").append(x509ClientKey).append("\n");
        sb.append("    x509ClientKeyB64: ").append(x509ClientKeyB64).append("\n");
        sb.append("    method: ").append(method).append("\n");
        sb.append("    protocol: ").append(protocol).append("\n");
        sb.append("    endpoints: ").append(endpoints).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public Endpoint getEndpoints() {
        return endpoints;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public String getMethod() {
        return method;
    }

    public String getRegion() {
        return region;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public String getX509ClientCert() {
        return x509ClientCert;
    }

    public String getX509ClientCertB64() {
        return x509ClientCertB64;
    }

    public String getX509ClientKey() {
        return x509ClientKey;
    }

    public String getX509ClientKeyB64() {
        return x509ClientKeyB64;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public void setEndpoints(Endpoint endpoints) {
        this.endpoints = endpoints;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public void setX509ClientCert(String x509ClientCert) {
        this.x509ClientCert = x509ClientCert;
    }

    public void setX509ClientCertB64(String x509ClientCertB64) {
        this.x509ClientCertB64 = x509ClientCertB64;
    }

    public void setX509ClientKey(String x509ClientKey) {
        this.x509ClientKey = x509ClientKey;
    }

    public void setX509ClientKeyB64(String x509ClientKeyB64) {
        this.x509ClientKeyB64 = x509ClientKeyB64;
    }
}
