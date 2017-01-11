package com.alvaro.Service;

import com.alvaro.Entity.Equipo;
import com.alvaro.Repository.EquipoRepository;
import com.alvaro.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
@Transactional
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;
    @Autowired
    private JugadorRepository jugadorRepository;
    Calendar calendar = GregorianCalendar.getInstance();

    // CREAMOS LOS EQUIPOS
    public void registrarEquipos() {
        Equipo equipo1 = new Equipo();
        equipo1.setNombre("Celtics");
        calendar.set(1995, Calendar.AUGUST, 11);
        equipo1.setFechaCreacion(calendar.getTime());
        equipo1.setLocalidad("Boston");
        equipoRepository.save(equipo1);

        Equipo equipo2 = new Equipo();
        equipo2.setNombre("Bulls");
        calendar.set(1997, Calendar.FEBRUARY, 29);
        equipo2.setFechaCreacion(calendar.getTime());
        equipo2.setLocalidad("Chicago");
        equipoRepository.save(equipo2);

        Equipo equipo3 = new Equipo();
        equipo3.setNombre("Heats");
        calendar.set(1988, Calendar.DECEMBER, 3);
        equipo3.setFechaCreacion(calendar.getTime());
        equipo3.setLocalidad("Miami");
        equipoRepository.save(equipo3);

        Equipo equipo4 = new Equipo();
        equipo4.setNombre("Raptors");
        calendar.set(1980, Calendar.APRIL, 15);
        equipo4.setFechaCreacion(calendar.getTime());
        equipo4.setLocalidad("Toronto");
        equipoRepository.save(equipo4);

        Equipo equipo5 = new Equipo();
        equipo5.setNombre("Knicks");
        calendar.set(1985, Calendar.FEBRUARY, 29);
        equipo5.setFechaCreacion(calendar.getTime());
        equipo5.setLocalidad("New York");
        equipoRepository.save(equipo5);
    }

    public void consultas() {
        System.out.println("EJERCICIOS EQUIPO:");
        // A. Consultar los equipos existentes en una localidad determinada
        System.out.println("A - Equipos de una localidad introducida (localidad introducida --> Boston): " + equipoRepository.findByLocalidad("Boston"));
        // B. Devuelve todos los jugadores de un equipo, a partir del nombre completo del equipo
        System.out.println("B - Jugadores de un equipo introducido (equipo introducido --> Celtics): " + jugadorRepository.findByEquipoNombre("Celtics"));
        // C. Devuelve todos los jugadores de un equipo, que además jueguen en la misma posición, por ejemplo, alero.
        System.out.println("C - Jugadores de un equipo introducido que además juegan en la misma posición (equipo introducido --> Celtics || posición introducida --> base): " + jugadorRepository.findByEquipoNombreAndPosicion("Celtics", "base"));
        // D. Devuelve el jugador que mas canastas ha conseguido del total de jugadores
        System.out.println("D - Jugador que mas canastas a conseguido: " + jugadorRepository.findFirstByOrderByCanastasDesc());
    }
}
