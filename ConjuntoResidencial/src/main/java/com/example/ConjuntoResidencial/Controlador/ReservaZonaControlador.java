package com.example.ConjuntoResidencial.Controlador;

import com.example.ConjuntoResidencial.Modelos.ReservaZona;
import com.example.ConjuntoResidencial.Servicios.ReservaZonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/reservazona")
public class ReservaZonaControlador {

    @Autowired
    private ReservaZonaServicio reservaZonaServicio;

    @GetMapping
    public List<ReservaZona> listar() {
        return reservaZonaServicio.obtenerTodos();
    }

    @PostMapping
    public List<ReservaZona> guardar(@RequestBody List<ReservaZona> reservas) {
        return reservaZonaServicio.guardar(reservas);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        reservaZonaServicio.eliminar(id);
    }

    @GetMapping("/propietario/{id}")
    public List<ReservaZona> getReservasPorPropietario(@PathVariable int id) {
        return reservaZonaServicio.obtenerReservasPorPropietario(id);
    }

    @GetMapping("/fecha/{fecha}")
    public List<ReservaZona> getReservasPorFecha(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecha) {
        return reservaZonaServicio.buscarReservasPorFecha(fecha);
    }
}
