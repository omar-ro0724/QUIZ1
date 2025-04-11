package com.example.ConjuntoResidencial.Repositorios;

import com.example.ConjuntoResidencial.Modelos.ReservaZona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservaZonaRepositorio extends JpaRepository<ReservaZona, Integer> {


    @Query(value = "SELECT * FROM reserva_zona WHERE id_propietario = :idPropietario", nativeQuery = true)
    static List<ReservaZona> findByPropietarioId(@Param("idPropietario") int idPropietario) {
        return null;
    }

    @Query(value = "SELECT * FROM reserva_zona WHERE fecha = :fecha", nativeQuery = true)
    static List<ReservaZona> findByFecha(@Param("fecha") LocalDate fecha) {
        return null;
    }
}