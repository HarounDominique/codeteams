package com.empresaurios.codeteams.controller;


import com.empresaurios.codeteams.api.IProjectsService;
import com.empresaurios.codeteams.model.dto.ProjectsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/projects")
public class ProjectsController {

    @Autowired
    private IProjectsService projectsService;

    @GetMapping
    public String testController(){
        return "Projects controller works baby!";
    }

    @PostMapping(value = "/get")
    public ProjectsDTO queryProject (@RequestBody ProjectsDTO projectsDTO) { return projectsService.queryProject(projectsDTO);}

    @GetMapping(value ="/getAll")
    public List<ProjectsDTO> queryAllProjects() { return projectsService.queryAllProjects();}

    @PostMapping(value = "/add")
    public int addProject (@RequestBody ProjectsDTO projectsDTO) { return projectsService.insertProject(projectsDTO);}

    @PutMapping(value = "/update")
    public int updateProject (@RequestBody ProjectsDTO projectsDTO) { return projectsService.updateProject(projectsDTO);}

    @DeleteMapping(value = "/delete")
    public int deleteProject (@RequestBody ProjectsDTO projectsDTO) { return projectsService.deleteProject(projectsDTO);}

}
