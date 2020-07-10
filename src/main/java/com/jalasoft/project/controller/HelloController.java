package com.jalasoft.project.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


/**
 * @author HP
 * @version 1.1
 */
@RestController
public class HelloController {

    @PostMapping
    @RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "name") String name,
                           @RequestParam(value = "lastName") String lastName) {
        return "Hello " + name + " " + lastName;
    }

    @PostMapping
    @RequestMapping("/helloPerson")
    public String sayHello(@RequestBody Person person) {
        return "Hello " + person.name + " " + person.lastName;
    }

    @PostMapping
    @RequestMapping("/hellowithFile")
    public String sayHello(@RequestParam(value = "file") MultipartFile file) {
        return "Hello " +file.getSize();
    }


}
