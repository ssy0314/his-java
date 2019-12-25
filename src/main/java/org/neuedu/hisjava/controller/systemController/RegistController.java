package org.neuedu.hisjava.controller.systemController;

import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.model.Registlevel;
import org.neuedu.hisjava.model.RespBean;
import org.neuedu.hisjava.service.systemService.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegistController {
    @Autowired
    RegistService registService;
    @GetMapping("/searchRegistlevel")
    public List<Registlevel> searchRegistlevel(){
        return registService.registService();
    }
    @GetMapping("/searchOneRegistlevel")
    public Registlevel searchOneRegistlevel(String id){
        return registService.registOneService(id);
    }


    // 根据挂号级别编码或名称查询
    @GetMapping("/searchRegistByRegistnameOrRegistcode")
    public PageInfo searchRegistByRegistnameOrRegistcode(String keywords, Integer pageNum, Integer pageSize){
        return registService.searchRegistByRegistnameOrRegistcode(keywords,pageNum,pageSize);
    }
    // 新增挂号级别
    @PostMapping("/addRegist")
    public RespBean addRegist(@RequestBody Registlevel regist){
        return registService.addRegist(regist);
    }
    // 修改挂号信息根据id
        @PutMapping("/updateRegist")
    public RespBean updateRegist(@RequestBody Registlevel regist){
        return registService.updateRegist(regist);
    }
    // 删除挂号级别根据id
    @PutMapping("/delRegist")
    public RespBean delRegist(Integer id){
        return registService.delRegist(id);
    }
    // 批量删除挂号级别根据id
    @PostMapping("/delManyRegist")
    public RespBean delManyRegist(Integer[] ids){
        return registService.delManyRegist(ids);
    }

}
