package com.rezervimet.services;

import com.rezervimet.entities.Reservation;
import com.rezervimet.models.ReservationDto;
import com.rezervimet.repositories.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReservationServices {
    boolean add(ReservationDto reservationDto);
    List<ReservationDto> getAll();

    ReservationDto getById(long id);

    boolean update(long id, ReservationDto updatedDriverDto);

    boolean deleteById(long id);

}
