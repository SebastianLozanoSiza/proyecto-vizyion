package com.sebas.demo.repositories.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "El nombre del cliente no puede estar vacio")
    @Column(nullable = false)
    private String nombre;

    @NotEmpty(message = "El id del cliente no puede estar vacio")
    @Column(nullable = false, name = "IdCLiente")
    private String idCliente;

    @JoinColumn(name = "IdTipoPersonaFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoPersona tipoPersona;

    @NotNull(message = "La fecha no puede estar vacía")
    @Column(nullable = false, name = "fechaRegistro")
    private Date fecha;

    @JoinColumn(name = "IdMunicipioFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Municipio municipio;
}
