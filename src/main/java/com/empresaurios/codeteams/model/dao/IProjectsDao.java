package com.empresaurios.codeteams.model.dao;

import com.empresaurios.codeteams.model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProjectsDao extends JpaRepository<Projects, Integer> {
}
