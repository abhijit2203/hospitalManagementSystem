package com.codingshuttle.hospitalManagementSystem.repository;

import com.codingshuttle.hospitalManagementSystem.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}