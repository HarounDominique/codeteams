package com.empresaurios.codeteams.service;

import com.empresaurios.codeteams.api.ITeamUsersService;
import com.empresaurios.codeteams.model.TeamUsers;
import com.empresaurios.codeteams.model.dao.ITeamUsersDao;
import com.empresaurios.codeteams.model.dto.TeamUsersDTO;
import com.empresaurios.codeteams.model.dto.dtomapper.ITeamUsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TeamUsersService")
@Lazy
public class TeamUsersService implements ITeamUsersService {
    @Autowired
    private ITeamUsersDao teamUsersDao;
    @Override
    public TeamUsersDTO queryTeamUsers(TeamUsersDTO teamUsersDTO) {
        TeamUsers teamUsers = ITeamUsersMapper.INSTANCE.toEntity(teamUsersDTO);
        return ITeamUsersMapper.INSTANCE.toDTO(teamUsersDao.getReferenceById(teamUsers.getTeam_user_id()));
    }

    @Override
    public List<TeamUsersDTO> queryAllTeamUsers() {
        return ITeamUsersMapper.INSTANCE.toDTOList(teamUsersDao.findAll());
    }

    @Override
    public int insertTeamUsers(TeamUsersDTO teamUsersDTO) {
        TeamUsers teamUsers = ITeamUsersMapper.INSTANCE.toEntity(teamUsersDTO);
        teamUsersDao.saveAndFlush(teamUsers);
        return teamUsers.getTeam_user_id();
    }

    @Override
    public int updateTeamUsers(TeamUsersDTO teamUsersDTO) {
        return insertTeamUsers(teamUsersDTO);
    }

    @Override
    public int deleteTeamUsers(TeamUsersDTO teamUsersDTO) {
        int exitCode = 0;
        try {
            TeamUsers teamUsers = ITeamUsersMapper.INSTANCE.toEntity(teamUsersDTO);
            teamUsersDao.delete(teamUsers);
            exitCode = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return exitCode;
    }
}
