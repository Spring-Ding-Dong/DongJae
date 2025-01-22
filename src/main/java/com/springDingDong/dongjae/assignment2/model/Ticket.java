package com.springDingDong.dongjae.assignment2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String bookingNum; // 예약번호
    private String seat; // 좌석번호
    public Ticket(String bookingNum, String seat) {
        this.bookingNum = bookingNum;
        this.seat = seat;
    }
}
