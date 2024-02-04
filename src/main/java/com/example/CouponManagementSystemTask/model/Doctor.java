package com.example.CouponManagementSystemTask.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @Column(name = "id")
    private UUID id;
    @Column(name = "name")
    @NotNull
    private String name;
    @Column(name = "patient_id")
    @NotNull
    private UUID patientId;

    public Doctor() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getPatientId() {
        return patientId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }
}
