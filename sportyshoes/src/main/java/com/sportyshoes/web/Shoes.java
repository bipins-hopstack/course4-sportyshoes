package com.sportyshoes.web;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Shoes {
	
	@Id
	@GeneratedValue
	private int itemid;
	private String category;
	private String Description;
	private int size;
	private int cost;
	//private String image;

}
