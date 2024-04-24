package com.sebas.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sebas.demo.repositories.entities.Empresa;

public interface RepositoryEmpresa extends CrudRepository<Empresa, Long>{
    
}
