package com.sebas.demo.repositories.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "insumo")
public class Insumo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "El nombre no puede estar vacio")
    @Column(nullable = false)
    private String nombre;

    @NotEmpty(message = "El valor no puede estar vacio")
    @Column(nullable = false, name = "valor_unit")
    private Double valorUnit;

    @NotEmpty(message = "El stock no puede estar vacio")
    @Column(nullable = false, name = "stock_min")
    private Double stockMin;

    @NotEmpty(message = "El stock no puede estar vacio")
    @Column(nullable = false, name = "stock_max")
    private Double stockMax;
}
