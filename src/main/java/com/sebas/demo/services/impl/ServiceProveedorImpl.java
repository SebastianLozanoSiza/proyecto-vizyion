package com.sebas.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sebas.demo.config.ProveedorDTOConverter;
import com.sebas.demo.dto.ProveedorDTO;
import com.sebas.demo.repositories.RepositoryProveedor;
import com.sebas.demo.repositories.entities.Proveedor;
import com.sebas.demo.services.ServiceProveedor;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServiceProveedorImpl implements ServiceProveedor {

    @Autowired
    private RepositoryProveedor repositoryProveedor;

    @Autowired
    private ProveedorDTOConverter convert;

    @Override
    @Transactional(readOnly = true)
    public List<ProveedorDTO> findAll() {
        List<Proveedor> proveedores = (List<Proveedor>) repositoryProveedor.findAll();
        return proveedores.stream()
                .map(proveedor -> convert.convertToDTO(proveedor))
                .toList();
    }

}
