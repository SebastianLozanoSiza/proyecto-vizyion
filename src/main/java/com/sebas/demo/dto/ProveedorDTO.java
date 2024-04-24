package com.sebas.demo.dto;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProveedorDTO {
    
    private Long id;
    private String nit;
    private String nombre;
    private String tipoPersona;
    private String municipio;
    private List<InsumoProveedorDTO> listaInsumos;
}
