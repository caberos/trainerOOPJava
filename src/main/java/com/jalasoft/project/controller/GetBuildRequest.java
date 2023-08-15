package com.jalasoft.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class GetBuildRequest extends BuildRequest {

    @GetMapping(path="/getAllObjects", produces = "application/json")
    public abstract String getAll();

    public abstract int getObject(@PathVariable("id") int id) ;
}
