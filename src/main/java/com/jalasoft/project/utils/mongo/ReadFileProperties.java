package com.jalasoft.project.utils.mongo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFileProperties {
    static FileInputStream fileInput;
    private static Properties properties;
    public static void readProperties(){
        try {
            File file = new File(System.getProperty("user.dir")+"/properties.properties");
            fileInput = new FileInputStream(file);
            properties = new Properties();
            properties.load(fileInput);
            fileInput.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Properties getProperties() {
        return properties;
    }
}
