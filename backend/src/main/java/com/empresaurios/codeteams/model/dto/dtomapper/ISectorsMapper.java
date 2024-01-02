package com.empresaurios.codeteams.model.dto.dtomapper;

import com.empresaurios.codeteams.model.Sectors;
import com.empresaurios.codeteams.model.dto.SectorsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ISectorsMapper {
    ISectorsMapper INSTANCE = Mappers.getMapper(ISectorsMapper.class);
    SectorsDTO toDTO(Sectors sector);
    List<SectorsDTO> toDTOList(List<Sectors> sectors);
    Sectors toEntity(SectorsDTO sectorsDTO);
}
