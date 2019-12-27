package org.neuedu.hisjava.service.registerService;


import org.neuedu.hisjava.mapper.InvoiceMapper;
import org.neuedu.hisjava.model.Register;
import org.neuedu.hisjava.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepBillService {

    @Autowired
    InvoiceMapper invoiceMapper;

    public RespBean updateRepBill(String id) {
        int i= invoiceMapper.updateRepBill(id);
        if (i!=0){
            return RespBean.ok(200,"补打发票成功");
        }else{
            return RespBean.error(500,"补打发票失败");
        }
    }
}
