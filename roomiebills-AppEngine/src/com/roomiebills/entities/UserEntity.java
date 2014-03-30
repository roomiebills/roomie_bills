package com.roomiebills.entities;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "name", nullable=false)
	String name;
	
	@Column(name = "email", nullable=false)
	String email;
	
	@Column(name = "password", nullable=false)
	String password;	
}
