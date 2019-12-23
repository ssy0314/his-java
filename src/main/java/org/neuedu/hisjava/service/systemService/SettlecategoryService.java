package org.neuedu.hisjava.service.systemService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.lettuce.core.dynamic.annotation.Param;
import org.neuedu.hisjava.mapper.SettlecategoryMapper;
import org.neuedu.hisjava.model.RespBean;
import org.neuedu.hisjava.model.Settlecategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SettlecategoryService {
    @Autowired
    SettlecategoryMapper settlecategoryMapper;

    public PageInfo searchSettlecategoryBynameOrcode(String keywords, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Settlecategory> lists = settlecategoryMapper.searchSettlecategoryBynameOrcode(keywords);
        PageInfo pageInfo = new PageInfo(lists);
        return pageInfo;
    }

    public RespBean addSettlecategory(Settlecategory settlecategory) {
        int i =settlecategoryMapper.insertSelective(settlecategory);
        if(i!=0){
            return RespBean.ok(200,"新增结算类别成功") ;
        }else{
            return RespBean.error(500,"新增结算类别失败") ;
        }
    }

    public RespBean updateSettlecategory(Settlecategory settlecategory) {
        int i =settlecategoryMapper.updateByPrimaryKeySelective(settlecategory);
        if(i!=0){
            return RespBean.ok(200,"修改结算类别成功") ;
        }else{
            return RespBean.error(500,"修改结算类别失败") ;
        }
    }

    public RespBean delSettlecategory(Integer id) {
        int i =settlecategoryMapper.delSettlecategory(id);
        if(i!=0){
            return RespBean.ok(200,"删除结算类别成功") ;
        }else{
            return RespBean.error(500,"删除结算类别失败") ;
        }
    }

    public RespBean delManySettlecategory(Integer[] ids) {
        int i =settlecategoryMapper.delManySettlecategory(ids);
        if(i!=0){
            return RespBean.ok(200,"批量删除结算类别成功") ;
        }else{
            return RespBean.error(500,"批量删除结算类别失败") ;
        }
    }
}
