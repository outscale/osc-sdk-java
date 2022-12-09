package io.github.outscale.osc_sdk_java.client;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class ConfigurationFile extends ConfigurationInitializer {
    private Map<String, Profile> profiles;

    private static Path defaultConfigPath = Paths.get(System.getProperty("user.home"), ".osc", "config.json");

    public ConfigurationFile() {
    }

    public static String getDefaultConfigPath() {
        return defaultConfigPath.toString();
    }

    public static ConfigurationFile loadDefaultConfigFile() {
        return loadConfigFile(getDefaultConfigPath());
    }

    public static ConfigurationFile loadConfigFile(String path) {
        if (path == null) {
            return null;
        }

        GsonBuilder gsonBuilder = JSON.createGson();
        gsonBuilder.registerTypeAdapterFactory(
                new io.github.outscale.osc_sdk_java.client.Profile.CustomTypeAdapterFactory());
        gsonBuilder
                .registerTypeAdapterFactory(
                        new io.github.outscale.osc_sdk_java.client.Endpoint.CustomTypeAdapterFactory());
        Gson gson = gsonBuilder.create();
        ConfigurationFile configurationFile = new ConfigurationFile();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Type listType = new TypeToken<Map<String, Profile>>() {
            }.getType();
            configurationFile.profiles = gson.fromJson(br, listType);
        } catch (FileNotFoundException e) {
            System.err.println("The file is not found ");
            return null;
        } catch (IOException e) {
            System.err.println("Error during the read of the file");
            return null;
        }

        return configurationFile;
    }

    public ApiClient getApiClient(String profile) {
        if (!profiles.containsKey(profile)) {
            System.err.println("Profile was not found for creating Configuration, did you load the config file ?");
            return null;
        }
        return getApiClient(profiles.get(profile));
    }

    @Override
    public String toString() {
        return profiles.toString();
    }

}
