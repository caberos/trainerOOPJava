package com.jalasoft.project.utils.mongo;

import java.util.Properties;

public class PropertiesDb {

    private String password;
    private String authetication;
    private String javaVersion;
    private String database;
    private String port;
    private String username;
    private String host;

    public String getPassword() {
        return password;
    }

    public String getAuthetication() {
        return authetication;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public String getDatabase() {
        return database;
    }

    public String getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    public String getHost() {
        return host;
    }

    public void load(Properties data) {
        password =data.getProperty("mongodb.password");
        authetication =data.getProperty("mongodb.authentication-database");
        database =data.getProperty("mongodb.database");
        javaVersion =data.getProperty("mongodb.javaVersion");
        port =data.getProperty("mongodb.port");
        username =data.getProperty("mongodb.username");
        host =data.getProperty("mongodb.host");

    }
}
