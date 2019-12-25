package org.neuedu.hisjava.controller.registerController;


import org.neuedu.hisjava.model.Register;
import org.neuedu.hisjava.service.registerService.OutRegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OutRegistController {
    @Autowired
    OutRegistService outRegistService;
    @GetMapping("/searchAllRegister")
    public List<Register> searchAllRegister(String casenumber){
        return outRegistService.searchAllRegister(casenumber);
    }
}
