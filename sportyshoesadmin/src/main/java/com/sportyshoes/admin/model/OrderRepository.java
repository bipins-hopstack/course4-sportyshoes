package com.sportyshoes.admin.model;


import com.sportyshoes.admin.Orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Orders, Integer>{

	//findBypassword(){}
	//public  List<Shoes> findAll();
	
}
