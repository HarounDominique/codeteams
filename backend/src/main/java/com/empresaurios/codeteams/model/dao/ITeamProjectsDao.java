package com.empresaurios.codeteams.model.dao;

import com.empresaurios.codeteams.model.TeamProjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeamProjectsDao extends JpaRepository<TeamProjects, Integer> {
}
