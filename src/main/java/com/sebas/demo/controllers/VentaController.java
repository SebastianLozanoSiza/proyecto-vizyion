package com.sebas.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sebas.demo.dto.EmpleadoDTO;
import com.sebas.demo.dto.VentaClientesDTO;
import com.sebas.demo.dto.VentaDTO;
import com.sebas.demo.services.ServiceVenta;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/ventas")
@AllArgsConstructor
public class VentaController {

    @Autowired
    private ServiceVenta serviceVenta;

    @GetMapping("/")
    public ResponseEntity<List<VentaClientesDTO>> getAllVentas() {
        List<VentaClientesDTO> ventas = serviceVenta.findAll();
        return ResponseEntity.ok(ventas);
    }

    @GetMapping("/mes/{year}/{month}")
    public ResponseEntity<List<VentaDTO>> getVentasByMes(@PathVariable int year, @PathVariable int month) {
        List<VentaDTO> ventas = serviceVenta.getVentasByMes(year, month);
        return ResponseEntity.ok(ventas);
    }

    @GetMapping("/empleado/{empleadoId}")
    public ResponseEntity<List<VentaDTO>> getVentasByEmpleado(@PathVariable Long empleadoId) {
        EmpleadoDTO empleadoDTO = new EmpleadoDTO();
        empleadoDTO.setId(empleadoId);
        List<VentaDTO> ventas = serviceVenta.findVentasByEmpleado(empleadoDTO);
        return ResponseEntity.ok(ventas);
    }
    
}
