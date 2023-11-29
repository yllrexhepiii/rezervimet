package com.rezervimet.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDto {

    private long id;

    private Date checkInDate;

    private Date checkOutDate;
}
