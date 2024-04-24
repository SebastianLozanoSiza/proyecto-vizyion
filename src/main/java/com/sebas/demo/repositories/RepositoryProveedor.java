package com.sebas.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sebas.demo.repositories.entities.Proveedor;

public interface RepositoryProveedor extends CrudRepository<Proveedor,Long>{
    
}
