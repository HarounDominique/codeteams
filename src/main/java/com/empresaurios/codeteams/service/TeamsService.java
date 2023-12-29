package com.empresaurios.codeteams.service;

import com.empresaurios.codeteams.api.ITeamsService;
import com.empresaurios.codeteams.model.Teams;
import com.empresaurios.codeteams.model.dao.ITeamsDao;
import com.empresaurios.codeteams.model.dto.TeamsDTO;
import com.empresaurios.codeteams.model.dto.dtomapper.ITeamsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TeamsService")
@Lazy
public class TeamsService implements ITeamsService {

    @Autowired
    private ITeamsDao teamsDao;
    @Override
    public TeamsDTO queryTeams(TeamsDTO teamsDTO) {
        Teams team = ITeamsMapper.INSTANCE.toEntity(teamsDTO);
        return ITeamsMapper.INSTANCE.toDTO(teamsDao.getReferenceById(team.getId()));
    }

    @Override
    public List<TeamsDTO> queryAllTeams() {
        return ITeamsMapper.INSTANCE.toDTOList(teamsDao.findAll());
    }

    @Override
    public int insertTeam(TeamsDTO teamsDTO) {
        Teams team = ITeamsMapper.INSTANCE.toEntity(teamsDTO);
        teamsDao.saveAndFlush(team);
        return team.getId();
    }

    @Override
    public int updateTeam(TeamsDTO teamsDTO) {
        return insertTeam(teamsDTO);
    }

    @Override
    public int deleteTeam(TeamsDTO teamsDTO) {
        int id = teamsDTO.getId();
        Teams team = ITeamsMapper.INSTANCE.toEntity(teamsDTO);
        teamsDao.delete(team);
        return id;
    }
}
