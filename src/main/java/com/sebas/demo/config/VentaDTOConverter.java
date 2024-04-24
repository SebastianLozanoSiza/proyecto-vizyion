package com.sebas.demo.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sebas.demo.dto.VentaClientesDTO;
import com.sebas.demo.dto.VentaDTO;
import com.sebas.demo.repositories.entities.Venta;

@Component
public class VentaDTOConverter {
    
    @Autowired
    private ModelMapper dbm;

    @Autowired
    public VentaDTOConverter(ModelMapper modelMapper) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        this.dbm = modelMapper;
    }

    public VentaDTO convertToDTO(Venta venta){
        VentaDTO ventaDTO = dbm.map(venta, VentaDTO.class);
        if (venta.getEmpleado() != null) {
            ventaDTO.setNombreEmpleado(venta.getEmpleado().getNombre());
        }
        if (venta.getCliente() != null) {
            ventaDTO.setNombreCliente(venta.getCliente().getNombre());
        }
        if (venta.getFormaPago() != null) {
            ventaDTO.setFormaPago(venta.getFormaPago().getDescripcion());
        }
        return ventaDTO;
    }

    public Venta convertToEntity(VentaDTO ventaDTO){
        Venta venta = dbm.map(ventaDTO, Venta.class);
        return venta;
    }

    public VentaClientesDTO convertVentaClientesDTO(Venta venta){
        VentaClientesDTO ventaClientesDTO = dbm.map(venta, VentaClientesDTO.class);
        if (venta.getCliente() != null) {
            ventaClientesDTO.setNombreCliente(venta.getCliente().getNombre());
            ventaClientesDTO.setClienteCedula(venta.getCliente().getIdCliente());
            ventaClientesDTO.setTipoPersona(venta.getCliente().getTipoPersona().getNombre());
            ventaClientesDTO.setFechaRegistro(venta.getCliente().getFecha());
            ventaClientesDTO.setMunicipio(venta.getCliente().getMunicipio().getNombre());
        }
        if (venta.getFormaPago() != null) {
            ventaClientesDTO.setFormaPago(venta.getFormaPago().getDescripcion());
        }
        return ventaClientesDTO;
    }
}
