package org.neuedu.hisjava.controller.systemController;

import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.model.Constantitem;
import org.neuedu.hisjava.model.Constanttype;
import org.neuedu.hisjava.model.ConstanttypePageBean;
import org.neuedu.hisjava.model.RespBean;
import org.neuedu.hisjava.service.systemService.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/constanttype")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    //查看常用类别管理表格
    @GetMapping("/categoryAllInfo")
    public PageInfo categoryAllInfo(ConstanttypePageBean constanttypePageBean){
        return categoryService.categoryAllInfo(constanttypePageBean);
    }
    //新增常数类别
    @PostMapping("/addCategory")
    public RespBean addCategory(@RequestBody Constanttype constanttype){
        System.out.println(constanttype.getConstantTypeCode());
        System.out.println(constanttype.getConstantTypeName());
        return categoryService.addCategory(constanttype);
    }
    //查询所属类别
    @GetMapping("/categoryName")
    public List<Constanttype> categoryName(){
        return categoryService.categoryName();
    }

    //查询常数项
    @GetMapping("/getConstantitem")
    public PageInfo getConstantitem(String keywords,String typeId,Integer pageNum,Integer pageSize){
        return categoryService.getConstantitem(keywords,typeId,pageNum,pageSize);
    }
    //新增常数项
    @PostMapping("/addConstantitem")
    public RespBean addConstantitem(@RequestBody Constantitem constantitem){
        return categoryService.addConstantitem(constantitem);
    }
    //删除常数项
    @DeleteMapping("/delConstantitemById")
    public RespBean delConstantitem(Integer id){
        return categoryService.delConstantitem(id);
    }
    //批量删除常数项
    @PostMapping("/delMulConstantitemById")
    public RespBean delMulConstantitemById(Integer[] ids){
        return categoryService.delMulConstantitemById(ids);
    }
    //编辑常数项
    @PutMapping("/updateConstantitem")
    public RespBean updateConstantitem(@RequestBody Constantitem constantitem){
        System.out.println(constantitem);
        return categoryService.updateConstantitem(constantitem);
    }
}
