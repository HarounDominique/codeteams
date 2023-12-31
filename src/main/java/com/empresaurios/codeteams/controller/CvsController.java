package com.empresaurios.codeteams.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/cvs")
public class CvsController {
    @GetMapping
    public String testController(){
        return "Cvs controller works!";
    }

}
