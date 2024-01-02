package com.empresaurios.codeteams.service;

import com.empresaurios.codeteams.api.ICvsService;
import com.empresaurios.codeteams.model.Cvs;
import com.empresaurios.codeteams.model.dao.ICvsDao;
import com.empresaurios.codeteams.model.dto.CvsDTO;
import com.empresaurios.codeteams.model.dto.dtomapper.ICvsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CvsService")
@Lazy
public class CvsService implements ICvsService {

    @Autowired
    private ICvsDao cvsDao;

    @Override
    public CvsDTO queryCv(CvsDTO cvsDTO) {
        Cvs cv = ICvsMapper.INSTANCE.toEntity(cvsDTO);
        return ICvsMapper.INSTANCE.toDTO(cvsDao.getReferenceById(cv.getCv_id()));
    }

    @Override
    public List<CvsDTO> queryAllCvs() {
        return ICvsMapper.INSTANCE.toDTOList(cvsDao.findAll());
    }

    @Override
    public int insertCv(CvsDTO cvsDTO) {
        Cvs cv = ICvsMapper.INSTANCE.toEntity(cvsDTO);
        cvsDao.saveAndFlush(cv);
        return cv.getCv_id();
    }

    @Override
    public int updateCv(CvsDTO cvsDTO) {
        return insertCv(cvsDTO);
    }

    @Override
    public int deleteCv(CvsDTO cvsDTO) {
        int exitCode = 0;
        try {
            Cvs cv = ICvsMapper.INSTANCE.toEntity(cvsDTO);
            cvsDao.delete(cv);
            exitCode = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return exitCode;
    }
}
