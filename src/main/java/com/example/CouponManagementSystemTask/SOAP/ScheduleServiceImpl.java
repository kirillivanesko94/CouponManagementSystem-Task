package com.example.CouponManagementSystemTask.SOAP;

import com.example.CouponManagementSystemTask.model.Slot;

import java.util.*;
import javax.jws.WebService;

@WebService(
        serviceName = "Schedule",
        portName = "SchedulePort",
        targetNamespace = "http://service.ws.sample/",
        endpointInterface = "com.example.CouponManagementSystemTask.SOAP.ScheduleService")
public class ScheduleServiceImpl implements ScheduleService {
    @Override
    public List<Slot> createSchedule(Date startDate, Date endDate, Long doctorId, Integer duration) {
        List<Slot> result = new ArrayList<>();
        while (startDate.toInstant().isBefore(endDate.toInstant())) {
            Slot slot = new Slot();
            slot.setId(UUID.randomUUID());
            slot.setDoctorId(doctorId);

            result.add(slot);
        }

        return result;
    }
}
