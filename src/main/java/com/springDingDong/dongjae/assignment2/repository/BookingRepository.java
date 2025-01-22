package com.springDingDong.dongjae.assignment2.repository;

import com.springDingDong.dongjae.assignment2.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    Booking findByTicketBookingNum(String bookingNum);
}
