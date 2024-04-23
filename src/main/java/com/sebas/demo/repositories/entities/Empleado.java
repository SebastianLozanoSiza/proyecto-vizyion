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
@Table(name = "empleado")
public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "El nombre del empleado no puede estar vacio")
    @Column(nullable = false)
    private String nombre;

    @JoinColumn(name = "IdCargoFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cargos cargo;

    @NotNull(message = "La fecha de ingreso no puede estar vacía")
    @Column(nullable = false, name = "fecha_ingreso")
    private Date fechaIngreso;

    @JoinColumn(name = "IdMunicipioFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Municipio municipio;
}
