package com.empresaurios.codeteams.model.dto.dtomapper;

import com.empresaurios.codeteams.model.Specialties;
import com.empresaurios.codeteams.model.dto.SpecialtiesDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ISpecialtiesMapper {
    ISpecialtiesMapper INSTANCE = Mappers.getMapper(ISpecialtiesMapper.class);
    SpecialtiesDTO toDTO(Specialties specialty);
    List<SpecialtiesDTO> toDTOList(List<Specialties> specialties);
    Specialties toEntity(SpecialtiesDTO specialtiesDTO);
}
