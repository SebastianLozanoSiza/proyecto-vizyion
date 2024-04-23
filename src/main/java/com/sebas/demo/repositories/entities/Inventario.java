package com.sebas.demo.repositories.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "inventario")
public class Inventario{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "El codigo no puede estar vacío")
    @Column(nullable = false, name = "CodInv")
    private String codigo;

    @JoinColumn(name = "IdPrendaFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Prenda prenda;

    @NotNull(message = "El valor no puede estar vacío")
    @Column(nullable = false, name = "ValorVtaCop")
    private Double valorVta;

    @NotNull(message = "El valor no puede estar vacío")
    @Column(nullable = false, name = "ValorVtaUsd")
    private Double valorVtaUsd;
}
