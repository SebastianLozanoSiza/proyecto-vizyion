package com.sebas.demo.services.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sebas.demo.config.VentaDTOConverter;
import com.sebas.demo.dto.VentaDTO;
import com.sebas.demo.repositories.RepositoryVenta;
import com.sebas.demo.repositories.entities.Venta;
import com.sebas.demo.services.ServiceVenta;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServiceVentaImpl implements ServiceVenta {

    @Autowired
    private RepositoryVenta repositoryVenta;

    @Autowired
    private VentaDTOConverter convert;

    @Override
    @Transactional(readOnly = true)
    public List<VentaDTO> getVentasByMes(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1, 0, 0, 0);
        Date startDate = calendar.getTime();
        calendar.set(Calendar.MONTH, month);
        Date endDate = calendar.getTime();

        List<Venta> ventas = repositoryVenta.findByFechaBetween(startDate, endDate);
        return ventas.stream()
                    .map(venta -> convert.convertToDTO(venta))
                    .toList();
    }
}
