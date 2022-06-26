package com.sportyshoes.rest.model;

import java.util.List;

import com.sportyshoes.web.Orders;
import com.sportyshoes.web.Shoes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer>{

	//findBypassword(){}
	//public  List<Shoes> findAll();
	
}
