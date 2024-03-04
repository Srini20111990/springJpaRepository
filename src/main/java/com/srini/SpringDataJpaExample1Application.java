package com.srini;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.srini.reposiroty.Player;
import com.srini.reposiroty.PlayerRepository;

@SpringBootApplication
public class SpringDataJpaExample1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaExample1Application.class, args);
		PlayerRepository pr = context.getBean(PlayerRepository.class);
		
		
		
		  Player p1=new Player(); p1.setPlayerId(1); p1.setPlayerName("Srinivas");
		  p1.setLocation("Hyderbad"); p1.setPlayerAge(33);
		  
		  Player p2=new Player(); p2.setPlayerId(2); p2.setPlayerName("Shiva");
		  p2.setLocation("Banglore"); p2.setPlayerAge(35);
		  
		  
		  Player p3=new Player(); p3.setPlayerId(3); p3.setPlayerName("Harsha");
		  p3.setLocation("Hyderbad"); p3.setPlayerAge(24);
		  
		  
		  Player p4=new Player(); p4.setPlayerId(4); p4.setPlayerName("Kumar");
		  p4.setLocation("Chennai"); p4.setPlayerAge(26);
		  
		  
		  Player p5=new Player(); p5.setPlayerId(5); p5.setPlayerName("Ram");
		  p5.setLocation("Mumbai"); p5.setPlayerAge(28);
		  
		  pr.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		 

	
	}

}
