package com.example.ConjuntoResidencial.Repositorios;

import com.example.ConjuntoResidencial.Modelos.Visitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisitanteRepositorio extends JpaRepository<Visitante, Integer> {

    @Query(value = "SELECT * FROM visitante WHERE id_propietario = :idPropietario", nativeQuery = true)
    static List<Visitante> findByPropietarioId(@Param("idPropietario") int idPropietario) {
        return null;
    }
}
