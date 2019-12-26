package org.neuedu.hisjava.service.registerService;

import org.neuedu.hisjava.mapper.RegisterMapper;
import org.neuedu.hisjava.model.Register;
import org.neuedu.hisjava.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutRegistService {
    @Autowired
    RegisterMapper registerMapper;
    public List<Register> searchAllRegister(String casenumber) {
        return registerMapper.searchAllRegister(casenumber);
    }

    public RespBean updateVisitstate(String id) {
        int i =registerMapper.updateVisitstate(id);

        if(i!=0){
                return RespBean.ok(200,"退号成功") ;

        }else{
            return RespBean.error(500,"退号失败") ;
        }
    }
}
