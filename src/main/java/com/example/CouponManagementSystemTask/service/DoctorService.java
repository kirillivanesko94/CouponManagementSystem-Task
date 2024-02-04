package com.example.CouponManagementSystemTask.service;

import com.example.CouponManagementSystemTask.dto.DoctorDto;
import com.example.CouponManagementSystemTask.model.Doctor;
import com.example.CouponManagementSystemTask.repositories.DoctorRepository;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    private final DoctorRepository repository;

    public DoctorService(DoctorRepository repository) {
        this.repository = repository;
    }

    public Doctor saveDoctor(DoctorDto dto) {
        Doctor doctor = new Doctor();
        doctor.setId(dto.getId());
        doctor.setName(dto.getName());
        doctor.setPatientId(dto.getPatientId());

        return repository.save(doctor);
    }
}
