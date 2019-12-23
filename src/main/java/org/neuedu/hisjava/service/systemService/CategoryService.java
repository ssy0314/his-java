package org.neuedu.hisjava.service.systemService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.mapper.systemMapper.CategoryMapper;
import org.neuedu.hisjava.model.Constantitem;
import org.neuedu.hisjava.model.Constanttype;
import org.neuedu.hisjava.model.ConstanttypePageBean;
import org.neuedu.hisjava.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    public PageInfo categoryAllInfo(ConstanttypePageBean constanttypePageBean) {
        PageHelper.startPage(constanttypePageBean.getPageNum(),constanttypePageBean.getPageSize());
        List<Constanttype> constanttypeList = categoryMapper.categoryAllInfo(constanttypePageBean.getKeywords());
        PageInfo pageInfo = new PageInfo(constanttypeList);
        return pageInfo;

    }

    public RespBean addCategory(Constanttype constanttype) {
      int i= categoryMapper.addCategory(constanttype);
      if (i!=0){
          return RespBean.ok(200,"添加成功");
      }else{
          return RespBean.error(500,"添加失败");
      }
    }

    public List<Constanttype> categoryName() {
        return categoryMapper.categoryName();

    }

    public PageInfo getConstantitem(String keywords,String typeId,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Constantitem> constantitemList = categoryMapper.getConstantitem(keywords,typeId);
        PageInfo pageInfo = new PageInfo(constantitemList);
        return pageInfo;
    }

    public RespBean addConstantitem(Constantitem constantitem) {
       int i = categoryMapper.addConstantitem(constantitem);
       if (i !=0){
           return RespBean.ok(200,"添加成功");
       }else{
           return RespBean.error(500,"添加失败");
       }
    }

    public RespBean delConstantitem(Integer id) {
        int i = categoryMapper.delConstantitem(id);
        if (i !=0){
            return RespBean.ok(200,"删除成功");
        }else{
            return RespBean.error(500,"删除失败");
        }
    }

    public RespBean delMulConstantitemById(Integer[] ids) {
        int i = categoryMapper.delMulConstantitemById(ids);
        if (i !=0){
            return RespBean.ok(200,"批量删除成功");
        }else{
            return RespBean.error(500,"批量删除失败");
        }
    }

    public RespBean updateConstantitem(Constantitem constantitem) {
        int i = categoryMapper.updateConstantitem(constantitem);
        if (i !=0){
            return RespBean.ok(200,"修改成功");
        }else{
            return RespBean.error(500,"修改失败");
        }
    }
}
