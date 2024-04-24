package com.sebas.demo.repositories.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "prenda")
public class Prenda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty(message = "El nombre no puede estar vacio")
    @Column(nullable = false, name = "Nombre")
    private String nombre;

    @NotEmpty(message = "El valor no puede estar vacio")
    @Column(nullable = false, name = "ValorUnitCop")
    private Double valorUnit;

    @NotEmpty(message = "El valor no puede estar vacio")
    @Column(nullable = false, name = "ValorUnitUsd")
    private Double valorUnitUsd;

    @JoinColumn(name = "IdEstadoFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Estado estado;

    @JoinColumn(name = "IdTipoProteccion")
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoProteccion tipoProteccion;

    @JoinColumn(name = "IdGeneroFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Genero genero;

    @NotEmpty(message = "El codigo no puede estar vacio")
    @Column(nullable = false, name = "Codigo")
    private String codigo;

    @OneToMany(mappedBy = "prenda", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleOrden> detalleOrden;

    @OneToMany(mappedBy = "prenda", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<InsumoPrendas> insumoPrendas;
}
