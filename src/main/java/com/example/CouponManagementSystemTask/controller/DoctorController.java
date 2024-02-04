package com.example.CouponManagementSystemTask.controller;

import com.example.CouponManagementSystemTask.dto.DoctorDto;
import com.example.CouponManagementSystemTask.model.Doctor;
import com.example.CouponManagementSystemTask.service.DoctorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "doctor")
public class DoctorController {
    private final DoctorService service;

    public DoctorController(DoctorService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Doctor> saveDoctor(@RequestBody DoctorDto dto) {
        return ResponseEntity.ok(service.saveDoctor(dto));
    }
}
