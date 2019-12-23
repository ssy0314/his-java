package org.neuedu.hisjava.service.systemService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.mapper.FmeditemMapper;
import org.neuedu.hisjava.model.Fmeditem;
import org.neuedu.hisjava.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FmeditemService {
    @Autowired
    FmeditemMapper fmeditemMapper;

    public  PageInfo searchFmeditemBynameOrcode(String keywords, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Fmeditem> lists=fmeditemMapper.searchFmeditemBynameOrcode(keywords);
        PageInfo pageInfo = new PageInfo(lists);
        return pageInfo;
    }

    public  RespBean addFmeditem(Fmeditem fmeditem) {
        int i = fmeditemMapper.insertSelective(fmeditem);
        if(i!=0){
            return RespBean.ok(200,"新增用户成功") ;
        }else{
            return RespBean.error(500,"新增用户失败") ;
        }
    }

    public  RespBean updateFmeditem(Fmeditem fmeditem) {
        int i =fmeditemMapper.updateByPrimaryKeySelective(fmeditem);
        if(i!=0){
            return RespBean.ok(200,"修改用户成功") ;
        }else{
            return RespBean.error(500,"修改用户失败") ;
        }
    }

    public  RespBean delFmeditem(Integer id) {
        int i =fmeditemMapper.delFmeditem(id);
        if(i!=0){
            return RespBean.ok(200,"删除用户成功") ;
        }else{
            return RespBean.error(500,"删除用户失败") ;
        }
    }

    public  RespBean delManyFmeditem(Integer[] ids) {
        int i =fmeditemMapper.delManyFmeditem(ids);
        if(i!=0){
            return RespBean.ok(200,"批量删除用户成功") ;
        }else{
            return RespBean.error(500,"批量删除用户失败") ;
        }
    }
}
