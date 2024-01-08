package com.empresaurios.codeteams.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/teamUsers")
public class TeamUsersController {
    @GetMapping
    public String testController(){
        return "TeamUsers controller works!";
    }
}
