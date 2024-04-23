package com.sebas.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sebas.demo.dto.VentaDTO;
import com.sebas.demo.services.ServiceVenta;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/ventas")
@AllArgsConstructor
public class VentaController {

    @Autowired
    private ServiceVenta serviceVenta;

    @GetMapping("/mes/{year}/{month}")
    public ResponseEntity<List<VentaDTO>> getVentasByMes(@PathVariable int year, @PathVariable int month) {
        List<VentaDTO> ventas = serviceVenta.getVentasByMes(year, month);
        return ResponseEntity.ok(ventas);
    }
    
}
