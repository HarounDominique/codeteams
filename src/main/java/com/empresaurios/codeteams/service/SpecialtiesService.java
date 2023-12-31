package com.empresaurios.codeteams.service;

import com.empresaurios.codeteams.api.ISpecialtiesService;
import com.empresaurios.codeteams.model.Specialties;
import com.empresaurios.codeteams.model.dao.ISpecialtiesDao;
import com.empresaurios.codeteams.model.dto.SpecialtiesDTO;
import com.empresaurios.codeteams.model.dto.dtomapper.ISpecialtiesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SpecialtiesService")
@Lazy
public class SpecialtiesService implements ISpecialtiesService {
    @Autowired
    private ISpecialtiesDao specialtiesDao;

    @Override
    public SpecialtiesDTO querySpecialty(SpecialtiesDTO specialtiesDTO) {
        Specialties specialties = ISpecialtiesMapper.INSTANCE.toEntity(specialtiesDTO);
        return ISpecialtiesMapper.INSTANCE.toDTO(specialtiesDao.getReferenceById(specialties.getSpecialty_id()));
    }

    @Override
    public List<SpecialtiesDTO> queryAllSpecialties() {
        return ISpecialtiesMapper.INSTANCE.toDTOList(specialtiesDao.findAll());
    }

    @Override
    public int insertSpecialty(SpecialtiesDTO specialtiesDTO) {
        Specialties specialties = ISpecialtiesMapper.INSTANCE.toEntity(specialtiesDTO);
        specialtiesDao.saveAndFlush(specialties);
        return specialties.getSpecialty_id();
    }

    @Override
    public int updateSpecialty(SpecialtiesDTO specialtiesDTO) {
        return insertSpecialty(specialtiesDTO);
    }

    @Override
    public int deleteSpecialty(SpecialtiesDTO specialtiesDTO) {
        int exitCode = 0;
        try {
            Specialties specialties = ISpecialtiesMapper.INSTANCE.toEntity(specialtiesDTO);
            specialtiesDao.delete(specialties);
            exitCode = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return exitCode;
    }
}
