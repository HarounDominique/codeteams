package com.empresaurios.codeteams.model.dao;

import com.empresaurios.codeteams.model.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRolesDao extends JpaRepository<UserRoles, Integer> {
}
