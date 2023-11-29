package com.rezervimet.repositories;

import com.rezervimet.entities.Client;
import com.rezervimet.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
