package com.empresaurios.codeteams.model.dto.dtomapper;

import com.empresaurios.codeteams.model.Projects;
import com.empresaurios.codeteams.model.dto.ProjectsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;


@Mapper
public interface IProjectsMapper {

    IProjectsMapper INSTANCE = Mappers.getMapper(IProjectsMapper.class);
    ProjectsDTO toDTO(Projects project);
    List<ProjectsDTO> toDTOList(List<Projects> projects);
    Projects toEntity(ProjectsDTO projectsDTO);

}
