package com.example.ConjuntoResidencial.Controlador;

import com.example.ConjuntoResidencial.Modelos.ReservaParqueadero;
import com.example.ConjuntoResidencial.Servicios.ReservaParqueaderoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservaparqueadero")
public class ReservaParqueaderoControlador {

    @Autowired
    private ReservaParqueaderoServicio reservaParqueaderoServicio;

    @GetMapping
    public List<ReservaParqueadero> listar() {
        return reservaParqueaderoServicio.obtenerTodos();
    }

    @PostMapping
    public List<ReservaParqueadero> guardar(@RequestBody List<ReservaParqueadero> reservas) {
        return reservaParqueaderoServicio.guardar(reservas);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        reservaParqueaderoServicio.eliminar(id);
    }

    @GetMapping("/propietario/{id}")
    public List<ReservaParqueadero> getParqueaderosPorPropietario(@PathVariable int id) {
        return reservaParqueaderoServicio.obtenerParqueaderosPorPropietario(id);
    }
}
