package com.example.CouponManagementSystemTask.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.security.Timestamp;
import java.util.UUID;
@Entity
@Table(name = "slot")
public class Slot {
    @Id
    @Column(name = "id")
    private UUID id;
    @Column(name = "time_start")
    @NotNull
    private Timestamp timeStart;
    @Column(name = "time_end")
    @NotNull
    private Timestamp timeEnd;
    @Column(name = "doctor_id")
    @NotNull
    private UUID doctorId;

    public Slot() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Timestamp getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Timestamp timeStart) {
        this.timeStart = timeStart;
    }

    public Timestamp getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Timestamp timeEnd) {
        this.timeEnd = timeEnd;
    }

    public UUID getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(UUID doctorId) {
        this.doctorId = doctorId;
    }
}
