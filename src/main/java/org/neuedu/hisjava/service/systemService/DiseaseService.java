package org.neuedu.hisjava.service.systemService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.mapper.DiseaseMapper;
import org.neuedu.hisjava.model.Disease;
import org.neuedu.hisjava.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiseaseService {
    @Autowired
    DiseaseMapper diseaseMapper;

    public PageInfo searchDiseaseBynameOrcode(String keywords, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Disease> lists=diseaseMapper.searchDiseaseBynameOrcode(keywords);
        PageInfo pageInfo = new PageInfo(lists);
        return pageInfo;
    }

    public RespBean addDisease(Disease disease) {
        int i = diseaseMapper.insertSelective(disease);
        if(i!=0){
            return RespBean.ok(200,"新增疾病成功") ;
        }else{
            return RespBean.error(500,"新增疾病失败") ;
        }
    }

    public RespBean updateDisease(Disease disease) {
        int i = diseaseMapper.updateByPrimaryKeySelective(disease);
        if(i!=0){
            return RespBean.ok(200,"修改疾病成功") ;
        }else{
            return RespBean.error(500,"修改疾病失败") ;
        }
    }

    public RespBean delDisease(Integer id) {
        int i = diseaseMapper.delDisease(id);
        if(i!=0){
            return RespBean.ok(200,"删除疾病成功") ;
        }else{
            return RespBean.error(500,"删除疾病失败") ;
        }
    }

    public RespBean delManyDisease(Integer[] ids) {
        int i = diseaseMapper.delManyDisease(ids);
        if(i!=0){
            return RespBean.ok(200,"批量删除疾病成功") ;
        }else{
            return RespBean.error(500,"批量删除疾病失败") ;
        }
    }
}
