package com.sebas.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sebas.demo.config.PrendaDTOConverter;
import com.sebas.demo.dto.PrendaDTO;
import com.sebas.demo.repositories.RepositoryPrenda;
import com.sebas.demo.repositories.entities.Prenda;
import com.sebas.demo.services.ServicePrenda;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServicePrendaDTO implements ServicePrenda{
    
    @Autowired
    private RepositoryPrenda repositoryPrenda;

    @Autowired
    private PrendaDTOConverter convert;

    @Override
    @Transactional(readOnly = true)
    public List<PrendaDTO> findAll() {
        List<Prenda> prendas = (List<Prenda>) repositoryPrenda.findAll();
        return prendas.stream()
                    .map(prenda -> convert.convertToDTO(prenda))
                    .toList();
    }
    
}
