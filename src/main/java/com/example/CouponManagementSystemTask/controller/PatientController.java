package com.example.CouponManagementSystemTask.controller;

import com.example.CouponManagementSystemTask.dto.PatientDto;
import com.example.CouponManagementSystemTask.model.Patient;
import com.example.CouponManagementSystemTask.service.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("patient")
public class PatientController {
    private final PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<Patient> save(@RequestBody PatientDto dto) {
        return ResponseEntity.ok(service.savePatient(dto));
    }
}
