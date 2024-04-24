package com.sebas.demo.services;

import java.util.List;

import com.sebas.demo.dto.InventarioDTO;

public interface ServiceInventario {
    
    List<InventarioDTO> findAll();
}
