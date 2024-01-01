package com.empresaurios.codeteams.model.dto.dtomapper;

import com.empresaurios.codeteams.model.TeamUsers;
import com.empresaurios.codeteams.model.dto.TeamUsersDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ITeamUsersMapper {
    ITeamUsersMapper INSTANCE = Mappers.getMapper(ITeamUsersMapper.class);
    TeamUsersDTO toDTO(TeamUsers teamUsers);
    List<TeamUsersDTO> toDTOList(List<TeamUsers> teamUsersList);
    TeamUsers toEntity(TeamUsersDTO teamUsersDTO);
}
