package org.neuedu.hisjava.service.systemService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.mapper.DisecategoryMapper;
import org.neuedu.hisjava.model.Disecategory;
import org.neuedu.hisjava.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DisecategoryService {
    @Autowired
    DisecategoryMapper disecategoryMapper;

    public  PageInfo searchDisecategoryBynameOrcode(String keywords, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Disecategory> lists=disecategoryMapper.searchDisecategoryBynameOrcode(keywords);
        PageInfo pageInfo = new PageInfo(lists);
        return pageInfo;
    }

    public  RespBean addDisecategory(Disecategory disecategory) {
        int i = disecategoryMapper.insertSelective(disecategory);
        if(i!=0){
            return RespBean.ok(200,"新增疾病分类成功") ;
        }else{
            return RespBean.error(500,"新增疾病分类失败") ;
        }
    }

    public  RespBean updateDisecategory(Disecategory disecategory) {
        int i = disecategoryMapper.updateByPrimaryKeySelective(disecategory);
        if(i!=0){
            return RespBean.ok(200,"修改疾病分类成功") ;
        }else{
            return RespBean.error(500,"修改疾病分类失败") ;
        }
    }

    public  RespBean delDisecategory(Integer id) {
        int i = disecategoryMapper.delDisecategory(id);
        if(i!=0){
            return RespBean.ok(200,"删除疾病分类成功") ;
        }else{
            return RespBean.error(500,"删除疾病分类失败") ;
        }
    }

    public  RespBean delManyDisecategory(Integer[] ids) {
        int i = disecategoryMapper.delManyDisecategory(ids);
        if(i!=0){
            return RespBean.ok(200,"批量删除疾病分类成功") ;
        }else{
            return RespBean.error(500,"批量删除疾病分类失败") ;
        }
    }
}
