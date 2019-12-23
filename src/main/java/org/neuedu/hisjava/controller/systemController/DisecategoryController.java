package org.neuedu.hisjava.controller.systemController;

import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.model.Disecategory;
import org.neuedu.hisjava.model.RespBean;
import org.neuedu.hisjava.service.systemService.DisecategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DisecategoryController {
    @Autowired
    DisecategoryService disecategoryService;
    // 查询疾病类别信息根据项目编码和项目名称
    @GetMapping("/searchDisecategoryBynameOrcode")
    public PageInfo searchDisecategoryBynameOrcode(String keywords, Integer pageNum, Integer pageSize){
        return disecategoryService.searchDisecategoryBynameOrcode(keywords,pageNum,pageSize);
    }
    // 新增疾病类别
    @PostMapping("/addDisecategory")
    public RespBean addDisecategory(@RequestBody Disecategory disecategory){
        return disecategoryService.addDisecategory(disecategory);
    }
    // 修改信息根据id
    @PutMapping("/updateDisecategory")
    public RespBean updateDisecategory(@RequestBody Disecategory disecategory){
        return disecategoryService.updateDisecategory(disecategory);
    }
    // 删除疾病类别根据id
    @PutMapping("/delDisecategory")
    public RespBean delDisecategory(Integer id){
        return disecategoryService.delDisecategory(id);
    }
    // 批量删除疾病类别根据id
    @PostMapping("/delManyDisecategory")
    public RespBean delManyDisecategory(Integer[] ids){
        return disecategoryService.delManyDisecategory(ids);
    }
}
