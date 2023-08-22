package com.papercut.gatewaysOfHellUser;

import com.papercut.gatewaysOfHellUser.domain.User;
import com.papercut.gatewaysOfHellUser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class GatewaysOfHellUserApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(GatewaysOfHellUserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		userRepository.saveAll(List.of(
			new User(null, "WilliamBlazkowicz", "bj.blazko@idsoft.com", "wolfenstein", "deathincarnate1960", 40, 46.69),
			new User(null, "PinkDemon", "destroyer@worlds.tq", "ode", "bloodFireDeath", 20, 1990.2)
		));
	}
}
