package com.jalasoft.project.controller;

import com.jalasoft.project.controller.entity.Entity;
import com.jalasoft.project.utils.mongo.ConectionDB;
import com.mongodb.WriteConcern;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostRequestCompany extends PostBuildRequest{

    @Override
    @PostMapping("/company/add")
    public void add(Entity entity) {
        ConectionDB.getInstance().getDB().
                getCollection("company").insert(WriteConcern.valueOf(gson.toJson(entity)));
        System.out.println("company add"+ entity.getName());
    }
}
