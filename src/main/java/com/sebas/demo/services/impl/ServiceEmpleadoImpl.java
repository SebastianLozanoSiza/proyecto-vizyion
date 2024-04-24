package com.sebas.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sebas.demo.config.EmpleadoDTOConverter;
import com.sebas.demo.dto.EmpleadoDTO;
import com.sebas.demo.repositories.RepositoryEmpleado;
import com.sebas.demo.repositories.entities.Empleado;
import com.sebas.demo.services.ServiceEmpleado;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServiceEmpleadoImpl implements ServiceEmpleado{
    
    @Autowired
    private RepositoryEmpleado repositoryEmpleado;

    @Autowired
    private EmpleadoDTOConverter convert;

    @Override
    @Transactional(readOnly = true)
	public List<EmpleadoDTO> findAll() {
        List<Empleado> empleados = (List<Empleado>) repositoryEmpleado.findAll();
        return empleados.stream()
                .map(empleado -> convert.convertToDTO(empleado))
                .toList();
	}
    
}
