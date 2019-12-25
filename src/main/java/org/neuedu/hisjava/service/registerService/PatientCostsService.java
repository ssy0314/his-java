package org.neuedu.hisjava.service.registerService;

import org.neuedu.hisjava.mapper.PatientcostsMapper;
import org.neuedu.hisjava.mapper.RegisterMapper;
import org.neuedu.hisjava.model.CountAndSum;
import org.neuedu.hisjava.model.Patientcosts;
import org.neuedu.hisjava.model.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientCostsService {
    @Autowired
    PatientcostsMapper patientcostsMapper;
    @Autowired
    RegisterMapper registerMapper;
    public List<Patientcosts> getPatientCosts(Register register) {
        return patientcostsMapper.getPatientCosts(register);

    }

    public Register searchPatientInfo(Register register) {
        return registerMapper.searchPatientInfo(register);
    }

    public CountAndSum getCount(Register register) {
        return patientcostsMapper.getCount(register);
    }
}
