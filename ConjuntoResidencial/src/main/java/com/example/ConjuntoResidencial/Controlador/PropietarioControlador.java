package com.example.ConjuntoResidencial.Controlador;

import com.example.ConjuntoResidencial.Modelos.Propietario;
import com.example.ConjuntoResidencial.Servicios.PropietarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/propietario")
public class PropietarioControlador {

    @Autowired
    private PropietarioServicio propietarioServicio;

    @GetMapping
    public List<Propietario> listar() {
        return propietarioServicio.obtenerTodos();
    }

    @PostMapping
    public List<Propietario> guardar(@RequestBody List<Propietario> propietarios) {
        return propietarioServicio.guardar(propietarios);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        propietarioServicio.eliminar(id);
    }
}
