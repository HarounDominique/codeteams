package com.empresaurios.codeteams.api;

import com.empresaurios.codeteams.model.dto.CvsDTO;
import java.util.List;

public interface ICvsService {
    //CRUD OPERATIONS
    CvsDTO queryCv(CvsDTO cvsDTO);
    List<CvsDTO> queryAllCvs();
    int insertCv(CvsDTO cvsDTO);
    int updateCv(CvsDTO cvsDTO);
    int deleteCv(CvsDTO cvsDTO);
}
