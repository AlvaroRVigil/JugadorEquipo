package com.alvaro.Service;

import com.alvaro.Entity.Player;
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
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private TeamRepository teamRepository;

    Calendar calendar = GregorianCalendar.getInstance();
public void registrarJugadores() {
    Team team;

    //Bulls
    Player player6 = new Player();
    player6.setNombre("Ingrid");
    calendar.set(1996, Calendar.FEBRUARY, 28);
    player6.setNacimiento(calendar.getTime());
    player6.setCanastas(9);
    player6.setAsistencias(12);
    player6.setRebotes(8);
    player6.setPosicion("base");
    team = teamRepository.findByNombre("Bulls").get(0);
    player6.setTeam(team);
    playerRepository.save(player6);

    Player player7 = new Player();
    player7.setNombre("Lea");
    calendar.set(1991, Calendar.JULY, 1);
    player7.setNacimiento(calendar.getTime());
    player7.setCanastas(0);
    player7.setAsistencias(4);
    player7.setRebotes(14);
    player7.setPosicion("escolta");
    team = teamRepository.findByNombre("Bulls").get(0);
    player7.setTeam(team);
    playerRepository.save(player7);

    Player player8 = new Player();
    player8.setNombre("Luc");
    calendar.set(1998, Calendar.NOVEMBER, 13);
    player8.setNacimiento(calendar.getTime());
    player8.setCanastas(2);
    player8.setAsistencias(3);
    player8.setRebotes(14);
    player8.setPosicion("alero");
    team = teamRepository.findByNombre("Bulls").get(0);
    player8.setTeam(team);
    playerRepository.save(player8);

    Player player9 = new Player();
    player9.setNombre("Chloe");
    calendar.set(1993, Calendar.DECEMBER, 29);
    player9.setNacimiento(calendar.getTime());
    player9.setCanastas(20);
    player9.setAsistencias(8);
    player9.setRebotes(6);
    player9.setPosicion("ala-pivot");
    team = teamRepository.findByNombre("Bulls").get(0);
    player9.setTeam(team);
    playerRepository.save(player9);

    Player player10 = new Player();
    player10.setNombre("Zaira");
    calendar.set(1998, Calendar.MAY, 16);
    player10.setNacimiento(calendar.getTime());
    player10.setCanastas(8);
    player10.setAsistencias(5);
    player10.setRebotes(7);
    player10.setPosicion("pivot");
    team = teamRepository.findByNombre("Bulls").get(0);
    player10.setTeam(team);
    playerRepository.save(player10);

    //Celtics
    Player player1 = new Player();
    player1.setNombre("Anna");
    calendar.set(1995, Calendar.AUGUST, 11);
    player1.setNacimiento(calendar.getTime());
    player1.setCanastas(5);
    player1.setAsistencias(10);
    player1.setRebotes(5);
    player1.setPosicion("base");
    team = teamRepository.findByNombre("Celtics").get(0);
    player1.setTeam(team);
    playerRepository.save(player1);

    Player player26 = new Player();
    player26.setNombre("Luis");
    calendar.set(1993, Calendar.JANUARY, 18);
    player26.setNacimiento(calendar.getTime());
    player26.setCanastas(40);
    player26.setAsistencias(38);
    player26.setRebotes(20);
    player26.setPosicion("base");
    team = teamRepository.findByNombre("Celtics").get(0);
    player26.setTeam(team);
    playerRepository.save(player26);

    Player player2 = new Player();
    player2.setNombre("Alex");
    calendar.set(1990, Calendar.JANUARY, 25);
    player2.setNacimiento(calendar.getTime());
    player2.setCanastas(8);
    player2.setAsistencias(11);
    player2.setRebotes(2);
    player2.setPosicion("escolta");
    team = teamRepository.findByNombre("Celtics").get(0);
    player2.setTeam(team);
    playerRepository.save(player2);

    Player player3 = new Player();
    player3.setNombre("Remy");
    calendar.set(1992, Calendar.SEPTEMBER, 2);
    player3.setNacimiento(calendar.getTime());
    player3.setCanastas(5);
    player3.setAsistencias(10);
    player3.setRebotes(8);
    player3.setPosicion("alero");
    team = teamRepository.findByNombre("Celtics").get(0);
    player3.setTeam(team);
    playerRepository.save(player3);

    Player player4 = new Player();
    player4.setNombre("Jurdy");
    calendar.set(1994, Calendar.MARCH, 12);
    player4.setNacimiento(calendar.getTime());
    player4.setCanastas(14);
    player4.setAsistencias(12);
    player4.setRebotes(3);
    player4.setPosicion("ala-pivot");
    team = teamRepository.findByNombre("Celtics").get(0);
    player4.setTeam(team);
    playerRepository.save(player4);

    Player player5 = new Player();
    player5.setNombre("Pepe");
    calendar.set(1993, Calendar.APRIL, 18);
    player5.setNacimiento(calendar.getTime());
    player5.setCanastas(3);
    player5.setAsistencias(10);
    player5.setRebotes(2);
    player5.setPosicion("pivot");
    team = teamRepository.findByNombre("Celtics").get(0);
    player5.setTeam(team);
    playerRepository.save(player5);

    //Heats
    Player player11 = new Player();
    player11.setNombre("Rocio");
    calendar.set(1992, Calendar.APRIL, 10);
    player11.setNacimiento(calendar.getTime());
    player11.setCanastas(7);
    player11.setAsistencias(2);
    player11.setRebotes(9);
    player11.setPosicion("base");
    team = teamRepository.findByNombre("Heats").get(0);
    player11.setTeam(team);
    playerRepository.save(player11);

    Player player12 = new Player();
    player12.setNombre("Favian");
    calendar.set(1988, Calendar.AUGUST, 8);
    player12.setNacimiento(calendar.getTime());
    player12.setCanastas(2);
    player12.setAsistencias(6);
    player12.setRebotes(9);
    player12.setPosicion("escolta");
    team = teamRepository.findByNombre("Heats").get(0);
    player12.setTeam(team);
    playerRepository.save(player12);

    Player player13 = new Player();
    player13.setNombre("Rico");
    calendar.set(1996, Calendar.FEBRUARY, 19);
    player13.setNacimiento(calendar.getTime());
    player13.setCanastas(7);
    player13.setAsistencias(9);
    player13.setRebotes(3);
    player13.setPosicion("alero");
    team = teamRepository.findByNombre("Heats").get(0);
    player13.setTeam(team);
    playerRepository.save(player13);

    Player player14 = new Player();
    player14.setNombre("Kevin");
    calendar.set(1991, Calendar.MARCH, 22);
    player14.setNacimiento(calendar.getTime());
    player14.setCanastas(7);
    player14.setAsistencias(2);
    player14.setRebotes(14);
    player14.setPosicion("ala-pivot");
    team = teamRepository.findByNombre("Heats").get(0);
    player14.setTeam(team);
    playerRepository.save(player14);

    Player player15 = new Player();
    player15.setNombre("Anabel");
    calendar.set(1995, Calendar.MAY, 9);
    player15.setNacimiento(calendar.getTime());
    player15.setCanastas(6);
    player15.setAsistencias(7);
    player15.setRebotes(10);
    player15.setPosicion("pivot");
    team = teamRepository.findByNombre("Heats").get(0);
    player15.setTeam(team);
    playerRepository.save(player15);

    //Raptors
    Player player16 = new Player();
    player16.setNombre("Alexia");
    calendar.set(1992, Calendar.APRIL, 10);
    player16.setNacimiento(calendar.getTime());
    player16.setCanastas(7);
    player16.setAsistencias(2);
    player16.setRebotes(9);
    player16.setPosicion("base");
    team = teamRepository.findByNombre("Toronto").get(0);
    player16.setTeam(team);
    playerRepository.save(player16);

    Player player17 = new Player();
    player17.setNombre("Marcus");
    calendar.set(1988, Calendar.AUGUST, 8);
    player17.setNacimiento(calendar.getTime());
    player17.setCanastas(2);
    player17.setAsistencias(6);
    player17.setRebotes(9);
    player17.setPosicion("escolta");
    team = teamRepository.findByNombre("Toronto").get(0);
    player17.setTeam(team);
    playerRepository.save(player17);

    Player player18 = new Player();
    player18.setNombre("Dani");
    calendar.set(1996, Calendar.FEBRUARY, 19);
    player18.setNacimiento(calendar.getTime());
    player18.setCanastas(7);
    player18.setAsistencias(9);
    player18.setRebotes(3);
    player18.setPosicion("alero");
    team = teamRepository.findByNombre("Toronto").get(0);
    player18.setTeam(team);
    playerRepository.save(player18);

    Player player19 = new Player();
    player19.setNombre("Pol");
    calendar.set(1991, Calendar.MARCH, 22);
    player19.setNacimiento(calendar.getTime());
    player19.setCanastas(7);
    player19.setAsistencias(2);
    player19.setRebotes(14);
    player19.setPosicion("ala-pivot");
    team = teamRepository.findByNombre("Toronto").get(0);
    player19.setTeam(team);
    playerRepository.save(player19);

    Player player20 = new Player();
    player20.setNombre("Nuria");
    calendar.set(1995, Calendar.MAY, 9);
    player20.setNacimiento(calendar.getTime());
    player20.setCanastas(6);
    player20.setAsistencias(7);
    player20.setRebotes(10);
    player20.setPosicion("pivot");
    team = teamRepository.findByNombre("Toronto").get(0);
    player20.setTeam(team);
    playerRepository.save(player20);

    // Knicks
    Player player21 = new Player();
    player21.setNombre("Zan");
    calendar.set(1992, Calendar.APRIL, 10);
    player21.setNacimiento(calendar.getTime());
    player21.setCanastas(7);
    player21.setAsistencias(2);
    player21.setRebotes(9);
    player21.setPosicion("base");
    team = teamRepository.findByNombre("New York").get(0);
    player21.setTeam(team);
    playerRepository.save(player21);

    Player player22 = new Player();
    player22.setNombre("Raul");
    calendar.set(1988, Calendar.AUGUST, 8);
    player22.setNacimiento(calendar.getTime());
    player22.setCanastas(2);
    player22.setAsistencias(6);
    player22.setRebotes(9);
    player22.setPosicion("escolta");
    team = teamRepository.findByNombre("New York").get(0);
    player22.setTeam(team);
    playerRepository.save(player22);

    Player player23 = new Player();
    player23.setNombre("June");
    calendar.set(1996, Calendar.FEBRUARY, 19);
    player23.setNacimiento(calendar.getTime());
    player23.setCanastas(7);
    player23.setAsistencias(9);
    player23.setRebotes(3);
    player23.setPosicion("alero");
    team = teamRepository.findByNombre("New York").get(0);
    player23.setTeam(team);
    playerRepository.save(player23);

    Player player24 = new Player();
    player24.setNombre("Paz");
    calendar.set(1991, Calendar.MARCH, 22);
    player24.setNacimiento(calendar.getTime());
    player24.setCanastas(7);
    player24.setAsistencias(2);
    player24.setRebotes(14);
    player24.setPosicion("ala-pivot");
    team = teamRepository.findByNombre("New York").get(0);
    player24.setTeam(team);
    playerRepository.save(player24);

    Player player25 = new Player();
    player25.setNombre("Quim");
    calendar.set(1995, Calendar.MAY, 9);
    player25.setNacimiento(calendar.getTime());
    player25.setCanastas(6);
    player25.setAsistencias(7);
    player25.setRebotes(10);
    player25.setPosicion("pivot");
    team = teamRepository.findByNombre("New York").get(0);
    player25.setTeam(team);
    playerRepository.save(player25);
}

