package com.example.ConjuntoResidencial.Modelos;
import jakarta.persistence.*;

@Entity
public class Visitante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVisitante;

    private String nombre;
    private String cedula;
    private String telefono;
    private String correo;

    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Propietario propietario;
}
