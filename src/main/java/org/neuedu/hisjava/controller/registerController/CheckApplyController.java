package org.neuedu.hisjava.controller.registerController;

import org.neuedu.hisjava.model.Invoice;
import org.neuedu.hisjava.model.RespBean;
import org.neuedu.hisjava.service.registerService.CheckApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckApplyController {
    @Autowired
    CheckApplyService checkApplyService;
    @PostMapping("/updateState")
    public RespBean updateState(Integer[] ids){
        return checkApplyService.updateState(ids);
    }
    @PostMapping("/updateRefundState")
    public RespBean updateRefundState(Integer[] ids){
        return checkApplyService.updateRefundState(ids);
    }
    @PostMapping("/addInvoice")
    public RespBean addInvoice(@RequestBody Invoice invoice){
        return checkApplyService.addInvoice(invoice);
    }
}
