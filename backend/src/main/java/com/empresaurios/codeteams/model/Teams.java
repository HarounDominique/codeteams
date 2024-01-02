package com.empresaurios.codeteams.model;

import jakarta.persistence.*;

@Entity
@Table(name = "teams")
public class Teams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int team_id;

    @Column
    private String name;

    @Column
    private int project_id;

    public int getId() {
        return team_id;
    }

    public void setId(int id) {
        this.team_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }
}
