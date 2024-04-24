package com.sebas.demo.services;

import java.util.List;

import com.sebas.demo.dto.EmpleadoDTO;

public interface ServiceEmpleado {
    
    List<EmpleadoDTO> findAll();
}
