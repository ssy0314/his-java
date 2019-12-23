package org.neuedu.hisjava.controller.systemController;

import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.model.Constantitem;
import org.neuedu.hisjava.model.RespBean;
import org.neuedu.hisjava.model.User;
import org.neuedu.hisjava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    //根据科室或挂号级别查询用户
    @GetMapping("/searchUserByDeptAndRegist")
    public List<User> searchUserByDeptAndRegist(String adddeptvalue, String registvalue){
        return userService.searchUserByDeptAndRegist(adddeptvalue,registvalue);
    }
    //查询用户所有医师职称
    @GetMapping("/searchAllUserName")
    public List<Constantitem> searchAllUserName(){
        return userService.searchAllUserName();
    }

   // 查询用户信息根据用户名和登录名
   @GetMapping("/searchUserByUsernameOrRealname")
   public PageInfo searchUserByUsernameOrRealname(String keywords, Integer pageNum, Integer pageSize){
       return userService.searchUserByUsernameOrRealname(keywords,pageNum,pageSize);
   }
   // 新增用户
    @PostMapping("/addUser")
    public RespBean addUser(@RequestBody User user){
        return userService.addUser(user);
    }
   // 修改用户信息根据id
   @PutMapping("/updateUser")
   public RespBean updateUser(@RequestBody User user){
       return userService.updateUser(user);
   }
   // 删除用户根据id
   @PutMapping("/delUser")
   public RespBean delUser(Integer id){
       return userService.delUser(id);
   }
   // 批量删除用户根据id
   @PostMapping("/delManyUser")
   public RespBean delManyUser(Integer[] ids){
       return userService.delManyUser(ids);
   }
}
