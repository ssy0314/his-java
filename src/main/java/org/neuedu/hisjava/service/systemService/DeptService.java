package org.neuedu.hisjava.service.systemService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.mapper.DepartmentMapper;
import org.neuedu.hisjava.model.Constantitem;
import org.neuedu.hisjava.model.Department;
import org.neuedu.hisjava.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
    @Autowired
    DepartmentMapper departmentMapper;
    public PageInfo searchDept(String keywords,Integer pageSize,Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<Department> departmentList = departmentMapper.searchDept(keywords);
        PageInfo pageInfo = new PageInfo(departmentList);
        return pageInfo;
    }

    public RespBean delDept(Integer id) {
       int i = departmentMapper.delDept(id);
       if(i!=0){
           return RespBean.ok(200,"删除成功");
       }else{
           return RespBean.error(500,"删除失败");
       }

    }

    public RespBean updateDept(Department department) {
        int i = departmentMapper.updateByPrimaryKeySelective(department);
        if(i!=0){
            return RespBean.ok(200,"修改成功");
        }else{
            return RespBean.error(500,"修改失败");
        }
    }

    public RespBean addDept(Department department) {
        int i = departmentMapper.insertSelective(department);
        if(i!=0){
            return RespBean.ok(200,"添加成功");
        }else{
            return RespBean.error(500,"添加失败");
        }
    }

    public RespBean delManyDept(Integer[] ids) {
        int i = departmentMapper.delManyDept(ids);
        if(i!=0){
            return RespBean.ok(200,"批量删除成功");
        }else{
            return RespBean.error(500,"批量删除失败");
        }
    }

    public List<Department> searchDeptName() {
        return departmentMapper.searchDeptName();
    }
    public List<Constantitem> searchAllDeptca() {
        return departmentMapper.searchAllDeptca();

    }

}
