package com.sebas.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sebas.demo.repositories.entities.Empleado;

public interface RepositoryEmpleado extends CrudRepository<Empleado, Long>{
    
}
