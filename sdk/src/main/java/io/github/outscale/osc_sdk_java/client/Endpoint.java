package io.github.outscale.osc_sdk_java.client;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public class Endpoint {

    public static final String SERIALIZED_NAME_API = "api";

    @SerializedName(SERIALIZED_NAME_API)
    private String api;

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Endpoint.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'VpnOptions' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Endpoint> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Endpoint.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Endpoint>() {
                        @Override
                        public void write(JsonWriter out, Endpoint value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Endpoint read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Endpoint given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Profile
     * @throws IOException if the JSON string is invalid with respect to AcceptNetPeeringRequest
     */
    public static Endpoint fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Endpoint.class);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Endpoint {\n");
        sb.append("    api: ").append(api).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }
}
