package com.jalasoft.project.controller;

import com.jalasoft.project.controller.entity.Entity;
import com.jalasoft.project.utils.mongo.ConectionDB;
import com.mongodb.WriteConcern;
import org.springframework.web.bind.annotation.PostMapping;

public class PostRequestStore extends PostBuildRequest {
    @Override
    @PostMapping("/store/add")
    public void add(Entity entity) {
        ConectionDB.getInstance().getDB().
                getCollection("store").insert(WriteConcern.valueOf(gson.toJson(entity)));
        System.out.println("store add"+ entity.getName());
    }
}
