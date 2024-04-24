package com.sebas.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sebas.demo.dto.ProveedorDTO;
import com.sebas.demo.services.ServiceProveedor;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/proveedores")
@AllArgsConstructor
public class ProveedorController {
    
    @Autowired
    private ServiceProveedor serviceProveedor;

    @GetMapping("/")
    public ResponseEntity<List<ProveedorDTO>> getAllProveedores() {
        List<ProveedorDTO> proveedor = serviceProveedor.findAll();
        return ResponseEntity.ok(proveedor);
    }
}
