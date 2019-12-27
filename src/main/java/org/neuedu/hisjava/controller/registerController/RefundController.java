package org.neuedu.hisjava.controller.registerController;


import org.neuedu.hisjava.model.Register;
import org.neuedu.hisjava.service.registerService.RefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RefundController {
    @Autowired
    RefundService service;
    @GetMapping("/searchRegisterRefundByasenumber")
    public List<Register> searchRegisterRefundByasenumber(String casenumber){
        return service.searchRegisterRefundByasenumber(casenumber);
    }
}
