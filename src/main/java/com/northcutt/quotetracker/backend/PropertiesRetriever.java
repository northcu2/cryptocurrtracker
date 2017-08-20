package com.northcutt.quotetracker.backend;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesRetriever {

    private Properties properties;
    private InputStream input;
    ClassLoader loader;

    public PropertiesRetriever() {
        this.loader = Thread.currentThread().getContextClassLoader();
        this.properties = new Properties();
        this.input = null;
        
    }

    public String getValue(String key) {
        String value = null;
        try {
            input = loader.getResourceAsStream("config.properties");
            properties.load(input);
            value = properties.getProperty(key);
            if (value == null) {
                System.out.println("ERROR: Could not find key in config file!");
                return value;
            }
            return value;
        } catch (IOException e) {
            System.out.println("ERROR: Could not find properties file!");
            e.printStackTrace();
            return null;
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Could not close property file stream!");
                    e.printStackTrace();
                }
            }
        }


    }
}
