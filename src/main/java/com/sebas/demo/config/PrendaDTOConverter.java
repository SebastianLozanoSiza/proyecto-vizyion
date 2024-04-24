package com.sebas.demo.config;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sebas.demo.dto.InsumoPrendasDTO;
import com.sebas.demo.dto.PrendaDTO;
import com.sebas.demo.repositories.entities.Prenda;

@Component
public class PrendaDTOConverter {

    @Autowired
    private ModelMapper dbm;

    @Autowired
    public PrendaDTOConverter(ModelMapper modelMapper) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        this.dbm = modelMapper;
    }

    public PrendaDTO convertToDTO(Prenda prenda) {
        PrendaDTO prendaDTO = dbm.map(prenda, PrendaDTO.class);
        if (prenda.getEstado() != null) {
            prendaDTO.setEstado(prenda.getEstado().getDescripcion());
        }
        if (prenda.getTipoProteccion() != null) {
            prendaDTO.setTipoProteccion(prenda.getTipoProteccion().getDescripcion());
        }
        if (prenda.getGenero() != null) {
            prendaDTO.setGenero(prenda.getGenero().getDescripcion());
        }
        if (prenda.getInsumoPrendas() != null) {
            List<InsumoPrendasDTO> insumoPrendasDTOs = prenda.getInsumoPrendas().stream()
                    .map(insumo -> new InsumoPrendasDTO(insumo.getInsumo().getNombre(),
                            insumo.getInsumo().getValorUnit(), insumo.getInsumo().getStockMin(),
                            insumo.getInsumo().getStockMax(), insumo.getCantidad()))
                    .collect(Collectors.toList());
            prendaDTO.setListaStock(insumoPrendasDTOs);
        }
        return prendaDTO;
    }

    public Prenda convertToEntity(PrendaDTO prendaDTO) {
        Prenda prenda = dbm.map(prendaDTO, Prenda.class);
        return prenda;
    }
}
