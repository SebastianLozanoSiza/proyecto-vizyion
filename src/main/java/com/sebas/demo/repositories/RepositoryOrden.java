package com.sebas.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sebas.demo.repositories.entities.Orden;

public interface RepositoryOrden extends CrudRepository<Orden,Long>{
    
    List<Orden> findByEstadoDescripcion(String descripcionEstado);
}
