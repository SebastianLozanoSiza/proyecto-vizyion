package com.sebas.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sebas.demo.config.EmpresaDTOConverter;
import com.sebas.demo.dto.EmpresaDTO;
import com.sebas.demo.repositories.RepositoryEmpresa;
import com.sebas.demo.repositories.entities.Empresa;
import com.sebas.demo.services.ServiceEmpresa;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ServiceEmpresaImpl implements ServiceEmpresa {

    @Autowired
    private RepositoryEmpresa repositoryEmpresa;

    @Autowired
    private EmpresaDTOConverter convert;

    @Override
    public List<EmpresaDTO> findAll() {
        List<Empresa> empresas = (List<Empresa>) repositoryEmpresa.findAll();
        return empresas.stream()
                .map(empresa -> convert.convertToDTO(empresa))
                .toList();
    }

}
