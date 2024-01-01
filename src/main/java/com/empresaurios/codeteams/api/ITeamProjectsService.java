package com.empresaurios.codeteams.api;

import com.empresaurios.codeteams.model.dto.TeamProjectsDTO;
import java.util.List;

public interface ITeamProjectsService {
    //CRUD OPERATIONS
    TeamProjectsDTO queryTeamProjects(TeamProjectsDTO teamProjectsDTO);
    List<TeamProjectsDTO> queryAllTeamProjects();
    int insertTeamProjects(TeamProjectsDTO teamProjectsDTO);
    int updateTeamProjects(TeamProjectsDTO teamProjectsDTO);
    int deleteTeamProjects(TeamProjectsDTO teamProjectsDTO);
}
