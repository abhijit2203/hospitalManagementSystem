package com.codingshuttle.hospitalManagementSystem.service;

import com.codingshuttle.hospitalManagementSystem.entity.Insurance;
import com.codingshuttle.hospitalManagementSystem.entity.Patient;
import com.codingshuttle.hospitalManagementSystem.repository.InsuranceRepository;
import com.codingshuttle.hospitalManagementSystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {

    private final PatientRepository patientRepository;
    private final InsuranceRepository insuranceRepository;

    @Transactional
    public  Insurance assignInsuranceToPatient(Insurance insurance, Long patientId){

        Patient patient=patientRepository.findById(patientId).orElseThrow();
        patient.setInsurance(insurance);// dirty patient
        insurance.setPatient(patient); // optional, for inverse side
        return insurance;
    }


}
