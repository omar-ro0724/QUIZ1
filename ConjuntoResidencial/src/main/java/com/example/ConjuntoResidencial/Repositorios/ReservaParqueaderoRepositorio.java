package com.example.ConjuntoResidencial.Repositorios;


import com.example.ConjuntoResidencial.Modelos.ReservaParqueadero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservaParqueaderoRepositorio extends JpaRepository<ReservaParqueadero, Integer> {

    @Query(value = "SELECT * FROM reserva_parqueadero WHERE id_propietario = :idPropietario", nativeQuery = true)
    static List<ReservaParqueadero> findByPropietarioId(@Param("idPropietario") int idPropietario) {
        return null;
    }
}
