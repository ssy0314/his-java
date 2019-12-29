package org.neuedu.hisjava.controller.registerController;

import com.github.pagehelper.PageInfo;
import org.neuedu.hisjava.model.Invoice;
import org.neuedu.hisjava.model.Registwork;
import org.neuedu.hisjava.service.registerService.DailyQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DailyQueryController {
    @Autowired
    DailyQueryService dailyQueryService;
    @GetMapping("/searchAllRegistwork")
    public List<Registwork> searchAllRegistwork(String startTime,String endTime){
        return dailyQueryService.searchAllRegistwork(startTime,endTime);
    }
    @GetMapping("/searchOwnRegistworkInvoice")
    public PageInfo searchOwnRegistworkInvoice(String startTime, String endTime, Integer pageSize, Integer pageNum){
        return dailyQueryService.searchOwnRegistworkInvoice(startTime,endTime,pageSize,pageNum);
    }
}
