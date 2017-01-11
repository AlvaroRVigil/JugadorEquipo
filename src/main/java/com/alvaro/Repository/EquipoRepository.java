package com.alvaro.Repository;

import com.alvaro.Entity.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long>  {

List<Equipo> findByNombre(String nombreEquipo);

// PT1 EQUIPO 2
    // A
    public List<Equipo> findByLocalidad(String localidadEquipo);

    @Query("SELECT equipo " +
            "FROM Equipo equipo")
    List<Equipo> getEquiposGroupByLocalidad();
}