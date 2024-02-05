package com.example.CouponManagementSystemTask.repositories;

import com.example.CouponManagementSystemTask.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, String> {

}
