package com.example.CouponManagementSystemTask.service;

import com.example.CouponManagementSystemTask.dto.PatientDto;
import com.example.CouponManagementSystemTask.model.Patient;
import com.example.CouponManagementSystemTask.repositories.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class PatientService {
    private final PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }
    public Patient savePatient(PatientDto dto) {
        dto.setId(UUID.randomUUID());

        Patient patient = new Patient();
        patient.setId(dto.getId());
        patient.setName(dto.getName());
        patient.setDateOfBirth(dto.getDateOfBirth());
        patient.setDoctorId(dto.getDoctorId());

        return repository.save(patient);
    }
}
