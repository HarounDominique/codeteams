package com.empresaurios.codeteams.api;



import com.empresaurios.codeteams.model.dto.ProjectsDTO;

import java.util.List;

public interface IProjectsService {

    //CRUD operations

    ProjectsDTO queryProject (ProjectsDTO projectsDTO);
    List<ProjectsDTO> queryAllProjects();
    int insertProject (ProjectsDTO projectsDTO);
    int updateProject (ProjectsDTO projectsDTO);
    int deleteProject (ProjectsDTO projectsDTO);

}
