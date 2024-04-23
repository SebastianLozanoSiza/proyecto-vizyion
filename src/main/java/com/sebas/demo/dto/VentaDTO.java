package com.sebas.demo.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VentaDTO {
    
    private Long id;
    private Date fecha;
    private String nombreEmpleado;
    private String nombreCliente;
    private String formaPago;
    
}
