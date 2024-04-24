package com.sebas.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpresaDTO {
    
    private Long id;
    private String nit;
    private String razonSocial;
    private String representante;
    private String municipio;
}
