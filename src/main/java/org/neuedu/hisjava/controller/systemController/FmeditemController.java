package org.neuedu.hisjava.controller.systemController;

import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.model.Fmeditem;
import org.neuedu.hisjava.model.RespBean;
import org.neuedu.hisjava.service.systemService.FmeditemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FmeditemController {
    @Autowired
    FmeditemService fmeditemService;
    // 查询非药品类信息根据项目编码和项目名称
    @GetMapping("/searchFmeditemBynameOrcode")
    public PageInfo searchFmeditemBynameOrcode(String keywords, Integer pageNum, Integer pageSize){
        return fmeditemService.searchFmeditemBynameOrcode(keywords,pageNum,pageSize);
    }
    // 新增非药品类
    @PostMapping("/addFmeditem")
    public RespBean addFmeditem(@RequestBody Fmeditem fmeditem){
        return fmeditemService.addFmeditem(fmeditem);
    }
    // 修改非药品类信息根据id
    @PutMapping("/updateFmeditem")
    public RespBean updateFmeditem(@RequestBody Fmeditem fmeditem){
        return fmeditemService.updateFmeditem(fmeditem);
    }
    // 删除非药品类根据id
    @PutMapping("/delFmeditem")
    public RespBean delFmeditem(Integer id){
        return fmeditemService.delFmeditem(id);
    }
    // 批量删除非药品类根据id
    @PostMapping("/delManyFmeditem")
    public RespBean delManyFmeditem(Integer[] ids){
        return fmeditemService.delManyFmeditem(ids);
    }
}
