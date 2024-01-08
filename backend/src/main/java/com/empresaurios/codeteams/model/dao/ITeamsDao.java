package com.empresaurios.codeteams.model.dao;

import com.empresaurios.codeteams.model.Teams;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeamsDao extends JpaRepository<Teams, Integer> {
}
