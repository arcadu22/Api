package com.example.demo.repositorioes;

import com.example.demo.models.Reserva;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoriesReserva extends CrudRepository<Reserva,Long>{
    
}