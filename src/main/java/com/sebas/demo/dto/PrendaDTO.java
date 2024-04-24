package com.sebas.demo.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrendaDTO {
    
    private Long id;
    private String nombre;
    private Double valorUnit;
    private Double valorUnitUsd;
    private String estado;
    private String tipoProteccion;
    private String genero;
    private String codigo;
    private List<InsumoPrendasDTO> listaStock;

}
