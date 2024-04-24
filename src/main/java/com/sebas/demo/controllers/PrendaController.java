package com.sebas.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sebas.demo.dto.PrendaDTO;
import com.sebas.demo.services.ServicePrenda;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/prendas")
@AllArgsConstructor
public class PrendaController {
    
    @Autowired
    private ServicePrenda servicePrenda;

    @GetMapping("/")
    public ResponseEntity<List<PrendaDTO>> getAllPrenda() {
        List<PrendaDTO> prendas = servicePrenda.findAll();
        return ResponseEntity.ok(prendas);
    }
}
