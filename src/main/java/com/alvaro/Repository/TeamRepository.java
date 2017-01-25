package com.alvaro.Repository;

import com.alvaro.Entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long>  {

List<Team> findByNombre(String nombreEquipo);

// PT1 E2
    // A
    public List<Team> findByLocalidad(String localidadEquipo);
    @Query("SELECT equipo " +
            "FROM Equipo equipo")
    List<Team> getEquiposGroupByLocalidad();
}