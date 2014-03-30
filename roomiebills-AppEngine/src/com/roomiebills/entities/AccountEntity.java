package com.roomiebills.entities;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class AccountEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "name", nullable=false)
	String name;
	
	@OneToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "admin_id")
	UserEntity admin;
}
