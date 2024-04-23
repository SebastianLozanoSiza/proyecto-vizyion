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
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "detalle_orden")
public class DetalleOrden {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "IdOrdenFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Orden orden;

    @JoinColumn(name = "IdPrendaFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Prenda prenda;

    @JoinColumn(name = "PrendaId")
    @ManyToOne(fetch = FetchType.LAZY)
    private Prenda prendaId;

    @Min(value = 0, message = "La cantidad disponible debe ser mayor o igual a cero")
    @Column(nullable = false, name = "cantidad_producir")
    private int cantidadAProducir;

    @JoinColumn(name = "IdColorFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Color color;

    @Min(value = 0, message = "La cantidad disponible debe ser mayor o igual a cero")
    @Column(nullable = false, name = "cantidad_producida")
    private int cantidadProducida;

    @JoinColumn(name = "IdEstadoFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Estado estado;
}
