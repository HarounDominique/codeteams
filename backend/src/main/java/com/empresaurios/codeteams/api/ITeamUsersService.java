package com.empresaurios.codeteams.api;

import com.empresaurios.codeteams.model.dto.TeamUsersDTO;

import java.util.List;

public interface ITeamUsersService {
    //CRUD OPERATIONS
    TeamUsersDTO queryTeamUsers(TeamUsersDTO teamUsersDTO);
    List<TeamUsersDTO> queryAllTeamUsers();
    int insertTeamUsers(TeamUsersDTO teamUsersDTO);
    int updateTeamUsers(TeamUsersDTO teamUsersDTO);
    int deleteTeamUsers(TeamUsersDTO teamUsersDTO);
}
