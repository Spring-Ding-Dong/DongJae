package com.springDingDong.dongjae.assignment2.service;

import com.springDingDong.dongjae.assignment2.dto.BookingRequestDto;
import com.springDingDong.dongjae.assignment2.dto.BookingResponseDto;
import com.springDingDong.dongjae.assignment2.model.Booking;
import com.springDingDong.dongjae.assignment2.model.Ticket;
import com.springDingDong.dongjae.assignment2.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingService {
    private final BookingRepository bookingRepository;

    public BookingResponseDto createBooking(BookingRequestDto requestDto) {
        Ticket ticket = new Ticket(requestDto.getBookingNum(), requestDto.getSeat());
        Booking booking = new Booking(requestDto.getName(), ticket);
        bookingRepository.save(booking);

        BookingResponseDto response = new BookingResponseDto();
        response.setBookingNum(ticket.getBookingNum());
        response.setSeat(ticket.getSeat());
        response.setMessage("예약 완료.");
        return response;
    }

    public String updateSeat(String bookingNum, String seat) {
        Booking booking = bookingRepository.findByTicketBookingNum(bookingNum);
        booking.getTicket().setSeat(seat);
        bookingRepository.save(booking);
        return "좌석이 " + seat + "으로 변경되었습니다.";
    }

    public void deleteBooking(String bookingNum) {
        Booking booking = bookingRepository.findByTicketBookingNum(bookingNum);
        bookingRepository.delete(booking);
    }
}
