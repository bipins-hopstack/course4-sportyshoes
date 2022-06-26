package com.sportyshoes.web;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Orders {
	@Id
	@GeneratedValue
	private int id;
	private int userid;
	private int productid;

}
