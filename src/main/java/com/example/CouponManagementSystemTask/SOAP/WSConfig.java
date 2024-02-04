package com.example.CouponManagementSystemTask.SOAP;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;


@Configuration
public class WSConfig {
    @Autowired
    private Bus bus;

    @Bean
    public Endpoint scheduleEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new ScheduleServiceImpl());
        endpoint.publish("/ServiceSchedule");

        return endpoint;
    }
}

