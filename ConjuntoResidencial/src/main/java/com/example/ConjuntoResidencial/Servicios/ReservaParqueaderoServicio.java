package com.example.ConjuntoResidencial.Servicios;

import com.example.ConjuntoResidencial.Modelos.Propietario;
import com.example.ConjuntoResidencial.Modelos.Propietario;
import com.example.ConjuntoResidencial.Modelos.ReservaParqueadero;
import com.example.ConjuntoResidencial.Repositorios.PropietarioRepositorio;
import com.example.ConjuntoResidencial.Repositorios.ReservaParqueaderoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReservaParqueaderoServicio {
    private final ReservaParqueaderoRepositorio repositorio;

    public ReservaParqueaderoServicio(ReservaParqueaderoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<ReservaParqueadero> obtenerTodos() {
        return repositorio.findAll();
    }

    public List<ReservaParqueadero> guardar(List<ReservaParqueadero> lista) {
        return repositorio.saveAll(lista);
    }

    public void eliminar(Integer id) {
        repositorio.deleteById(id);
    }

    public List<ReservaParqueadero> obtenerParqueaderosPorPropietario(int idPropietario) {
        return ReservaParqueaderoRepositorio.findByPropietarioId(idPropietario);

    }
}
