package com.sebas.demo.repositories.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "insumo_proveedor")
public class InsumoProveedor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "IdInsumoFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Insumo insumo;

    @JoinColumn(name = "IdProveedorFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Proveedor proveedor;
}
