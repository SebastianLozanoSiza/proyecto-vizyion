package com.sebas.demo.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sebas.demo.dto.EmpleadoDTO;
import com.sebas.demo.repositories.entities.Empleado;

@Component
public class EmpleadoDTOConverter {

    @Autowired
    private ModelMapper dbm;

    @Autowired
    public EmpleadoDTOConverter(ModelMapper modelMapper) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        this.dbm = modelMapper;
    }

    public EmpleadoDTO convertToDTO(Empleado empleado){
        EmpleadoDTO empleadoDTO = dbm.map(empleado, EmpleadoDTO.class);
        if (empleado.getCargo() != null) {
            empleadoDTO.setNombreCargo(empleado.getCargo().getDescripcion());
        }
        if (empleado.getMunicipio() != null) {
            empleadoDTO.setMunicipio(empleado.getMunicipio().getNombre());
        }
        return empleadoDTO;
    }
    
    public Empleado convertToEntity(EmpleadoDTO empleadoDTO){
        Empleado empleado = dbm.map(empleadoDTO, Empleado.class);
        return empleado;
    }
}
