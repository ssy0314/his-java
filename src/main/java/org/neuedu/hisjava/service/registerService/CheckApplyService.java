package org.neuedu.hisjava.service.registerService;

import org.neuedu.hisjava.mapper.CheckApplyMapper;
import org.neuedu.hisjava.mapper.InvoiceMapper;
import org.neuedu.hisjava.model.Invoice;
import org.neuedu.hisjava.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckApplyService {
    @Autowired
    CheckApplyMapper checkApplyMapper;
    @Autowired
    InvoiceMapper invoiceMapper;

    public RespBean updateState(Integer[] ids) {
        int i =checkApplyMapper.updateState(ids);
        if(i!=0){
                return RespBean.ok(200,"交费成功") ;
        }else{
            return RespBean.error(500,"交费失败") ;
        }
    }

    public RespBean addInvoice(Invoice invoice) {
        int i =invoiceMapper.insertSelective(invoice);
        if(i!=0){
            return RespBean.ok(200,"生成发票成功") ;
        }else{
            return RespBean.error(500,"生成发票失败") ;
        }
    }

    public RespBean updateRefundState(Integer[] ids) {
        int i =checkApplyMapper.updateRefundState(ids);
        if(i!=0){
            return RespBean.ok(200,"退费成功") ;
        }else{
            return RespBean.error(500,"退费失败") ;
        }
    }
}
