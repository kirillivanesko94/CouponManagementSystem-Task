package com.example.CouponManagementSystemTask.repositories;

import com.example.CouponManagementSystemTask.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, String> {
}
