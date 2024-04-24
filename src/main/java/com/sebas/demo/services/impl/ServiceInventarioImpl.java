package com.sebas.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sebas.demo.config.InventarioDTOConverter;
import com.sebas.demo.dto.InventarioDTO;
import com.sebas.demo.repositories.RepositoryInventario;
import com.sebas.demo.repositories.entities.Inventario;
import com.sebas.demo.services.ServiceInventario;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServiceInventarioImpl implements ServiceInventario{
    
    @Autowired
    private RepositoryInventario repositoryInventario;

    @Autowired
    private InventarioDTOConverter convert;

    @Override
    @Transactional(readOnly = true)
    public List<InventarioDTO> findAll() {
        List<Inventario> inventarios = (List<Inventario>) repositoryInventario.findAll();
        return inventarios.stream()
                .map(inventario -> convert.convertToDTO(inventario))
                .toList();
    }
    
}
