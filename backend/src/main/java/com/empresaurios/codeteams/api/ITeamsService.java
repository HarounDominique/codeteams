package com.empresaurios.codeteams.api;

import com.empresaurios.codeteams.model.dto.TeamsDTO;
import java.util.List;

public interface ITeamsService {
    //CRUD Operations
    TeamsDTO queryTeams(TeamsDTO teamsDTO);
    List<TeamsDTO> queryAllTeams();
    int insertTeam(TeamsDTO teamsDTO);
    int updateTeam(TeamsDTO teamsDTO);
    int deleteTeam(TeamsDTO teamsDTO);
}
