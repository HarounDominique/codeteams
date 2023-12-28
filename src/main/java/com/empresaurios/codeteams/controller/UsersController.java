package com.empresaurios.codeteams.controller;

import com.empresaurios.codeteams.api.IUsersService;
import com.empresaurios.codeteams.model.dto.UsersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController()
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private IUsersService usersService;



    @GetMapping
    public String testController(){
        return "Users controller works baby!";
    }

    @PostMapping(value = "/get")
    public UsersDTO queryUser (@RequestBody UsersDTO usersDTO) { return usersService.queryUser(usersDTO);}

    @GetMapping(value ="/getAll")
    public List<UsersDTO> queryAllUsers() { return usersService.queryAllUsers();}

    @PostMapping(value = "/add")
    public int addUser (@RequestBody UsersDTO usersDTO) { return usersService.insertUser(usersDTO);}

    @PutMapping(value = "/update")
    public int updateUser (@RequestBody UsersDTO usersDTO) { return usersService.updateUser(usersDTO);}

    @DeleteMapping(value = "/delete")
    public int deleteUser (@RequestBody UsersDTO usersDTO) { return usersService.deleteUser(usersDTO);}

}
