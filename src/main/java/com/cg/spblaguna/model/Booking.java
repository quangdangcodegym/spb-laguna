package com.cg.spblaguna.model;

import com.cg.spblaguna.model.enumeration.EBookingStatus;
import com.cg.spblaguna.model.enumeration.EDepositedStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Column(name = "create_at")
    private LocalDateTime createAt;


    /**
     * total: is full total_booking_details
     */
    private BigDecimal total;

    @Enumerated(EnumType.STRING)
    @Column(name = "booking_status")
    private EBookingStatus bookingStatus;

    @Column(name = "deposited_number")
    private BigDecimal depositedNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "deposited_status")
   private EDepositedStatus depositedStatus;


    @Column(name = "deleted", columnDefinition = "boolean default false")
    private Boolean deleted;



    private Boolean reminderSent = false ;

}
