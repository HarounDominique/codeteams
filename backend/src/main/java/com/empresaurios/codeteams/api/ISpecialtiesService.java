package com.empresaurios.codeteams.api;

import com.empresaurios.codeteams.model.dto.SpecialtiesDTO;

import java.util.List;

public interface ISpecialtiesService {
    //CRUD OPERATIONS
    SpecialtiesDTO querySpecialty(SpecialtiesDTO specialtiesDTO);
    List<SpecialtiesDTO> queryAllSpecialties();
    int insertSpecialty(SpecialtiesDTO specialtiesDTO);
    int updateSpecialty(SpecialtiesDTO specialtiesDTO);
    int deleteSpecialty(SpecialtiesDTO specialtiesDTO);
}
