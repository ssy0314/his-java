package org.neuedu.hisjava.controller.registerController;

import org.neuedu.hisjava.model.Invoice;
import org.neuedu.hisjava.model.Registwork;
import org.neuedu.hisjava.model.RespBean;
import org.neuedu.hisjava.service.registerService.RegistWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegistWorkController {
    @Autowired
    RegistWorkService registWorkService;
//根据日结起始时间查询发票开始号
    @GetMapping("/searchBeginInvoiceNum")
    public Invoice searchBeginInvoiceNum(String beginTime,String endTime){
        return registWorkService.searchBeginInvoiceNum(beginTime,endTime);
    }
// 根据日结起始时间查询发票结束号
    @GetMapping("/searchEndInvoiceNum")
    public Invoice searchEndInvoiceNum(String beginTime,String endTime){
        return registWorkService.searchEndInvoiceNum(beginTime,endTime);
    }
//根据日结起始时间查询作废发票
    @GetMapping("/searchBad")
    public List<Invoice> searchBad(String beginTime,String endTime){
        return registWorkService.searchBad(beginTime,endTime);
    }
// 根据日结起始时间查询重打发票
    @GetMapping("/searchRepeat")
    public List<Invoice> searchRepeat(String beginTime, String endTime){
        return registWorkService.searchRepeat(beginTime,endTime);
    }
//根据日结起始时间查询现金金额
    @GetMapping("/searchCash")
    public Invoice searchCash(String beginTime,String endTime){
        return registWorkService.searchCash(beginTime,endTime);
    }
    //根据日结起始时间查询非现金金额
    @GetMapping("/searchOther")
    public Invoice searchOther(String beginTime,String endTime){
        return registWorkService.searchOther(beginTime,endTime);
    }
//查询上一次日结结束时间
    @GetMapping("/searchBeforeEndTime")
    public Registwork searchBeforeEndTime(){
        return registWorkService.searchBeforeEndTime();
    }
// 添加日结
    @PostMapping("/addRegistWork")
    public RespBean addRegistWork(@RequestBody Registwork registwork){
        return registWorkService.addRegistWork(registwork);
    }
}
