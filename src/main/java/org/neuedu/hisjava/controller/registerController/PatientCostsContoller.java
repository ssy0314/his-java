package org.neuedu.hisjava.controller.registerController;

import org.neuedu.hisjava.model.CountAndSum;
import org.neuedu.hisjava.model.Patientcosts;
import org.neuedu.hisjava.model.Register;
import org.neuedu.hisjava.service.registerService.PatientCostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientCostsContoller {
    @Autowired
    PatientCostsService patientCostsService;
    @GetMapping("/getPatientCosts")
    public List<Patientcosts> getPatientCosts(Register register){

           return patientCostsService.getPatientCosts(register);
    }
    @GetMapping("/searchPatientInfo")
    public Register searchPatientInfo(Register register){
        return  patientCostsService.searchPatientInfo(register);
    }
    @GetMapping("/getCount")
    public CountAndSum getCount(Register register){
        return patientCostsService.getCount(register);
    }
}
