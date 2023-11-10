package com.winjigo.utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertiesConfig {
    private Properties properties;
    private String configFilePath;

    public PropertiesConfig(String configFilePath) throws IOException {
        this.configFilePath = configFilePath;
        setConfigProperties();
    }

    private void setConfigProperties() throws IOException {
        properties = new Properties();
        properties.load(Files.newInputStream(Paths.get(configFilePath)));
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
