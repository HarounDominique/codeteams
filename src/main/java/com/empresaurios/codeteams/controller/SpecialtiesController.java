package com.empresaurios.codeteams.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/specialties")
public class SpecialtiesController {
    @GetMapping
    public String testController(){
        return "Specialties controller works!";
    }
}
