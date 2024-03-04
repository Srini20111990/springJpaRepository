package com.srini.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
	
	public void m1();
	
	public void m2();

}
