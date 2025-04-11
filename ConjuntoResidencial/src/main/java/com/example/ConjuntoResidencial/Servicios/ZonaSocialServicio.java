package com.example.ConjuntoResidencial.Servicios;

import com.example.ConjuntoResidencial.Modelos.ZonaSocial;
import com.example.ConjuntoResidencial.Repositorios.ZonaSocialRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZonaSocialServicio {

    @Autowired
    private ZonaSocialRepositorio zonaSocialRepositorio;

    public List<ZonaSocial> obtenerTodos() {
        return zonaSocialRepositorio.findAll();
    }

    public List<ZonaSocial> guardarZonas(List<ZonaSocial> zonas) {
        return zonaSocialRepositorio.saveAll(zonas);  
    }

    public void eliminar(Integer id) {
        zonaSocialRepositorio.deleteById(id);
    }
}
