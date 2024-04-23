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
@Table(name = "empresa")
public class Empresa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "El nit de la empresa no puede estar vacio")
    @Column(nullable = false)
    private String nit;

    @NotEmpty(message = "La razon social de la empresa no puede estar vacia")
    @Column(nullable = false, name = "razon_social")
    private String razonSocial;

    @NotEmpty(message = "El nombre del representante no puede estar vacio")
    @Column(nullable = false, name = "representante_legal")
    private String representante;

    @NotNull(message = "La fecha no puede estar vacía")
    @Column(nullable = false, name = "FechaCreacion")
    private Date fechaCreacion;

    @JoinColumn(name = "IdMunicipioFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Municipio municipio;

}
