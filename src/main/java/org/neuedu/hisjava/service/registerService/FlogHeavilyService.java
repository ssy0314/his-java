package org.neuedu.hisjava.service.registerService;


import org.neuedu.hisjava.mapper.InvoiceMapper;
import org.neuedu.hisjava.mapper.RegisterMapper;
import org.neuedu.hisjava.model.Invoice;
import org.neuedu.hisjava.model.Register;
import org.neuedu.hisjava.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlogHeavilyService {
    @Autowired
    RegisterMapper registerMapper;
    @Autowired
    InvoiceMapper invoiceMapper;

    public List<Register> searchInvoiceInformation(String casenumber) {
        return registerMapper.searchInvoiceInformation(casenumber);
    }

    public RespBean updateFlogHeavily(String id) {
        int i= invoiceMapper.updateFlogHeavily(id);
        if (i!=0){
            return RespBean.ok(200,"重新打印发票成功");
        }else{
            return RespBean.error(500,"重新发票失败");
        }
    }
}
