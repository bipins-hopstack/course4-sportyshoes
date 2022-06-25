package com.sportyshoes.web;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Users {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String gender;
	private String age;
	private String address;
	private String email;
	private String mobileno;
	private String password;
	
}
