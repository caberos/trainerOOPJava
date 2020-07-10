package com.jalasoft.project.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author HP
 * @version 1.1
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @PostMapping
    public String sayHello(@RequestParam(value = "name") String name,
                           @RequestParam(value = "lastName") String lastName) {
        return "Hello " + name + " " + lastName;
    }

    @PostMapping
    public Person sayHelloFile(@RequestBody Person person){
        return person;
    }

}
