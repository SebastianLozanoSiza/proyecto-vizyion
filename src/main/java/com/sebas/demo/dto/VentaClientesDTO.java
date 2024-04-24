package com.sebas.demo.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VentaClientesDTO {

    private Long id;
    private Date fecha;
    private String nombreCliente;
    private String clienteCedula;
    private String tipoPersona;
    private Date fechaRegistro;
    private String municipio;
    private String formaPago;
    
}
