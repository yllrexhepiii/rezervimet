package com.rezervimet.mapper;

import com.rezervimet.entities.Reservation;
import com.rezervimet.models.ReservationDto;
import org.springframework.stereotype.Component;

@Component
public class ReservationMapper {

    public Reservation toEntity(ReservationDto from){
        var to = new Reservation();
        to.setId(from.getId());
        to.setCheckInDate(from.getCheckInDate());
        to.setCheckOutDate(from.getCheckOutDate());
        return to;
    }

    public ReservationDto toDto(Reservation from){
        var to = new ReservationDto();
        to.setId(from.getId());
        to.setCheckInDate(from.getCheckInDate());
        to.setCheckOutDate(from.getCheckOutDate());
        return to;
    }
}
