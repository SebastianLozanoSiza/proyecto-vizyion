package com.sebas.demo.services;

import java.util.List;

import com.sebas.demo.dto.EmpleadoDTO;
import com.sebas.demo.dto.VentaClientesDTO;
import com.sebas.demo.dto.VentaDTO;

public interface ServiceVenta {
    
    List<VentaDTO> getVentasByMes(int year, int month);

    List<VentaClientesDTO> findAll();

    List<VentaDTO> findVentasByEmpleado(EmpleadoDTO empleadoDTO);
}
