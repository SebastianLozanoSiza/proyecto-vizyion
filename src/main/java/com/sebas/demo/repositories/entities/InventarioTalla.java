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
@Table(name = "inventario_talla")
public class InventarioTalla{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    @JoinColumn(name = "IdInvFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Inventario inventario;

    @JoinColumn(name = "IdTallaFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Talla talla;
}
