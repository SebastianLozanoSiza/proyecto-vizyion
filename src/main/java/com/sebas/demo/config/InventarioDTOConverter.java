package com.sebas.demo.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sebas.demo.dto.InventarioDTO;
import com.sebas.demo.repositories.entities.Inventario;

@Component
public class InventarioDTOConverter {
    
    @Autowired
    private ModelMapper dbm;

    @Autowired
    public InventarioDTOConverter(ModelMapper modelMapper) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        this.dbm = modelMapper;
    }

    public InventarioDTO convertToDTO(Inventario inventario){
        InventarioDTO inventarioDTO = dbm.map(inventario, InventarioDTO.class);
        if (inventario.getPrenda() != null) {
            inventarioDTO.setNombrePrenda(inventario.getPrenda().getNombre());
        }
        return inventarioDTO;
    }
}
