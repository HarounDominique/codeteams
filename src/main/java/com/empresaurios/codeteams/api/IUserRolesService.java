package com.empresaurios.codeteams.api;

import com.empresaurios.codeteams.model.dto.UserRolesDTO;

import java.util.List;

public interface IUserRolesService {
    //CRUD OPERATIONS
    UserRolesDTO queryUserRole(UserRolesDTO userRolesDTO);
    List<UserRolesDTO> queryAllUserRoles();
    int insertUserRole(UserRolesDTO userRolesDTO);
    int updateUserRole(UserRolesDTO userRolesDTO);
    int deleteUserRole(UserRolesDTO userRolesDTO);
}
