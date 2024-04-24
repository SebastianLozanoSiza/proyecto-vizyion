package com.sebas.demo.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sebas.demo.repositories.entities.Empleado;
import com.sebas.demo.repositories.entities.Venta;

public interface RepositoryVenta extends CrudRepository<Venta,Long>{
    
    List<Venta> findByFechaBetween(Date startDate, Date endDate);

    List<Venta> findByEmpleado(Empleado empleado);
}
