package org.neuedu.hisjava.controller.systemController;


import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.model.Scheduling;
import org.neuedu.hisjava.service.systemService.ScheduingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScheduingController {
    @Autowired
    ScheduingService scheduingService;
    @GetMapping("/searchSpecilScheduing")
    public List<Scheduling> searchSpecilScheduing(String deptid, String registlevelid,String noon,String nowdate){
        return scheduingService.searchSpecilScheduing(deptid,registlevelid,noon,nowdate);
    }

    @GetMapping("/searchScheduing")
    public PageInfo searchScheduing(String startDate,String endDate,Integer pageSize,Integer pageNum){
        return scheduingService.searchScheduing(startDate,endDate,pageSize,pageNum);
    }
}
