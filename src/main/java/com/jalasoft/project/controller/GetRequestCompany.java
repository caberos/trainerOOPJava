package com.jalasoft.project.controller;

import com.jalasoft.project.utils.mongo.ConectionDB;
import com.mongodb.DBObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetRequestCompany extends GetBuildRequest {

    @GetMapping(path="/company/getAllObjects", produces = "application/json")
    public String getAll() {
        return  ConectionDB.getInstance().getDB().getCollection("company").find().toArray().toString();
    }

    @GetMapping(path="/company/getObject/{id}", produces = "application/json")
    public int getObject(@PathVariable("id") int id) {
        List<DBObject> companies = ConectionDB.getInstance().getDB().getCollection("company").find().toArray();

        return id;
    }
}
