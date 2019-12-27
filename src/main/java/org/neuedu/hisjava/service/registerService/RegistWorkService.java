package org.neuedu.hisjava.service.registerService;


import org.neuedu.hisjava.mapper.InvoiceMapper;
import org.neuedu.hisjava.mapper.RegistworkMapper;
import org.neuedu.hisjava.model.Invoice;
import org.neuedu.hisjava.model.Registwork;
import org.neuedu.hisjava.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistWorkService {
    @Autowired
    InvoiceMapper invoiceMapper;
    @Autowired
    RegistworkMapper registworkMapper;

    public Invoice searchBeginInvoiceNum(String beginTime, String endTime) {
        return invoiceMapper.searchBeginInvoiceNum(beginTime,endTime);
    }

    public Invoice searchEndInvoiceNum(String beginTime, String endTime) {
        return invoiceMapper.searchEndInvoiceNum(beginTime,endTime);
    }

    public List<Invoice> searchBad(String beginTime, String endTime) {
        return invoiceMapper.searchBad(beginTime,endTime);
    }

    public List<Invoice> searchRepeat(String beginTime, String endTime) {
        return invoiceMapper.searchRepeat(beginTime,endTime);
    }

    public Invoice searchCash(String beginTime, String endTime) {
        return invoiceMapper.searchCash(beginTime,endTime);
    }

    public Invoice searchOther(String beginTime, String endTime) {
        return invoiceMapper.searchOther(beginTime,endTime);
    }

    public Registwork searchBeforeEndTime() {
        return registworkMapper.searchBeforeEndTime();
    }

    public RespBean addRegistWork(Registwork registwork) {
        int i = registworkMapper.insertSelective(registwork);
        if(i!=0){
            return RespBean.ok(200,"新增日结成功");
        }else{
            return RespBean.ok(200,"新增日结失败");
        }
    }
}
