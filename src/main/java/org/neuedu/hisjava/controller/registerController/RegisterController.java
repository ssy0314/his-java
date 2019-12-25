package org.neuedu.hisjava.controller.registerController;

import org.neuedu.hisjava.model.*;
import org.neuedu.hisjava.service.registerService.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegisterController {
    @Autowired
    RegisterService registService;
    @GetMapping("/searchGender")
    public List<Constantitem> searchGender(){
        return registService.searchGender();
    }
    @GetMapping("/searchCharge")
    public List<Constantitem> searchCharge(){
        return registService.searchCharge();
    }
    @GetMapping("/searchSettle")
    public List<Settlecategory> searchSettle(){
        return registService.searchSettle();
    }
    @GetMapping("/searchRegister")
    public Register searchRegister(){
        return registService.searchRegister();
    }
    @GetMapping("/searchInvoice")
    public Invoice searchInvoice(){
        return registService.searchInvoice();
    }
    @PostMapping("/addRegister")
    public RespBean addRegister(@RequestBody Register register){
        return registService.addRegister(register);
    }

}
