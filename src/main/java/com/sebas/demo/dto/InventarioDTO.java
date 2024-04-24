package com.sebas.demo.dto;


import java.util.List;

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
    private String color;
    private Double valorVta;
    private Double valorVtaUsd;
    private List<InventarioTallaDTO> talla;
}
