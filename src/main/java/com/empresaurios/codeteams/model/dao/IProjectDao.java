package com.empresaurios.codeteams.model.dao;

import com.empresaurios.codeteams.model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProjectDao extends JpaRepository<Projects, Integer> {
}
