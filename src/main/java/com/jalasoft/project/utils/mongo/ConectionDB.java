package com.jalasoft.project.utils.mongo;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

public class ConectionDB {
    private static MongoClient mongoClient;
    private static DB database;
    private static ConectionDB instance;

    public static ConectionDB getInstance() {
        return instance==null? new ConectionDB():instance;
    }

    public static void conection(PropertiesDb propertiesDb){
        try {
            mongoClient = new MongoClient(propertiesDb.getHost(),
                    Integer.parseInt(propertiesDb.getPort()));
            database = mongoClient.getDB(propertiesDb.getDatabase());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public DB getDB() {
        return database;
    }
}
