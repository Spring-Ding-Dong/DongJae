package com.springDingDong.dongjae.assignment2.controller;

import com.springDingDong.dongjae.assignment2.dto.BookingRequestDto;
import com.springDingDong.dongjae.assignment2.dto.BookingResponseDto;
import com.springDingDong.dongjae.assignment2.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("booking")
@RequiredArgsConstructor
public class BookingController {
    private final BookingService bookingService;

    @PostMapping("")
    public BookingResponseDto createBooking(@RequestBody BookingRequestDto requestDto) {
        return bookingService.createBooking(requestDto);
    }
    @PatchMapping("/{bookingNum}/{seat}")
    public String updateSeat(@PathVariable String bookingNum, @PathVariable String seat) {
        return bookingService.updateSeat(bookingNum, seat);
    }
    @DeleteMapping("/{bookingNum}")
    public String deleteBooking(@PathVariable String bookingNum) {
        bookingService.deleteBooking(bookingNum);
        return "예약이 취소되었습니다..";
    }
}
