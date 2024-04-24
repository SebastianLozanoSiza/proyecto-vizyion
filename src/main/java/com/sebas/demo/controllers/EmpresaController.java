package com.sebas.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sebas.demo.dto.EmpresaDTO;
import com.sebas.demo.services.ServiceEmpresa;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/empresas")
@AllArgsConstructor
public class EmpresaController {
    
    @Autowired
    private ServiceEmpresa serviceEmpresa;

    @GetMapping("/")
    public ResponseEntity<List<EmpresaDTO>> getAllEmpresas() {
        List<EmpresaDTO> empresas = serviceEmpresa.findAll();
        return ResponseEntity.ok(empresas);
    }
}
