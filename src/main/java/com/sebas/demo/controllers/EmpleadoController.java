package com.sebas.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sebas.demo.dto.EmpleadoDTO;
import com.sebas.demo.services.ServiceEmpleado;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/empleados")
@AllArgsConstructor
public class EmpleadoController {
    
    @Autowired
    private ServiceEmpleado serviceEmpleado;

    @GetMapping("/")
    public ResponseEntity<List<EmpleadoDTO>> getAllEmpleados() {
        List<EmpleadoDTO> empleados = serviceEmpleado.findAll();
        return ResponseEntity.ok(empleados);
    }
}
