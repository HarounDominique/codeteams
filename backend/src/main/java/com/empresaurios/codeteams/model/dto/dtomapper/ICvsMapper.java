package com.empresaurios.codeteams.model.dto.dtomapper;

import com.empresaurios.codeteams.model.Cvs;
import com.empresaurios.codeteams.model.dto.CvsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ICvsMapper {
    ICvsMapper INSTANCE = Mappers.getMapper(ICvsMapper.class);
    CvsDTO toDTO(Cvs cv);
    List<CvsDTO> toDTOList(List<Cvs> cvs);
    Cvs toEntity(CvsDTO cvsDTO);
}
