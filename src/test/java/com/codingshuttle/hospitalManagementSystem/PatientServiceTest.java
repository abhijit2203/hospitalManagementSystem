package com.codingshuttle.hospitalManagementSystem;

import com.codingshuttle.hospitalManagementSystem.dto.BloodGroupStats;
import com.codingshuttle.hospitalManagementSystem.dto.CPatientInfo;
import com.codingshuttle.hospitalManagementSystem.dto.IPatientInfo;
import com.codingshuttle.hospitalManagementSystem.entity.Patient;
import com.codingshuttle.hospitalManagementSystem.repository.PatientRepository;
import com.codingshuttle.hospitalManagementSystem.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;


    @Test
    public void testPatient(){
       // List<Patient> patientList=patientRepository.findAll();

//        List<IPatientInfo> patientInfoList=patientRepository.getAllPatientsInfo();
//        for (IPatientInfo p : patientInfoList) {
//
//            System.out.println("Patient ID: " + p.getId());
//            System.out.println("Patient Name: " + p.getName());
//            System.out.println("Patient Email: " + p.getEmail());
//            System.out.println("---------------------------");
//        }


       // List<CPatientInfo> patientInfoList=patientRepository.getAllPatientInfoConcrete();
//        List<BloodGroupStats> bloodGroupStats=patientRepository.getBloodGroupStats();
//
//        for(var p: bloodGroupStats){
//            System.out.println(p);
//        }

        int rowsAffected=patientRepository.updatePatientNameWithId("Abhijit kumar", 1L);
        System.out.println(rowsAffected);
      //  int rowsAffected=patientRepository.updatePatientNameWithId("Abhijit kumar", 1L);
      //  System.out.println(rowsAffected);

        //Patient patient=new Patient();
       // patientRepository.save(patient);


        patientService.testPatientTransaction();

    }
}
