package com.empresaurios.codeteams.service;

import com.empresaurios.codeteams.api.IUserRolesService;
import com.empresaurios.codeteams.model.UserRoles;
import com.empresaurios.codeteams.model.dao.IUserRolesDao;
import com.empresaurios.codeteams.model.dto.UserRolesDTO;
import com.empresaurios.codeteams.model.dto.dtomapper.IUserRolesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserRolesService")
@Lazy
public class UserRolesService implements IUserRolesService {
    @Autowired
    private IUserRolesDao userRolesDao;
    @Override
    public UserRolesDTO queryUserRole(UserRolesDTO userRolesDTO) {
        UserRoles userRoles = IUserRolesMapper.INSTANCE.toEntity(userRolesDTO);
        return IUserRolesMapper.INSTANCE.toDTO(userRolesDao.getReferenceById(userRoles.getUser_role_id()));
    }

    @Override
    public List<UserRolesDTO> queryAllUserRoles() {
        return IUserRolesMapper.INSTANCE.toDTOList(userRolesDao.findAll());
    }

    @Override
    public int insertUserRole(UserRolesDTO userRolesDTO) {
        UserRoles userRoles = IUserRolesMapper.INSTANCE.toEntity(userRolesDTO);
        userRolesDao.saveAndFlush(userRoles);
        return userRoles.getUser_role_id();
    }

    @Override
    public int updateUserRole(UserRolesDTO userRolesDTO) {
        return insertUserRole(userRolesDTO);
    }

    @Override
    public int deleteUserRole(UserRolesDTO userRolesDTO) {
        int exitCode = 0;
        try {
            UserRoles userRoles = IUserRolesMapper.INSTANCE.toEntity(userRolesDTO);
            userRolesDao.delete(userRoles);
            exitCode = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return exitCode;
    }
}
