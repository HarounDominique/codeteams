package com.empresaurios.codeteams.model.dto.dtomapper;

import com.empresaurios.codeteams.model.Teams;
import com.empresaurios.codeteams.model.dto.TeamsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ITeamsMapper {
    ITeamsMapper INSTANCE = Mappers.getMapper(ITeamsMapper.class);
    TeamsDTO toDTO(Teams team);
    List<TeamsDTO> toDTOList(List<Teams> teams);
    Teams toEntity(TeamsDTO teamsDTO);
}
