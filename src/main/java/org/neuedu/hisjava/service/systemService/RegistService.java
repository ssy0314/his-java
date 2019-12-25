package org.neuedu.hisjava.service.systemService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.mapper.RegistlevelMapper;
import org.neuedu.hisjava.model.Registlevel;
import org.neuedu.hisjava.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistService {
    @Autowired
    RegistlevelMapper registlevelMapper;
    public List<Registlevel> registService() {
      return registlevelMapper.registService();
    }
    public Registlevel registOneService(String id) {
      return registlevelMapper.registOneService(id);
    }

    public PageInfo searchRegistByRegistnameOrRegistcode(String keywords, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Registlevel> lists=registlevelMapper.searchRegistByRegistnameOrRegistcode(keywords);
        PageInfo pageInfo = new PageInfo(lists);

        return pageInfo;
    }

    public RespBean addRegist(Registlevel regist) {
        int i =registlevelMapper.insertSelective(regist);
        if(i!=0){
            return RespBean.ok(200,"新增挂号级别成功") ;
        }else{
            return RespBean.error(500,"新增挂号级别失败") ;
        }
    }

    public RespBean updateRegist(Registlevel regist) {
        int i =registlevelMapper.updateByPrimaryKeySelective(regist);
        if(i!=0){
            return RespBean.ok(200,"修改挂号级别成功") ;
        }else{
            return RespBean.error(500,"修改挂号级别失败") ;
        }
    }

    public RespBean delRegist(Integer id) {
        int i =registlevelMapper.delRegist(id);
        if(i!=0){
            return RespBean.ok(200,"删除挂号级别成功") ;
        }else{
            return RespBean.error(500,"删除挂号级别失败") ;
        }
    }

    public RespBean delManyRegist(Integer[] ids) {
        int i =registlevelMapper.delManyRegist(ids);
        if(i!=0){
            return RespBean.ok(200,"批量删除挂号级别成功") ;
        }else{
            return RespBean.error(500,"批量删除挂号级别失败") ;
        }
    }
}
