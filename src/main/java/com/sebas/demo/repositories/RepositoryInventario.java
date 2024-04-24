package com.sebas.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sebas.demo.repositories.entities.Inventario;

public interface RepositoryInventario extends CrudRepository<Inventario,Long>{
    
}
