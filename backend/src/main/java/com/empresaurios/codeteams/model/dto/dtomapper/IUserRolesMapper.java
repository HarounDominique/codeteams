package com.empresaurios.codeteams.model.dto.dtomapper;

import com.empresaurios.codeteams.model.UserRoles;
import com.empresaurios.codeteams.model.dto.UserRolesDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface IUserRolesMapper {
    IUserRolesMapper INSTANCE = Mappers.getMapper(IUserRolesMapper.class);
    UserRolesDTO toDTO(UserRoles userRole);
    List<UserRolesDTO> toDTOList(List<UserRoles> userRoles);
    UserRoles toEntity(UserRolesDTO userRolesDTO);
}
