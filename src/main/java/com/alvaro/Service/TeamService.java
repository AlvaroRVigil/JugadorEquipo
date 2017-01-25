package com.alvaro.Service;

import com.alvaro.Entity.Team;
import com.alvaro.Repository.TeamRepository;
import com.alvaro.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
@Transactional
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private PlayerRepository playerRepository;
    Calendar calendar = GregorianCalendar.getInstance();

    // EQUIPOS
    public void registrarEquipos() {
        Team team1 = new Team();
        team1.setNombre("Celtics");
        calendar.set(1995, Calendar.AUGUST, 11);
        team1.setFechaCreacion(calendar.getTime());
        team1.setLocalidad("Boston");
        teamRepository.save(team1);

        Team team2 = new Team();
        team2.setNombre("Bulls");
        calendar.set(1997, Calendar.FEBRUARY, 29);
        team2.setFechaCreacion(calendar.getTime());
        team2.setLocalidad("Chicago");
        teamRepository.save(team2);

        Team team3 = new Team();
        team3.setNombre("Heats");
        calendar.set(1988, Calendar.DECEMBER, 3);
        team3.setFechaCreacion(calendar.getTime());
        team3.setLocalidad("Miami");
        teamRepository.save(team3);

        Team team4 = new Team();
        team4.setNombre("Raptors");
        calendar.set(1980, Calendar.APRIL, 15);
        team4.setFechaCreacion(calendar.getTime());
        team4.setLocalidad("Toronto");
        teamRepository.save(team4);

        Team team5 = new Team();
        team5.setNombre("Knicks");
        calendar.set(1985, Calendar.FEBRUARY, 29);
        team5.setFechaCreacion(calendar.getTime());
        team5.setLocalidad("New York");
        teamRepository.save(team5);
    }

    public void consultas() {
        System.out.println("EJERCICIOS EQUIPO:");
        // A. Consultar los equipos existentes en una localidad determinada
        System.out.println("A - Equipos de una localidad introducida (localidad introducida --> Boston): " + teamRepository.findByLocalidad("Boston"));
        // B. Devuelve todos los jugadores de un equipo, a partir del nombre completo del equipo
        System.out.println("B - Jugadores de un equipo introducido (equipo introducido --> Celtics): " + playerRepository.findByEquipoNombre("Celtics"));
        // C. Devuelve todos los jugadores de un equipo, que además jueguen en la misma posición, por ejemplo, alero.
        System.out.println("C - Jugadores de un equipo introducido que además juegan en la misma posición (equipo introducido --> Celtics || posición introducida --> base): " + playerRepository.findByEquipoNombreAndPosicion("Celtics", "base"));
        // D. Devuelve el jugador que mas canastas ha conseguido del total de jugadores
        System.out.println("D - Player que mas canastas a conseguido: " + playerRepository.findFirstByOrderByCanastasDesc());
    }
}
