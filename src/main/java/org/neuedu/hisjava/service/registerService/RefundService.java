package org.neuedu.hisjava.service.registerService;


import org.neuedu.hisjava.mapper.RegisterMapper;
import org.neuedu.hisjava.model.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RefundService {
    @Autowired
    RegisterMapper registerMapper;

    public List<Register> searchRegisterRefundByasenumber(String casenumber) {
        return registerMapper.searchRegisterRefundByasenumber(casenumber);
    }
}
