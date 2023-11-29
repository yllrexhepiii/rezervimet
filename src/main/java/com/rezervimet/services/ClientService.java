package com.rezervimet.services;

import com.rezervimet.entities.Client;
import com.rezervimet.models.ClientDto;
import com.rezervimet.models.ReservationDto;
import com.rezervimet.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {
    boolean add(ClientDto clientDto);
    List<ClientDto> getAll();

    ClientDto getById(long id);

    boolean update(long id, ClientDto updatedDriverDto);

    boolean deleteById(long id);
}
