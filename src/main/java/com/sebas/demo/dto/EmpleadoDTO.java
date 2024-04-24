package com.sebas.demo.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoDTO {
    
    private Long id;
    private String nombre;
    private String nombreCargo;
    private Date fechaIngreso;
    private String municipio;
}
