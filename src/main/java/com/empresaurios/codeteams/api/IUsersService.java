package com.empresaurios.codeteams.api;

import com.empresaurios.codeteams.model.dto.UsersDTO;

import java.util.List;

public interface IUsersService {

    //CRUD operations

    UsersDTO queryUser (UsersDTO usersDTO);
    List <UsersDTO> queryAllUsers();
    int insertUser (UsersDTO usersDTO);
    int updateUser (UsersDTO usersDTO);
    int deleteUser (UsersDTO usersDTO);

}
