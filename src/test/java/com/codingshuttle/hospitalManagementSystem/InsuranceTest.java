package com.codingshuttle.hospitalManagementSystem;

import com.codingshuttle.hospitalManagementSystem.entity.Appointment;
import com.codingshuttle.hospitalManagementSystem.entity.Insurance;
import com.codingshuttle.hospitalManagementSystem.service.AppointmentService;
import com.codingshuttle.hospitalManagementSystem.service.InsuranceService;
import com.codingshuttle.hospitalManagementSystem.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class InsuranceTest {

    @Autowired
    private PatientService patientService;

    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private AppointmentService appointmentService;

    @Test
    public void testAssignInsuranceToPatient(){
        Insurance insurance=Insurance.builder()
                .provider("HDFC Ergo")
                .policyNumber("HDFC_23G")
                .validUntil(LocalDate.of(2030,1,1))
                .build();

        var updatedInsurance = insuranceService.assignInsuranceToPatient(insurance,1l);
        System.out.println(updatedInsurance);

       // patientService.deletePatient(1l);

        var patient =insuranceService.removeInsuranceToPatient(1l);
        System.out.println(patient);
    }

    @Test
    public void testCreateAppointment(){
        Appointment appointment=Appointment.builder()
                .appointmentTime(LocalDateTime.of(2025,11,1,14,0,0))
                .reason("Cancer")
                .build();

       var updatedAppointment= appointmentService.createNewAppointment(appointment,1l,2l);
        System.out.println(updatedAppointment);

        patientService.deletePatient(1l);
    }
}