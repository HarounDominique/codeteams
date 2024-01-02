package com.empresaurios.codeteams.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user_roles")
public class UserRoles {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_role_id;
    @Column
    private int user_id;
    @Column
    private int team_id;
    @Column
    private int project_id;
    @Column
    String role;

    public int getUser_role_id() {
        return user_role_id;
    }

    public void setUser_role_id(int user_role_id) {
        this.user_role_id = user_role_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
