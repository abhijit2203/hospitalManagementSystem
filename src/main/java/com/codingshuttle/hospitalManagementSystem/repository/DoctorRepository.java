package com.codingshuttle.hospitalManagementSystem.repository;

import com.codingshuttle.hospitalManagementSystem.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}