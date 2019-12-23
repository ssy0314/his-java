package org.neuedu.hisjava.controller.systemController;


import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.service.systemService.ScheduingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduingController {
    @Autowired
    ScheduingService scheduingService;

    @GetMapping("/searchScheduing")
    public PageInfo searchScheduing(String startDate,String endDate,Integer pageSize,Integer pageNum){
        return scheduingService.searchScheduing(startDate,endDate,pageSize,pageNum);
    }
}
