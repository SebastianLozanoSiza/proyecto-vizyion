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
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "proveedor")
public class Proveedor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    @NotEmpty(message = "El NIT no puede estar vacio")
    @Column(nullable = false, name = "NitProveedor")
    private String nit;

    @NotEmpty(message = "El nombre no puede estar vacio")
    @Column(nullable = false, name = "Nombre")
    private String nombre;

    @JoinColumn(name = "IdTipoPersona")
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoPersona tipoPersona;

    @JoinColumn(name = "IdMunicipioFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Municipio municipio;
}
