package com.sebas.demo.services;

import java.util.List;

import com.sebas.demo.dto.ProveedorDTO;

public interface ServiceProveedor {
    
    List<ProveedorDTO> findAll();
}
