package org.neuedu.hisjava.controller.registerController;

import org.neuedu.hisjava.model.Register;
import org.neuedu.hisjava.service.registerService.ChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChargeController {
    @Autowired
    ChargeService chargeService;
    @GetMapping("/searchRegisterByasenumber")
    public List<Register> searchRegisterByasenumber(String casenumber){
        return chargeService.searchRegisterByasenumber(casenumber);
    }
}
