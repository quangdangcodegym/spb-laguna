package com.cg.spblaguna.model;

import com.cg.spblaguna.model.dto.res.BookingDetailServiceResDTO;
import com.cg.spblaguna.model.enumeration.EBookingServiceType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "booking_detail_services")
public class BookingDetailService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "booking_detail_id")
    private BookingDetail bookingDetail;

    @ManyToOne
    @JoinColumn(name = "booking_service_id")
    private BookingService bookingService;

    @Enumerated(EnumType.STRING)
    private EBookingServiceType bookingServiceType;

    @Column(name = "number_car", nullable = true)
    private Long numberCar;

    @Column(name = "number_person", nullable = true)
    private Long numberPerson;

    @Column(name = "date_choose_service", nullable = true)
    private LocalDate dateChooseService;

    private BigDecimal vat;
    private BigDecimal total;

    private BigDecimal price;

    public BookingDetailServiceResDTO toBookingDetailServiceResDTO(){
        BookingDetailServiceResDTO bookingDetailServiceResDTO = new BookingDetailServiceResDTO();
        bookingDetailServiceResDTO.setBookingServiceType(bookingServiceType);
        bookingDetailServiceResDTO.setPrice(price);
        bookingDetailServiceResDTO.setBookingService(this.bookingService.toBookingServiceDTO());
        bookingDetailServiceResDTO.setDateChooseService(this.dateChooseService);
        bookingDetailServiceResDTO.setTotal(this.total);
        bookingDetailServiceResDTO.setVat(this.vat);
        bookingDetailServiceResDTO.setNumberPerson(this.numberPerson);
        bookingDetailServiceResDTO.setNumberCar(this.numberCar);
        bookingDetailServiceResDTO.setId(this.id);

        return bookingDetailServiceResDTO;
    }
}
