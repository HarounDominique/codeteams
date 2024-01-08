package com.empresaurios.codeteams.controller;

import com.empresaurios.codeteams.api.ITeamsService;
import com.empresaurios.codeteams.model.dto.TeamsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/teams")
public class TeamsController {
    @GetMapping
    public String testController(){
        return "Teams controller works bitches!";

    }

    @Autowired
    private ITeamsService teamsService;

    @PostMapping(value = "/get")
    public TeamsDTO queryTeam(@RequestBody TeamsDTO teamsDTO){
        return teamsService.queryTeams(teamsDTO);
    }

    @GetMapping(value = "/getAll")
    public List<TeamsDTO> queryAllTeams(){
        return teamsService.queryAllTeams();
    }

    @PostMapping(value = "/add")
    public int addTeam(@RequestBody TeamsDTO teamsDTO){
        return teamsService.insertTeam(teamsDTO);
    }

    @PutMapping(value="/update")
    public int updateTeam(@RequestBody TeamsDTO teamsDTO){
        return teamsService.updateTeam(teamsDTO);
    }

    @DeleteMapping(value="/delete")
    public int deleteTeam(@RequestBody TeamsDTO teamsDTO){
        return teamsService.deleteTeam(teamsDTO);
    }
}
