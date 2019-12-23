package org.neuedu.hisjava.controller.systemController;

import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.model.Constantitem;
import org.neuedu.hisjava.model.Department;
import org.neuedu.hisjava.model.RespBean;
import org.neuedu.hisjava.service.systemService.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    DeptService deptService;
    //查询所有科室分类
    @GetMapping("/searchDeptName")
    public List<Department> searchDeptName(){
        return deptService.searchDeptName();
    }

    //查询部门信息
    @GetMapping("/searchDept")
    public PageInfo searchDept(String keywords, Integer pageSize, Integer pageNum){
        return deptService.searchDept(keywords,pageSize,pageNum);
    }
    //根据id删除科室
    @DeleteMapping("/delDept")
    public RespBean delDept(Integer id){
        return deptService.delDept(id);
    }
    //根据id修改科室信息
    @PutMapping("/updateDept")
    public RespBean updateDept(@RequestBody Department department){
        return deptService.updateDept(department);
    }
    //根据ids批量删除.
    @PostMapping("/delManyDept")
    public RespBean delManyDept(Integer[] ids){
        return deptService.delManyDept(ids);
    }
    //新增科室
    @PostMapping("/addDept")
    public RespBean addDept(@RequestBody Department department){
        return deptService.addDept(department);
    }


    //查询所有科室类别
    @GetMapping("/searchAllDeptca")
            public List<Constantitem> searchAllDeptca(){
            return deptService.searchAllDeptca(); }
}
