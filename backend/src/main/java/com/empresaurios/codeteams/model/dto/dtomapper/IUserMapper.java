package com.empresaurios.codeteams.model.dto.dtomapper;

import com.empresaurios.codeteams.model.Users;
import com.empresaurios.codeteams.model.dto.UsersDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface IUserMapper {

    IUserMapper INSTANCE = Mappers.getMapper(IUserMapper.class);
    UsersDTO toDTO(Users user);
    List<UsersDTO> toDTOList(List<Users> users);
    Users toEntity(UsersDTO usersDTO);

}
