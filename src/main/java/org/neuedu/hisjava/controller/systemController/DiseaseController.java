package org.neuedu.hisjava.controller.systemController;

import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.model.Disease;
import org.neuedu.hisjava.model.RespBean;
import org.neuedu.hisjava.service.systemService.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DiseaseController {
    @Autowired
    DiseaseService diseaseService;
    // 查询疾病类别信息根据项目编码和项目名称
    @GetMapping("/searchDiseaseBynameOrcode")
    public PageInfo searchdiseaseBynameOrcode(String keywords, Integer pageNum, Integer pageSize){
        return diseaseService.searchDiseaseBynameOrcode(keywords,pageNum,pageSize);
    }
    // 新增疾病类别
    @PostMapping("/addDisease")
    public RespBean addDisease(@RequestBody Disease disease){
        return diseaseService.addDisease(disease);
    }
    // 修改信息根据id
    @PutMapping("/updateDisease")
    public RespBean updateDisease(@RequestBody Disease disease){
        return diseaseService.updateDisease(disease);
    }
    // 删除疾病类别根据id
    @PutMapping("/delDisease")
    public RespBean delDisease(Integer id){
        return diseaseService.delDisease(id);
    }
    // 批量删除疾病类别根据id
    @PostMapping("/delManyDisease")
    public RespBean delManyDisease(Integer[] ids){
        return diseaseService.delManyDisease(ids);
    }
}
