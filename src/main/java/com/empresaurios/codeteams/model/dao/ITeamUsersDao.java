package com.empresaurios.codeteams.model.dao;

import com.empresaurios.codeteams.model.TeamUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeamUsersDao extends JpaRepository<TeamUsers, Integer> {
}
