package com.empresaurios.codeteams.model.dto;

public class TeamProjectsDTO {
    private int team_project_id;
    private int project_id;
    private int team_id;

    public int getTeam_project_id() {
        return team_project_id;
    }

    public void setTeam_project_id(int team_project_id) {
        this.team_project_id = team_project_id;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }
}
