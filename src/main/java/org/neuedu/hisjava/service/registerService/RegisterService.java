package org.neuedu.hisjava.service.registerService;

import org.neuedu.hisjava.mapper.RegisterMapper;
import org.neuedu.hisjava.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService {
    @Autowired
    RegisterMapper registerMapper;
    public List<Constantitem> searchGender() {
        return registerMapper.searchGender();
    }

    public List<Constantitem> searchCharge() {
        return registerMapper.searchCharge();
    }

    public List<Settlecategory> searchSettle() {
        return registerMapper.searchSettle();
    }

    public Register searchRegister() {
        return registerMapper.searchRegister();
    }

    public Invoice searchInvoice() {
        return registerMapper.searchInvoice();
    }

    public RespBean addRegister(Register register) {
        int i =registerMapper.insertSelective(register);
        if(i!=0){

            return RespBean.ok(200,"挂号成功") ;
        }else{
            return RespBean.error(500,"挂号失败") ;
        }

    }
}