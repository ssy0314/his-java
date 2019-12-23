package org.neuedu.hisjava.controller.systemController;

import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.model.Registlevel;
import org.neuedu.hisjava.model.RespBean;
import org.neuedu.hisjava.model.Settlecategory;
import org.neuedu.hisjava.service.systemService.SettlecategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SettlecategoryController {


    @Autowired
    SettlecategoryService settlecategoryService;
    // 根据挂号级别编码或名称查询
    @GetMapping("/searchSettlecategoryBynameOrcode")
    public PageInfo searchSettlecategoryBynameOrcode(String keywords, Integer pageNum, Integer pageSize){
        return settlecategoryService.searchSettlecategoryBynameOrcode(keywords,pageNum,pageSize);
    }
    // 新增挂号级别
    @PostMapping("/addSettlecategory")
    public RespBean addSettlecategory(@RequestBody Settlecategory settlecategory){
        return settlecategoryService.addSettlecategory(settlecategory);
    }
    // 修改挂号信息根据id
    @PutMapping("/updateSettlecategory")
    public RespBean updateSettlecategory(@RequestBody Settlecategory settlecategory){
        return settlecategoryService.updateSettlecategory(settlecategory);
    }
    // 删除挂号级别根据id
    @PutMapping("/delSettlecategory")
    public RespBean delSettlecategory(Integer id){
        return settlecategoryService.delSettlecategory(id);
    }
    // 批量删除挂号级别根据id
    @PostMapping("/delManySettlecategory")
    public RespBean delManySettlecategory(Integer[] ids){
        return settlecategoryService.delManySettlecategory(ids);
    }

}
