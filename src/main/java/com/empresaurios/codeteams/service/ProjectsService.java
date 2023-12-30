package com.empresaurios.codeteams.service;

import com.empresaurios.codeteams.api.IProjectsService;
import com.empresaurios.codeteams.model.Projects;
import com.empresaurios.codeteams.model.dao.IProjectDao;
import com.empresaurios.codeteams.model.dto.ProjectsDTO;
import com.empresaurios.codeteams.model.dto.dtomapper.IProjectsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProjectsService")
@Lazy
public class ProjectsService implements IProjectsService {

    @Autowired
    IProjectDao projectDao;


    @Override
    public ProjectsDTO queryProject(ProjectsDTO projectsDTO) {

        Projects project = IProjectsMapper.INSTANCE.toEntity(projectsDTO);

        return IProjectsMapper.INSTANCE.toDTO(projectDao.getReferenceById(project.getProject_id()));
    }

    @Override
    public List<ProjectsDTO> queryAllProjects() {
        return IProjectsMapper.INSTANCE.toDTOList(projectDao.findAll());
    }

    @Override
    public int insertProject(ProjectsDTO projectsDTO) {
       Projects project = IProjectsMapper.INSTANCE.toEntity(projectsDTO);
       projectDao.saveAndFlush(project);

       return project.getProject_id();
    }

    @Override
    public int updateProject(ProjectsDTO projectsDTO) {
        return insertProject(projectsDTO);
    }

    @Override
    public int deleteProject(ProjectsDTO projectsDTO) {
        int id = projectsDTO.getProject_id();
        Projects project = IProjectsMapper.INSTANCE.toEntity(projectsDTO);
        projectDao.delete(project);

        return id;
    }
}
