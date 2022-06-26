package com.sportyshoes.web;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class Orders {
	@Id
	@GeneratedValue
	private int id;
	private int userid;
	private int productid;
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date orderdate;

}
