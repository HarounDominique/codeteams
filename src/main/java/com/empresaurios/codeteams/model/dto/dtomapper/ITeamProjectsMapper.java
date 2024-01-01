package com.empresaurios.codeteams.model.dto.dtomapper;

import com.empresaurios.codeteams.model.TeamProjects;
import com.empresaurios.codeteams.model.dto.TeamProjectsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface ITeamProjectsMapper {
    ITeamProjectsMapper INSTANCE = Mappers.getMapper(ITeamProjectsMapper.class);
    TeamProjectsDTO toDTO(TeamProjects teamProjects);
    List<TeamProjectsDTO> toDTOList(List<TeamProjects> teamProjectsList);
    TeamProjects toEntity(TeamProjectsDTO teamProjectsDTO);
}
