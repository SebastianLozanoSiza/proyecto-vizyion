package com.sebas.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sebas.demo.dto.InventarioDTO;
import com.sebas.demo.services.ServiceInventario;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/inventario")
@AllArgsConstructor
public class InventarioController {
    
    @Autowired
    private ServiceInventario serviceInventario;

    @GetMapping("/")
    public ResponseEntity<List<InventarioDTO>> getAllInventario() {
        List<InventarioDTO> inventario = serviceInventario.findAll();
        return ResponseEntity.ok(inventario);
    }
}
