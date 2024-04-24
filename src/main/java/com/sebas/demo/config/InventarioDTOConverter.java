package com.sebas.demo.config;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sebas.demo.dto.InventarioDTO;
import com.sebas.demo.dto.InventarioTallaDTO;
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
            if (inventario.getPrenda().getDetalleOrden() != null && !inventario.getPrenda().getDetalleOrden().isEmpty()) {
                inventarioDTO.setColor(inventario.getPrenda().getDetalleOrden().get(0).getColor().getDescripcion());
            }
        }
        if (inventario.getTallas() != null) {
            List<InventarioTallaDTO> tallasDTO = inventario.getTallas().stream()
                    .map(talla -> new InventarioTallaDTO(talla.getTalla().getDescripcion()))
                    .collect(Collectors.toList());
            inventarioDTO.setTalla(tallasDTO);
        }
        return inventarioDTO;
    }

    public Inventario convertToEntity(InventarioDTO inventarioDTO){
        Inventario inventario = dbm.map(inventarioDTO, Inventario.class);
        return inventario;
    }
}
