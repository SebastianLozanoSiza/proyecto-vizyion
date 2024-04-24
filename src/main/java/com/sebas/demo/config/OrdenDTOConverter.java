package com.sebas.demo.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sebas.demo.dto.OrdenDTO;
import com.sebas.demo.repositories.entities.Orden;

@Component
public class OrdenDTOConverter {
    

    @Autowired
    private ModelMapper dbm;

    @Autowired
    public OrdenDTOConverter(ModelMapper modelMapper) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        this.dbm = modelMapper;
    }

    public OrdenDTO convertToDTO(Orden orden){
        OrdenDTO ordenDTO = dbm.map(orden, OrdenDTO.class);
        if (orden.getEmpleado() != null) {
            ordenDTO.setNombreEmpleado(orden.getEmpleado().getNombre());
        }
        if (orden.getCliente() != null) {
            ordenDTO.setNombreCliente(orden.getCliente().getNombre());
        }
        if (orden.getEstado() != null) {
            ordenDTO.setEstado(orden.getEstado().getDescripcion());
        }
        return ordenDTO;
    }

    public Orden convertToEntity(OrdenDTO ordenDTO){
        Orden orden = dbm.map(ordenDTO, Orden.class);
        return orden;
    }
}
