package com.sebas.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventarioDTO {
    
    private Long id;
    private String codigo;
    private String nombrePrenda;
    private Double valorVta;
    private Double valorVtaUsd;
    private String talla;
    private String color;
}
