package oop.homeWork14;

import java.io.IOException;
import java.util.Properties;

public class HillelConfigProvider {

    private static final Properties properties = initProperties();
    public static final String BASE_URL = properties.getProperty("base.url");

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
