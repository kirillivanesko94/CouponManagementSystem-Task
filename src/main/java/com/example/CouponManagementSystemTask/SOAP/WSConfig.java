package com.example.CouponManagementSystemTask.SOAP;

import com.example.CouponManagementSystemTask.repositories.SlotRepository;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;


@Configuration
public class WSConfig {
    private final SlotRepository repository;

    public WSConfig(SlotRepository repository) {
        this.repository = repository;
    }

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint scheduleEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new ScheduleServiceImpl(repository));
        endpoint.publish("/ServiceSchedule");

        return endpoint;
    }
}

