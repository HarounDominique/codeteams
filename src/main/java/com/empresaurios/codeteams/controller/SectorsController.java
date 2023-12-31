package com.empresaurios.codeteams.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/sectors")
public class SectorsController {
    @GetMapping
    public String testController(){
        return "Sectors controller works!";
    }
}
