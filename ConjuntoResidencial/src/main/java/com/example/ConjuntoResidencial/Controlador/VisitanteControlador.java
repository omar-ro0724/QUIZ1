package com.example.ConjuntoResidencial.Controlador;

import com.example.ConjuntoResidencial.Modelos.Visitante;
import com.example.ConjuntoResidencial.Servicios.VisitanteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visitante")
public class VisitanteControlador {

    @Autowired
    private VisitanteServicio visitanteServicio;

    @GetMapping
    public List<Visitante> listar() {
        return visitanteServicio.obtenerTodos();
    }

    @PostMapping
    public List<Visitante> guardar(@RequestBody List<Visitante> visitantes) {
        return visitanteServicio.guardar(visitantes);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        visitanteServicio.eliminar(id);
    }

    @GetMapping("/propietario/{id}")
    public List<Visitante> getVisitantesPorPropietario(@PathVariable int id) {
        return visitanteServicio.obtenerVisitantesPorPropietario(id);
    }
}