public void consultas() {
// PT1 E2
        System.out.println("EJERCICIOS JUGADOR:");
        // A.
        System.out.println("A - Buscar jugador/es por nombre, sin necesidad de introducirlo entero");
        System.out.println(playerRepository.findByNombreStartingWith("Cri"));
        // B.
        System.out.println("B - Buscar jugadores que hayan conseguido un numero mayor o igual de canastas al especificado como parametro");
        System.out.println(playerRepository.findByCanastasGreaterThanEqual(15));
        // C.
        System.out.println("C - Buscar jugadores que hayn efectuado un numero de asistencias dentro de un rango especificado como parametro");
        System.out.println(playerRepository.findByAsistenciasBetween(2, 15));
        // D.
        System.out.println("D - Buscar jugador/es que pertenezca a una posición concreta");
        System.out.println(playerRepository.findByPosicionLike("base"));
        // E.
        System.out.println("E - Buscar jugador/es que hayan nacido a una fecha anterior a una fecha especificada como parametro");
        calendar.set(1993, Calendar.APRIL, 18);
        System.out.println(playerRepository.findByNacimientoAfter(calendar.getTime()));
        // F.
        System.out.println("F - Agrupar los jugadores por la posición del campo.");
        playerRepository.getStatisticsGroupByPosition().
                forEach(var -> System.out.println("Position: " + var[0] + ", Media Canastas: " + var[1] + ", Media Asistencias: " + var[2] + ", Media Rebotes: " + var[3]));
        // G.
        System.out.println("G - Lo mismo que el punto anterior pero devolviendo la media, el máximo y el mínimo de canastas, asistencias y rebotes.");
        System.out.println("              CANASTAS       ASISTENCIAS          REBOTES");
        playerRepository.getStatisticsGroupByPositionDevolverMedias().
                forEach(var -> System.out.println(var[0] +
                        "\n Medias:       " + var[1] + "              " + var[2] + "              " + var[3] +
                        "\n Maximas:       " + var[4] + "                " + var[5] + "               " + var[6] +
                        "\n Minimas:       " + var[7] + "                 " + var[8] + "                " + var[9]));
    }
}