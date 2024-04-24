package com.sebas.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sebas.demo.dto.OrdenDTO;
import com.sebas.demo.services.ServiceOrden;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/ordenes")
@AllArgsConstructor
public class OrdenController {
    
    @Autowired
    private ServiceOrden serviceOrden;

    @GetMapping("/")
    public ResponseEntity<List<OrdenDTO>> getAllOrden() {
        List<OrdenDTO> ordenes = serviceOrden.findAll();
        return ResponseEntity.ok(ordenes);
    }
}
