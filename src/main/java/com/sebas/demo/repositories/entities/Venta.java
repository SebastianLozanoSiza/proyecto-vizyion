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
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "venta")
public class Venta{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "La fecha no puede estar vacía")
    @Column(nullable = false, name = "Fecha")
    private Date fecha;

    @JoinColumn(name = "IdEmpleadoFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Empleado empleado;

    @JoinColumn(name = "IdClienteFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente cliente;

    @JoinColumn(name = "IdFormaPagoFk")
    @ManyToOne(fetch = FetchType.LAZY)
    private FormaPago formaPago;
}
