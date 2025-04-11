package com.example.ConjuntoResidencial.Servicios;

import com.example.ConjuntoResidencial.Modelos.Propietario;
import com.example.ConjuntoResidencial.Modelos.Propietario;
import com.example.ConjuntoResidencial.Repositorios.PropietarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropietarioServicio {
    @Autowired
    private  PropietarioRepositorio propietarioRepositorio;

    public PropietarioServicio(PropietarioRepositorio repositorio) {
        this.propietarioRepositorio = repositorio;
    }

    public List<Propietario> obtenerTodos() {
        return propietarioRepositorio.findAll();
    }

    public List<Propietario> guardar(List<Propietario> lista) {
        return propietarioRepositorio.saveAll(lista);
    }

    public void eliminar(Integer id) {
        propietarioRepositorio.deleteById(id);
    }
}

