package com.example.CouponManagementSystemTask.repositories;

import com.example.CouponManagementSystemTask.model.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor, String> {
}
