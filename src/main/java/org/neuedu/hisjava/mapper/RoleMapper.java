package org.neuedu.hisjava.mapper;

import org.neuedu.hisjava.model.Role;

import java.util.List;

public interface RoleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> getRolesById(Integer id);

    List<Role> getRolesByuId(Integer id);

}