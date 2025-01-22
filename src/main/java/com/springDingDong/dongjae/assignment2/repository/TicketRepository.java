package com.springDingDong.dongjae.assignment2.repository;

import com.springDingDong.dongjae.assignment2.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
