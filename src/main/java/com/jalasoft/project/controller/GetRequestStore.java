package com.jalasoft.project.controller;

import com.jalasoft.project.utils.mongo.ConectionDB;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetRequestStore extends GetBuildRequest {

    @GetMapping(path="/store/getAllObjects", produces = "application/json")
    public String getAll() {
        return  ConectionDB.getInstance().getDB().getCollection("store").find().toArray().toString();
    }

    @Override
    public int getObject(int id) {
        return 1;
    }
}
