package com.srini.reposiroty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="CRICKET_PLAYER")
@Data
public class Player {
	
	@Id
	@Column(name="Id")
	private Integer playerId;
	
	@Column(name="Name")
	private String playerName;
	
	@Column(name="Age")
	private Integer playerAge;
	
	private String location;

	
	
	
	
}
