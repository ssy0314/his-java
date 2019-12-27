package org.neuedu.hisjava.controller.registerController;


import org.neuedu.hisjava.model.Register;
import org.neuedu.hisjava.model.RespBean;
import org.neuedu.hisjava.service.registerService.FlogHeavilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlogHeavilyController {
    @Autowired
    FlogHeavilyService flogHeavilyService;
    @GetMapping("/searchInvoiceInformation")
    public List<Register> searchInvoiceInformation(String casenumber){
        return flogHeavilyService.searchInvoiceInformation(casenumber);
    }
    @PutMapping("/updateFlogHeavily")
    public RespBean updateFlogHeavily(String id){
        return flogHeavilyService.updateFlogHeavily(id);
    }
}
