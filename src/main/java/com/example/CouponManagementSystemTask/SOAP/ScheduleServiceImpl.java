package com.example.CouponManagementSystemTask.SOAP;

import com.example.CouponManagementSystemTask.dto.SlotDto;
import com.example.CouponManagementSystemTask.model.Slot;
import com.example.CouponManagementSystemTask.repositories.SlotRepository;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import javax.jws.WebService;

@WebService(
        serviceName = "Schedule",
        portName = "SchedulePort",
        targetNamespace = "http://service.ws.sample/",
        endpointInterface = "com.example.CouponManagementSystemTask.SOAP.ScheduleService")
public class ScheduleServiceImpl implements ScheduleService {
    private final SlotRepository repository;

    public ScheduleServiceImpl(SlotRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Slot> createSchedule(Date startDate, Date endDate, UUID doctorId, Integer duration) {
        List<Slot> result = new ArrayList<>();
        LocalDateTime currentDateTime = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime endDateTime = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

        while (currentDateTime.isBefore(endDateTime)) {
            SlotDto dto = new SlotDto();
            dto.setDoctorId(doctorId);
            dto.setId(UUID.randomUUID());

            Slot slot = new Slot();
            slot.setId(dto.getId());
            slot.setDoctorId(dto.getDoctorId());

            result.add(slot);
            currentDateTime = currentDateTime.plusMinutes(duration);
        }

        repository.saveAll(result);

        return result;
    }
}
