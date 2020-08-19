package com.jalasoft.project;

import com.jalasoft.project.utils.mongo.ConectionDB;
import com.jalasoft.project.utils.mongo.PropertiesDb;
import com.jalasoft.project.utils.mongo.ReadFileProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

/**
 * @author HP
 * @version 1.1
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello.");
        ReadFileProperties.readProperties();
        Properties file = ReadFileProperties.getProperties();
        PropertiesDb propertiesDb = new PropertiesDb();
        propertiesDb.load(file);
        ConectionDB conectionDB = ConectionDB.getInstance();
        ConectionDB.conection(propertiesDb);
        SpringApplication.run(Main.class, args);
    }
}
