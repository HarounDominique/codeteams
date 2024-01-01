package com.empresaurios.codeteams.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/teamProjects")
public class TeamProjectsController {
    @GetMapping
    public String testController(){
        return "TeamProjects controller works!";
    }
}
