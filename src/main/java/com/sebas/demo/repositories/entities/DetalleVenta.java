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
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "detalle_venta")
public class DetalleVenta{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    @JoinColumn(name = "IdVentaFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Venta venta;

    @JoinColumn(name = "IdProductoFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Inventario inventario;

    @JoinColumn(name = "IdTallaFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Talla talla;

    @Min(value = 0, message = "La cantidad disponible debe ser mayor o igual a cero")
    @Column(nullable = false)
    private int cantidad;

    @NotNull(message = "El valor no puede estar vacío")
    @Column(nullable = false, name = "valor_unit")
    private Double valorUnit;
}
