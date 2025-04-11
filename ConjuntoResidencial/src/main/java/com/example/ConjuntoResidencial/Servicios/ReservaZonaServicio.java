package com.example.ConjuntoResidencial.Servicios;
import com.example.ConjuntoResidencial.Modelos.ReservaZona;
import com.example.ConjuntoResidencial.Repositorios.ReservaParqueaderoRepositorio;
import com.example.ConjuntoResidencial.Repositorios.ReservaZonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReservaZonaServicio {
    private final ReservaZonaRepositorio reservaZonaRepositorio;

    public ReservaZonaServicio(ReservaZonaRepositorio repositorio) {
        this.reservaZonaRepositorio = repositorio;
    }

    public List<ReservaZona> obtenerTodos() {
        return reservaZonaRepositorio.findAll();
    }

    public List<ReservaZona> guardar(List<ReservaZona> reservas) {
        return reservaZonaRepositorio.saveAll(reservas);
    }

    public void eliminar(int id) {
        reservaZonaRepositorio.deleteById(id);
    }

    public List<ReservaZona> obtenerReservasPorPropietario(int idPropietario) {
        return ReservaZonaRepositorio.findByPropietarioId(idPropietario);
    }

    public List<ReservaZona> buscarReservasPorFecha(LocalDate fecha) {
        return ReservaZonaRepositorio.findByFecha(fecha);
    }
}
