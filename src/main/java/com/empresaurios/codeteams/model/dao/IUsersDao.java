package com.empresaurios.codeteams.model.dao;

import com.empresaurios.codeteams.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsersDao extends JpaRepository<Users, Integer> {


}
