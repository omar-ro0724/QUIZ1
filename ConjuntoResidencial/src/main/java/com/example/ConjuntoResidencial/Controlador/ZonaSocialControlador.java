package com.example.ConjuntoResidencial.Controlador;

import com.example.ConjuntoResidencial.Modelos.ZonaSocial;
import com.example.ConjuntoResidencial.Servicios.ZonaSocialServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/zonasocial")
public class ZonaSocialControlador {

    @Autowired
    private ZonaSocialServicio zonaSocialServicio;

    @GetMapping
    public List<ZonaSocial> listar() {
        return zonaSocialServicio.obtenerTodos();
    }

    @PostMapping
    public List<ZonaSocial> guardarZonas(@RequestBody List<ZonaSocial> zonas) {
        return zonaSocialServicio.guardarZonas(zonas);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        zonaSocialServicio.eliminar(id);
    }
}
