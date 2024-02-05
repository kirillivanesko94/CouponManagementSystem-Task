package com.example.CouponManagementSystemTask.controller;

import com.example.CouponManagementSystemTask.dto.TicketDto;
import com.example.CouponManagementSystemTask.model.Ticket;
import com.example.CouponManagementSystemTask.service.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ticket")
public class TicketController {
    private final TicketService service;

    public TicketController(TicketService service) {
        this.service = service;
    }
    @PostMapping("save")
    public ResponseEntity<Ticket> saveTicket(@RequestBody TicketDto dto) {
        return ResponseEntity.ok(service.saveTicket(dto));
    }
}
