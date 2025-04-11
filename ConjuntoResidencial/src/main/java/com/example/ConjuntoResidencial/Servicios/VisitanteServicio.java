package com.example.ConjuntoResidencial.Servicios;

import com.example.ConjuntoResidencial.Modelos.Visitante;
import com.example.ConjuntoResidencial.Repositorios.VisitanteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitanteServicio {
    private final VisitanteRepositorio repositorio;

    public VisitanteServicio(VisitanteRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<Visitante> obtenerTodos() {
        return repositorio.findAll();
    }

    public List<Visitante> guardar(List<Visitante> lista) {
        return repositorio.saveAll(lista);
    }

    public void eliminar(Integer id) {
        repositorio.deleteById(id);
    }

    public List<Visitante> obtenerVisitantesPorPropietario(int idPropietario) {
        return VisitanteRepositorio.findByPropietarioId(idPropietario);
    }
}

