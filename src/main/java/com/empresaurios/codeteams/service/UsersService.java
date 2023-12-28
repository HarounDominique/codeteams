package com.empresaurios.codeteams.service;

import com.empresaurios.codeteams.api.IUsersService;
import com.empresaurios.codeteams.model.Users;
import com.empresaurios.codeteams.model.dao.IUsersDao;
import com.empresaurios.codeteams.model.dto.UsersDTO;
import com.empresaurios.codeteams.model.dto.dtomapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("UsersService")
@Lazy
public class UsersService implements IUsersService {

    @Autowired
    private IUsersDao usersDao;


    @Override
    public UsersDTO queryUser(UsersDTO usersDTO) {
        Users user = IUserMapper.INSTANCE.toEntity(usersDTO);
        return IUserMapper.INSTANCE.toDTO(usersDao.getReferenceById(user.getUser_id()));
    }

    @Override
    public List<UsersDTO> queryAllUsers() {
       return IUserMapper.INSTANCE.toDTOList(usersDao.findAll());
    }

    @Override
    public int insertUser(UsersDTO usersDTO) {
        Users user = IUserMapper.INSTANCE.toEntity(usersDTO);
        usersDao.saveAndFlush(user);
        return user.getUser_id();
    }

    @Override
    public int updateUser(UsersDTO usersDTO) {
        return insertUser(usersDTO);
    }

    @Override
    public int deleteUser(UsersDTO usersDTO) {
        int id = usersDTO.getUser_id();
        Users user = IUserMapper.INSTANCE.toEntity(usersDTO);
        usersDao.delete(user);
        return id;
    }
}
