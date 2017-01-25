package com.alvaro;

import com.alvaro.Service.TeamService;
import com.alvaro.Service.PlayerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EquipoJugadorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(EquipoJugadorApplication.class, args);
		PlayerService playerService = context.getBean(PlayerService.class);
		TeamService teamService = context.getBean(TeamService.class);

		teamService.registrarEquipos();
		playerService.registrarJugadores();

		playerService.consultas();
		teamService.consultas();
	}
}