package oop.homeWork15;

import java.io.IOException;
import java.util.Properties;

public class HillelTestingPageConfigProvider {

    private static final Properties properties = initProperties();
    public static final String TESTING_URL = properties.getProperty("testing.url");

    public static Properties initProperties(){
        Properties properties = new Properties();
        try {
            properties.load(ClassLoader.getSystemResourceAsStream("config.properties"));
        } catch (IOException e) {
            System.err.println("Could not load properties.");
        }

        return properties;
    }
}
