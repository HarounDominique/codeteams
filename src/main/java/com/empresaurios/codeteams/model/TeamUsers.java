package com.empresaurios.codeteams.model;

import jakarta.persistence.*;

@Entity
@Table(name = "team_users")
public class TeamUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int team_user_id;
    @Column
    private int user_id;
    @Column
    private int team_id;

    public int getTeam_user_id() {
        return team_user_id;
    }

    public void setTeam_user_id(int team_user_id) {
        this.team_user_id = team_user_id;
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
}
