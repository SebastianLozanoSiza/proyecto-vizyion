package com.sebas.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sebas.demo.repositories.entities.Orden;

public interface RepositoryOrden extends CrudRepository<Orden,Long>{
    
}
