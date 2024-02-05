package com.example.CouponManagementSystemTask.SOAP;

import com.example.CouponManagementSystemTask.model.Slot;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@WebService(targetNamespace = "http://service.ws.sample/", name = "ScheduleService")
public interface ScheduleService {
    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(
            localName = "createSchedule",
            targetNamespace = "http://service.ws.sample/",
            className = "sample.ws.service.RequestCreateSchedule")
    @WebMethod(action = "urn:CreateSchedule")
    @ResponseWrapper(
            localName = "createScheduleResponse",
            targetNamespace = "http://service.ws.sample/",
            className = "sample.ws.service.CreateScheduleResponse")
    List<Slot> createSchedule(
            @WebParam(name = "startDate", targetNamespace = "") Date startDate,
            @WebParam(name = "endDate", targetNamespace = "") Date starDate,
            @WebParam(name = "doctorId", targetNamespace = "") UUID id,
            @WebParam(name = "duration", targetNamespace = "") Integer duration);
}
