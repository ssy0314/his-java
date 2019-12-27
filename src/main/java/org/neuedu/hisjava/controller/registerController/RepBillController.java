package org.neuedu.hisjava.controller.registerController;

import org.neuedu.hisjava.model.RespBean;
import org.neuedu.hisjava.service.registerService.RepBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RepBillController {
@Autowired
    RepBillService repBillService;
    @PutMapping("/updateRepBill")
    public RespBean updateRepBill(String id){
        return repBillService.updateRepBill(id);
    }
}
