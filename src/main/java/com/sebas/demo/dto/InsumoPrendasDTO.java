package com.sebas.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsumoPrendasDTO {
    
    private String nombre;
    private Double valorUnitario;
    private Double stockMin;
    private Double stockMax;
    private int cantidad;
}
