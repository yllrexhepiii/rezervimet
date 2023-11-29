package com.rezervimet.controllers;


import com.rezervimet.entities.Reservation;
import com.rezervimet.models.ReservationDto;
import com.rezervimet.services.ReservationServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
@CrossOrigin(origins = "*")
public class ReservationController {
    private ReservationServices reservationServices;

    public ReservationController(ReservationServices services){
        this.reservationServices = services;
    }

    @GetMapping
    public List<ReservationDto> getAllReservation(){
        return reservationServices.getAll();
    }

    @GetMapping("/{id}")
    public ReservationDto getReservationById(@PathVariable long id){
        return reservationServices.getById(id);
    }

    @PostMapping
    public void addReservation(@RequestBody ReservationDto reservationDto){
        reservationServices.add(reservationDto);
    }

    @PutMapping("/{id}")
    public void updateDriver(@PathVariable long id, @RequestBody ReservationDto reservationDto) {
        reservationServices.update(id, reservationDto);

    }


    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        reservationServices.deleteById(id);
    }

}
