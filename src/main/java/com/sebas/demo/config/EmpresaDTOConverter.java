package com.sebas.demo.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sebas.demo.dto.EmpresaDTO;
import com.sebas.demo.repositories.entities.Empresa;

@Component
public class EmpresaDTOConverter {
    
    @Autowired
    private ModelMapper dbm;

    @Autowired
    public EmpresaDTOConverter(ModelMapper modelMapper) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        this.dbm = modelMapper;
    }

    public EmpresaDTO convertToDTO(Empresa empresa){
        EmpresaDTO empresaDTO = dbm.map(empresa, EmpresaDTO.class);
        if (empresa.getMunicipio() != null) {
            empresaDTO.setMunicipio(empresa.getMunicipio().getNombre());
        }
        return empresaDTO;
    }

    public Empresa convertToEntity(EmpresaDTO empresaDTO){
        Empresa empresa = dbm.map(empresaDTO, Empresa.class);
        return empresa;
    }
}
