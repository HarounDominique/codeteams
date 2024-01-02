package com.empresaurios.codeteams.service;

import com.empresaurios.codeteams.api.ITeamProjectsService;
import com.empresaurios.codeteams.model.TeamProjects;
import com.empresaurios.codeteams.model.TeamUsers;
import com.empresaurios.codeteams.model.dao.ITeamProjectsDao;
import com.empresaurios.codeteams.model.dto.TeamProjectsDTO;
import com.empresaurios.codeteams.model.dto.dtomapper.ITeamProjectsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TeamProjectsService")
@Lazy
public class TeamProjectsService implements ITeamProjectsService {
    @Autowired
    private ITeamProjectsDao teamProjectsDao;
    @Override
    public TeamProjectsDTO queryTeamProjects(TeamProjectsDTO teamProjectsDTO) {
        TeamProjects teamProjects = ITeamProjectsMapper.INSTANCE.toEntity(teamProjectsDTO);
        return ITeamProjectsMapper.INSTANCE.toDTO(teamProjectsDao.getReferenceById(teamProjects.getTeam_project_id()));
    }

    @Override
    public List<TeamProjectsDTO> queryAllTeamProjects() {
        return ITeamProjectsMapper.INSTANCE.toDTOList(teamProjectsDao.findAll());
    }

    @Override
    public int insertTeamProjects(TeamProjectsDTO teamProjectsDTO) {
        TeamProjects teamProjects = ITeamProjectsMapper.INSTANCE.toEntity(teamProjectsDTO);
        teamProjectsDao.saveAndFlush(teamProjects);
        return teamProjects.getTeam_project_id();
    }

    @Override
    public int updateTeamProjects(TeamProjectsDTO teamProjectsDTO) {
        return insertTeamProjects(teamProjectsDTO);
    }

    @Override
    public int deleteTeamProjects(TeamProjectsDTO teamProjectsDTO) {
        int exitCode = 0;
        try {
            TeamProjects teamProjects = ITeamProjectsMapper.INSTANCE.toEntity(teamProjectsDTO);
            teamProjectsDao.delete(teamProjects);
            exitCode = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return exitCode;
    }
}
