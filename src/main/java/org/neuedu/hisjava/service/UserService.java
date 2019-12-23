package org.neuedu.hisjava.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.mapper.RoleMapper;
import org.neuedu.hisjava.mapper.UserMapper;
import org.neuedu.hisjava.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    RoleMapper roleMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserBean user = userMapper.loadUserByUsername(username);
        if(user==null) {
            throw new UsernameNotFoundException("该用户不存在");
        }
        List<Role> roles = roleMapper.getRolesByuId(user.getId());
        user.setRoles(roles);
        return user;
    }

    public List<User> searchUserByDeptAndRegist(String adddeptvalue, String registvalue) {
        List<User> users = userMapper.searchUserByDeptAndRegist(adddeptvalue,registvalue);
        for (User user : users) {
            user.setPassword(null);
        }
        return users;
    }

    public PageInfo searchUserByUsernameOrRealname(String keywords,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> users =userMapper.searchUserByUsernameOrRealname(keywords);
        PageInfo pageInfo = new PageInfo(users);
        return pageInfo;
    }

    public RespBean addUser(User user) {
        int i =userMapper.insertSelective(user);
        if(i!=0){
            return RespBean.ok(200,"新增用户成功") ;
        }else{
            return RespBean.error(500,"新增用户失败") ;
        }

    }

    public RespBean updateUser(User user) {
        int i =userMapper.updateByPrimaryKeySelective(user);
        if(i!=0){
            return RespBean.ok(200,"修改用户成功") ;
        }else{
            return RespBean.error(500,"修改用户失败") ;
        }
    }

    public RespBean delUser(Integer id) {
        int i =userMapper.delUser(id);
        if(i!=0){
            return RespBean.ok(200,"删除用户成功") ;
        }else{
            return RespBean.error(500,"删除用户失败") ;
        }
    }

    public RespBean delManyUser(Integer[] ids) {
        int i =userMapper.delManyUser(ids);
        if(i!=0){
            return RespBean.ok(200,"批量删除用户成功") ;
        }else{
            return RespBean.error(500,"批量删除失败") ;
        }
    }

    public List<Constantitem> searchAllUserName() {
        return userMapper.searchAllUserName();

    }
}
