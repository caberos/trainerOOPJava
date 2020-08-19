package com.jalasoft.project.utils.mongo;

import org.junit.After;
import org.junit.Test;

import javax.validation.constraints.AssertTrue;

import java.util.Properties;

import static org.junit.Assert.*;

public class TestMongo {

    @Test
    public void testConnect() {
        ReadFileProperties.readProperties();
        Properties file = ReadFileProperties.getProperties();
        PropertiesDb propertiesDb = new PropertiesDb();
        propertiesDb.load(file);
        ConectionDB conectionDB = ConectionDB.getInstance();
        ConectionDB.conection(propertiesDb);
        assertEquals(conectionDB.getDB().getName(), "test_db");
    }

    @Test
    public void testNumberDB() {
        ReadFileProperties.readProperties();
        Properties file = ReadFileProperties.getProperties();
        PropertiesDb propertiesDb = new PropertiesDb();
        propertiesDb.load(file);
        ConectionDB conectionDB = ConectionDB.getInstance();
        ConectionDB.conection(propertiesDb);
        assertNotNull(conectionDB.getDB().getCollectionNames());
    }

    @Test
    public void testCompanyCollection() {
        ReadFileProperties.readProperties();
        Properties file = ReadFileProperties.getProperties();
        PropertiesDb propertiesDb = new PropertiesDb();
        propertiesDb.load(file);
        ConectionDB conectionDB = ConectionDB.getInstance();
        ConectionDB.conection(propertiesDb);
        assertEquals(conectionDB.getDB().getCollection("company").toString(),"company");
    }
}
