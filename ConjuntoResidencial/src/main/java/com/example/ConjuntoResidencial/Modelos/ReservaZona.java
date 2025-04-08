package com.example.ConjuntoResidencial.Modelos;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class ReservaZona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReserva;

    private LocalDate fecha;
    private LocalTime horaInicio;

    @ManyToOne
    @JoinColumn(name = "id_zona")
    private ZonaSocial zonaSocial;

    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Propietario propietario;
}