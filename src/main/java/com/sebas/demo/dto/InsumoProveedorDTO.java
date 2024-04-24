package com.sebas.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsumoProveedorDTO {
    
    private String nombreInsumo;
    private Double valorUnitario;
    private Double stockMin;
    private Double stockMax;
}
