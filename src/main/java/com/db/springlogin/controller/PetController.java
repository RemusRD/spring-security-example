package com.db.springlogin.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PetController {

    @ApiOperation(value = "Update registration detail",
            authorizations = { @Authorization(value="basicAuth") })
    @GetMapping("/pets/{id}")
    public String home(@PathVariable String id) {
        return ("<h1>You can see pet Id "+id+"</h1>");
    }


    @ApiOperation(value = "Update registration detail",
            authorizations = { @Authorization(value="basicAuth") })
    @GetMapping("/shelters/{id}")
    public String getShelterById(@PathVariable String id) {
        return ("<h1>You can see pet Id "+id+"</h1>");
    }

    @ApiOperation(value = "Update registration detail",
            authorizations = { @Authorization(value="basicAuth") })
    @PostMapping("/shelters/{id}")
    public String postShelterById(@PathVariable String id) {
        return ("<h1>You can see pet Id "+id+"</h1>");
    }


}
