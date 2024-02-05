package com.example.CouponManagementSystemTask.service;

import com.example.CouponManagementSystemTask.dto.TicketDto;
import com.example.CouponManagementSystemTask.model.Ticket;
import com.example.CouponManagementSystemTask.repositories.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TicketService {
    private final TicketRepository repository;

    public TicketService(TicketRepository repository) {
        this.repository = repository;
    }
    public Ticket saveTicket(TicketDto dto) {
        dto.setId(UUID.randomUUID());

        Ticket ticket = new Ticket();
        ticket.setId(dto.getId());
        ticket.setSlotId(dto.getSlotId());
        ticket.setPatientId(dto.getPatientId());

        return repository.save(ticket);
    }
}
