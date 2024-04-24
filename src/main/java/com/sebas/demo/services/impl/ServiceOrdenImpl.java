package com.sebas.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sebas.demo.config.OrdenDTOConverter;
import com.sebas.demo.dto.OrdenDTO;
import com.sebas.demo.repositories.RepositoryOrden;
import com.sebas.demo.repositories.entities.Orden;
import com.sebas.demo.services.ServiceOrden;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServiceOrdenImpl implements ServiceOrden {
    
    @Autowired
    private RepositoryOrden repositoryOrden;

    @Autowired
    private OrdenDTOConverter convert;


    @Override
    @Transactional(readOnly = true)
    public List<OrdenDTO> findAll() {
        List<Orden> ordenes = (List<Orden>) repositoryOrden.findAll();
        return ordenes.stream()
                .map(orden -> convert.convertToDTO(orden))
                .toList();
    }
    
}
