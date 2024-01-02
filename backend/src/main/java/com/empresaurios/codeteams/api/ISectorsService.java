package com.empresaurios.codeteams.api;

import com.empresaurios.codeteams.model.dto.SectorsDTO;

import java.util.List;

public interface ISectorsService {
    //CRUD OPERATIONS
    SectorsDTO querySector(SectorsDTO sectorsDTO);
    List<SectorsDTO> queryAllSectors();
    int insertSector(SectorsDTO sectorsDTO);
    int updateSector(SectorsDTO sectorsDTO);
    int deleteSector(SectorsDTO sectorsDTO);
}
