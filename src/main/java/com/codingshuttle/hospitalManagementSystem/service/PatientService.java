package com.codingshuttle.hospitalManagementSystem.service;

import com.codingshuttle.hospitalManagementSystem.entity.Patient;
import com.codingshuttle.hospitalManagementSystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {

    private  final PatientRepository patientRepository;

    @Transactional
    public void testPatientTransaction(){

        Patient p1=patientRepository.findById(1l).orElseThrow();
        Patient p2=patientRepository.findById(1l).orElseThrow();

        System.out.println(p1+" "+p2);
        System.out.println(p1==p2);

        p1.setName("Random name");
    }
}
