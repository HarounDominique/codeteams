package com.empresaurios.codeteams.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/userRoles")
public class UserRolesController {
    @GetMapping
    public String testController(){
        return "UserRoles controller works!";
    }
}
