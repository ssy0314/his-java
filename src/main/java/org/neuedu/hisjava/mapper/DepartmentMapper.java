package org.neuedu.hisjava.mapper;

import io.lettuce.core.dynamic.annotation.Param;
import org.neuedu.hisjava.model.Constantitem;
import org.neuedu.hisjava.model.Department;

import java.util.List;

public interface DepartmentMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    List<Department> searchDept(String keywords);

    int delDept(Integer id);

    int delManyDept(@Param("ids") Integer[] ids);

    List<Department> searchDeptName();

    List<Constantitem> searchAllDeptca();


}