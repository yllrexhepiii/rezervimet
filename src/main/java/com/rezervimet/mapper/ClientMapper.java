package com.rezervimet.mapper;

import com.rezervimet.entities.Client;
import com.rezervimet.entities.Reservation;
import com.rezervimet.models.ClientDto;
import com.rezervimet.models.ReservationDto;

public class ClientMapper {
    public Client toEntity(ClientDto from){
        var to = new Client();
        to.setId(from.getId());
        to.setName(from.getName());
        to.setEmail(from.getEmail());
        return to;
    }

    public ClientDto toDto(Client from){
        var to = new ClientDto();
        to.setId(from.getId());
        to.setName(from.getName());
        to.setEmail(from.getEmail());
        return to;
    }
}
