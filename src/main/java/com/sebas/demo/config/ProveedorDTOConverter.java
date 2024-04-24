package com.sebas.demo.config;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sebas.demo.dto.InsumoProveedorDTO;
import com.sebas.demo.dto.ProveedorDTO;
import com.sebas.demo.repositories.entities.Proveedor;

@Component
public class ProveedorDTOConverter {

    @Autowired
    private ModelMapper dbm;

    @Autowired
    public ProveedorDTOConverter(ModelMapper modelMapper) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        this.dbm = modelMapper;
    }

    public ProveedorDTO convertToDTO(Proveedor proveedor) {
        ProveedorDTO proveedorDTO = dbm.map(proveedor, ProveedorDTO.class);
        if (proveedor.getTipoPersona() != null) {
            proveedorDTO.setTipoPersona(proveedor.getTipoPersona().getNombre());
        }
        if (proveedor.getMunicipio() != null) {
            proveedorDTO.setMunicipio(proveedor.getMunicipio().getNombre());
        }
        if (proveedor.getInsumoProveedor() != null) {
            List<InsumoProveedorDTO> insumosDTO = proveedor.getInsumoProveedor().stream()
                    .map(insumo -> new InsumoProveedorDTO(insumo.getInsumo().getNombre(),
                            insumo.getInsumo().getValorUnit(), insumo.getInsumo().getStockMin(),
                            insumo.getInsumo().getStockMax()))
                    .collect(Collectors.toList());
            proveedorDTO.setListaInsumos(insumosDTO);
        }
        return proveedorDTO;
    }

    public Proveedor convertToEntity(ProveedorDTO proveedorDTO) {
        Proveedor proveedor = dbm.map(proveedorDTO, Proveedor.class);
        return proveedor;
    }
}
