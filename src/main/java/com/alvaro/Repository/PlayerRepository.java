package com.alvaro.Repository;

import com.alvaro.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
// PT 1 J2

    // A
    public List<Player> findByNombreStartingWith(String nombreJugador);

    // B
    public List<Player> findByCanastasGreaterThanEqual(int numCanastas);

    // C
    public List<Player> findByAsistenciasBetween(int minAsistencias, int maxAsistencias);

    // D
    public List<Player> findByPosicionLike(String posicion);

    // E
    public List<Player> findByNacimientoAfter(Date nacimiento);

    // F
    @Query("SELECT jugador.posicion, AVG(jugador.canastas), AVG(jugador.asistencias), AVG(jugador.rebotes) " +
            "FROM Jugador jugador " +
            "GROUP BY jugador.posicion")
    List<Object[]> getStatisticsGroupByPosition();

    // G
    @Query("SELECT jugador.posicion, AVG(jugador.canastas), AVG(jugador.asistencias), AVG(jugador.rebotes), " +
            "MAX(jugador.canastas), MAX(jugador.asistencias), MAX(jugador.rebotes)," +
            "MIN(jugador.canastas), MIN(jugador.asistencias), MIN(jugador.rebotes)" +
            "FROM Jugador jugador " +
            "GROUP BY jugador.posicion")
    List<Object[]> getStatisticsGroupByPositionDevolverMedias();

// PT 1 E2

    // B
    public List<Player> findByEquipoNombre(String nombreEquipo);

    // C
    public List<Player> findByEquipoNombreAndPosicion(String nombreEquipo, String posicion);

    // D
    Player findFirstByOrderByCanastasDesc();
}