package com.rezervimet.controllers;

import com.rezervimet.entities.Client;
import com.rezervimet.models.ClientDto;
import com.rezervimet.models.ReservationDto;
import com.rezervimet.services.ClientService;
import com.rezervimet.services.ReservationServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService service){
        this.clientService = service;
    }

    @GetMapping
    public List<ClientDto> getAllReservation(){
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public ClientDto getClientById(@PathVariable long id){
        return clientService.getById(id);
    }

    @PostMapping
    public void addClient(@RequestBody ClientDto clientDto){
        clientService.add(clientDto);
    }

    @PutMapping("/{id}")
    public void updateDriver(@PathVariable long id, @RequestBody ClientDto clientDto) {
        clientService.update(id, clientDto);

    }


    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        clientService.deleteById(id);
    }

}
