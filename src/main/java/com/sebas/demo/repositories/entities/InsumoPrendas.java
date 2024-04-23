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
@Table(name = "insumo_prendas")
public class InsumoPrendas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "IdInsumoFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Insumo insumo;

    @JoinColumn(name = "IdPrendaFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Prenda prenda;

    @Min(value = 0, message = "La cantidad disponible debe ser mayor o igual a cero")
    @Column(nullable = false, name = "Cantidad")
    private int cantidad;
}
