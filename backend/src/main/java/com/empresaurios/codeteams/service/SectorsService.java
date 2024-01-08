package com.empresaurios.codeteams.service;

import com.empresaurios.codeteams.api.ISectorsService;
import com.empresaurios.codeteams.model.Sectors;
import com.empresaurios.codeteams.model.dao.ISectorsDao;
import com.empresaurios.codeteams.model.dto.SectorsDTO;
import com.empresaurios.codeteams.model.dto.dtomapper.ISectorsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SectorsService")
@Lazy
public class SectorsService implements ISectorsService {
    @Autowired
    private ISectorsDao sectorsDao;

    @Override
    public SectorsDTO querySector(SectorsDTO sectorsDTO) {
        Sectors sector = ISectorsMapper.INSTANCE.toEntity(sectorsDTO);
        return ISectorsMapper.INSTANCE.toDTO(sectorsDao.getReferenceById(sector.getSector_id()));
    }

    @Override
    public List<SectorsDTO> queryAllSectors() {
        return ISectorsMapper.INSTANCE.toDTOList(sectorsDao.findAll());
    }

    @Override
    public int insertSector(SectorsDTO sectorsDTO) {
        Sectors sector = ISectorsMapper.INSTANCE.toEntity(sectorsDTO);
        sectorsDao.saveAndFlush(sector);
        return sector.getSector_id();
    }

    @Override
    public int updateSector(SectorsDTO sectorsDTO) {
        return insertSector(sectorsDTO);
    }

    @Override
    public int deleteSector(SectorsDTO sectorsDTO) {
        int exitCode = 0;
        try {
            Sectors sector = ISectorsMapper.INSTANCE.toEntity(sectorsDTO);
            sectorsDao.delete(sector);
            exitCode = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return exitCode;
    }
}
