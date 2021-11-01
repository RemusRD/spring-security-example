package com.db.springlogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PetController {

    @GetMapping("/pets/{id}")
    public String home(@PathVariable String id) {
        return ("<h1>You can see pet Id "+id+"</h1>");
    }

    @GetMapping("/shelters/{id}")
    public String getShelterById(@PathVariable String id) {
        return ("<h1>You can see pet Id "+id+"</h1>");
    }
}
