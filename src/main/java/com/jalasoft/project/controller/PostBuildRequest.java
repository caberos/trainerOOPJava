package com.jalasoft.project.controller;

import com.jalasoft.project.controller.entity.Entity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public abstract class PostBuildRequest extends BuildRequest {

    @PostMapping
    @RequestMapping("/add")
    public abstract void add(@RequestBody Entity entity) ;
}
